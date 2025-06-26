import fg from 'fast-glob';
import os from 'os';
import path from 'path';
import { logger } from './utils/logger.js';
import { KtirScanner } from './ktir.js';
import fs from 'fs/promises';
import { execSync } from 'child_process';
import { workerPool } from './utils/workerPool.js';
import { timing } from './utils/timing.js';
import { fileURLToPath } from 'url';
import { pipelineHooks } from './hooks.js';
/**
 * Checks if the directory contains any classes with Kotlin metadata.
 * @param dexDir Directory containing decompiled classes
 * @returns True if Kotlin metadata is found
 */
export async function hasKotlinMetadata(dexDir) {
    try {
        // Look for a classes.jar file which would contain compiled class files
        const jarPath = path.join(dexDir, '..', 'dex-tools', 'classes.jar');
        // Check if the JAR exists
        try {
            await fs.access(jarPath);
        }
        catch {
            logger.debug('classes.jar not found, cannot check for Kotlin metadata');
            return false;
        }
        // Use grep to check for kotlin.Metadata in the jar contents
        try {
            const result = execSync(`jar tvf "${jarPath}" | grep -q "kotlin/Metadata"`, {
                stdio: ['ignore', 'ignore', 'ignore'],
            });
            logger.info('Kotlin metadata detected in classes.jar');
            return true;
        }
        catch (error) {
            logger.debug('No Kotlin metadata found in classes.jar');
            return false;
        }
    }
    catch (error) {
        logger.debug(`Error checking for Kotlin metadata: ${error}`);
        return false;
    }
}
/**
 * Scan a decompiled APK for ad reward hooks.
 * @param dexDir Directory containing the decompiled DEX files
 * @param families Hook families to scan for
 * @param options Scan options
 * @returns Promise that resolves with the scan results
 */
