package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes2.dex */
public class UGTextView extends TextView implements IAnimation {
    private com.bytedance.adsdk.ugeno.mZx EYQ;
    private float mZx;

    public UGTextView(Context context) {
        super(context);
    }

    public void EYQ(com.bytedance.adsdk.ugeno.mZx mzx) {
        this.EYQ = mzx;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.mZx mzx = this.EYQ;
        if (mzx != null) {
            int[] iArrEYQ = mzx.EYQ(i, i2);
            super.onMeasure(iArrEYQ[0], iArrEYQ[1]);
        } else {
            super.onMeasure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.EYQ(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.mZx;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.mZx = f;
        postInvalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.EYQ(canvas, this);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.mZx(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.VwS();
        }
    }
}
