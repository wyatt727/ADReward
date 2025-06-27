package com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* compiled from: LimitBrushTapTouch.java */
/* loaded from: classes2.dex */
public class EYQ implements View.OnTouchListener {
    private static int Td = 10;
    private float EYQ;
    private int Kbd;
    private com.bytedance.sdk.component.adexpress.dynamic.interact.QQ Pm;
    private float mZx;
    private RectF IPb = new RectF();
    private long VwS = 0;
    private final int QQ = 200;
    private final int HX = 3;
    private SoftReference<ViewGroup> tp = new SoftReference<>(null);

    public EYQ(com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq, int i, final ViewGroup viewGroup) {
        this.Kbd = Td;
        this.Pm = qq;
        if (i > 0) {
            this.Kbd = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    EYQ.this.tp = new SoftReference(viewGroup);
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
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq;
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
            int i = this.Kbd;
            if (fAbs >= i && fAbs2 >= i) {
                com.bytedance.sdk.component.adexpress.dynamic.interact.QQ qq2 = this.Pm;
                if (qq2 != null) {
                    qq2.EYQ();
                }
            } else if ((System.currentTimeMillis() - this.VwS < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (qq = this.Pm) != null) {
                qq.EYQ();
            }
        }
        return true;
    }
}
