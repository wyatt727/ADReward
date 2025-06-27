package com.bytedance.sdk.openadsdk.apiImpl.Td;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: PAGAppOpenAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class EYQ implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener EYQ;

    public EYQ(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.EYQ = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
    public void onError(final int i, final String str) {
        if (this.EYQ == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Td.EYQ.1
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
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Td.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
