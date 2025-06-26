import { PluginDescriptor } from './hooks.js';
/**
 * Options for loading plugins
 */
export interface PluginLoaderOptions {
    /**
     * Whether to load built-in plugins
     */
    loadBuiltin?: boolean;
    /**
     * Extra plugin directories to search
     */
    pluginDirs?: string[];
    /**
     * Specific plugin modules to load
     */
    plugins?: string[];
}
/**
 * Load all plugins based on provided options
 * @param options Plugin loader options
 * @returns Array of loaded plugin descriptors
 */
export declare function loadPlugins(options?: PluginLoaderOptions): Promise<PluginDescriptor[]>;
/**
 * Register CLI commands from plugins
 */
export declare function registerPluginCommands(program: any): void;
