package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.BluePressInteractView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: BluePressInteract.java */
/* loaded from: classes2.dex */
public class EYQ implements VwS {
    private BluePressInteractView EYQ;

    public EYQ(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        double dVEW = vwS.VEW();
        dVEW = dVEW == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : dVEW;
        double dDd = vwS.Dd();
        int dynamicWidth = (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * dVEW);
        int dynamicWidth2 = (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * (dDd != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dDd : 1.0d));
        this.EYQ = new BluePressInteractView(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, vwS.GfQ() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(context, vwS.by() - 3);
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
    public ViewGroup Td() {
        return this.EYQ;
    }
}
