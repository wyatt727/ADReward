package com.applovin.impl;

import android.os.Handler;
import android.util.Pair;
import com.applovin.impl.ab;
import com.applovin.impl.go;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
final class vd {

    /* renamed from: a, reason: collision with root package name */
    private final go.b f1091a = new go.b();
    private final go.d b = new go.d();
    private final r0 c;
    private final Handler d;
    private long e;
    private int f;
    private boolean g;
    private sd h;
    private sd i;
    private sd j;
    private int k;
    private Object l;
    private long m;

    private boolean a(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    public vd(r0 r0Var, Handler handler) {
        this.c = r0Var;
        this.d = handler;
    }

    public boolean h() {
        sd sdVar = this.j;
        return sdVar == null || (!sdVar.f.i && sdVar.j() && this.j.f.e != -9223372036854775807L && this.k < 100);
    }

    public sd d() {
        return this.j;
    }

    public sd e() {
        return this.h;
    }

    public sd f() {
        return this.i;
    }

    public sd b() {
        sd sdVar = this.i;
        a1.b((sdVar == null || sdVar.d() == null) ? false : true);
        this.i = this.i.d();
        g();
        return this.i;
    }

    public sd a() {
        sd sdVar = this.h;
        if (sdVar == null) {
            return null;
        }
        if (sdVar == this.i) {
            this.i = sdVar.d();
        }
        this.h.l();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            sd sdVar2 = this.h;
            this.l = sdVar2.b;
            this.m = sdVar2.f.f1062a.d;
        }
        this.h = this.h.d();
        g();
        return this.h;
    }

    public void c() {
        if (this.k == 0) {
            return;
        }
        sd sdVarD = (sd) a1.b(this.h);
        this.l = sdVarD.b;
        this.m = sdVarD.f.f1062a.d;
        while (sdVarD != null) {
            sdVarD.l();
            sdVarD = sdVarD.d();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        g();
    }

    private void g() {
        if (this.c != null) {
            final ab.a aVarF = ab.f();
            for (sd sdVarD = this.h; sdVarD != null; sdVarD = sdVarD.d()) {
                aVarF.b(sdVarD.f.f1062a);
            }
            sd sdVar = this.i;
            final wd.a aVar = sdVar == null ? null : sdVar.f.f1062a;
            this.d.post(new Runnable() { // from class: com.applovin.impl.vd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(aVarF, aVar);
                }
            });
        }
    }

