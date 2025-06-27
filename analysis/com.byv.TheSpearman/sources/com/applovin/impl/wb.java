package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.Collections;

/* loaded from: classes.dex */
public final class wb implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1127a;
    private final yg b;
    private final xg c;
    private ro d;
    private String e;
    private d9 f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public wb(String str) {
        this.f1127a = str;
        yg ygVar = new yg(1024);
        this.b = ygVar;
        this.c = new xg(ygVar.c());
        this.k = -9223372036854775807L;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) throws ah {
        a1.b(this.d);
        while (ygVar.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int iW = ygVar.w();
                    if ((iW & 224) == 224) {
                        this.j = iW;
                        this.g = 2;
                    } else if (iW != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int iW2 = ((this.j & (-225)) << 8) | ygVar.w();
                    this.i = iW2;
                    if (iW2 > this.b.c().length) {
                        a(this.i);
                    }
                    this.h = 0;
                    this.g = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(ygVar.a(), this.i - this.h);
                    ygVar.a(this.c.f1169a, this.h, iMin);
                    int i2 = this.h + iMin;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.c(0);
                        b(this.c);
                        this.g = 0;
                    }
                }
            } else if (ygVar.w() == 86) {
                this.g = 1;
            }
        }
    }

    private void b(xg xgVar) throws ah {
        if (!xgVar.f()) {
            this.l = true;
            f(xgVar);
        } else if (!this.l) {
            return;
        }
        if (this.m == 0) {
            if (this.n == 0) {
                a(xgVar, e(xgVar));
                if (this.p) {
                    xgVar.d((int) this.q);
                    return;
                }
                return;
            }
            throw ah.a(null, null);
        }
        throw ah.a(null, null);
    }

    private void f(xg xgVar) throws ah {
        boolean zF;
        int iA = xgVar.a(1);
        int iA2 = iA == 1 ? xgVar.a(1) : 0;
        this.m = iA2;
        if (iA2 == 0) {
            if (iA == 1) {
                a(xgVar);
            }
            if (xgVar.f()) {
                this.n = xgVar.a(6);
                int iA3 = xgVar.a(4);
                int iA4 = xgVar.a(3);
                if (iA3 == 0 && iA4 == 0) {
                    if (iA == 0) {
                        int iE = xgVar.e();
                        int iC = c(xgVar);
                        xgVar.c(iE);
                        byte[] bArr = new byte[(iC + 7) / 8];
                        xgVar.a(bArr, 0, iC);
                        d9 d9VarA = new d9.b().c(this.e).f("audio/mp4a-latm").a(this.u).c(this.t).n(this.r).a(Collections.singletonList(bArr)).e(this.f1127a).a();
                        if (!d9VarA.equals(this.f)) {
                            this.f = d9VarA;
                            this.s = 1024000000 / d9VarA.A;
                            this.d.a(d9VarA);
                        }
                    } else {
                        xgVar.d(((int) a(xgVar)) - c(xgVar));
                    }
                    d(xgVar);
                    boolean zF2 = xgVar.f();
                    this.p = zF2;
                    this.q = 0L;
                    if (zF2) {
                        if (iA == 1) {
                            this.q = a(xgVar);
                        } else {
                            do {
                                zF = xgVar.f();
                                this.q = (this.q << 8) + xgVar.a(8);
                            } while (zF);
                        }
                    }
                    if (xgVar.f()) {
                        xgVar.d(8);
                        return;
                    }
                    return;
                }
                throw ah.a(null, null);
            }
            throw ah.a(null, null);
        }
        throw ah.a(null, null);
    }

    private void d(xg xgVar) {
        int iA = xgVar.a(3);
        this.o = iA;
        if (iA == 0) {
            xgVar.d(8);
            return;
        }
        if (iA == 1) {
            xgVar.d(9);
            return;
        }
        if (iA == 3 || iA == 4 || iA == 5) {
            xgVar.d(6);
        } else {
            if (iA != 6 && iA != 7) {
                throw new IllegalStateException();
            }
            xgVar.d(1);
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.d = k8Var.a(dVar.c(), 1);
        this.e = dVar.b();
    }

    private int c(xg xgVar) throws ah {
        int iB = xgVar.b();
        a.b bVarA = a.a(xgVar, true);
        this.u = bVarA.c;
        this.r = bVarA.f233a;
        this.t = bVarA.b;
        return iB - xgVar.b();
    }

    private int e(xg xgVar) throws ah {
        int iA;
        if (this.o != 0) {
            throw ah.a(null, null);
        }
        int i = 0;
        do {
            iA = xgVar.a(8);
            i += iA;
        } while (iA == 255);
        return i;
    }

    private static long a(xg xgVar) {
        return xgVar.a((xgVar.a(2) + 1) * 8);
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    private void a(xg xgVar, int i) {
        int iE = xgVar.e();
        if ((iE & 7) == 0) {
            this.b.f(iE >> 3);
        } else {
            xgVar.a(this.b.c(), 0, i * 8);
            this.b.f(0);
        }
        this.d.a(this.b, i);
        long j = this.k;
        if (j != -9223372036854775807L) {
            this.d.a(j, 1, i, 0, null);
            this.k += this.s;
        }
    }

    private void a(int i) {
        this.b.d(i);
        this.c.a(this.b.c());
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
}
