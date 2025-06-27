package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTRatingBar2 extends PAGFrameLayout {
    private static int HX = 0;
    private static int IPb = -1;
    private static int QQ;
    private static int VwS;
    private float EYQ;
    private double Kbd;
    private LinearLayout MxO;
    private Drawable Pm;
    private Drawable Td;
    private float mZx;
    private LinearLayout tp;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        EYQ();
    }

    public TTRatingBar2(Context context) {
        super(context);
        EYQ();
    }

    private void EYQ() {
        Context context = getContext();
        this.tp = new LinearLayout(context);
        this.MxO = new LinearLayout(context);
        this.tp.setOrientation(0);
        this.tp.setGravity(GravityCompat.START);
        this.MxO.setOrientation(0);
        this.MxO.setGravity(GravityCompat.START);
        if (IPb < 0) {
            int iEYQ = (int) tr.EYQ(context, 1.0f, false);
            IPb = iEYQ;
            QQ = iEYQ;
            HX = (int) tr.EYQ(context, 3.0f, false);
        }
        this.Td = zF.Td(context, "tt_star_thick");
        this.Pm = zF.Td(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.Td;
    }

    public Drawable getStarFillDrawable() {
        return this.Pm;
    }

    public void EYQ(double d, int i, int i2) {
        float f = i2;
        this.EYQ = (int) tr.EYQ(getContext(), f, false);
        this.mZx = (int) tr.EYQ(getContext(), f, false);
        this.Kbd = d;
        this.tp.removeAllViews();
        this.MxO.removeAllViews();
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.MxO.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.tp.addView(starImageView2);
        }
        addView(this.tp);
        addView(this.MxO);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.EYQ, (int) this.mZx));
        imageView.setPadding(IPb, VwS, QQ, HX);
        return imageView;
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.tp.measure(i, i2);
        double d = this.Kbd;
        float f = this.EYQ;
        int i3 = IPb;
        this.MxO.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d) * f) + i3 + ((f - (i3 + QQ)) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.tp.getMeasuredHeight(), 1073741824));
    }
}
