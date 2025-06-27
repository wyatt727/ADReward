package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class LandingPageBrowserNewBottomBar extends LinearLayout {
    public LandingPageBrowserNewBottomBar(Context context) {
        super(context);
        EYQ();
    }

    private static ImageView EYQ(Context context, float f, float f2, float f3, float f4) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(tr.mZx(context, f3), tr.mZx(context, f4), tr.mZx(context, f3), tr.mZx(context, f4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tr.mZx(context, 40.0f), tr.mZx(context, 44.0f));
        if (f > 0.0f) {
            layoutParams.leftMargin = tr.mZx(context, f);
        }
        if (f2 > 0.0f) {
            layoutParams.rightMargin = tr.mZx(context, f2);
        }
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    private void EYQ() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.tp.XL);
        setLayoutParams(new ViewGroup.LayoutParams(-1, tr.mZx(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, tr.mZx(context, 0.5f)));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(0);
        addView(pAGLinearLayout, new LinearLayout.LayoutParams(-1, tr.mZx(context, 44.0f)));
        ImageView imageViewEYQ = EYQ(context, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewEYQ.setId(com.bytedance.sdk.openadsdk.utils.tp.TZE);
        imageViewEYQ.setImageResource(zF.Pm(context, "tt_ad_arrow_backward_wrapper"));
        pAGLinearLayout.addView(imageViewEYQ);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(view2, layoutParams);
        ImageView imageViewEYQ2 = EYQ(context, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewEYQ2.setId(com.bytedance.sdk.openadsdk.utils.tp.CsQ);
        imageViewEYQ2.setImageResource(zF.Pm(context, "tt_ad_arrow_forward_wrapper"));
        pAGLinearLayout.addView(imageViewEYQ2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        pAGLinearLayout.addView(view3, layoutParams2);
        ImageView imageViewEYQ3 = EYQ(context, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewEYQ3.setId(com.bytedance.sdk.openadsdk.utils.tp.wG);
        imageViewEYQ3.setImageResource(zF.Pm(context, "tt_ad_refresh"));
        pAGLinearLayout.addView(imageViewEYQ3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        pAGLinearLayout.addView(view4, layoutParams3);
        ImageView imageViewEYQ4 = EYQ(context, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewEYQ4.setId(com.bytedance.sdk.openadsdk.utils.tp.BQ);
        imageViewEYQ4.setImageResource(zF.Pm(context, "tt_ad_link"));
        pAGLinearLayout.addView(imageViewEYQ4);
    }
}
