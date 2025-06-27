package com.json.mediationsdk.sdk;

import com.json.mediationsdk.logger.IronSourceError;

@Deprecated
/* loaded from: classes4.dex */
public interface InterstitialListener {
    @Deprecated
    void onInterstitialAdClicked();

    @Deprecated
    void onInterstitialAdClosed();

    @Deprecated
    void onInterstitialAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onInterstitialAdOpened();

    @Deprecated
    void onInterstitialAdReady();

    @Deprecated
    void onInterstitialAdShowFailed(IronSourceError ironSourceError);

    @Deprecated
    void onInterstitialAdShowSucceeded();
}
