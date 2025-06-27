package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class wa implements o7 {
    private ro b;
    private boolean c;
    private int e;
    private int f;

    /* renamed from: a, reason: collision with root package name */
    private final yg f1126a = new yg(10);
    private long d = -9223372036854775807L;

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.b);
        if (this.c) {
            int iA = ygVar.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                System.arraycopy(ygVar.c(), ygVar.d(), this.f1126a.c(), this.f, iMin);
                if (this.f + iMin == 10) {
                    this.f1126a.f(0);
                    if (73 == this.f1126a.w() && 68 == this.f1126a.w() && 51 == this.f1126a.w()) {
                        this.f1126a.g(3);
                        this.e = this.f1126a.v() + 10;
                    } else {
                        kc.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.b.a(ygVar, iMin2);
            this.f += iMin2;
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
        int i;
        a1.b(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.a(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        ro roVarA = k8Var.a(dVar.c(), 5);
        this.b = roVarA;
        roVarA.a(new d9.b().c(dVar.b()).f("application/id3").a());
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
