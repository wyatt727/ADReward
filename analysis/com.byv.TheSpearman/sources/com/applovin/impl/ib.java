package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public final class ib implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f529a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public ib(long[] jArr, long[] jArr2, long j) {
        a1.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (z && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f529a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f529a = jArr;
            this.b = jArr2;
        }
        this.c = j;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        if (!this.d) {
            return new ej.a(gj.c);
        }
        int iB = yp.b(this.b, j, true, true);
        gj gjVar = new gj(this.b[iB], this.f529a[iB]);
        if (gjVar.f462a != j && iB != this.b.length - 1) {
            int i = iB + 1;
            return new ej.a(gjVar, new gj(this.b[i], this.f529a[i]));
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.d;
    }
}
