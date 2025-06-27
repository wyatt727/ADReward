package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.ej;
import java.util.Map;

/* loaded from: classes.dex */
public final class c9 implements i8 {
    public static final m8 q = new m8() { // from class: com.applovin.impl.c9$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return c9.d();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };
    private k8 f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private r1 o;
    private zq p;

    /* renamed from: a, reason: collision with root package name */
    private final yg f322a = new yg(4);
    private final yg b = new yg(9);
    private final yg c = new yg(11);
    private final yg d = new yg();
    private final aj e = new aj();
    private int g = 1;

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f = k8Var;
    }

    private void f(j8 j8Var) {
        j8Var.a(this.j);
        this.j = 0;
        this.g = 3;
    }

    private boolean e(j8 j8Var) {
        if (!j8Var.a(this.c.c(), 0, 11, true)) {
            return false;
        }
        this.c.f(0);
        this.k = this.c.w();
        this.l = this.c.z();
        this.m = this.c.z();
        this.m = ((this.c.w() << 24) | this.m) * 1000;
        this.c.g(3);
        this.g = 4;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d(com.applovin.impl.j8 r10) {
        /*
            r9 = this;
            long r0 = r9.c()
            int r2 = r9.k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            com.applovin.impl.r1 r7 = r9.o
            if (r7 == 0) goto L24
            r9.b()
            com.applovin.impl.r1 r2 = r9.o
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r5 = r2.a(r10, r0)
        L22:
            r10 = r6
            goto L75
        L24:
            r7 = 9
            if (r2 != r7) goto L3a
            com.applovin.impl.zq r7 = r9.p
            if (r7 == 0) goto L3a
            r9.b()
            com.applovin.impl.zq r2 = r9.p
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r5 = r2.a(r10, r0)
            goto L22
        L3a:
            r7 = 18
            if (r2 != r7) goto L6f
            boolean r2 = r9.n
            if (r2 != 0) goto L6f
            com.applovin.impl.aj r2 = r9.e
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r5 = r2.a(r10, r0)
            com.applovin.impl.aj r10 = r9.e
            long r0 = r10.a()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            com.applovin.impl.k8 r10 = r9.f
            com.applovin.impl.ib r2 = new com.applovin.impl.ib
            com.applovin.impl.aj r7 = r9.e
            long[] r7 = r7.b()
            com.applovin.impl.aj r8 = r9.e
            long[] r8 = r8.c()
            r2.<init>(r7, r8, r0)
            r10.a(r2)
            r9.n = r6
            goto L22
        L6f:
            int r0 = r9.l
            r10.a(r0)
            r10 = r5
        L75:
            boolean r0 = r9.h
            if (r0 != 0) goto L8f
            if (r5 == 0) goto L8f
            r9.h = r6
            com.applovin.impl.aj r0 = r9.e
            long r0 = r0.a()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L8b
            long r0 = r9.m
            long r0 = -r0
            goto L8d
        L8b:
            r0 = 0
        L8d:
            r9.i = r0
        L8f:
            r0 = 4
            r9.j = r0
            r0 = 2
            r9.g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c9.d(com.applovin.impl.j8):boolean");
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        a1.b(this.f);
        while (true) {
            int i = this.g;
            if (i != 1) {
                if (i == 2) {
                    f(j8Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (d(j8Var)) {
                        return 0;
                    }
                } else if (!e(j8Var)) {
                    return -1;
                }
            } else if (!c(j8Var)) {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] d() {
        return new i8[]{new c9()};
    }

    private void b() {
        if (this.n) {
            return;
        }
        this.f.a(new ej.b(-9223372036854775807L));
        this.n = true;
    }

    private long c() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.a() == -9223372036854775807L) {
            return 0L;
        }
        return this.m;
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    private boolean c(j8 j8Var) {
        if (!j8Var.a(this.b.c(), 0, 9, true)) {
            return false;
        }
        this.b.f(0);
        this.b.g(4);
        int iW = this.b.w();
        boolean z = (iW & 4) != 0;
        boolean z2 = (iW & 1) != 0;
        if (z && this.o == null) {
            this.o = new r1(this.f.a(8, 1));
        }
        if (z2 && this.p == null) {
            this.p = new zq(this.f.a(9, 2));
        }
        this.f.c();
        this.j = this.b.j() - 5;
        this.g = 2;
        return true;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        j8Var.c(this.f322a.c(), 0, 3);
        this.f322a.f(0);
        if (this.f322a.z() != 4607062) {
            return false;
        }
        j8Var.c(this.f322a.c(), 0, 2);
        this.f322a.f(0);
        if ((this.f322a.C() & 250) != 0) {
            return false;
        }
        j8Var.c(this.f322a.c(), 0, 4);
        this.f322a.f(0);
        int iJ = this.f322a.j();
        j8Var.b();
        j8Var.c(iJ);
        j8Var.c(this.f322a.c(), 0, 4);
        this.f322a.f(0);
        return this.f322a.j() == 0;
    }

    private yg b(j8 j8Var) {
        if (this.l > this.d.b()) {
            yg ygVar = this.d;
            ygVar.a(new byte[Math.max(ygVar.b() * 2, this.l)], 0);
        } else {
            this.d.f(0);
        }
        this.d.e(this.l);
        j8Var.d(this.d.c(), 0, this.l);
        return this.d;
    }
}
