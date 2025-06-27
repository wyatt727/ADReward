package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PAGNativeFeedAdWrapperListenerImpl.java */
/* loaded from: classes2.dex */
public class VwS implements IPb {
    private final PAGNativeAdInteractionListener EYQ;

    public VwS(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.EYQ = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.VwS.1
            @Override // java.lang.Runnable
            public void run() {
                if (VwS.this.EYQ != null) {
                    VwS.this.EYQ.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.IPb
    public void EYQ(PAGNativeAd pAGNativeAd) {
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.VwS.2
            @Override // java.lang.Runnable
            public void run() {
                if (VwS.this.EYQ != null) {
                    VwS.this.EYQ.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.IPb
    public void EYQ() {
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.VwS.3
            @Override // java.lang.Runnable
            public void run() {
                if (VwS.this.EYQ != null) {
                    VwS.this.EYQ.onAdDismissed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.IPb
    public boolean mZx() {
        return this.EYQ != null;
    }
}
