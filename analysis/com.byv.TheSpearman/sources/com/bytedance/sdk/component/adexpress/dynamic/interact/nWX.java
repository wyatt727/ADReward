package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import org.json.JSONObject;

/* compiled from: ShakeInteract.java */
/* loaded from: classes2.dex */
public class nWX implements VwS<ShakeAnimationView> {
    private ShakeAnimationView EYQ;
    private int IPb;
    private String Kbd;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.VwS Pm;
    private int QQ;
    private DynamicBaseWidget Td;
    private int VwS;
    private Context mZx;

    public nWX(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS, String str, int i, int i2, int i3) {
        this.mZx = context;
        this.Td = dynamicBaseWidget;
        this.Pm = vwS;
        this.Kbd = str;
        this.IPb = i;
        this.VwS = i2;
        this.QQ = i3;
        Kbd();
    }

    private void Kbd() {
        final com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ dynamicClickListener = this.Td.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.Kbd)) {
            Context context = this.mZx;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, com.bytedance.sdk.component.adexpress.Td.EYQ.HX(context), this.IPb, this.VwS, this.QQ);
            this.EYQ = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.EYQ.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.mZx;
            this.EYQ = new ShakeAnimationView(context2, com.bytedance.sdk.component.adexpress.Td.EYQ.QQ(context2), this.IPb, this.VwS, this.QQ);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.EYQ.setGravity(17);
        layoutParams.gravity = 17;
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setTranslationY(com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, this.Pm.OnO()));
        this.EYQ.setShakeText(this.Pm.OtA());
        this.EYQ.setClipChildren(false);
        this.EYQ.setOnShakeViewListener(new ShakeAnimationView.EYQ() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.nWX.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        this.EYQ.EYQ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        this.EYQ.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    /* renamed from: Pm, reason: merged with bridge method [inline-methods] */
    public ShakeAnimationView Td() {
        return this.EYQ;
    }
}
