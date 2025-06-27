package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.List;

/* loaded from: classes.dex */
public final class jj {

    /* renamed from: a, reason: collision with root package name */
    private final List f572a;
    private final ro[] b;

    public jj(List list) {
        this.f572a = list;
        this.b = new ro[list.size()];
    }

    public void a(long j, yg ygVar) {
        a3.a(j, ygVar, this.b);
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            ro roVarA = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.f572a.get(i);
            String str = d9Var.m;
            a1.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strB = d9Var.f355a;
            if (strB == null) {
                strB = dVar.b();
            }
            roVarA.a(new d9.b().c(strB).f(str).o(d9Var.d).e(d9Var.c).a(d9Var.E).a(d9Var.o).a());
            this.b[i] = roVarA;
        }
    }
}
