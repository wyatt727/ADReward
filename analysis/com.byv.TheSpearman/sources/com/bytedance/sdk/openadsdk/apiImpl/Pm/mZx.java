package com.bytedance.sdk.openadsdk.apiImpl.Pm;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PARewardedAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class mZx implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener EYQ;

    public mZx(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.EYQ = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
    public void onError(final int i, final String str) {
        if (this.EYQ == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Pm.mZx.1
            @Override // java.lang.Runnable
            public void run() {
                if (mZx.this.EYQ != null) {
                    mZx.this.EYQ.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Pm.mZx.2
            @Override // java.lang.Runnable
            public void run() {
                if (mZx.this.EYQ != null) {
                    mZx.this.EYQ.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
