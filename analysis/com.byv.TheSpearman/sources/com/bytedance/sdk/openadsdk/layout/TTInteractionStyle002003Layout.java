package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTInteractionStyle002003Layout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle002003Layout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void EYQ(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGLinearLayout.setOrientation(1);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 337.0f;
        pAGFrameLayout.setLayoutParams(layoutParams);
        pAGLinearLayout.addView(pAGFrameLayout);
        this.EYQ = Kbd(context);
        this.EYQ.setId(tp.PP);
        this.EYQ.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.EYQ);
        this.mZx = IPb(context);
        this.mZx.setId(tp.VQ);
        this.mZx.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.mZx);
        PAGLogoView pAGLogoViewQQ = QQ(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int iMZx = tr.mZx(context, 10.0f);
        layoutParams2.leftMargin = iMZx;
        layoutParams2.topMargin = iMZx;
        layoutParams2.bottomMargin = iMZx;
        pAGLogoViewQQ.setLayoutParams(layoutParams2);
        pAGFrameLayout.addView(pAGLogoViewQQ);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 263.0f;
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(81);
        int iMZx2 = tr.mZx(context, 16.0f);
        pAGLinearLayout2.setPadding(iMZx2, iMZx2, iMZx2, iMZx2);
        pAGLinearLayout.addView(pAGLinearLayout2);
        this.Td = VwS(context);
        this.Td.setId(tp.oIw);
        int iMZx3 = tr.mZx(context, 45.0f);
        this.Td.setLayoutParams(new LinearLayout.LayoutParams(iMZx3, iMZx3));
        pAGLinearLayout2.addView(this.Td);
        this.Pm = mZx(context);
        this.Pm.setId(tp.Rd);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = tr.mZx(context, 4.0f);
        this.Pm.setLayoutParams(layoutParams4);
        pAGLinearLayout2.addView(this.Pm);
        this.Kbd = Td(context);
        this.Kbd.setId(tp.Jpu);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = iMZx;
        layoutParams5.bottomMargin = tr.mZx(context, 25.0f);
        this.Kbd.setLayoutParams(layoutParams5);
        pAGLinearLayout2.addView(this.Kbd);
        this.IPb = Pm(context);
        this.IPb.setId(tp.zzY);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, tr.mZx(context, 32.0f));
        layoutParams6.topMargin = iMZx2;
        this.IPb.setLayoutParams(layoutParams6);
        pAGLinearLayout2.addView(this.IPb);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView mZx(Context context) {
        PAGTextView pAGTextViewMZx = super.mZx(context);
        pAGTextViewMZx.setTextColor(-1);
        return pAGTextViewMZx;
    }
}
