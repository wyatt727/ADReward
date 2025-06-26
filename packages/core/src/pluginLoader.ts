import path from 'path';
import fs from 'fs/promises';
import fastGlob from 'fast-glob';
const { glob } = fastGlob;
import { logger } from './utils/logger.js';
import { pipelineHooks, Plugin, PluginDescriptor } from './hooks.js';

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
 * Cache of loaded plugins
 */
const loadedPlugins = new Set<string>();

/**
 * Load built-in plugins from the core plugins directory
 */
async function loadBuiltinPlugins(): Promise<PluginDescriptor[]> {
  try {
    const pluginsDir = path.join(__dirname, 'plugins');
    return await loadPluginsFromDir(pluginsDir);
  } catch (error) {
    logger.warn(`Failed to load built-in plugins: ${error instanceof Error ? error.message : String(error)}`);
    return [];
  }
}

/**
 * Load plugins from a directory
 * @param dir Directory to search for plugins
 * @returns Array of plugin descriptors
 */
async function loadPluginsFromDir(dir: string): Promise<PluginDescriptor[]> {
  try {
    // Check if directory exists
    try {
      await fs.access(dir);
    } catch {
      logger.debug(`Plugin directory not found: ${dir}`);
      return [];
    }
    
    // Find all .js and .ts files (compiled JS will be used in production)
    const pluginFiles = await glob(['**/*.{js,ts}'], {
      cwd: dir,
      absolute: true,
      ignore: ['**/*.d.ts', '**/node_modules/**'],
    });
    
    if (pluginFiles.length === 0) {
      logger.debug(`No plugin files found in ${dir}`);
      return [];
    }
    
    // Load each plugin
    const descriptors: PluginDescriptor[] = [];
    for (const file of pluginFiles) {
      try {
        if (loadedPlugins.has(file)) {
          logger.debug(`Skipping already loaded plugin: ${file}`);
          continue;
        }
        
        // Dynamically import plugin
        const module = await import(file);
        
        // Get plugin instance
        let plugin: Plugin;
        if (module.default) {
          // ES module with default export
          plugin = typeof module.default === 'function' 
            ? new module.default() 
            : module.default;
        } else {
          // CommonJS or named export
          plugin = typeof module === 'function' ? new module() : module;
        }
        
        // Register plugin
        if (plugin && typeof plugin.register === 'function') {
          const descriptor = plugin.register(pipelineHooks);
          if (descriptor) {
            descriptors.push(descriptor);
            loadedPlugins.add(file);
            logger.info(`Loaded plugin: ${descriptor.name} v${descriptor.version}`);
          } else {
            logger.warn(`Plugin did not return a descriptor: ${file}`);
          }
        } else {
          logger.warn(`Invalid plugin: ${file} does not export a valid plugin object`);
        }
      } catch (error) {
        logger.error(`Error loading plugin ${file}: ${error instanceof Error ? error.message : String(error)}`);
      }
    }
    
    return descriptors;
  } catch (error) {
    logger.error(`Error loading plugins from ${dir}: ${error instanceof Error ? error.message : String(error)}`);
    return [];
  }
}

/**
 * Load all plugins based on provided options
 * @param options Plugin loader options
 * @returns Array of loaded plugin descriptors
 */
export async function loadPlugins(options: PluginLoaderOptions = {}): Promise<PluginDescriptor[]> {
  const descriptors: PluginDescriptor[] = [];
  
  // Load built-in plugins
  if (options.loadBuiltin !== false) {
    const builtinDescriptors = await loadBuiltinPlugins();
    descriptors.push(...builtinDescriptors);
  }
  
  // Load plugins from additional directories
  if (options.pluginDirs && options.pluginDirs.length > 0) {
    for (const dir of options.pluginDirs) {
      const dirDescriptors = await loadPluginsFromDir(dir);
      descriptors.push(...dirDescriptors);
    }
  }
  
  // Load specific plugin modules
  if (options.plugins && options.plugins.length > 0) {
    for (const plugin of options.plugins) {
      try {
        if (loadedPlugins.has(plugin)) {
          continue;
        }
        
        const resolvedPath = path.resolve(plugin);
        const module = await import(resolvedPath);
        
        // Get plugin instance
        let pluginInstance: Plugin;
        if (module.default) {
          pluginInstance = typeof module.default === 'function' 
            ? new module.default() 
            : module.default;
        } else {
          pluginInstance = typeof module === 'function' ? new module() : module;
        }
        
        // Register plugin
        if (pluginInstance && typeof pluginInstance.register === 'function') {
          const descriptor = pluginInstance.register(pipelineHooks);
          if (descriptor) {
            descriptors.push(descriptor);
            loadedPlugins.add(plugin);
            logger.info(`Loaded plugin: ${descriptor.name} v${descriptor.version}`);
          }
        } else {
          logger.warn(`Invalid plugin: ${plugin} does not export a valid plugin object`);
        }
      } catch (error) {
        logger.error(`Error loading plugin ${plugin}: ${error instanceof Error ? error.message : String(error)}`);
      }
    }
  }
  
  return descriptors;
}

/**
 * Register CLI commands from plugins
 */
export function registerPluginCommands(program: any) {
  pipelineHooks.registerCommands.call(program);
} 