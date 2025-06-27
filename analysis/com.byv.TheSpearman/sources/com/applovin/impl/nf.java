package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.of;

/* loaded from: classes.dex */
public final class nf implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final yg f716a;
    private final of.a b;
    private final String c;
    private ro d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public nf() {
        this(null);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.d);
        while (ygVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                b(ygVar);
            } else if (i == 1) {
                d(ygVar);
            } else if (i == 2) {
                c(ygVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public nf(String str) {
        this.f = 0;
        yg ygVar = new yg(4);
        this.f716a = ygVar;
        ygVar.c()[0] = -1;
        this.b = new of.a();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    private void b(yg ygVar) {
        byte[] bArrC = ygVar.c();
        int iE = ygVar.e();
        for (int iD = ygVar.d(); iD < iE; iD++) {
            byte b = bArrC[iD];
            boolean z = (b & 255) == 255;
            boolean z2 = this.i && (b & 224) == 224;
            this.i = z;
            if (z2) {
                ygVar.f(iD + 1);
                this.i = false;
                this.f716a.c()[1] = bArrC[iD];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        ygVar.f(iE);
    }

    private void d(yg ygVar) {
        int iMin = Math.min(ygVar.a(), 4 - this.g);
        ygVar.a(this.f716a.c(), this.g, iMin);
        int i = this.g + iMin;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.f716a.f(0);
        if (!this.b.a(this.f716a.j())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        this.k = this.b.c;
        if (!this.h) {
            this.j = (r8.g * 1000000) / r8.d;
            this.d.a(new d9.b().c(this.e).f(this.b.b).i(4096).c(this.b.e).n(this.b.d).e(this.c).a());
            this.h = true;
        }
        this.f716a.f(0);
        this.d.a(this.f716a, 4);
        this.f = 2;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.d = k8Var.a(dVar.c(), 1);
    }

    private void c(yg ygVar) {
        int iMin = Math.min(ygVar.a(), this.k - this.g);
        this.d.a(ygVar, iMin);
        int i = this.g + iMin;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            this.d.a(j, 1, i2, 0, null);
            this.l += this.j;
        }
        this.g = 0;
        this.f = 0;
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
}
