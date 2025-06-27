package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
final class es implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long f400a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public static es a(long j, long j2, of.a aVar, yg ygVar) {
        int iA;
        int i = aVar.g;
        int i2 = aVar.d;
        int iJ = ygVar.j();
        if ((iJ & 1) != 1 || (iA = ygVar.A()) == 0) {
            return null;
        }
        long jC = yp.c(iA, i * 1000000, i2);
        if ((iJ & 6) != 6) {
            return new es(j2, aVar.c, jC);
        }
        long jY = ygVar.y();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = ygVar.w();
        }
        if (j != -1) {
            long j3 = j2 + jY;
            if (j != j3) {
                kc.d("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new es(j2, aVar.c, jC, jY, jArr);
    }

    private es(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        if (!b()) {
            return new ej.a(new gj(0L, this.f400a + this.b));
        }
        long jB = yp.b(j, 0L, this.c);
        double d = (jB * 100.0d) / this.c;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) a1.b(this.f))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new ej.a(new gj(jB, this.f400a + yp.b(Math.round((d2 / 256.0d) * this.d), this.b, this.d - 1)));
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.e;
    }

    private es(long j, int i, long j2, long j3, long[] jArr) {
        this.f400a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.applovin.impl.hj
    public long a(long j) {
        long j2 = j - this.f400a;
        if (!b() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) a1.b(this.f);
        double d = (j2 * 256.0d) / this.d;
        int iB = yp.b(jArr, (long) d, true, true);
        long jA = a(iB);
        long j3 = jArr[iB];
        int i = iB + 1;
        long jA2 = a(i);
        return jA + Math.round((j3 == (iB == 99 ? 256L : jArr[i]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (r0 - j3)) * (jA2 - jA));
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.f != null;
    }

    private long a(int i) {
        return (this.c * i) / 100;
    }
}
