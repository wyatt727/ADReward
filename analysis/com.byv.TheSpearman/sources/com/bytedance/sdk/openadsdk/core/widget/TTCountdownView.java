package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTCountdownView extends View {
    public static final String EYQ = zF.EYQ(hu.EYQ(), "tt_count_down_view");
    private Paint HX;
    private float IPb;
    private EYQ KO;
    private float Kbd;
    private Paint MxO;
    private int Pm;
    private Paint QQ;
    private float Td;
    private ValueAnimator UB;
    private ValueAnimator Uc;
    private final String VwS;
    private ValueAnimator hYh;
    private AnimatorSet hu;
    private float mZx;
    private RectF nWX;
    private float pi;
    private Paint tp;
    private float tsL;

    public interface EYQ {
    }

    public float EYQ(float f, float f2) {
        return f * f2;
    }

    public float EYQ(float f, int i) {
        return i * f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            size = mZx();
        }
        if (mode2 != 1073741824) {
            size2 = mZx();
        }
        setMeasuredDimension(size, size2);
    }

    private int mZx() {
        return (int) ((((this.mZx / 2.0f) + this.Td) * 2.0f) + tr.mZx(getContext(), 4.0f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        mZx(canvas);
        EYQ(canvas);
    }

    private void EYQ(Canvas canvas) {
        canvas.save();
        Paint.FontMetrics fontMetrics = this.MxO.getFontMetrics();
        String str = this.VwS;
        if (TextUtils.isEmpty(str)) {
            str = EYQ;
        }
        canvas.drawText(str, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.MxO);
        canvas.restore();
    }

    private void mZx(Canvas canvas) {
        canvas.save();
        float fEYQ = EYQ(this.tsL, 360);
        float f = this.Pm;
        canvas.drawCircle(0.0f, 0.0f, this.Td, this.HX);
        canvas.drawCircle(0.0f, 0.0f, this.Td, this.tp);
        canvas.drawArc(this.nWX, f, fEYQ, false, this.QQ);
        canvas.restore();
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.UB;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.UB = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pi, 0.0f);
        this.UB = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.UB.setDuration((long) (EYQ(this.pi, this.IPb) * 1000.0f));
        this.UB.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.pi = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.UB;
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.Uc;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Uc = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.tsL, 0.0f);
        this.Uc = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.Uc.setDuration((long) (EYQ(this.tsL, this.Kbd) * 1000.0f));
        this.Uc.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.tsL = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.Uc;
    }

    public void EYQ() {
        AnimatorSet animatorSet = this.hu;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.hu = null;
        }
        ValueAnimator valueAnimator = this.hYh;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.hYh = null;
        }
        ValueAnimator valueAnimator2 = this.UB;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.UB = null;
        }
        ValueAnimator valueAnimator3 = this.Uc;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.Uc = null;
        }
        this.tsL = 1.0f;
        this.pi = 1.0f;
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        EYQ();
        super.onDetachedFromWindow();
    }

    public void setCountDownTime(int i) {
        float f = i;
        this.IPb = f;
        this.Kbd = f;
        EYQ();
    }

    public EYQ getCountdownListener() {
        return this.KO;
    }

    public void setCountdownListener(EYQ eyq) {
        this.KO = eyq;
    }
}
