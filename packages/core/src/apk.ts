import fs from 'fs';
import path from 'path';
import { execa } from 'execa';
import { execAdb } from './adb.js';
import { logger } from './utils/logger.js';
import { tmpdir } from './utils/misc.js';
import { retryPatterns } from './utils/retry.js';
import { pipelineHooks, AcquireContext } from './hooks.js';

const BUNDLETOOL = path.resolve('bundletool.jar');

interface AcquireOptions {
  pull?: boolean;
  out: string;
}

/**
 * Acquire an APK from a device, with optional caching.
 * Uses retry logic with exponential backoff for reliability.
 * 
 * @param pkg Package name to acquire
 * @param device Device ID to acquire from
 * @param options Acquisition options
 * @returns Promise that resolves with path to the APK file
 * @throws Error if the package cannot be found or acquired
 */
export async function acquire(pkg: string, device: string, { pull, out }: AcquireOptions): Promise<string> {
  // Create acquire context for hooks
  const acquireContext: AcquireContext = {
    packageName: pkg,
    deviceId: device,
    options: { pull, out }
  };
  
  // Trigger beforeAcquire hook
  await pipelineHooks.beforeAcquire.promise(acquireContext);
  
  const target = path.join(out, `${pkg}.apk`);
  if (fs.existsSync(target) && !pull) {
    logger.debug('Using cached APK');
    
    // Trigger afterAcquire hook with cached result
    await pipelineHooks.afterAcquire.promise(acquireContext, target);
    
    return target;
  }
  
  logger.info(`Acquiring package: ${pkg} from device: ${device}`);
  
  // 1. enumerate remote paths (already uses retry pattern via execAdb)
  const { stdout } = await execAdb(device, `shell pm path ${pkg}`);
  const paths = stdout.trim().split('\n').map(l => l.replace('package:', ''));
  
  if (!paths[0]) {
    throw new Error(`Package ${pkg} not found on device ${device}`);
  }
  
  logger.debug(`Found ${paths.length} APK paths for package ${pkg}`);
  
  // Create output directory
  fs.mkdirSync(out, { recursive: true });

  // Check if it's a single APK (non-split)
  if (paths.length === 1 && paths[0].endsWith('.apk')) {
    logger.info('Single APK found, pulling...');
    await execAdb(device, `pull ${paths[0]} ${target}`, { stdio: 'inherit' });
    
    // Trigger afterAcquire hook
    await pipelineHooks.afterAcquire.promise(acquireContext, target);
    
    return target;
  }
  
  // Handle split APKs
  logger.info(`Split APK found with ${paths.length} splits, building universal APK...`);
  const splitsDir = path.join(tmpdir(), `${pkg}-splits`);
  fs.mkdirSync(splitsDir, { recursive: true });
  
  // Pull all splits (already uses retry pattern via execAdb)
  for (const p of paths) {
    const targetSplitPath = path.join(splitsDir, path.basename(p));
    await execAdb(device, `pull ${p} ${targetSplitPath}`);
  }

  // Build universal APK using bundletool (use Java retry pattern)
  try {
    const apksPath = path.join(splitsDir, 'tmp.apks');
    
    await retryPatterns.java(async () => {
      logger.info('Running bundletool to build universal APK...');
      await execa('java', [
        '-jar', 
        BUNDLETOOL, 
        'build-apks',
        '--mode=universal', 
        `--output=${apksPath}`,
        '--apks', 
        splitsDir,
      ]);
    });
    
    await retryPatterns.java(async () => {
      logger.info('Extracting universal APK from APKS file...');
      await execa('unzip', ['-p', apksPath, 'universal.apk'], { 
        stdout: fs.createWriteStream(target) 
      });
    });
    
    logger.info(`Universal APK built: ${target}`);
  } catch (error) {
    logger.error(`Failed to build universal APK: ${error instanceof Error ? error.message : String(error)}`);
    
    // Try fallback: just copy the base APK if the universal build fails
    const baseApk = paths.find(p => p.includes('base.apk'));
    if (baseApk) {
      logger.warn('Falling back to base APK since universal build failed');
      await execAdb(device, `pull ${baseApk} ${target}`, { stdio: 'inherit' });
    } else {
      throw error; // Re-throw if we can't even find a base APK
    }
  }
  
  // Trigger afterAcquire hook
  await pipelineHooks.afterAcquire.promise(acquireContext, target);
  
  return target;
} 