package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PAGNativeAdLoadListenerAdapter.java */
/* loaded from: classes2.dex */
public class Kbd implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener EYQ;

    public Kbd(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.EYQ = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
    public void onError(final int i, final String str) {
        if (this.EYQ == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Kbd.1
            @Override // java.lang.Runnable
            public void run() {
                Kbd.this.EYQ.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Kbd.2
            @Override // java.lang.Runnable
            public void run() {
                Kbd.this.EYQ.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
