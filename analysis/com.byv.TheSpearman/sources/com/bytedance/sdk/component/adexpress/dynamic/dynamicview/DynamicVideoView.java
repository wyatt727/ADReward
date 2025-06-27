package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;

/* loaded from: classes2.dex */
public class DynamicVideoView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.Kbd {
    TextView EYQ;
    FrameLayout mZx;
    boolean zF;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean Kbd() {
        return true;
    }

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.zF = false;
        this.KO = new View(context);
        this.KO.setTag(Integer.valueOf(getClickArea()));
        this.EYQ = new TextView(context);
        this.mZx = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) IPb.EYQ(context, 40.0f), (int) IPb.EYQ(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.EYQ.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.EYQ.setBackground(gradientDrawable);
        this.EYQ.setTextSize(10.0f);
        this.EYQ.setGravity(17);
        this.EYQ.setTextColor(-1);
        this.EYQ.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            addView(this.mZx, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.EYQ);
        addView(this.KO, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            addView(this.mZx, getWidgetLayoutParams());
        }
        dynamicRootView.Td = this.mZx;
        dynamicRootView.setVideoListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        double dVwS = 0.0d;
        double dIPb = 0.0d;
        for (QQ qqTsL = this.pi; qqTsL != null; qqTsL = qqTsL.tsL()) {
            dIPb = (dIPb + qqTsL.IPb()) - qqTsL.Pm();
            dVwS = (dVwS + qqTsL.VwS()) - qqTsL.Kbd();
        }
        try {
            float f = (float) dIPb;
            int iEYQ = (int) IPb.EYQ(getContext(), f);
            int iEYQ2 = (int) IPb.EYQ(getContext(), f + this.Kbd);
            if (com.bytedance.sdk.component.adexpress.Pm.mZx.EYQ(getContext())) {
                DynamicRoot dynamicRoot = (DynamicRoot) this.nWX.getChildAt(0);
                int dynamicWidth = dynamicRoot.getDynamicWidth();
                int i = dynamicWidth - iEYQ2;
                iEYQ2 = dynamicWidth - iEYQ;
                iEYQ = i;
            }
            if (!"open_ad".equals(this.nWX.getRenderRequest().Pm())) {
                DynamicRoot dynamicRoot2 = (DynamicRoot) this.nWX.getChildAt(0);
                float f2 = (float) dVwS;
                dynamicRoot2.EYQ.EYQ(iEYQ, (int) IPb.EYQ(getContext(), f2), iEYQ2, (int) IPb.EYQ(getContext(), f2 + this.IPb));
            } else {
                this.nWX.Td = this.mZx;
            }
        } catch (Exception unused) {
        }
        this.nWX.EYQ(dIPb, dVwS, this.Kbd, this.IPb, this.tsL.KO());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Kbd
    public void setTimeUpdate(int i) {
        if (this.pi.tp().Kbd().dbE() && i > 0 && !this.zF) {
            String str = (i >= 60 ? "0" + (i / 60) : "00") + ":";
            int i2 = i % 60;
            this.EYQ.setText(i2 > 9 ? str + i2 : str + "0" + i2);
            this.EYQ.setVisibility(0);
            return;
        }
        this.zF = true;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            Td(getChildAt(i3));
        }
        this.EYQ.setVisibility(8);
    }

    private void Td(View view) {
        if (view == this.EYQ || view == this.hYh) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.IPb)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            Td(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Kbd
    public void EYQ() {
        this.EYQ.setVisibility(8);
    }
}
