package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;

/* compiled from: BrushMaskInteract.java */
/* loaded from: classes2.dex */
public class mZx implements VwS<DynamicBrushMaskView> {
    private DynamicBrushMaskView EYQ;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
    }

    public mZx(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        int iWa;
        this.EYQ = new DynamicBrushMaskView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (vwS.wa() > 0) {
            iWa = vwS.wa();
        } else {
            iWa = com.bytedance.sdk.component.adexpress.Pm.mZx() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, iWa);
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setClipChildren(false);
        this.EYQ.setBrushText(vwS.OtA());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        DynamicBrushMaskView dynamicBrushMaskView = this.EYQ;
        if (dynamicBrushMaskView != null) {
            dynamicBrushMaskView.mZx();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    /* renamed from: Pm, reason: merged with bridge method [inline-methods] */
    public DynamicBrushMaskView Td() {
        return this.EYQ;
    }
}
