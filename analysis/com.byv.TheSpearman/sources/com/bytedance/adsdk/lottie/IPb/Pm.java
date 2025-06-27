package com.bytedance.adsdk.lottie.IPb;

/* compiled from: MeanCalculator.java */
/* loaded from: classes2.dex */
public class Pm {
    private float EYQ;
    private int mZx;

    public void EYQ(float f) {
        float f2 = this.EYQ + f;
        this.EYQ = f2;
        int i = this.mZx + 1;
        this.mZx = i;
        if (i == Integer.MAX_VALUE) {
            this.EYQ = f2 / 2.0f;
            this.mZx = i / 2;
        }
    }
}
