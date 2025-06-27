package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: SlideRightTouch.java */
/* loaded from: classes2.dex */
public class Td implements View.OnTouchListener {
    private float EYQ;
    private boolean HX;
    private com.bytedance.sdk.component.adexpress.dynamic.interact.QQ IPb;
    private boolean Kbd;
    private float Pm;
    private boolean QQ;
    private float Td;
    private int VwS;
    private float mZx;

    public Td(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq) {
        this(qq, 5);
    }

    public Td(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq, int i) {
        this.VwS = 5;
        this.QQ = true;
        this.IPb = qq;
        if (i > 0) {
            this.VwS = i;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq;
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq2;
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq3;
        if (this.HX) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EYQ = motionEvent.getX();
            this.mZx = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.Pm = motionEvent.getX();
                this.Td = motionEvent.getY();
                if (Math.abs(this.Pm - this.EYQ) > 10.0f) {
                    this.Kbd = true;
                }
                if (Math.abs(this.Pm - this.EYQ) > 8.0f || Math.abs(this.Td - this.mZx) > 8.0f) {
                    this.QQ = false;
                }
                int iMZx = com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), Math.abs(this.Pm - this.EYQ));
                if (this.Pm > this.EYQ && iMZx > this.VwS && (qq3 = this.IPb) != null) {
                    qq3.EYQ();
                    this.HX = true;
                }
            }
        } else {
            if (!this.Kbd && !this.QQ) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iMZx2 = com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), Math.abs(this.Pm - this.EYQ));
            if (this.Pm > this.EYQ && iMZx2 > this.VwS && (qq2 = this.IPb) != null) {
                qq2.EYQ();
                this.HX = true;
            }
            float fAbs = Math.abs(x - this.EYQ);
            float fAbs2 = Math.abs(y - this.mZx);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (qq = this.IPb) != null) {
                qq.mZx();
                this.HX = true;
            }
        }
        return true;
    }
}
