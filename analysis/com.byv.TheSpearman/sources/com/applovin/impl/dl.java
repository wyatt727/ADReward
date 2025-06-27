package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
abstract class dl {
    private ro b;
    private k8 c;
    private gg d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private long k;
    private boolean l;
    private boolean m;

    /* renamed from: a, reason: collision with root package name */
    private final eg f367a = new eg();
    private b j = new b();

    static class b {

        /* renamed from: a, reason: collision with root package name */
        d9 f368a;
        gg b;

        b() {
        }
    }

    protected abstract long a(yg ygVar);

    protected abstract boolean a(yg ygVar, long j, b bVar);

    private static final class c implements gg {
        private c() {
        }

        @Override // com.applovin.impl.gg
        public long a(j8 j8Var) {
            return -1L;
        }

        @Override // com.applovin.impl.gg
        public void a(long j) {
        }

        @Override // com.applovin.impl.gg
        public ej a() {
            return new ej.b(-9223372036854775807L);
        }
    }

    private void a() {
        a1.b(this.b);
        yp.a(this.c);
    }

    protected long b(long j) {
        return (this.i * j) / 1000000;
    }

    protected void c(long j) {
        this.g = j;
    }

    protected long a(long j) {
        return (j * 1000000) / this.i;
    }

    private int b(j8 j8Var) {
        if (!a(j8Var)) {
            return -1;
        }
        d9 d9Var = this.j.f368a;
        this.i = d9Var.A;
        if (!this.m) {
            this.b.a(d9Var);
            this.m = true;
        }
        gg ggVar = this.j.b;
        if (ggVar != null) {
            this.d = ggVar;
        } else if (j8Var.a() == -1) {
            this.d = new c();
        } else {
            fg fgVarA = this.f367a.a();
            this.d = new h6(this, this.f, j8Var.a(), fgVarA.h + fgVarA.i, fgVarA.c, (fgVarA.b & 4) != 0);
        }
        this.h = 2;
        this.f367a.d();
        return 0;
    }

    void a(k8 k8Var, ro roVar) {
        this.c = k8Var;
        this.b = roVar;
        a(true);
    }

    final int a(j8 j8Var, qh qhVar) {
        a();
        int i = this.h;
        if (i == 0) {
            return b(j8Var);
        }
        if (i == 1) {
            j8Var.a((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i == 2) {
            yp.a(this.d);
            return b(j8Var, qhVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    private int b(j8 j8Var, qh qhVar) {
        long jA = this.d.a(j8Var);
        if (jA >= 0) {
            qhVar.f835a = jA;
            return 1;
        }
        if (jA < -1) {
            c(-(jA + 2));
        }
        if (!this.l) {
            this.c.a((ej) a1.b(this.d.a()));
            this.l = true;
        }
        if (this.k <= 0 && !this.f367a.a(j8Var)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        yg ygVarB = this.f367a.b();
        long jA2 = a(ygVarB);
        if (jA2 >= 0) {
            long j = this.g;
            if (j + jA2 >= this.e) {
                long jA3 = a(j);
                this.b.a(ygVarB, ygVarB.e());
                this.b.a(jA3, 1, ygVarB.e(), 0, null);
                this.e = -1L;
            }
        }
        this.g += jA2;
        return 0;
    }

    private boolean a(j8 j8Var) {
        while (this.f367a.a(j8Var)) {
            this.k = j8Var.f() - this.f;
            if (!a(this.f367a.b(), this.f, this.j)) {
                return true;
            }
            this.f = j8Var.f();
        }
        this.h = 3;
        return false;
    }

    protected void a(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    final void a(long j, long j2) {
        this.f367a.c();
        if (j == 0) {
            a(!this.l);
        } else if (this.h != 0) {
            this.e = b(j2);
            ((gg) yp.a(this.d)).a(this.e);
            this.h = 2;
        }
    }
}
