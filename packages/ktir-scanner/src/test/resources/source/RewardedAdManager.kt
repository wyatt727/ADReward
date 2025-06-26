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
        println("User earned reward:  ")
    }
    
    fun processReward(rewardItem: RewardItem): Boolean {
        // Another method that uses RewardItem
        return rewardItem.amount > 0
    }
}
