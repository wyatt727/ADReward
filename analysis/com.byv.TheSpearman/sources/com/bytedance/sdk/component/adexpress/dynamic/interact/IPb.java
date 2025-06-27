package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.ShakeClickView;

/* compiled from: ClickSlideUpShakeInteract.java */
/* loaded from: classes2.dex */
public class IPb extends UB<ClickSlideUpShakeView> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.UB
    protected void Pm() {
    }

    public IPb(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS, int i, int i2, int i3) {
        super(context, dynamicBaseWidget, vwS);
        this.mZx = context;
        this.Pm = vwS;
        this.Td = dynamicBaseWidget;
        EYQ(i, i2, i3, vwS);
    }

    private void EYQ(int i, int i2, int i3, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        int iWa;
        this.EYQ = new ClickSlideUpShakeView(this.mZx, i, i2, i3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.mZx;
        if (vwS.wa() > 0) {
            iWa = vwS.wa();
        } else {
            iWa = com.bytedance.sdk.component.adexpress.Pm.mZx() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, iWa);
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setClipChildren(false);
        this.EYQ.setSlideText(this.Pm.OtA());
        if (this.EYQ instanceof ClickSlideUpShakeView) {
            ((ClickSlideUpShakeView) this.EYQ).setShakeText(this.Pm.VOV());
            final ShakeClickView shakeView = ((ClickSlideUpShakeView) this.EYQ).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new ShakeAnimationView.EYQ() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.IPb.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.Td.getDynamicClickListener());
            }
        }
    }
}
