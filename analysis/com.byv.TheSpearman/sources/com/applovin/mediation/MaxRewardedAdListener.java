package com.applovin.mediation;

/* loaded from: classes.dex */
public interface MaxRewardedAdListener extends MaxAdListener {

    /* renamed from: com.applovin.mediation.MaxRewardedAdListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$onRewardedVideoCompleted(MaxRewardedAdListener _this, MaxAd maxAd) {
        }

        @Deprecated
        public static void $default$onRewardedVideoStarted(MaxRewardedAdListener _this, MaxAd maxAd) {
        }
    }

    @Deprecated
    void onRewardedVideoCompleted(MaxAd maxAd);

    @Deprecated
    void onRewardedVideoStarted(MaxAd maxAd);

    void onUserRewarded(MaxAd maxAd, MaxReward maxReward);
}
