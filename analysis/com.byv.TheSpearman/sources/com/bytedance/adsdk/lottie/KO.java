package com.bytedance.adsdk.lottie;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorApi14.java */
/* loaded from: classes2.dex */
class KO implements Interpolator {
    private final float[] EYQ;
    private final float[] mZx;

    KO(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.EYQ = new float[i];
        this.mZx = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.EYQ[i2] = fArr[0];
            this.mZx[i2] = fArr[1];
        }
    }

    KO(float f, float f2, float f3, float f4) {
        this(EYQ(f, f2, f3, f4));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.EYQ.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.EYQ[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.EYQ;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.mZx[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.mZx;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }

    private static Path EYQ(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
