package com.example.game;

import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.OnUserEarnedRewardListener;

/**
 * Sample AdMob reward implementation used for test fixtures
 */
public class AdMobRewardManager implements OnUserEarnedRewardListener {
    private int coins = 0;
    private boolean rewardGranted = false;
    
    @Override
    public void onUserEarnedReward(RewardItem rewardItem) {
        // This is the method we want to hook
        if (rewardItem != null) {
            int amount = rewardItem.getAmount();
            String type = rewardItem.getType();
            System.out.println("Reward earned: " + amount + " " + type);
            
            // Update player stats
            addCoins(amount);
            rewardGranted = true;
        }
    }
    
    public void addCoins(int amount) {
        coins += amount;
        System.out.println("Coins updated to: " + coins);
    }
    
    public int getCoins() {
        return coins;
    }
    
    public boolean isRewardGranted() {
        return rewardGranted;
    }
} 