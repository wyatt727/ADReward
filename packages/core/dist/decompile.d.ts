interface DecompileOptions {
    out: string;
    generateJar?: boolean;
    forceDecompile?: boolean;
}
/**
 * Decompile an APK file to Smali/Java code.
 * If the APK hasn't changed since the last decompilation, it will use the cached results.
 *
 * @param apk Path to the APK file
 * @param options Decompilation options
 * @returns Promise that resolves with the path to the decompiled DEX directory
 */
export declare function decompile(apk: string, { out, generateJar, forceDecompile }: DecompileOptions): Promise<string>;
export {};
