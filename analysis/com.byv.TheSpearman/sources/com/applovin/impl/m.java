package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.n;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class m implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final xg f635a;
    private final yg b;
    private final String c;
    private String d;
    private ro e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private d9 k;
    private int l;
    private long m;

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public m() {
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
                        int iMin = Math.min(ygVar.a(), this.l - this.g);
                        this.e.a(ygVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.l;
                        if (i2 == i3) {
                            long j = this.m;
                            if (j != -9223372036854775807L) {
                                this.e.a(j, 1, i3, 0, null);
                                this.m += this.j;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(ygVar, this.b.c(), 16)) {
                    c();
                    this.b.f(0);
                    this.e.a(this.b, 16);
                    this.f = 2;
                }
            } else if (b(ygVar)) {
                this.f = 1;
                this.b.c()[0] = -84;
                this.b.c()[1] = (byte) (this.i ? 65 : 64);
                this.g = 2;
            }
        }
    }

    public m(String str) {
        xg xgVar = new xg(new byte[16]);
        this.f635a = xgVar;
        this.b = new yg(xgVar.f1169a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = str;
    }

    private boolean b(yg ygVar) {
        int iW;
        while (true) {
            if (ygVar.a() <= 0) {
                return false;
            }
            if (!this.h) {
                this.h = ygVar.w() == 172;
            } else {
                iW = ygVar.w();
                this.h = iW == 172;
                if (iW == 64 || iW == 65) {
                    break;
                }
            }
        }
        this.i = iW == 65;
        return true;
    }

    private void c() {
        this.f635a.c(0);
        n.b bVarA = n.a(this.f635a);
        d9 d9Var = this.k;
        if (d9Var == null || bVarA.c != d9Var.z || bVarA.b != d9Var.A || !MimeTypes.AUDIO_AC4.equals(d9Var.m)) {
            d9 d9VarA = new d9.b().c(this.d).f(MimeTypes.AUDIO_AC4).c(bVarA.c).n(bVarA.b).e(this.c).a();
            this.k = d9VarA;
            this.e.a(d9VarA);
        }
        this.l = bVarA.d;
        this.j = (bVarA.e * 1000000) / this.k.A;
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
            this.m = j;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }
}
