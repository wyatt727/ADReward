package com.applovin.impl;

import com.applovin.impl.rd;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public final class rc implements rd, rd.a {

    /* renamed from: a, reason: collision with root package name */
    public final wd.a f858a;
    private final long b;
    private final n0 c;
    private wd d;
    private rd f;
    private rd.a g;
    private long h = -9223372036854775807L;

    public rc(wd.a aVar, n0 n0Var, long j) {
        this.f858a = aVar;
        this.c = n0Var;
        this.b = j;
    }

    public long d() {
        return this.b;
    }

    public long c() {
        return this.h;
    }

    public void a(wd.a aVar) {
        long jD = d(this.b);
        rd rdVarA = ((wd) a1.a(this.d)).a(aVar, this.c, jD);
        this.f = rdVarA;
        if (this.g != null) {
            rdVarA.a(this, jD);
        }
    }

    public void i() {
        if (this.f != null) {
            ((wd) a1.a(this.d)).a(this.f);
        }
    }

    @Override // com.applovin.impl.rd
    public void f() {
        rd rdVar = this.f;
        if (rdVar != null) {
            rdVar.f();
            return;
        }
        wd wdVar = this.d;
        if (wdVar != null) {
            wdVar.b();
        }
    }

    @Override // com.applovin.impl.rd
    public long h() {
        return ((rd) yp.a(this.f)).h();
    }

    @Override // com.applovin.impl.rd
    public long e() {
        return ((rd) yp.a(this.f)).e();
    }

    @Override // com.applovin.impl.rd
    public long g() {
        return ((rd) yp.a(this.f)).g();
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j) {
        rd rdVar = this.f;
        return rdVar != null && rdVar.b(j);
    }

    public void e(long j) {
        this.h = j;
    }

    @Override // com.applovin.impl.rd
    public void a(long j, boolean z) {
        ((rd) yp.a(this.f)).a(j, z);
    }

    @Override // com.applovin.impl.rd
    public void c(long j) {
        ((rd) yp.a(this.f)).c(j);
    }

    private long d(long j) {
        long j2 = this.h;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        return ((rd) yp.a(this.f)).b();
    }

    @Override // com.applovin.impl.rd
    public long a(long j, fj fjVar) {
        return ((rd) yp.a(this.f)).a(j, fjVar);
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(rd rdVar) {
        ((rd.a) yp.a(this.g)).a((lj) this);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        rd rdVar = this.f;
        return rdVar != null && rdVar.a();
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        ((rd.a) yp.a(this.g)).a((rd) this);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j) {
        this.g = aVar;
        rd rdVar = this.f;
        if (rdVar != null) {
            rdVar.a(this, d(this.b));
        }
    }

    @Override // com.applovin.impl.rd
    public long a(long j) {
        return ((rd) yp.a(this.f)).a(j);
    }

    @Override // com.applovin.impl.rd
    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.h;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.h = -9223372036854775807L;
            j2 = j3;
        }
        return ((rd) yp.a(this.f)).a(f8VarArr, zArr, yiVarArr, zArr2, j2);
    }

    public void a(wd wdVar) {
        a1.b(this.d == null);
        this.d = wdVar;
    }
}
