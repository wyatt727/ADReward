package com.bytedance.adsdk.lottie.Td;

import android.graphics.PointF;

/* compiled from: CubicCurveData.java */
/* loaded from: classes2.dex */
public class EYQ {
    private final PointF EYQ;
    private final PointF Td;
    private final PointF mZx;

    public EYQ() {
        this.EYQ = new PointF();
        this.mZx = new PointF();
        this.Td = new PointF();
    }

    public EYQ(PointF pointF, PointF pointF2, PointF pointF3) {
        this.EYQ = pointF;
        this.mZx = pointF2;
        this.Td = pointF3;
    }

    public void EYQ(float f, float f2) {
        this.EYQ.set(f, f2);
    }

    public PointF EYQ() {
        return this.EYQ;
    }

    public void mZx(float f, float f2) {
        this.mZx.set(f, f2);
    }

    public PointF mZx() {
        return this.mZx;
    }

    public void Td(float f, float f2) {
        this.Td.set(f, f2);
    }

    public PointF Td() {
        return this.Td;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.Td.x), Float.valueOf(this.Td.y), Float.valueOf(this.EYQ.x), Float.valueOf(this.EYQ.y), Float.valueOf(this.mZx.x), Float.valueOf(this.mZx.y));
    }
}
