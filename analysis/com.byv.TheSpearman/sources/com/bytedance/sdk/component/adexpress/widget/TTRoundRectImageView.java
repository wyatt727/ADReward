package com.bytedance.sdk.component.adexpress.widget;

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
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class TTRoundRectImageView extends ImageView {
    private Paint EYQ;
    private Matrix Pm;
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
        Paint paint = new Paint();
        this.EYQ = paint;
        paint.setAntiAlias(true);
        this.EYQ.setFilterBitmap(true);
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

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap bitmapEYQ = EYQ(drawable);
            if (bitmapEYQ != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapEYQ, tileMode, tileMode);
                float fMax = (bitmapEYQ.getWidth() == getWidth() && bitmapEYQ.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapEYQ.getWidth(), (getHeight() * 1.0f) / bitmapEYQ.getHeight());
                this.Pm.setScale(fMax, fMax);
                bitmapShader.setLocalMatrix(this.Pm);
                this.EYQ.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.mZx, this.Td, this.EYQ);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
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
