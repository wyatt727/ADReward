interface ScanWorkerData {
    files: string[];
    families: string[];
}
interface MatchResult {
    className: string;
    methodName: string;
    [key: string]: any;
}
/**
 * Main worker function that processes a batch of files looking for hooks.
 * This is designed to work with both Worker Threads and Piscina.
 *
 * @param data The worker data containing files and families to scan for
 * @returns Map of hook families to hook sites
 */
declare function processFiles(data: ScanWorkerData): Promise<Record<string, MatchResult[]>>;
export default processFiles;
