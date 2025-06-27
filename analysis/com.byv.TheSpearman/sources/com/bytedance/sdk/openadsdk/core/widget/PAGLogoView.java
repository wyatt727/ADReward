package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EYQ(context);
    }

    private void EYQ(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tr.mZx(context, 14.0f), tr.mZx(context, 5.0f));
        int iMZx = tr.mZx(context, 4.0f);
        int iMZx2 = tr.mZx(context, 2.0f);
        layoutParams.topMargin = iMZx;
        layoutParams.bottomMargin = iMZx;
        layoutParams.leftMargin = iMZx2;
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setImageDrawable(zF.Td(context, "tt_ad_logo"));
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = iMZx2;
        layoutParams2.rightMargin = iMZx2;
        pAGTextView.setLayoutParams(layoutParams2);
        pAGTextView.setText(zF.EYQ(context, "tt_logo_en"));
        pAGTextView.setTextSize(1, 8.0f);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(pAGImageView);
        addView(pAGTextView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#1F161823"));
        gradientDrawable.setCornerRadius(tr.mZx(context, 2.0f));
        setBackground(gradientDrawable);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = tr.mZx(getContext(), 13.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.customview.EYQ.EYQ(this, layoutParams));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
