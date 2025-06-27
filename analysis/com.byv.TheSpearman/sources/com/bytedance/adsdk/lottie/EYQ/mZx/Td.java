package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class Td implements EYQ.InterfaceC0072EYQ {
    private final EYQ.InterfaceC0072EYQ EYQ;
    private final EYQ<Float, Float> IPb;
    private final EYQ<Float, Float> Kbd;
    private final EYQ<Float, Float> Pm;
    private final EYQ<Float, Float> Td;
    private boolean VwS = true;
    private final EYQ<Integer, Integer> mZx;

    public Td(EYQ.InterfaceC0072EYQ interfaceC0072EYQ, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Kbd.tp tpVar) {
        this.EYQ = interfaceC0072EYQ;
        EYQ<Integer, Integer> EYQ = tpVar.EYQ().EYQ();
        this.mZx = EYQ;
        EYQ.EYQ(this);
        eyq.EYQ(EYQ);
        EYQ<Float, Float> EYQ2 = tpVar.mZx().EYQ();
        this.Td = EYQ2;
        EYQ2.EYQ(this);
        eyq.EYQ(EYQ2);
        EYQ<Float, Float> EYQ3 = tpVar.Td().EYQ();
        this.Pm = EYQ3;
        EYQ3.EYQ(this);
        eyq.EYQ(EYQ3);
        EYQ<Float, Float> EYQ4 = tpVar.Pm().EYQ();
        this.Kbd = EYQ4;
        EYQ4.EYQ(this);
        eyq.EYQ(EYQ4);
        EYQ<Float, Float> EYQ5 = tpVar.Kbd().EYQ();
        this.IPb = EYQ5;
        EYQ5.EYQ(this);
        eyq.EYQ(EYQ5);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        this.VwS = true;
        this.EYQ.EYQ();
    }

    public void EYQ(Paint paint) {
        if (this.VwS) {
            this.VwS = false;
            double dFloatValue = this.Pm.VwS().floatValue() * 0.017453292519943295d;
            float fFloatValue = this.Kbd.VwS().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.mZx.VwS().intValue();
            paint.setShadowLayer(this.IPb.VwS().floatValue(), fSin, fCos, Color.argb(Math.round(this.Td.VwS().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
