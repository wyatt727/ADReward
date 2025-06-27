package com.applovin.impl;

import android.util.Pair;

/* loaded from: classes.dex */
abstract class or {
    public static nr a(j8 j8Var) {
        byte[] bArr;
        a1.a(j8Var);
        yg ygVar = new yg(16);
        if (a.a(j8Var, ygVar).f767a != 1380533830) {
            return null;
        }
        j8Var.c(ygVar.c(), 0, 4);
        ygVar.f(0);
        int iJ = ygVar.j();
        if (iJ != 1463899717) {
            kc.b("WavHeaderReader", "Unsupported RIFF format: " + iJ);
            return null;
        }
        a aVarA = a.a(j8Var, ygVar);
        while (aVarA.f767a != 1718449184) {
            j8Var.c((int) aVarA.b);
            aVarA = a.a(j8Var, ygVar);
        }
        a1.b(aVarA.b >= 16);
        j8Var.c(ygVar.c(), 0, 16);
        ygVar.f(0);
        int iR = ygVar.r();
        int iR2 = ygVar.r();
        int iQ = ygVar.q();
        int iQ2 = ygVar.q();
        int iR3 = ygVar.r();
        int iR4 = ygVar.r();
        int i = ((int) aVarA.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            j8Var.c(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = yp.f;
        }
        return new nr(iR, iR2, iQ, iQ2, iR3, iR4, bArr);
    }

    public static Pair b(j8 j8Var) throws ah {
        a1.a(j8Var);
        j8Var.b();
        yg ygVar = new yg(8);
        a aVarA = a.a(j8Var, ygVar);
        while (true) {
            int i = aVarA.f767a;
            if (i != 1684108385) {
                if (i != 1380533830 && i != 1718449184) {
                    kc.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f767a);
                }
                long j = aVarA.b + 8;
                if (aVarA.f767a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    j8Var.a((int) j);
                    aVarA = a.a(j8Var, ygVar);
                } else {
                    throw ah.a("Chunk is too large (~2GB+) to skip; id: " + aVarA.f767a);
                }
            } else {
                j8Var.a(8);
                long jF = j8Var.f();
                long j2 = aVarA.b + jF;
                long jA = j8Var.a();
                if (jA != -1 && j2 > jA) {
                    kc.d("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + jA);
                    j2 = jA;
                }
                return Pair.create(Long.valueOf(jF), Long.valueOf(j2));
            }
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f767a;
        public final long b;

        private a(int i, long j) {
            this.f767a = i;
            this.b = j;
        }

        public static a a(j8 j8Var, yg ygVar) {
            j8Var.c(ygVar.c(), 0, 8);
            ygVar.f(0);
            return new a(ygVar.j(), ygVar.p());
        }
    }
}
