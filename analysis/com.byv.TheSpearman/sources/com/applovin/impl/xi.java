package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.ro;
import com.applovin.impl.x6;
import com.applovin.impl.xi;
import com.applovin.impl.y6;
import com.applovin.impl.z6;

/* loaded from: classes.dex */
public class xi implements ro {
    private boolean A;
    private d9 B;
    private d9 C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* renamed from: a, reason: collision with root package name */
    private final wi f1175a;
    private final z6 d;
    private final y6.a e;
    private final Looper f;
    private d g;
    private d9 h;
    private x6 i;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean x;
    private final b b = new b();
    private int j = 1000;
    private int[] k = new int[1000];
    private long[] l = new long[1000];
    private long[] o = new long[1000];
    private int[] n = new int[1000];
    private int[] m = new int[1000];
    private ro.a[] p = new ro.a[1000];
    private final nk c = new nk(new p4() { // from class: com.applovin.impl.xi$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.p4
        public final void accept(Object obj) {
            xi.a((xi.c) obj);
        }
    });
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private long w = Long.MIN_VALUE;
    private boolean z = true;
    private boolean y = true;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1176a;
        public long b;
        public ro.a c;

        b() {
        }
    }

    public interface d {
        void a(d9 d9Var);
    }

    @Override // com.applovin.impl.ro
    public /* synthetic */ int a(e5 e5Var, int i, boolean z) {
        return a(e5Var, i, z, 0);
    }

    @Override // com.applovin.impl.ro
    public /* synthetic */ void a(yg ygVar, int i) {
        a(ygVar, i, 0);
    }

    protected xi(n0 n0Var, Looper looper, z6 z6Var, y6.a aVar) {
        this.f = looper;
        this.d = z6Var;
        this.e = aVar;
        this.f1175a = new wi(n0Var);
    }

    public void l() {
        b(true);
        m();
    }

    public final void n() {
        b(false);
    }

    public final int g() {
        return this.r + this.q;
    }

    public void k() {
        b();
        m();
    }

    public void j() {
        x6 x6Var = this.i;
        if (x6Var != null && x6Var.b() == 1) {
            throw ((x6.a) a1.a(this.i.getError()));
        }
    }

    public final int e() {
        return this.r + this.t;
    }

    public final synchronized d9 f() {
        return this.z ? null : this.C;
    }

    public final synchronized long c() {
        return this.w;
    }

    public final synchronized long d() {
        return Math.max(this.v, c(this.t));
    }

    public final synchronized boolean i() {
        return this.x;
    }

    private synchronized void o() {
        this.t = 0;
        this.f1175a.c();
    }

    private void m() {
        x6 x6Var = this.i;
        if (x6Var != null) {
            x6Var.a(this.e);
            this.i = null;
            this.h = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.q     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.applovin.impl.a1.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.t = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.f(int):void");
    }

    private synchronized boolean a(long j) {
        if (this.q == 0) {
            return j > this.v;
        }
        if (d() >= j) {
            return false;
        }
        b(this.r + b(j));
        return true;
    }

    private boolean h() {
        return this.t != this.q;
    }

    private int b(long j) {
        int i = this.q;
        int iD = d(i - 1);
        while (i > this.t && this.o[iD] >= j) {
            i--;
            iD--;
            if (iD == -1) {
                iD = this.j - 1;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d9 f1177a;
        public final z6.b b;

        private c(d9 d9Var, z6.b bVar) {
            this.f1177a = d9Var;
            this.b = bVar;
        }
    }

    private boolean e(int i) {
        x6 x6Var = this.i;
        return x6Var == null || x6Var.b() == 4 || ((this.n[i] & 1073741824) == 0 && this.i.c());
    }

    private long c(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iD = d(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.o[iD]);
            if ((this.n[iD] & 1) != 0) {
                break;
            }
            iD--;
            if (iD == -1) {
                iD = this.j - 1;
            }
        }
        return jMax;
    }

    private int d(int i) {
        int i2 = this.s + i;
        int i3 = this.j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final void b(long j, boolean z, boolean z2) {
        this.f1175a.a(a(j, z, z2));
    }

    public final void c(long j) {
        this.u = j;
    }

    private synchronized void a(long j, int i, long j2, int i2, ro.a aVar) {
        z6.b bVarB;
        int i3 = this.q;
        if (i3 > 0) {
            int iD = d(i3 - 1);
            a1.a(this.l[iD] + ((long) this.m[iD]) <= j2);
        }
        this.x = (536870912 & i) != 0;
        this.w = Math.max(this.w, j);
        int iD2 = d(this.q);
        this.o[iD2] = j;
        this.l[iD2] = j2;
        this.m[iD2] = i2;
        this.n[iD2] = i;
        this.p[iD2] = aVar;
        this.k[iD2] = this.D;
        if (this.c.c() || !((c) this.c.b()).f1177a.equals(this.C)) {
            z6 z6Var = this.d;
            if (z6Var != null) {
                bVarB = z6Var.b((Looper) a1.a(this.f), this.e, this.C);
            } else {
                bVarB = z6.b.f1230a;
            }
            this.c.a(g(), new c((d9) a1.a(this.C), bVarB));
        }
        int i4 = this.q + 1;
        this.q = i4;
        int i5 = this.j;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            ro.a[] aVarArr = new ro.a[i6];
            int i7 = this.s;
            int i8 = i5 - i7;
            System.arraycopy(this.l, i7, jArr, 0, i8);
            System.arraycopy(this.o, this.s, jArr2, 0, i8);
            System.arraycopy(this.n, this.s, iArr2, 0, i8);
            System.arraycopy(this.m, this.s, iArr3, 0, i8);
            System.arraycopy(this.p, this.s, aVarArr, 0, i8);
            System.arraycopy(this.k, this.s, iArr, 0, i8);
            int i9 = this.s;
            System.arraycopy(this.l, 0, jArr, i8, i9);
            System.arraycopy(this.o, 0, jArr2, i8, i9);
            System.arraycopy(this.n, 0, iArr2, i8, i9);
            System.arraycopy(this.m, 0, iArr3, i8, i9);
            System.arraycopy(this.p, 0, aVarArr, i8, i9);
            System.arraycopy(this.k, 0, iArr, i8, i9);
            this.l = jArr;
            this.o = jArr2;
            this.n = iArr2;
            this.m = iArr3;
            this.p = aVarArr;
            this.k = iArr;
            this.s = 0;
            this.j = i6;
        }
    }

    public final void b() {
        this.f1175a.a(a());
    }

    private synchronized boolean c(d9 d9Var) {
        this.z = false;
        if (yp.a(d9Var, this.C)) {
            return false;
        }
        if (!this.c.c() && ((c) this.c.b()).f1177a.equals(d9Var)) {
            this.C = ((c) this.c.b()).f1177a;
        } else {
            this.C = d9Var;
        }
        d9 d9Var2 = this.C;
        this.E = df.a(d9Var2.m, d9Var2.j);
        this.F = false;
        return true;
    }

    private synchronized long a(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.q;
        if (i2 != 0) {
            long[] jArr = this.o;
            int i3 = this.s;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.t) != i2) {
                    i2 = i + 1;
                }
                int iA = a(i3, i2, j, z);
                if (iA == -1) {
                    return -1L;
                }
                return a(iA);
            }
        }
        return -1L;
    }

    private long b(int i) {
        int iG = g() - i;
        boolean z = false;
        a1.a(iG >= 0 && iG <= this.q - this.t);
        int i2 = this.q - iG;
        this.q = i2;
        this.w = Math.max(this.v, c(i2));
        if (iG == 0 && this.x) {
            z = true;
        }
        this.x = z;
        this.c.a(i);
        int i3 = this.q;
        if (i3 == 0) {
            return 0L;
        }
        return this.l[d(i3 - 1)] + this.m[r9];
    }

    private synchronized long a() {
        int i = this.q;
        if (i == 0) {
            return -1L;
        }
        return a(i);
    }

    protected d9 b(d9 d9Var) {
        return (this.G == 0 || d9Var.q == Long.MAX_VALUE) ? d9Var : d9Var.a().a(d9Var.q + this.G).a();
    }

    public void b(boolean z) {
        this.f1175a.b();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.c.a();
        if (z) {
            this.B = null;
            this.C = null;
            this.z = true;
        }
    }

    private long a(int i) {
        this.v = Math.max(this.v, c(i));
        this.q -= i;
        int i2 = this.r + i;
        this.r = i2;
        int i3 = this.s + i;
        this.s = i3;
        int i4 = this.j;
        if (i3 >= i4) {
            this.s = i3 - i4;
        }
        int i5 = this.t - i;
        this.t = i5;
        if (i5 < 0) {
            this.t = 0;
        }
        this.c.b(i2);
        if (this.q == 0) {
            int i6 = this.s;
            if (i6 == 0) {
                i6 = this.j;
            }
            return this.l[i6 - 1] + this.m[r6];
        }
        return this.l[this.s];
    }

    public final synchronized boolean b(long j, boolean z) {
        o();
        int iD = d(this.t);
        if (h() && j >= this.o[iD] && (j <= this.w || z)) {
            int iA = a(iD, this.q - this.t, j, true);
            if (iA == -1) {
                return false;
            }
            this.u = j;
            this.t += iA;
            return true;
        }
        return false;
    }

    private int a(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.o[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.n[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.j) {
                i = 0;
            }
        }
        return i3;
    }

    @Override // com.applovin.impl.ro
    public final void a(d9 d9Var) {
        d9 d9VarB = b(d9Var);
        this.A = false;
        this.B = d9Var;
        boolean zC = c(d9VarB);
        d dVar = this.g;
        if (dVar == null || !zC) {
            return;
        }
        dVar.a(d9VarB);
    }

    public final synchronized int a(long j, boolean z) {
        int iD = d(this.t);
        if (h() && j >= this.o[iD]) {
            if (j > this.w && z) {
                return this.q - this.t;
            }
            int iA = a(iD, this.q - this.t, j, true);
            if (iA == -1) {
                return 0;
            }
            return iA;
        }
        return 0;
    }

    public synchronized boolean a(boolean z) {
        d9 d9Var;
        boolean z2 = true;
        if (!h()) {
            if (!z && !this.x && ((d9Var = this.C) == null || d9Var == this.h)) {
                z2 = false;
            }
            return z2;
        }
        if (((c) this.c.c(e())).f1177a != this.h) {
            return true;
        }
        return e(d(this.t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
        cVar.b.a();
    }

    private void a(d9 d9Var, e9 e9Var) {
        d9 d9Var2 = this.h;
        boolean z = d9Var2 == null;
        w6 w6Var = z ? null : d9Var2.p;
        this.h = d9Var;
        w6 w6Var2 = d9Var.p;
        z6 z6Var = this.d;
        e9Var.b = z6Var != null ? d9Var.a(z6Var.a(d9Var)) : d9Var;
        e9Var.f379a = this.i;
        if (this.d == null) {
            return;
        }
        if (z || !yp.a(w6Var, w6Var2)) {
            x6 x6Var = this.i;
            x6 x6VarA = this.d.a((Looper) a1.a(this.f), this.e, d9Var);
            this.i = x6VarA;
            e9Var.f379a = x6VarA;
            if (x6Var != null) {
                x6Var.a(this.e);
            }
        }
    }

    private synchronized int a(e9 e9Var, n5 n5Var, boolean z, boolean z2, b bVar) {
        n5Var.d = false;
        if (!h()) {
            if (!z2 && !this.x) {
                d9 d9Var = this.C;
                if (d9Var == null || (!z && d9Var == this.h)) {
                    return -3;
                }
                a((d9) a1.a(d9Var), e9Var);
                return -5;
            }
            n5Var.e(4);
            return -4;
        }
        d9 d9Var2 = ((c) this.c.c(e())).f1177a;
        if (!z && d9Var2 == this.h) {
            int iD = d(this.t);
            if (!e(iD)) {
                n5Var.d = true;
                return -3;
            }
            n5Var.e(this.n[iD]);
            long j = this.o[iD];
            n5Var.f = j;
            if (j < this.u) {
                n5Var.b(Integer.MIN_VALUE);
            }
            bVar.f1176a = this.m[iD];
            bVar.b = this.l[iD];
            bVar.c = this.p[iD];
            return -4;
        }
        a(d9Var2, e9Var);
        return -5;
    }

    public int a(e9 e9Var, n5 n5Var, int i, boolean z) {
        int iA = a(e9Var, n5Var, (i & 2) != 0, z, this.b);
        if (iA == -4 && !n5Var.e()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.f1175a.a(n5Var, this.b);
                } else {
                    this.f1175a.b(n5Var, this.b);
                }
            }
            if (!z2) {
                this.t++;
            }
        }
        return iA;
    }

    @Override // com.applovin.impl.ro
    public final int a(e5 e5Var, int i, boolean z, int i2) {
        return this.f1175a.a(e5Var, i, z);
    }

    @Override // com.applovin.impl.ro
    public final void a(yg ygVar, int i, int i2) {
        this.f1175a.a(ygVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // com.applovin.impl.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r12, int r14, int r15, int r16, com.applovin.impl.ro.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L10
            com.applovin.impl.d9 r0 = r8.B
            java.lang.Object r0 = com.applovin.impl.a1.b(r0)
            com.applovin.impl.d9 r0 = (com.applovin.impl.d9) r0
            r11.a(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.y = r1
        L22:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L54
            long r6 = r8.u
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.F
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            com.applovin.impl.d9 r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.impl.kc.d(r6, r0)
            r8.F = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.H
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.a(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.H = r1
            goto L66
        L65:
            return
        L66:
            com.applovin.impl.wi r0 = r8.f1175a
            long r0 = r0.a()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(long, int, int, int, com.applovin.impl.ro$a):void");
    }

    public final void a(d dVar) {
        this.g = dVar;
    }

    public static xi a(n0 n0Var, Looper looper, z6 z6Var, y6.a aVar) {
        return new xi(n0Var, (Looper) a1.a(looper), (z6) a1.a(z6Var), (y6.a) a1.a(aVar));
    }
}
