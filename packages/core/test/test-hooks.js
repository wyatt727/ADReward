import fs from 'fs';
import path from 'path';
import { fileURLToPath } from 'url';
// Use module name mapper pattern that will be resolved by Jest
import * as admob from '@adreward/hooks-base/admob';
import * as unity from '@adreward/hooks-base/unity';

const __dirname = path.dirname(fileURLToPath(import.meta.url));

describe('Hook detectors', () => {
  describe('AdMob hook detector', () => {
    it('should detect onUserEarnedReward method in sample fixture', () => {
      // Read the AdMob fixture
      const fixturePath = path.join(__dirname, 'fixtures', 'admob-reward.java');
      const fixtureContent = fs.readFileSync(fixturePath, 'utf8');
      
      // Convert Java to simulated Smali format for the detector
      const smaliContent = convertJavaToSmaliFormat(fixtureContent);
      
      // Run the detector
      const hooks = admob.match(smaliContent);
      
      // Validate results
      expect(hooks.length).toBeGreaterThan(0);
      expect(hooks.some(h => h.methodName === 'onUserEarnedReward')).toBe(true);
      expect(hooks.some(h => h.className.includes('AdMobRewardManager'))).toBe(true);
    });
  });
  
  describe('Unity hook detector', () => {
    it('should detect onUnityAdsFinish method in sample fixture', () => {
      // Read the Unity fixture
      const fixturePath = path.join(__dirname, 'fixtures', 'unity-reward.java');
      const fixtureContent = fs.readFileSync(fixturePath, 'utf8');
      
      // Convert Java to simulated Smali format for the detector
      const smaliContent = convertJavaToSmaliFormat(fixtureContent);
      
      // Run the detector
      const hooks = unity.match(smaliContent);
      
      // Validate results
      expect(hooks.length).toBeGreaterThan(0);
      expect(hooks.some(h => h.methodName === 'onUnityAdsFinish')).toBe(true);
      expect(hooks.some(h => h.className.includes('UnityRewardManager'))).toBe(true);
    });
  });
});

/**
 * Helper function to convert Java code to a simplified Smali format
 * that our hook detectors will recognize
 * 
 * @param {string} javaCode Java code to convert
 * @returns {string} Simplified Smali format
 */
function convertJavaToSmaliFormat(javaCode) {
  // Extract class name
  const classMatch = javaCode.match(/public class (\w+)/);
  const className = classMatch ? classMatch[1] : 'Unknown';
  
  // Extract package name
  const packageMatch = javaCode.match(/package ([^;]+);/);
  const packageName = packageMatch ? packageMatch[1] : 'com.example';
  
  // Create Smali class header
  let smali = `.class public L${packageName.replace(/\./g, '/')}/${className};\n`;
  
  // Extract imports to identify dependencies
  const imports = [];
  const importRegex = /import ([^;]+);/g;
  let importMatch;
  while ((importMatch = importRegex.exec(javaCode)) !== null) {
    imports.push(importMatch[1]);
  }
  
  // Add implements clauses
  if (javaCode.includes('implements ')) {
    const implementsMatch = javaCode.match(/implements ([^{]+)/);
    if (implementsMatch) {
      const interfaces = implementsMatch[1].trim().split(',').map(i => i.trim());
      interfaces.forEach(iface => {
        smali += `.implements ${iface.replace(/\./g, '/')}\n`;
      });
    }
  }
  
  // Extract method signatures
  const methodRegex = /public void (\w+)\(([^)]*)\)/g;
  let methodMatch;
  while ((methodMatch = methodRegex.exec(javaCode)) !== null) {
    const methodName = methodMatch[1];
    const params = methodMatch[2];
    
    // Add the method declaration to Smali
    smali += `.method public ${methodName}(${convertParamsToSmali(params)})V\n`;
    smali += `.end method\n\n`;
  }
  
  return smali;
}

/**
 * Convert Java parameter list to Smali format
 * 
 * @param {string} params Java parameters
 * @returns {string} Smali parameter string
 */
function convertParamsToSmali(params) {
  if (!params.trim()) return '';
  
  return params.split(',').map(param => {
    const trimmed = param.trim();
    const parts = trimmed.split(' ');
    const type = parts[0];
    
    switch (type) {
      case 'String':
        return 'Ljava/lang/String;';
      case 'int':
        return 'I';
      case 'boolean':
        return 'Z';
      case 'RewardItem':
        return 'Lcom/google/android/gms/ads/rewarded/RewardItem;';
      case 'UnityAds.FinishState':
        return 'Lcom/unity3d/ads/UnityAds$FinishState;';
      case 'UnityAds.UnityAdsError':
        return 'Lcom/unity3d/ads/UnityAds$UnityAdsError;';
      default:
        // For custom types, try to create a reasonable package path
        if (type.includes('.')) {
          return `L${type.replace(/\./g, '/')};`;
        }
        return `Ljava/lang/Object;`;
    }
  }).join('');
} 