package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.k;

/* loaded from: classes.dex */
public final class j implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final xg f548a;
    private final yg b;
    private final String c;
    private String d;
    private ro e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private d9 j;
    private int k;
    private long l;

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public j() {
        this(null);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.e);
        while (ygVar.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(ygVar.a(), this.k - this.g);
                        this.e.a(ygVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            long j = this.l;
                            if (j != -9223372036854775807L) {
                                this.e.a(j, 1, i3, 0, null);
                                this.l += this.i;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(ygVar, this.b.c(), 128)) {
                    c();
                    this.b.f(0);
                    this.e.a(this.b, 128);
                    this.f = 2;
                }
            } else if (b(ygVar)) {
                this.f = 1;
                this.b.c()[0] = 11;
                this.b.c()[1] = 119;
                this.g = 2;
            }
        }
    }

    public j(String str) {
        xg xgVar = new xg(new byte[128]);
        this.f548a = xgVar;
        this.b = new yg(xgVar.f1169a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    private boolean b(yg ygVar) {
        while (true) {
            if (ygVar.a() <= 0) {
                return false;
            }
            if (!this.h) {
                this.h = ygVar.w() == 11;
            } else {
                int iW = ygVar.w();
                if (iW == 119) {
                    this.h = false;
                    return true;
                }
                this.h = iW == 11;
            }
        }
    }

    private void c() {
        this.f548a.c(0);
        k.b bVarA = k.a(this.f548a);
        d9 d9Var = this.j;
        if (d9Var == null || bVarA.d != d9Var.z || bVarA.c != d9Var.A || !yp.a((Object) bVarA.f580a, (Object) d9Var.m)) {
            d9 d9VarA = new d9.b().c(this.d).f(bVarA.f580a).c(bVarA.d).n(bVarA.c).e(this.c).a();
            this.j = d9VarA;
            this.e.a(d9VarA);
        }
        this.k = bVarA.e;
        this.i = (bVarA.f * 1000000) / this.j.A;
    }

    private boolean a(yg ygVar, byte[] bArr, int i) {
        int iMin = Math.min(ygVar.a(), i - this.g);
        ygVar.a(bArr, this.g, iMin);
        int i2 = this.g + iMin;
        this.g = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = k8Var.a(dVar.c(), 1);
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
        this.h = false;
        this.l = -9223372036854775807L;
    }
}
