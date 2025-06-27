package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;

/* loaded from: classes.dex */
final class qq implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f849a;
    private final long[] b;
    private final long c;
    private final long d;

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public static qq a(long j, long j2, of.a aVar, yg ygVar) {
        int iW;
        ygVar.g(10);
        int iJ = ygVar.j();
        if (iJ <= 0) {
            return null;
        }
        int i = aVar.d;
        long jC = yp.c(iJ, 1000000 * (i >= 32000 ? 1152 : 576), i);
        int iC = ygVar.C();
        int iC2 = ygVar.C();
        int iC3 = ygVar.C();
        ygVar.g(2);
        long j3 = j2 + aVar.c;
        long[] jArr = new long[iC];
        long[] jArr2 = new long[iC];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iC) {
            int i3 = iC2;
            long j5 = j3;
            jArr[i2] = (i2 * jC) / iC;
            jArr2[i2] = Math.max(j4, j5);
            if (iC3 == 1) {
                iW = ygVar.w();
            } else if (iC3 == 2) {
                iW = ygVar.C();
            } else if (iC3 == 3) {
                iW = ygVar.z();
            } else {
                if (iC3 != 4) {
                    return null;
                }
                iW = ygVar.A();
            }
            j4 += iW * i3;
            i2++;
            j3 = j5;
            iC2 = i3;
        }
        if (j != -1 && j != j4) {
            kc.d("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new qq(jArr, jArr2, jC, j4);
    }

    private qq(long[] jArr, long[] jArr2, long j, long j2) {
        this.f849a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        int iB = yp.b(this.f849a, j, true, true);
        gj gjVar = new gj(this.f849a[iB], this.b[iB]);
        if (gjVar.f462a < j && iB != this.f849a.length - 1) {
            int i = iB + 1;
            return new ej.a(gjVar, new gj(this.f849a[i], this.b[i]));
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.d;
    }

    @Override // com.applovin.impl.hj
    public long a(long j) {
        return this.f849a[yp.b(this.b, j, true, true)];
    }
}