    private boolean a(ud udVar, ud udVar2) {
        return udVar.b == udVar2.b && udVar.f1062a.equals(udVar2.f1062a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.impl.sd a(com.applovin.impl.mi[] r12, com.applovin.impl.wo r13, com.applovin.impl.n0 r14, com.applovin.impl.ae r15, com.applovin.impl.ud r16, com.applovin.impl.xo r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.applovin.impl.sd r1 = r0.j
            if (r1 != 0) goto L1e
            com.applovin.impl.wd$a r1 = r8.f1062a
            boolean r1 = r1.a()
            if (r1 == 0) goto L1b
            long r1 = r8.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L2c
        L1b:
            r1 = 0
            goto L2c
        L1e:
            long r1 = r1.f()
            com.applovin.impl.sd r3 = r0.j
            com.applovin.impl.ud r3 = r3.f
            long r3 = r3.e
            long r1 = r1 + r3
            long r3 = r8.b
            long r1 = r1 - r3
        L2c:
            r3 = r1
            com.applovin.impl.sd r10 = new com.applovin.impl.sd
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.applovin.impl.sd r1 = r0.j
            if (r1 == 0) goto L43
            r1.a(r10)
            goto L47
        L43:
            r0.h = r10
            r0.i = r10
        L47:
            r1 = 0
            r0.l = r1
            r0.j = r10
            int r1 = r0.k
            int r1 = r1 + 1
            r0.k = r1
            r11.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.vd.a(com.applovin.impl.mi[], com.applovin.impl.wo, com.applovin.impl.n0, com.applovin.impl.ae, com.applovin.impl.ud, com.applovin.impl.xo):com.applovin.impl.sd");
    }

    private ud a(lh lhVar) {
        return a(lhVar.f631a, lhVar.b, lhVar.c, lhVar.s);
    }

    private ud a(go goVar, sd sdVar, long j) {
        long j2;
        ud udVar = sdVar.f;
        long jF = (sdVar.f() + udVar.e) - j;
        if (udVar.g) {
            long j3 = 0;
            int iA = goVar.a(goVar.a(udVar.f1062a.f1031a), this.f1091a, this.b, this.f, this.g);
            if (iA == -1) {
                return null;
            }
            int i = goVar.a(iA, this.f1091a, true).c;
            Object obj = this.f1091a.b;
            long j4 = udVar.f1062a.d;
            if (goVar.a(i, this.b).p == iA) {
                Pair pairA = goVar.a(this.b, this.f1091a, i, -9223372036854775807L, Math.max(0L, jF));
                if (pairA == null) {
                    return null;
                }
                obj = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                sd sdVarD = sdVar.d();
                if (sdVarD != null && sdVarD.b.equals(obj)) {
                    j4 = sdVarD.f.f1062a.d;
                } else {
                    j4 = this.e;
                    this.e = 1 + j4;
                }
                j2 = jLongValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return a(goVar, a(goVar, obj, j2, j4, this.f1091a), j3, j2);
        }
        wd.a aVar = udVar.f1062a;
        goVar.a(aVar.f1031a, this.f1091a);
        if (aVar.a()) {
            int i2 = aVar.b;
            int iA2 = this.f1091a.a(i2);
            if (iA2 == -1) {
                return null;
            }
            int iB = this.f1091a.b(i2, aVar.c);
            if (iB < iA2) {
                return a(goVar, aVar.f1031a, i2, iB, udVar.c, aVar.d);
            }
            long jLongValue2 = udVar.c;
            if (jLongValue2 == -9223372036854775807L) {
                go.d dVar = this.b;
                go.b bVar = this.f1091a;
                Pair pairA2 = goVar.a(dVar, bVar, bVar.c, -9223372036854775807L, Math.max(0L, jF));
                if (pairA2 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairA2.second).longValue();
            }
            return a(goVar, aVar.f1031a, Math.max(a(goVar, aVar.f1031a, aVar.b), jLongValue2), udVar.c, aVar.d);
        }
        int iD = this.f1091a.d(aVar.e);
        if (iD == this.f1091a.a(aVar.e)) {
            return a(goVar, aVar.f1031a, a(goVar, aVar.f1031a, aVar.e), udVar.e, aVar.d);
        }
        return a(goVar, aVar.f1031a, aVar.e, iD, udVar.e, aVar.d);
    }

    private ud a(go goVar, wd.a aVar, long j, long j2) {
        goVar.a(aVar.f1031a, this.f1091a);
        if (aVar.a()) {
            return a(goVar, aVar.f1031a, aVar.b, aVar.c, j, aVar.d);
        }
        return a(goVar, aVar.f1031a, j2, j, aVar.d);
    }

    private ud a(go goVar, Object obj, int i, int i2, long j, long j2) {
        wd.a aVar = new wd.a(obj, i, i2, j2);
        long jA = goVar.a(aVar.f1031a, this.f1091a).a(aVar.b, aVar.c);
        long jB = i2 == this.f1091a.d(i) ? this.f1091a.b() : 0L;
        return new ud(aVar, (jA == -9223372036854775807L || jB < jA) ? jB : Math.max(0L, jA - 1), j, -9223372036854775807L, jA, this.f1091a.f(aVar.b), false, false, false);
    }

    private ud a(go goVar, Object obj, long j, long j2, long j3) {
        long jMax = j;
        goVar.a(obj, this.f1091a);
        int iA = this.f1091a.a(jMax);
        wd.a aVar = new wd.a(obj, j3, iA);
        boolean zA = a(aVar);
        boolean zA2 = a(goVar, aVar);
        boolean zA3 = a(goVar, aVar, zA);
        boolean z = iA != -1 && this.f1091a.f(iA);
        long jB = iA != -1 ? this.f1091a.b(iA) : -9223372036854775807L;
        long j4 = (jB == -9223372036854775807L || jB == Long.MIN_VALUE) ? this.f1091a.d : jB;
        if (j4 != -9223372036854775807L && jMax >= j4) {
            jMax = Math.max(0L, j4 - 1);
        }
        return new ud(aVar, jMax, j2, jB, j4, z, zA, zA2, zA3);
    }

    private long a(go goVar, Object obj, int i) {
        goVar.a(obj, this.f1091a);
        long jB = this.f1091a.b(i);
        if (jB == Long.MIN_VALUE) {
            return this.f1091a.d;
        }
        return jB + this.f1091a.c(i);
    }

    public ud a(long j, lh lhVar) {
        sd sdVar = this.j;
        if (sdVar == null) {
            return a(lhVar);
        }
        return a(lhVar.f631a, sdVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.impl.ud a(com.applovin.impl.go r19, com.applovin.impl.ud r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.impl.wd$a r3 = r2.f1062a
            boolean r12 = r0.a(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.a(r1, r3, r12)
            com.applovin.impl.wd$a r4 = r2.f1062a
            java.lang.Object r4 = r4.f1031a
            com.applovin.impl.go$b r5 = r0.f1091a
            r1.a(r4, r5)
            boolean r1 = r3.a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            com.applovin.impl.go$b r7 = r0.f1091a
            long r7 = r7.b(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.a()
            if (r1 == 0) goto L48
            com.applovin.impl.go$b r1 = r0.f1091a
            int r5 = r3.b
            int r6 = r3.c
            long r5 = r1.a(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.applovin.impl.go$b r1 = r0.f1091a
            long r5 = r1.c()
            goto L46
        L5c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L6c
            com.applovin.impl.go$b r1 = r0.f1091a
            int r4 = r3.b
            boolean r1 = r1.f(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.e
            if (r1 == r4) goto L7a
            com.applovin.impl.go$b r4 = r0.f1091a
            boolean r1 = r4.f(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            com.applovin.impl.ud r15 = new com.applovin.impl.ud
            long r4 = r2.b
            long r1 = r2.c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.vd.a(com.applovin.impl.go, com.applovin.impl.ud):com.applovin.impl.ud");
    }

    private boolean a(wd.a aVar) {
        return !aVar.a() && aVar.e == -1;
    }

    private boolean a(go goVar, wd.a aVar, boolean z) {
        int iA = goVar.a(aVar.f1031a);
        return !goVar.a(goVar.a(iA, this.f1091a).c, this.b).j && goVar.b(iA, this.f1091a, this.b, this.f, this.g) && z;
    }

    private boolean a(go goVar, wd.a aVar) {
        if (a(aVar)) {
            return goVar.a(goVar.a(aVar.f1031a, this.f1091a).c, this.b).q == goVar.a(aVar.f1031a);
        }
        return false;
    }

    public boolean a(rd rdVar) {
        sd sdVar = this.j;
        return sdVar != null && sdVar.f890a == rdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ab.a aVar, wd.a aVar2) {
        this.c.a(aVar.a(), aVar2);
    }

    public void a(long j) {
        sd sdVar = this.j;
        if (sdVar != null) {
            sdVar.b(j);
        }
    }

    public boolean a(sd sdVar) {
        boolean z = false;
        a1.b(sdVar != null);
        if (sdVar.equals(this.j)) {
            return false;
        }
        this.j = sdVar;
        while (sdVar.d() != null) {
            sdVar = sdVar.d();
            if (sdVar == this.i) {
                this.i = this.h;
                z = true;
            }
            sdVar.l();
            this.k--;
        }
        this.j.a((sd) null);
        g();
        return z;
    }

    public wd.a a(go goVar, Object obj, long j) {
        return a(goVar, obj, j, a(goVar, obj), this.f1091a);
    }

    private static wd.a a(go goVar, Object obj, long j, long j2, go.b bVar) {
        goVar.a(obj, bVar);
        int iB = bVar.b(j);
        if (iB == -1) {
            return new wd.a(obj, j2, bVar.a(j));
        }
        return new wd.a(obj, iB, bVar.d(iB), j2);
    }

    private long a(go goVar, Object obj) {
        int iA;
        int i = goVar.a(obj, this.f1091a).c;
        Object obj2 = this.l;
        if (obj2 != null && (iA = goVar.a(obj2)) != -1 && goVar.a(iA, this.f1091a).c == i) {
            return this.m;
        }
        for (sd sdVarD = this.h; sdVarD != null; sdVarD = sdVarD.d()) {
            if (sdVarD.b.equals(obj)) {
                return sdVarD.f.f1062a.d;
            }
        }
        for (sd sdVarD2 = this.h; sdVarD2 != null; sdVarD2 = sdVarD2.d()) {
            int iA2 = goVar.a(sdVarD2.b);
            if (iA2 != -1 && goVar.a(iA2, this.f1091a).c == i) {
                return sdVarD2.f.f1062a.d;
            }
        }
        long j = this.e;
        this.e = 1 + j;
        if (this.h == null) {
            this.l = obj;
            this.m = j;
        }
        return j;
    }

    private boolean a(go goVar) {
        sd sdVarD = this.h;
        if (sdVarD == null) {
            return true;
        }
        int iA = goVar.a(sdVarD.b);
        while (true) {
            iA = goVar.a(iA, this.f1091a, this.b, this.f, this.g);
            while (sdVarD.d() != null && !sdVarD.f.g) {
                sdVarD = sdVarD.d();
            }
            sd sdVarD2 = sdVarD.d();
            if (iA == -1 || sdVarD2 == null || goVar.a(sdVarD2.b) != iA) {
                break;
            }
            sdVarD = sdVarD2;
        }
        boolean zA = a(sdVarD);
        sdVarD.f = a(goVar, sdVarD.f);
        return !zA;
    }

    public boolean a(go goVar, long j, long j2) {
        boolean zA;
        ud udVarA;
        sd sdVarD = this.h;
        sd sdVar = null;
        while (sdVarD != null) {
            ud udVar = sdVarD.f;
            if (sdVar == null) {
                udVarA = a(goVar, udVar);
            } else {
                ud udVarA2 = a(goVar, sdVar, j);
                if (udVarA2 == null) {
                    zA = a(sdVar);
                } else if (a(udVar, udVarA2)) {
                    udVarA = udVarA2;
                } else {
                    zA = a(sdVar);
                }
                return !zA;
            }
            sdVarD.f = udVarA.a(udVar.c);
            if (!a(udVar.e, udVarA.e)) {
                sdVarD.m();
                long j3 = udVarA.e;
                return (a(sdVarD) || (sdVarD == this.i && !sdVarD.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : sdVarD.e(j3)) ? 1 : (j2 == ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : sdVarD.e(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            sdVar = sdVarD;
            sdVarD = sdVarD.d();
        }
        return true;
    }

    public boolean a(go goVar, int i) {
        this.f = i;
        return a(goVar);
    }

    public boolean a(go goVar, boolean z) {
        this.g = z;
        return a(goVar);
    }
}
