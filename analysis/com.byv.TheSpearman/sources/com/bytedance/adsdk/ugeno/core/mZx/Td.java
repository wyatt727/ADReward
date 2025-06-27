package com.bytedance.adsdk.ugeno.core.mZx;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.pi;

/* compiled from: UGOnlyTapEvent.java */
/* loaded from: classes2.dex */
public class Td {
    private float EYQ;
    private boolean Kbd;
    private Context Pm;
    private MxO Td;
    private float mZx;

    public Td(Context context, MxO mxO) {
        this.Pm = context;
        this.Td = mxO;
    }

    public boolean EYQ(pi piVar, com.bytedance.adsdk.ugeno.component.mZx mzx, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EYQ = motionEvent.getX();
            this.mZx = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.EYQ) >= 15.0f || Math.abs(y - this.mZx) >= 15.0f) {
                    this.Kbd = true;
                }
            } else if (action == 3) {
                this.Kbd = false;
            }
        } else {
            if (this.Kbd) {
                this.Kbd = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.EYQ) >= 15.0f || Math.abs(y2 - this.mZx) >= 15.0f) {
                this.Kbd = false;
            } else if (piVar != null) {
                piVar.EYQ(this.Td, mzx, mzx);
                return true;
            }
        }
        return true;
    }
}
