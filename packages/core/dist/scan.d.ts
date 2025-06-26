/**
 * Component map type for scan results.
 */
export type ComponentMap = Record<string, any[]>;
/**
 * Options for scanning an APK.
 */
export interface ScanOptions {
    /**
     * Whether to use Kotlin IR scanning.
     */
    useKtirScanner?: boolean;
    /**
     * Whether to use only Kotlin IR scanning (skip Smali).
     */
    useKtirOnly?: boolean;
    /**
     * Whether to show IR timing information.
     */
    showIrTimings?: boolean;
    /**
     * Whether to show detailed timing information for all phases.
     */
    showTimings?: boolean;
    /**
     * Whether to save scan results to a file.
     */
    saveResults?: boolean;
    /**
     * Path to the last saved scan results file.
     */
    lastResultPath?: string;
}
/**
 * Checks if the directory contains any classes with Kotlin metadata.
 * @param dexDir Directory containing decompiled classes
 * @returns True if Kotlin metadata is found
 */
export declare function hasKotlinMetadata(dexDir: string): Promise<boolean>;
/**
 * Scan a decompiled APK for ad reward hooks.
 * @param dexDir Directory containing the decompiled DEX files
 * @param families Hook families to scan for
 * @param options Scan options
 * @returns Promise that resolves with the scan results
 */
export declare function scan(dexDir: string, families: string[], options?: ScanOptions): Promise<ComponentMap>;
