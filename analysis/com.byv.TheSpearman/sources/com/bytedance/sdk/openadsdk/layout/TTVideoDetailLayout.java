package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTVideoDetailLayout extends PAGRelativeLayout {
    public TTVideoDetailLayout(Context context) {
        this(context, null);
    }

    public TTVideoDetailLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoDetailLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EYQ(context);
    }

    private void EYQ(Context context) {
        setId(520093726);
        setBackgroundColor(-1);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(tp.JyA);
        pAGRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.setBackgroundColor(0);
        pAGRelativeLayout.setGravity(17);
        addView(pAGRelativeLayout);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(tp.XNX);
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(pAGImageView);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context);
        pAGProgressBar.setId(tp.dbE);
        int iMZx = tr.mZx(context, 60.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMZx, iMZx);
        layoutParams.addRule(13);
        pAGProgressBar.setLayoutParams(layoutParams);
        pAGProgressBar.setIndeterminateDrawable(zF.Td(context, "tt_video_loading_progress_bar"));
        pAGRelativeLayout.addView(pAGProgressBar);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.zX);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGLinearLayout.setLayoutParams(layoutParams2);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        pAGRelativeLayout.addView(pAGLinearLayout);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(tp.xO);
        pAGImageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        pAGImageView2.setImageDrawable(zF.Td(context, "tt_refreshing_video_textpage"));
        pAGImageView2.setScaleType(ImageView.ScaleType.CENTER);
        pAGLinearLayout.addView(pAGImageView2);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(tp.oCs);
        pAGTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        pAGTextView.setText(zF.mZx(context, "tt_video_retry_des_txt"));
        pAGTextView.setTextColor(Color.parseColor("#999999"));
        pAGLinearLayout.addView(pAGTextView);
        PAGImageView pAGImageView3 = new PAGImageView(context);
        pAGImageView3.setId(tp.Cia);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        pAGImageView3.setLayoutParams(layoutParams3);
        pAGImageView3.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView3.setImageDrawable(zF.Td(context, "tt_play_movebar_textpage"));
        pAGImageView3.setVisibility(8);
        addView(pAGImageView3);
        PAGImageView pAGImageView4 = new PAGImageView(context);
        pAGImageView4.setId(tp.HR);
        int iMZx2 = tr.mZx(context, 30.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iMZx2, iMZx2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.addRule(21);
        }
        layoutParams4.addRule(11);
        int iMZx3 = tr.mZx(context, 7.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd(iMZx3);
        }
        layoutParams4.rightMargin = iMZx3;
        layoutParams4.topMargin = iMZx3;
        pAGImageView4.setLayoutParams(layoutParams4);
        pAGImageView4.setBackground(VwS.EYQ(context, "tt_detail_video_btn_bg"));
        pAGImageView4.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView4.setImageDrawable(zF.Td(context, "tt_close_move_detail"));
        addView(pAGImageView4);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setId(tp.tC);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(9);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.addRule(20);
        }
        layoutParams5.addRule(10);
        pAGTextView2.setLayoutParams(layoutParams5);
        pAGTextView2.setBackground(VwS.EYQ(context, "tt_video_black_desc_gradient"));
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setMaxLines(2);
        int iMZx4 = tr.mZx(context, 15.0f);
        pAGTextView2.setPadding(iMZx4, tr.mZx(context, 14.0f), iMZx4, 0);
        pAGTextView2.setSingleLine(false);
        pAGTextView2.setTextColor(-1);
        pAGTextView2.setTextSize(2, 17.0f);
        pAGTextView2.setVisibility(8);
        addView(pAGTextView2);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        pAGRelativeLayout2.setId(tp.In);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(10);
        pAGRelativeLayout2.setLayoutParams(layoutParams6);
        pAGRelativeLayout2.setBackground(VwS.EYQ(context, "tt_video_black_desc_gradient"));
        pAGRelativeLayout2.setGravity(16);
        pAGRelativeLayout2.setVisibility(8);
        addView(pAGRelativeLayout2);
        PAGImageView pAGImageView5 = new PAGImageView(context);
        pAGImageView5.setId(tp.Jy);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams7.addRule(15);
        int iMZx5 = tr.mZx(context, 12.0f);
        layoutParams7.leftMargin = iMZx5;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginStart(iMZx5);
        }
        pAGImageView5.setLayoutParams(layoutParams7);
        pAGImageView5.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView5.setImageDrawable(zF.Td(context, "tt_leftbackbutton_titlebar_photo_preview"));
        pAGRelativeLayout2.addView(pAGImageView5);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setId(tp.KvC);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams8.addRule(15);
        int iMZx6 = tr.mZx(context, 16.0f);
        layoutParams8.leftMargin = iMZx6;
        layoutParams8.rightMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart(iMZx6);
            layoutParams8.setMarginEnd(iMZx);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams8.addRule(17, tp.Jy);
        }
        layoutParams8.addRule(0, tp.Yd);
        layoutParams8.addRule(1, tp.Jy);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams8.addRule(16, tp.Yd);
        }
        pAGTextView3.setLayoutParams(layoutParams8);
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setGravity(16);
        pAGTextView3.setMaxLines(1);
        pAGTextView3.setSingleLine(true);
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setTextSize(2, 17.0f);
        pAGRelativeLayout2.addView(pAGTextView3);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setId(tp.Yd);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams9.addRule(21);
        }
        layoutParams9.addRule(11);
        int iMZx7 = tr.mZx(context, 14.0f);
        layoutParams9.rightMargin = iMZx7;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams9.setMarginEnd(iMZx7);
        }
        pAGLinearLayout2.setLayoutParams(layoutParams9);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(1);
        pAGRelativeLayout2.addView(pAGLinearLayout2);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        pAGTextView4.setId(tp.VM);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams10.gravity = 1;
        pAGTextView4.setLayoutParams(layoutParams10);
        pAGTextView4.setGravity(16);
        pAGTextView4.setMaxLines(1);
        pAGTextView4.setSingleLine(true);
        pAGTextView4.setTextColor(-1);
        pAGTextView4.setTextSize(2, 12.0f);
        pAGLinearLayout2.addView(pAGTextView4);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setId(tp.WgU);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, tr.mZx(context, 40.0f));
        layoutParams11.addRule(12);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams11.addRule(21);
        }
        layoutParams11.addRule(11);
        pAGLinearLayout3.setLayoutParams(layoutParams11);
        pAGLinearLayout3.setGravity(16);
        pAGLinearLayout3.setOrientation(0);
        pAGLinearLayout3.setVisibility(8);
        addView(pAGLinearLayout3);
        PAGTextView pAGTextView5 = new PAGTextView(context);
        pAGTextView5.setId(tp.QN);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.leftMargin = iMZx6;
        layoutParams12.rightMargin = iMZx5;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams12.setMarginEnd(iMZx5);
            layoutParams12.setMarginStart(iMZx6);
        }
        pAGTextView5.setLayoutParams(layoutParams12);
        pAGTextView5.setText(zF.mZx(context, "tt_00_00"));
        pAGTextView5.setTextColor(-1);
        pAGTextView5.setTextSize(2, 10.0f);
        pAGLinearLayout3.addView(pAGTextView5);
        SeekBar seekBar = new SeekBar(context);
        seekBar.setId(tp.hv);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(0, tr.mZx(context, 5.0f));
        layoutParams13.gravity = 16;
        seekBar.setLayoutParams(layoutParams13);
        seekBar.setMax(100);
        seekBar.setPadding(0, 0, 0, 0);
        seekBar.setProgressDrawable(zF.Td(context, "tt_seek_progress"));
        seekBar.setThumb(zF.Td(context, "tt_seek_thumb"));
        seekBar.setThumbOffset(0);
        pAGLinearLayout3.addView(seekBar);
        PAGTextView pAGTextView6 = new PAGTextView(context);
        pAGTextView6.setId(tp.Aw);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams14.leftMargin = iMZx5;
        layoutParams14.rightMargin = iMZx6;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams14.setMarginEnd(iMZx6);
            layoutParams14.setMarginStart(iMZx5);
        }
        pAGTextView6.setLayoutParams(layoutParams14);
        pAGTextView6.setText(zF.mZx(context, "tt_00_00"));
        pAGTextView6.setTextColor(-1);
        pAGTextView6.setTextSize(2, 10.0f);
        pAGLinearLayout3.addView(pAGTextView6);
        PAGImageView pAGImageView6 = new PAGImageView(context);
        pAGImageView6.setId(tp.QI);
        pAGImageView6.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        pAGImageView6.setPadding(iMZx6, 0, iMZx6, 0);
        pAGImageView6.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView6.setVisibility(8);
        pAGImageView6.setImageDrawable(zF.Td(context, "tt_enlarge_video"));
        pAGLinearLayout3.addView(pAGImageView6);
        TTVideoAdCoverLayout tTVideoAdCoverLayout = new TTVideoAdCoverLayout(context);
        tTVideoAdCoverLayout.setId(tp.rM);
        tTVideoAdCoverLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(tTVideoAdCoverLayout);
        PAGTextView pAGTextView7 = new PAGTextView(context);
        pAGTextView7.setId(tp.yK);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams15.leftMargin = iMZx5;
        layoutParams15.addRule(9);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams15.addRule(20);
        }
        pAGTextView7.setLayoutParams(layoutParams15);
        pAGTextView7.setBackgroundColor(Color.parseColor("#00000000"));
        pAGTextView7.setText("close");
        pAGTextView7.setMinHeight(tr.mZx(context, 44.0f));
        pAGTextView7.setCompoundDrawablesWithIntrinsicBounds(zF.Td(context, "tt_shadow_btn_back"), (Drawable) null, (Drawable) null, (Drawable) null);
        addView(pAGTextView7);
    }
}
