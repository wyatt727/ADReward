package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;

/* loaded from: classes2.dex */
public abstract class TTInteractionStyleBaseFrameLayout extends PAGFrameLayout {
    protected PAGFrameLayout EYQ;
    protected PAGTextView IPb;
    protected PAGTextView Kbd;
    protected PAGTextView Pm;
    protected TTRoundRectImageView Td;
    protected PAGImageView mZx;

    protected abstract void EYQ(Context context);

    public TTInteractionStyleBaseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EYQ(context);
    }

    public FrameLayout getTtAdContainer() {
        return this.EYQ;
    }

    public ImageView getTtFullImg() {
        return this.mZx;
    }

    public TTRoundRectImageView getTtFullAdIcon() {
        return this.Td;
    }

    public TextView getTtFullAdAppName() {
        return this.Pm;
    }

    public TextView getTtFullAdDesc() {
        return this.Kbd;
    }

    public TextView getTtFullAdDownload() {
        return this.IPb;
    }

    protected PAGFrameLayout Kbd(Context context) {
        return new PAGFrameLayout(context);
    }

    protected PAGImageView IPb(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return pAGImageView;
    }

    protected TTRoundRectImageView VwS(Context context) {
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tTRoundRectImageView.setBackgroundColor(0);
        return tTRoundRectImageView;
    }

    protected PAGTextView mZx(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 16.0f);
        return pAGTextView;
    }

    protected PAGTextView Td(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setSingleLine();
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 12.0f);
        return pAGTextView;
    }

    protected PAGTextView Pm(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setBackgroundResource(zF.Pm(context, "tt_backup_btn_1"));
        pAGTextView.setGravity(17);
        pAGTextView.setText(zF.mZx(context, "tt_video_download_apk"));
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    protected PAGLogoView QQ(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }
}
