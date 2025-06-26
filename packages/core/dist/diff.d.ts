import { ComponentMap } from './ktir.js';
/**
 * Interface for diff result stats
 */
export interface DiffStats {
    added: number;
    removed: number;
    changed: number;
    unchanged: number;
}
/**
 * Options for generating diffs
 */
export interface DiffOptions {
    /**
     * Whether to show unchanged items
     */
    showUnchanged?: boolean;
    /**
     * Whether to save the diff to a file
     */
    saveToFile?: boolean;
    /**
     * Output file path if saving
     */
    outputPath?: string;
}
/**
 * Compare two component maps and generate a diff
 * @param oldComponents Old component map
 * @param newComponents New component map
 * @param options Diff options
 * @returns Stats about the diff
 */
export declare function diffComponents(oldComponents: ComponentMap, newComponents: ComponentMap, options?: DiffOptions): Promise<DiffStats>;
/**
 * Compare components from two JSON files
 * @param oldPath Path to old components JSON file
 * @param newPath Path to new components JSON file
 * @param options Diff options
 * @returns Stats about the diff
 */
export declare function diffComponentFiles(oldPath: string, newPath: string, options?: DiffOptions): Promise<DiffStats>;
