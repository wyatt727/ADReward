/**
 * Vungle ad SDK hook detector for Smali files.
 * Detects methods that handle rewarded video and other rewards in the Vungle SDK.
 */

/**
 * Hook family name
 */
export const family = 'vungle';

/**
 * Hook family description
 */
export const description = 'Vungle rewarded video and completion callbacks';

/**
 * Regular expressions for Vungle rewarded video callback methods
 */
const patterns = [
  // Standard Vungle listener interfaces
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?com\/vungle\/warren\/PlayAdCallback/,
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?com\/vungle\/warren\/AdListener/,
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?com\/vungle\/warren\/RewardListener/,
  
  // Common Vungle callback methods
  /\.method (?:public|private|protected)?.*?onAdRewarded\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?onRewardedAdCompleted\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?onComplete\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?onSuccess\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?onAdEnd\(.*?\)V/,
  
  // Classes or methods with Vungle and reward in the name
  /\.class.*? (?:public|private|protected)?.*?Vungle.*?Reward/,
  /\.method (?:public|private|protected)?.*?[vV]ungle.*?[rR]eward/
];

/**
 * Vungle hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export function match(fileContent: string): Array<{ className: string, methodName: string }> {
  // Extract the class name from the file content
  const classNameMatch = /\.class (?:public |private |protected )?(?:final |abstract |synthetic )*L([^;]+);/.exec(fileContent);
  if (!classNameMatch) return [];

  const className = classNameMatch[1].replace(/\//g, '.');
  
  // Check if any Vungle pattern matches
  if (!patterns.some(pattern => pattern.test(fileContent))) {
    return [];
  }
  
  // Find all reward related methods in the class
  const results: { className: string, methodName: string }[] = [];
  
  // Match for primary Vungle reward callback methods
  const methodRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?\)V/g;
  const methodMatches = Array.from(fileContent.matchAll(methodRegex));
  
  for (const match of methodMatches) {
    const methodName = match[1];
    
    // Check for known callback method names
    if (methodName === 'onAdRewarded' || 
        methodName === 'onRewardedAdCompleted' || 
        methodName === 'onComplete' ||
        methodName === 'onSuccess' ||
        methodName === 'onAdEnd' ||
        methodName.toLowerCase().includes('reward') ||
        methodName.toLowerCase().includes('earn') && 
        (fileContent.toLowerCase().includes('vungle') || 
         fileContent.toLowerCase().includes('reward'))) {
      
      // Avoid duplicates
      if (!results.some(r => r.methodName === methodName)) {
        results.push({
          className,
          methodName
        });
      }
    }
  }
  
  // For Vungle implementations, let's also look for inner classes that might handle rewards
  const innerClassPattern = /\.field (?:public|private|protected)?.*?final (?:synthetic )*L([^;]+);/g;
  const innerMatches = Array.from(fileContent.matchAll(innerClassPattern));
  
  for (const match of innerMatches) {
    const innerClassName = match[1].replace(/\//g, '.');
    
    if (innerClassName.toLowerCase().includes('reward') || 
        innerClassName.toLowerCase().includes('complete')) {
      
      // Add a method with the inner class name as a hint
      const innerName = innerClassName.split('$').pop() || "";
      if (innerName && !results.some(r => r.methodName === innerName)) {
        results.push({
          className,
          methodName: innerName
        });
      }
    }
  }
  
  return results.length > 0 ? results : [];
} 