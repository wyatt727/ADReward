package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: TTRewardVideoAdImpl.java */
/* loaded from: classes2.dex */
class KO implements TTClientBidding {
    private final QQ EYQ;

    KO(Context context, com.bytedance.sdk.openadsdk.core.model.EYQ eyq, AdSlot adSlot) {
        this.EYQ = new QQ(context, eyq, adSlot);
    }

    public QQ EYQ() {
        return this.EYQ;
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
