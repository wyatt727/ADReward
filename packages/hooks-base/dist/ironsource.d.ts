/**
 * IronSource ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video and other rewards in the IronSource SDK.
 */
/**
 * Hook family name
 */
export declare const family = "ironsource";
/**
 * Hook family description
 */
export declare const description = "IronSource rewarded video and offerwall callbacks";
/**
 * IronSource hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export declare function match(fileContent: string): Array<{
    className: string;
    methodName: string;
}>;
