import { AsyncSeriesHook, AsyncParallelHook, SyncHook } from 'tapable';
import { ComponentMap } from './ktir.js';
/**
 * Interface for scan context provided to hooks
 */
export interface ScanContext {
    /**
     * The directory containing decompiled files
     */
    dexDir: string;
    /**
     * Hook families to scan for
     */
    families: string[];
    /**
     * Options for the scan
     */
    options: Record<string, any>;
}
/**
 * Interface for decompile context provided to hooks
 */
export interface DecompileContext {
    /**
     * Path to the APK file
     */
    apkPath: string;
    /**
     * Output directory
     */
    outDir: string;
    /**
     * Options for decompilation
     */
    options: Record<string, any>;
}
/**
 * Interface for acquire context provided to hooks
 */
export interface AcquireContext {
    /**
     * Package name to acquire
     */
    packageName: string;
    /**
     * Device ID to acquire from
     */
    deviceId: string;
    /**
     * Options for acquisition
     */
    options: Record<string, any>;
}
/**
 * Interface for Frida context provided to hooks
 */
export interface FridaContext {
    /**
     * Package name
     */
    packageName: string;
    /**
     * Component map from scanner
     */
    components: ComponentMap;
    /**
     * Output directory
     */
    outDir: string;
    /**
     * Generated script content
     */
    scriptContent?: string;
}
/**
 * Plugin descriptor returned by register method
 */
export interface PluginDescriptor {
    /**
     * Name of the plugin
     */
    name: string;
    /**
     * Version of the plugin
     */
    version: string;
    /**
     * Description of the plugin
     */
    description: string;
    /**
     * Author of the plugin
     */
    author?: string;
}
/**
 * Plugin interface that plugins should implement
 */
export interface Plugin {
    /**
     * Register the plugin with the pipeline hooks
     * @param hooks The pipeline hooks
     * @returns Plugin descriptor
     */
    register(hooks: PipelineHooks): PluginDescriptor;
}
/**
 * Pipeline hooks for plugins to tap into
 */
export declare const pipelineHooks: {
    /**
     * Called before APK acquisition
     */
    beforeAcquire: AsyncSeriesHook<[AcquireContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after APK acquisition with the APK path
     */
    afterAcquire: AsyncSeriesHook<[AcquireContext, string], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called before decompilation
     */
    beforeDecompile: AsyncSeriesHook<[DecompileContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after decompilation with the dex directory
     */
    afterDecompile: AsyncSeriesHook<[DecompileContext, string], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called before scanning
     */
    beforeScan: AsyncSeriesHook<[ScanContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after scanning with the component map
     */
    afterScan: AsyncSeriesHook<[ScanContext, ComponentMap], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called before Frida script generation
     */
    beforeFridaGenerate: AsyncSeriesHook<[FridaContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after Frida script generation with the script and deploy paths
     */
    afterFridaGenerate: AsyncSeriesHook<[FridaContext, {
        script: string;
        deploy: string;
    }], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called when a CLI program is created, allowing plugins to register commands
     */
    registerCommands: SyncHook<[any], void, import("tapable").UnsetAdditionalOptions>;
    /**
     * Called when an ad hook is detected during scanning
     */
    onAdDetected: AsyncParallelHook<[{
        family: string;
        className: string;
        methodName: string;
    }], import("tapable").UnsetAdditionalOptions>;
};
/**
 * Register plugin commands with the CLI program
 * @param program Commander program instance
 */
export declare function registerPluginCommands(program: any): void;
/**
 * Plugin interface that plugins should implement
 */
export interface Plugin {
    /**
     * Register the plugin with the pipeline hooks
     * @param hooks The pipeline hooks
     * @returns Plugin descriptor
     */
    register(hooks: PipelineHooks): PluginDescriptor;
}
/**
 * Pipeline hooks that plugins can tap into
 */
export declare class PipelineHooks {
    /**
     * Called before APK acquisition begins
     */
    readonly beforeAcquire: AsyncSeriesHook<[AcquireContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after APK has been acquired
     */
    readonly afterAcquire: AsyncSeriesHook<[AcquireContext, string], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called before decompilation begins
     */
    readonly beforeDecompile: AsyncSeriesHook<[DecompileContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after decompilation completes
     */
    readonly afterDecompile: AsyncSeriesHook<[DecompileContext, string], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called before scanning begins
     */
    readonly beforeScan: AsyncSeriesHook<[ScanContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after scanning completes
     */
    readonly afterScan: AsyncSeriesHook<[ScanContext, ComponentMap], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called before Frida script generation
     */
    readonly beforeFridaGenerate: AsyncSeriesHook<[FridaContext], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called after Frida script generation
     */
    readonly afterFridaGenerate: AsyncSeriesHook<[FridaContext, {
        script: string;
        deploy: string;
    }], import("tapable").UnsetAdditionalOptions>;
    /**
     * Called when CLI commands are registered
     * Plugins can add their own commands via this hook
     */
    readonly registerCommands: SyncHook<[any], void, import("tapable").UnsetAdditionalOptions>;
    /**
     * Called when a hook detects an advertisement
     */
    readonly onAdDetected: AsyncParallelHook<[{
        family: string;
        className: string;
        methodName: string;
    }], import("tapable").UnsetAdditionalOptions>;
    /**
     * Register a plugin
     * @param plugin Plugin instance or module path
     * @returns Promise that resolves with plugin descriptor
     */
    registerPlugin(plugin: Plugin | string): Promise<PluginDescriptor>;
}
/**
 * Singleton instance of the pipeline hooks
 */
export declare const pipelineHooks: PipelineHooks;
