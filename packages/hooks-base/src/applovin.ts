/**
 * AppLovin MAX ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video and other rewards in the AppLovin MAX SDK.
 */

/**
 * Hook family name
 */
export const family = 'applovin';

/**
 * Hook family description
 */
export const description = 'AppLovin MAX rewarded video and incentivized ad callbacks';

/**
 * Regular expressions for AppLovin MAX rewarded video callback methods
 */
const patterns = [
  // Standard MAX rewarded ad listener methods
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?MaxRewardedAdListener/,
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?MaxAdListener/,
  /\.method (?:public|private|protected)?.*?onRewardedVideoCompleted\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?onUserRewarded\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?didRewardUser\(.*?\)V/,
  
  // MaxReward and MaxAd parameter usage
  /\.method (?:public|private|protected)?.*?\(.*?Lcom\/applovin\/mediation\/MaxReward;.*?\)/,
  /\.method (?:public|private|protected)?.*?\(.*?Lcom\/applovin\/mediation\/MaxAd;.*?\)/,
  
  // Controllers or managers that handle AppLovin rewards
  /\.class.*? (?:public|private|protected)?.*?(?:AppLovin|Applovin)Reward/
];

/**
 * AppLovin hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export function match(fileContent: string): Array<{ className: string, methodName: string }> {
  // Extract the class name from the file content
  const classNameMatch = /\.class (?:public |private |protected )?(?:final |abstract |synthetic )*L([^;]+);/.exec(fileContent);
  if (!classNameMatch) return [];

  const className = classNameMatch[1].replace(/\//g, '.');
  
  // If none of the patterns match, return empty array
  if (!patterns.some(pattern => pattern.test(fileContent))) {
    return [];
  }
  
  // Find all reward related methods in the class
  const results: { className: string, methodName: string }[] = [];
  
  // Match for primary reward methods
  const rewardMethodRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?\)V/g;
  const rewardMethodMatches = Array.from(fileContent.matchAll(rewardMethodRegex));
  
  for (const match of rewardMethodMatches) {
    if (match[1] === 'onRewardedVideoCompleted' || 
        match[1] === 'onUserRewarded' ||
        match[1] === 'didRewardUser' ||
        match[1].toLowerCase().includes('reward')) {
      results.push({
        className,
        methodName: match[1]
      });
    }
  }
  
  // Look for methods with MaxReward parameter
  const maxRewardParamRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?Lcom\/applovin\/mediation\/MaxReward;.*?\)/g;
  const maxRewardMatches = Array.from(fileContent.matchAll(maxRewardParamRegex));
  
  for (const match of maxRewardMatches) {
    // Avoid duplicates
    if (!results.some(r => r.methodName === match[1])) {
      results.push({
        className,
        methodName: match[1]
      });
    }
  }
  
  // Look for methods with MaxAd parameter and reward in name
  const maxAdRewardRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?Lcom\/applovin\/mediation\/MaxAd;.*?\)/g;
  const maxAdMatches = Array.from(fileContent.matchAll(maxAdRewardRegex));
  
  for (const match of maxAdMatches) {
    if (match[1] && match[1].toLowerCase().includes('reward')) {
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