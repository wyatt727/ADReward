package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* compiled from: GradientColorParser.java */
/* loaded from: classes2.dex */
public class KO implements XPd<com.bytedance.adsdk.lottie.Td.mZx.Pm> {
    private int EYQ;

    public KO(int i) {
        this.EYQ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.lottie.Kbd.XPd
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.adsdk.lottie.Td.mZx.Pm mZx(android.util.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.Kbd.KO.mZx(android.util.JsonReader, float):com.bytedance.adsdk.lottie.Td.mZx.Pm");
    }

    private com.bytedance.adsdk.lottie.Td.mZx.Pm EYQ(com.bytedance.adsdk.lottie.Td.mZx.Pm pm, List<Float> list) {
        int i = this.EYQ * 4;
        if (list.size() <= i) {
            return pm;
        }
        float[] fArrEYQ = pm.EYQ();
        int[] iArrMZx = pm.mZx();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] fArrEYQ2 = EYQ(pm.EYQ(), fArr);
        int length = fArrEYQ2.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrEYQ2[i3];
            int iBinarySearch = Arrays.binarySearch(fArrEYQ, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i3] = EYQ(f, fArr2[iBinarySearch2], fArrEYQ, iArrMZx);
            } else {
                iArr[i3] = EYQ(f, iArrMZx[iBinarySearch], fArr, fArr2);
            }
        }
        return new com.bytedance.adsdk.lottie.Td.mZx.Pm(fArrEYQ2, iArr);
    }

    int EYQ(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            if (fArr[i] >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f3 = (f - fArr[i2]) / (fArr[i] - fArr[i2]);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), com.bytedance.adsdk.lottie.IPb.mZx.EYQ(f3, Color.red(i4), Color.red(i3)), com.bytedance.adsdk.lottie.IPb.mZx.EYQ(f3, Color.green(i4), Color.green(i3)), com.bytedance.adsdk.lottie.IPb.mZx.EYQ(f3, Color.blue(i4), Color.blue(i3)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int EYQ(float f, int i, float[] fArr, float[] fArr2) {
        float fEYQ;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    fEYQ = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    fEYQ = com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(fArr2[i3], fArr2[i2], (f - fArr[i3]) / (fArr[i2] - fArr[i3]));
                }
                return Color.argb((int) (fEYQ * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] EYQ(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }
}
