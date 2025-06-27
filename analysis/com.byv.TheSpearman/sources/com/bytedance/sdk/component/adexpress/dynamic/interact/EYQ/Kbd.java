package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: SlideUpTouch.java */
/* loaded from: classes2.dex */
public class Kbd implements View.OnTouchListener {
    private float EYQ;
    private int Kbd;
    private com.bytedance.sdk.component.adexpress.dynamic.interact.QQ Pm;
    private boolean Td;
    private float mZx;

    public Kbd(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq, int i) {
        this.Pm = qq;
        this.Kbd = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EYQ = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.mZx = y;
                if (Math.abs(y - this.EYQ) > 10.0f) {
                    this.Td = true;
                }
            }
        } else {
            if (!this.Td) {
                return false;
            }
            int iMZx = com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), Math.abs(this.mZx - this.EYQ));
            if (this.mZx - this.EYQ < 0.0f && iMZx > this.Kbd && (qq = this.Pm) != null) {
                qq.EYQ();
            }
        }
        return true;
    }
}
