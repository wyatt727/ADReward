package com.applovin.impl;

/* loaded from: classes.dex */
final class f6 implements bd {

    /* renamed from: a, reason: collision with root package name */
    private final yk f413a;
    private final a b;
    private li c;
    private bd d;
    private boolean f = true;
    private boolean g;

    public interface a {
        void a(mh mhVar);
    }

    public f6(a aVar, j3 j3Var) {
        this.b = aVar;
        this.f413a = new yk(j3Var);
    }

    public void c() {
        this.g = false;
        this.f413a.c();
    }

    public void b(li liVar) throws y7 {
        bd bdVar;
        bd bdVarL = liVar.l();
        if (bdVarL == null || bdVarL == (bdVar = this.d)) {
            return;
        }
        if (bdVar == null) {
            this.d = bdVarL;
            this.c = liVar;
            bdVarL.a(this.f413a.a());
            return;
        }
        throw y7.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    @Override // com.applovin.impl.bd
    public long p() {
        if (this.f) {
            return this.f413a.p();
        }
        return ((bd) a1.a(this.d)).p();
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        bd bdVar = this.d;
        if (bdVar != null) {
            return bdVar.a();
        }
        return this.f413a.a();
    }

    public void b() {
        this.g = true;
        this.f413a.b();
    }

    private void c(boolean z) {
        if (a(z)) {
            this.f = true;
            if (this.g) {
                this.f413a.b();
                return;
            }
            return;
        }
        bd bdVar = (bd) a1.a(this.d);
        long jP = bdVar.p();
        if (this.f) {
            if (jP < this.f413a.p()) {
                this.f413a.c();
                return;
            } else {
                this.f = false;
                if (this.g) {
                    this.f413a.b();
                }
            }
        }
        this.f413a.a(jP);
        mh mhVarA = bdVar.a();
        if (mhVarA.equals(this.f413a.a())) {
            return;
        }
        this.f413a.a(mhVarA);
        this.b.a(mhVarA);
    }

    public void a(li liVar) {
        if (liVar == this.c) {
            this.d = null;
            this.c = null;
            this.f = true;
        }
    }

    public long b(boolean z) {
        c(z);
        return p();
    }

    public void a(long j) {
        this.f413a.a(j);
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        bd bdVar = this.d;
        if (bdVar != null) {
            bdVar.a(mhVar);
            mhVar = this.d.a();
        }
        this.f413a.a(mhVar);
    }

    private boolean a(boolean z) {
        li liVar = this.c;
        return liVar == null || liVar.c() || (!this.c.d() && (z || this.c.j()));
    }
}
