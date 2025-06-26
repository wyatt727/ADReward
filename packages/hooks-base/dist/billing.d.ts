/**
 * Google Play Billing hook detector for Smali files.
 * Detects methods that validate purchases, handle purchase completion, and grant rewards.
 */
/**
 * Hook family name
 */
export declare const family = "billing";
/**
 * Hook family description
 */
export declare const description = "Google Play Billing purchase verification and reward callbacks";
/**
 * Google Play Billing hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export declare function match(fileContent: string): Array<{
    className: string;
    methodName: string;
}>;
