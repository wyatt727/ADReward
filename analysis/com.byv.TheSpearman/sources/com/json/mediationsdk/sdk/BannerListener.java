package com.json.mediationsdk.sdk;

import com.json.mediationsdk.logger.IronSourceError;

@Deprecated
/* loaded from: classes4.dex */
public interface BannerListener {
    @Deprecated
    void onBannerAdClicked();

    @Deprecated
    void onBannerAdLeftApplication();

    @Deprecated
    void onBannerAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onBannerAdLoaded();

    @Deprecated
    void onBannerAdScreenDismissed();

    @Deprecated
    void onBannerAdScreenPresented();
}
