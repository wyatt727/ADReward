package com.applovin.impl;

import com.applovin.impl.wd;
import java.util.List;

/* loaded from: classes.dex */
final class lh {
    private static final wd.a t = new wd.a(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final go f631a;
    public final wd.a b;
    public final long c;
    public final long d;
    public final int e;
    public final y7 f;
    public final boolean g;
    public final qo h;
    public final xo i;
    public final List j;
    public final wd.a k;
    public final boolean l;
    public final int m;
    public final mh n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public static lh a(xo xoVar) {
        go goVar = go.f465a;
        wd.a aVar = t;
        return new lh(goVar, aVar, -9223372036854775807L, 0L, 1, null, false, qo.d, xoVar, ab.h(), aVar, false, 0, mh.d, 0L, 0L, 0L, false, false);
    }

    public lh b(boolean z) {
        return new lh(this.f631a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public lh c(boolean z) {
        return new lh(this.f631a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, z);
    }

    public static wd.a a() {
        return t;
    }

    public lh a(wd.a aVar, long j, long j2, long j3, long j4, qo qoVar, xo xoVar, List list) {
        return new lh(this.f631a, aVar, j2, j3, this.e, this.f, this.g, qoVar, xoVar, list, this.k, this.l, this.m, this.n, this.q, j4, j, this.o, this.p);
    }

    public lh a(go goVar) {
        return new lh(goVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public lh a(int i) {
        return new lh(this.f631a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public lh a(y7 y7Var) {
        return new lh(this.f631a, this.b, this.c, this.d, this.e, y7Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public lh a(boolean z) {
        return new lh(this.f631a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public lh a(wd.a aVar) {
        return new lh(this.f631a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aVar, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public lh a(boolean z, int i) {
        return new lh(this.f631a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public lh a(mh mhVar) {
        return new lh(this.f631a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, mhVar, this.q, this.r, this.s, this.o, this.p);
    }

    public lh(go goVar, wd.a aVar, long j, long j2, int i, y7 y7Var, boolean z, qo qoVar, xo xoVar, List list, wd.a aVar2, boolean z2, int i2, mh mhVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f631a = goVar;
        this.b = aVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = y7Var;
        this.g = z;
        this.h = qoVar;
        this.i = xoVar;
        this.j = list;
        this.k = aVar2;
        this.l = z2;
        this.m = i2;
        this.n = mhVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.o = z3;
        this.p = z4;
    }
}
