package com.my.target;

/* loaded from: classes4.dex */
public class w5 extends oa {
    public final float e;
    public final boolean f;
    public float g;

    public w5(String str, String str2, float f, int i, boolean z) {
        super(str, str2, i);
        this.g = 0.0f;
        this.e = f;
        this.f = z;
    }

    public static w5 a(String str, float f, int i, boolean z) {
        return new w5("mrcStat", str, f, i, z);
    }

    public void a(float f) {
        this.g = f;
    }

    public float d() {
        return this.g;
    }
}
