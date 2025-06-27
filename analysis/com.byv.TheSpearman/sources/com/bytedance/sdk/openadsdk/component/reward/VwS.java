package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PAGRewardProxyListener.java */
/* loaded from: classes2.dex */
public class VwS implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener EYQ;

    public VwS(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.EYQ = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
    public void onError(final int i, final String str) {
        if (this.EYQ != null) {
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.VwS.1
                @Override // java.lang.Runnable
                public void run() {
                    if (VwS.this.EYQ != null) {
                        VwS.this.EYQ.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.EYQ != null) {
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.VwS.2
                @Override // java.lang.Runnable
                public void run() {
                    if (VwS.this.EYQ != null) {
                        VwS.this.EYQ.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
