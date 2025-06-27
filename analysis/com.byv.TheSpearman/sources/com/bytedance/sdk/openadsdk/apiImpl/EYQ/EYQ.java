package com.bytedance.sdk.openadsdk.apiImpl.EYQ;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PAGBannerAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class EYQ implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener EYQ;

    public EYQ(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.EYQ = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
    public void onError(final int i, final String str) {
        if (this.EYQ == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ.1
            @Override // java.lang.Runnable
            public void run() {
                EYQ.this.EYQ.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                EYQ.this.EYQ.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
