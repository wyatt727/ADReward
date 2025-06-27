package com.applovin.impl;

/* loaded from: classes.dex */
final class fg {

    /* renamed from: a, reason: collision with root package name */
    public int f430a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final yg k = new yg(255);

    fg() {
    }

    public boolean a(j8 j8Var, boolean z) throws ah {
        a();
        this.k.d(27);
        if (!l8.a(j8Var, this.k.c(), 0, 27, z) || this.k.y() != 1332176723) {
            return false;
        }
        int iW = this.k.w();
        this.f430a = iW;
        if (iW != 0) {
            if (z) {
                return false;
            }
            throw ah.a("unsupported bit stream revision");
        }
        this.b = this.k.w();
        this.c = this.k.n();
        this.d = this.k.p();
        this.e = this.k.p();
        this.f = this.k.p();
        int iW2 = this.k.w();
        this.g = iW2;
        this.h = iW2 + 27;
        this.k.d(iW2);
        if (!l8.a(j8Var, this.k.c(), 0, this.g, z)) {
            return false;
        }
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.w();
            this.i += this.j[i];
        }
        return true;
    }

    public void a() {
        this.f430a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean a(j8 j8Var) {
        return a(j8Var, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.f() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.b(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.applovin.impl.j8 r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.f()
            long r2 = r9.d()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.applovin.impl.a1.a(r0)
            com.applovin.impl.yg r0 = r8.k
            r3 = 4
            r0.d(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.f()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            com.applovin.impl.yg r4 = r8.k
            byte[] r4 = r4.c()
            boolean r4 = com.applovin.impl.l8.a(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            com.applovin.impl.yg r0 = r8.k
            r0.f(r1)
            com.applovin.impl.yg r0 = r8.k
            long r4 = r0.y()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.b()
            return r2
        L4d:
            r9.a(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.f()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.b(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fg.a(com.applovin.impl.j8, long):boolean");
    }
}
