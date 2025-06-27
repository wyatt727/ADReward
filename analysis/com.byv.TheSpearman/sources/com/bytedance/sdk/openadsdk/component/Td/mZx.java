package com.bytedance.sdk.openadsdk.component.Td;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PAGInterstitialProxyListener.java */
/* loaded from: classes2.dex */
public class mZx implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener EYQ;

    public mZx(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.EYQ = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
    public void onError(final int i, final String str) {
        if (this.EYQ != null) {
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.Td.mZx.1
                @Override // java.lang.Runnable
                public void run() {
                    if (mZx.this.EYQ != null) {
                        mZx.this.EYQ.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.EYQ != null) {
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.Td.mZx.2
                @Override // java.lang.Runnable
                public void run() {
                    if (mZx.this.EYQ != null) {
                        mZx.this.EYQ.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
