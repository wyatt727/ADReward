package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class TwoSemicirclesView extends View {
    private final RectF EYQ;
    private final int HX;
    private float IPb;
    private Paint Kbd;
    private Paint Pm;
    private final int QQ;
    private int Td;
    private float VwS;
    private int mZx;

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IPb = -90.0f;
        this.VwS = 220.0f;
        this.QQ = Color.parseColor("#FFFFFF");
        this.HX = Color.parseColor("#C4C4C4");
        EYQ();
        float f = this.VwS;
        this.EYQ = new RectF(-f, -f, f, f);
    }

    private void EYQ() {
        Paint paint = new Paint();
        this.Pm = paint;
        paint.setColor(this.QQ);
        this.Pm.setStyle(Paint.Style.STROKE);
        this.Pm.setStrokeWidth(4.0f);
        this.Pm.setAlpha(20);
        Paint paint2 = new Paint(this.Pm);
        this.Kbd = paint2;
        paint2.setColor(this.HX);
        this.Kbd.setAlpha(255);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mZx = i;
        this.Td = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.EYQ;
        float f = this.VwS;
        rectF.set(-f, -f, f, f);
        canvas.translate(this.mZx / 2, this.Td / 2);
        canvas.drawArc(this.EYQ, this.IPb, 180.0f, false, this.Pm);
        canvas.drawArc(this.EYQ, this.IPb + 180.0f, 180.0f, false, this.Kbd);
    }

    public void setCurrentStartAngle(float f) {
        this.IPb = f;
        postInvalidate();
    }

    public void setRadius(float f) {
        this.VwS = f;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.Pm = paint;
        postInvalidate();
    }

    public Paint getPaintOne() {
        return this.Pm;
    }

    public void setPaintTwo(Paint paint) {
        this.Kbd = paint;
        postInvalidate();
    }

    public Paint getPaintTwo() {
        return this.Kbd;
    }
}
