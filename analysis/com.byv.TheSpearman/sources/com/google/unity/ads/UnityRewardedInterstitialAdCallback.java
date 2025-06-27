package com.google.unity.ads;

import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes4.dex */
public interface UnityRewardedInterstitialAdCallback extends UnityPaidEventListener, UnityFullScreenContentCallback {
    void onRewardedInterstitialAdFailedToLoad(LoadAdError error);

    void onRewardedInterstitialAdLoaded();

    void onUserEarnedReward(String type, float amount);
}
