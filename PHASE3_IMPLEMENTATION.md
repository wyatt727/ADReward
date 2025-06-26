# Phase 3 Implementation Report - Plugin Architecture

## 1. Overview

Phase 3 implemented a flexible plugin system for ADReward, following the roadmap outlined in the upgrade plan. This phase creates an extensibility layer that allows both core developers and end users to extend the functionality of the tool through custom plugins.

The implementation focused on three key areas:
1. **Lifecycle Hooks**: A robust event system for plugins to tap into key pipeline stages
2. **Plugin Loader**: Dynamic discovery and loading of plugin modules
3. **Self-Update Command**: An easy way for users to stay current with the latest version

## 2. Lifecycle Hooks Implementation

### 2.1 Tapable Integration

We implemented lifecycle hooks using the `tapable` library from the webpack ecosystem, which provides a robust and battle-tested event system. The hooks are organized around the main processing pipeline stages:

```typescript
// Key lifecycle hooks available to plugins
readonly beforeAcquire = new AsyncSeriesHook<[AcquireContext]>(['acquireContext']);
readonly afterAcquire = new AsyncSeriesHook<[AcquireContext, string]>(['acquireContext', 'apkPath']);
readonly beforeDecompile = new AsyncSeriesHook<[DecompileContext]>(['decompileContext']);
readonly afterDecompile = new AsyncSeriesHook<[DecompileContext, string]>(['decompileContext', 'dexDir']);
readonly beforeScan = new AsyncSeriesHook<[ScanContext]>(['scanContext']);
readonly afterScan = new AsyncSeriesHook<[ScanContext, ComponentMap]>(['scanContext', 'components']);
readonly beforeFridaGenerate = new AsyncSeriesHook<[FridaContext]>(['fridaContext']);
readonly afterFridaGenerate = new AsyncSeriesHook<[FridaContext, { script: string, deploy: string }]>(['fridaContext', 'paths']);
readonly registerCommands = new SyncHook<[any]>(['program']);
readonly onAdDetected = new AsyncParallelHook<[{ family: string, className: string, methodName: string }]>(['adInfo']);
```

Each hook provides context objects specific to the stage, giving plugins access to relevant information and allowing them to modify the pipeline behavior.

### 2.2 Context Types

We implemented well-defined context interfaces for each pipeline stage:

```typescript
export interface ScanContext {
  dexDir: string;
  families: string[];
  options: Record<string, any>;
}

export interface DecompileContext {
  apkPath: string;
  outDir: string;
  options: Record<string, any>;
}

export interface AcquireContext {
  packageName: string;
  deviceId: string;
  options: Record<string, any>;
}

export interface FridaContext {
  packageName: string;
  components: ComponentMap;
  outDir: string;
  scriptContent?: string;
}
```

These contexts provide plugins with the information they need to perform their tasks and potentially influence the pipeline.

## 3. Plugin Loader Implementation

### 3.1 Plugin Interface

We defined a standard plugin interface that all plugins must implement:

```typescript
export interface Plugin {
  /**
   * Register the plugin with the pipeline hooks
   * @param hooks The pipeline hooks
   * @returns Plugin descriptor
   */
  register(hooks: PipelineHooks): PluginDescriptor;
}
```

Plugins return a descriptor with metadata about the plugin:

```typescript
export interface PluginDescriptor {
  name: string;
  version: string;
  description: string;
  author?: string;
}
```

### 3.2 Plugin Discovery

We implemented a flexible plugin discovery mechanism that can:
- Load built-in plugins from the core package
- Load plugins from custom directories specified by the user
- Load specific plugin modules by path

The discovery process uses glob patterns to find potential plugin files and dynamically imports them:

```typescript
// Find all .js and .ts files (compiled JS will be used in production)
const pluginFiles = await glob(['**/*.{js,ts}'], {
  cwd: dir,
  absolute: true,
  ignore: ['**/*.d.ts', '**/node_modules/**']
});
```

### 3.3 Sample Plugin

We created a CSV Reporter plugin as an example that demonstrates how to tap into hooks:

