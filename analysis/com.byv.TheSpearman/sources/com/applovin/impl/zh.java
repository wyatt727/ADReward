package com.applovin.impl;

/* loaded from: classes.dex */
final class zh {

    /* renamed from: a, reason: collision with root package name */
    public final a f1244a;
    public final a b;
    public final int c;
    public final boolean d;

    public static zh a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8;
        int i9 = i;
        int i10 = i2;
        a1.a(f > 0.0f);
        a1.a(i9 >= 1);
        a1.a(i10 >= 1);
        a1.a(f2 > 0.0f && f2 <= 180.0f);
        a1.a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i9;
        float f6 = radians2 / i10;
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[i12 * 3];
        float[] fArr3 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f7 = radians / 2.0f;
            float f8 = (i13 * f5) - f7;
            int i16 = i13 + 1;
            float f9 = (i16 * f5) - f7;
            int i17 = 0;
            while (i17 < i11) {
                float f10 = f8;
                int i18 = i16;
                int i19 = 0;
                int i20 = 2;
                while (i19 < i20) {
                    if (i19 == 0) {
                        f4 = f10;
                        i4 = i11;
                    } else {
                        i4 = i11;
                        f4 = f9;
                    }
                    float f11 = i17 * f6;
                    float f12 = f6;
                    int i21 = i17;
                    double d = f;
                    float f13 = f5;
                    double d2 = (f11 + 3.1415927f) - (radians2 / 2.0f);
                    int i22 = i19;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f14 = f9;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    float f15 = radians;
                    float f16 = radians2;
                    fArr2[i14 + 1] = (float) (d * Math.sin(d3));
                    int i23 = i14 + 3;
                    fArr2[i14 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr4[i15] = f11 / f16;
                    int i24 = i15 + 2;
                    fArr4[i15 + 1] = ((i13 + i22) * f13) / f15;
                    if (i21 == 0 && i22 == 0) {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                    } else {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                        if (i6 != i5 || i7 != 1) {
                            fArr = fArr4;
                            i8 = 2;
                            i15 = i24;
                            i14 = i23;
                        }
                        int i25 = i7 + 1;
                        fArr3 = fArr;
                        i20 = i8;
                        radians = f15;
                        i11 = i4;
                        f6 = f12;
                        f5 = f13;
                        f9 = f14;
                        i19 = i25;
                        i10 = i5;
                        i17 = i6;
                        radians2 = f16;
                    }
                    System.arraycopy(fArr2, i14, fArr2, i23, 3);
                    i14 += 6;
                    fArr = fArr4;
                    i8 = 2;
                    System.arraycopy(fArr, i15, fArr, i24, 2);
                    i15 += 4;
                    int i252 = i7 + 1;
                    fArr3 = fArr;
                    i20 = i8;
                    radians = f15;
                    i11 = i4;
                    f6 = f12;
                    f5 = f13;
                    f9 = f14;
                    i19 = i252;
                    i10 = i5;
                    i17 = i6;
                    radians2 = f16;
                }
                float f17 = radians2;
                int i26 = i17;
                int i27 = i10;
                int i28 = i26 + 1;
                f8 = f10;
                i16 = i18;
                f6 = f6;
                radians2 = f17;
                f9 = f9;
                i10 = i27;
                i17 = i28;
            }
            i9 = i;
            i13 = i16;
        }
        return new zh(new a(new b(0, fArr2, fArr3, 1)), i3);
    }

    public zh(a aVar, int i) {
        this(aVar, aVar, i);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1246a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f1246a = i;
            a1.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }

        public int a() {
            return this.c.length / 3;
        }
    }

    public static zh a(int i) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f1245a;

        public a(b... bVarArr) {
            this.f1245a = bVarArr;
        }

        public b a(int i) {
            return this.f1245a[i];
        }

        public int a() {
            return this.f1245a.length;
        }
    }

    public zh(a aVar, a aVar2, int i) {
        this.f1244a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }
}
