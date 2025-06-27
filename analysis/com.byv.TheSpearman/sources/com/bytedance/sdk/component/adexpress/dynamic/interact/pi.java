package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* compiled from: PressInteract.java */
/* loaded from: classes2.dex */
public class pi implements VwS<PressInteractView> {
    private PressInteractView EYQ;

    public pi(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this.EYQ = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, 20.0f);
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
    /* renamed from: Pm, reason: merged with bridge method [inline-methods] */
    public PressInteractView Td() {
        return this.EYQ;
    }
}
