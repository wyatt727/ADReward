package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGAppOpenAdWrapper.java */
/* loaded from: classes2.dex */
public class Kbd implements com.bytedance.sdk.openadsdk.apiImpl.Td.mZx {
    private final PAGAppOpenAdInteractionListener EYQ;
    private final AtomicBoolean mZx = new AtomicBoolean(false);

    public Kbd(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.EYQ = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.Td.mZx
    public void EYQ() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.EYQ;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.EYQ;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.Td.mZx
    public void mZx() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.EYQ;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.Td.mZx
    public void Td() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.mZx.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.EYQ) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
