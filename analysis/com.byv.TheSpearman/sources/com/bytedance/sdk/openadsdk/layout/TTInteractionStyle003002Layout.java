package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTInteractionStyle003002Layout extends TTInteractionStyleBaseFrameLayout {
    private PAGTextView QQ;
    private PAGImageView VwS;

    public TTInteractionStyle003002Layout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void EYQ(Context context) {
        int iMZx = tr.mZx(context, 6.0f);
        setPadding(iMZx, iMZx, iMZx, iMZx);
        this.EYQ = Kbd(context);
        this.EYQ.setId(tp.PP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iMZx2 = tr.mZx(context, 26.0f);
        layoutParams.topMargin = iMZx2;
        this.EYQ.setLayoutParams(layoutParams);
        addView(this.EYQ);
        PAGImageView pAGImageView = new PAGImageView(context);
        this.VwS = pAGImageView;
        pAGImageView.setId(tp.qxY);
        this.VwS.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iMZx2;
        this.VwS.setLayoutParams(layoutParams2);
        addView(this.VwS);
        PAGLogoView pAGLogoViewQQ = QQ(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iMZx3 = tr.mZx(context, 10.0f);
        layoutParams3.leftMargin = iMZx3;
        layoutParams3.topMargin = iMZx3;
        layoutParams3.bottomMargin = iMZx3;
        pAGLogoViewQQ.setLayoutParams(layoutParams3);
        addView(pAGLogoViewQQ);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(0);
        pAGLinearLayout.setGravity(17);
        addView(pAGLinearLayout);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.QQ = pAGTextView;
        pAGTextView.setId(tp.lJ);
        this.QQ.setEllipsize(TextUtils.TruncateAt.END);
        this.QQ.setMaxLines(1);
        this.QQ.setTextColor(-1);
        this.QQ.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.QQ.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(this.QQ);
    }

    public PAGImageView getTtBuImg() {
        return this.VwS;
    }

    public PAGTextView getTtBuDescTV() {
        return this.QQ;
    }
}
