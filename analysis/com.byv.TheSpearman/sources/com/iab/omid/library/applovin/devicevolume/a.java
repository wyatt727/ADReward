package com.iab.omid.library.applovin.devicevolume;

/* loaded from: classes4.dex */
public class a {
    public float a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f = i / i2;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
