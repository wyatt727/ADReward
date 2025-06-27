package com.bytedance.sdk.openadsdk.component.reward.mZx;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: RewardFullLandingPageType.java */
/* loaded from: classes2.dex */
public class Td extends mZx {
    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void EYQ(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean Kbd() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public int MxO() {
        return 16;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public RFEndCardBackUpLayout QQ() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void VwS() {
    }

    public Td(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        super(eyq);
    }

    public static boolean EYQ(UB ub) {
        return KO.mZx(ub) || KO.Td(ub);
    }

    public static void EYQ(UB ub, FrameLayout frameLayout) {
        if (KO.mZx(ub)) {
            Td(frameLayout);
        } else if (KO.Td(ub)) {
            Pm(frameLayout);
        } else {
            mZx(frameLayout);
        }
    }

    static void Td(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(tp.Tnp);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(pAGFrameLayout, layoutParams);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(tp.tp);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout2.addView(EYQ(context));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(tp.Uc);
        pAGFrameLayout3.setVisibility(8);
        pAGFrameLayout3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        pAGFrameLayout2.addView(pAGFrameLayout3, layoutParams2);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(tp.hYh);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout3.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.EYQ.mZx(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(tp.zF);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        pAGLinearLayout.addView(pAGFrameLayout4, layoutParams3);
        pAGFrameLayout4.addView(mZx(context));
        LinearLayout linearLayoutTd = Td(context);
        linearLayoutTd.setBackgroundColor(Color.parseColor("#70161823"));
        pAGFrameLayout4.addView(linearLayoutTd);
        linearLayoutTd.addView(Pm(context));
        com.bytedance.sdk.openadsdk.component.reward.view.EYQ.EYQ(pAGFrameLayout4);
    }

    private static SSWebView mZx(Context context) {
        SSWebView sSWebView = new SSWebView(context);
        sSWebView.setId(tp.WU);
        sSWebView.setLayerType(2, null);
        sSWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return sSWebView;
    }

    private static LinearLayout Td(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.XN);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return pAGLinearLayout;
    }

    private static ImageView Pm(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        pAGImageView.setImageResource(zF.Pm(context, "tt_up_slide"));
        pAGImageView.setId(tp.NZ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tr.mZx(context, 18.0f), tr.mZx(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = tr.mZx(context, 45.0f);
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    static void Pm(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(tp.zF);
        frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(mZx(context));
        LinearLayout linearLayoutTd = Td(context);
        linearLayoutTd.setBackgroundColor(Color.parseColor("#99161823"));
        pAGFrameLayout.addView(linearLayoutTd);
        linearLayoutTd.addView(Pm(context));
        com.bytedance.sdk.openadsdk.component.reward.view.EYQ.EYQ(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(tp.Tnp);
        frameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(tp.tp);
        pAGFrameLayout2.addView(pAGFrameLayout3, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout3.addView(EYQ(context));
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(tp.Uc);
        pAGFrameLayout4.setVisibility(8);
        pAGFrameLayout4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout3.addView(pAGFrameLayout4, layoutParams);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(tp.hYh);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout4.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.EYQ.mZx(pAGFrameLayout2);
        PlayableLoadingView playableLoadingView = new PlayableLoadingView(context);
        playableLoadingView.setId(tp.FtN);
        playableLoadingView.setClickable(true);
        playableLoadingView.setFocusable(true);
        frameLayout.addView(playableLoadingView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void EYQ(RewardFullBaseLayout rewardFullBaseLayout) {
        EYQ(this.mZx, rewardFullBaseLayout);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void nWX() {
        if (KO.mZx(this.EYQ.EYQ) && this.EYQ.TQF != null && this.EYQ.TQF.KO != null) {
            if (this.EYQ.TQF.KO.Td()) {
                this.EYQ.TQF.Td(0);
                this.EYQ.lEs.set(true);
            } else {
                this.EYQ.xt.set(true);
                EYQ(true, false, true, 80);
            }
        }
        if (KO.Td(this.EYQ.EYQ)) {
            EYQ(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean IPb() {
        return KO.mZx(this.EYQ.EYQ) || !KO.Td(this.EYQ.EYQ);
    }
}
