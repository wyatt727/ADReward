import { ExecaChildProcess } from 'execa';
/**
 * List all connected ADB devices.
 * Uses retry logic with exponential backoff for reliability.
 *
 * @returns Promise that resolves with array of device IDs
 */
export declare function listDevices(): Promise<string[]>;
/**
 * Get a specific ADB device or default to first available.
 * Uses retry logic with exponential backoff for reliability.
 *
 * @param preferred Preferred device ID to use
 * @returns Promise that resolves with device ID
 * @throws Error if no devices are found or the preferred device isn't connected
 */
export declare function requireDevice(preferred?: string): Promise<string>;
/**
 * Execute an ADB command on a specific device.
 * Uses retry logic with exponential backoff for reliability.
 *
 * @param device Device ID to target
 * @param cmd ADB command to execute
 * @param opts Options to pass to execa
 * @returns Promise that resolves with execa child process
 */
export declare function execAdb(device: string, cmd: string, opts?: {}): Promise<ExecaChildProcess<string>>;
