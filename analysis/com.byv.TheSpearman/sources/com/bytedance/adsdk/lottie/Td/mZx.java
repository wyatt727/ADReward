package com.bytedance.adsdk.lottie.Td;

import android.graphics.PointF;

/* compiled from: DocumentData.java */
/* loaded from: classes2.dex */
public class mZx {
    public String EYQ;
    public int HX;
    public float IPb;
    public int Kbd;
    public boolean MxO;
    public EYQ Pm;
    public int QQ;
    public float Td;
    public float VwS;
    public String mZx;
    public PointF pi;
    public float tp;
    public PointF tsL;

    /* compiled from: DocumentData.java */
    public enum EYQ {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public mZx(String str, String str2, float f, EYQ eyq, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        EYQ(str, str2, f, eyq, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public mZx() {
    }

    public void EYQ(String str, String str2, float f, EYQ eyq, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.EYQ = str;
        this.mZx = str2;
        this.Td = f;
        this.Pm = eyq;
        this.Kbd = i;
        this.IPb = f2;
        this.VwS = f3;
        this.QQ = i2;
        this.HX = i3;
        this.tp = f4;
        this.MxO = z;
        this.tsL = pointF;
        this.pi = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.EYQ.hashCode() * 31) + this.mZx.hashCode()) * 31) + this.Td)) * 31) + this.Pm.ordinal()) * 31) + this.Kbd;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.IPb);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.QQ;
    }
}
