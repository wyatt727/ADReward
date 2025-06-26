#!/usr/bin/env node
import fs from 'fs';
import path from 'path';
import { Command } from 'commander';
import enquirer from 'enquirer';
import { execa } from 'execa';
import {
  logger,
  requireDevice,
  acquire,
  decompile,
  scan,
  ensureFridaServer,
  generateFrida,
  pipelineHooks,
  loadPlugins,
  registerPluginCommands,
  watchFridaScript,
  diffComponentFiles
} from '@adreward/core';
import updateNotifier from 'update-notifier';
import { fileURLToPath } from 'url';

// Find package.json to get version
const __dirname = path.dirname(fileURLToPath(import.meta.url));
const pkgPath = path.resolve(__dirname, '../../package.json');
const pkg = JSON.parse(fs.readFileSync(pkgPath, 'utf8'));

// Check for updates
const notifier = updateNotifier({ 
  pkg, 
  updateCheckInterval: 1000 * 60 * 60 * 24 // Check once per day
});

// Define the options interface to match what our functions expect
interface AppOptions {
  package?: string;
  device?: string;
  pull: boolean;
  analyze: boolean;
  genScript: boolean;
  hooks: string;
  out: string;
  verbose: boolean;
  ir: boolean;
  irOnly: boolean;
  irTimings: boolean;
  forceDecompile: boolean;
  timings: boolean;
  plugin?: string[];
  pluginDir?: string[];
  builtinPlugins?: boolean;
  template?: string;
  watch: boolean;
  saveResults: boolean;
  tests: boolean;
}

// Setup crash reporter to handle uncaught exceptions
setupCrashReporter();

const program = new Command();
program
  .name('adreward')
  .description('Android APK analysis and Frida automation tool')
  .version(pkg.version)
  .option('-p, --package <n>', 'Android package name')
  .option('-d, --device <id>', 'ADB device id (default: first online)')
  .option('--pull', 'Pull APK/AAB from device', false)
  .option('--analyze', 'Decompile & scan', false)
  .option('--gen-script', 'Generate Frida hook', false)
  .option('--hooks <list>', 'Hook families (csv)', 'admob,unity')
  .option('-o, --out <dir>', 'Output dir', './analysis')
  .option('--plugin <paths...>', 'Load additional plugins')
  .option('--plugin-dir <dirs...>', 'Load plugins from directories')
  .option('--no-builtin-plugins', 'Disable built-in plugins')
  .option('--template <path>', 'Use custom Frida script template')
  .option('-v, --verbose', 'Verbose logging', false)
  .option('--watch', 'Watch generated script and auto-reload Frida on changes (requires --gen-script)', false)
  .option('--ir', 'Use Kotlin IR scanner when Kotlin detected', false)
  .option('--ir-only', 'Use only Kotlin IR scanner (skip Smali)', false)
  .option('--ir-timings', 'Show detailed IR timing information', false)
  .option('--force-decompile', 'Force decompilation even if cache exists', false)
  .option('--timings', 'Show detailed timing information', false)
  .option('--save-results', 'Save scan results to JSON file', true)
  .option('--tests', 'Generate self-invoking test stubs in Frida script', false);

// Add upgrade command
program
  .command('upgrade')
  .description('Upgrade ADReward to the latest version')
  .option('--check', 'Check for updates without upgrading')
  .action(async (options) => {
    try {
      // Force check for updates
      await notifier.fetchInfo();
      
      if (notifier.update) {
        logger.info(`Update available: ${pkg.version} → ${notifier.update.latest}`);
        
        if (options.check) {
          logger.info('Run "adreward upgrade" to update to the latest version');
          return;
        }
        
        logger.info('Upgrading to the latest version...');
        
        // Determine install method based on how CLI is installed
        const isGlobalPnpm = process.env.npm_execpath && process.env.npm_execpath.includes('pnpm');
        const isGlobalNpm = process.env.npm_config_global === 'true';
        
        try {
          if (isGlobalPnpm) {
            await execa('pnpm', ['add', '-g', '@adreward/cli@latest'], { stdio: 'inherit' });
          } else if (isGlobalNpm) {
            await execa('npm', ['install', '-g', '@adreward/cli@latest'], { stdio: 'inherit' });
          } else {
            // Default to npm if we can't determine install method
            await execa('npm', ['install', '-g', '@adreward/cli@latest'], { stdio: 'inherit' });
          }
          
          logger.info(`Successfully upgraded to ${notifier.update.latest}`);
        } catch (error) {
          logger.error(`Upgrade failed: ${error instanceof Error ? error.message : String(error)}`);
          logger.info('Try running the upgrade manually:');
          logger.info('npm install -g @adreward/cli@latest');
          logger.info('or');
          logger.info('pnpm add -g @adreward/cli@latest');
          process.exit(1);
        }
      } else {
        logger.info('You are already using the latest version');
      }
    } catch (error) {
      logger.error(`Error checking for updates: ${error instanceof Error ? error.message : String(error)}`);
      process.exit(1);
    }
  });

