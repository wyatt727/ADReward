package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.MBImageView;

/* loaded from: classes4.dex */
public class RoundImageView extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f3902a;
    private int b;
    private Paint c;
    private int d;
    private Matrix e;
    private BitmapShader f;
    private int g;
    private RectF h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Matrix();
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f3902a = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Matrix();
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f3902a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.e = new Matrix();
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f3902a = 1;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3902a == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.g = iMin;
            this.d = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapA;
        try {
            if (getDrawable() == null) {
                return;
            }
            try {
                Drawable drawable = getDrawable();
                if (drawable != null && (bitmapA = a(drawable)) != null && !bitmapA.isRecycled()) {
                    this.f = new BitmapShader(bitmapA, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    int i = this.f3902a;
                    float fMax = 1.0f;
                    if (i == 0) {
                        fMax = (this.g * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
                    } else if (i == 1) {
                        fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
                    }
                    this.e.setScale(fMax, fMax);
                    this.f.setLocalMatrix(this.e);
                    this.c.setShader(this.f);
                }
            } catch (Throwable th) {
                ad.b("RoundImageView", th.getMessage());
            }
            if (this.f3902a == 1) {
                RectF rectF = this.h;
                int i2 = this.b;
                canvas.drawRoundRect(rectF, i2, i2, this.c);
            } else {
                int i3 = this.d;
                canvas.drawCircle(i3, i3, i3, this.c);
            }
        } catch (Throwable th2) {
            ad.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f3902a == 1) {
            this.h = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f3902a);
        bundle.putInt("state_border_radius", this.b);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.f3902a = bundle.getInt("state_type");
            this.b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setBorderRadius(int i) {
        int iA = ai.a(getContext(), i);
        if (this.b != iA) {
            this.b = iA;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f3902a != i) {
            this.f3902a = i;
            if (i != 1 && i != 0) {
                this.f3902a = 0;
            }
            requestLayout();
        }
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            ad.b("View", th.getMessage());
            return null;
        }
    }
}
