package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: ValidateSlideUpTouch.java */
/* loaded from: classes2.dex */
public class QQ implements View.OnTouchListener {
    private final com.bytedance.sdk.component.adexpress.dynamic.interact.QQ EYQ;
    private float IPb;
    private float Kbd;
    private float Pm;
    private final int Td = 10;
    private float VwS;
    private final boolean mZx;

    public QQ(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq, boolean z) {
        this.EYQ = qq;
        this.mZx = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq;
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Pm = motionEvent.getX();
            this.Kbd = motionEvent.getY();
            Float.valueOf(this.Pm);
        } else if (action == 1) {
            this.IPb = motionEvent.getX();
            this.VwS = motionEvent.getY();
            Float.valueOf(this.IPb);
            float f = this.VwS;
            if (!this.mZx && (qq2 = this.EYQ) != null) {
                qq2.EYQ();
            } else {
                float f2 = this.IPb - this.Pm;
                float f3 = f - this.Kbd;
                float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
                Float.valueOf(fSqrt);
                float fMZx = com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), Math.abs(fSqrt));
                Float.valueOf(fMZx);
                Integer.valueOf(10);
                if (fMZx > 10.0f && (qq = this.EYQ) != null) {
                    qq.EYQ();
                }
            }
        }
        return true;
    }
}