// Let plugins register their commands
registerPluginCommands(program);

// Add examples
program.addHelpText('after', `
Examples:
  $ adreward --package com.example.game --pull --analyze --gen-script
  $ adreward --package com.example.app --ir --hooks admob,unity
  $ adreward -p com.example.app -d emulator-5554 --verbose
  $ adreward -p com.example.app --force-decompile --analyze
`);

// Add diff command
program
  .command('diff')
  .description('Compare two component JSON files to show added/removed/changed hooks')
  .argument('<old-file>', 'Path to old components JSON file')
  .argument('<new-file>', 'Path to new components JSON file')
  .option('--show-unchanged', 'Show unchanged items in the diff', false)
  .option('-o, --output <path>', 'Save diff to file')
  .action(async (oldFile, newFile, options) => {
    try {
      // Verify files exist
      if (!fs.existsSync(oldFile)) {
        logger.error(`Old file not found: ${oldFile}`);
        process.exit(1);
      }
      
      if (!fs.existsSync(newFile)) {
        logger.error(`New file not found: ${newFile}`);
        process.exit(1);
      }
      
      // Generate diff
      const diffOptions = {
        showUnchanged: options.showUnchanged,
        saveToFile: !!options.output,
        outputPath: options.output
      };
      
      const stats = await diffComponentFiles(oldFile, newFile, diffOptions);
      
      logger.info(`Diff complete: ${stats.added} added, ${stats.removed} removed, ${stats.changed} changed, ${stats.unchanged} unchanged`);
    } catch (error) {
      logger.error(`Error generating diff: ${error instanceof Error ? error.message : String(error)}`);
      process.exit(1);
    }
  });

program.parse();

/**
 * Set up crash reporter to handle uncaught exceptions and rejections
 */
function setupCrashReporter() {
  const logBuffer: string[] = [];
  const maxBufferSize = 100;
  
  // Override logger to keep recent logs in memory
  const originalInfo = logger.info;
  const originalWarn = logger.warn;
  const originalError = logger.error;
  const originalDebug = logger.debug;
  
  // Buffer recent log messages
  function bufferLog(level: string, message: any) {
    let logMessage: string;
    
    if (typeof message === 'string') {
      logMessage = message;
    } else if (message instanceof Error) {
      logMessage = message.stack || message.message;
    } else {
      try {
        logMessage = JSON.stringify(message);
      } catch (e) {
        logMessage = String(message);
      }
    }
    
    logBuffer.push(`[${new Date().toISOString()}] [${level}] ${logMessage}`);
    
    if (logBuffer.length > maxBufferSize) {
      logBuffer.shift();
    }
  }
  
  // Monkey patch logger methods
  logger.info = function(...args: any[]) {
    bufferLog('INFO', args[0]);
    return originalInfo.apply(logger, args);
  };
  
  logger.warn = function(...args: any[]) {
    bufferLog('WARN', args[0]);
    return originalWarn.apply(logger, args);
  };
  
  logger.error = function(...args: any[]) {
    bufferLog('ERROR', args[0]);
    return originalError.apply(logger, args);
  };
  
  logger.debug = function(...args: any[]) {
    bufferLog('DEBUG', args[0]);
    return originalDebug.apply(logger, args);
  };
  
  // Handle uncaught exceptions
  process.on('uncaughtException', (error) => {
    const crashLog = {
      timestamp: new Date().toISOString(),
      error: error.message,
      stack: error.stack,
      options: program.opts()
    };
    
    const crashLogPath = path.join(process.cwd(), `adreward-crash-${Date.now()}.log`);
    fs.writeFileSync(crashLogPath, JSON.stringify(crashLog, null, 2));
    
    logger.error(`Uncaught exception: ${error.message}`);
    logger.error(`Crash log written to: ${crashLogPath}`);
    
    process.exit(1);
  });
  
  // Handle unhandled promise rejections
  process.on('unhandledRejection', (reason) => {
    writeCrashReport('unhandled-rejection', reason instanceof Error ? reason : new Error(String(reason)), logBuffer);
    process.exit(1);
  });
}

