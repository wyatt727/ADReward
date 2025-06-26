import { AsyncSeriesHook, AsyncParallelHook, SyncHook } from 'tapable';
import { logger } from './utils/logger.js';
/**
 * Pipeline hooks for plugins to tap into
 */
export const pipelineHooks = {
    /**
     * Called before APK acquisition
     */
    beforeAcquire: new AsyncSeriesHook(['acquireContext']),
    /**
     * Called after APK acquisition with the APK path
     */
    afterAcquire: new AsyncSeriesHook(['acquireContext', 'apkPath']),
    /**
     * Called before decompilation
     */
    beforeDecompile: new AsyncSeriesHook(['decompileContext']),
    /**
     * Called after decompilation with the dex directory
     */
    afterDecompile: new AsyncSeriesHook(['decompileContext', 'dexDir']),
    /**
     * Called before scanning
     */
    beforeScan: new AsyncSeriesHook(['scanContext']),
    /**
     * Called after scanning with the component map
     */
    afterScan: new AsyncSeriesHook(['scanContext', 'components']),
    /**
     * Called before Frida script generation
     */
    beforeFridaGenerate: new AsyncSeriesHook(['fridaContext']),
    /**
     * Called after Frida script generation with the script and deploy paths
     */
    afterFridaGenerate: new AsyncSeriesHook(['fridaContext', 'paths']),
    /**
     * Called when a CLI program is created, allowing plugins to register commands
     */
    registerCommands: new SyncHook(['program']),
    /**
     * Called when an ad hook is detected during scanning
     */
    onAdDetected: new AsyncParallelHook(['adInfo']),
};
/**
 * Register plugin commands with the CLI program
 * @param program Commander program instance
 */
export function registerPluginCommands(program) {
    pipelineHooks.registerCommands.call(program);
}
/**
 * Pipeline hooks that plugins can tap into
 */
export class PipelineHooks {
    /**
     * Called before APK acquisition begins
     */
    beforeAcquire = new AsyncSeriesHook(['acquireContext']);
    /**
     * Called after APK has been acquired
     */
    afterAcquire = new AsyncSeriesHook(['acquireContext', 'apkPath']);
    /**
     * Called before decompilation begins
     */
    beforeDecompile = new AsyncSeriesHook(['decompileContext']);
    /**
     * Called after decompilation completes
     */
    afterDecompile = new AsyncSeriesHook(['decompileContext', 'dexDir']);
    /**
     * Called before scanning begins
     */
    beforeScan = new AsyncSeriesHook(['scanContext']);
    /**
     * Called after scanning completes
     */
    afterScan = new AsyncSeriesHook(['scanContext', 'components']);
    /**
     * Called before Frida script generation
     */
    beforeFridaGenerate = new AsyncSeriesHook(['fridaContext']);
    /**
     * Called after Frida script generation
     */
    afterFridaGenerate = new AsyncSeriesHook(['fridaContext', 'paths']);
    /**
     * Called when CLI commands are registered
     * Plugins can add their own commands via this hook
     */
    registerCommands = new SyncHook(['program']);
    /**
     * Called when a hook detects an advertisement
     */
    onAdDetected = new AsyncParallelHook(['adInfo']);
    /**
     * Register a plugin
     * @param plugin Plugin instance or module path
     * @returns Promise that resolves with plugin descriptor
     */
    async registerPlugin(plugin) {
        try {
            let pluginInstance;
            // If plugin is a string, try to import it
            if (typeof plugin === 'string') {
                try {
                    const imported = await import(plugin);
                    pluginInstance = imported.default;
                    if (!pluginInstance || typeof pluginInstance.register !== 'function') {
                        throw new Error(`Plugin at ${plugin} does not export a valid plugin as default export`);
                    }
                }
                catch (error) {
                    logger.error(`Failed to load plugin at ${plugin}: ${error instanceof Error ? error.message : String(error)}`);
                    throw error;
                }
            }
            else {
                pluginInstance = plugin;
            }
            // Register the plugin
            const descriptor = pluginInstance.register(this);
            logger.info(`Plugin registered: ${descriptor.name} v${descriptor.version}`);
            logger.debug(`Plugin description: ${descriptor.description}`);
            return descriptor;
        }
        catch (error) {
            logger.error(`Failed to register plugin: ${error instanceof Error ? error.message : String(error)}`);
            throw error;
        }
    }
}
/**
 * Singleton instance of the pipeline hooks
 */
export const pipelineHooks = new PipelineHooks();
//# sourceMappingURL=hooks.js.map