package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* compiled from: SlideUpInteract.java */
/* loaded from: classes2.dex */
public class UB<E extends SlideUpView> implements VwS<E> {
    protected SlideUpView EYQ;
    protected int Kbd;
    protected com.bytedance.sdk.component.adexpress.dynamic.Td.VwS Pm;
    protected DynamicBaseWidget Td;
    protected Context mZx;

    public UB(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS, int i) {
        this.Kbd = i;
        this.mZx = context;
        this.Td = dynamicBaseWidget;
        this.Pm = vwS;
        Pm();
    }

    public UB(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        this(context, dynamicBaseWidget, vwS, 0);
    }

    protected void Pm() {
        this.EYQ = new SlideUpView(this.mZx, this.Pm.lRN());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, 100 - this.Kbd);
        this.EYQ.setLayoutParams(layoutParams);
        try {
            this.EYQ.setGuideText(this.Pm.OtA());
        } catch (Throwable unused) {
        }
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
    /* renamed from: Kbd, reason: merged with bridge method [inline-methods] */
    public E Td() {
        return (E) this.EYQ;
    }
}
