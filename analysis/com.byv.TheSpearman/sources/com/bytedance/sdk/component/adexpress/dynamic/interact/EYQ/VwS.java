package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* compiled from: UnlockTapTouch.java */
/* loaded from: classes2.dex */
public class VwS implements View.OnTouchListener {
    private static int Td = 10;
    private float EYQ;
    private int Kbd;
    private com.bytedance.sdk.component.adexpress.dynamic.interact.QQ Pm;
    private float mZx;
    private RectF IPb = new RectF();
    private long VwS = 0;
    private final int QQ = 200;
    private final int HX = 3;
    private SoftReference<View> tp = new SoftReference<>(null);

    public VwS(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq, int i, final ViewGroup viewGroup) {
        this.Kbd = Td;
        this.Pm = qq;
        if (i > 0) {
            this.Kbd = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.VwS.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    VwS.this.tp = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    private RectF EYQ(View view) {
        if (view == null) {
            return new RectF();
        }
        view.getLocationOnScreen(new int[2]);
        return new RectF(r0[0], r0[1], r0[0] + view.getWidth(), r0[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq;
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.IPb = EYQ(this.tp.get());
            this.EYQ = motionEvent.getRawX();
            this.mZx = motionEvent.getRawY();
            this.VwS = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.IPb;
            if (rectF != null && !rectF.contains(this.EYQ, this.mZx)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.EYQ);
            float fAbs2 = Math.abs(rawY - this.mZx);
            int iMZx = com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), Math.abs(rawX - this.EYQ));
            int i = Td;
            if (fAbs < i || fAbs2 < i) {
                if ((System.currentTimeMillis() - this.VwS < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (qq = this.Pm) != null) {
                    qq.EYQ();
                }
            } else if (rawX > this.EYQ && iMZx > this.Kbd && (qq2 = this.Pm) != null) {
                qq2.EYQ();
            }
        }
        return true;
    }
}
