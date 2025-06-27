package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGAppOpenTopBarView extends PAGRelativeLayout {
    private final PAGTextView EYQ;
    private final PAGTextView mZx;

    public PAGAppOpenTopBarView(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iMZx = tr.mZx(context, 12.0f);
        int iMZx2 = tr.mZx(context, 16.0f);
        int iMZx3 = tr.mZx(context, 20.0f);
        int iMZx4 = tr.mZx(context, 24.0f);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.EYQ = pAGTextView;
        pAGTextView.setId(520093713);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, iMZx4);
        layoutParams.topMargin = iMZx3;
        layoutParams.leftMargin = iMZx2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(iMZx2);
        }
        pAGTextView.setLayoutParams(layoutParams);
        pAGTextView.setBackground(zF.Td(context, "tt_app_open_top_bg"));
        pAGTextView.setGravity(17);
        pAGTextView.setPadding(iMZx, 0, iMZx, 0);
        pAGTextView.setText(zF.EYQ(context, "tt_reward_feedback"));
        pAGTextView.setTextColor(Color.parseColor("#ffffff"));
        pAGTextView.setTextSize(1, 14.0f);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.mZx = pAGTextView2;
        pAGTextView2.setId(520093714);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, iMZx4);
        layoutParams2.topMargin = iMZx3;
        layoutParams2.rightMargin = iMZx2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd(iMZx2);
        }
        layoutParams2.addRule(11);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.addRule(21);
        }
        pAGTextView2.setLayoutParams(layoutParams2);
        pAGTextView2.setBackground(zF.Td(context, "tt_app_open_top_bg"));
        pAGTextView2.setGravity(17);
        pAGTextView2.setPadding(iMZx, 0, iMZx, 0);
        pAGTextView2.setText(zF.mZx(context, "tt_txt_skip"));
        pAGTextView2.setTextColor(Color.parseColor("#ffffff"));
        pAGTextView2.setTextSize(1, 14.0f);
        addView(pAGTextView);
        addView(pAGTextView2);
    }

    public PAGTextView getTopDislike() {
        return this.EYQ;
    }

    public PAGTextView getTopSkip() {
        return this.mZx;
    }
}