export async function scan(dexDir, families, options = {}) {
    // Initialize timing if requested
    if (options.showTimings) {
        timing.configure({ enabled: true });
    }
    // Initialize worker pool if not already initialized
    const workerScriptPath = fileURLToPath(new URL('./scanWorker.js', import.meta.url));
    try {
        workerPool.initialize(workerScriptPath);
    }
    catch (error) {
        logger.debug(`Worker pool already initialized: ${error}`);
    }
    // Set up results container
    const results = {};
    // Create scan context for hooks
    const scanContext = {
        dexDir,
        families,
        options
    };
    // Trigger beforeScan hook
    await pipelineHooks.beforeScan.promise(scanContext);
    return await timing.time('scan-total', async () => {
        // Auto-detect Kotlin metadata if not explicitly set
        if (options.useKtirScanner === undefined) {
            options.useKtirScanner = await timing.time('kotlin-metadata-check', () => hasKotlinMetadata(dexDir));
            if (options.useKtirScanner) {
                logger.info('Auto-enabled Kotlin IR scanner due to metadata detection');
            }
        }
        // Start Kotlin IR scan first if enabled (it's CPU-bound, so we can overlap with I/O-bound Smali scan)
        let ktirPromise = null;
        if (options.useKtirScanner || options.useKtirOnly) {
            await timing.time('kotlin-ir-setup', async () => {
                try {
                    const ktirScanner = new KtirScanner(undefined, {
                        showTimings: options.showIrTimings
                    });
                    const dexJarPath = path.join(dexDir, '..', 'dex-tools', 'classes.jar');
                    // Check if the JAR file exists
                    try {
                        await fs.access(dexJarPath);
                        logger.info('Starting Kotlin IR scan...');
                        // Start the IR scan (but don't await yet)
                        ktirPromise = ktirScanner.scan(dexJarPath, families);
                    }
                    catch (error) {
                        logger.warn(`Classes JAR not found at ${dexJarPath}, skipping Kotlin IR scan`);
                    }
                }
                catch (error) {
                    logger.error(`Error setting up Kotlin IR scan: ${error instanceof Error ? error.message : String(error)}`);
                }
            });
        }
        // Run Smali scan in parallel unless Kotlin IR only
        if (!options.useKtirOnly) {
            await timing.time('smali-scan', async () => {
                logger.info('Starting Smali scan...');
                // Get all smali files
                const files = await timing.time('smali-file-discovery', () => fg(['**/*.smali'], { cwd: dexDir, absolute: true }));
                logger.debug(`Found ${files.length} Smali files to scan`);
                // Determine optimal chunk size based on number of files and CPU cores
                const numWorkers = Math.min(os.cpus().length, 8); // Limit to 8 workers max
                const chunkSize = Math.ceil(files.length / numWorkers);
                // Split files into chunks for parallel processing
                const chunks = Array.from({ length: numWorkers }, (_, i) => files.slice(i * chunkSize, (i + 1) * chunkSize)).filter(chunk => chunk.length > 0);
                logger.debug(`Created ${chunks.length} chunks with ~${chunkSize} files each`);
                // Process chunks in parallel using worker pool
                await timing.time('smali-worker-processing', async () => {
                    const tasks = chunks.map(chunk => workerPool.run({
                        files: chunk,
                        families
                    }));
                    const chunkResults = await Promise.all(tasks);
                    // Merge results from all workers
                    for (const chunkResult of chunkResults) {
                        for (const family in chunkResult) {
                            if (!results[family]) {
                                results[family] = [];
                            }
                            results[family].push(...chunkResult[family]);
                        }
                    }
                });
                logger.info({ families: Object.keys(results) }, 'Smali scan complete');
            });
        }
        // Now await the IR scan results if it was started
        if (ktirPromise) {
            try {
                const ktirResults = await timing.time('kotlin-ir-scan', () => ktirPromise);
                logger.info('Kotlin IR scan complete');
                // Merge results - IR results take precedence for the same methods
                await timing.time('results-merge', async () => {
                    for (const [family, hooks] of Object.entries(ktirResults)) {
                        if (!results[family]) {
                            results[family] = [];
                        }
                        // For each hook from KtIR
                        for (const hook of hooks) {
                            // Look for any matching hook in Smali results (by class+method)
                            const existingIndex = results[family].findIndex(h => h.className === hook.className && h.methodName === hook.methodName);
                            if (existingIndex !== -1) {
                                // Replace with IR result (IR is more accurate)
                                results[family][existingIndex] = hook;
                            }
                            else {
                                // Add new IR result
                                results[family].push(hook);
                            }
                        }
                    }
                    logger.info('Kotlin IR results merged with Smali results');
                });
            }
            catch (error) {
                logger.error(`Error during Kotlin IR scan: ${error instanceof Error ? error.message : String(error)}`);
            }
        }
        // Report worker pool utilization if timing is enabled
        if (options.showTimings) {
            logger.info(`Worker pool utilization: ${(workerPool.getUtilization() * 100).toFixed(2)}%`);
        }
        // Notify hooks when done
        for (const family in results) {
            for (const hook of results[family]) {
                if (hook.className && hook.methodName) {
                    // Fire onAdDetected hook for each hook
                    pipelineHooks.onAdDetected.callAsync({
                        family,
                        className: hook.className,
                        methodName: hook.methodName
                    }, (err) => {
                        if (err) {
                            logger.error(`Error in onAdDetected hook: ${err}`);
                        }
                    });
                }
            }
        }
        // Trigger afterScan hook
        await pipelineHooks.afterScan.promise(scanContext, results);
        // Save results to timestamped file if analyze flag is set
        if (options.saveResults !== false) {
            try {
                const timestamp = new Date().toISOString().replace(/[:.]/g, '-');
                const outputDir = path.join(path.dirname(dexDir), 'scan-results');
                await fs.mkdir(outputDir, { recursive: true });
                const outputPath = path.join(outputDir, `components-${timestamp}.json`);
                await fs.writeFile(outputPath, JSON.stringify(results, null, 2));
                logger.info(`Saved scan results to ${outputPath}`);
                // Store the path in the options for later access
                options.lastResultPath = outputPath;
            }
            catch (error) {
                logger.error(`Error saving scan results: ${error}`);
            }
        }
        return results;
    });
}
//# sourceMappingURL=scan.js.map