package com.json.mediationsdk.demandOnly;

import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public interface ISDemandOnlyRewardedVideoListener {
    void onRewardedVideoAdClicked(String str);

    void onRewardedVideoAdClosed(String str);

    void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError);

    void onRewardedVideoAdLoadSuccess(String str);

    void onRewardedVideoAdOpened(String str);

    void onRewardedVideoAdRewarded(String str);

    void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError);
}