/**
 * Write a crash report to disk
 * 
 * @param type Type of crash
 * @param error The error that occurred
 * @param logBuffer Recent log messages
 */
function writeCrashReport(type: string, error: Error, logBuffer: string[]) {
  try {
    // Create a timestamp for the crash report
    const timestamp = new Date().toISOString().replace(/[:.]/g, '-');
    
    // Get package name from CLI options if available
    const opts = program.opts() as AppOptions;
    const packageName = opts.package || 'unknown';
    
    // Create directories if they don't exist
    const baseDir = path.join(opts.out || './analysis', packageName);
    fs.mkdirSync(baseDir, { recursive: true });
    
    // Create crash report filename
    const crashFile = path.join(baseDir, `crash-${type}-${timestamp}.log`);
    
    // Prepare report data
    const reportData = {
      timestamp,
      type,
      error: {
        name: error.name,
        message: error.message,
        stack: error.stack
      },
      options: program.opts(),
      recentLogs: logBuffer
    };
    
    // Write to file
    fs.writeFileSync(
      crashFile,
      JSON.stringify(reportData, null, 2)
    );
    
    logger.error(`Crash occurred! Report saved to: ${crashFile}`);
  } catch (reportError) {
    // Last resort if even crash reporting fails
    console.error('Error creating crash report:', reportError);
    console.error('Original error:', error);
  }
}

// Main command handler
async function main() {
  const opts = program.opts() as AppOptions;
  
  // Configure logger
  if (opts.verbose) {
    logger.level = 'debug';
  }
  
  // Show update notification
  notifier.notify({ isGlobal: true });
  
  // Load plugins
  await loadPlugins({
    loadBuiltin: opts.builtinPlugins !== false,
    pluginDirs: opts.pluginDir || [],
    plugins: opts.plugin || []
  });
  
  // Request package name if not provided
  let pkg = opts.package;
  if (!pkg) {
    try {
      const device = await requireDevice(opts.device);
      const { stdout } = await execa('adb', ['-s', device, 'shell', 'pm', 'list', 'packages', '-3']);
      const list = stdout.trim().split('\n').map(l => l.replace('package:', ''));
      
      const response = await enquirer.prompt<{ answer: string }>({
        type: 'select',
        name: 'answer',
        message: 'Select package',
        choices: list
      });
      
      pkg = response.answer;
    } catch (error) {
      logger.error(`Error listing packages: ${error instanceof Error ? error.message : String(error)}`);
      process.exit(1);
    }
  }
  
  try {
    // 1. Pick device
    const device = await requireDevice(opts.device);
    logger.info({ device }, 'Using device');
    
    // 2. Acquire APK
    const apk = await acquire(pkg, device, opts);
    logger.info({ apk }, 'APK ready');
    
    // Early exit when only pulling
    if (!opts.analyze && !opts.genScript) {
      return;
    }
    
    // 3. Decompile
    const dexDir = await decompile(apk, opts);
    logger.info({ dexDir }, 'Decompilation complete');
    
    // 4. Scan
    const components = await scan(dexDir, opts.hooks.split(','), {
      useKtirScanner: opts.ir,
      useKtirOnly: opts.irOnly,
      showIrTimings: opts.irTimings,
      showTimings: opts.timings,
      saveResults: opts.saveResults
    });
    logger.info('Scan complete');
    
    // 5. Generate script
    let scriptPath: string | undefined;
    
    if (opts.genScript) {
      await ensureFridaServer(device);
      const paths = await generateFrida(pkg, components, opts.out, {
        templatePath: opts.template,
        addTests: opts.tests
      });
      logger.info({ script: paths.script, deploy: paths.deploy }, 'Script generated');
      scriptPath = paths.script;
      
      // Start watch mode if requested
      if (opts.watch && scriptPath) {
        logger.info('Starting watch mode, press Ctrl+C to stop');
        
        const stopWatching = await watchFridaScript({
          scriptPath,
          packageName: pkg,
          deviceId: device
        });
        
        // Keep the process running
        process.on('SIGINT', () => {
          logger.info('Stopping watch mode');
          stopWatching();
          process.exit(0);
        });
        
        // Keep the process alive
        await new Promise(() => {});
      }
    }
  } catch (error) {
    logger.error(`Error: ${error instanceof Error ? error.message : String(error)}`);
    
    // Detailed error for crash log
    if (error instanceof Error && error.stack) {
      logger.debug(error.stack);
    }
    
    process.exit(1);
  }
}

// Start the program
main().catch(error => {
  logger.error(`Fatal error: ${error.message}`);
  process.exit(1);
}); 