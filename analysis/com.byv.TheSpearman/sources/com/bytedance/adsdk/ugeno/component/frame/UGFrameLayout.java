package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.mZx;
import java.util.Map;

/* loaded from: classes2.dex */
public class UGFrameLayout extends FrameLayout {
    private mZx EYQ;
    private Map<Integer, MxO> mZx;

    public UGFrameLayout(Context context) {
        super(context);
    }

    public void setEventMap(Map<Integer, MxO> map) {
        this.mZx = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        mZx mzx = this.EYQ;
        if (mzx != null) {
            int[] iArrEYQ = mzx.EYQ(i, i2);
            super.onMeasure(iArrEYQ[0], iArrEYQ[1]);
        } else {
            super.onMeasure(i, i2);
        }
        mZx mzx2 = this.EYQ;
        if (mzx2 != null) {
            mzx2.Pm();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.Kbd();
        }
        super.onLayout(z, i, i2, i3, i4);
        mZx mzx2 = this.EYQ;
        if (mzx2 != null) {
            mzx2.EYQ(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, MxO> map = this.mZx;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
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
