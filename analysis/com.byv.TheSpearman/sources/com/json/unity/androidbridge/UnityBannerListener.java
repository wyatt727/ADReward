package com.json.unity.androidbridge;

/* loaded from: classes4.dex */
public interface UnityBannerListener {
    void onBannerAdClicked();

    void onBannerAdLeftApplication();

    void onBannerAdLoadFailed(String Error);

    void onBannerAdLoaded();

    void onBannerAdScreenDismissed();

    void onBannerAdScreenPresented();
}
