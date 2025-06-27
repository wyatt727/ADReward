package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTInteractionStyle016009VLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle016009VLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void EYQ(Context context) {
        int iMZx = tr.mZx(context, 10.0f);
        int iMZx2 = tr.mZx(context, 6.0f);
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
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, tr.mZx(context, 48.0f));
        layoutParams2.addRule(12);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#26000000"));
        pAGRelativeLayout2.setGravity(16);
        pAGRelativeLayout2.setPadding(iMZx4, 0, 0, 0);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        this.Td = VwS(context);
        this.Td.setId(tp.oIw);
        int iMZx5 = tr.mZx(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iMZx5, iMZx5);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.addRule(20);
        }
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(iMZx);
        }
        this.Td.setLayoutParams(layoutParams3);
        pAGRelativeLayout2.addView(this.Td);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.addRule(17, tp.oIw);
        }
        layoutParams4.addRule(1, tp.oIw);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        this.Pm = mZx(context);
        this.Pm.setId(tp.Rd);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(tr.mZx(context, 130.0f), tr.mZx(context, 20.0f));
        layoutParams5.leftMargin = iMZx2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart(iMZx2);
        }
        this.Pm.setLayoutParams(layoutParams5);
        pAGLinearLayout.addView(this.Pm);
        this.Kbd = Td(context);
        this.Kbd.setId(tp.Jpu);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = iMZx2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart(iMZx2);
        }
        this.Kbd.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.Kbd);
        this.IPb = Pm(context);
        this.IPb.setId(tp.zzY);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(tr.mZx(context, 80.0f), tr.mZx(context, 30.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams7.addRule(21);
        }
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginEnd(iMZx);
        }
        this.IPb.setLayoutParams(layoutParams7);
        pAGRelativeLayout2.addView(this.IPb);
        View viewQQ = QQ(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, tp.sOZ);
        layoutParams8.leftMargin = iMZx3;
        layoutParams8.bottomMargin = iMZx;
        viewQQ.setLayoutParams(layoutParams8);
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
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(16);
        pAGTextView.setMaxWidth(tr.mZx(context, 153.0f));
        pAGTextView.setSingleLine();
        pAGTextView.setText("Pangle");
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView Td(Context context) {
        PAGTextView pAGTextViewTd = super.Td(context);
        pAGTextViewTd.setGravity(16);
        pAGTextViewTd.setMaxWidth(tr.mZx(context, 153.0f));
        pAGTextViewTd.setTextColor(-1);
        pAGTextViewTd.setTextSize(2, 13.0f);
        return pAGTextViewTd;
    }
}
