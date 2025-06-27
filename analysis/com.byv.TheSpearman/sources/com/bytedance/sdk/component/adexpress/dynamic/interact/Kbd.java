package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView2;

/* compiled from: ClickSlideUpInteract2.java */
/* loaded from: classes2.dex */
public class Kbd extends UB<ClickSlideUpView> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.UB
    protected void Pm() {
    }

    public Kbd(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        super(context, dynamicBaseWidget, vwS);
        EYQ(vwS);
    }

    private void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this.EYQ = new ClickSlideUpView2(this.mZx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.EYQ.setLayoutParams(layoutParams);
        if (this.EYQ instanceof ClickSlideUpView2) {
            ((ClickSlideUpView2) this.EYQ).setButtonText(this.Pm.OtA());
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
