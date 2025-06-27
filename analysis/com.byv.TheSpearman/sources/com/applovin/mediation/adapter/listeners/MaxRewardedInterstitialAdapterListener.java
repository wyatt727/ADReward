package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

/* loaded from: classes.dex */
public interface MaxRewardedInterstitialAdapterListener extends MaxAdapterListener {

    /* renamed from: com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$onRewardedInterstitialAdVideoCompleted(MaxRewardedInterstitialAdapterListener _this) {
        }

        @Deprecated
        public static void $default$onRewardedInterstitialAdVideoStarted(MaxRewardedInterstitialAdapterListener _this) {
        }
    }

    void onRewardedInterstitialAdClicked();

    void onRewardedInterstitialAdClicked(Bundle bundle);

    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    void onRewardedInterstitialAdDisplayed();

    void onRewardedInterstitialAdDisplayed(Bundle bundle);

    void onRewardedInterstitialAdHidden();

    void onRewardedInterstitialAdHidden(Bundle bundle);

    void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdLoaded();

    void onRewardedInterstitialAdLoaded(Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdVideoCompleted();

    @Deprecated
    void onRewardedInterstitialAdVideoStarted();

    void onUserRewarded(MaxReward maxReward);

    void onUserRewarded(MaxReward maxReward, Bundle bundle);
}
