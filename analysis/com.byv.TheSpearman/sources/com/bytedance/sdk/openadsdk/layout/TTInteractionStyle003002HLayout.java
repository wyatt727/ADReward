package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTInteractionStyle003002HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle003002HLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void EYQ(Context context) {
        int iMZx = tr.mZx(context, 10.0f);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(iMZx, iMZx, iMZx, iMZx);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        pAGFrameLayout.setLayoutParams(layoutParams2);
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
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = iMZx;
        layoutParams3.topMargin = iMZx;
        layoutParams3.bottomMargin = iMZx;
        pAGLogoViewQQ.setLayoutParams(layoutParams3);
        pAGFrameLayout.addView(pAGLogoViewQQ);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(pAGRelativeLayout);
        this.Td = VwS(context);
        this.Td.setId(tp.oIw);
        int iMZx2 = tr.mZx(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iMZx2, iMZx2);
        layoutParams5.addRule(15);
        this.Td.setLayoutParams(layoutParams5);
        pAGRelativeLayout.addView(this.Td);
        this.Pm = mZx(context);
        this.Pm.setId(tp.Rd);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart(iMZx);
        }
        layoutParams6.addRule(1, tp.oIw);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams6.addRule(17, tp.oIw);
        }
        this.Pm.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(this.Pm);
        this.IPb = Pm(context);
        this.IPb.setId(tp.zzY);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(tr.mZx(context, 100.0f), tr.mZx(context, 32.0f));
        layoutParams7.addRule(11);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams7.addRule(21);
        }
        layoutParams7.addRule(15);
        this.IPb.setLayoutParams(layoutParams7);
        pAGRelativeLayout.addView(this.IPb);
    }
}
