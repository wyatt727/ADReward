package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: TapTouch.java */
/* loaded from: classes2.dex */
public class IPb implements View.OnTouchListener {
    private static int Td = 10;
    private float EYQ;
    private com.bytedance.sdk.component.adexpress.dynamic.interact.QQ Kbd;
    private boolean Pm;
    private float mZx;

    public IPb(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq) {
        this.Kbd = qq;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EYQ = motionEvent.getX();
            this.mZx = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.EYQ) >= Td || Math.abs(y - this.mZx) >= Td) {
                    this.Pm = true;
                }
            } else if (action == 3) {
                this.Pm = false;
            }
        } else {
            if (this.Pm) {
                this.Pm = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.EYQ) >= Td || Math.abs(y2 - this.mZx) >= Td) {
                this.Pm = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq = this.Kbd;
                if (qq != null) {
                    qq.EYQ();
                }
            }
        }
        return true;
    }
}