```typescript
export default class CsvReporterPlugin implements Plugin {
  register(hooks: PipelineHooks): PluginDescriptor {
    // Register for the afterScan hook
    hooks.afterScan.tapPromise('CsvReporter', async (context: ScanContext, components: ComponentMap) => {
      await this.generateCsvReport(context, components);
    });
    
    return {
      name: 'csv-reporter',
      version: '1.0.0',
      description: 'Exports hooks to CSV format for easy analysis and sharing'
    };
  }
  
  // Plugin implementation...
}
```

## 4. Self-Update Command

### 4.1 Update Notification

We implemented automatic update checking using `update-notifier` to inform users when a new version is available:

```typescript
// Check for updates
const notifier = updateNotifier({ 
  pkg, 
  updateCheckInterval: 1000 * 60 * 60 * 24 // Check once per day
});

// Show update notification
notifier.notify({ isGlobal: true });
```

### 4.2 Upgrade Command

We added a dedicated `upgrade` command to the CLI that allows users to update to the latest version:

```typescript
program
  .command('upgrade')
  .description('Upgrade ADReward to the latest version')
  .option('--check', 'Check for updates without upgrading')
  .action(async (options) => {
    // Implementation...
  });
```

The implementation automatically detects the package manager (npm or pnpm) and uses the appropriate command to update the tool.

## 5. Integration into Core Pipeline

### 5.1 Hook Invocation Points

Each main pipeline function was updated to invoke the appropriate hooks:

- **apk.ts**: Added `beforeAcquire` and `afterAcquire` hooks
- **decompile.ts**: Added `beforeDecompile` and `afterDecompile` hooks
- **scan.ts**: Added `beforeScan`, `afterScan`, and `onAdDetected` hooks
- **frida.ts**: Added `beforeFridaGenerate` and `afterFridaGenerate` hooks

This ensures that plugins can tap into any part of the processing pipeline.

### 5.2 CLI Integration

The CLI was updated to load plugins and register commands:

```typescript
// Load plugins
await loadPlugins({
  loadBuiltin: opts.builtinPlugins !== false,
  pluginDirs: opts.pluginDir || [],
  plugins: opts.plugin || []
});

// Let plugins register their commands
registerPluginCommands(program);
```

New CLI options were added to control plugin loading:

```typescript
.option('--plugin <paths...>', 'Load additional plugins')
.option('--plugin-dir <dirs...>', 'Load plugins from directories')
.option('--no-builtin-plugins', 'Disable built-in plugins')
```

## 6. Benefits and Improvements

### 6.1 Extensibility

The new plugin architecture allows for:

- **Custom Reports**: Plugins can generate specialized reports for different use cases
- **Integration with External Tools**: Plugins can connect ADReward to other security tools
- **Custom Commands**: Plugins can add new commands to the CLI
- **Workflow Automation**: Plugins can automate common tasks in the pipeline

### 6.2 Maintainability

- **Separation of Concerns**: The core remains focused on the main pipeline while extensions are handled by plugins
- **Reduced Complexity**: New features can be added as plugins without increasing core complexity
- **Testability**: Plugins can be tested independently of the core

### 6.3 User Experience

- **Self-Update**: Users can easily stay current with the latest features and fixes
- **Customization**: Users can extend the tool for their specific workflows
- **Discoverability**: The plugin system provides a standard way to share and discover extensions

## 7. Testing

Tested the implementation with the following scenarios:

1. **Basic Hook Operation**: Verified that all hooks are called at the appropriate times
2. **Plugin Loading**: Tested loading plugins from various locations
3. **Self-Update Flow**: Verified the update check and upgrade process
4. **Sample Plugin**: Confirmed that the CSV Reporter plugin correctly generates reports

## 8. Conclusion

Phase 3 successfully implemented a flexible plugin architecture that opens up ADReward to a wide range of extensions. The lifecycle hooks provide a robust foundation for plugins to build upon, and the dynamic loading system makes it easy to discover and use plugins.

The self-update command ensures that users can easily stay current with the latest version, improving the overall user experience.

Next steps could include creating additional built-in plugins to showcase the capabilities of the system and developing a plugin marketplace for sharing community plugins. 