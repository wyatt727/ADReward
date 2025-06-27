package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;

/* compiled from: LongPressTouch.java */
/* loaded from: classes2.dex */
public class mZx implements View.OnTouchListener {
    private float EYQ;
    private com.bytedance.sdk.component.adexpress.dynamic.interact.QQ IPb;
    private InteractViewContainer Kbd;
    private boolean Pm;
    private long Td;
    private float mZx;

    public mZx(InteractViewContainer interactViewContainer, com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq) {
        this.Kbd = interactViewContainer;
        this.IPb = qq;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Td = System.currentTimeMillis();
            this.EYQ = motionEvent.getX();
            this.mZx = motionEvent.getY();
            this.Kbd.Kbd();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.EYQ) >= com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), 10.0f) || Math.abs(y - this.mZx) >= com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), 10.0f)) {
                    this.Pm = true;
                    this.Kbd.IPb();
                }
            }
        } else {
            if (this.Pm) {
                return false;
            }
            if (System.currentTimeMillis() - this.Td >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq = this.IPb;
                if (qq != null) {
                    qq.EYQ();
                }
            } else {
                this.Kbd.IPb();
            }
        }
        return true;
    }
}
