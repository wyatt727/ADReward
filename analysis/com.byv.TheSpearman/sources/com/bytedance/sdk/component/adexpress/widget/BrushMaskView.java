package com.bytedance.sdk.component.adexpress.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import com.bytedance.sdk.component.utils.pi;

/* loaded from: classes2.dex */
public class BrushMaskView extends View {
    private static final String EYQ = "BrushMaskView";
    private Path HX;
    private BitmapDrawable IPb;
    private Paint Kbd;
    private Canvas Pm;
    private Path QQ;
    private Bitmap Td;
    private Paint VwS;
    private Paint mZx;
    private Paint tp;

    public BrushMaskView(Context context) {
        super(context);
        EYQ(context);
    }

    private void EYQ(Context context) {
        Paint paint = new Paint();
        this.mZx = paint;
        paint.setAntiAlias(true);
        this.mZx.setDither(true);
        setMaskColor(-1426063361);
        Paint paint2 = new Paint();
        this.Kbd = paint2;
        paint2.setAntiAlias(true);
        this.Kbd.setDither(true);
        Paint paint3 = new Paint();
        this.tp = paint3;
        paint3.setColor(-7829368);
        this.tp.setAlpha(100);
        this.tp.setAntiAlias(true);
        this.tp.setDither(true);
        this.tp.setStyle(Paint.Style.STROKE);
        this.tp.setStrokeCap(Paint.Cap.ROUND);
        if (Build.VERSION.SDK_INT >= 21) {
            setWatermark(-1);
        } else {
            setMaskColor(-1426063361);
        }
        Paint paint4 = new Paint();
        this.VwS = paint4;
        paint4.setAntiAlias(true);
        this.VwS.setDither(true);
        this.VwS.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.VwS.setStyle(Paint.Style.STROKE);
        this.VwS.setStrokeCap(Paint.Cap.ROUND);
        setEraserSize(60.0f);
        this.QQ = new Path();
        this.HX = new Path();
    }

    public void setEraserSize(float f) {
        this.VwS.setStrokeWidth(f);
        this.tp.setStrokeWidth(f);
    }

    public void setMaskColor(int i) {
        this.mZx.setColor(i);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(EYQ(i), EYQ(i2));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.Td;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.Kbd);
        }
    }

    public void EYQ(float f, float f2) {
        mZx(f, f2);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        EYQ(i, i2);
    }

    private void EYQ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.Td = bitmapCreateBitmap;
            Canvas canvas = this.Pm;
            if (canvas == null) {
                this.Pm = new Canvas(this.Td);
            } else {
                canvas.setBitmap(bitmapCreateBitmap);
            }
            this.Pm.drawRoundRect(new RectF(0.0f, 0.0f, i, i2), 120.0f, 120.0f, this.mZx);
            if (this.IPb != null) {
                this.IPb.setBounds(new Rect(0, 0, i, i2));
                this.IPb.draw(this.Pm);
            }
        } catch (Exception e) {
            pi.EYQ(EYQ, e.getMessage());
        }
    }

    private int EYQ(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(0, size);
        }
        return 0;
    }

    private void mZx(float f, float f2) {
        this.QQ.reset();
        this.HX.reset();
        this.QQ.moveTo(f, f2);
        this.HX.moveTo(f, f2);
    }

    public void setWatermark(int i) {
        if (i == -1) {
            this.IPb = null;
        } else {
            this.IPb = new BitmapDrawable(BitmapFactory.decodeResource(getResources(), i));
        }
    }

    public void EYQ() {
        EYQ(getWidth(), getHeight());
        invalidate();
    }

    public void mZx() {
        Td();
    }

    public void Td() {
        final int width = getWidth();
        final int height = getHeight();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setIntValues(0, width);
        valueAnimator.setInterpolator(new TimeInterpolator() { // from class: com.bytedance.sdk.component.adexpress.widget.BrushMaskView.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                int i = (int) (width * f);
                if (BrushMaskView.this.Pm != null) {
                    Canvas canvas = BrushMaskView.this.Pm;
                    int i2 = height;
                    canvas.drawRect(0.0f, i2 / 2, i - 50, i2 / 2, BrushMaskView.this.VwS);
                    BrushMaskView.this.Pm.drawCircle(i, height / 2, 10.0f, BrushMaskView.this.VwS);
                }
                BrushMaskView.this.postInvalidate();
                return f;
            }
        });
        valueAnimator.start();
    }
}
