package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUp3DView;

/* compiled from: SlideUp3DInteract.java */
/* loaded from: classes2.dex */
public class hu implements VwS<SlideUp3DView> {
    private SlideUp3DView EYQ;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.VwS Pm;
    private DynamicBaseWidget Td;
    private Context mZx;

    public hu(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this.mZx = context;
        this.Td = dynamicBaseWidget;
        this.Pm = vwS;
        Pm();
    }

    protected void Pm() {
        this.EYQ = new SlideUp3DView(this.mZx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, 250.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, 120.0f);
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setGuideText(this.Pm.OtA());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        this.EYQ.mZx();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        this.EYQ.Td();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    /* renamed from: Kbd, reason: merged with bridge method [inline-methods] */
    public SlideUp3DView Td() {
        return this.EYQ;
    }
}
