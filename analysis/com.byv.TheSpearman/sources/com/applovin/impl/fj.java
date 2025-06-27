package com.applovin.impl;

/* loaded from: classes.dex */
public final class fj {
    public static final fj c;
    public static final fj d;
    public static final fj e;
    public static final fj f;
    public static final fj g;

    /* renamed from: a, reason: collision with root package name */
    public final long f433a;
    public final long b;

    static {
        fj fjVar = new fj(0L, 0L);
        c = fjVar;
        d = new fj(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new fj(Long.MAX_VALUE, 0L);
        f = new fj(0L, Long.MAX_VALUE);
        g = fjVar;
    }

    public fj(long j, long j2) {
        a1.a(j >= 0);
        a1.a(j2 >= 0);
        this.f433a = j;
        this.b = j2;
    }

    public long a(long j, long j2, long j3) {
        long j4 = this.f433a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        long jD = yp.d(j, j4, Long.MIN_VALUE);
        long jA = yp.a(j, this.b, Long.MAX_VALUE);
        boolean z = jD <= j2 && j2 <= jA;
        boolean z2 = jD <= j3 && j3 <= jA;
        return (z && z2) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z ? j2 : z2 ? j3 : jD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fj.class != obj.getClass()) {
            return false;
        }
        fj fjVar = (fj) obj;
        return this.f433a == fjVar.f433a && this.b == fjVar.b;
    }

    public int hashCode() {
        return (((int) this.f433a) * 31) + ((int) this.b);
    }
}
