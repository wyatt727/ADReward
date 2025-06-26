import chokidar from 'chokidar';
import { spawn } from 'child_process';
import { logger } from './utils/logger.js';
import { promisify } from 'util';
import { exec } from 'child_process';
const execPromise = promisify(exec);
/**
 * Check if Frida version supports the --reload flag (v16+)
 * @returns boolean indicating if reload is supported
 */
async function fridaSupportsReload() {
    try {
        const { stdout } = await execPromise('frida --version');
        const version = parseInt(stdout.trim().split('.')[0], 10);
        return version >= 16;
    }
    catch (error) {
        logger.warn('Could not determine Frida version, assuming reload is not supported');
        return false;
    }
}
/**
 * Watch a Frida script for changes and automatically reload it
 * @param options Watch options
 * @returns Function to stop watching
 */
export async function watchFridaScript(options) {
    const { scriptPath, packageName, deviceId } = options;
    // Check if Frida supports reload
    const supportsReload = options.useReload !== false && await fridaSupportsReload();
    logger.info(`Frida ${supportsReload ? 'supports' : 'does not support'} reload`);
    // Initialize Frida process
    let fridaProcess = null;
    // Build base command
    const baseCmd = ['--runtime=v8', '-U'];
    if (deviceId) {
        baseCmd.push('-D', deviceId);
    }
    // Add target package
    baseCmd.push('-f', packageName);
    // Add script
    baseCmd.push('-l', scriptPath);
    // Add no-pause
    baseCmd.push('--no-pause');
    // If reload is supported, add the flag
    if (supportsReload) {
        baseCmd.push('--reload');
    }
    logger.info(`Starting Frida with: frida ${baseCmd.join(' ')}`);
    // Start initial Frida process
    fridaProcess = spawn('frida', baseCmd, {
        stdio: 'inherit'
    });
    // Set up watcher
    const watcher = chokidar.watch(scriptPath, {
        persistent: true,
        ignoreInitial: true
    });
    watcher.on('change', async (path) => {
        logger.info(`Script changed: ${path}`);
        if (!supportsReload) {
            // Kill previous process if it exists
            if (fridaProcess && !fridaProcess.killed) {
                logger.info('Restarting Frida (reload not supported)');
                fridaProcess.kill();
                // Wait a moment for the process to exit
                await new Promise(resolve => setTimeout(resolve, 1000));
                // Start a new process
                fridaProcess = spawn('frida', baseCmd, {
                    stdio: 'inherit'
                });
            }
        }
        else {
            // With reload, we don't need to do anything as Frida will reload the script
            logger.info('Frida script will be automatically reloaded');
        }
    });
    // Return a function to stop watching
    return () => {
        logger.info('Stopping Frida watch');
        watcher.close();
        if (fridaProcess && !fridaProcess.killed) {
            fridaProcess.kill();
        }
    };
}
//# sourceMappingURL=watch.js.map