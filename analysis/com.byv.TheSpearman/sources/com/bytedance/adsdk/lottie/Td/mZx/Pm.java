package com.bytedance.adsdk.lottie.Td.mZx;

import java.util.Arrays;

/* compiled from: GradientColor.java */
/* loaded from: classes2.dex */
public class Pm {
    private final float[] EYQ;
    private final int[] mZx;

    public Pm(float[] fArr, int[] iArr) {
        this.EYQ = fArr;
        this.mZx = iArr;
    }

    public float[] EYQ() {
        return this.EYQ;
    }

    public int[] mZx() {
        return this.mZx;
    }

    public int Td() {
        return this.mZx.length;
    }

    public void EYQ(Pm pm, Pm pm2, float f) {
        if (pm.mZx.length != pm2.mZx.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + pm.mZx.length + " vs " + pm2.mZx.length + ")");
        }
        for (int i = 0; i < pm.mZx.length; i++) {
            this.EYQ[i] = com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pm.EYQ[i], pm2.EYQ[i], f);
            this.mZx[i] = com.bytedance.adsdk.lottie.IPb.mZx.EYQ(f, pm.mZx[i], pm2.mZx[i]);
        }
    }

    public Pm EYQ(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = EYQ(fArr[i]);
        }
        return new Pm(fArr, iArr);
    }

    private int EYQ(float f) {
        int iBinarySearch = Arrays.binarySearch(this.EYQ, f);
        if (iBinarySearch >= 0) {
            return this.mZx[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.mZx[0];
        }
        int[] iArr = this.mZx;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.EYQ;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.lottie.IPb.mZx.EYQ((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
