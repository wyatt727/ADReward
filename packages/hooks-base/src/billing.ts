/**
 * Google Play Billing hook detector for Smali files.
 * Detects methods that validate purchases, handle purchase completion, and grant rewards.
 */

/**
 * Hook family name
 */
export const family = 'billing';

/**
 * Hook family description
 */
export const description = 'Google Play Billing purchase verification and reward callbacks';

/**
 * Regular expressions for Google Play Billing purchase methods
 */
const patterns = [
  // Standard billing listener interfaces
  /\.class.*? (?:public|private|protected)?.*? (?:implements|extends) .*?com\/android\/billingclient\/api\/PurchasesUpdatedListener/,
  
  // Common purchase callback methods
  /\.method (?:public|private|protected)?.*?onPurchasesUpdated\(.*?\)V/,
  /\.method (?:public|private|protected)?.*?verifyPurchase\(.*?\)/,
  /\.method (?:public|private|protected)?.*?validatePurchase\(.*?\)/,
  /\.method (?:public|private|protected)?.*?processPurchase\(.*?\)/,
  
  // Purchase class usage
  /\.method (?:public|private|protected)?.*?\(.*?Lcom\/android\/billingclient\/api\/Purchase;.*?\)/,
  /\.method (?:public|private|protected)?.*?\(.*?Lcom\/android\/billingclient\/api\/BillingResult;.*?\)/,
  
  // Methods that grant rewards based on purchases
  /\.method (?:public|private|protected)?.*?(?:reward|grant|add).*?(?:coin|currency|gem)/i,
  /\.method (?:public|private|protected)?.*?handle.*?purchase/i
];

/**
 * Google Play Billing hook detector
 * @param fileContent Smali file content
 * @returns Array of hook objects if found, or empty array
 */
export function match(fileContent: string): Array<{ className: string, methodName: string }> {
  // Extract the class name from the file content
  const classNameMatch = /\.class (?:public |private |protected )?(?:final |abstract |synthetic )*L([^;]+);/.exec(fileContent);
  if (!classNameMatch) return [];

  const className = classNameMatch[1].replace(/\//g, '.');
  
  // Check if any Billing pattern matches
  if (!patterns.some(pattern => pattern.test(fileContent))) {
    return [];
  }
  
  // Find all purchase and reward related methods in the class
  const results: { className: string, methodName: string }[] = [];
  
  // Match for purchase verification methods
  const verifyMethodRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+(?:verify|validate|process)(?:Purchase|purchase).*?)\(.*?\)/gi;
  const verifyMatches = Array.from(fileContent.matchAll(verifyMethodRegex));
  
  for (const match of verifyMatches) {
    results.push({
      className,
      methodName: match[1]
    });
  }
  
  // Match for purchase update callback methods
  const updateMethodRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*onPurchasesUpdated\(.*?\)V/;
  if (updateMethodRegex.test(fileContent)) {
    results.push({
      className,
      methodName: 'onPurchasesUpdated'
    });
  }
  
  // Look for methods that handle purchases and grant rewards
  const grantMethodRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+(?:handle|process|complete)(?:Purchase|purchase).*?)\(.*?\)V/gi;
  const grantMatches = Array.from(fileContent.matchAll(grantMethodRegex));
  
  for (const match of grantMatches) {
    if (!results.some(r => r.methodName === match[1])) {
      results.push({
        className,
        methodName: match[1]
      });
    }
  }
  
  // Look for methods that grant rewards or coins
  const rewardMethodRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+(?:grant|reward|add)(?:Coins|Currency|Gems|Reward).*?)\(.*?\)/gi;
  const rewardMatches = Array.from(fileContent.matchAll(rewardMethodRegex));
  
  for (const match of rewardMatches) {
    if (!results.some(r => r.methodName === match[1]) && 
        (fileContent.includes('Purchase') || fileContent.includes('purchase'))) {
      results.push({
        className,
        methodName: match[1]
      });
    }
  }
  
  // Look for methods with Purchase parameter
  const purchaseParamRegex = /\.method (?:public|private|protected)?.*?(?:synthetic )*([a-zA-Z0-9_$]+)\(.*?Lcom\/android\/billingclient\/api\/Purchase;.*?\)/g;
  const purchaseMatches = Array.from(fileContent.matchAll(purchaseParamRegex));
  
  for (const match of purchaseMatches) {
    const methodName = match[1];
    
    if (!results.some(r => r.methodName === methodName) && 
        (methodName.toLowerCase().includes('reward') || 
         methodName.toLowerCase().includes('grant') || 
         methodName.toLowerCase().includes('validate') ||
         methodName.toLowerCase().includes('verify') || 
         methodName.toLowerCase().includes('process'))) {
      results.push({
        className,
        methodName
      });
    }
  }
  
  return results.length > 0 ? results : [];
} 