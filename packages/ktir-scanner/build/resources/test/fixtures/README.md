# Test Fixtures for Kotlin IR Scanner

This directory contains test fixtures for the Kotlin IR Scanner unit tests.

## obfuscated-reward-app.jar

A simple JAR containing obfuscated Kotlin classes that implement reward patterns from both AdMob and Unity.

This fixture is used by `IRScannerTest` to verify that:
1. The scanner can correctly analyze Kotlin IR
2. It can find hook sites in obfuscated code
3. It produces correct JVM descriptors

### Fixture Content

The JAR contains the following key classes (obfuscated):

- `com.a.b.c.d` (originally `RewardedAdManager`)
  - Method `a` (originally `onUserEarnedReward`) that uses a `RewardItem` parameter
  - JVM descriptor: `(Lcom/google/android/gms/ads/rewarded/RewardItem;)V`

- `com.x.y.z` (originally `UnityAdsListener`)
  - Method `onUnityAdsFinish` that takes a string and `FinishState` parameter
  - JVM descriptor: `(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$FinishState;)V`

### How to Generate

To regenerate this fixture (if needed):

1. Compile the source code in `src/test/kotlin/fixtures/`
2. Run ProGuard/R8 obfuscation
3. Package the obfuscated classes into a JAR
4. Place the JAR in this directory as `obfuscated-reward-app.jar`

### Automated Generation

There's a build script in the test resources directory that can generate this fixture:

```bash
cd packages/ktir-scanner/src/test/resources
./generate-fixture.sh
```

This ensures that tests have reliable fixtures that match the expected patterns.

## Required Test Fixtures

- `obfuscated-reward-app.jar` - An obfuscated JAR file containing AdMob and Unity reward hooks.

## Creating Test Fixtures

To create a test fixture:

1. Start with a simple Android app that uses AdMob and Unity rewards
2. Build the app normally
3. Apply ProGuard/R8 obfuscation with the following rules to retain Kotlin metadata:
   ```
   -keep class kotlin.Metadata { *; }
   ```
4. Extract the app's classes into a JAR file:
   ```
   d2j-dex2jar.sh -o obfuscated-reward-app.jar app.apk
   ```
5. Place the JAR file in this directory

## Expected Hook Types

The test fixture should contain at least:

1. AdMob hooks with methods containing "EarnedReward" and RewardItem parameter/return types
2. Unity hooks with the "onUnityAdsFinish" method and FinishState parameter

These hooks will be verified by the test suite. 