import { AsyncSeriesHook, AsyncParallelHook, SyncHook } from 'tapable';
import { logger } from './utils/logger.js';
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
     * Called when an ad hook is detected during scanning
     */
    onAdDetected = new AsyncParallelHook(['adInfo']);
    /**
     * Register a plugin
     * @param plugin Plugin instance or path to plugin module
     * @returns Plugin descriptor
     */
    async registerPlugin(plugin) {
        try {
            // If plugin is a string, try to import it
            if (typeof plugin === 'string') {
                const module = await import(plugin);
                const pluginInstance = module.default || module;
                if (typeof pluginInstance.register !== 'function') {
                    throw new Error(`Plugin module ${plugin} does not export a valid plugin`);
                }
                return this.registerPlugin(pluginInstance);
            }
            // Register the plugin with hooks
            const descriptor = plugin.register(this);
            logger.info(`Registered plugin: ${descriptor.name} v${descriptor.version}`);
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
 * Singleton instance of PipelineHooks
 */
export const pipelineHooks = new PipelineHooks();
//# sourceMappingURL=hooks.js.map