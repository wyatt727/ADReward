package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public class RippleView extends View {
    private float EYQ;
    private Animator.AnimatorListener HX;
    private long IPb;
    private Paint Kbd;
    private ValueAnimator Pm;
    private float QQ;
    private ValueAnimator Td;
    private float VwS;
    private float mZx;
    private int tp;

    public RippleView(Context context, int i) {
        super(context);
        this.IPb = 300L;
        this.VwS = 0.0f;
        this.tp = i;
        EYQ();
    }

    public void EYQ() {
        Paint paint = new Paint(1);
        this.Kbd = paint;
        paint.setStyle(Paint.Style.FILL);
        this.Kbd.setColor(this.tp);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.EYQ = i / 2.0f;
        this.mZx = i2 / 2.0f;
        this.QQ = (float) (Math.hypot(i, i2) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.EYQ, this.mZx, this.VwS, this.Kbd);
    }

    public void mZx() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.QQ);
        this.Td = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.IPb);
        this.Td.setInterpolator(new LinearInterpolator());
        this.Td.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.VwS = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.Td.start();
    }

    public void Td() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.QQ, 0.0f);
        this.Pm = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.IPb);
        this.Pm.setInterpolator(new LinearInterpolator());
        this.Pm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.VwS = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.HX;
        if (animatorListener != null) {
            this.Pm.addListener(animatorListener);
        }
        this.Pm.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.HX = animatorListener;
    }
}
