package com.bytedance.adsdk.lottie.IPb;

/* compiled from: GammaEvaluator.java */
/* loaded from: classes2.dex */
public class mZx {
    private static float EYQ(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float mZx(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int EYQ(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fMZx = mZx(((i >> 16) & 255) / 255.0f);
        float fMZx2 = mZx(((i >> 8) & 255) / 255.0f);
        float fMZx3 = mZx((i & 255) / 255.0f);
        float fMZx4 = mZx(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float fMZx5 = fMZx2 + ((mZx(((i2 >> 8) & 255) / 255.0f) - fMZx2) * f);
        float fMZx6 = fMZx3 + (f * (mZx((i2 & 255) / 255.0f) - fMZx3));
        return (Math.round(EYQ(fMZx + ((fMZx4 - fMZx) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(EYQ(fMZx5) * 255.0f) << 8) | Math.round(EYQ(fMZx6) * 255.0f);
    }
}
