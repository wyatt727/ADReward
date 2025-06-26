import fs from 'fs';
import path from 'path';
import { execa } from 'execa';
import { logger } from './utils/logger.js';
import { fileHash } from './utils/checksum.js';
import glob from 'fast-glob';
import { pipelineHooks } from './hooks.js';
const JADX_BIN = process.env.JADX_BIN || 'jadx';
const DEX2JAR_BIN = process.env.DEX2JAR_BIN || 'd2j-dex2jar';
/**
 * Decompile an APK file to Smali/Java code.
 * If the APK hasn't changed since the last decompilation, it will use the cached results.
 *
 * @param apk Path to the APK file
 * @param options Decompilation options
 * @returns Promise that resolves with the path to the decompiled DEX directory
 */
export async function decompile(apk, { out, generateJar = false, forceDecompile = false }) {
    // Create decompile context for hooks
    const decompileContext = {
        apkPath: apk,
        outDir: out,
        options: { generateJar, forceDecompile }
    };
    // Trigger beforeDecompile hook
    await pipelineHooks.beforeDecompile.promise(decompileContext);
    const apkName = path.basename(apk, '.apk');
    const dexDir = path.join(out, apkName);
    const hashCacheFile = path.join(dexDir, 'dex.hash.json');
    // Calculate APK hash for comparison
    const apkHash = fileHash(apk);
    // Check if decompiled directory and hash cache exist
    const cacheExists = fs.existsSync(dexDir) && fs.existsSync(hashCacheFile);
    const useCache = cacheExists && !forceDecompile;
    if (useCache) {
        logger.debug(`Using cached decompilation: ${dexDir}`);
        try {
            // Read the cache file to check APK hash
            const cacheData = JSON.parse(fs.readFileSync(hashCacheFile, 'utf8'));
            if (cacheData.apkHash === apkHash) {
                logger.info('APK unchanged, using cached decompilation');
                // If jar generation is requested but not already done, do it now
                if (generateJar && !fs.existsSync(path.join(dexDir, '..', 'dex-tools', 'classes.jar'))) {
                    await generateClassesJar(apk, dexDir);
                }
                // Trigger afterDecompile hook with cached result
                await pipelineHooks.afterDecompile.promise(decompileContext, dexDir);
                return dexDir;
            }
            logger.info('APK changed since last decompilation, recompiling...');
        }
        catch (error) {
            logger.warn(`Error reading cache file: ${error instanceof Error ? error.message : String(error)}`);
            logger.info('Running full decompilation');
        }
    }
    // Create output directory if needed
    fs.mkdirSync(dexDir, { recursive: true });
    logger.info('running jadx...');
    await execa(JADX_BIN, ['-d', dexDir, apk], { stdio: 'inherit' });
    // Generate cache file with hash information
    await generateDecompileCache(dexDir, apkHash);
    // Generate classes.jar if requested
    if (generateJar) {
        await generateClassesJar(apk, dexDir);
    }
    // Trigger afterDecompile hook
    await pipelineHooks.afterDecompile.promise(decompileContext, dexDir);
    return dexDir;
}
/**
 * Generate a cache file with hashes of all decompiled files.
 * This allows incremental decompilation on subsequent runs.
 *
 * @param dexDir Directory containing the decompiled DEX files
 * @param apkHash Hash of the APK file
 */
async function generateDecompileCache(dexDir, apkHash) {
    logger.debug('Generating decompile cache...');
    try {
        // Find all smali and java files
        const files = await glob(['**/*.smali', '**/*.java'], {
            cwd: dexDir,
            absolute: false,
            onlyFiles: true
        });
        // Calculate hashes for all files
        const hashes = {};
        for (const file of files) {
            const filePath = path.join(dexDir, file);
            hashes[file] = fileHash(filePath);
        }
        // Write cache file
        const cacheData = {
            apkHash,
            timestamp: new Date().toISOString(),
            files: hashes
        };
        fs.writeFileSync(path.join(dexDir, 'dex.hash.json'), JSON.stringify(cacheData, null, 2));
        logger.debug(`Decompile cache generated with ${files.length} files`);
    }
    catch (error) {
        logger.error(`Error generating decompile cache: ${error instanceof Error ? error.message : String(error)}`);
        // Non-fatal error, continue without cache
    }
}
/**
 * Generate classes.jar from an APK file using dex2jar.
 * @param apk Path to the APK file
 * @param dexDir Directory containing the decompiled DEX files
 */
async function generateClassesJar(apk, dexDir) {
    const dexToolsDir = path.join(dexDir, '..', 'dex-tools');
    const classesJarPath = path.join(dexToolsDir, 'classes.jar');
    // Skip if the JAR already exists
    if (fs.existsSync(classesJarPath)) {
        logger.debug(`Using cached classes.jar: ${classesJarPath}`);
        return;
    }
    // Create the dex-tools directory
    fs.mkdirSync(dexToolsDir, { recursive: true });
    try {
        logger.info('Generating classes.jar using dex2jar...');
        // Run dex2jar to convert APK to JAR
        await execa(DEX2JAR_BIN, [
            '--output', classesJarPath,
            apk
        ], { stdio: 'inherit' });
        logger.info(`Generated classes.jar at ${classesJarPath}`);
    }
    catch (error) {
        logger.error(`Error generating classes.jar: ${error instanceof Error ? error.message : String(error)}`);
        throw error;
    }
}
//# sourceMappingURL=decompile.js.map