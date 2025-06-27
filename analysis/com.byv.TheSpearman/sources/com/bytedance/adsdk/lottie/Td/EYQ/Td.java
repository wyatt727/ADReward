package com.bytedance.adsdk.lottie.Td.EYQ;

import java.util.Arrays;
import java.util.List;

/* compiled from: AnimatableGradientColorValue.java */
/* loaded from: classes2.dex */
public class Td extends nWX<com.bytedance.adsdk.lottie.Td.mZx.Pm, com.bytedance.adsdk.lottie.Td.mZx.Pm> {
    @Override // com.bytedance.adsdk.lottie.Td.EYQ.nWX, com.bytedance.adsdk.lottie.Td.EYQ.pi
    public /* bridge */ /* synthetic */ List Td() {
        return super.Td();
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.nWX, com.bytedance.adsdk.lottie.Td.EYQ.pi
    public /* bridge */ /* synthetic */ boolean mZx() {
        return super.mZx();
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.nWX
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Td(List<com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm>> list) {
        super(EYQ(list));
    }

    private static List<com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm>> EYQ(List<com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, EYQ(list.get(i)));
        }
        return list;
    }

    private static com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm> EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm> eyq) {
        com.bytedance.adsdk.lottie.Td.mZx.Pm pm = eyq.EYQ;
        com.bytedance.adsdk.lottie.Td.mZx.Pm pm2 = eyq.mZx;
        if (pm == null || pm2 == null || pm.EYQ().length == pm2.EYQ().length) {
            return eyq;
        }
        float[] fArrEYQ = EYQ(pm.EYQ(), pm2.EYQ());
        return eyq.EYQ(pm.EYQ(fArrEYQ), pm2.EYQ(fArrEYQ));
    }

    static float[] EYQ(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (fArr3[i2] != f) {
                fArr3[i] = fArr3[i2];
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm, com.bytedance.adsdk.lottie.Td.mZx.Pm> EYQ() {
        return new com.bytedance.adsdk.lottie.EYQ.mZx.Kbd(this.EYQ);
    }
}
