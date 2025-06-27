package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class PangleViewStub extends View {
    private final EYQ EYQ;
    private View mZx;

    public interface EYQ {
        View EYQ(Context context);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public PangleViewStub(Context context, EYQ eyq) {
        super(context);
        this.EYQ = eyq;
        EYQ();
    }

    private void EYQ() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.mZx;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mZx();
        }
    }

    private View mZx() {
        EYQ eyq;
        if (this.mZx == null && (eyq = this.EYQ) != null) {
            this.mZx = eyq.EYQ(getContext());
            EYQ(this.mZx, (ViewGroup) getParent());
        }
        return this.mZx;
    }

    private void EYQ(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
