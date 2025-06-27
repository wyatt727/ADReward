package com.applovin.impl;

import com.applovin.impl.ej;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class h6 implements gg {

    /* renamed from: a, reason: collision with root package name */
    private final fg f491a;
    private final long b;
    private final long c;
    private final dl d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public h6(dl dlVar, long j, long j2, long j3, long j4, boolean z) {
        a1.a(j >= 0 && j2 > j);
        this.d = dlVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.f491a = new fg();
    }

    @Override // com.applovin.impl.gg
    public long a(j8 j8Var) throws IOException {
        int i = this.e;
        if (i == 0) {
            long jF = j8Var.f();
            this.g = jF;
            this.e = 1;
            long j = this.c - 65307;
            if (j > jF) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jB = b(j8Var);
                if (jB != -1) {
                    return jB;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            d(j8Var);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = c(j8Var);
        this.e = 4;
        return this.g;
    }

    @Override // com.applovin.impl.gg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    private void d(j8 j8Var) throws ah {
        while (true) {
            this.f491a.a(j8Var);
            this.f491a.a(j8Var, false);
            fg fgVar = this.f491a;
            if (fgVar.c > this.h) {
                j8Var.b();
                return;
            } else {
                j8Var.a(fgVar.h + fgVar.i);
                this.i = j8Var.f();
                this.k = this.f491a.c;
            }
        }
    }

    private final class b implements ej {
        @Override // com.applovin.impl.ej
        public boolean b() {
            return true;
        }

        private b() {
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j) {
            return new ej.a(new gj(j, yp.b((h6.this.b + ((h6.this.d.b(j) * (h6.this.c - h6.this.b)) / h6.this.f)) - 30000, h6.this.b, h6.this.c - 1)));
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return h6.this.d.a(h6.this.f);
        }
    }

    long c(j8 j8Var) throws EOFException, ah {
        this.f491a.a();
        if (this.f491a.a(j8Var)) {
            this.f491a.a(j8Var, false);
            fg fgVar = this.f491a;
            j8Var.a(fgVar.h + fgVar.i);
            long j = this.f491a.c;
            while (true) {
                fg fgVar2 = this.f491a;
                if ((fgVar2.b & 4) == 4 || !fgVar2.a(j8Var) || j8Var.f() >= this.c || !this.f491a.a(j8Var, true)) {
                    break;
                }
                fg fgVar3 = this.f491a;
                if (!l8.a(j8Var, fgVar3.h + fgVar3.i)) {
                    break;
                }
                j = this.f491a.c;
            }
            return j;
        }
        throw new EOFException();
    }

    private long b(j8 j8Var) throws IOException {
        if (this.i == this.j) {
            return -1L;
        }
        long jF = j8Var.f();
        if (!this.f491a.a(j8Var, this.j)) {
            long j = this.i;
            if (j != jF) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f491a.a(j8Var, false);
        j8Var.b();
        long j2 = this.h;
        fg fgVar = this.f491a;
        long j3 = fgVar.c;
        long j4 = j2 - j3;
        int i = fgVar.h + fgVar.i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.j = jF;
            this.l = j3;
        } else {
            this.i = j8Var.f() + i;
            this.k = this.f491a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < 100000) {
            this.j = j6;
            return j6;
        }
        long jF2 = j8Var.f() - (i * (j4 <= 0 ? 2L : 1L));
        long j7 = this.j;
        long j8 = this.i;
        return yp.b(jF2 + ((j4 * (j7 - j8)) / (this.l - this.k)), j8, j7 - 1);
    }

    @Override // com.applovin.impl.gg
    public void a(long j) {
        this.h = yp.b(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
