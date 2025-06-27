package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;

/* compiled from: DynamicShadowDrawable.java */
/* loaded from: classes2.dex */
public class Td extends Drawable {
    private Paint EYQ;
    private RectF Pm;
    private int Td;
    private int mZx;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Td(int i, int i2) {
        this.Td = i;
        this.mZx = i2;
        Paint paint = new Paint();
        this.EYQ = paint;
        paint.setColor(0);
        this.EYQ.setAntiAlias(true);
        this.EYQ.setShadowLayer(i2, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.EYQ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.mZx;
        this.Pm = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.Pm;
        int i = this.Td;
        canvas.drawRoundRect(rectF, i, i, this.EYQ);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.EYQ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.EYQ.setColorFilter(colorFilter);
    }
}
