package com.bytedance.adsdk.lottie.VwS;

/* compiled from: ScaleXY.java */
/* loaded from: classes2.dex */
public class Td {
    private float EYQ;
    private float mZx;

    public Td(float f, float f2) {
        this.EYQ = f;
        this.mZx = f2;
    }

    public Td() {
        this(1.0f, 1.0f);
    }

    public float EYQ() {
        return this.EYQ;
    }

    public float mZx() {
        return this.mZx;
    }

    public void EYQ(float f, float f2) {
        this.EYQ = f;
        this.mZx = f2;
    }

    public boolean mZx(float f, float f2) {
        return this.EYQ == f && this.mZx == f2;
    }

    public String toString() {
        return EYQ() + "x" + mZx();
    }
}
