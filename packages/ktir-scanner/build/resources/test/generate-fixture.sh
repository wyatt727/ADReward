#!/bin/bash
set -e

# Directory setup
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
FIXTURES_DIR="$SCRIPT_DIR/fixtures"
TMP_DIR="$SCRIPT_DIR/tmp"
SOURCE_DIR="$SCRIPT_DIR/source"

# Clean and recreate temporary directory
rm -rf "$TMP_DIR"
mkdir -p "$TMP_DIR"
mkdir -p "$FIXTURES_DIR"

# Create source directory if it doesn't exist
mkdir -p "$SOURCE_DIR"

# If source files don't exist, create them
if [ ! -f "$SOURCE_DIR/RewardedAdManager.kt" ]; then
  echo "Creating source files..."
  
  cat > "$SOURCE_DIR/RewardedAdManager.kt" << EOF
package com.example.rewards

import com.google.android.gms.ads.rewarded.RewardItem

/**
 * Simple AdMob reward manager for testing
 */
class RewardedAdManager {
    fun onUserEarnedReward(reward: RewardItem) {
        // This is a mock implementation for testing
        val rewardAmount = reward.amount
        val rewardType = reward.type
        println("User earned reward: $rewardAmount $rewardType")
    }
    
    fun processReward(rewardItem: RewardItem): Boolean {
        // Another method that uses RewardItem
        return rewardItem.amount > 0
    }
}
EOF

  cat > "$SOURCE_DIR/UnityAdsListener.kt" << EOF
package com.example.unity

import com.unity3d.ads.IUnityAdsListener
import com.unity3d.ads.UnityAds

/**
 * Simple Unity ads listener for testing
 */
class UnityAdsListener : IUnityAdsListener {
    override fun onUnityAdsReady(placementId: String) {
        println("Unity Ads Ready: $placementId")
    }
    
    override fun onUnityAdsStart(placementId: String) {
        println("Unity Ads Start: $placementId")
    }
    
    override fun onUnityAdsFinish(placementId: String, finishState: UnityAds.FinishState) {
        // This is what we want to detect in tests
        if (finishState == UnityAds.FinishState.COMPLETED) {
            println("User completed ad: $placementId")
        }
    }
    
    override fun onUnityAdsError(error: UnityAds.UnityAdsError, message: String) {
        println("Unity Ads Error: $message")
    }
}
EOF

  # Create a mock AdMob class to avoid actual dependencies
  mkdir -p "$SOURCE_DIR/com/google/android/gms/ads/rewarded"
  cat > "$SOURCE_DIR/com/google/android/gms/ads/rewarded/RewardItem.kt" << EOF
package com.google.android.gms.ads.rewarded

/**
 * Mock RewardItem class for testing
 */
interface RewardItem {
    val amount: Int
    val type: String
}
EOF

  # Create mock Unity classes
  mkdir -p "$SOURCE_DIR/com/unity3d/ads"
  cat > "$SOURCE_DIR/com/unity3d/ads/IUnityAdsListener.kt" << EOF
package com.unity3d.ads

/**
 * Mock IUnityAdsListener interface for testing
 */
interface IUnityAdsListener {
    fun onUnityAdsReady(placementId: String)
    fun onUnityAdsStart(placementId: String)
    fun onUnityAdsFinish(placementId: String, finishState: UnityAds.FinishState)
    fun onUnityAdsError(error: UnityAds.UnityAdsError, message: String)
}
EOF

  cat > "$SOURCE_DIR/com/unity3d/ads/UnityAds.kt" << EOF
package com.unity3d.ads

/**
 * Mock UnityAds class for testing
 */
class UnityAds {
    enum class FinishState {
        COMPLETED,
        SKIPPED,
        ERROR
    }
    
    enum class UnityAdsError {
        NOT_INITIALIZED,
        INITIALIZE_FAILED,
        INVALID_ARGUMENT,
        VIDEO_PLAYER_ERROR,
        INIT_SANITY_CHECK_FAIL,
        AD_BLOCKER_DETECTED,
        FILE_IO_ERROR,
        DEVICE_ID_ERROR,
        SHOW_ERROR,
        INTERNAL_ERROR
    }
}
EOF
fi

# Compile Kotlin files
echo "Compiling Kotlin files..."
kotlinc "$SOURCE_DIR" -d "$TMP_DIR/classes"

# Create a mapping file for R8
cat > "$TMP_DIR/mapping.txt" << EOF
com.example.rewards.RewardedAdManager -> com.a.b.c.d:
    void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem) -> a
    boolean processReward(com.google.android.gms.ads.rewarded.RewardItem) -> b
com.example.unity.UnityAdsListener -> com.x.y.z:
    void onUnityAdsReady(java.lang.String) -> onUnityAdsReady
    void onUnityAdsStart(java.lang.String) -> onUnityAdsStart
    void onUnityAdsFinish(java.lang.String,com.unity3d.ads.UnityAds\$FinishState) -> onUnityAdsFinish
    void onUnityAdsError(com.unity3d.ads.UnityAds\$UnityAdsError,java.lang.String) -> onUnityAdsError
EOF

# Create a simple obfuscated JAR (simulating R8/ProGuard)
echo "Creating JAR..."
jar cf "$TMP_DIR/classes-original.jar" -C "$TMP_DIR/classes" .

# Apply "obfuscation" by renaming classes according to mapping
mkdir -p "$TMP_DIR/obfuscated"

# Simple simulation of obfuscation by copying to renamed package structure
mkdir -p "$TMP_DIR/obfuscated/com/a/b/c"
cp "$TMP_DIR/classes/com/example/rewards/RewardedAdManager.class" "$TMP_DIR/obfuscated/com/a/b/c/d.class"

mkdir -p "$TMP_DIR/obfuscated/com/x/y"
cp "$TMP_DIR/classes/com/example/unity/UnityAdsListener.class" "$TMP_DIR/obfuscated/com/x/y/z.class"

# Copy the mock classes unchanged
cp -r "$TMP_DIR/classes/com/google" "$TMP_DIR/obfuscated/"
cp -r "$TMP_DIR/classes/com/unity3d" "$TMP_DIR/obfuscated/"

# Package the obfuscated JAR
jar cf "$FIXTURES_DIR/obfuscated-reward-app.jar" -C "$TMP_DIR/obfuscated" .

# Add kotlin.Metadata annotations to simulate real Kotlin bytecode
echo "Adding Kotlin.Metadata annotations..."
cat > "$TMP_DIR/META-INF/services/kotlin.Metadata" << EOF
version=1.5.1
kotlin.Metadata
EOF
jar uf "$FIXTURES_DIR/obfuscated-reward-app.jar" -C "$TMP_DIR" META-INF/services/kotlin.Metadata

echo "Test fixture created at $FIXTURES_DIR/obfuscated-reward-app.jar"
echo "Done!" 