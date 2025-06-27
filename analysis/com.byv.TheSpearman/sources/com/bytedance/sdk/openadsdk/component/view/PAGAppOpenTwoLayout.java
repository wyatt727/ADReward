package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGAppOpenTwoLayout extends PAGAppOpenBaseLayout {
    public PAGAppOpenTwoLayout(Context context) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(Color.parseColor("#000000"));
        int iMZx = tr.mZx(context, 8.0f);
        int iMZx2 = tr.mZx(context, 9.0f);
        int iMZx3 = tr.mZx(context, 10.0f);
        int iMZx4 = tr.mZx(context, 20.0f);
        int iMZx5 = tr.mZx(context, 40.0f);
        this.EYQ = new PAGImageView(context);
        this.EYQ.setId(520093754);
        this.EYQ.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.EYQ.setScaleType(ImageView.ScaleType.FIT_XY);
        this.mZx = new PAGFrameLayout(context);
        this.mZx.setId(520093755);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.mZx.setLayoutParams(layoutParams);
        this.Td = new PAGImageView(context);
        this.Td.setId(520093756);
        this.Td.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.Pm = new PAGLogoView(context);
        this.Pm.setId(520093757);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(iMZx3);
        }
        layoutParams2.leftMargin = iMZx3;
        layoutParams2.bottomMargin = iMZx3;
        layoutParams2.addRule(12);
        this.Pm.setLayoutParams(layoutParams2);
        this.pi = new DSPAdChoice(context);
        this.pi.setPadding(iMZx2, 0, iMZx2, 0);
        this.pi.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(tr.mZx(context, 32.0f), tr.mZx(context, 14.0f));
        layoutParams3.addRule(12);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, 0, iMZx3, iMZx3);
        this.pi.setLayoutParams(layoutParams3);
        this.Kbd = new ButtonFlash(context);
        this.Kbd.setId(520093717);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(tr.mZx(context, 236.0f), tr.mZx(context, 48.0f));
        layoutParams4.addRule(2, 520093758);
        layoutParams4.addRule(14);
        layoutParams4.bottomMargin = tr.mZx(context, 24.0f);
        this.Kbd.setLayoutParams(layoutParams4);
        this.Kbd.setBackground(zF.Td(context, "tt_button_back"));
        this.Kbd.setEllipsize(TextUtils.TruncateAt.END);
        this.Kbd.setGravity(17);
        this.Kbd.setLines(1);
        this.Kbd.setText(zF.mZx(context, "tt_video_download_apk"));
        this.Kbd.setTextColor(Color.parseColor("#FFFFFF"));
        this.Kbd.setTextSize(1, 18.0f);
        this.Kbd.setTag("open_ad_click_button_tag");
        this.IPb = new PAGLinearLayout(context);
        this.IPb.setId(520093758);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, tr.mZx(context, 60.0f));
        layoutParams5.addRule(12);
        layoutParams5.addRule(14);
        layoutParams5.leftMargin = iMZx4;
        layoutParams5.rightMargin = iMZx4;
        layoutParams5.bottomMargin = tr.mZx(context, 34.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart(iMZx4);
            layoutParams5.setMarginEnd(iMZx4);
        }
        this.IPb.setLayoutParams(layoutParams5);
        this.IPb.setBackground(zF.Td(context, "tt_user_info"));
        this.IPb.setClickable(false);
        this.IPb.setGravity(17);
        this.IPb.setOrientation(0);
        this.IPb.setPadding(iMZx4, 0, iMZx4, 0);
        this.VwS = new TTRoundRectImageView(context);
        this.VwS.setId(520093759);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(iMZx5, iMZx5);
        layoutParams6.rightMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginEnd(iMZx);
        }
        this.VwS.setLayoutParams(layoutParams6);
        this.QQ = new PAGTextView(context);
        this.QQ.setId(520093761);
        this.QQ.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.QQ.setEllipsize(TextUtils.TruncateAt.END);
        this.QQ.setMaxLines(2);
        this.QQ.setTextColor(Color.parseColor("#161823"));
        this.QQ.setTextSize(1, 22.0f);
        this.IPb.addView(this.VwS);
        this.IPb.addView(this.QQ);
        addView(this.EYQ);
        addView(this.mZx);
        addView(this.Td);
        addView(this.Pm);
        addView(this.pi);
        addView(this.Kbd);
        addView(this.IPb);
        addView(this.HX);
    }
}
