package com.applovin.impl;

import android.opengl.Matrix;

/* loaded from: classes.dex */
final class i9 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f528a = new float[16];
    private final float[] b = new float[16];
    private final fo c = new fo();
    private boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean a(float[] fArr, long j) {
        float[] fArr2 = (float[]) this.c.c(j);
        if (fArr2 == null) {
            return false;
        }
        b(this.b, fArr2);
        if (!this.d) {
            a(this.f528a, this.b);
            this.d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f528a, 0, this.b, 0);
        return true;
    }

    public void a() {
        this.c.a();
        this.d = false;
    }

    public void a(long j, float[] fArr) {
        this.c.a(j, fArr);
    }
}
