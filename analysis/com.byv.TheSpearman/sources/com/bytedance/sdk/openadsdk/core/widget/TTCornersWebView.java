package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public class TTCornersWebView extends WebView {
    private int EYQ;
    private final float[] Kbd;
    private int Pm;
    private int Td;
    private int mZx;

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.EYQ = getMeasuredWidth();
        this.mZx = getMeasuredHeight();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        this.Td = getScrollX();
        this.Pm = getScrollY();
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, this.Pm, this.Td + this.EYQ, r2 + this.mZx), this.Kbd, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
