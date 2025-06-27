package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGPAGLoadingThreeLayout extends PAGLoadingBaseLayout {
    public PAGPAGLoadingThreeLayout(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        this.IPb = new PAGLinearLayout(context);
        this.IPb.setId(520093750);
        this.IPb.setLayoutParams(new LinearLayout.LayoutParams(-1, tr.mZx(context, 60.0f)));
        this.IPb.setOrientation(0);
        this.IPb.setGravity(17);
        int iMZx = tr.mZx(context, 17.0f);
        int iMZx2 = tr.mZx(context, 35.0f);
        int iMZx3 = tr.mZx(context, -1.5f);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        layoutParams2.rightMargin = iMZx3;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd(iMZx3);
        }
        view.setLayoutParams(layoutParams2);
        view.setBackground(VwS.EYQ(context, "tt_ad_loading_three_left"));
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        layoutParams3.rightMargin = iMZx3;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd(iMZx3);
        }
        view2.setLayoutParams(layoutParams3);
        view2.setBackground(VwS.EYQ(context, "tt_ad_loading_three_mid"));
        View view3 = new View(context);
        view3.setLayoutParams(new LinearLayout.LayoutParams(iMZx, iMZx2));
        view3.setBackground(VwS.EYQ(context, "tt_ad_loading_three_mid"));
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        layoutParams4.leftMargin = iMZx3;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart(iMZx3);
        }
        view4.setLayoutParams(layoutParams4);
        view4.setBackground(VwS.EYQ(context, "tt_ad_loading_three_mid"));
        View view5 = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iMZx, iMZx2);
        layoutParams5.leftMargin = iMZx3;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart(iMZx3);
        }
        view5.setLayoutParams(layoutParams5);
        view5.setBackground(VwS.EYQ(context, "tt_ad_loading_three_right"));
        this.IPb.addView(view);
        this.IPb.addView(view2);
        this.IPb.addView(view3);
        this.IPb.addView(view4);
        this.IPb.addView(view5);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = tr.mZx(context, 10.0f);
        linearLayout2.setLayoutParams(layoutParams6);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        pAGTextView.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView.setTextSize(1, 30.0f);
        pAGTextView.setText("Loading ");
        this.Pm = new PAGTextView(context);
        this.Pm.setId(520093749);
        this.Pm.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.Pm.setTextColor(Color.parseColor("#FFFFFF"));
        this.Pm.setTextSize(1, 30.0f);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        pAGTextView2.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView2.setTextSize(1, 30.0f);
        pAGTextView2.setText("%");
        linearLayout2.addView(pAGTextView);
        linearLayout2.addView(this.Pm);
        linearLayout2.addView(pAGTextView2);
        linearLayout.addView(this.IPb);
        linearLayout.addView(linearLayout2);
        EYQ(context);
        addView(linearLayout);
        addView(this.Kbd);
    }
}
