package com.json.mediationsdk.demandOnly;

import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public interface ISDemandOnlyInterstitialListener {
    void onInterstitialAdClicked(String str);

    void onInterstitialAdClosed(String str);

    void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError);

    void onInterstitialAdOpened(String str);

    void onInterstitialAdReady(String str);

    void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError);
}
