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
