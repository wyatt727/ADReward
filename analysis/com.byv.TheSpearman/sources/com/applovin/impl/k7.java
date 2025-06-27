package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k7 implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final List f591a;
    private final ro[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public k7(List list) {
        this.f591a = list;
        this.b = new ro[list.size()];
    }

    @Override // com.applovin.impl.o7
    public void b() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (ro roVar : this.b) {
                    roVar.a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    private boolean a(yg ygVar, int i) {
        if (ygVar.a() == 0) {
            return false;
        }
        if (ygVar.w() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        if (this.c) {
            if (this.d != 2 || a(ygVar, 32)) {
                if (this.d != 1 || a(ygVar, 0)) {
                    int iD = ygVar.d();
                    int iA = ygVar.a();
                    for (ro roVar : this.b) {
                        ygVar.f(iD);
                        roVar.a(ygVar, iA);
                    }
                    this.e += iA;
                }
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            ep.a aVar = (ep.a) this.f591a.get(i);
            dVar.a();
            ro roVarA = k8Var.a(dVar.c(), 3);
            roVarA.a(new d9.b().c(dVar.b()).f("application/dvbsubs").a(Collections.singletonList(aVar.c)).e(aVar.f395a).a());
            this.b[i] = roVarA;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
