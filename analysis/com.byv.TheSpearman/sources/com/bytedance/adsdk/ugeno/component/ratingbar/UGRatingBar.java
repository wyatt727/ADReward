package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.mZx;
import com.bytedance.adsdk.ugeno.mZx.Pm;
import com.bytedance.adsdk.ugeno.mZx.QQ;

/* loaded from: classes2.dex */
public class UGRatingBar extends FrameLayout {
    private float EYQ;
    private Context HX;
    private float IPb;
    private double Kbd;
    private Drawable Pm;
    private LinearLayout QQ;
    private Drawable Td;
    private LinearLayout VwS;
    private float mZx;
    private mZx tp;

    public UGRatingBar(Context context) {
        super(context);
        this.HX = context;
        this.VwS = new LinearLayout(context);
        this.QQ = new LinearLayout(context);
        this.VwS.setOrientation(0);
        this.VwS.setGravity(GravityCompat.START);
        this.QQ.setOrientation(0);
        this.QQ.setGravity(GravityCompat.START);
        this.Td = Pm.EYQ(context, "tt_star_thick");
        this.Pm = Pm.EYQ(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.Td;
    }

    public Drawable getStarFillDrawable() {
        return this.Pm;
    }

    public void EYQ(double d, int i, int i2, int i3) {
        removeAllViews();
        this.VwS.removeAllViews();
        this.QQ.removeAllViews();
        float f = i2;
        this.EYQ = (int) QQ.EYQ(this.HX, f);
        this.mZx = (int) QQ.EYQ(this.HX, f);
        this.Kbd = d;
        this.IPb = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.QQ.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.VwS.addView(starImageView2);
        }
        addView(this.VwS);
        addView(this.QQ);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.EYQ, (int) this.mZx);
        layoutParams.leftMargin = 1;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 1;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        mZx mzx = this.tp;
        if (mzx != null) {
            mzx.EYQ(i, i2);
        }
        super.onMeasure(i, i2);
        this.VwS.measure(i, i2);
        double dFloor = Math.floor(this.Kbd);
        this.QQ.measure(View.MeasureSpec.makeMeasureSpec((int) (((2.0f + r1) * dFloor) + 1.0d + ((this.Kbd - dFloor) * this.EYQ)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.VwS.getMeasuredHeight(), 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mZx mzx = this.tp;
        if (mzx != null) {
            mzx.EYQ(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mZx mzx = this.tp;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZx mzx = this.tp;
        if (mzx != null) {
            mzx.VwS();
        }
    }

    public void EYQ(mZx mzx) {
        this.tp = mzx;
    }
}
