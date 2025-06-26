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
export declare function acquire(pkg: string, device: string, { pull, out }: AcquireOptions): Promise<string>;
export {};
