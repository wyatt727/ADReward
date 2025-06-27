package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

/* loaded from: classes.dex */
public interface MaxRewardedAdapterListener extends MaxAdapterListener {

    /* renamed from: com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$onRewardedAdVideoCompleted(MaxRewardedAdapterListener _this) {
        }

        @Deprecated
        public static void $default$onRewardedAdVideoStarted(MaxRewardedAdapterListener _this) {
        }
    }

    void onRewardedAdClicked();

    void onRewardedAdClicked(Bundle bundle);

    void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    void onRewardedAdDisplayed();

    void onRewardedAdDisplayed(Bundle bundle);

    void onRewardedAdHidden();

    void onRewardedAdHidden(Bundle bundle);

    void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError);

    void onRewardedAdLoaded();

    void onRewardedAdLoaded(Bundle bundle);

    @Deprecated
    void onRewardedAdVideoCompleted();

    @Deprecated
    void onRewardedAdVideoStarted();

    void onUserRewarded(MaxReward maxReward);

    void onUserRewarded(MaxReward maxReward, Bundle bundle);
}
