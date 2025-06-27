package com.applovin.impl;

/* loaded from: classes.dex */
final class cp {

    /* renamed from: a, reason: collision with root package name */
    private final int f341a;
    private boolean d;
    private boolean e;
    private boolean f;
    private final io b = new io(0);
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private final yg c = new yg();

    cp(int i) {
        this.f341a = i;
    }

    public boolean c() {
        return this.d;
    }

    public io b() {
        return this.b;
    }

    private int a(j8 j8Var) {
        this.c.a(yp.f);
        this.d = true;
        j8Var.b();
        return 0;
    }

    private int c(j8 j8Var, qh qhVar, int i) {
        long jA = j8Var.a();
        int iMin = (int) Math.min(this.f341a, jA);
        long j = jA - iMin;
        if (j8Var.f() != j) {
            qhVar.f835a = j;
            return 1;
        }
        this.c.d(iMin);
        j8Var.b();
        j8Var.c(this.c.c(), 0, iMin);
        this.h = b(this.c, i);
        this.f = true;
        return 0;
    }

    public long a() {
        return this.i;
    }

    private int b(j8 j8Var, qh qhVar, int i) {
        int iMin = (int) Math.min(this.f341a, j8Var.a());
        long j = 0;
        if (j8Var.f() != j) {
            qhVar.f835a = j;
            return 1;
        }
        this.c.d(iMin);
        j8Var.b();
        j8Var.c(this.c.c(), 0, iMin);
        this.g = a(this.c, i);
        this.e = true;
        return 0;
    }

    public int a(j8 j8Var, qh qhVar, int i) {
        if (i <= 0) {
            return a(j8Var);
        }
        if (!this.f) {
            return c(j8Var, qhVar, i);
        }
        if (this.h == -9223372036854775807L) {
            return a(j8Var);
        }
        if (!this.e) {
            return b(j8Var, qhVar, i);
        }
        long j = this.g;
        if (j == -9223372036854775807L) {
            return a(j8Var);
        }
        long jB = this.b.b(this.h) - this.b.b(j);
        this.i = jB;
        if (jB < 0) {
            kc.d("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = -9223372036854775807L;
        }
        return a(j8Var);
    }

    private long b(yg ygVar, int i) {
        int iD = ygVar.d();
        int iE = ygVar.e();
        for (int i2 = iE - 188; i2 >= iD; i2--) {
            if (fp.a(ygVar.c(), iD, iE, i2)) {
                long jA = fp.a(ygVar, i2, i);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long a(yg ygVar, int i) {
        int iE = ygVar.e();
        for (int iD = ygVar.d(); iD < iE; iD++) {
            if (ygVar.c()[iD] == 71) {
                long jA = fp.a(ygVar, iD, i);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }
}
