package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* compiled from: SlideRightInteract.java */
/* loaded from: classes2.dex */
public class KO implements VwS {
    private SlideRightView EYQ;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.VwS Pm;
    private DynamicBaseWidget Td;
    private Context mZx;

    public KO(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this.mZx = context;
        this.Td = dynamicBaseWidget;
        this.Pm = vwS;
        Pm();
    }

    private void Pm() {
        this.EYQ = new SlideRightView(this.mZx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, 120.0f));
        layoutParams.gravity = 17;
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setClipChildren(false);
        this.EYQ.setGuideText(this.Pm.OtA());
        DynamicBaseWidget dynamicBaseWidget = this.Td;
        if (dynamicBaseWidget != null) {
            this.EYQ.setOnClickListener((View.OnClickListener) dynamicBaseWidget.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        SlideRightView slideRightView = this.EYQ;
        if (slideRightView != null) {
            slideRightView.EYQ();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        SlideRightView slideRightView = this.EYQ;
        if (slideRightView != null) {
            slideRightView.mZx();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public ViewGroup Td() {
        return this.EYQ;
    }
}
