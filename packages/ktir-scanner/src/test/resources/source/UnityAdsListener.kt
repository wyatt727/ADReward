package com.example.unity

import com.unity3d.ads.IUnityAdsListener
import com.unity3d.ads.UnityAds

/**
 * Simple Unity ads listener for testing
 */
class UnityAdsListener : IUnityAdsListener {
    override fun onUnityAdsReady(placementId: String) {
        println("Unity Ads Ready: ")
    }
    
    override fun onUnityAdsStart(placementId: String) {
        println("Unity Ads Start: ")
    }
    
    override fun onUnityAdsFinish(placementId: String, finishState: UnityAds.FinishState) {
        // This is what we want to detect in tests
        if (finishState == UnityAds.FinishState.COMPLETED) {
            println("User completed ad: ")
        }
    }
    
    override fun onUnityAdsError(error: UnityAds.UnityAdsError, message: String) {
        println("Unity Ads Error: ")
    }
}
