package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.component.EYQ;
import com.bytedance.adsdk.ugeno.component.frame.EYQ;

/* compiled from: UGScrollLayoutWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends com.bytedance.adsdk.ugeno.component.EYQ<ScrollView> {
    public EYQ(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: Uc, reason: merged with bridge method [inline-methods] */
    public ScrollView Td() {
        UGScrollView uGScrollView = new UGScrollView(this.mZx);
        uGScrollView.EYQ(this);
        return uGScrollView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.EYQ
    public EYQ.C0075EYQ QQ() {
        return new EYQ.C0076EYQ();
    }
}
