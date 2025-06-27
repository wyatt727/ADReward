package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public final class bl implements k8 {

    /* renamed from: a, reason: collision with root package name */
    private final long f296a;
    private final k8 b;

    public bl(long j, k8 k8Var) {
        this.f296a = j;
        this.b = k8Var;
    }

    @Override // com.applovin.impl.k8
    public void c() {
        this.b.c();
    }

    class a implements ej {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ej f297a;

        a(ej ejVar) {
            this.f297a = ejVar;
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.f297a.d();
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j) {
            ej.a aVarB = this.f297a.b(j);
            gj gjVar = aVarB.f389a;
            gj gjVar2 = new gj(gjVar.f462a, gjVar.b + bl.this.f296a);
            gj gjVar3 = aVarB.b;
            return new ej.a(gjVar2, new gj(gjVar3.f462a, gjVar3.b + bl.this.f296a));
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return this.f297a.b();
        }
    }

    @Override // com.applovin.impl.k8
    public void a(ej ejVar) {
        this.b.a(new a(ejVar));
    }

    @Override // com.applovin.impl.k8
    public ro a(int i, int i2) {
        return this.b.a(i, i2);
    }
}
