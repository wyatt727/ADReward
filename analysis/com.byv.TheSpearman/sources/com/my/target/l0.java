package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class l0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final GradientDrawable f4034a;
    public int b;

    public l0(Context context) {
        this(context, null);
    }

    public l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public l0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f4034a = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.b = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }

    public void a(int i, int i2) {
        a(i, i2, 0);
    }

    public void a(int i, int i2, int i3) {
        this.f4034a.setStroke(i, i2);
        this.f4034a.setCornerRadius(i3);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f4034a.setBounds(getPaddingLeft() - this.b, getPaddingTop(), getWidth(), getHeight());
        this.f4034a.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + (this.b * 2), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f4034a.setColor(i);
        invalidate();
    }
}
