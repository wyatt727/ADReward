package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class bh implements cj {

    /* renamed from: a, reason: collision with root package name */
    private d9 f293a;
    private io b;
    private ro c;

    public bh(String str) {
        this.f293a = new d9.b().f(str).a();
    }

    private void a() {
        a1.b(this.b);
        yp.a(this.c);
    }

    @Override // com.applovin.impl.cj
    public void a(yg ygVar) {
        a();
        long jB = this.b.b();
        long jC = this.b.c();
        if (jB == -9223372036854775807L || jC == -9223372036854775807L) {
            return;
        }
        d9 d9Var = this.f293a;
        if (jC != d9Var.q) {
            d9 d9VarA = d9Var.a().a(jC).a();
            this.f293a = d9VarA;
            this.c.a(d9VarA);
        }
        int iA = ygVar.a();
        this.c.a(ygVar, iA);
        this.c.a(jB, 1, iA, 0, null);
    }

    @Override // com.applovin.impl.cj
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.b = ioVar;
        dVar.a();
        ro roVarA = k8Var.a(dVar.c(), 5);
        this.c = roVarA;
        roVarA.a(this.f293a);
    }
}
