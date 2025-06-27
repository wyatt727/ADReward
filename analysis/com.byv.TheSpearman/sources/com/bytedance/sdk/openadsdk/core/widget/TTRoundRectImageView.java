package com.bytedance.sdk.openadsdk.core.widget;

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
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* loaded from: classes2.dex */
public class TTRoundRectImageView extends PAGImageView {
    private final Paint EYQ;
    private BitmapShader IPb;
    private final RectF Kbd;
    private final Matrix Pm;
    private int Td;
    private int mZx;

    public TTRoundRectImageView(Context context) {
        this(context, null);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mZx = 25;
        this.Td = 25;
        this.Kbd = new RectF();
        Paint paint = new Paint();
        this.EYQ = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.Pm = new Matrix();
    }

    public void setXRound(int i) {
        this.mZx = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.Td = i;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Kbd.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapEYQ;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.IPb == null && (bitmapEYQ = EYQ(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.IPb = new BitmapShader(bitmapEYQ, tileMode, tileMode);
            float fMax = (bitmapEYQ.getWidth() == getWidth() && bitmapEYQ.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapEYQ.getWidth(), (getHeight() * 1.0f) / bitmapEYQ.getHeight());
            this.Pm.setScale(fMax, fMax);
            this.IPb.setLocalMatrix(this.Pm);
        }
        BitmapShader bitmapShader = this.IPb;
        if (bitmapShader != null) {
            this.EYQ.setShader(bitmapShader);
            canvas.drawRoundRect(this.Kbd, this.mZx, this.Td, this.EYQ);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.IPb = null;
    }

    private Bitmap EYQ(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
