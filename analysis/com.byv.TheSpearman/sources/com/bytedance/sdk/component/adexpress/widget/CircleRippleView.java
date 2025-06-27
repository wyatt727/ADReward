package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CircleRippleView extends View {
    private int EYQ;
    private List<Integer> HX;
    private int IPb;
    private float Kbd;
    private Paint MxO;
    private int Pm;
    private List<Integer> QQ;
    private float Td;
    private boolean VwS;
    private int mZx;
    private int nWX;
    private float pi;
    private Paint tp;
    private float tsL;

    public CircleRippleView(Context context) {
        this(context, null);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.EYQ = -1;
        this.mZx = -65536;
        this.Td = 18.0f;
        this.Pm = 3;
        this.Kbd = 50.0f;
        this.IPb = 2;
        this.VwS = false;
        this.QQ = new ArrayList();
        this.HX = new ArrayList();
        this.nWX = 24;
        Td();
    }

    private void Td() {
        Paint paint = new Paint();
        this.tp = paint;
        paint.setAntiAlias(true);
        this.tp.setStrokeWidth(this.nWX);
        this.QQ.add(255);
        this.HX.add(0);
        Paint paint2 = new Paint();
        this.MxO = paint2;
        paint2.setAntiAlias(true);
        this.MxO.setColor(Color.parseColor("#0FFFFFFF"));
        this.MxO.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.tsL = f;
        this.pi = i2 / 2.0f;
        float f2 = f - (this.nWX / 2.0f);
        this.Kbd = f2;
        this.Td = f2 / 4.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.tp.setShader(new LinearGradient(this.tsL, 0.0f, this.pi, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.QQ.size()) {
                break;
            }
            Integer num = this.QQ.get(i);
            this.tp.setAlpha(num.intValue());
            Integer num2 = this.HX.get(i);
            if (this.Td + num2.intValue() < this.Kbd) {
                canvas.drawCircle(this.tsL, this.pi, this.Td + num2.intValue(), this.tp);
            }
            if (num.intValue() > 0 && num2.intValue() < this.Kbd) {
                this.QQ.set(i, Integer.valueOf(num.intValue() - this.IPb > 0 ? num.intValue() - (this.IPb * 3) : 1));
                this.HX.set(i, Integer.valueOf(num2.intValue() + this.IPb));
            }
            i++;
        }
        List<Integer> list = this.HX;
        if (list.get(list.size() - 1).intValue() >= this.Kbd / this.Pm) {
            this.QQ.add(255);
            this.HX.add(0);
        }
        if (this.HX.size() >= 3) {
            this.HX.remove(0);
            this.QQ.remove(0);
        }
        this.tp.setAlpha(255);
        this.tp.setColor(this.mZx);
        canvas.drawCircle(this.tsL, this.pi, this.Td, this.MxO);
        if (this.VwS) {
            invalidate();
        }
    }

    public void EYQ() {
        this.VwS = true;
        invalidate();
    }

    public void mZx() {
        this.VwS = false;
        this.HX.clear();
        this.QQ.clear();
        this.QQ.add(255);
        this.HX.add(0);
        invalidate();
    }

    public void setColor(int i) {
        this.EYQ = i;
    }

    public void setCoreColor(int i) {
        this.mZx = i;
    }

    public void setCoreRadius(int i) {
        this.Td = i;
    }

    public void setDiffuseWidth(int i) {
        this.Pm = i;
    }

    public void setMaxWidth(int i) {
        this.Kbd = i;
    }

    public void setDiffuseSpeed(int i) {
        this.IPb = i;
    }
}
