import fs from 'fs';
import path from 'path';
import axios from 'axios';
import { execa } from 'execa';
import Handlebars from 'handlebars';
import { execAdb } from './adb.js';
import { logger } from './utils/logger.js';
import { tmpdir } from './utils/misc.js';
import { retryPatterns } from './utils/retry.js';
import { ComponentMap } from './scan.js';
import { pipelineHooks, FridaContext } from './hooks.js';

// Register Handlebars helpers
Handlebars.registerHelper('json', (obj: any) => JSON.stringify(obj));

// Load the Frida script template
const TEMPLATE_PATH = new URL('./templates/frida.hbs', import.meta.url);
const DEFAULT_TEMPLATE = fs.readFileSync(TEMPLATE_PATH, 'utf8');

// Add the test template
const TEST_TEMPLATE_PATH = new URL('./templates/frida-test.hbs', import.meta.url);
const TEST_TEMPLATE = fs.readFileSync(TEST_TEMPLATE_PATH, 'utf8');

/**
 * Ensure that Frida server is running on the target device.
 * This will check if Frida server is already running, and if not,
 * download and start it.
 * 
 * @param device Device ID
 * @returns Promise that resolves when Frida server is confirmed running
 */
export async function ensureFridaServer(device: string): Promise<void> {
  logger.info('Ensuring Frida server is running...');
  
  try {
    // Check if frida-server is already running
    const checkResult = await execAdb(device, 'shell pidof frida-server', { reject: false });
    if (checkResult.exitCode === 0) {
      logger.info('Frida server is already running on device');
      return;
    }
    
    // Get Frida version from the host
    const { stdout: fridaVersion } = await retryPatterns.network(() => 
      execa('frida', ['--version'])
    );
    const version = fridaVersion.trim();
    logger.info(`Frida tools version: ${version}`);
    
    // Get device ABI
    const { stdout: abi } = await execAdb(device, 'shell getprop ro.product.cpu.abi');
    const deviceAbi = abi.trim();
    logger.info(`Device ABI: ${deviceAbi}`);
    
    // Build binary name and download URL
    const binaryName = `frida-server-${version}-android-${deviceAbi}`;
    const downloadUrl = `https://github.com/frida/frida/releases/download/${version}/${binaryName}.xz`;
    const downloadPath = path.join(tmpdir(), `${binaryName}.xz`);
    const extractedPath = path.join(tmpdir(), binaryName);
    
    // Download frida-server if not already downloaded
    if (!fs.existsSync(downloadPath)) {
      logger.info(`Downloading Frida server from ${downloadUrl}`);
      
      await retryPatterns.network(async () => {
        const response = await axios({
          url: downloadUrl,
          method: 'GET',
          responseType: 'stream'
        });
        
        const writer = fs.createWriteStream(downloadPath);
        response.data.pipe(writer);
        
        return new Promise<void>((resolve, reject) => {
          writer.on('finish', resolve);
          writer.on('error', reject);
        });
      });
    } else {
      logger.info(`Using cached Frida server binary: ${downloadPath}`);
    }
    
    // Extract XZ archive
    if (!fs.existsSync(extractedPath)) {
      logger.info('Extracting Frida server binary...');
      await execa('unxz', ['-f', '-k', downloadPath]);
    }
    
    // Push binary to device
    logger.info('Pushing Frida server to device...');
    await execAdb(device, `push ${extractedPath} /data/local/tmp/frida-server`);
    
    // Set executable permissions
    logger.info('Setting executable permissions...');
    await execAdb(device, 'shell chmod 755 /data/local/tmp/frida-server');
    
    // Start Frida server in the background
    logger.info('Starting Frida server...');
    await execAdb(device, 'shell "/data/local/tmp/frida-server &"');
    
    // Wait for Frida server to start
    logger.info('Waiting for Frida server to come online...');
    let retries = 5;
    while (retries > 0) {
      const checkResult = await execAdb(device, 'shell pidof frida-server', { reject: false });
      if (checkResult.exitCode === 0) {
        logger.info('Frida server started successfully');
        return;
      }
      retries--;
      if (retries > 0) {
        logger.debug(`Frida server not yet online, ${retries} retries left...`);
        await new Promise(resolve => setTimeout(resolve, 1000)); // Wait 1 second between checks
      }
    }
    
    throw new Error('Failed to start Frida server after multiple attempts');
  } catch (error) {
    logger.error(`Failed to ensure Frida server: ${error instanceof Error ? error.message : String(error)}`);
    throw error;
  }
}

/**
 * Options for script generation
 */
export interface GenerateFridaOptions {
  /**
   * Custom template path to use, if not using the default template
   */
  templatePath?: string;
  
  /**
   * Whether to add auto-tests in the script
   */
  addTests?: boolean;
}

/**
 * Generate a Frida script to intercept ad reward hooks.
 * 
 * @param pkg Package name
 * @param components Component map from scanner
 * @param outDir Output directory
 * @param options Script generation options
 * @returns Promise that resolves with paths to the generated files
 */
export async function generateFrida(
  pkg: string, 
  components: ComponentMap, 
  outDir: string,
  options: GenerateFridaOptions = {}
): Promise<{ script: string; deploy: string }> {
  logger.info('Generating Frida script...');
  
  // Create frida context for hooks
  const fridaContext: FridaContext = {
    packageName: pkg,
    components,
    outDir
  };
  
  // Trigger beforeFridaGenerate hook
  await pipelineHooks.beforeFridaGenerate.promise(fridaContext);
  
  // Load template - either default or custom
  let templateContent = DEFAULT_TEMPLATE;
  if (options.templatePath && fs.existsSync(options.templatePath)) {
    templateContent = fs.readFileSync(options.templatePath, 'utf8');
    logger.info(`Using custom template from: ${options.templatePath}`);
  }
  
  // If we got scriptContent from a hook, use that instead of compiling our own
  let scriptContent = fridaContext.scriptContent;
  
  if (!scriptContent) {
    const compileTpl = Handlebars.compile(templateContent);
    
    // Compile template with package name and components
    scriptContent = compileTpl({ 
      pkg,
      hooks: components,
      addTests: options.addTests
    });
    
    // If tests are enabled, append the test template
    if (options.addTests) {
      logger.info('Adding self-invoking test stubs to Frida script');
      const compileTestTpl = Handlebars.compile(TEST_TEMPLATE);
      scriptContent += '\n\n' + compileTestTpl({ hooks: components });
    }
    
    // Store in context for hooks
    fridaContext.scriptContent = scriptContent;
  }
  
  // Create package output directory
  const pkgDir = path.join(outDir, pkg);
  fs.mkdirSync(pkgDir, { recursive: true });
  
  // Write script file
  const scriptPath = path.join(pkgDir, 'auto-ad-bypass.js');
  fs.writeFileSync(scriptPath, scriptContent);
  
  // Generate deploy helper script
  const deployPath = path.join(pkgDir, 'deploy.sh');
  const deployScript = `#!/bin/bash\nfrida -U -f ${pkg} -l "${scriptPath}" --no-pause`;
  fs.writeFileSync(deployPath, deployScript);
  fs.chmodSync(deployPath, 0o755);
  
  logger.info(`Frida script generated at: ${scriptPath}`);
  logger.info(`Deploy helper generated at: ${deployPath}`);
  
  const result = { 
    script: scriptPath, 
    deploy: deployPath 
  };
  
  // Trigger afterFridaGenerate hook
  await pipelineHooks.afterFridaGenerate.promise(fridaContext, result);
  
  return result;
} 