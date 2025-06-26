/**
 * Interface for hook sites found by the ktir-scanner.
 */
export interface HookSite {
    className: string;
    methodName: string;
    desc: string;
    kotlinSig: string;
}
/**
 * Map of hook family names to lists of hook sites.
 */
export type ComponentMap = Record<string, HookSite[]>;
/**
 * Options for KtirScanner.
 */
export interface KtirScannerOptions {
    /**
     * Maximum heap size for the JVM running the scanner.
     * Default: 2048m (2GB)
     */
    maxHeapSize?: string;
    /**
     * Whether to show detailed timing information.
     */
    showTimings?: boolean;
}
/**
 * Wrapper for the ktir-scanner JAR.
 */
export declare class KtirScanner {
    private readonly jarPath;
    private readonly options;
    /**
     * Create a new KtirScanner instance.
     * @param jarPath Path to the ktir-scanner JAR. If not provided, defaults to the bundled JAR.
     * @param options Scanner options
     */
    constructor(jarPath?: string, options?: KtirScannerOptions);
    /**
     * Scan a JAR file for hooks.
     * @param jarFile Path to the JAR file to scan
     * @param hookFamilies Hook families to scan for
     * @returns Map of hook family names to lists of hook sites
     */
    scan(jarFile: string, hookFamilies: string[]): Promise<ComponentMap>;
    /**
     * Run the Java command.
     * @param args Command arguments
     * @returns Promise that resolves when the command completes
     */
    private runJava;
}
