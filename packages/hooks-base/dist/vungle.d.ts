/**
 * Vungle ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video and other rewards in the Vungle SDK.
 */
/**
 * Hook family name
 */
export declare const family = "vungle";
/**
 * Hook family description
 */
export declare const description = "Vungle rewarded video and completion callbacks";
/**
 * Vungle hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export declare function match(fileContent: string): Array<{
    className: string;
    methodName: string;
}>;
