# Test Fixtures for ADReward

This directory contains test fixtures used for automated testing of ADReward's hook detection and Frida script generation capabilities.

## Available Fixtures

- `admob-reward.java` - Sample AdMob reward implementation with the `onUserEarnedReward` callback
- `unity-reward.java` - Sample Unity Ads reward implementation with the `onUnityAdsFinish` callback

## Purpose

These fixtures serve multiple testing purposes:

1. **Automated CI Testing** - Used by GitHub Actions to verify hook detection
2. **Self-Testing Scripts** - Used with the `--tests` flag to generate self-verifying Frida scripts
3. **Unit Tests** - Used by Jest tests to ensure hook detectors correctly identify patterns

## Usage

### In Automated Tests

```javascript
const admobFixture = fs.readFileSync(path.join(__dirname, 'fixtures', 'admob-reward.java'), 'utf8');
const hooks = admobDetector.match(admobFixture);
expect(hooks.length).toBeGreaterThan(0);
expect(hooks[0].methodName).toBe('onUserEarnedReward');
```

### With Self-Testing Scripts

When using the `--tests` flag, the generated Frida script will include a self-testing section that:

1. Validates all hooks are properly registered
2. Reports success/failure statistics
3. Tests that each hook can be invoked without errors

## Adding New Fixtures

When adding new hook family support, also add corresponding test fixtures here following the naming pattern:

- `[family-name]-reward.java` - For Java/Kotlin implementations
- `[family-name]-reward.smali` - For Smali code samples 