package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class k0 implements o7 {
    private static final byte[] v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f581a;
    private final xg b;
    private final yg c;
    private final String d;
    private String e;
    private ro f;
    private ro g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private ro t;
    private long u;

    public static boolean a(int i) {
        return (i & 65526) == 65520;
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public k0(boolean z) {
        this(z, null);
    }

    public long d() {
        return this.q;
    }

    private void g() {
        this.l = false;
        i();
    }

    public k0(boolean z, String str) {
        this.b = new xg(new byte[7]);
        this.c = new yg(Arrays.copyOf(v, 10));
        i();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.f581a = z;
        this.d = str;
    }

    private void i() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    private void k() {
        this.h = 2;
        this.i = v.length;
        this.r = 0;
        this.c.f(0);
    }

    private void j() {
        this.h = 3;
        this.i = 0;
    }

    private void h() {
        this.h = 1;
        this.i = 0;
    }

    private void b(yg ygVar) {
        if (ygVar.a() == 0) {
            return;
        }
        this.b.f1169a[0] = ygVar.c()[ygVar.d()];
        this.b.c(2);
        int iA = this.b.a(4);
        int i = this.n;
        if (i != -1 && iA != i) {
            g();
            return;
        }
        if (!this.l) {
            this.l = true;
            this.m = this.o;
            this.n = iA;
        }
        j();
    }

    private boolean a(yg ygVar, int i) {
        ygVar.f(i + 1);
        if (!b(ygVar, this.b.f1169a, 1)) {
            return false;
        }
        this.b.c(4);
        int iA = this.b.a(1);
        int i2 = this.m;
        if (i2 != -1 && iA != i2) {
            return false;
        }
        if (this.n != -1) {
            if (!b(ygVar, this.b.f1169a, 1)) {
                return true;
            }
            this.b.c(2);
            if (this.b.a(4) != this.n) {
                return false;
            }
            ygVar.f(i + 2);
        }
        if (!b(ygVar, this.b.f1169a, 4)) {
            return true;
        }
        this.b.c(14);
        int iA2 = this.b.a(13);
        if (iA2 < 7) {
            return false;
        }
        byte[] bArrC = ygVar.c();
        int iE = ygVar.e();
        int i3 = i + iA2;
        if (i3 >= iE) {
            return true;
        }
        byte b = bArrC[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == iE) {
                return true;
            }
            return a((byte) -1, bArrC[i4]) && ((bArrC[i4] & 8) >> 3) == iA;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iE) {
            return true;
        }
        if (bArrC[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iE || bArrC[i6] == 51;
    }

    private void f() {
        this.g.a(this.c, 10);
        this.c.f(6);
        a(this.g, 0L, 10, this.c.v() + 10);
    }

    private void e() {
        this.b.c(0);
        if (!this.p) {
            int i = 2;
            int iA = this.b.a(2) + 1;
            if (iA != 2) {
                kc.d("AdtsReader", "Detected audio object type: " + iA + ", but assuming AAC LC.");
            } else {
                i = iA;
            }
            this.b.d(5);
            byte[] bArrA = a.a(i, this.n, this.b.a(3));
            a.b bVarA = a.a(bArrA);
            d9 d9VarA = new d9.b().c(this.e).f("audio/mp4a-latm").a(bVarA.c).c(bVarA.b).n(bVarA.f233a).a(Collections.singletonList(bArrA)).e(this.d).a();
            this.q = 1024000000 / d9VarA.A;
            this.f.a(d9VarA);
            this.p = true;
        } else {
            this.b.d(10);
        }
        this.b.d(4);
        int iA2 = this.b.a(13);
        int i2 = iA2 - 7;
        if (this.k) {
            i2 = iA2 - 9;
        }
        a(this.f, this.q, 0, i2);
    }

    private void c() {
        a1.a(this.f);
        yp.a(this.t);
        yp.a(this.g);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int i = this.h;
            if (i == 0) {
                c(ygVar);
            } else if (i == 1) {
                b(ygVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (a(ygVar, this.b.f1169a, this.k ? 7 : 5)) {
                        e();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    d(ygVar);
                }
            } else if (a(ygVar, this.c.c(), 10)) {
                f();
            }
        }
    }

    private void d(yg ygVar) {
        int iMin = Math.min(ygVar.a(), this.r - this.i);
        this.t.a(ygVar, iMin);
        int i = this.i + iMin;
        this.i = i;
        int i2 = this.r;
        if (i == i2) {
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.t.a(j, 1, i2, 0, null);
                this.s += this.u;
            }
            i();
        }
    }

    private boolean b(yg ygVar, byte[] bArr, int i) {
        if (ygVar.a() < i) {
            return false;
        }
        ygVar.a(bArr, 0, i);
        return true;
    }

    private void c(yg ygVar) {
        byte[] bArrC = ygVar.c();
        int iD = ygVar.d();
        int iE = ygVar.e();
        while (iD < iE) {
            int i = iD + 1;
            byte b = bArrC[iD];
            int i2 = b & 255;
            if (this.j == 512 && a((byte) -1, (byte) i2) && (this.l || a(ygVar, iD - 1))) {
                this.o = (b & 8) >> 3;
                this.k = (b & 1) == 0;
                if (!this.l) {
                    h();
                } else {
                    j();
                }
                ygVar.f(i);
                return;
            }
            int i3 = this.j;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.j = 768;
            } else if (i4 == 511) {
                this.j = 512;
            } else if (i4 == 836) {
                this.j = 1024;
            } else if (i4 == 1075) {
                k();
                ygVar.f(i);
                return;
            } else if (i3 != 256) {
                this.j = 256;
            }
            iD = i;
        }
        ygVar.f(iD);
    }

    private boolean a(yg ygVar, byte[] bArr, int i) {
        int iMin = Math.min(ygVar.a(), i - this.i);
        ygVar.a(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.e = dVar.b();
        ro roVarA = k8Var.a(dVar.c(), 1);
        this.f = roVarA;
        this.t = roVarA;
        if (this.f581a) {
            dVar.a();
            ro roVarA2 = k8Var.a(dVar.c(), 5);
            this.g = roVarA2;
            roVarA2.a(new d9.b().c(dVar.b()).f("application/id3").a());
            return;
        }
        this.g = new g7();
    }

    private boolean a(byte b, byte b2) {
        return a(((b & 255) << 8) | (b2 & 255));
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.s = -9223372036854775807L;
        g();
    }

    private void a(ro roVar, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = roVar;
        this.u = j;
        this.r = i2;
    }
}
