package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.mZx;

/* loaded from: classes2.dex */
public class UGProgressBar extends FrameLayout {
    private mZx EYQ;
    private int Kbd;
    private TextView Pm;
    private View Td;
    private View mZx;

    public UGProgressBar(Context context) {
        super(context);
        EYQ(context);
    }

    private void EYQ(Context context) {
        this.mZx = new View(context);
        this.Td = new View(context);
        addView(this.mZx);
        addView(this.Td);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mZx.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.height = -1;
        layoutParams.gravity = 3;
        this.mZx.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Td.getLayoutParams();
        layoutParams2.width = this.Kbd;
        layoutParams2.gravity = 5;
        this.Td.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        this.Pm = textView;
        textView.setTextColor(-1);
        this.Pm.setTextSize(16.0f);
        this.Pm.setGravity(17);
        addView(this.Pm);
    }

    public void setProgress(float f) {
        int width = getWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mZx.getLayoutParams();
        float f2 = width;
        float f3 = (f / 100.0f) * f2;
        layoutParams.width = (int) f3;
        this.mZx.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Td.getLayoutParams();
        layoutParams2.width = (int) (f2 - f3);
        this.Td.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.Pm.getLayoutParams();
        layoutParams3.width = width;
        layoutParams3.gravity = 17;
        requestLayout();
    }

    public void setText(String str) {
        this.Pm.setText(str);
    }

    public void setTextColor(int i) {
        this.Pm.setTextColor(i);
    }

    public void setProgressColor(int i) {
        this.mZx.setBackgroundColor(i);
    }

    public void setProgressBgColor(int i) {
        this.Td.setBackgroundColor(i);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Kbd = i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.EYQ(i, i2);
        }
        super.onMeasure(i, i2);
        this.Kbd = EYQ(0, i);
    }

    private int EYQ(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.EYQ(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void EYQ(mZx mzx) {
        this.EYQ = mzx;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.VwS();
        }
    }
}
