package com.bytedance.adsdk.lottie.IPb;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.Td.mZx.nWX;

/* compiled from: MiscUtils.java */
/* loaded from: classes2.dex */
public class Kbd {
    private static final PointF EYQ = new PointF();

    public static float EYQ(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int EYQ(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static boolean Td(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF EYQ(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void EYQ(nWX nwx, Path path) {
        path.reset();
        PointF pointFEYQ = nwx.EYQ();
        path.moveTo(pointFEYQ.x, pointFEYQ.y);
        EYQ.set(pointFEYQ.x, pointFEYQ.y);
        for (int i = 0; i < nwx.Td().size(); i++) {
            com.bytedance.adsdk.lottie.Td.EYQ eyq = nwx.Td().get(i);
            PointF pointFEYQ2 = eyq.EYQ();
            PointF pointFMZx = eyq.mZx();
            PointF pointFTd = eyq.Td();
            PointF pointF = EYQ;
            if (pointFEYQ2.equals(pointF) && pointFMZx.equals(pointFTd)) {
                path.lineTo(pointFTd.x, pointFTd.y);
            } else {
                path.cubicTo(pointFEYQ2.x, pointFEYQ2.y, pointFMZx.x, pointFMZx.y, pointFTd.x, pointFTd.y);
            }
            pointF.set(pointFTd.x, pointFTd.y);
        }
        if (nwx.mZx()) {
            path.close();
        }
    }

    static int EYQ(float f, float f2) {
        return EYQ((int) f, (int) f2);
    }

    private static int EYQ(int i, int i2) {
        return i - (i2 * mZx(i, i2));
    }

    private static int mZx(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int EYQ(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float mZx(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
