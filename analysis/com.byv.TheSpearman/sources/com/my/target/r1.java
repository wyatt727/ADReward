package com.my.target;

/* loaded from: classes4.dex */
public final class r1 {
    public static int a(float f, float f2) {
        float f3 = f - f2;
        if (f3 > 1.0E-6f) {
            return 1;
        }
        return f3 < -1.0E-6f ? -1 : 0;
    }
}
