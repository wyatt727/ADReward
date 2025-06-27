package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public class k2 extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4023a;
    public final Paint b;
    public final ColorFilter c;
    public final float d;
    public int e;
    public Bitmap f;
    public int g;
    public int h;

    public k2(Context context) {
        super(context);
        Paint paint = new Paint();
        this.b = paint;
        paint.setFilterBitmap(true);
        this.d = ca.a();
        this.e = ca.a(10, context);
        this.f4023a = new Rect();
        this.c = new LightingColorFilter(-3355444, 1);
    }

    public void a(Bitmap bitmap, boolean z) {
        int width;
        this.f = bitmap;
        if (bitmap == null) {
            width = 0;
            this.h = 0;
        } else if (!z) {
            this.g = bitmap.getWidth();
            this.h = this.f.getHeight();
            requestLayout();
        } else {
            float f = this.d > 1.0f ? 2.0f : 1.0f;
            this.h = (int) ((bitmap.getHeight() / f) * this.d);
            width = (int) ((this.f.getWidth() / f) * this.d);
        }
        this.g = width;
        requestLayout();
    }

    public int getPadding() {
        return this.e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f != null) {
            Rect rect = this.f4023a;
            int i = this.e;
            rect.left = i;
            rect.top = i;
            rect.right = getMeasuredWidth() - this.e;
            this.f4023a.bottom = getMeasuredHeight() - this.e;
            canvas.drawBitmap(this.f, (Rect) null, this.f4023a, this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            int r12 = android.view.View.MeasureSpec.getMode(r12)
            int r2 = r10.e
            int r2 = r2 * 2
            int r3 = r0 - r2
            int r2 = r1 - r2
            android.graphics.Bitmap r4 = r10.f
            if (r4 == 0) goto L64
            int r4 = r10.g
            if (r4 <= 0) goto L64
            int r5 = r10.h
            if (r5 <= 0) goto L64
            float r6 = (float) r4
            float r7 = (float) r5
            float r8 = r6 / r7
            r9 = 1073741824(0x40000000, float:2.0)
            if (r11 != r9) goto L32
            if (r12 != r9) goto L32
            r10.setMeasuredDimension(r0, r1)
            return
        L32:
            if (r11 != 0) goto L39
            if (r12 != 0) goto L39
            r3 = r4
            r2 = r5
            goto L5a
        L39:
            if (r11 != 0) goto L3f
            float r11 = (float) r2
            float r11 = r11 * r8
            int r3 = (int) r11
            goto L5a
        L3f:
            float r11 = (float) r3
            if (r12 != 0) goto L45
        L42:
            float r11 = r11 / r8
            int r2 = (int) r11
            goto L5a
        L45:
            float r12 = r11 / r6
            float r0 = (float) r2
            float r1 = r0 / r7
            float r1 = java.lang.Math.min(r12, r1)
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 != 0) goto L58
            r12 = 0
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 <= 0) goto L58
            goto L42
        L58:
            float r0 = r0 * r8
            int r3 = (int) r0
        L5a:
            int r11 = r10.e
            int r11 = r11 * 2
            int r3 = r3 + r11
            int r2 = r2 + r11
            r10.setMeasuredDimension(r3, r2)
            goto L68
        L64:
            r11 = 0
            r10.setMeasuredDimension(r11, r11)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.k2.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Paint paint;
        ColorFilter colorFilter;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            } else if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= getMeasuredWidth() && motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                performClick();
            }
            paint = this.b;
            colorFilter = null;
        } else {
            paint = this.b;
            colorFilter = this.c;
        }
        paint.setColorFilter(colorFilter);
        invalidate();
        return true;
    }

    public void setPadding(int i) {
        this.e = i;
    }
}
