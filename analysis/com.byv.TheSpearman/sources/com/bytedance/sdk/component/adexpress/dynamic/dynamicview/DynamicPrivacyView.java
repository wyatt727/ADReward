package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;

/* loaded from: classes2.dex */
public class DynamicPrivacyView extends DynamicBaseWidgetImp {
    private TextView EYQ;
    private LinearLayout NZ;
    private TextView WU;
    private TextView XN;
    private TextView mZx;
    private TextView zF;

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.EYQ = new TextView(this.MxO);
        this.mZx = new TextView(this.MxO);
        this.zF = new TextView(this.MxO);
        this.NZ = new LinearLayout(this.MxO);
        this.WU = new TextView(this.MxO);
        this.XN = new TextView(this.MxO);
        this.EYQ.setTag(9);
        this.mZx.setTag(10);
        this.zF.setTag(12);
        this.NZ.addView(this.zF);
        this.NZ.addView(this.XN);
        this.NZ.addView(this.mZx);
        this.NZ.addView(this.WU);
        this.NZ.addView(this.EYQ);
        addView(this.NZ, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected boolean Pm() {
        this.EYQ.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.EYQ.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.mZx.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.mZx.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.zF.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.zF.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.VwS, this.QQ);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        this.zF.setText("Function");
        this.mZx.setText("Permission list");
        this.WU.setText(" | ");
        this.XN.setText(" | ");
        this.EYQ.setText("Privacy policy");
        if (this.tsL != null) {
            this.zF.setTextColor(this.tsL.VwS());
            this.zF.setTextSize(this.tsL.Kbd());
            this.mZx.setTextColor(this.tsL.VwS());
            this.mZx.setTextSize(this.tsL.Kbd());
            this.WU.setTextColor(this.tsL.VwS());
            this.XN.setTextColor(this.tsL.VwS());
            this.EYQ.setTextColor(this.tsL.VwS());
            this.EYQ.setTextSize(this.tsL.Kbd());
            return false;
        }
        this.zF.setTextColor(-1);
        this.zF.setTextSize(12.0f);
        this.mZx.setTextColor(-1);
        this.mZx.setTextSize(12.0f);
        this.WU.setTextColor(-1);
        this.XN.setTextColor(-1);
        this.EYQ.setTextColor(-1);
        this.EYQ.setTextSize(12.0f);
        return false;
    }
}
