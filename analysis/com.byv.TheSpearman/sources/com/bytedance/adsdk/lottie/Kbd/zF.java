package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* loaded from: classes2.dex */
class zF {
    private static final Interpolator EYQ = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> mZx;

    zF() {
    }

    private static SparseArray<WeakReference<Interpolator>> EYQ() {
        if (mZx == null) {
            mZx = new SparseArray<>();
        }
        return mZx;
    }

    private static WeakReference<Interpolator> EYQ(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (zF.class) {
            weakReference = EYQ().get(i);
        }
        return weakReference;
    }

    private static void EYQ(int i, WeakReference<Interpolator> weakReference) {
        synchronized (zF.class) {
            mZx.put(i, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.lottie.VwS.EYQ<T> EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, float f, XPd<T> xPd, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return mZx(iPb, jsonReader, f, xPd);
        }
        if (z) {
            return EYQ(iPb, jsonReader, f, xPd);
        }
        return EYQ(jsonReader, f, xPd);
    }

    private static <T> com.bytedance.adsdk.lottie.VwS.EYQ<T> EYQ(com.bytedance.adsdk.lottie.IPb iPb, JsonReader jsonReader, float f, XPd<T> xPd) throws IOException {
        Interpolator interpolatorEYQ;
        jsonReader.beginObject();
        PointF pointFMZx = null;
        boolean z = false;
        T tMZx = null;
        T tMZx2 = null;
        PointF pointFMZx2 = null;
        PointF pointFMZx3 = null;
        float fNextDouble = 0.0f;
        PointF pointFMZx4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    tMZx = xPd.mZx(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    pointFMZx4 = hYh.mZx(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFMZx = hYh.mZx(jsonReader, 1.0f);
                    break;
                case "s":
                    tMZx2 = xPd.mZx(jsonReader, f);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFMZx3 = hYh.mZx(jsonReader, f);
                    break;
                case "to":
                    pointFMZx2 = hYh.mZx(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z) {
            if (pointFMZx != null && pointFMZx4 != null) {
                interpolatorEYQ = EYQ(pointFMZx, pointFMZx4);
            }
            com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq = new com.bytedance.adsdk.lottie.VwS.EYQ<>(iPb, tMZx2, tMZx, interpolatorEYQ, fNextDouble, null);
            eyq.QQ = pointFMZx2;
            eyq.HX = pointFMZx3;
            return eyq;
        }
        tMZx = tMZx2;
        interpolatorEYQ = EYQ;
        com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq2 = new com.bytedance.adsdk.lottie.VwS.EYQ<>(iPb, tMZx2, tMZx, interpolatorEYQ, fNextDouble, null);
        eyq2.QQ = pointFMZx2;
        eyq2.HX = pointFMZx3;
        return eyq2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> com.bytedance.adsdk.lottie.VwS.EYQ<T> mZx(com.bytedance.adsdk.lottie.IPb r23, android.util.JsonReader r24, float r25, com.bytedance.adsdk.lottie.Kbd.XPd<T> r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.Kbd.zF.mZx(com.bytedance.adsdk.lottie.IPb, android.util.JsonReader, float, com.bytedance.adsdk.lottie.Kbd.XPd):com.bytedance.adsdk.lottie.VwS.EYQ");
    }

    private static Interpolator EYQ(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.lottie.IPb.Kbd.mZx(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.lottie.IPb.Kbd.mZx(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.lottie.IPb.Kbd.mZx(pointF2.x, -1.0f, 1.0f);
        pointF2.y = com.bytedance.adsdk.lottie.IPb.Kbd.mZx(pointF2.y, -100.0f, 100.0f);
        int iEYQ = com.bytedance.adsdk.lottie.IPb.IPb.EYQ(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> weakReferenceEYQ = com.bytedance.adsdk.lottie.Kbd.EYQ() ? null : EYQ(iEYQ);
        Interpolator interpolator = weakReferenceEYQ != null ? weakReferenceEYQ.get() : null;
        if (weakReferenceEYQ == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.lottie.hu.EYQ(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.lottie.hu.EYQ(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.lottie.Kbd.EYQ()) {
                try {
                    EYQ(iEYQ, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.lottie.VwS.EYQ<T> EYQ(JsonReader jsonReader, float f, XPd<T> xPd) throws IOException {
        return new com.bytedance.adsdk.lottie.VwS.EYQ<>(xPd.mZx(jsonReader, f));
    }
}
