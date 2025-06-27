package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTInteractionStyle009016VLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle009016VLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle009016VLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle009016VLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void EYQ(Context context) {
        int iMZx = tr.mZx(context, 10.0f);
        int iMZx2 = tr.mZx(context, 5.0f);
        int iMZx3 = tr.mZx(context, 16.0f);
        int iMZx4 = tr.mZx(context, 15.0f);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGRelativeLayout.setLayoutParams(layoutParams);
        addView(pAGRelativeLayout);
        this.EYQ = Kbd(context);
        this.EYQ.setId(tp.PP);
        this.EYQ.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.EYQ);
        this.mZx = IPb(context);
        this.mZx.setId(tp.VQ);
        this.mZx.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.mZx);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        pAGRelativeLayout2.setId(tp.sOZ);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, tr.mZx(context, 60.0f));
        layoutParams2.addRule(12);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#26000000"));
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        this.Td = VwS(context);
        this.Td.setId(tp.oIw);
        int iMZx5 = tr.mZx(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iMZx5, iMZx5);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.addRule(20);
        }
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iMZx4;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(iMZx4);
        }
        this.Td.setLayoutParams(layoutParams3);
        pAGRelativeLayout2.addView(this.Td);
        this.Pm = mZx(context);
        this.Pm.setId(tp.Rd);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iMZx2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart(iMZx2);
        }
        layoutParams4.addRule(1, tp.oIw);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.addRule(17, tp.oIw);
        }
        this.Pm.setLayoutParams(layoutParams4);
        pAGRelativeLayout2.addView(this.Pm);
        this.IPb = Pm(context);
        this.IPb.setId(tp.zzY);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(tr.mZx(context, 70.0f), tr.mZx(context, 36.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.addRule(21);
        }
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = iMZx4;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginEnd(iMZx4);
        }
        this.IPb.setLayoutParams(layoutParams5);
        pAGRelativeLayout2.addView(this.IPb);
        View viewQQ = QQ(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, tp.sOZ);
        layoutParams6.leftMargin = iMZx3;
        layoutParams6.bottomMargin = iMZx;
        viewQQ.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(viewQQ);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView Pm(Context context) {
        PAGTextView pAGTextViewPm = super.Pm(context);
        pAGTextViewPm.setBackground(VwS.EYQ(context, "tt_download_corner_bg"));
        pAGTextViewPm.setTextSize(2, 14.0f);
        return pAGTextViewPm;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView mZx(Context context) {
        PAGTextView pAGTextViewMZx = super.mZx(context);
        pAGTextViewMZx.setGravity(16);
        pAGTextViewMZx.setMaxWidth(tr.mZx(context, 150.0f));
        pAGTextViewMZx.setTextColor(Color.parseColor("#B7B7B7"));
        pAGTextViewMZx.setTextSize(2, 15.0f);
        pAGTextViewMZx.setText("APP NAME");
        return pAGTextViewMZx;
    }
}
