package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: BitmapCoverDrawable.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx {
    private final Bitmap Td;
    private final Rect mZx = new Rect();
    private final Paint Pm = new Paint(1);

    public EYQ(Bitmap bitmap, mZx mzx) {
        this.Td = bitmap;
        if (mzx != null) {
            this.EYQ = mzx.EYQ;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.Td.getWidth();
        int height = this.Td.getHeight();
        this.mZx.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                this.mZx.left = (width - iWidth) / 2;
                Rect rect2 = this.mZx;
                rect2.right = rect2.left + iWidth;
            }
            if (height > iHeight) {
                this.mZx.top = (height - iHeight) / 2;
                Rect rect3 = this.mZx;
                rect3.bottom = rect3.top + iHeight;
                return;
            }
            return;
        }
        float f = iHeight;
        float f2 = f * 1.0f;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = iWidth;
        float f6 = 1.0f * f5;
        float f7 = width;
        if (Math.max(f4, f6 / f7) > f4) {
            int i = (int) ((f2 / f5) * f7);
            this.mZx.top = (height - i) / 2;
            Rect rect4 = this.mZx;
            rect4.bottom = rect4.top + i;
            return;
        }
        int i2 = (int) ((f6 / f) * f3);
        this.mZx.left = (width - i2) / 2;
        Rect rect5 = this.mZx;
        rect5.right = rect5.left + i2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mZx
    protected void EYQ(Canvas canvas) {
        canvas.drawBitmap(this.Td, this.mZx, getBounds(), this.Pm);
    }
}
