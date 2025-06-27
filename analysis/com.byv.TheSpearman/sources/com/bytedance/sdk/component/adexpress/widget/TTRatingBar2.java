package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.MxO;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class TTRatingBar2 extends FrameLayout {
    private static final int HX = (MxO.mZx("", 0.0f, true)[1] / 2) + 1;
    private static final int tp = (MxO.mZx("", 0.0f, true)[1] / 2) + 3;
    LinearLayout EYQ;
    private Drawable IPb;
    private Drawable Kbd;
    private float Pm;
    private float QQ;
    private float Td;
    private double VwS;
    LinearLayout mZx;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.EYQ = new LinearLayout(getContext());
        this.mZx = new LinearLayout(getContext());
        this.EYQ.setOrientation(0);
        this.EYQ.setGravity(GravityCompat.START);
        this.mZx.setOrientation(0);
        this.mZx.setGravity(GravityCompat.START);
        this.Kbd = zF.Td(context, "tt_star_thick");
        this.IPb = zF.Td(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.Kbd;
    }

    public Drawable getStarFillDrawable() {
        return this.IPb;
    }

    public void EYQ(double d, int i, int i2, int i3) {
        float f = i2;
        this.Td = (int) IPb.Td(getContext(), f);
        this.Pm = (int) IPb.Td(getContext(), f);
        this.VwS = d;
        this.QQ = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.mZx.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.EYQ.addView(starImageView2);
        }
        addView(this.EYQ);
        addView(this.mZx);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.Td, (int) this.Pm));
        imageView.setPadding(1, HX, 1, tp);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.EYQ.measure(i, i2);
        double d = this.VwS;
        float f = this.Td;
        this.mZx.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d) * f) + 1.0f + ((f - 2.0f) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.EYQ.getMeasuredHeight(), 1073741824));
        if (this.QQ > 0.0f) {
            this.EYQ.setPadding(0, ((int) (r7.getMeasuredHeight() - this.QQ)) / 2, 0, 0);
            this.mZx.setPadding(0, ((int) (this.EYQ.getMeasuredHeight() - this.QQ)) / 2, 0, 0);
        }
    }
}
