package com.json.mediationsdk.sdk;

import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public interface LevelPlayBannerListener {
    void onAdClicked(AdInfo adInfo);

    void onAdLeftApplication(AdInfo adInfo);

    void onAdLoadFailed(IronSourceError ironSourceError);

    void onAdLoaded(AdInfo adInfo);

    void onAdScreenDismissed(AdInfo adInfo);

    void onAdScreenPresented(AdInfo adInfo);
}
