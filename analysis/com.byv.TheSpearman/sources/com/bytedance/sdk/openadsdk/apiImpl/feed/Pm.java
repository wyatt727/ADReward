package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: PAGNativeAdDataImpl.java */
/* loaded from: classes2.dex */
public class Pm implements PAGNativeAdData {
    private final EYQ EYQ;

    public Pm(EYQ eyq) {
        this.EYQ = eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        EYQ eyq = this.EYQ;
        if (eyq != null) {
            return eyq.Td();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        EYQ eyq = this.EYQ;
        if (eyq != null) {
            return eyq.Pm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        EYQ eyq = this.EYQ;
        if (eyq != null) {
            return eyq.Kbd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        EYQ eyq = this.EYQ;
        if (eyq != null) {
            return eyq.IPb();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        EYQ eyq = this.EYQ;
        if (eyq != null) {
            return eyq.VwS();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        EYQ eyq = this.EYQ;
        if (eyq != null) {
            return eyq.tp();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (UB.Kbd(this.EYQ.EYQ)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        EYQ eyq = this.EYQ;
        if (eyq != null) {
            return eyq.MxO();
        }
        return null;
    }
}
