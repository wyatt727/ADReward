package com.json.unity.androidbridge;

/* loaded from: classes4.dex */
public interface UnityInterstitialListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClickedDemandOnly(String instanceId);

    void onInterstitialAdClosed();

    void onInterstitialAdClosedDemandOnly(String instanceId);

    void onInterstitialAdLoadFailed(String error);

    void onInterstitialAdLoadFailedDemandOnly(String params);

    void onInterstitialAdOpened();

    void onInterstitialAdOpenedDemandOnly(String instanceId);

    void onInterstitialAdReady();

    void onInterstitialAdReadyDemandOnly(String instanceId);

    void onInterstitialAdRewarded();

    void onInterstitialAdShowFailed(String error);

    void onInterstitialAdShowFailedDemandOnly(String params);

    void onInterstitialAdShowSucceeded();
}
