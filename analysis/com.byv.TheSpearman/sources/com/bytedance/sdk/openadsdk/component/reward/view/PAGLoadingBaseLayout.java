package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGLoadingBaseLayout extends PAGRelativeLayout {
    TTRoundRectImageView EYQ;
    PAGLinearLayout IPb;
    PAGLogoView Kbd;
    PAGTextView Pm;
    TwoSemicirclesView QQ;
    PAGProgressBar Td;
    TwoSemicirclesView VwS;
    PAGTextView mZx;

    public PAGLoadingBaseLayout(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(Color.parseColor("#161823"));
    }

    public void EYQ(Context context) {
        this.Kbd = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(tr.mZx(context, 20.0f));
        }
        layoutParams.leftMargin = tr.mZx(context, 20.0f);
        layoutParams.bottomMargin = tr.mZx(context, 20.0f);
        layoutParams.addRule(12);
        this.Kbd.setLayoutParams(layoutParams);
    }

    public TTRoundRectImageView getLoadingIcon() {
        return this.EYQ;
    }

    public PAGTextView getLoadingAppName() {
        return this.mZx;
    }

    public PAGProgressBar getLoadingProgressBar() {
        return this.Td;
    }

    public PAGTextView getLoadingProgressNumber() {
        return this.Pm;
    }

    public PAGLogoView getLoadingLogo() {
        return this.Kbd;
    }

    public PAGLinearLayout getWaveContainer() {
        return this.IPb;
    }

    public TwoSemicirclesView getInnerCircle() {
        return this.VwS;
    }

    public TwoSemicirclesView getOuterCircle() {
        return this.QQ;
    }
}
