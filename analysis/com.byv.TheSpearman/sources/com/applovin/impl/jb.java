package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
final class jb implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long f565a;
    private final mc b;
    private final mc c;
    private long d;

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public jb(long j, long j2, long j3) {
        this.d = j;
        this.f565a = j3;
        mc mcVar = new mc();
        this.b = mcVar;
        mc mcVar2 = new mc();
        this.c = mcVar2;
        mcVar.a(0L);
        mcVar2.a(j2);
    }

    @Override // com.applovin.impl.hj
    public long a(long j) {
        return this.b.a(yp.a(this.c, j, true, true));
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.f565a;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.d;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        int iA = yp.a(this.b, j, true, true);
        gj gjVar = new gj(this.b.a(iA), this.c.a(iA));
        if (gjVar.f462a != j && iA != this.b.a() - 1) {
            int i = iA + 1;
            return new ej.a(gjVar, new gj(this.b.a(i), this.c.a(i)));
        }
        return new ej.a(gjVar);
    }

    public void a(long j, long j2) {
        if (c(j)) {
            return;
        }
        this.b.a(j);
        this.c.a(j2);
    }

    public boolean c(long j) {
        mc mcVar = this.b;
        return j - mcVar.a(mcVar.a() - 1) < 100000;
    }

    void d(long j) {
        this.d = j;
    }
}
