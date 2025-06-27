package com.applovin.impl;

import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class c7 implements o7 {
    private final String b;
    private String c;
    private ro d;
    private int f;
    private int g;
    private long h;
    private d9 i;
    private int j;

    /* renamed from: a, reason: collision with root package name */
    private final yg f314a = new yg(new byte[18]);
    private int e = 0;
    private long k = -9223372036854775807L;

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public c7(String str) {
        this.b = str;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.d);
        while (ygVar.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(ygVar.a(), this.j - this.f);
                        this.d.a(ygVar, iMin);
                        int i2 = this.f + iMin;
                        this.f = i2;
                        int i3 = this.j;
                        if (i2 == i3) {
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.a(j, 1, i3, 0, null);
                                this.k += this.h;
                            }
                            this.e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(ygVar, this.f314a.c(), 18)) {
                    c();
                    this.f314a.f(0);
                    this.d.a(this.f314a, 18);
                    this.e = 2;
                }
            } else if (b(ygVar)) {
                this.e = 1;
            }
        }
    }

    private boolean b(yg ygVar) {
        while (ygVar.a() > 0) {
            int i = this.g << 8;
            this.g = i;
            int iW = i | ygVar.w();
            this.g = iW;
            if (d7.a(iW)) {
                byte[] bArrC = this.f314a.c();
                int i2 = this.g;
                bArrC[0] = (byte) ((i2 >> 24) & 255);
                bArrC[1] = (byte) ((i2 >> 16) & 255);
                bArrC[2] = (byte) ((i2 >> 8) & 255);
                bArrC[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    private void c() {
        byte[] bArrC = this.f314a.c();
        if (this.i == null) {
            d9 d9VarA = d7.a(bArrC, this.c, this.b, null);
            this.i = d9VarA;
            this.d.a(d9VarA);
        }
        this.j = d7.a(bArrC);
        this.h = (int) ((d7.d(bArrC) * 1000000) / this.i.A);
    }

    private boolean a(yg ygVar, byte[] bArr, int i) {
        int iMin = Math.min(ygVar.a(), i - this.f);
        ygVar.a(bArr, this.f, iMin);
        int i2 = this.f + iMin;
        this.f = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }
}
