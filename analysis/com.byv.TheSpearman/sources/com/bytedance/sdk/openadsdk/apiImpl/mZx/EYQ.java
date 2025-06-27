package com.bytedance.sdk.openadsdk.apiImpl.mZx;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PAGInterstitialAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class EYQ implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener EYQ;

    public EYQ(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.EYQ = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
    public void onError(final int i, final String str) {
        if (this.EYQ == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.mZx.EYQ.1
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.mZx.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
