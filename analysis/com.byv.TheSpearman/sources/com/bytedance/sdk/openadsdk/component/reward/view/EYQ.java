package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: RFViewHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static void EYQ(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(tp.tPj);
        pAGRelativeLayout.setBackgroundColor(Color.parseColor("#F8F8F8"));
        frameLayout.addView(pAGRelativeLayout, new FrameLayout.LayoutParams(-1, -1));
        LandingPageLoadingLayout landingPageLoadingLayout = new LandingPageLoadingLayout(context);
        landingPageLoadingLayout.setId(tp.wBa);
        pAGRelativeLayout.addView(landingPageLoadingLayout, new RelativeLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.rfB);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setId(tp.PI);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        pAGRelativeLayout.addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setId(tp.lEs);
        pAGLinearLayout.addView(tTRoundRectImageView, new LinearLayout.LayoutParams(tr.mZx(context, 80.0f), tr.mZx(context, 80.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(tp.xt);
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(2, 24.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tr.mZx(context, 12.0f);
        pAGLinearLayout.addView(pAGTextView, layoutParams2);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setId(tp.Nvm);
        pAGTextView2.setGravity(17);
        pAGTextView2.setTextColor(Color.parseColor("#80161823"));
        pAGTextView2.setTextSize(2, 16.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            pAGTextView2.setTextAlignment(4);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int iMZx = tr.mZx(context, 60.0f);
        layoutParams3.leftMargin = iMZx;
        layoutParams3.rightMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(layoutParams3.leftMargin);
            layoutParams3.setMarginEnd(layoutParams3.rightMargin);
        }
        layoutParams3.topMargin = tr.mZx(context, 8.0f);
        pAGLinearLayout.addView(pAGTextView2, layoutParams3);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setId(tp.FH);
        pAGTextView3.setGravity(17);
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setText(zF.mZx(context, "tt_video_mobile_go_detail"));
        pAGTextView3.setBackground(VwS.EYQ(context, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(tr.mZx(context, 255.0f), tr.mZx(context, 44.0f));
        layoutParams4.topMargin = tr.mZx(context, 32.0f);
        pAGLinearLayout.addView(pAGTextView3, layoutParams4);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(tp.tr);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        layoutParams5.addRule(12);
        layoutParams5.leftMargin = tr.mZx(context, 16.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart(layoutParams5.leftMargin);
        }
        layoutParams5.bottomMargin = tr.mZx(context, 20.0f);
        pAGRelativeLayout.addView(pAGLogoView, layoutParams5);
    }

    public static void mZx(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setId(tp.tsL);
        rFDownloadBarLayout.setVisibility(8);
        rFDownloadBarLayout.setPadding(tr.mZx(context, 15.0f), 0, 0, 0);
        rFDownloadBarLayout.setBackgroundColor(zF.QQ(context, "tt_download_bar_background_new"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tr.mZx(context, 90.0f));
        layoutParams.gravity = 80;
        frameLayout.addView(rFDownloadBarLayout, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.pi);
        pAGLinearLayout.setVisibility(8);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        sSWebView.setId(tp.nWX);
        frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(tp.KO);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(tp.hu);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(new RFEndCardBackUpLayout(context), new FrameLayout.LayoutParams(-1, -1));
    }
}
