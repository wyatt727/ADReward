package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: TTFullScreenVideoAdImpl.java */
/* loaded from: classes2.dex */
class nWX implements TTClientBidding {
    private final IPb EYQ;

    nWX(Context context, com.bytedance.sdk.openadsdk.core.model.EYQ eyq) {
        this.EYQ = new IPb(context, eyq);
    }

    public IPb EYQ() {
        return this.EYQ;
    }

    public void EYQ(boolean z) {
        this.EYQ.EYQ(z);
    }

    public void mZx() {
        this.EYQ.EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.EYQ.win(d);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.EYQ.loss(d, str, str2);
    }
}
