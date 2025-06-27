package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* loaded from: classes4.dex */
public class ka extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4032a;
    public final Paint b;
    public final Paint c;
    public final ca d;
    public RectF e;
    public long f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public int l;

    public ka(Context context) {
        super(context);
        this.f4032a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.e = new RectF();
        this.f = 0L;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 230.0f;
        this.j = false;
        ca caVarE = ca.e(context);
        this.d = caVarE;
        this.l = caVarE.b(28);
    }

    public final void a() {
        this.f4032a.setColor(-1);
        this.f4032a.setAntiAlias(true);
        this.f4032a.setStyle(Paint.Style.STROKE);
        this.f4032a.setStrokeWidth(this.d.b(1));
        this.b.setColor(-2013265920);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setStrokeWidth(this.d.b(4));
    }

    public final void a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.e = new RectF(getPaddingLeft() + this.d.b(1), paddingTop + this.d.b(1), (i - getPaddingRight()) - this.d.b(1), (i2 - paddingBottom) - this.d.b(1));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.e, this.b);
        if (this.g != this.h) {
            this.g = Math.min(this.g + (((SystemClock.uptimeMillis() - this.f) / 1000.0f) * this.i), this.h);
            this.f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        float f = this.g;
        if (isInEditMode()) {
            f = 360.0f;
        }
        canvas.drawArc(this.e, -90.0f, f, false, this.f4032a);
        this.c.setColor(-1);
        this.c.setTextSize(this.d.b(12));
        this.c.setTextAlign(Paint.Align.CENTER);
        this.c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.k), (int) this.e.centerX(), (int) (this.e.centerY() - ((this.c.descent() + this.c.ascent()) / 2.0f)), this.c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft = this.l + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.l + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
        a();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.j) {
            this.g = 0.0f;
            this.j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.h;
        if (f == f2) {
            return;
        }
        if (this.g == f2) {
            this.f = SystemClock.uptimeMillis();
        }
        this.h = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setSize(int i) {
        this.l = i;
    }
}
