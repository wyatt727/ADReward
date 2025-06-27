package com.applovin.impl;

import com.applovin.impl.wd;

/* loaded from: classes.dex */
final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final rd f890a;
    public final Object b;
    public final yi[] c;
    public boolean d;
    public boolean e;
    public ud f;
    public boolean g;
    private final boolean[] h;
    private final mi[] i;
    private final wo j;
    private final ae k;
    private sd l;
    private qo m;
    private xo n;
    private long o;

    public sd(mi[] miVarArr, long j, wo woVar, n0 n0Var, ae aeVar, ud udVar, xo xoVar) {
        this.i = miVarArr;
        this.o = j;
        this.j = woVar;
        this.k = aeVar;
        wd.a aVar = udVar.f1062a;
        this.b = aVar.f1031a;
        this.f = udVar;
        this.m = qo.d;
        this.n = xoVar;
        this.c = new yi[miVarArr.length];
        this.h = new boolean[miVarArr.length];
        this.f890a = a(aVar, aeVar, n0Var, udVar.b, udVar.d);
    }

    public long f() {
        return this.o;
    }

    public long g() {
        return this.f.b + this.o;
    }

    public boolean j() {
        return this.d && (!this.e || this.f890a.e() == Long.MIN_VALUE);
    }

    public long c() {
        if (!this.d) {
            return this.f.b;
        }
        long jE = this.e ? this.f890a.e() : Long.MIN_VALUE;
        return jE == Long.MIN_VALUE ? this.f.e : jE;
    }

    public long e() {
        if (this.d) {
            return this.f890a.g();
        }
        return 0L;
    }

    public long a(xo xoVar, long j, boolean z) {
        return a(xoVar, j, z, new boolean[this.i.length]);
    }

    public long e(long j) {
        return j + f();
    }

    public void c(long j) {
        this.o = j;
    }

    public void l() {
        a();
        a(this.k, this.f890a);
    }

    public sd d() {
        return this.l;
    }

    public qo h() {
        return this.m;
    }

    public xo i() {
        return this.n;
    }

    public void m() {
        rd rdVar = this.f890a;
        if (rdVar instanceof i3) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((i3) rdVar).a(0L, j);
        }
    }

    private void b(yi[] yiVarArr) {
        int i = 0;
        while (true) {
            mi[] miVarArr = this.i;
            if (i >= miVarArr.length) {
                return;
            }
            if (miVarArr[i].e() == -2) {
                yiVarArr[i] = null;
            }
            i++;
        }
    }

    private boolean k() {
        return this.l == null;
    }

    public long d(long j) {
        return j - f();
    }

    public long a(xo xoVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= xoVar.f1181a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !xoVar.a(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        b(this.c);
        a();
        this.n = xoVar;
        b();
        long jA = this.f890a.a(xoVar.c, this.h, this.c, zArr, j);
        a(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            yi[] yiVarArr = this.c;
            if (i2 >= yiVarArr.length) {
                return jA;
            }
            if (yiVarArr[i2] != null) {
                a1.b(xoVar.a(i2));
                if (this.i[i2].e() != -2) {
                    this.e = true;
                }
            } else {
                a1.b(xoVar.c[i2] == null);
            }
            i2++;
        }
    }

    private void b() {
        if (!k()) {
            return;
        }
        int i = 0;
        while (true) {
            xo xoVar = this.n;
            if (i >= xoVar.f1181a) {
                return;
            }
            boolean zA = xoVar.a(i);
            f8 f8Var = this.n.c[i];
            if (zA && f8Var != null) {
                f8Var.i();
            }
            i++;
        }
    }

    public void b(long j) {
        a1.b(k());
        if (this.d) {
            this.f890a.c(d(j));
        }
    }

    private void a(yi[] yiVarArr) {
        int i = 0;
        while (true) {
            mi[] miVarArr = this.i;
            if (i >= miVarArr.length) {
                return;
            }
            if (miVarArr[i].e() == -2 && this.n.a(i)) {
                yiVarArr[i] = new q7();
            }
            i++;
        }
    }

    public void a(long j) {
        a1.b(k());
        this.f890a.b(d(j));
    }

    public xo b(float f, go goVar) {
        xo xoVarA = this.j.a(this.i, h(), this.f.f1062a, goVar);
        for (f8 f8Var : xoVarA.c) {
            if (f8Var != null) {
                f8Var.a(f);
            }
        }
        return xoVarA;
    }

    private static rd a(wd.a aVar, ae aeVar, n0 n0Var, long j, long j2) {
        rd rdVarA = aeVar.a(aVar, n0Var, j);
        return j2 != -9223372036854775807L ? new i3(rdVarA, true, 0L, j2) : rdVarA;
    }

    private void a() {
        if (!k()) {
            return;
        }
        int i = 0;
        while (true) {
            xo xoVar = this.n;
            if (i >= xoVar.f1181a) {
                return;
            }
            boolean zA = xoVar.a(i);
            f8 f8Var = this.n.c[i];
            if (zA && f8Var != null) {
                f8Var.f();
            }
            i++;
        }
    }

    public void a(float f, go goVar) {
        this.d = true;
        this.m = this.f890a.b();
        xo xoVarB = b(f, goVar);
        ud udVar = this.f;
        long jMax = udVar.b;
        long j = udVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(xoVarB, jMax, false);
        long j2 = this.o;
        ud udVar2 = this.f;
        this.o = j2 + (udVar2.b - jA);
        this.f = udVar2.b(jA);
    }

    private static void a(ae aeVar, rd rdVar) {
        try {
            if (rdVar instanceof i3) {
                aeVar.a(((i3) rdVar).f515a);
            } else {
                aeVar.a(rdVar);
            }
        } catch (RuntimeException e) {
            kc.a("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public void a(sd sdVar) {
        if (sdVar == this.l) {
            return;
        }
        a();
        this.l = sdVar;
        b();
    }
}
