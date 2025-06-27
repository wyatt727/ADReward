package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: SlideUpAndClickTouch.java */
/* loaded from: classes2.dex */
public class Pm implements View.OnTouchListener {
    private float EYQ;
    private com.bytedance.sdk.component.adexpress.dynamic.interact.QQ HX;
    private float IPb;
    private boolean Kbd = true;
    private boolean MxO;
    private float Pm;
    private boolean QQ;
    private float Td;
    private float VwS;
    private float mZx;
    private int tp;

    public Pm(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq, int i, boolean z) {
        this.HX = qq;
        this.tp = i;
        this.MxO = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq;
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq2;
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EYQ = motionEvent.getX();
            this.mZx = motionEvent.getY();
            this.IPb = motionEvent.getY();
            this.Kbd = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.VwS = y;
                if (Math.abs(y - this.IPb) > 10.0f) {
                    this.QQ = true;
                }
                this.Pm = motionEvent.getX();
                this.Td = motionEvent.getY();
                if (Math.abs(this.Pm - this.EYQ) > 8.0f || Math.abs(this.Td - this.mZx) > 8.0f) {
                    this.Kbd = false;
                }
            }
        } else {
            if (!this.QQ && !this.Kbd) {
                return false;
            }
            if (!this.MxO && (qq3 = this.HX) != null) {
                qq3.EYQ();
            } else {
                int iMZx = com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), Math.abs(this.VwS - this.IPb));
                if (this.VwS - this.IPb < 0.0f && iMZx > this.tp && (qq2 = this.HX) != null) {
                    qq2.EYQ();
                } else if (this.Kbd && (qq = this.HX) != null) {
                    qq.EYQ();
                }
            }
        }
        return true;
    }
}
