package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class ShadowImageView extends ImageView {
    private Paint EYQ;
    private RectF mZx;

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mZx.right == getMeasuredWidth() && this.mZx.bottom == getMeasuredHeight()) {
            return;
        }
        this.mZx.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.mZx;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.mZx.bottom / 2.0f, this.EYQ);
        super.onDraw(canvas);
    }
}
