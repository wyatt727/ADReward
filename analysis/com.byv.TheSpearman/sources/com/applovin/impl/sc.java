package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public final class sc extends z3 {
    private final wd j;
    private final boolean k;
    private final go.d l;
    private final go.b m;
    private a n;
    private rc o;
    private boolean p;
    private boolean q;
    private boolean r;

    public static final class b extends go {
        private final od c;

        @Override // com.applovin.impl.go
        public int a() {
            return 1;
        }

        @Override // com.applovin.impl.go
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.go
        public Object b(int i) {
            return a.g;
        }

        public b(od odVar) {
            this.c = odVar;
        }

        @Override // com.applovin.impl.go
        public int a(Object obj) {
            return obj == a.g ? 0 : -1;
        }

        @Override // com.applovin.impl.go
        public go.b a(int i, go.b bVar, boolean z) {
            bVar.a(z ? 0 : null, z ? a.g : null, 0, -9223372036854775807L, 0L, u.h, true);
            return bVar;
        }

        @Override // com.applovin.impl.go
        public go.d a(int i, go.d dVar, long j) {
            dVar.a(go.d.s, this.c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.m = true;
            return dVar;
        }
    }

    @Override // com.applovin.impl.wd
    public void b() {
    }

    public sc(wd wdVar, boolean z) {
        this.j = wdVar;
        this.k = z && wdVar.c();
        this.l = new go.d();
        this.m = new go.b();
        go goVarD = wdVar.d();
        if (goVarD != null) {
            this.n = a.a(goVarD, (Object) null, (Object) null);
            this.r = true;
        } else {
            this.n = a.a(wdVar.a());
        }
    }

    public go i() {
        return this.n;
    }

    @Override // com.applovin.impl.wd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public rc a(wd.a aVar, n0 n0Var, long j) {
        rc rcVar = new rc(aVar, n0Var, j);
        rcVar.a(this.j);
        if (this.q) {
            rcVar.a(aVar.b(b(aVar.f1031a)));
        } else {
            this.o = rcVar;
            if (!this.p) {
                this.p = true;
                a((Object) null, this.j);
            }
        }
        return rcVar;
    }

    @Override // com.applovin.impl.z3, com.applovin.impl.b2
    public void h() {
        this.q = false;
        this.p = false;
        super.h();
    }

    private static final class a extends g9 {
        public static final Object g = new Object();
        private final Object d;
        private final Object f;

        private a(go goVar, Object obj, Object obj2) {
            super(goVar);
            this.d = obj;
            this.f = obj2;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public Object b(int i) {
            Object objB = this.c.b(i);
            return yp.a(objB, this.f) ? g : objB;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public int a(Object obj) {
            Object obj2;
            go goVar = this.c;
            if (g.equals(obj) && (obj2 = this.f) != null) {
                obj = obj2;
            }
            return goVar.a(obj);
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.b a(int i, go.b bVar, boolean z) {
            this.c.a(i, bVar, z);
            if (yp.a(bVar.b, this.f) && z) {
                bVar.b = g;
            }
            return bVar;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.d a(int i, go.d dVar, long j) {
            this.c.a(i, dVar, j);
            if (yp.a(dVar.f467a, this.d)) {
                dVar.f467a = go.d.s;
            }
            return dVar;
        }

        public static a a(od odVar) {
            return new a(new b(odVar), go.d.s, g);
        }

        public static a a(go goVar, Object obj, Object obj2) {
            return new a(goVar, obj, obj2);
        }

        public a a(go goVar) {
            return new a(goVar, this.d, this.f);
        }
    }

    private Object a(Object obj) {
        return (this.n.f == null || !this.n.f.equals(obj)) ? obj : a.g;
    }

    private Object b(Object obj) {
        return (this.n.f == null || !obj.equals(a.g)) ? obj : this.n.f;
    }

    @Override // com.applovin.impl.wd
    public od a() {
        return this.j.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.z3
    public wd.a a(Void r1, wd.a aVar) {
        return aVar.b(a(aVar.f1031a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.applovin.impl.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Void r13, com.applovin.impl.wd r14, com.applovin.impl.go r15) {
        /*
            r12 = this;
            boolean r13 = r12.q
            if (r13 == 0) goto L19
            com.applovin.impl.sc$a r13 = r12.n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            r12.n = r13
            com.applovin.impl.rc r13 = r12.o
            if (r13 == 0) goto Lae
            long r13 = r13.c()
            r12.a(r13)
            goto Lae
        L19:
            boolean r13 = r15.c()
            if (r13 == 0) goto L36
            boolean r13 = r12.r
            if (r13 == 0) goto L2a
            com.applovin.impl.sc$a r13 = r12.n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            goto L32
        L2a:
            java.lang.Object r13 = com.applovin.impl.go.d.s
            java.lang.Object r14 = com.applovin.impl.sc.a.g
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a(r15, r13, r14)
        L32:
            r12.n = r13
            goto Lae
        L36:
            com.applovin.impl.go$d r13 = r12.l
            r14 = 0
            r15.a(r14, r13)
            com.applovin.impl.go$d r13 = r12.l
            long r0 = r13.c()
            com.applovin.impl.go$d r13 = r12.l
            java.lang.Object r13 = r13.f467a
            com.applovin.impl.rc r2 = r12.o
            if (r2 == 0) goto L74
            long r2 = r2.d()
            com.applovin.impl.sc$a r4 = r12.n
            com.applovin.impl.rc r5 = r12.o
            com.applovin.impl.wd$a r5 = r5.f858a
            java.lang.Object r5 = r5.f1031a
            com.applovin.impl.go$b r6 = r12.m
            r4.a(r5, r6)
            com.applovin.impl.go$b r4 = r12.m
            long r4 = r4.e()
            long r4 = r4 + r2
            com.applovin.impl.sc$a r2 = r12.n
            com.applovin.impl.go$d r3 = r12.l
            com.applovin.impl.go$d r14 = r2.a(r14, r3)
            long r2 = r14.c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            com.applovin.impl.go$d r7 = r12.l
            com.applovin.impl.go$b r8 = r12.m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.r
            if (r14 == 0) goto L94
            com.applovin.impl.sc$a r13 = r12.n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            goto L98
        L94:
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a(r15, r13, r0)
        L98:
            r12.n = r13
            com.applovin.impl.rc r13 = r12.o
            if (r13 == 0) goto Lae
            r12.a(r1)
            com.applovin.impl.wd$a r13 = r13.f858a
            java.lang.Object r14 = r13.f1031a
            java.lang.Object r14 = r12.b(r14)
            com.applovin.impl.wd$a r13 = r13.b(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.r = r14
            r12.q = r14
            com.applovin.impl.sc$a r14 = r12.n
            r12.a(r14)
            if (r13 == 0) goto Lc6
            com.applovin.impl.rc r14 = r12.o
            java.lang.Object r14 = com.applovin.impl.a1.a(r14)
            com.applovin.impl.rc r14 = (com.applovin.impl.rc) r14
            r14.a(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sc.a(java.lang.Void, com.applovin.impl.wd, com.applovin.impl.go):void");
    }

    @Override // com.applovin.impl.z3, com.applovin.impl.b2
    public void a(yo yoVar) {
        super.a(yoVar);
        if (this.k) {
            return;
        }
        this.p = true;
        a((Object) null, this.j);
    }

    @Override // com.applovin.impl.wd
    public void a(rd rdVar) {
        ((rc) rdVar).i();
        if (rdVar == this.o) {
            this.o = null;
        }
    }

    private void a(long j) {
        rc rcVar = this.o;
        int iA = this.n.a(rcVar.f858a.f1031a);
        if (iA == -1) {
            return;
        }
        long j2 = this.n.a(iA, this.m).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        rcVar.e(j);
    }
}
