package com.bytedance.sdk.openadsdk.core.ugen.component.video;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* compiled from: UGVideoPlaceholderWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends com.bytedance.adsdk.ugeno.component.EYQ.EYQ {
    public EYQ(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: Uc, reason: merged with bridge method [inline-methods] */
    public UGVideoPlaceholderView Td() {
        UGVideoPlaceholderView uGVideoPlaceholderView = new UGVideoPlaceholderView(this.mZx);
        uGVideoPlaceholderView.EYQ(this);
        return uGVideoPlaceholderView;
    }

    public UGFrameLayout hYh() {
        return ((UGVideoPlaceholderView) this.Kbd).getVideoView();
    }

    @Override // com.bytedance.adsdk.ugeno.component.EYQ.EYQ, com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        super.EYQ(str, str2);
    }

    @Override // com.bytedance.adsdk.ugeno.component.EYQ.EYQ, com.bytedance.adsdk.ugeno.component.EYQ, com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
    }
}
