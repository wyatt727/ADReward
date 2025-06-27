package com.json.mediationsdk.sdk;

import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.Placement;

@Deprecated
/* loaded from: classes4.dex */
public interface RewardedVideoListener {
    @Deprecated
    void onRewardedVideoAdClicked(Placement placement);

    @Deprecated
    void onRewardedVideoAdClosed();

    @Deprecated
    void onRewardedVideoAdEnded();

    @Deprecated
    void onRewardedVideoAdOpened();

    @Deprecated
    void onRewardedVideoAdRewarded(Placement placement);

    @Deprecated
    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    @Deprecated
    void onRewardedVideoAdStarted();

    @Deprecated
    void onRewardedVideoAvailabilityChanged(boolean z);
}
