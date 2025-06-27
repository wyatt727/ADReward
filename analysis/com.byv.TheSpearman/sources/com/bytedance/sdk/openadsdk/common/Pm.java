package com.bytedance.sdk.openadsdk.common;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.hu;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: LandingPageLoadingDefaultStyle.java */
/* loaded from: classes2.dex */
public class Pm extends IPb {
    ObjectAnimator EYQ;
    private LinearLayout HX;
    private AnimatorSet QQ;

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void EYQ(int i) {
    }

    public Pm(Context context, String str, String[] strArr, nWX nwx, hu huVar) {
        super(context, str, strArr, nwx, huVar);
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    protected void EYQ() {
        this.Kbd = IPb();
    }

    private View IPb() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this.IPb);
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        this.HX = new LinearLayout(this.IPb);
        if (Build.VERSION.SDK_INT >= 17) {
            this.HX.setLayoutDirection(0);
        }
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, tr.mZx(this.IPb, 60.0f));
        this.HX.setGravity(17);
        this.HX.setOrientation(0);
        pAGLinearLayout.addView(this.HX, layoutParams);
        int iMZx = tr.mZx(this.IPb, 17.0f);
        int iMZx2 = tr.mZx(this.IPb, 35.0f);
        int iMZx3 = tr.mZx(this.IPb, 1.5f);
        View view = new View(this.IPb);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        int i = -iMZx3;
        layoutParams2.rightMargin = i;
        view.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this.IPb, "tt_ad_landing_loading_three_left"));
        this.HX.addView(view, layoutParams2);
        View view2 = new View(this.IPb);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        layoutParams3.rightMargin = i;
        view2.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this.IPb, "tt_ad_landing_loading_three_mid"));
        this.HX.addView(view2, layoutParams3);
        View view3 = new View(this.IPb);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        view3.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this.IPb, "tt_ad_landing_loading_three_mid"));
        this.HX.addView(view3, layoutParams4);
        View view4 = new View(this.IPb);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        layoutParams5.leftMargin = i;
        view4.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this.IPb, "tt_ad_landing_loading_three_mid"));
        this.HX.addView(view4, layoutParams5);
        View view5 = new View(this.IPb);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        layoutParams6.leftMargin = i;
        view5.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this.IPb, "tt_ad_landing_loading_three_right"));
        this.HX.addView(view5, layoutParams6);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this.IPb);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = tr.mZx(this.IPb, 10.0f);
        pAGLinearLayout2.setGravity(17);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams7);
        PAGTextView pAGTextView = new PAGTextView(this.IPb);
        pAGTextView.setId(com.bytedance.sdk.openadsdk.utils.tp.Ts);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.gravity = 17;
        pAGTextView.setGravity(17);
        pAGTextView.setPadding(tr.mZx(this.IPb, 10.0f), 0, 0, 0);
        pAGTextView.setText(zF.EYQ(this.IPb, "tt_loading_language"));
        pAGTextView.setTextColor(Color.parseColor("#80161823"));
        pAGTextView.setTextSize(14.0f);
        pAGLinearLayout2.addView(pAGTextView, layoutParams8);
        if (this.VwS != null) {
            pAGTextView.setText(this.VwS.Td());
        }
        return pAGLinearLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void mZx() {
        this.QQ = new AnimatorSet();
        LinearLayout linearLayout = this.HX;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            this.EYQ = duration;
            duration.setRepeatMode(2);
            this.EYQ.setRepeatCount(-1);
            AnimatorSet.Builder builderPlay = this.QQ.play(this.EYQ);
            for (int i = 1; i < this.HX.getChildCount(); i++) {
                float f = -9.0f;
                if (i % 2 == 0) {
                    f = 9.0f;
                }
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.HX.getChildAt(i), "translationY", -f, f).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                builderPlay = builderPlay.with(duration2);
            }
            this.QQ.start();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void Td() {
        ObjectAnimator objectAnimator = this.EYQ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet = this.QQ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void Pm() {
        super.Pm();
    }
}
