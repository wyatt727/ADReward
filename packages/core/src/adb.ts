import { execa, ExecaChildProcess } from 'execa';
import { logger } from './utils/logger.js';
import { retryPatternsFn } from './utils/retry.js';

/**
 * List all connected ADB devices.
 * Uses retry logic with exponential backoff for reliability.
 * 
 * @returns Promise that resolves with array of device IDs
 */
export async function listDevices(): Promise<string[]> {
  return retryPatternsFn.adb(async () => {
    const { stdout } = await execa('adb', ['devices']);
    const devices = stdout.split('\n')
      .filter(l => /\tdevice$/.test(l))
      .map(l => l.split('\t')[0]);
    
    logger.debug(`Found ${devices.length} connected devices`);
    return devices;
  });
}

/**
 * Get a specific ADB device or default to first available.
 * Uses retry logic with exponential backoff for reliability.
 * 
 * @param preferred Preferred device ID to use
 * @returns Promise that resolves with device ID
 * @throws Error if no devices are found or the preferred device isn't connected
 */
export async function requireDevice(preferred?: string): Promise<string> {
  return retryPatternsFn.adb(async () => {
    const devs = await listDevices();
    if (!devs.length) {
      throw new Error('No ADB devices online. Connect a device or start an emulator and try again.');
    }
    
    if (preferred && !devs.includes(preferred)) {
      throw new Error(`Device ${preferred} not found. Available devices: ${devs.join(', ')}`);
    }
    
    const selectedDevice = preferred || devs[0];
    logger.debug(`Using device: ${selectedDevice}`);
    return selectedDevice;
  });
}

/**
 * Execute an ADB command on a specific device.
 * Uses retry logic with exponential backoff for reliability.
 * 
 * @param device Device ID to target
 * @param cmd ADB command to execute
 * @param opts Options to pass to execa
 * @returns Promise that resolves with execa child process
 */
export async function execAdb(device: string, cmd: string, opts = {}): Promise<ExecaChildProcess<string>> {
  const cmdParts = cmd.split(' ');
  const cmdName = cmdParts[0];
  const args = cmdParts.slice(1);
  
  logger.debug(`Executing ADB command: ${cmd} on device ${device}`);
  
  return retryPatternsFn.adb(async () => {
    try {
      return await execa('adb', ['-s', device, cmdName, ...args], opts);
    } catch (error) {
      logger.error(`ADB command failed: ${cmd}`);
      
      // Check device status before rethrowing
      try {
        const deviceStatus = await execa('adb', ['-s', device, 'get-state'], { reject: false });
        if (deviceStatus.exitCode !== 0) {
          logger.error(`Device ${device} appears to be disconnected or unauthorized`);
        }
      } catch (_) {
        // Ignore error checking device status
      }
      
      throw error;
    }
  });
} 