package com.json.mediationsdk.sdk;

import com.json.mediationsdk.logger.IronSourceError;

@Deprecated
/* loaded from: classes4.dex */
public interface RewardedVideoManualListener extends RewardedVideoListener {
    @Deprecated
    void onRewardedVideoAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onRewardedVideoAdReady();
}
