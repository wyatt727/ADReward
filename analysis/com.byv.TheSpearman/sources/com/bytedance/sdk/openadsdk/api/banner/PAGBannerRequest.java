package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes2.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize EYQ;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.EYQ = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.EYQ;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.EYQ = pAGBannerSize;
    }
}
