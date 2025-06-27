package com.applovin.impl;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class y5 implements n7 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1192a = new byte[8];
    private final ArrayDeque b = new ArrayDeque();
    private final aq c = new aq();
    private m7 d;
    private int e;
    private int f;
    private long g;

    @Override // com.applovin.impl.n7
    public void a(m7 m7Var) {
        this.d = m7Var;
    }

    @Override // com.applovin.impl.n7
    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.b();
    }

    @Override // com.applovin.impl.n7
    public boolean a(j8 j8Var) throws ah {
        a1.b(this.d);
        while (true) {
            b bVar = (b) this.b.peek();
            if (bVar == null || j8Var.f() < bVar.b) {
                if (this.e == 0) {
                    long jA = this.c.a(j8Var, true, false, 4);
                    if (jA == -2) {
                        jA = b(j8Var);
                    }
                    if (jA == -1) {
                        return false;
                    }
                    this.f = (int) jA;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a(j8Var, false, true, 8);
                    this.e = 2;
                }
                int iB = this.d.b(this.f);
                if (iB != 0) {
                    if (iB == 1) {
                        long jF = j8Var.f();
                        this.b.push(new b(this.f, this.g + jF));
                        this.d.a(this.f, jF, this.g);
                        this.e = 0;
                        return true;
                    }
                    if (iB == 2) {
                        long j = this.g;
                        if (j <= 8) {
                            this.d.a(this.f, b(j8Var, (int) j));
                            this.e = 0;
                            return true;
                        }
                        throw ah.a("Invalid integer size: " + this.g, null);
                    }
                    if (iB == 3) {
                        long j2 = this.g;
                        if (j2 <= 2147483647L) {
                            this.d.a(this.f, c(j8Var, (int) j2));
                            this.e = 0;
                            return true;
                        }
                        throw ah.a("String element size: " + this.g, null);
                    }
                    if (iB == 4) {
                        this.d.a(this.f, (int) this.g, j8Var);
                        this.e = 0;
                        return true;
                    }
                    if (iB != 5) {
                        throw ah.a("Invalid element type " + iB, null);
                    }
                    long j3 = this.g;
                    if (j3 != 4 && j3 != 8) {
                        throw ah.a("Invalid float size: " + this.g, null);
                    }
                    this.d.a(this.f, a(j8Var, (int) j3));
                    this.e = 0;
                    return true;
                }
                j8Var.a((int) this.g);
                this.e = 0;
            } else {
                this.d.a(((b) this.b.pop()).f1193a);
                return true;
            }
        }
    }

    private long b(j8 j8Var) {
        j8Var.b();
        while (true) {
            j8Var.c(this.f1192a, 0, 4);
            int iA = aq.a(this.f1192a[0]);
            if (iA != -1 && iA <= 4) {
                int iA2 = (int) aq.a(this.f1192a, iA, false);
                if (this.d.c(iA2)) {
                    j8Var.a(iA);
                    return iA2;
                }
            }
            j8Var.a(1);
        }
    }

    private static String c(j8 j8Var, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        j8Var.d(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f1193a;
        private final long b;

        private b(int i, long j) {
            this.f1193a = i;
            this.b = j;
        }
    }

    private long b(j8 j8Var, int i) {
        j8Var.d(this.f1192a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f1192a[i2] & 255);
        }
        return j;
    }

    private double a(j8 j8Var, int i) {
        long jB = b(j8Var, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) jB);
        }
        return Double.longBitsToDouble(jB);
    }
}
