package com.applovin.impl;

import com.applovin.impl.h2;

/* loaded from: classes.dex */
final class ci extends h2 {
    public ci(io ioVar, long j, long j2) {
        super(new h2.b(), new b(ioVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    private static final class b implements h2.f {

        /* renamed from: a, reason: collision with root package name */
        private final io f332a;
        private final yg b;

        private b(io ioVar) {
            this.f332a = ioVar;
            this.b = new yg();
        }

        @Override // com.applovin.impl.h2.f
        public void a() {
            this.b.a(yp.f);
        }

        private h2.e a(yg ygVar, long j, long j2) {
            int iD = -1;
            int iD2 = -1;
            long j3 = -9223372036854775807L;
            while (ygVar.a() >= 4) {
                if (ci.b(ygVar.c(), ygVar.d()) != 442) {
                    ygVar.g(1);
                } else {
                    ygVar.g(4);
                    long jC = di.c(ygVar);
                    if (jC != -9223372036854775807L) {
                        long jB = this.f332a.b(jC);
                        if (jB > j) {
                            if (j3 == -9223372036854775807L) {
                                return h2.e.a(jB, j2);
                            }
                            return h2.e.a(j2 + iD2);
                        }
                        if (100000 + jB > j) {
                            return h2.e.a(j2 + ygVar.d());
                        }
                        iD2 = ygVar.d();
                        j3 = jB;
                    }
                    a(ygVar);
                    iD = ygVar.d();
                }
            }
            if (j3 != -9223372036854775807L) {
                return h2.e.b(j3, j2 + iD);
            }
            return h2.e.d;
        }

        @Override // com.applovin.impl.h2.f
        public h2.e a(j8 j8Var, long j) {
            long jF = j8Var.f();
            int iMin = (int) Math.min(20000L, j8Var.a() - jF);
            this.b.d(iMin);
            j8Var.c(this.b.c(), 0, iMin);
            return a(this.b, j, jF);
        }

        private static void a(yg ygVar) {
            int iB;
            int iE = ygVar.e();
            if (ygVar.a() < 10) {
                ygVar.f(iE);
                return;
            }
            ygVar.g(9);
            int iW = ygVar.w() & 7;
            if (ygVar.a() < iW) {
                ygVar.f(iE);
                return;
            }
            ygVar.g(iW);
            if (ygVar.a() >= 4) {
                if (ci.b(ygVar.c(), ygVar.d()) == 443) {
                    ygVar.g(4);
                    int iC = ygVar.C();
                    if (ygVar.a() < iC) {
                        ygVar.f(iE);
                        return;
                    }
                    ygVar.g(iC);
                }
                while (ygVar.a() >= 4 && (iB = ci.b(ygVar.c(), ygVar.d())) != 442 && iB != 441 && (iB >>> 8) == 1) {
                    ygVar.g(4);
                    if (ygVar.a() < 2) {
                        ygVar.f(iE);
                        return;
                    }
                    ygVar.f(Math.min(ygVar.e(), ygVar.d() + ygVar.C()));
                }
                return;
            }
            ygVar.f(iE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
