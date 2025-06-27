package com.bytedance.sdk.openadsdk.api.banner;

import com.google.android.gms.nearby.messages.Strategy;

/* loaded from: classes2.dex */
public final class PAGBannerSize {
    private final int EYQ;
    private final int mZx;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(Strategy.TTL_SECONDS_DEFAULT, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.EYQ = i;
        this.mZx = i2;
    }

    public int getWidth() {
        return this.EYQ;
    }

    public int getHeight() {
        return this.mZx;
    }
}
