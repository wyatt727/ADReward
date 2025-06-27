package com.applovin.impl;

/* loaded from: classes.dex */
public final class yk implements bd {

    /* renamed from: a, reason: collision with root package name */
    private final j3 f1212a;
    private boolean b;
    private long c;
    private long d;
    private mh f = mh.d;

    public yk(j3 j3Var) {
        this.f1212a = j3Var;
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.d = this.f1212a.c();
        this.b = true;
    }

    public void c() {
        if (this.b) {
            a(p());
            this.b = false;
        }
    }

    @Override // com.applovin.impl.bd
    public long p() {
        long jA;
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jC = this.f1212a.c() - this.d;
        mh mhVar = this.f;
        if (mhVar.f697a == 1.0f) {
            jA = r2.a(jC);
        } else {
            jA = mhVar.a(jC);
        }
        return j + jA;
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        return this.f;
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.f1212a.c();
        }
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        if (this.b) {
            a(p());
        }
        this.f = mhVar;
    }
}
