package com.json.unity.androidbridge;

/* loaded from: classes4.dex */
public interface UnityLevelPlayInterstitialListener {
    void onAdClicked(String adInfo);

    void onAdClosed(String adInfo);

    void onAdLoadFailed(String error);

    void onAdOpened(String adInfo);

    void onAdReady(String adInfo);

    void onAdShowFailed(String error, String adInfo);

    void onAdShowSucceeded(String adInfo);
}
