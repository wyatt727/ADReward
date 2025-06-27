package com.applovin.impl;

import com.applovin.impl.g5;
import com.applovin.impl.go;
import com.applovin.impl.od;
import com.applovin.impl.wd;
import com.applovin.impl.wh;
import com.applovin.impl.xh;
import com.applovin.impl.yh;

/* loaded from: classes.dex */
public final class yh extends b2 implements xh.b {
    private final od g;
    private final od.g h;
    private final g5.a i;
    private final wh.a j;
    private final z6 k;
    private final hc l;
    private final int m;
    private boolean n;
    private long o;
    private boolean p;
    private boolean q;
    private yo r;

    @Override // com.applovin.impl.wd
    public void b() {
    }

    public static final class b implements yd {

        /* renamed from: a, reason: collision with root package name */
        private final g5.a f1209a;
        private wh.a b;
        private a7 c;
        private hc d;
        private int e;
        private String f;
        private Object g;

        public b(g5.a aVar) {
            this(aVar, new a6());
        }

        public b(g5.a aVar, final m8 m8Var) {
            this(aVar, new wh.a() { // from class: com.applovin.impl.yh$b$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.wh.a
                public final wh a() {
                    return yh.b.a(m8Var);
                }
            });
        }

        public yh a(od odVar) {
            a1.a(odVar.b);
            od.g gVar = odVar.b;
            boolean z = gVar.g == null && this.g != null;
            boolean z2 = gVar.e == null && this.f != null;
            if (z && z2) {
                odVar = odVar.a().a(this.g).a(this.f).a();
            } else if (z) {
                odVar = odVar.a().a(this.g).a();
            } else if (z2) {
                odVar = odVar.a().a(this.f).a();
            }
            od odVar2 = odVar;
            return new yh(odVar2, this.f1209a, this.b, this.c.a(odVar2), this.d, this.e, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ wh a(m8 m8Var) {
            return new o2(m8Var);
        }

        public b(g5.a aVar, wh.a aVar2) {
            this.f1209a = aVar;
            this.b = aVar2;
            this.c = new x5();
            this.d = new e6();
            this.e = 1048576;
        }
    }

    private yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i) {
        this.h = (od.g) a1.a(odVar.b);
        this.g = odVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = z6Var;
        this.l = hcVar;
        this.m = i;
        this.n = true;
        this.o = -9223372036854775807L;
    }

    @Override // com.applovin.impl.wd
    public rd a(wd.a aVar, n0 n0Var, long j) {
        g5 g5VarA = this.i.a();
        yo yoVar = this.r;
        if (yoVar != null) {
            g5VarA.a(yoVar);
        }
        return new xh(this.h.f750a, g5VarA, this.j.a(), this.k, a(aVar), this.l, b(aVar), this, n0Var, this.h.e, this.m);
    }

    @Override // com.applovin.impl.b2
    protected void h() {
        this.k.a();
    }

    /* synthetic */ yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i, a aVar3) {
        this(odVar, aVar, aVar2, z6Var, hcVar, i);
    }

    private void i() {
        go dkVar = new dk(this.o, this.p, false, this.q, null, this.g);
        if (this.n) {
            dkVar = new a(dkVar);
        }
        a(dkVar);
    }

    class a extends g9 {
        a(go goVar) {
            super(goVar);
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.b a(int i, go.b bVar, boolean z) {
            super.a(i, bVar, z);
            bVar.g = true;
            return bVar;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.d a(int i, go.d dVar, long j) {
            super.a(i, dVar, j);
            dVar.m = true;
            return dVar;
        }
    }

    @Override // com.applovin.impl.wd
    public od a() {
        return this.g;
    }

    @Override // com.applovin.impl.xh.b
    public void a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        if (!this.n && this.o == j && this.p == z && this.q == z2) {
            return;
        }
        this.o = j;
        this.p = z;
        this.q = z2;
        this.n = false;
        i();
    }

    @Override // com.applovin.impl.b2
    protected void a(yo yoVar) {
        this.r = yoVar;
        this.k.b();
        i();
    }

    @Override // com.applovin.impl.wd
    public void a(rd rdVar) {
        ((xh) rdVar).t();
    }
}
