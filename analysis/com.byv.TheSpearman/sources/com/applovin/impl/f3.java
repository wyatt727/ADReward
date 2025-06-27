package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class f3 extends View {
    private static final int x = Color.rgb(66, Opcodes.I2B, 241);
    private static final int y = Color.rgb(66, Opcodes.I2B, 241);
    private static final int z = Color.rgb(66, Opcodes.I2B, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f409a;
    private Paint b;
    protected Paint c;
    protected Paint d;
    private RectF f;
    private float g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private float m;
    private int n;
    private String o;
    private String p;
    private float q;
    private String r;
    private float s;
    private final float t;
    private final float u;
    private final float v;
    private final int w;

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public f3(Context context) {
        this(context, null);
    }

    protected void b() {
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setColor(this.h);
        this.c.setTextSize(this.g);
        this.c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.d = textPaint2;
        textPaint2.setColor(this.i);
        this.d.setTextSize(this.q);
        this.d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f409a = paint;
        paint.setColor(this.l);
        this.f409a.setStyle(Paint.Style.STROKE);
        this.f409a.setAntiAlias(true);
        this.f409a.setStrokeWidth(this.m);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(this.n);
        this.b.setAntiAlias(true);
    }

    protected void a() {
        this.l = x;
        this.h = y;
        this.g = this.u;
        setMax(100);
        setProgress(0);
        this.m = this.t;
        this.n = 0;
        this.q = this.v;
        this.i = z;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    public float getFinishedStrokeWidth() {
        return this.m;
    }

    public void setFinishedStrokeWidth(float f) {
        this.m = f;
        invalidate();
    }

    public f3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float getProgressAngle() {
        return (getProgress() / this.k) * 360.0f;
    }

    public int getProgress() {
        return this.j;
    }

    public void setProgress(int i) {
        this.j = i;
        if (i > getMax()) {
            this.j %= getMax();
        }
        invalidate();
    }

    public int getMax() {
        return this.k;
    }

    public void setMax(int i) {
        if (i > 0) {
            this.k = i;
            invalidate();
        }
    }

    public float getTextSize() {
        return this.g;
    }

    public void setTextSize(float f) {
        this.g = f;
        invalidate();
    }

    public int getTextColor() {
        return this.h;
    }

    public void setTextColor(int i) {
        this.h = i;
        invalidate();
    }

    public int getFinishedStrokeColor() {
        return this.l;
    }

    public void setFinishedStrokeColor(int i) {
        this.l = i;
        invalidate();
    }

    public String getSuffixText() {
        return this.p;
    }

    public void setSuffixText(String str) {
        this.p = str;
        invalidate();
    }

    public String getPrefixText() {
        return this.o;
    }

    public f3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new RectF();
        this.j = 0;
        this.o = "";
        this.p = "";
        this.r = "";
        this.u = a.d(getResources(), 14.0f);
        this.w = (int) a.c(getResources(), 100.0f);
        this.t = a.c(getResources(), 4.0f);
        this.v = a.d(getResources(), 18.0f);
        a();
        b();
    }

    public void setPrefixText(String str) {
        this.o = str;
        invalidate();
    }

    public int getInnerBackgroundColor() {
        return this.n;
    }

    public void setInnerBackgroundColor(int i) {
        this.n = i;
        invalidate();
    }

    public String getInnerBottomText() {
        return this.r;
    }

    public void setInnerBottomText(String str) {
        this.r = str;
        invalidate();
    }

    public float getInnerBottomTextSize() {
        return this.q;
    }

    public void setInnerBottomTextSize(float f) {
        this.q = f;
        invalidate();
    }

    public int getInnerBottomTextColor() {
        return this.i;
    }

    public void setInnerBottomTextColor(int i) {
        this.i = i;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(a(i), a(i2));
        this.s = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.m;
        this.f.set(f, f, getWidth() - f, getHeight() - f);
        float width = getWidth();
        float f2 = this.m;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f2) + f2) / 2.0f, this.b);
        canvas.drawArc(this.f, 270.0f, -getProgressAngle(), false, this.f409a);
        String str = this.o + this.j + this.p;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.c.measureText(str)) / 2.0f, (getWidth() - (this.c.descent() + this.c.ascent())) / 2.0f, this.c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.d.setTextSize(this.q);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.s) - ((this.c.descent() + this.c.ascent()) / 2.0f), this.d);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.h = bundle.getInt("text_color");
            this.g = bundle.getFloat("text_size");
            this.q = bundle.getFloat("inner_bottom_text_size");
            this.r = bundle.getString("inner_bottom_text");
            this.i = bundle.getInt("inner_bottom_text_color");
            this.l = bundle.getInt("finished_stroke_color");
            this.m = bundle.getFloat("finished_stroke_width");
            this.n = bundle.getInt("inner_background_color");
            b();
            setMax(bundle.getInt(AppLovinMediationProvider.MAX));
            setProgress(bundle.getInt("progress"));
            this.o = bundle.getString("prefix");
            this.p = bundle.getString("suffix");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f) {
            return (f * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f) {
            return f * resources.getDisplayMetrics().scaledDensity;
        }
    }

    private int a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.w;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }
}
