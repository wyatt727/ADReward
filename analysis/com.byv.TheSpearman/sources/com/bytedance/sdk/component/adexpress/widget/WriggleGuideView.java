package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class WriggleGuideView extends View {
    private int EYQ;
    private EYQ HX;
    private int IPb;
    private Paint Kbd;
    private Bitmap Pm;
    private boolean QQ;
    private Bitmap Td;
    private boolean VwS;
    private int mZx;

    public interface EYQ {
    }

    private Bitmap EYQ(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), zF.Pm(getContext(), "tt_wriggle_union"));
        if (bitmapDecodeResource != null) {
            canvas.drawBitmap(bitmapDecodeResource, (Rect) null, new RectF(0.0f, 0.0f, i, i2), this.Kbd);
        }
        return bitmapCreateBitmap;
    }

    private Bitmap mZx(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), zF.Pm(getContext(), "tt_wriggle_union_white"));
        if (bitmapDecodeResource != null) {
            canvas.drawBitmap(bitmapDecodeResource, (Rect) null, new RectF(0.0f, 0.0f, i, i2), paint);
        }
        return bitmapCreateBitmap;
    }

    private Bitmap Td(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawCircle(i / 2, 10.0f, this.IPb, paint);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.VwS) {
            this.EYQ = getWidth();
            int height = getHeight();
            this.mZx = height;
            this.Td = EYQ(this.EYQ, height);
            this.Pm = mZx(this.EYQ, this.mZx);
            this.VwS = false;
        }
        Bitmap bitmap = this.Td;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.Kbd);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        Bitmap bitmap2 = this.Pm;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.Kbd);
        }
        this.Kbd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(Td(this.EYQ, this.mZx), 0.0f, 0.0f, this.Kbd);
        this.Kbd.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
        if (this.QQ) {
            this.IPb += 5;
            invalidate();
            if (this.IPb >= this.EYQ) {
                this.QQ = false;
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.HX != null) {
            this.HX = null;
        }
    }
}
