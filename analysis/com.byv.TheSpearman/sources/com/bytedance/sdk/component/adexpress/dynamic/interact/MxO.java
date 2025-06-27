package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* compiled from: LongPressInteract.java */
/* loaded from: classes2.dex */
public class MxO implements VwS {
    private HandLongPressView EYQ;

    public MxO(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this.EYQ = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, 180.0f));
        layoutParams.gravity = 17;
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setGuideText(vwS.OtA());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        this.EYQ.EYQ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        this.EYQ.mZx();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public ViewGroup Td() {
        return this.EYQ;
    }
}
