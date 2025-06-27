package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: VideoOnTouchLayout.java */
/* loaded from: classes2.dex */
public class Pm {
    private final EYQ EYQ;
    private int IPb;
    private float Kbd;
    private boolean MxO;
    private float Pm;
    private int VwS;
    private final boolean mZx = false;
    private boolean Td = false;
    private boolean QQ = true;
    private boolean HX = false;
    private final View.OnTouchListener tp = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Pm.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (Pm.this.EYQ.NZ()) {
                return !Pm.this.Td;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                Pm pm = Pm.this;
                pm.MxO = pm.EYQ(motionEvent);
                Pm.this.Pm = x;
                Pm.this.Kbd = y;
                Pm.this.IPb = (int) x;
                Pm.this.VwS = (int) y;
                Pm.this.QQ = true;
                if (Pm.this.EYQ != null && Pm.this.Td) {
                    Pm.this.EYQ.EYQ(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - Pm.this.IPb) > 20.0f || Math.abs(y - Pm.this.VwS) > 20.0f) {
                    Pm.this.QQ = false;
                }
                Pm.this.QQ = true;
                Pm.this.HX = false;
                Pm.this.Pm = 0.0f;
                Pm.this.Kbd = 0.0f;
                Pm.this.IPb = 0;
                if (Pm.this.EYQ != null) {
                    Pm.this.EYQ.EYQ(view, Pm.this.QQ);
                }
                Pm.this.MxO = false;
            } else if (action == 3) {
                Pm.this.MxO = false;
            }
            return !Pm.this.Td;
        }
    };

    /* compiled from: VideoOnTouchLayout.java */
    public interface EYQ {
        void EYQ(View view, boolean z);

        boolean NZ();
    }

    public Pm(EYQ eyq) {
        this.EYQ = eyq;
    }

    public void EYQ(View view) {
        if (view != null) {
            view.setOnTouchListener(this.tp);
        }
    }

    public void EYQ(boolean z) {
        this.Td = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean EYQ(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iTd = tr.Td(hu.EYQ().getApplicationContext());
        int iPm = tr.Pm(hu.EYQ().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = iTd;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = iPm;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
