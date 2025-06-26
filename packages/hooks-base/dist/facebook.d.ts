/**
 * Facebook (Meta) Audience Network ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video callbacks in the Facebook Audience Network SDK.
 */
/**
 * Hook family name
 */
export declare const family = "facebook";
/**
 * Hook family description
 */
export declare const description = "Facebook (Meta) Audience Network rewarded video callbacks";
/**
 * Facebook Audience Network hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export declare function match(fileContent: string): Array<{
    className: string;
    methodName: string;
}>;
