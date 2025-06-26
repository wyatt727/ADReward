import { AsyncSeriesHook, AsyncParallelHook, SyncHook } from 'tapable';
import { logger } from './utils/logger.js';
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
 * Register plugin commands with the CLI program
 * @param program Commander program instance
 */
export function registerPluginCommands(program: any): void {
  pipelineHooks.registerCommands.call(program);
}

/**
 * Pipeline hooks that plugins can tap into
 */
export class PipelineHooks {
  /**
   * Called before APK acquisition begins
   */
  readonly beforeAcquire = new AsyncSeriesHook<[AcquireContext]>(['acquireContext']);
  
  /**
   * Called after APK has been acquired
   */
  readonly afterAcquire = new AsyncSeriesHook<[AcquireContext, string]>(['acquireContext', 'apkPath']);
  
  /**
   * Called before decompilation begins
   */
  readonly beforeDecompile = new AsyncSeriesHook<[DecompileContext]>(['decompileContext']);
  
  /**
   * Called after decompilation completes
   */
  readonly afterDecompile = new AsyncSeriesHook<[DecompileContext, string]>(['decompileContext', 'dexDir']);
  
  /**
   * Called before scanning begins
   */
  readonly beforeScan = new AsyncSeriesHook<[ScanContext]>(['scanContext']);
  
  /**
   * Called after scanning completes
   */
  readonly afterScan = new AsyncSeriesHook<[ScanContext, ComponentMap]>(['scanContext', 'components']);
  
  /**
   * Called before Frida script generation
   */
  readonly beforeFridaGenerate = new AsyncSeriesHook<[FridaContext]>(['fridaContext']);
  
  /**
   * Called after Frida script generation
   */
  readonly afterFridaGenerate = new AsyncSeriesHook<[FridaContext, { script: string, deploy: string }]>(['fridaContext', 'paths']);
  
  /**
   * Called when CLI commands are registered
   * Plugins can add their own commands via this hook
   */
  readonly registerCommands = new SyncHook<[any]>(['program']);
  
  /**
   * Called when an ad hook is detected during scanning
   */
  readonly onAdDetected = new AsyncParallelHook<[{ family: string, className: string, methodName: string }]>(['adInfo']);
  
  /**
   * Register a plugin
   * @param plugin Plugin instance or path to plugin module
   * @returns Plugin descriptor
   */
  async registerPlugin(plugin: Plugin | string): Promise<PluginDescriptor> {
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
    } catch (error) {
      logger.error(`Failed to register plugin: ${error instanceof Error ? error.message : String(error)}`);
      throw error;
    }
  }
}

/**
 * Singleton instance of PipelineHooks
 */
export const pipelineHooks = new PipelineHooks(); 