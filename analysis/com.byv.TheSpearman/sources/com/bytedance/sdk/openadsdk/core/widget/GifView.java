package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.IPb;
import com.bytedance.sdk.component.utils.pi;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public class GifView extends ImageView {
    private int EYQ;
    private float HX;
    private boolean IPb;
    private boolean KO;
    private AnimatedImageDrawable Kbd;
    private int MxO;
    private int Pm;
    private float QQ;
    private long Td;
    private boolean VwS;
    private Movie mZx;
    private boolean nWX;
    private volatile boolean pi;
    private float tp;
    private int tsL;

    public GifView(Context context) {
        super(context);
        this.IPb = Build.VERSION.SDK_INT >= 28;
        this.VwS = false;
        this.nWX = true;
        this.KO = true;
        EYQ();
    }

    void EYQ() {
        if (this.IPb) {
            return;
        }
        setLayerType(1, null);
    }

    public void EYQ(int i, boolean z) {
        this.pi = z;
        this.EYQ = i;
        if (i != -1) {
            if (!this.IPb) {
                this.mZx = EYQ(i);
            } else {
                this.Kbd = mZx(i);
            }
        }
    }

    public void EYQ(byte[] bArr, boolean z) {
        this.pi = z;
        if (bArr != null) {
            if (!this.IPb) {
                this.mZx = EYQ(bArr);
            } else {
                this.Kbd = mZx(bArr);
            }
            mZx();
        }
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.KO = z;
        if (z) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.Kbd) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e) {
            pi.EYQ("GifView", "setRepeatConfig error", e);
        }
    }

    private Movie EYQ(int i) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Movie EYQ(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    private AnimatedImageDrawable mZx(int i) {
        if (i != -1 && Build.VERSION.SDK_INT >= 28) {
            return EYQ(ImageDecoder.createSource(getResources(), i));
        }
        return null;
    }

    private AnimatedImageDrawable mZx(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return EYQ(Td(bArr));
    }

    private ImageDecoder.Source Td(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            File fileEYQ = EYQ(getContext(), com.bytedance.sdk.openadsdk.multipro.mZx.Td() ? "GIF_AD_CACHE/" : "/GIF_CACHE/", "TT_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileEYQ);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(fileEYQ);
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return sourceCreateSource;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    pi.EYQ("GifView", "GifView  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.close();
        } catch (Throwable unused3) {
        }
        return null;
    }

    private AnimatedImageDrawable EYQ(ImageDecoder.Source source) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source);
        setImageDrawable(drawableDecodeDrawable);
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawableDecodeDrawable;
            if (!this.pi) {
                animatedImageDrawable.start();
            }
            return animatedImageDrawable;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.IPb || (movie = this.mZx) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.mZx.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i2) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i2))) ? 1.0f : iHeight / size);
        this.tp = fMax;
        int i3 = (int) (iWidth * fMax);
        this.MxO = i3;
        int i4 = (int) (iHeight * fMax);
        this.tsL = i4;
        setMeasuredDimension(i3, i4);
    }

    public static File EYQ(Context context, String str, String str2) {
        return IPb.EYQ(context, com.bytedance.sdk.openadsdk.multipro.mZx.Td(), str, str2);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mZx != null && !this.IPb) {
            this.QQ = (getWidth() - this.MxO) / 2.0f;
            this.HX = (getHeight() - this.tsL) / 2.0f;
        }
        this.nWX = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mZx != null && !this.IPb) {
            try {
                if (!this.pi) {
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
        if (this.mZx == null || this.IPb || !this.nWX) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            invalidate();
        }
    }

    private void Td() {
        if (this.mZx == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.Td == 0) {
            this.Td = jUptimeMillis;
        }
        int iDuration = this.mZx.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (!this.KO && Math.abs(iDuration - this.Pm) < 60) {
            this.Pm = iDuration;
            this.pi = true;
        } else {
            this.Pm = (int) ((jUptimeMillis - this.Td) % iDuration);
        }
    }

    private void EYQ(Canvas canvas) {
        Movie movie = this.mZx;
        if (movie == null) {
            return;
        }
        movie.setTime(this.Pm);
        float f = this.tp;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.mZx.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.mZx;
            float f2 = this.QQ;
            float f3 = this.tp;
            movie2.draw(canvas, f2 / f3, this.HX / f3);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.mZx != null) {
            this.nWX = i == 1;
            mZx();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.mZx != null) {
            this.nWX = i == 0;
            mZx();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.mZx != null) {
            this.nWX = i == 0;
            mZx();
        }
    }
}
