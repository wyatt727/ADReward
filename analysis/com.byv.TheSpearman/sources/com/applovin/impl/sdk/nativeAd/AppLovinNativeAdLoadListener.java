package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;

/* loaded from: classes.dex */
public interface AppLovinNativeAdLoadListener {
    void onNativeAdLoadFailed(AppLovinError appLovinError);

    void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd);
}
