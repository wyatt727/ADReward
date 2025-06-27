package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView;

/* compiled from: UnlockInteract.java */
/* loaded from: classes2.dex */
public class Uc implements VwS<DynamicUnlockView> {
    private final DynamicUnlockView EYQ;

    public Uc(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        int iWa;
        DynamicUnlockView dynamicUnlockView = new DynamicUnlockView(context);
        this.EYQ = dynamicUnlockView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (vwS.wa() > 0) {
            iWa = vwS.wa();
        } else {
            iWa = com.bytedance.sdk.component.adexpress.Pm.mZx() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, iWa);
        dynamicUnlockView.setLayoutParams(layoutParams);
        dynamicUnlockView.setClipChildren(false);
        dynamicUnlockView.setText(vwS.OtA());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        DynamicUnlockView dynamicUnlockView = this.EYQ;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.EYQ();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        DynamicUnlockView dynamicUnlockView = this.EYQ;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.mZx();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    /* renamed from: Pm, reason: merged with bridge method [inline-methods] */
    public DynamicUnlockView Td() {
        return this.EYQ;
    }
}
