#!/usr/bin/env node
import path from 'path';
import { fileURLToPath } from 'url';
import { diffComponentFiles } from '../src/diff.js';
import fs from 'fs';

// Get paths to test files
const __dirname = path.dirname(fileURLToPath(import.meta.url));
const oldFile = path.join(__dirname, 'sample-component-old.json');
const newFile = path.join(__dirname, 'sample-component-new.json');

// Run diff
console.log(`Comparing ${oldFile} and ${newFile}...`);
diffComponentFiles(oldFile, newFile, {
  showUnchanged: true,
  saveToFile: true,
  outputPath: path.join(__dirname, 'diff-result.txt')
}).then(stats => {
  console.log('\nDiff Stats:', stats);
}).catch(err => {
  console.error('Error:', err);
  process.exit(1);
});

describe('Component diff reporter', () => {
  const sampleOldPath = path.join(__dirname, 'sample-component-old.json');
  const sampleNewPath = path.join(__dirname, 'sample-component-new.json');
  
  // Create sample data if it doesn't exist for testing
  beforeAll(() => {
    if (!fs.existsSync(sampleOldPath)) {
      const oldComponents = {
        admob: [
          { className: 'com.example.AdMobRewardManager', methodName: 'onUserEarnedReward' },
          { className: 'com.example.OldClass', methodName: 'oldMethod' }
        ],
        unity: [
          { className: 'com.example.UnityRewardManager', methodName: 'onUnityAdsFinish' }
        ]
      };
      fs.writeFileSync(sampleOldPath, JSON.stringify(oldComponents, null, 2));
    }
    
    if (!fs.existsSync(sampleNewPath)) {
      const newComponents = {
        admob: [
          { className: 'com.example.AdMobRewardManager', methodName: 'onUserEarnedReward' }, // unchanged
          { className: 'com.example.NewClass', methodName: 'newMethod' } // added
        ],
        unity: [
          { className: 'com.example.UnityRewardManager', methodName: 'onUnityAdsFinish' }, // unchanged
          { className: 'com.example.AdditionalUnity', methodName: 'onUnityAdsShowComplete' } // added
        ],
        ironsource: [ // new family
          { className: 'com.example.IronSourceManager', methodName: 'onRewardedVideoAdRewarded' }
        ]
      };
      fs.writeFileSync(sampleNewPath, JSON.stringify(newComponents, null, 2));
    }
  });
  
  it('should detect added, removed, and unchanged components', async () => {
    const result = await diffComponentFiles(sampleOldPath, sampleNewPath);
    
    // Check counts
    expect(result.added).toHaveLength(3); // 2 new methods + 1 new family
    expect(result.removed).toHaveLength(1); // OldClass.oldMethod
    expect(result.unchanged).toHaveLength(2); // The two unchanged methods
    
    // Check specific components
    expect(result.added).toContainEqual(expect.objectContaining({
      className: 'com.example.NewClass',
      methodName: 'newMethod'
    }));
    
    expect(result.added).toContainEqual(expect.objectContaining({
      className: 'com.example.AdditionalUnity',
      methodName: 'onUnityAdsShowComplete'
    }));
    
    expect(result.added).toContainEqual(expect.objectContaining({
      className: 'com.example.IronSourceManager',
      methodName: 'onRewardedVideoAdRewarded'
    }));
    
    expect(result.removed).toContainEqual(expect.objectContaining({
      className: 'com.example.OldClass',
      methodName: 'oldMethod'
    }));
    
    expect(result.unchanged).toContainEqual(expect.objectContaining({
      className: 'com.example.AdMobRewardManager',
      methodName: 'onUserEarnedReward'
    }));
  });
  
  it('should generate a summary of changes', async () => {
    const result = await diffComponentFiles(sampleOldPath, sampleNewPath);
    const summary = result.summary;
    
    expect(summary.total.old).toBe(3); // 2 admob + 1 unity in old
    expect(summary.total.new).toBe(5); // 2 admob + 2 unity + 1 ironsource in new
    expect(summary.added).toBe(3);
    expect(summary.removed).toBe(1);
    expect(summary.unchanged).toBe(2);
    
    // Check family-level changes
    expect(summary.families.added).toContain('ironsource');
    expect(summary.families.removed).toHaveLength(0);
    expect(summary.families.changed).toContain('admob');
    expect(summary.families.changed).toContain('unity');
  });
  
  it('should handle formatting output with different options', async () => {
    const result = await diffComponentFiles(sampleOldPath, sampleNewPath, { showUnchanged: true });
    
    // With showUnchanged: true, should include unchanged in formatted output
    const formattedWithUnchanged = result.format();
    expect(formattedWithUnchanged).toContain('Unchanged');
    expect(formattedWithUnchanged).toContain('com.example.AdMobRewardManager');
    
    // With showUnchanged: false, should not include unchanged in formatted output
    const formattedWithoutUnchanged = result.format({ showUnchanged: false });
    expect(formattedWithoutUnchanged).toContain('Added');
    expect(formattedWithoutUnchanged).toContain('Removed');
    expect(formattedWithoutUnchanged).not.toContain('Unchanged');
  });
}); 