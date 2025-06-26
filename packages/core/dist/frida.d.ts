import { ComponentMap } from './scan.js';
/**
 * Ensure that Frida server is running on the target device.
 * This will check if Frida server is already running, and if not,
 * download and start it.
 *
 * @param device Device ID
 * @returns Promise that resolves when Frida server is confirmed running
 */
export declare function ensureFridaServer(device: string): Promise<void>;
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
export declare function generateFrida(pkg: string, components: ComponentMap, outDir: string, options?: GenerateFridaOptions): Promise<{
    script: string;
    deploy: string;
}>;
