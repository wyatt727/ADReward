package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* loaded from: classes2.dex */
public class ShadowImageView extends PAGImageView {
    private Paint EYQ;
    private RectF mZx;

    public ShadowImageView(Context context) {
        super(context);
        EYQ();
    }

    private void EYQ() {
        Paint paint = new Paint();
        this.EYQ = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.EYQ.setColor(Color.parseColor("#99333333"));
        this.EYQ.setAntiAlias(true);
        this.EYQ.setStrokeWidth(0.0f);
        this.mZx = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGImageView, android.widget.ImageView, android.view.View
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
