package com.bytedance.sdk.openadsdk.component.Td;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* compiled from: PAGInterstitialAdWrapper.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx {
    private final PAGInterstitialAdInteractionListener EYQ;

    public EYQ(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.EYQ = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx
    public void EYQ() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.EYQ;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx
    public void mZx() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.EYQ;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.EYQ;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
