package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class hu {
    private final Matrix EYQ = new Matrix();
    private EYQ<Float, Float> HX;
    private EYQ<PointF, PointF> IPb;
    private final float[] Kbd;
    private Pm MxO;
    private final Matrix Pm;
    private EYQ<com.bytedance.adsdk.lottie.VwS.Td, com.bytedance.adsdk.lottie.VwS.Td> QQ;
    private final Matrix Td;
    private EYQ<?, PointF> VwS;
    private final Matrix mZx;
    private EYQ<?, Float> nWX;
    private EYQ<?, Float> pi;
    private EYQ<Integer, Integer> tp;
    private Pm tsL;

    public hu(com.bytedance.adsdk.lottie.Td.EYQ.tsL tsl) {
        this.IPb = tsl.EYQ() == null ? null : tsl.EYQ().EYQ();
        this.VwS = tsl.mZx() == null ? null : tsl.mZx().EYQ();
        this.QQ = tsl.Td() == null ? null : tsl.Td().EYQ();
        this.HX = tsl.Pm() == null ? null : tsl.Pm().EYQ();
        Pm pm = tsl.QQ() == null ? null : (Pm) tsl.QQ().EYQ();
        this.MxO = pm;
        if (pm != null) {
            this.mZx = new Matrix();
            this.Td = new Matrix();
            this.Pm = new Matrix();
            this.Kbd = new float[9];
        } else {
            this.mZx = null;
            this.Td = null;
            this.Pm = null;
            this.Kbd = null;
        }
        this.tsL = tsl.HX() == null ? null : (Pm) tsl.HX().EYQ();
        if (tsl.Kbd() != null) {
            this.tp = tsl.Kbd().EYQ();
        }
        if (tsl.IPb() != null) {
            this.pi = tsl.IPb().EYQ();
        } else {
            this.pi = null;
        }
        if (tsl.VwS() != null) {
            this.nWX = tsl.VwS().EYQ();
        } else {
            this.nWX = null;
        }
    }

    public void EYQ(com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        eyq.EYQ(this.tp);
        eyq.EYQ(this.pi);
        eyq.EYQ(this.nWX);
        eyq.EYQ(this.IPb);
        eyq.EYQ(this.VwS);
        eyq.EYQ(this.QQ);
        eyq.EYQ(this.HX);
        eyq.EYQ(this.MxO);
        eyq.EYQ(this.tsL);
    }

    public void EYQ(EYQ.InterfaceC0072EYQ interfaceC0072EYQ) {
        EYQ<Integer, Integer> eyq = this.tp;
        if (eyq != null) {
            eyq.EYQ(interfaceC0072EYQ);
        }
        EYQ<?, Float> eyq2 = this.pi;
        if (eyq2 != null) {
            eyq2.EYQ(interfaceC0072EYQ);
        }
        EYQ<?, Float> eyq3 = this.nWX;
        if (eyq3 != null) {
            eyq3.EYQ(interfaceC0072EYQ);
        }
        EYQ<PointF, PointF> eyq4 = this.IPb;
        if (eyq4 != null) {
            eyq4.EYQ(interfaceC0072EYQ);
        }
        EYQ<?, PointF> eyq5 = this.VwS;
        if (eyq5 != null) {
            eyq5.EYQ(interfaceC0072EYQ);
        }
        EYQ<com.bytedance.adsdk.lottie.VwS.Td, com.bytedance.adsdk.lottie.VwS.Td> eyq6 = this.QQ;
        if (eyq6 != null) {
            eyq6.EYQ(interfaceC0072EYQ);
        }
        EYQ<Float, Float> eyq7 = this.HX;
        if (eyq7 != null) {
            eyq7.EYQ(interfaceC0072EYQ);
        }
        Pm pm = this.MxO;
        if (pm != null) {
            pm.EYQ(interfaceC0072EYQ);
        }
        Pm pm2 = this.tsL;
        if (pm2 != null) {
            pm2.EYQ(interfaceC0072EYQ);
        }
    }

    public void EYQ(float f) {
        EYQ<Integer, Integer> eyq = this.tp;
        if (eyq != null) {
            eyq.EYQ(f);
        }
        EYQ<?, Float> eyq2 = this.pi;
        if (eyq2 != null) {
            eyq2.EYQ(f);
        }
        EYQ<?, Float> eyq3 = this.nWX;
        if (eyq3 != null) {
            eyq3.EYQ(f);
        }
        EYQ<PointF, PointF> eyq4 = this.IPb;
        if (eyq4 != null) {
            eyq4.EYQ(f);
        }
        EYQ<?, PointF> eyq5 = this.VwS;
        if (eyq5 != null) {
            eyq5.EYQ(f);
        }
        EYQ<com.bytedance.adsdk.lottie.VwS.Td, com.bytedance.adsdk.lottie.VwS.Td> eyq6 = this.QQ;
        if (eyq6 != null) {
            eyq6.EYQ(f);
        }
        EYQ<Float, Float> eyq7 = this.HX;
        if (eyq7 != null) {
            eyq7.EYQ(f);
        }
        Pm pm = this.MxO;
        if (pm != null) {
            pm.EYQ(f);
        }
        Pm pm2 = this.tsL;
        if (pm2 != null) {
            pm2.EYQ(f);
        }
    }

    public EYQ<?, Integer> EYQ() {
        return this.tp;
    }

    public EYQ<?, Float> mZx() {
        return this.pi;
    }

    public EYQ<?, Float> Td() {
        return this.nWX;
    }

    public Matrix Pm() {
        PointF pointFVwS;
        float fHX;
        PointF pointFVwS2;
        this.EYQ.reset();
        EYQ<?, PointF> eyq = this.VwS;
        if (eyq != null && (pointFVwS2 = eyq.VwS()) != null && (pointFVwS2.x != 0.0f || pointFVwS2.y != 0.0f)) {
            this.EYQ.preTranslate(pointFVwS2.x, pointFVwS2.y);
        }
        EYQ<Float, Float> eyq2 = this.HX;
        if (eyq2 != null) {
            if (eyq2 instanceof UB) {
                fHX = eyq2.VwS().floatValue();
            } else {
                fHX = ((Pm) eyq2).HX();
            }
            if (fHX != 0.0f) {
                this.EYQ.preRotate(fHX);
            }
        }
        if (this.MxO != null) {
            float fCos = this.tsL == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.HX()) + 90.0f));
            float fSin = this.tsL == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.HX()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.HX()));
            Kbd();
            float[] fArr = this.Kbd;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.mZx.setValues(fArr);
            Kbd();
            float[] fArr2 = this.Kbd;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.Td.setValues(fArr2);
            Kbd();
            float[] fArr3 = this.Kbd;
            fArr3[0] = fCos;
            fArr3[1] = f;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.Pm.setValues(fArr3);
            this.Td.preConcat(this.mZx);
            this.Pm.preConcat(this.Td);
            this.EYQ.preConcat(this.Pm);
        }
        EYQ<com.bytedance.adsdk.lottie.VwS.Td, com.bytedance.adsdk.lottie.VwS.Td> eyq3 = this.QQ;
        if (eyq3 != null) {
            com.bytedance.adsdk.lottie.VwS.Td tdVwS = eyq3.VwS();
            if (tdVwS.EYQ() != 1.0f || tdVwS.mZx() != 1.0f) {
                this.EYQ.preScale(tdVwS.EYQ(), tdVwS.mZx());
            }
        }
        EYQ<PointF, PointF> eyq4 = this.IPb;
        if (eyq4 != null && (((pointFVwS = eyq4.VwS()) != null && pointFVwS.x != 0.0f) || pointFVwS.y != 0.0f)) {
            this.EYQ.preTranslate(-pointFVwS.x, -pointFVwS.y);
        }
        return this.EYQ;
    }

    private void Kbd() {
        for (int i = 0; i < 9; i++) {
            this.Kbd[i] = 0.0f;
        }
    }

    public Matrix mZx(float f) {
        EYQ<?, PointF> eyq = this.VwS;
        PointF pointFVwS = eyq == null ? null : eyq.VwS();
        EYQ<com.bytedance.adsdk.lottie.VwS.Td, com.bytedance.adsdk.lottie.VwS.Td> eyq2 = this.QQ;
        com.bytedance.adsdk.lottie.VwS.Td tdVwS = eyq2 == null ? null : eyq2.VwS();
        this.EYQ.reset();
        if (pointFVwS != null) {
            this.EYQ.preTranslate(pointFVwS.x * f, pointFVwS.y * f);
        }
        if (tdVwS != null) {
            double d = f;
            this.EYQ.preScale((float) Math.pow(tdVwS.EYQ(), d), (float) Math.pow(tdVwS.mZx(), d));
        }
        EYQ<Float, Float> eyq3 = this.HX;
        if (eyq3 != null) {
            float fFloatValue = eyq3.VwS().floatValue();
            EYQ<PointF, PointF> eyq4 = this.IPb;
            PointF pointFVwS2 = eyq4 != null ? eyq4.VwS() : null;
            this.EYQ.preRotate(fFloatValue * f, pointFVwS2 == null ? 0.0f : pointFVwS2.x, pointFVwS2 != null ? pointFVwS2.y : 0.0f);
        }
        return this.EYQ;
    }
}
