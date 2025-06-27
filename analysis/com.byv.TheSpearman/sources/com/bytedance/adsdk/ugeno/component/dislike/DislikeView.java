package com.bytedance.adsdk.ugeno.component.dislike;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.adsdk.ugeno.mZx;

/* loaded from: classes2.dex */
public class DislikeView extends View {
    private mZx EYQ;
    private int HX;
    private Paint IPb;
    private Paint Kbd;
    private RectF Pm;
    private Paint QQ;
    private int Td;
    private float VwS;
    private int mZx;

    public DislikeView(Context context) {
        super(context);
        EYQ();
    }

    private void EYQ() {
        Paint paint = new Paint();
        this.Kbd = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.QQ = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.IPb = paint3;
        paint3.setAntiAlias(true);
        setBackgroundColor(0);
    }

    public void setRadius(float f) {
        this.VwS = f;
    }

    public void setDislikeColor(int i) {
        this.QQ.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.QQ.setStrokeWidth(i);
    }

    public void setStrokeColor(int i) {
        this.Kbd.setStyle(Paint.Style.STROKE);
        this.Kbd.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.Kbd.setStrokeWidth(i);
        this.HX = i;
    }

    public void setBgColor(int i) {
        this.IPb.setStyle(Paint.Style.FILL);
        this.IPb.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(0);
        RectF rectF = this.Pm;
        float f = this.VwS;
        canvas.drawRoundRect(rectF, f, f, this.IPb);
        RectF rectF2 = this.Pm;
        float f2 = this.VwS;
        canvas.drawRoundRect(rectF2, f2, f2, this.Kbd);
        int i = this.mZx;
        int i2 = this.Td;
        canvas.drawLine(i * 0.3f, i2 * 0.3f, i * 0.7f, i2 * 0.7f, this.QQ);
        int i3 = this.mZx;
        int i4 = this.Td;
        canvas.drawLine(i3 * 0.7f, i4 * 0.3f, i3 * 0.3f, i4 * 0.7f, this.QQ);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mZx = i;
        this.Td = i2;
        int i5 = this.HX;
        this.Pm = new RectF(i5, i5, this.mZx - i5, this.Td - i5);
    }

    public void EYQ(com.bytedance.adsdk.ugeno.component.mZx mzx) {
        this.EYQ = mzx;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.VwS();
        }
    }
}
