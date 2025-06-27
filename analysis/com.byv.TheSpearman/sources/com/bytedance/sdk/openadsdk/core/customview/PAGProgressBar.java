package com.bytedance.sdk.openadsdk.core.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class PAGProgressBar extends FrameLayout {
    private int EYQ;
    private boolean IPb;
    private Drawable Kbd;
    private Drawable Pm;
    private boolean QQ;
    private Drawable Td;
    private ValueAnimator VwS;
    private int mZx;

    public void setProgress(int i) {
        this.mZx = i;
        Drawable drawable = this.Td;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.EYQ));
        }
    }

    public void setMax(int i) {
        this.EYQ = i;
    }

    public void setProgressDrawable(Drawable drawable) {
        this.Pm = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.Pm;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.Pm).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.Td = drawable3;
                }
            }
        }
        Drawable drawable4 = this.Pm;
        if (drawable4 instanceof RotateDrawable) {
            this.Td = drawable4;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.Kbd = drawable;
        setProgressDrawable(drawable);
        if (this.IPb && this.VwS == null) {
            EYQ();
        }
    }

    public PAGProgressBar(Context context) {
        super(context);
        this.EYQ = 100;
    }

    public PAGProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.EYQ = 100;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(EYQ.EYQ(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.setPaddingRelative(i, i2, i3, i4);
        } else {
            super.setPadding(i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.IPb = true;
        if (this.Kbd != null) {
            EYQ();
        }
    }

    private void EYQ() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.VwS = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.VwS.setRepeatCount(-1);
        this.VwS.setInterpolator(new LinearInterpolator());
        this.VwS.setRepeatMode(1);
        this.VwS.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PAGProgressBar.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.VwS.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.IPb = false;
        ValueAnimator valueAnimator = this.VwS;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.VwS.removeAllUpdateListeners();
            this.VwS = null;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        ValueAnimator valueAnimator;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.QQ) {
                this.QQ = false;
                if (Build.VERSION.SDK_INT >= 19 && (valueAnimator = this.VwS) != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    EYQ();
                    return;
                }
            }
            return;
        }
        if (this.VwS == null || this.QQ) {
            return;
        }
        this.QQ = true;
        if (Build.VERSION.SDK_INT >= 19) {
            this.VwS.pause();
            return;
        }
        this.VwS.cancel();
        this.VwS.removeAllUpdateListeners();
        this.VwS = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
