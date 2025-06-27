package com.applovin.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.impl.ej;

/* loaded from: classes.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    protected final a f482a;
    protected final f b;
    protected c c;
    private final int d;

    public static final class b implements d {
        @Override // com.applovin.impl.h2.d
        public long a(long j) {
            return j;
        }
    }

    protected interface d {
        long a(long j);
    }

    protected interface f {

        /* renamed from: com.applovin.impl.h2$f$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(f _this) {
            }
        }

        e a(j8 j8Var, long j);

        void a();
    }

    protected void b(boolean z, long j) {
    }

    protected h2(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.f482a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    public final ej a() {
        return this.f482a;
    }

    public final boolean b() {
        return this.c != null;
    }

    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f484a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f484a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = a(j2, j3, j4, j5, j6, j7);
        }

        private void f() {
            this.h = a(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f484a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.h;
        }

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return yp.b(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j, long j2) {
            this.d = j;
            this.f = j2;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.e = j;
            this.g = j2;
            f();
        }
    }

    public final void b(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.d() != j) {
            this.c = a(j);
        }
    }

    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            c cVar = (c) a1.b(this.c);
            long jB = cVar.b();
            long jA = cVar.a();
            long jC = cVar.c();
            if (jA - jB <= this.d) {
                a(false, jB);
                return a(j8Var, jB, qhVar);
            }
            if (!a(j8Var, jC)) {
                return a(j8Var, jC, qhVar);
            }
            j8Var.b();
            e eVarA = this.b.a(j8Var, cVar.e());
            int i = eVarA.f485a;
            if (i == -3) {
                a(false, jC);
                return a(j8Var, jC, qhVar);
            }
            if (i == -2) {
                cVar.b(eVarA.b, eVarA.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    a(j8Var, eVarA.c);
                    a(true, eVarA.c);
                    return a(j8Var, eVarA.c, qhVar);
                }
                cVar.a(eVarA.b, eVarA.c);
            }
        }
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f485a;
        private final long b;
        private final long c;

        public static e a(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e b(long j, long j2) {
            return new e(-2, j, j2);
        }

        public static e a(long j) {
            return new e(0, -9223372036854775807L, j);
        }

        private e(int i, long j, long j2) {
            this.f485a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public static class a implements ej {

        /* renamed from: a, reason: collision with root package name */
        private final d f483a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        @Override // com.applovin.impl.ej
        public boolean b() {
            return true;
        }

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f483a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j) {
            return new ej.a(new gj(j, c.a(this.f483a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.b;
        }

        public long c(long j) {
            return this.f483a.a(j);
        }
    }

    protected final void a(boolean z, long j) {
        this.c = null;
        this.b.a();
        b(z, j);
    }

    protected final int a(j8 j8Var, long j, qh qhVar) {
        if (j == j8Var.f()) {
            return 0;
        }
        qhVar.f835a = j;
        return 1;
    }

    protected final boolean a(j8 j8Var, long j) {
        long jF = j - j8Var.f();
        if (jF < 0 || jF > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        j8Var.a((int) jF);
        return true;
    }

    protected c a(long j) {
        return new c(j, this.f482a.c(j), this.f482a.c, this.f482a.d, this.f482a.e, this.f482a.f, this.f482a.g);
    }
}
