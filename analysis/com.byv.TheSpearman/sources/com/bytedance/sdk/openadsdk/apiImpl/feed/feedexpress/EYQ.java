package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;

/* compiled from: PAGFeedExpressVideoView.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx {
    public EYQ(Context context, UB ub, AdSlot adSlot) {
        super(context, ub, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx
    protected void EYQ() {
        this.tp = new NativeExpressVideoView(this.QQ, this.mZx, this.HX, this.MxO);
        this.EYQ.EYQ(((NativeExpressVideoView) this.tp).getVideoController());
        Td();
    }

    public com.bytedance.sdk.openadsdk.multipro.mZx.EYQ mZx() {
        if (this.tp != null) {
            return ((NativeExpressVideoView) this.tp).getVideoModel();
        }
        return null;
    }
}
