package com.bytedance.adsdk.ugeno.component.input;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EditText;
import com.bytedance.adsdk.ugeno.mZx;

/* loaded from: classes2.dex */
public class UGEditText extends EditText {
    private mZx EYQ;

    public UGEditText(Context context) {
        super(context);
    }

    public void EYQ(mZx mzx) {
        this.EYQ = mzx;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        mZx mzx = this.EYQ;
        if (mzx != null) {
            int[] iArrEYQ = mzx.EYQ(i, i2);
            super.onMeasure(iArrEYQ[0], iArrEYQ[1]);
        } else {
            super.onMeasure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.EYQ(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.VwS();
        }
    }
}
