package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.od;

/* loaded from: classes.dex */
public final class c6 implements fc {

    /* renamed from: a, reason: collision with root package name */
    private final float f312a;
    private final float b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;
    private final float g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f313a = 0.97f;
        private float b = 1.03f;
        private long c = 1000;
        private float d = 1.0E-7f;
        private long e = r2.a(20L);
        private long f = r2.a(500L);
        private float g = 0.999f;

        public c6 a() {
            return new c6(this.f313a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    private static long a(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    private c6(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f312a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
        this.e = j2;
        this.f = j3;
        this.g = f4;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f;
        this.n = f2;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }

    @Override // com.applovin.impl.fc
    public float a(long j, long j2) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        b(j, j2);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        b(j);
        long j3 = j - this.m;
        if (Math.abs(j3) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = yp.a((this.d * j3) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    private void c() {
        long j = this.h;
        if (j != -9223372036854775807L) {
            long j2 = this.i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    private void b(long j) {
        long j2 = this.r + (this.s * 3);
        if (this.m > j2) {
            float fA = r2.a(this.c);
            this.m = nc.a(j2, this.j, this.m - (((long) ((this.p - 1.0f) * fA)) + ((long) ((this.n - 1.0f) * fA))));
            return;
        }
        long jB = yp.b(j - ((long) (Math.max(0.0f, this.p - 1.0f) / this.d)), this.m, j2);
        this.m = jB;
        long j3 = this.l;
        if (j3 == -9223372036854775807L || jB <= j3) {
            return;
        }
        this.m = j3;
    }

    @Override // com.applovin.impl.fc
    public void a() {
        long j = this.m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.m = j3;
        }
        this.q = -9223372036854775807L;
    }

    @Override // com.applovin.impl.fc
    public long b() {
        return this.m;
    }

    @Override // com.applovin.impl.fc
    public void a(od.f fVar) {
        this.h = r2.a(fVar.f748a);
        this.k = r2.a(fVar.b);
        this.l = r2.a(fVar.c);
        float f = fVar.d;
        if (f == -3.4028235E38f) {
            f = this.f312a;
        }
        this.o = f;
        float f2 = fVar.f;
        if (f2 == -3.4028235E38f) {
            f2 = this.b;
        }
        this.n = f2;
        c();
    }

    private void b(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.r;
        if (j4 == -9223372036854775807L) {
            this.r = j3;
            this.s = 0L;
        } else {
            long jMax = Math.max(j3, a(j4, j3, this.g));
            this.r = jMax;
            this.s = a(this.s, Math.abs(j3 - jMax), this.g);
        }
    }

    @Override // com.applovin.impl.fc
    public void a(long j) {
        this.i = j;
        c();
    }
}
