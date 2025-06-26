package com.example.game;

import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;

/**
 * Sample Unity Ads reward implementation used for test fixtures
 */
public class UnityRewardManager implements IUnityAdsListener {
    private int gems = 0;
    private boolean rewardGranted = false;
    
    @Override
    public void onUnityAdsReady(String placementId) {
        System.out.println("Unity Ads Ready: " + placementId);
    }
    
    @Override
    public void onUnityAdsStart(String placementId) {
        System.out.println("Unity Ads Start: " + placementId);
    }
    
    @Override
    public void onUnityAdsFinish(String placementId, UnityAds.FinishState result) {
        // This is the method we want to hook - called when rewarded ad finishes
        if (result == UnityAds.FinishState.COMPLETED) {
            System.out.println("Unity Ads Rewarded: " + placementId);
            
            // Grant reward based on placement
            if ("rewardedVideo".equals(placementId)) {
                addGems(50);
                rewardGranted = true;
            }
        } else {
            System.out.println("Unity Ads not completed, no reward given");
        }
    }
    
    @Override
    public void onUnityAdsError(UnityAds.UnityAdsError error, String message) {
        System.out.println("Unity Ads Error: " + error + " - " + message);
    }
    
    public void addGems(int amount) {
        gems += amount;
        System.out.println("Gems updated to: " + gems);
    }
    
    public int getGems() {
        return gems;
    }
    
    public boolean isRewardGranted() {
        return rewardGranted;
    }
} 