package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.pi;

/* loaded from: classes2.dex */
public class GifView extends ImageView {
    private Movie EYQ;
    private float HX;
    private boolean IPb;
    private boolean Kbd;
    private int MxO;
    private AnimatedImageDrawable Pm;
    private float QQ;
    private int Td;
    private float VwS;
    private long mZx;
    private boolean nWX;
    private boolean pi;
    private int tp;
    private volatile boolean tsL;

    public GifView(Context context) {
        super(context);
        this.Kbd = Build.VERSION.SDK_INT >= 28;
        this.IPb = false;
        this.pi = true;
        this.nWX = true;
        EYQ();
    }

    void EYQ() {
        if (this.Kbd) {
            return;
        }
        setLayerType(1, null);
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            this.Pm = animatedImageDrawable;
            if (!this.tsL) {
                animatedImageDrawable.start();
            }
            if (!this.nWX) {
                animatedImageDrawable.setRepeatCount(0);
            }
        }
        mZx();
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.nWX = z;
        if (z) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.Pm) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e) {
            pi.EYQ("GifView", "setRepeatConfig error", e);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.Kbd || (movie = this.EYQ) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.EYQ.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i2) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i2))) ? 1.0f : iHeight / size);
        this.HX = fMax;
        int i3 = (int) (iWidth * fMax);
        this.tp = i3;
        int i4 = (int) (iHeight * fMax);
        this.MxO = i4;
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.EYQ != null && !this.Kbd) {
            this.VwS = (getWidth() - this.tp) / 2.0f;
            this.QQ = (getHeight() - this.MxO) / 2.0f;
        }
        this.pi = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.EYQ != null && !this.Kbd) {
            try {
                if (!this.tsL) {
                    Td();
                    EYQ(canvas);
                    mZx();
                    return;
                }
                EYQ(canvas);
                return;
            } catch (Throwable th) {
                pi.EYQ("GifView", "onDraw->Throwable->", th);
                return;
            }
        }
        super.onDraw(canvas);
    }

    private void mZx() {
        if (this.EYQ == null || this.Kbd || !this.pi) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            invalidate();
        }
    }

    private void Td() {
        if (this.EYQ == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.mZx == 0) {
            this.mZx = jUptimeMillis;
        }
        int iDuration = this.EYQ.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (!this.nWX && Math.abs(iDuration - this.Td) < 60) {
            this.Td = iDuration;
            this.tsL = true;
        } else {
            this.Td = (int) ((jUptimeMillis - this.mZx) % iDuration);
        }
    }

    private void EYQ(Canvas canvas) {
        Movie movie = this.EYQ;
        if (movie == null) {
            return;
        }
        movie.setTime(this.Td);
        float f = this.HX;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.EYQ.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.EYQ;
            float f2 = this.VwS;
            float f3 = this.HX;
            movie2.draw(canvas, f2 / f3, this.QQ / f3);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.EYQ != null) {
            this.pi = i == 1;
            mZx();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.EYQ != null) {
            this.pi = i == 0;
            mZx();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.EYQ != null) {
            this.pi = i == 0;
            mZx();
        }
    }
}
