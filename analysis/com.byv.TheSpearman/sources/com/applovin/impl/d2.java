package com.applovin.impl;

import com.applovin.impl.li;
import com.applovin.impl.mi;

/* loaded from: classes.dex */
public abstract class d2 implements li, mi {

    /* renamed from: a, reason: collision with root package name */
    private final int f350a;
    private ni c;
    private int d;
    private int f;
    private yi g;
    private d9[] h;
    private long i;
    private long j;
    private boolean l;
    private boolean m;
    private final e9 b = new e9();
    private long k = Long.MIN_VALUE;

    @Override // com.applovin.impl.li
    public /* synthetic */ void a(float f, float f2) {
        li.CC.$default$a(this, f, f2);
    }

    @Override // com.applovin.impl.oh.b
    public void a(int i, Object obj) {
    }

    protected abstract void a(long j, boolean z);

    protected void a(boolean z, boolean z2) {
    }

    protected abstract void a(d9[] d9VarArr, long j, long j2);

    @Override // com.applovin.impl.li
    public bd l() {
        return null;
    }

    @Override // com.applovin.impl.mi
    public int m() {
        return 0;
    }

    @Override // com.applovin.impl.li
    public final mi n() {
        return this;
    }

    protected abstract void v();

    protected void w() {
    }

    protected void x() {
    }

    protected void y() {
    }

    public d2(int i) {
        this.f350a = i;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public final int e() {
        return this.f350a;
    }

    @Override // com.applovin.impl.li
    public final int b() {
        return this.f;
    }

    @Override // com.applovin.impl.li
    public final void start() {
        a1.b(this.f == 1);
        this.f = 2;
        x();
    }

    @Override // com.applovin.impl.li
    public final yi o() {
        return this.g;
    }

    @Override // com.applovin.impl.li
    public final boolean j() {
        return this.k == Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.li
    public final long i() {
        return this.k;
    }

    @Override // com.applovin.impl.li
    public final void g() {
        this.l = true;
    }

    @Override // com.applovin.impl.li
    public final boolean k() {
        return this.l;
    }

    @Override // com.applovin.impl.li
    public final void b(int i) {
        this.d = i;
    }

    @Override // com.applovin.impl.li
    public final void h() {
        ((yi) a1.a(this.g)).a();
    }

    @Override // com.applovin.impl.li
    public final void stop() {
        a1.b(this.f == 2);
        this.f = 1;
        y();
    }

    @Override // com.applovin.impl.li
    public final void f() {
        a1.b(this.f == 1);
        this.b.a();
        this.f = 0;
        this.g = null;
        this.h = null;
        this.l = false;
        v();
    }

    @Override // com.applovin.impl.li
    public final void reset() {
        a1.b(this.f == 0);
        this.b.a();
        w();
    }

    protected final e9 r() {
        this.b.a();
        return this.b;
    }

    protected final d9[] t() {
        return (d9[]) a1.a(this.h);
    }

    protected final ni q() {
        return (ni) a1.a(this.c);
    }

    protected final int s() {
        return this.d;
    }

    protected final y7 a(Throwable th, d9 d9Var, int i) {
        return a(th, d9Var, false, i);
    }

    protected final boolean u() {
        return j() ? this.l : ((yi) a1.a(this.g)).d();
    }

    protected int b(long j) {
        return ((yi) a1.a(this.g)).a(j - this.i);
    }

    protected final y7 a(Throwable th, d9 d9Var, boolean z, int i) {
        int iD;
        if (d9Var == null || this.m) {
            iD = 4;
        } else {
            this.m = true;
            try {
                iD = mi.CC.d(a(d9Var));
            } catch (y7 unused) {
            } finally {
                this.m = false;
            }
        }
        return y7.a(th, getName(), s(), d9Var, iD, z, i);
    }

    @Override // com.applovin.impl.li
    public final void a(ni niVar, d9[] d9VarArr, yi yiVar, long j, boolean z, boolean z2, long j2, long j3) {
        a1.b(this.f == 0);
        this.c = niVar;
        this.f = 1;
        this.j = j;
        a(z, z2);
        a(d9VarArr, yiVar, j2, j3);
        a(j, z);
    }

    protected final int a(e9 e9Var, n5 n5Var, int i) {
        int iA = ((yi) a1.a(this.g)).a(e9Var, n5Var, i);
        if (iA == -4) {
            if (n5Var.e()) {
                this.k = Long.MIN_VALUE;
                return this.l ? -4 : -3;
            }
            long j = n5Var.f + this.i;
            n5Var.f = j;
            this.k = Math.max(this.k, j);
        } else if (iA == -5) {
            d9 d9Var = (d9) a1.a(e9Var.b);
            if (d9Var.q != Long.MAX_VALUE) {
                e9Var.b = d9Var.a().a(d9Var.q + this.i).a();
            }
        }
        return iA;
    }

    @Override // com.applovin.impl.li
    public final void a(d9[] d9VarArr, yi yiVar, long j, long j2) {
        a1.b(!this.l);
        this.g = yiVar;
        if (this.k == Long.MIN_VALUE) {
            this.k = j;
        }
        this.h = d9VarArr;
        this.i = j2;
        a(d9VarArr, j, j2);
    }

    @Override // com.applovin.impl.li
    public final void a(long j) {
        this.l = false;
        this.j = j;
        this.k = j;
        a(j, false);
    }
}
