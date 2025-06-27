package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
public abstract class pl extends wg implements kl {
    private kl d;
    private long f;

    @Override // com.applovin.impl.kl
    public long a(int i) {
        return ((kl) a1.a(this.d)).a(i) + this.f;
    }

    @Override // com.applovin.impl.j2
    public void b() {
        super.b();
        this.d = null;
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return ((kl) a1.a(this.d)).a();
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        return ((kl) a1.a(this.d)).b(j - this.f);
    }

    @Override // com.applovin.impl.kl
    public int a(long j) {
        return ((kl) a1.a(this.d)).a(j - this.f);
    }

    public void a(long j, kl klVar, long j2) {
        this.b = j;
        this.d = klVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
