package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public class n4 implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final long f707a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public n4(long j, long j2, int i, int i2, boolean z) {
        this.f707a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = a(j, j2, i);
        }
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        if (this.d == -1 && !this.g) {
            return new ej.a(new gj(0L, this.b));
        }
        long jC = c(j);
        long jD = d(jC);
        gj gjVar = new gj(jD, jC);
        if (this.d != -1 && jD < j) {
            long j2 = jC + this.c;
            if (j2 < this.f707a) {
                return new ej.a(gjVar, new gj(d(j2), j2));
            }
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f;
    }

    private static long a(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    private long c(long j) {
        long j2 = this.c;
        long jMin = (((j * this.e) / 8000000) / j2) * j2;
        long j3 = this.d;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j2);
        }
        return this.b + Math.max(jMin, 0L);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.d != -1 || this.g;
    }

    public long d(long j) {
        return a(j, this.b, this.e);
    }
}
