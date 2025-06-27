package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView;

/* compiled from: PressButtonInteract.java */
/* loaded from: classes2.dex */
public class tsL implements VwS {
    private PressButtonInteractView EYQ;

    public tsL(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this.EYQ = new PressButtonInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.EYQ.setLayoutParams(layoutParams);
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
    public PressButtonInteractView Td() {
        return this.EYQ;
    }
}
