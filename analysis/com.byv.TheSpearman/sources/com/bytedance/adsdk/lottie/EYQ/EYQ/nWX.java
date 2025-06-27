package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import com.bytedance.adsdk.lottie.Td.mZx.hYh;
import com.bytedance.adsdk.lottie.Td.mZx.tp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes2.dex */
public class nWX implements MxO, pi, EYQ.InterfaceC0072EYQ {
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> HX;
    private final boolean IPb;
    private boolean KO;
    private final boolean Kbd;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> MxO;
    private final tp.EYQ Pm;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, PointF> QQ;
    private final com.bytedance.adsdk.lottie.QQ Td;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> VwS;
    private final String mZx;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> pi;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> tp;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> tsL;
    private final Path EYQ = new Path();
    private final mZx nWX = new mZx();

    public nWX(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.tp tpVar) {
        this.Td = qq;
        this.mZx = tpVar.EYQ();
        tp.EYQ eyqMZx = tpVar.mZx();
        this.Pm = eyqMZx;
        this.Kbd = tpVar.tp();
        this.IPb = tpVar.MxO();
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ = tpVar.Td().EYQ();
        this.VwS = EYQ;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ2 = tpVar.Pm().EYQ();
        this.QQ = EYQ2;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ3 = tpVar.Kbd().EYQ();
        this.HX = EYQ3;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ4 = tpVar.VwS().EYQ();
        this.MxO = EYQ4;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ5 = tpVar.HX().EYQ();
        this.pi = EYQ5;
        if (eyqMZx == tp.EYQ.STAR) {
            this.tp = tpVar.IPb().EYQ();
            this.tsL = tpVar.QQ().EYQ();
        } else {
            this.tp = null;
            this.tsL = null;
        }
        eyq.EYQ(EYQ);
        eyq.EYQ(EYQ2);
        eyq.EYQ(EYQ3);
        eyq.EYQ(EYQ4);
        eyq.EYQ(EYQ5);
        if (eyqMZx == tp.EYQ.STAR) {
            eyq.EYQ(this.tp);
            eyq.EYQ(this.tsL);
        }
        EYQ.EYQ(this);
        EYQ2.EYQ(this);
        EYQ3.EYQ(this);
        EYQ4.EYQ(this);
        EYQ5.EYQ(this);
        if (eyqMZx == tp.EYQ.STAR) {
            this.tp.EYQ(this);
            this.tsL.EYQ(this);
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        mZx();
    }

    private void mZx() {
        this.KO = false;
        this.Td.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
        for (int i = 0; i < list.size(); i++) {
            Td td = list.get(i);
            if (td instanceof WU) {
                WU wu = (WU) td;
                if (wu.mZx() == hYh.EYQ.SIMULTANEOUSLY) {
                    this.nWX.EYQ(wu);
                    wu.EYQ(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.pi
    public Path Pm() {
        if (this.KO) {
            return this.EYQ;
        }
        this.EYQ.reset();
        if (this.Kbd) {
            this.KO = true;
            return this.EYQ;
        }
        int i = AnonymousClass1.EYQ[this.Pm.ordinal()];
        if (i == 1) {
            Td();
        } else if (i == 2) {
            Kbd();
        }
        this.EYQ.close();
        this.nWX.EYQ(this.EYQ);
        this.KO = true;
        return this.EYQ;
    }

    /* compiled from: PolystarContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.EYQ.EYQ.nWX$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[tp.EYQ.values().length];
            EYQ = iArr;
            try {
                iArr[tp.EYQ.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[tp.EYQ.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void Td() {
        double d;
        int i;
        double d2;
        float fCos;
        float fSin;
        float f;
        float f2;
        float f3;
        float f4;
        double d3;
        float f5;
        float f6;
        float f7;
        float fFloatValue = this.VwS.VwS().floatValue();
        double radians = Math.toRadians((this.HX == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : r2.VwS().floatValue()) - 90.0d);
        double d4 = fFloatValue;
        float f8 = (float) (6.283185307179586d / d4);
        if (this.IPb) {
            f8 *= -1.0f;
        }
        float f9 = f8 / 2.0f;
        float f10 = fFloatValue - ((int) fFloatValue);
        int i2 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f10) * f9;
        }
        float fFloatValue2 = this.MxO.VwS().floatValue();
        float fFloatValue3 = this.tp.VwS().floatValue();
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> eyq = this.tsL;
        float fFloatValue4 = eyq != null ? eyq.VwS().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> eyq2 = this.pi;
        float fFloatValue5 = eyq2 != null ? eyq2.VwS().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((fFloatValue2 - fFloatValue3) * f10) + fFloatValue3;
            i = i2;
            double d5 = f;
            d = d4;
            fCos = (float) (d5 * Math.cos(radians));
            fSin = (float) (d5 * Math.sin(radians));
            this.EYQ.moveTo(fCos, fSin);
            d2 = radians + ((f8 * f10) / 2.0f);
        } else {
            d = d4;
            i = i2;
            double d6 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d6);
            float fSin2 = (float) (d6 * Math.sin(radians));
            this.EYQ.moveTo(fCos2, fSin2);
            d2 = radians + f9;
            fCos = fCos2;
            fSin = fSin2;
            f = 0.0f;
        }
        double dCeil = Math.ceil(d) * 2.0d;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < dCeil) {
                float f11 = z ? fFloatValue2 : fFloatValue3;
                if (f == 0.0f || d7 != dCeil - 2.0d) {
                    f2 = f8;
                    f3 = f9;
                } else {
                    f2 = f8;
                    f3 = (f8 * f10) / 2.0f;
                }
                if (f == 0.0f || d7 != dCeil - 1.0d) {
                    f4 = f9;
                    d3 = d7;
                    f5 = f11;
                } else {
                    f4 = f9;
                    d3 = d7;
                    f5 = f;
                }
                double d8 = f5;
                double d9 = dCeil;
                float fCos3 = (float) (d8 * Math.cos(d2));
                float fSin3 = (float) (d8 * Math.sin(d2));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.EYQ.lineTo(fCos3, fSin3);
                    f6 = fFloatValue4;
                    f7 = f;
                } else {
                    f6 = fFloatValue4;
                    f7 = f;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f12 = z ? f6 : fFloatValue5;
                    float f13 = z ? fFloatValue5 : f6;
                    float f14 = (z ? fFloatValue3 : fFloatValue2) * f12 * 0.47829f;
                    float f15 = fCos4 * f14;
                    float f16 = f14 * fSin4;
                    float f17 = (z ? fFloatValue2 : fFloatValue3) * f13 * 0.47829f;
                    float f18 = fCos5 * f17;
                    float f19 = f17 * fSin5;
                    if (i != 0) {
                        if (i3 == 0) {
                            f15 *= f10;
                            f16 *= f10;
                        } else if (d3 == d9 - 1.0d) {
                            f18 *= f10;
                            f19 *= f10;
                        }
                    }
                    this.EYQ.cubicTo(fCos - f15, fSin - f16, fCos3 + f18, fSin3 + f19, fCos3, fSin3);
                }
                d2 += f3;
                z = !z;
                i3++;
                fCos = fCos3;
                fSin = fSin3;
                fFloatValue4 = f6;
                f = f7;
                f9 = f4;
                f8 = f2;
                dCeil = d9;
            } else {
                PointF pointFVwS = this.QQ.VwS();
                this.EYQ.offset(pointFVwS.x, pointFVwS.y);
                this.EYQ.close();
                return;
            }
        }
    }

    private void Kbd() {
        double d;
        double d2;
        double d3;
        int i;
        int iFloor = (int) Math.floor(this.VwS.VwS().floatValue());
        double radians = Math.toRadians((this.HX == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : r2.VwS().floatValue()) - 90.0d);
        double d4 = iFloor;
        float fFloatValue = this.pi.VwS().floatValue() / 100.0f;
        float fFloatValue2 = this.MxO.VwS().floatValue();
        double d5 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d5);
        float fSin = (float) (Math.sin(radians) * d5);
        this.EYQ.moveTo(fCos, fSin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double dCeil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < dCeil) {
            float fCos2 = (float) (Math.cos(d7) * d5);
            double d8 = dCeil;
            float fSin2 = (float) (d5 * Math.sin(d7));
            if (fFloatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                d3 = d6;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.EYQ.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan22)) * f), fSin2 + (f * ((float) Math.sin(dAtan22))), fCos2, fSin2);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.EYQ.lineTo(fCos2, fSin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF pointFVwS = this.QQ.VwS();
        this.EYQ.offset(pointFVwS.x, pointFVwS.y);
        this.EYQ.close();
    }
}
