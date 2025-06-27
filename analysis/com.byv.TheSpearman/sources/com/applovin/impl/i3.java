package com.applovin.impl;

import com.applovin.impl.rd;

/* loaded from: classes.dex */
public final class i3 implements rd, rd.a {

    /* renamed from: a, reason: collision with root package name */
    public final rd f515a;
    private rd.a b;
    private a[] c = new a[0];
    private long d;
    long f;
    long g;

    public i3(rd rdVar, boolean z, long j, long j2) {
        this.f515a = rdVar;
        this.d = z ? j : -9223372036854775807L;
        this.f = j;
        this.g = j2;
    }

    @Override // com.applovin.impl.rd
    public void f() {
        this.f515a.f();
    }

    @Override // com.applovin.impl.rd
    public void a(long j, boolean z) {
        this.f515a.a(j, z);
    }

    @Override // com.applovin.impl.rd
    public long h() {
        if (c()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long jH = h();
            return jH != -9223372036854775807L ? jH : j;
        }
        long jH2 = this.f515a.h();
        if (jH2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        a1.b(jH2 >= this.f);
        long j2 = this.g;
        if (j2 != Long.MIN_VALUE && jH2 > j2) {
            z = false;
        }
        a1.b(z);
        return jH2;
    }

    @Override // com.applovin.impl.rd
    public long e() {
        long jE = this.f515a.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.rd
    public long g() {
        long jG = this.f515a.g();
        if (jG != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || jG < j) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    boolean c() {
        return this.d != -9223372036854775807L;
    }

    private fj b(long j, fj fjVar) {
        long jB = yp.b(fjVar.f433a, 0L, j - this.f);
        long j2 = fjVar.b;
        long j3 = this.g;
        long jB2 = yp.b(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jB == fjVar.f433a && jB2 == fjVar.b) ? fjVar : new fj(jB, jB2);
    }

    private final class a implements yi {

        /* renamed from: a, reason: collision with root package name */
        public final yi f516a;
        private boolean b;

        public a(yi yiVar) {
            this.f516a = yiVar;
        }

        public void b() {
            this.b = false;
        }

        @Override // com.applovin.impl.yi
        public boolean d() {
            return !i3.this.c() && this.f516a.d();
        }

        @Override // com.applovin.impl.yi
        public void a() {
            this.f516a.a();
        }

        @Override // com.applovin.impl.yi
        public int a(e9 e9Var, n5 n5Var, int i) {
            if (i3.this.c()) {
                return -3;
            }
            if (this.b) {
                n5Var.e(4);
                return -4;
            }
            int iA = this.f516a.a(e9Var, n5Var, i);
            if (iA == -5) {
                d9 d9Var = (d9) a1.a(e9Var.b);
                int i2 = d9Var.C;
                if (i2 != 0 || d9Var.D != 0) {
                    i3 i3Var = i3.this;
                    if (i3Var.f != 0) {
                        i2 = 0;
                    }
                    e9Var.b = d9Var.a().e(i2).f(i3Var.g == Long.MIN_VALUE ? d9Var.D : 0).a();
                }
                return -5;
            }
            i3 i3Var2 = i3.this;
            long j = i3Var2.g;
            if (j == Long.MIN_VALUE || ((iA != -4 || n5Var.f < j) && !(iA == -3 && i3Var2.e() == Long.MIN_VALUE && !n5Var.d))) {
                return iA;
            }
            n5Var.b();
            n5Var.e(4);
            this.b = true;
            return -4;
        }

        @Override // com.applovin.impl.yi
        public int a(long j) {
            if (i3.this.c()) {
                return -3;
            }
            return this.f516a.a(j);
        }
    }

    @Override // com.applovin.impl.rd
    public long a(long j, fj fjVar) {
        long j2 = this.f;
        if (j == j2) {
            return j2;
        }
        return this.f515a.a(j, b(j, fjVar));
    }

    @Override // com.applovin.impl.rd
    public void c(long j) {
        this.f515a.c(j);
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j) {
        return this.f515a.b(j);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        return this.f515a.a();
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        return this.f515a.b();
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(rd rdVar) {
        ((rd.a) a1.a(this.b)).a((lj) this);
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        ((rd.a) a1.a(this.b)).a((rd) this);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j) {
        this.b = aVar;
        this.f515a.a(this, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.applovin.impl.rd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.d = r0
            com.applovin.impl.i3$a[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.applovin.impl.rd r0 = r5.f515a
            long r0 = r0.a(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.applovin.impl.a1.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // com.applovin.impl.rd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(com.applovin.impl.f8[] r13, boolean[] r14, com.applovin.impl.yi[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.impl.i3$a[] r2 = new com.applovin.impl.i3.a[r2]
            r0.c = r2
            int r2 = r1.length
            com.applovin.impl.yi[] r9 = new com.applovin.impl.yi[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.applovin.impl.i3$a[] r3 = r0.c
            r4 = r1[r2]
            com.applovin.impl.i3$a r4 = (com.applovin.impl.i3.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.applovin.impl.yi r11 = r4.f516a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.applovin.impl.rd r2 = r0.f515a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.c()
            if (r4 == 0) goto L43
            long r4 = r0.f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = a(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.g
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            com.applovin.impl.a1.b(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.applovin.impl.i3$a[] r4 = r0.c
            r4[r10] = r11
            goto L84
        L73:
            com.applovin.impl.i3$a[] r5 = r0.c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            com.applovin.impl.yi r6 = r6.f516a
            if (r6 == r4) goto L84
        L7d:
            com.applovin.impl.i3$a r6 = new com.applovin.impl.i3$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.applovin.impl.i3$a[] r4 = r0.c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(com.applovin.impl.f8[], boolean[], com.applovin.impl.yi[], boolean[], long):long");
    }

    private static boolean a(long j, f8[] f8VarArr) {
        if (j != 0) {
            for (f8 f8Var : f8VarArr) {
                if (f8Var != null) {
                    d9 d9VarG = f8Var.g();
                    if (!df.a(d9VarG.m, d9VarG.j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(long j, long j2) {
        this.f = j;
        this.g = j2;
    }
}
