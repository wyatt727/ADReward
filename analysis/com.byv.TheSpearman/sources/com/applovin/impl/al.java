package com.applovin.impl;

/* loaded from: classes.dex */
final class al extends f9 {
    private final long b;

    public al(j8 j8Var, long j) {
        super(j8Var);
        a1.a(j8Var.f() >= j);
        this.b = j;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long f() {
        return super.f() - this.b;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long d() {
        return super.d() - this.b;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long a() {
        return super.a() - this.b;
    }
}
