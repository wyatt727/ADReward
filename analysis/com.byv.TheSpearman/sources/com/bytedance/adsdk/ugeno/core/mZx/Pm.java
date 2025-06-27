package com.bytedance.adsdk.ugeno.core.mZx;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.pi;
import com.bytedance.adsdk.ugeno.mZx.QQ;

/* compiled from: UGSlideRightEvent.java */
/* loaded from: classes2.dex */
public class Pm {
    private float EYQ;
    private boolean HX;
    private String IPb;
    private MxO Kbd;
    private MxO Pm;
    private boolean QQ;
    private int Td = 0;
    private Context VwS;
    private float mZx;

    public Pm(Context context, MxO mxO, boolean z) {
        this.VwS = context;
        this.Pm = mxO;
        this.HX = z;
        EYQ();
    }

    public Pm(Context context, MxO mxO, MxO mxO2, boolean z) {
        this.VwS = context;
        this.Pm = mxO;
        this.Kbd = mxO2;
        this.HX = z;
        EYQ();
    }

    private void EYQ() {
        MxO mxO = this.Pm;
        if (mxO == null) {
            return;
        }
        this.Td = mxO.Td().optInt("slideThreshold");
        this.IPb = this.Pm.Td().optString("slideDirection", "up");
    }

    public boolean EYQ(pi piVar, com.bytedance.adsdk.ugeno.component.mZx mzx, MotionEvent motionEvent) {
        if (this.QQ) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EYQ = motionEvent.getX();
            this.mZx = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.HX && Math.abs(x - this.EYQ) <= 10.0f && Math.abs(y - this.mZx) <= 10.0f && piVar != null) {
                piVar.EYQ(this.Kbd, mzx, mzx);
                return true;
            }
            if (this.Td == 0 && piVar != null) {
                piVar.EYQ(this.Pm, mzx, mzx);
                this.QQ = true;
                return true;
            }
            int iMZx = QQ.mZx(this.VwS, x - this.EYQ);
            int iMZx2 = QQ.mZx(this.VwS, y - this.mZx);
            if (TextUtils.equals(this.IPb, "up")) {
                iMZx = -iMZx2;
            } else if (TextUtils.equals(this.IPb, "down")) {
                iMZx = iMZx2;
            } else if (TextUtils.equals(this.IPb, "left")) {
                iMZx = -iMZx;
            } else if (!TextUtils.equals(this.IPb, "right")) {
                iMZx = 0;
            }
            if (iMZx < this.Td) {
                return false;
            }
            if (piVar != null) {
                piVar.EYQ(this.Pm, mzx, mzx);
                this.QQ = true;
                return true;
            }
        }
        return true;
    }
}
