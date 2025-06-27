package com.json.unity.androidbridge;

/* loaded from: classes4.dex */
public interface UnityRewardedVideoListener {
    void onRewardedVideoAdClicked(String placement);

    void onRewardedVideoAdClickedDemandOnly(String instanceId);

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdClosedDemandOnly(String instanceId);

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdLoadFailedDemandOnly(String instanceId);

    void onRewardedVideoAdLoadedDemandOnly(String instanceId);

    void onRewardedVideoAdOpened();

    void onRewardedVideoAdOpenedDemandOnly(String instanceId);

    void onRewardedVideoAdRewarded(String placement);

    void onRewardedVideoAdRewardedDemandOnly(String instanceId);

    void onRewardedVideoAdShowFailed(String error);

    void onRewardedVideoAdShowFailedDemandOnly(String instanceId);

    void onRewardedVideoAdStarted();

    void onRewardedVideoAvailabilityChanged(String isAvailable);
}
