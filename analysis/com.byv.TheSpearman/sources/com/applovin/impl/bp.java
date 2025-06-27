package com.applovin.impl;

import com.applovin.impl.h2;

/* loaded from: classes.dex */
final class bp extends h2 {
    public bp(io ioVar, long j, long j2, int i, int i2) {
        super(new h2.b(), new a(i, ioVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }

    private static final class a implements h2.f {

        /* renamed from: a, reason: collision with root package name */
        private final io f300a;
        private final yg b = new yg();
        private final int c;
        private final int d;

        public a(int i, io ioVar, int i2) {
            this.c = i;
            this.f300a = ioVar;
            this.d = i2;
        }

        @Override // com.applovin.impl.h2.f
        public void a() {
            this.b.a(yp.f);
        }

        private h2.e a(yg ygVar, long j, long j2) {
            int iA;
            int iA2;
            int iE = ygVar.e();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (ygVar.a() >= 188 && (iA2 = (iA = fp.a(ygVar.c(), ygVar.d(), iE)) + 188) <= iE) {
                long jA = fp.a(ygVar, iA, this.c);
                if (jA != -9223372036854775807L) {
                    long jB = this.f300a.b(jA);
                    if (jB > j) {
                        if (j5 == -9223372036854775807L) {
                            return h2.e.a(jB, j2);
                        }
                        return h2.e.a(j2 + j4);
                    }
                    if (100000 + jB > j) {
                        return h2.e.a(j2 + iA);
                    }
                    j4 = iA;
                    j5 = jB;
                }
                ygVar.f(iA2);
                j3 = iA2;
            }
            if (j5 != -9223372036854775807L) {
                return h2.e.b(j5, j2 + j3);
            }
            return h2.e.d;
        }

        @Override // com.applovin.impl.h2.f
        public h2.e a(j8 j8Var, long j) {
            long jF = j8Var.f();
            int iMin = (int) Math.min(this.d, j8Var.a() - jF);
            this.b.d(iMin);
            j8Var.c(this.b.c(), 0, iMin);
            return a(this.b, j, jF);
        }
    }
}
