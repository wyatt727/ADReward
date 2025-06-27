package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* compiled from: CoverDrawable.java */
/* loaded from: classes2.dex */
public class mZx extends GradientDrawable {
    protected Path EYQ;
    private final Paint mZx;

    public mZx() {
        this.EYQ = new Path();
        Paint paint = new Paint(1);
        this.mZx = paint;
        paint.setColor(-1);
    }

    public mZx(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.EYQ = new Path();
        Paint paint = new Paint(1);
        this.mZx = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.EYQ;
        if (path == null || path.isEmpty()) {
            EYQ(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.mZx, 31);
        EYQ(canvas);
        this.mZx.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.EYQ, this.mZx);
        this.mZx.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    protected void EYQ(Canvas canvas) {
        super.draw(canvas);
    }

    public void EYQ(int i, int i2, int i3, int i4) {
        this.EYQ.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }
}
