package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes2.dex */
public class DislikeView extends View {
    private int EYQ;
    private int IPb;
    private Paint Kbd;
    private Paint Pm;
    private int QQ;
    private final RectF Td;
    private Paint VwS;
    private int mZx;

    public DislikeView(Context context) {
        super(context);
        this.Td = new RectF();
        EYQ();
    }

    private void EYQ() {
        Paint paint = new Paint();
        this.Pm = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.VwS = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.Kbd = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.IPb = i;
    }

    public void setDislikeColor(int i) {
        this.VwS.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.VwS.setStrokeWidth(i);
    }

    public void setStrokeColor(int i) {
        this.Pm.setStyle(Paint.Style.STROKE);
        this.Pm.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.Pm.setStrokeWidth(i);
        this.QQ = i;
    }

    public void setBgColor(int i) {
        this.Kbd.setStyle(Paint.Style.FILL);
        this.Kbd.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.Td;
        int i = this.IPb;
        canvas.drawRoundRect(rectF, i, i, this.Kbd);
        RectF rectF2 = this.Td;
        int i2 = this.IPb;
        canvas.drawRoundRect(rectF2, i2, i2, this.Pm);
        int i3 = this.EYQ;
        int i4 = this.mZx;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.VwS);
        int i5 = this.EYQ;
        int i6 = this.mZx;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.VwS);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.EYQ = i;
        this.mZx = i2;
        RectF rectF = this.Td;
        int i5 = this.QQ;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }
}
