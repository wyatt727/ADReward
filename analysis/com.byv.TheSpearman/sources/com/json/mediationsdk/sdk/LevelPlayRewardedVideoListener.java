package com.json.mediationsdk.sdk;

import com.json.mediationsdk.adunit.adapter.utility.AdInfo;

/* loaded from: classes4.dex */
public interface LevelPlayRewardedVideoListener extends LevelPlayRewardedVideoBaseListener {
    void onAdAvailable(AdInfo adInfo);

    void onAdUnavailable();
}
