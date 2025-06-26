/**
 * AppLovin MAX ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video and other rewards in the AppLovin MAX SDK.
 */
/**
 * Hook family name
 */
export declare const family = "applovin";
/**
 * Hook family description
 */
export declare const description = "AppLovin MAX rewarded video and incentivized ad callbacks";
/**
 * AppLovin hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export declare function match(fileContent: string): Array<{
    className: string;
    methodName: string;
}>;
