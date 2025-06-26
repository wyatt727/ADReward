/**
 * Interface for watch options
 */
export interface WatchOptions {
    /**
     * Path to the Frida script to watch
     */
    scriptPath: string;
    /**
     * Package name to target
     */
    packageName: string;
    /**
     * Device ID to target
     */
    deviceId?: string;
    /**
     * Whether to spawn a new Frida process for each change or use reload
     */
    useReload?: boolean;
}
/**
 * Watch a Frida script for changes and automatically reload it
 * @param options Watch options
 * @returns Function to stop watching
 */
export declare function watchFridaScript(options: WatchOptions): Promise<() => void>;
