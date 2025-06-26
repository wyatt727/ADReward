import { spawn } from 'child_process';
import fs from 'fs/promises';
import path from 'path';
import { logger } from './utils/logger.js';
/**
 * Wrapper for the ktir-scanner JAR.
 */
export class KtirScanner {
    jarPath;
    options;
    /**
     * Create a new KtirScanner instance.
     * @param jarPath Path to the ktir-scanner JAR. If not provided, defaults to the bundled JAR.
     * @param options Scanner options
     */
    constructor(jarPath, options = {}) {
        this.jarPath = jarPath || path.join(__dirname, '../../..', 'jars', 'ktir-scanner.jar');
        this.options = {
            maxHeapSize: '2048m', // Default to 2GB heap
            ...options
        };
    }
    /**
     * Scan a JAR file for hooks.
     * @param jarFile Path to the JAR file to scan
     * @param hookFamilies Hook families to scan for
     * @returns Map of hook family names to lists of hook sites
     */
    async scan(jarFile, hookFamilies) {
        const timestamp = Date.now();
        const outputFile = path.join(path.dirname(jarFile), `ktir-scan-${timestamp}.json`);
        logger.info(`Scanning JAR file: ${jarFile}`);
        logger.info(`Hook families: ${hookFamilies.join(', ')}`);
        logger.info(`Output file: ${outputFile}`);
        // Build JVM arguments for memory settings
        const jvmArgs = [`-Xmx${this.options.maxHeapSize}`];
        if (this.options.showTimings) {
            jvmArgs.push('-Dktir.timings=true');
            logger.info('Enabled detailed IR timing information');
        }
        // Build command arguments
        const args = [
            ...jvmArgs,
            '-jar',
            this.jarPath,
            outputFile,
            ...hookFamilies,
            '--',
            jarFile
        ];
        try {
            // Check if JAR exists
            await fs.access(this.jarPath);
            // Run the scanner
            const result = await this.runJava(args);
            // Read the output file
            const output = await fs.readFile(outputFile, 'utf-8');
            const componentMap = JSON.parse(output);
            // Clean up the output file
            await fs.unlink(outputFile);
            return componentMap;
        }
        catch (error) {
            logger.error(`Error scanning JAR file: ${error instanceof Error ? error.message : String(error)}`);
            return {};
        }
    }
    /**
     * Run the Java command.
     * @param args Command arguments
     * @returns Promise that resolves when the command completes
     */
    runJava(args) {
        return new Promise((resolve, reject) => {
            const java = spawn('java', args);
            java.stdout.on('data', (data) => {
                logger.debug(`ktir-scanner: ${data.toString().trim()}`);
            });
            java.stderr.on('data', (data) => {
                logger.error(`ktir-scanner error: ${data.toString().trim()}`);
            });
            java.on('close', (code) => {
                if (code === 0) {
                    resolve();
                }
                else {
                    reject(new Error(`ktir-scanner exited with code ${code}`));
                }
            });
        });
    }
}
//# sourceMappingURL=ktir.js.map