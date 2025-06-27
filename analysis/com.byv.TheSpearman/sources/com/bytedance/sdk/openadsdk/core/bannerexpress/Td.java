package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: PAGBannerVideoAdImpl.java */
/* loaded from: classes2.dex */
public class Td extends EYQ {
    public Td(Context context, UB ub, AdSlot adSlot) {
        super(context, ub, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ
    public void EYQ(Context context, UB ub, AdSlot adSlot) {
        this.EYQ = new BannerExpressVideoView(context, ub, adSlot);
        this.EYQ.addOnAttachStateChangeListener(this.IPb);
    }

    public com.bytedance.sdk.openadsdk.multipro.mZx.EYQ Td() {
        if (this.EYQ != null) {
            return ((BannerExpressVideoView) this.EYQ).getVideoModel();
        }
        return null;
    }
}
