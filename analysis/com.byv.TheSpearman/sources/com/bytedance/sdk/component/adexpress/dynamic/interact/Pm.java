package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;

/* compiled from: ClickSlideUpInteract.java */
/* loaded from: classes2.dex */
public class Pm extends UB<ClickSlideUpView> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.UB
    protected void Pm() {
    }

    public Pm(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        super(context, dynamicBaseWidget, vwS);
        EYQ(vwS);
    }

    private void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this.EYQ = new ClickSlideUpView(this.mZx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, vwS.wa());
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setSlideText(this.Pm.OtA());
        if (this.EYQ instanceof ClickSlideUpView) {
            ((ClickSlideUpView) this.EYQ).setButtonText(this.Pm.tp());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.UB, com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        this.EYQ.EYQ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.UB, com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        this.EYQ.mZx();
    }
}
