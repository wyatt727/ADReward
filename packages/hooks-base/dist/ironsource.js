/**
 * IronSource ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video and other rewards in the IronSource SDK.
 */
/**
 * Hook family name
 */
export const family = 'ironsource';
/**
 * Hook family description
 */
export const description = 'IronSource rewarded video and offerwall callbacks';
/**
 * Regular expressions for IronSource rewarded video callback methods
 */
const patterns = [
    // Standard rewarded video listener methods
    /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?RewardedVideoListener/,
    /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?LevelPlayRewardListener/,
    /\.method (?:public|private|protected)?.*?onRewardedVideoAdRewarded\(.*?\)V/,
    // Placement class usage
    /\.method (?:public|private|protected)?.*?onRewardedVideoAdRewarded\(.*?Lcom\/ironsource\/mediationsdk\/model\/Placement;.*?\)V/,
    // All methods interacting with Placement class related to rewards
    /\.method (?:public|private|protected)?.*?(?:reward|grant).*?\(.*?Lcom\/ironsource\/mediationsdk\/model\/Placement;.*?\)/,
    // LevelPlay API
    /\.method (?:public|private|protected)?.*?onAdRewarded\(.*?\)V/,
    // Controllers or managers that handle IronSource rewards
    /\.class.*? (?:public|private|protected)?.*?IronSourceReward/
];
/**
 * IronSource hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export function match(fileContent) {
    // Extract the class name from the file content
    const classNameMatch = /\.class (?:public |private |protected )?(?:final |abstract |synthetic )*L([^;]+);/.exec(fileContent);
    if (!classNameMatch)
        return [];
    const className = classNameMatch[1].replace(/\//g, '.');
    // If none of the patterns match, return empty array
    if (!patterns.some(pattern => pattern.test(fileContent))) {
        return [];
    }
    // Find all reward related methods in the class
    const results = [];
    // Match for onRewardedVideoAdRewarded method
    const rewardedMethodMatch = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?(?:Lcom\/ironsource\/mediationsdk\/model\/Placement;|.*?)\)V/.exec(fileContent);
    if (rewardedMethodMatch && (rewardedMethodMatch[1] === 'onRewardedVideoAdRewarded' ||
        rewardedMethodMatch[1] === 'onAdRewarded' ||
        rewardedMethodMatch[1].toLowerCase().includes('reward'))) {
        results.push({
            className,
            methodName: rewardedMethodMatch[1]
        });
    }
    // Look for other reward methods
    const methodMatches = fileContent.matchAll(/\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?(?:Lcom\/ironsource\/mediationsdk\/model\/Placement;|.*?)\)V/g);
    for (const match of methodMatches) {
        if (match[1] && (match[1].includes('Reward') ||
            match[1].includes('reward') ||
            match[1].includes('Placement') ||
            match[1].includes('placement'))) {
            // Avoid duplicates
            if (!results.some(r => r.methodName === match[1])) {
                results.push({
                    className,
                    methodName: match[1]
                });
            }
        }
    }
    return results.length > 0 ? results : [];
}
//# sourceMappingURL=ironsource.js.map