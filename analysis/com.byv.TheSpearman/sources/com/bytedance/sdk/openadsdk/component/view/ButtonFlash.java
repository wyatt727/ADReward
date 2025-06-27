package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class ButtonFlash extends TextView {
    private int EYQ;
    private Matrix IPb;
    private RectF Kbd;
    private LinearGradient Pm;
    private boolean QQ;
    private Paint Td;
    private ValueAnimator VwS;
    private int mZx;

    public ButtonFlash(Context context) {
        super(context);
        this.QQ = true;
        mZx();
    }

    private void mZx() {
        this.Kbd = new RectF();
        this.Td = new Paint();
        Td();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.EYQ = i;
        this.mZx = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.EYQ / 2.0f, this.mZx, new int[]{ViewCompat.MEASURED_SIZE_MASK, 1358954495, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.Pm = linearGradient;
        this.Td.setShader(linearGradient);
        this.Td.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.IPb = matrix;
        matrix.setTranslate(-this.EYQ, this.mZx);
        this.Pm.setLocalMatrix(this.IPb);
        this.Kbd.set(0.0f, 0.0f, this.EYQ, this.mZx);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.IPb != null) {
            canvas.drawRoundRect(this.Kbd, 100.0f, 100.0f, this.Td);
        }
    }

    private void Td() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.VwS = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        this.VwS.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.view.ButtonFlash.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((ButtonFlash.this.EYQ * 2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ButtonFlash.this.EYQ;
                if (ButtonFlash.this.IPb != null) {
                    ButtonFlash.this.IPb.setTranslate(fFloatValue, ButtonFlash.this.mZx);
                }
                if (ButtonFlash.this.Pm != null) {
                    ButtonFlash.this.Pm.setLocalMatrix(ButtonFlash.this.IPb);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.QQ) {
            this.VwS.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.VwS;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void setAutoRun(boolean z) {
        this.QQ = z;
    }

    public void EYQ() {
        ValueAnimator valueAnimator = this.VwS;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.VwS.cancel();
            invalidate();
        }
    }
}
