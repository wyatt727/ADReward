package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: LightInteract.java */
/* loaded from: classes2.dex */
public class tp implements VwS<ViewGroup> {
    private final DynamicLottieView EYQ;
    private final FrameLayout mZx;

    public tp(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS, String str) {
        DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
        this.EYQ = dynamicLottieView;
        dynamicLottieView.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.mZx = frameLayout;
        frameLayout.addView(dynamicLottieView, new FrameLayout.LayoutParams(-2, -2));
        double dVEW = vwS.VEW();
        dVEW = dVEW == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : dVEW;
        double dDd = vwS.Dd();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * dVEW), (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * (dDd != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dDd : 1.0d)));
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        this.EYQ.IPb();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        this.EYQ.Pm();
        ViewParent parent = this.mZx.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.mZx);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public ViewGroup Td() {
        return this.mZx;
    }
}
