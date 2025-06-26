/**
 * Facebook (Meta) Audience Network ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video callbacks in the Facebook Audience Network SDK.
 */

/**
 * Hook family name
 */
export const family = 'facebook';

/**
 * Hook family description
 */
export const description = 'Facebook (Meta) Audience Network rewarded video callbacks';

/**
 * Regular expressions for Facebook Audience Network rewarded video callback methods
 */
const patterns = [
  // Standard rewarded video listener methods
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?RewardedVideoAdListener/,
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?RewardedVideoAdExtendedListener/,
  /\.method (?:public|private|protected)?.*?onRewardedVideoCompleted\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?onRewardedVideoClosed\(.*?\)V/,
  
  // RewardData parameter usage
  /\.method (?:public|private|protected)?.*?\(.*?Lcom\/facebook\/ads\/RewardData;.*?\)/,
  
  // Controllers or managers that handle Facebook rewards
  /\.class.*? (?:public|private|protected)?.*?FacebookReward/,
  /\.class.*? (?:public|private|protected)?.*?FBReward/
];

/**
 * Facebook Audience Network hook detector
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
        match[1] === 'onRewardedVideoClosed' ||
        match[1].toLowerCase().includes('reward')) {
      results.push({
        className,
        methodName: match[1]
      });
    }
  }
  
  // Look for methods with RewardData parameter
  const rewardDataParamRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?Lcom\/facebook\/ads\/RewardData;.*?\)/g;
  const rewardDataMatches = Array.from(fileContent.matchAll(rewardDataParamRegex));
  
  for (const match of rewardDataMatches) {
    // Avoid duplicates
    if (!results.some(r => r.methodName === match[1])) {
      results.push({
        className,
        methodName: match[1]
      });
    }
  }
  
  // Check for special case - onLoggingImpression in RewardedVideoAd classes
  if (fileContent.includes('onLoggingImpression') && 
      (fileContent.includes('RewardedVideoAd') || 
       fileContent.includes('RewardedVideoAdListener'))) {
    
    const impressionRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+ImpressionLogged|onLoggingImpression)\(.*?\)V/;
    const impressionMatch = impressionRegex.exec(fileContent);
    
    if (impressionMatch && !results.some(r => r.methodName === impressionMatch[1])) {
      results.push({
        className,
        methodName: impressionMatch[1]
      });
    }
  }
  
  return results.length > 0 ? results : [];
} 