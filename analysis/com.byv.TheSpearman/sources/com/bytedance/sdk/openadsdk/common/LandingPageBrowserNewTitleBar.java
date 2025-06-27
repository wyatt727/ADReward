package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class LandingPageBrowserNewTitleBar extends RelativeLayout {
    public LandingPageBrowserNewTitleBar(Context context) {
        super(context);
        EYQ();
    }

    private void EYQ() {
        setId(com.bytedance.sdk.openadsdk.utils.tp.VEW);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, tr.mZx(context, 44.0f)));
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(com.bytedance.sdk.openadsdk.utils.tp.Dd);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(tr.mZx(context, 12.0f), tr.mZx(context, 14.0f), tr.mZx(context, 12.0f), tr.mZx(context, 14.0f));
        pAGImageView.setImageResource(zF.Pm(context, "tt_ad_xmark"));
        addView(pAGImageView, new RelativeLayout.LayoutParams(tr.mZx(context, 40.0f), tr.mZx(context, 44.0f)));
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(com.bytedance.sdk.openadsdk.utils.tp.eFB);
        pAGImageView2.setPadding(tr.mZx(context, 8.0f), tr.mZx(context, 10.0f), tr.mZx(context, 8.0f), tr.mZx(context, 10.0f));
        pAGImageView2.setImageResource(zF.Pm(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tr.mZx(context, 40.0f), tr.mZx(context, 44.0f));
        layoutParams.addRule(11);
        addView(pAGImageView2, layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(com.bytedance.sdk.openadsdk.utils.tp.OnO);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#222222"));
        pAGTextView.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tr.mZx(context, 191.0f), tr.mZx(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, com.bytedance.sdk.openadsdk.utils.tp.eFB);
        layoutParams2.addRule(1, com.bytedance.sdk.openadsdk.utils.tp.Dd);
        int iMZx = tr.mZx(context, 10.0f);
        layoutParams2.leftMargin = iMZx;
        layoutParams2.rightMargin = iMZx;
        addView(pAGTextView, layoutParams2);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        pAGProgressBar.setId(com.bytedance.sdk.openadsdk.utils.tp.Hnh);
        pAGProgressBar.setProgress(1);
        pAGProgressBar.setProgressDrawable(zF.Td(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, tr.mZx(context, 2.0f));
        layoutParams3.addRule(12);
        addView(pAGProgressBar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, tr.mZx(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
