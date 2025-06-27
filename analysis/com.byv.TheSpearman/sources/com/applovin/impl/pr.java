package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
final class pr implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final nr f793a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public pr(nr nrVar, int i, long j, long j2) {
        this.f793a = nrVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / nrVar.e;
        this.d = j3;
        this.e = c(j3);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.e;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        long jB = yp.b((this.f793a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = this.c + (this.f793a.e * jB);
        long jC = c(jB);
        gj gjVar = new gj(jC, j2);
        if (jC < j && jB != this.d - 1) {
            long j3 = jB + 1;
            return new ej.a(gjVar, new gj(c(j3), this.c + (this.f793a.e * j3)));
        }
        return new ej.a(gjVar);
    }

    private long c(long j) {
        return yp.c(j * this.b, 1000000L, this.f793a.c);
    }
}
