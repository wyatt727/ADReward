package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class j0 implements i8 {
    public static final m8 m = new m8() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return j0.b();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f549a;
    private final k0 b;
    private final yg c;
    private final yg d;
    private final xg e;
    private k8 f;
    private long g;
    private long h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public j0() {
        this(0);
    }

    public j0(int i) {
        this.f549a = (i & 2) != 0 ? i | 1 : i;
        this.b = new k0(true);
        this.c = new yg(2048);
        this.i = -1;
        this.h = -1L;
        yg ygVar = new yg(10);
        this.d = ygVar;
        this.e = new xg(ygVar.c());
    }

    private int c(j8 j8Var) {
        int i = 0;
        while (true) {
            j8Var.c(this.d.c(), 0, 10);
            this.d.f(0);
            if (this.d.z() != 4801587) {
                break;
            }
            this.d.g(3);
            int iV = this.d.v();
            i += iV + 10;
            j8Var.c(iV);
        }
        j8Var.b();
        j8Var.c(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    private void b(j8 j8Var) throws ah {
        int iA;
        if (this.j) {
            return;
        }
        this.i = -1;
        j8Var.b();
        long j = 0;
        if (j8Var.f() == 0) {
            c(j8Var);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!j8Var.b(this.d.c(), 0, 2, true)) {
                    break;
                }
                this.d.f(0);
                if (!k0.a(this.d.C())) {
                    break;
                }
                if (!j8Var.b(this.d.c(), 0, 4, true)) {
                    break;
                }
                this.e.c(14);
                iA = this.e.a(13);
                if (iA <= 6) {
                    this.j = true;
                    throw ah.a("Malformed ADTS stream", null);
                }
                j += iA;
                i2++;
                if (i2 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (j8Var.a(iA - 6, true));
        i = i2;
        j8Var.b();
        if (i > 0) {
            this.i = (int) (j / i);
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    private static int a(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    private void b(long j, boolean z) {
        if (this.l) {
            return;
        }
        boolean z2 = (this.f549a & 1) != 0 && this.i > 0;
        if (z2 && this.b.d() == -9223372036854775807L && !z) {
            return;
        }
        if (z2 && this.b.d() != -9223372036854775807L) {
            this.f.a(a(j, (this.f549a & 2) != 0));
        } else {
            this.f.a(new ej.b(-9223372036854775807L));
        }
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new j0()};
    }

    private ej a(long j, boolean z) {
        return new n4(j, this.h, a(this.i, this.b.d()), this.i, z);
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f = k8Var;
        this.b.a(k8Var, new ep.d(0, 1));
        k8Var.c();
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        a1.b(this.f);
        long jA = j8Var.a();
        int i = this.f549a;
        if ((i & 2) != 0 || ((i & 1) != 0 && jA != -1)) {
            b(j8Var);
        }
        int iA = j8Var.a(this.c.c(), 0, 2048);
        boolean z = iA == -1;
        b(jA, z);
        if (z) {
            return -1;
        }
        this.c.f(0);
        this.c.e(iA);
        if (!this.k) {
            this.b.a(this.g, 4);
            this.k = true;
        }
        this.b.a(this.c);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        this.k = false;
        this.b.a();
        this.g = j2;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        int iC = c(j8Var);
        int i = iC;
        int i2 = 0;
        int i3 = 0;
        do {
            j8Var.c(this.d.c(), 0, 2);
            this.d.f(0);
            if (k0.a(this.d.C())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                j8Var.c(this.d.c(), 0, 4);
                this.e.c(14);
                int iA = this.e.a(13);
                if (iA <= 6) {
                    i++;
                    j8Var.b();
                    j8Var.c(i);
                } else {
                    j8Var.c(iA - 6);
                    i3 += iA;
                }
            } else {
                i++;
                j8Var.b();
                j8Var.c(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iC < 8192);
        return false;
    }
}
