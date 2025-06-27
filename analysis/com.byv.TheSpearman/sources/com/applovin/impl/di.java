package com.applovin.impl;

/* loaded from: classes.dex */
final class di {
    private boolean c;
    private boolean d;
    private boolean e;

    /* renamed from: a, reason: collision with root package name */
    private final io f365a = new io(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final yg b = new yg();

    di() {
    }

    public boolean c() {
        return this.c;
    }

    public io b() {
        return this.f365a;
    }

    private int b(j8 j8Var, qh qhVar) {
        int iMin = (int) Math.min(20000L, j8Var.a());
        long j = 0;
        if (j8Var.f() != j) {
            qhVar.f835a = j;
            return 1;
        }
        this.b.d(iMin);
        j8Var.b();
        j8Var.c(this.b.c(), 0, iMin);
        this.f = a(this.b);
        this.d = true;
        return 0;
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int c(j8 j8Var, qh qhVar) {
        long jA = j8Var.a();
        int iMin = (int) Math.min(20000L, jA);
        long j = jA - iMin;
        if (j8Var.f() != j) {
            qhVar.f835a = j;
            return 1;
        }
        this.b.d(iMin);
        j8Var.b();
        j8Var.c(this.b.c(), 0, iMin);
        this.g = b(this.b);
        this.e = true;
        return 0;
    }

    private int a(j8 j8Var) {
        this.b.a(yp.f);
        this.c = true;
        j8Var.b();
        return 0;
    }

    public static long c(yg ygVar) {
        int iD = ygVar.d();
        if (ygVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ygVar.a(bArr, 0, 9);
        ygVar.f(iD);
        if (a(bArr)) {
            return b(bArr);
        }
        return -9223372036854775807L;
    }

    private long b(yg ygVar) {
        int iD = ygVar.d();
        for (int iE = ygVar.e() - 4; iE >= iD; iE--) {
            if (a(ygVar.c(), iE) == 442) {
                ygVar.f(iE + 4);
                long jC = c(ygVar);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long a() {
        return this.h;
    }

    private static long b(byte[] bArr) {
        long j = bArr[0];
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    private int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public int a(j8 j8Var, qh qhVar) {
        if (!this.e) {
            return c(j8Var, qhVar);
        }
        if (this.g == -9223372036854775807L) {
            return a(j8Var);
        }
        if (!this.d) {
            return b(j8Var, qhVar);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return a(j8Var);
        }
        long jB = this.f365a.b(this.g) - this.f365a.b(j);
        this.h = jB;
        if (jB < 0) {
            kc.d("PsDurationReader", "Invalid duration: " + this.h + ". Using TIME_UNSET instead.");
            this.h = -9223372036854775807L;
        }
        return a(j8Var);
    }

    private long a(yg ygVar) {
        int iE = ygVar.e();
        for (int iD = ygVar.d(); iD < iE - 3; iD++) {
            if (a(ygVar.c(), iD) == 442) {
                ygVar.f(iD + 4);
                long jC = c(ygVar);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }
}
