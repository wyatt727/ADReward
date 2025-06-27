package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.List;

/* loaded from: classes.dex */
final class wp {

    /* renamed from: a, reason: collision with root package name */
    private final List f1140a;
    private final ro[] b;

    public wp(List list) {
        this.f1140a = list;
        this.b = new ro[list.size()];
    }

    public void a(long j, yg ygVar) {
        if (ygVar.a() < 9) {
            return;
        }
        int iJ = ygVar.j();
        int iJ2 = ygVar.j();
        int iW = ygVar.w();
        if (iJ == 434 && iJ2 == 1195456820 && iW == 3) {
            a3.b(j, ygVar, this.b);
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            ro roVarA = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.f1140a.get(i);
            String str = d9Var.m;
            a1.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            roVarA.a(new d9.b().c(dVar.b()).f(str).o(d9Var.d).e(d9Var.c).a(d9Var.E).a(d9Var.o).a());
            this.b[i] = roVarA;
        }
    }
}
