package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGAppOpenOneLayout extends PAGAppOpenBaseLayout {
    public PAGAppOpenOneLayout(Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(Color.parseColor("#000000"));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGLinearLayout.setOrientation(1);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(520093753);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 84.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams);
        this.EYQ = new PAGImageView(context);
        this.EYQ.setId(520093754);
        this.EYQ.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.EYQ.setScaleType(ImageView.ScaleType.FIT_XY);
        this.mZx = new PAGFrameLayout(context);
        this.mZx.setId(520093755);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        this.mZx.setLayoutParams(layoutParams2);
        this.Td = new PAGImageView(context);
        this.Td.setId(520093756);
        this.Td.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.Pm = new PAGLogoView(context);
        this.Pm.setId(520093757);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        layoutParams3.addRule(12);
        this.Pm.setLayoutParams(layoutParams3);
        View viewEYQ = EYQ(context);
        pAGRelativeLayout.addView(this.EYQ);
        pAGRelativeLayout.addView(this.mZx);
        pAGRelativeLayout.addView(this.Td);
        pAGRelativeLayout.addView(this.Pm);
        pAGRelativeLayout.addView(viewEYQ);
        pAGRelativeLayout.addView(this.HX);
        int iMZx = tr.mZx(context, 2.0f);
        int iMZx2 = tr.mZx(context, 20.0f);
        int iMZx3 = tr.mZx(context, 22.0f);
        int iMZx4 = tr.mZx(context, 40.0f);
        this.IPb = new PAGLinearLayout(context);
        this.IPb.setId(520093758);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 16.0f;
        this.IPb.setLayoutParams(layoutParams4);
        this.IPb.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.IPb.setClickable(false);
        this.IPb.setGravity(17);
        this.IPb.setOrientation(0);
        this.IPb.setPadding(iMZx2, 0, iMZx2, 0);
        this.VwS = new TTRoundRectImageView(context);
        this.VwS.setId(520093759);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iMZx4, iMZx4);
        layoutParams5.leftMargin = iMZx;
        layoutParams5.rightMargin = iMZx3;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart(iMZx);
            layoutParams5.setMarginEnd(iMZx3);
        }
        this.VwS.setLayoutParams(layoutParams5);
        this.QQ = new PAGTextView(context);
        this.QQ.setId(520093761);
        this.QQ.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.QQ.setEllipsize(TextUtils.TruncateAt.END);
        this.QQ.setMaxLines(2);
        this.QQ.setTextColor(Color.parseColor("#161823"));
        this.QQ.setTextSize(1, 22.0f);
        this.IPb.addView(this.VwS);
        this.IPb.addView(this.QQ);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGLinearLayout.addView(this.IPb);
        addView(pAGLinearLayout);
    }

    public View EYQ(Context context) {
        this.Kbd = new ButtonFlash(context);
        this.Kbd.setId(520093717);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tr.mZx(context, 180.0f), tr.mZx(context, 43.0f));
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = tr.mZx(context, 24.0f);
        this.Kbd.setLayoutParams(layoutParams);
        this.Kbd.setBackground(zF.Td(context, "tt_button_back"));
        this.Kbd.setEllipsize(TextUtils.TruncateAt.END);
        this.Kbd.setGravity(17);
        this.Kbd.setLines(1);
        this.Kbd.setText(zF.mZx(context, "tt_video_download_apk"));
        this.Kbd.setTextColor(Color.parseColor("#FFFFFF"));
        this.Kbd.setTextSize(1, 16.0f);
        this.Kbd.setTag("open_ad_click_button_tag");
        return this.Kbd;
    }
}
