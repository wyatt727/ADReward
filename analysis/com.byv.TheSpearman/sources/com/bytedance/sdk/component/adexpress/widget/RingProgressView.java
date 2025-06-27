package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes2.dex */
public class RingProgressView extends View {
    private Context EYQ;
    private int IPb;
    private ValueAnimator Kbd;
    private float Pm;
    private RectF Td;
    private boolean VwS;
    private Paint mZx;

    public RingProgressView(Context context) {
        super(context);
        this.IPb = 1500;
        this.EYQ = context;
        Paint paint = new Paint();
        this.mZx = paint;
        paint.setAntiAlias(true);
        this.mZx.setStyle(Paint.Style.STROKE);
        this.mZx.setStrokeWidth(10.0f);
        this.mZx.setColor(Color.parseColor("#80FFFFFF"));
        this.Td = new RectF();
    }

    public void EYQ() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.Kbd = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.IPb);
        this.Kbd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RingProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RingProgressView.this.Pm = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.Kbd.start();
    }

    public void mZx() {
        ValueAnimator valueAnimator = this.Kbd;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void Td() {
        this.VwS = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.IPb = i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.VwS) {
            return;
        }
        canvas.drawArc(this.Td, 270.0f, this.Pm, false, this.mZx);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Td.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
