package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;

/* loaded from: classes2.dex */
public class ShadowTextView extends PAGTextView {
    private Paint EYQ;
    private int Td;
    private RectF mZx;

    public ShadowTextView(Context context) {
        this(context, null);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Td = 0;
        EYQ();
    }

    private void EYQ() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.EYQ = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.EYQ.setColor(Color.parseColor("#99333333"));
        this.EYQ.setAntiAlias(true);
        this.EYQ.setStrokeWidth(0.0f);
        this.mZx = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int iMeasureText = (int) getPaint().measureText("00");
            this.Td = iMeasureText;
            if (measuredWidth < iMeasureText) {
                measuredWidth = iMeasureText;
            }
            int i3 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i3, measuredHeight);
            this.mZx.set(0.0f, 0.0f, i3, measuredHeight);
            return;
        }
        this.mZx.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.mZx;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.mZx.bottom / 2.0f, this.EYQ);
        canvas.translate((this.mZx.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
