package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.ej;
import com.applovin.impl.u8;
import com.applovin.impl.v8;
import java.util.Map;

/* loaded from: classes.dex */
public final class t8 implements i8 {
    public static final m8 o = new m8() { // from class: com.applovin.impl.t8$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return t8.b();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1017a;
    private final yg b;
    private final boolean c;
    private final u8.a d;
    private k8 e;
    private ro f;
    private int g;
    private we h;
    private y8 i;
    private int j;
    private int k;
    private s8 l;
    private int m;
    private long n;

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public t8() {
        this(0);
    }

    private void d(j8 j8Var) {
        this.h = v8.b(j8Var, !this.c);
        this.g = 1;
    }

    private void c(j8 j8Var) {
        byte[] bArr = this.f1017a;
        j8Var.c(bArr, 0, bArr.length);
        j8Var.b();
        this.g = 2;
    }

    private void f(j8 j8Var) throws ah {
        v8.d(j8Var);
        this.g = 3;
    }

    private void e(j8 j8Var) {
        v8.a aVar = new v8.a(this.i);
        boolean zA = false;
        while (!zA) {
            zA = v8.a(j8Var, aVar);
            this.i = (y8) yp.a(aVar.f1087a);
        }
        a1.a(this.i);
        this.j = Math.max(this.i.c, 6);
        ((ro) yp.a(this.f)).a(this.i.a(this.f1017a, this.h));
        this.g = 4;
    }

    private void b(j8 j8Var) {
        this.k = v8.b(j8Var);
        ((k8) yp.a(this.e)).a(b(j8Var.f(), j8Var.a()));
        this.g = 5;
    }

    public t8(int i) {
        this.f1017a = new byte[42];
        this.b = new yg(new byte[32768], 0);
        this.c = (i & 1) != 0;
        this.d = new u8.a();
        this.g = 0;
    }

    private long a(yg ygVar, boolean z) {
        boolean zA;
        a1.a(this.i);
        int iD = ygVar.d();
        while (iD <= ygVar.e() - 16) {
            ygVar.f(iD);
            if (u8.a(ygVar, this.i, this.k, this.d)) {
                ygVar.f(iD);
                return this.d.f1059a;
            }
            iD++;
        }
        if (z) {
            while (iD <= ygVar.e() - this.j) {
                ygVar.f(iD);
                try {
                    zA = u8.a(ygVar, this.i, this.k, this.d);
                } catch (IndexOutOfBoundsException unused) {
                    zA = false;
                }
                if (ygVar.d() <= ygVar.e() && zA) {
                    ygVar.f(iD);
                    return this.d.f1059a;
                }
                iD++;
            }
            ygVar.f(ygVar.e());
            return -1L;
        }
        ygVar.f(iD);
        return -1L;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.e = k8Var;
        this.f = k8Var.a(0, 1);
        k8Var.c();
    }

    private ej b(long j, long j2) {
        a1.a(this.i);
        y8 y8Var = this.i;
        if (y8Var.k != null) {
            return new x8(y8Var, j);
        }
        if (j2 != -1 && y8Var.j > 0) {
            s8 s8Var = new s8(y8Var, this.k, j, j2);
            this.l = s8Var;
            return s8Var.a();
        }
        return new ej.b(y8Var.b());
    }

    private void c() {
        ((ro) yp.a(this.f)).a((this.n * 1000000) / ((y8) yp.a(this.i)).e, 1, this.m, 0, null);
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        int i = this.g;
        if (i == 0) {
            d(j8Var);
            return 0;
        }
        if (i == 1) {
            c(j8Var);
            return 0;
        }
        if (i == 2) {
            f(j8Var);
            return 0;
        }
        if (i == 3) {
            e(j8Var);
            return 0;
        }
        if (i == 4) {
            b(j8Var);
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        return b(j8Var, qhVar);
    }

    private int b(j8 j8Var, qh qhVar) {
        boolean z;
        a1.a(this.f);
        a1.a(this.i);
        s8 s8Var = this.l;
        if (s8Var != null && s8Var.b()) {
            return this.l.a(j8Var, qhVar);
        }
        if (this.n == -1) {
            this.n = u8.a(j8Var, this.i);
            return 0;
        }
        int iE = this.b.e();
        if (iE < 32768) {
            int iA = j8Var.a(this.b.c(), iE, 32768 - iE);
            z = iA == -1;
            if (!z) {
                this.b.e(iE + iA);
            } else if (this.b.a() == 0) {
                c();
                return -1;
            }
        } else {
            z = false;
        }
        int iD = this.b.d();
        int i = this.m;
        int i2 = this.j;
        if (i < i2) {
            yg ygVar = this.b;
            ygVar.g(Math.min(i2 - i, ygVar.a()));
        }
        long jA = a(this.b, z);
        int iD2 = this.b.d() - iD;
        this.b.f(iD);
        this.f.a(this.b, iD2);
        this.m += iD2;
        if (jA != -1) {
            c();
            this.m = 0;
            this.n = jA;
        }
        if (this.b.a() < 16) {
            int iA2 = this.b.a();
            System.arraycopy(this.b.c(), this.b.d(), this.b.c(), 0, iA2);
            this.b.f(0);
            this.b.e(iA2);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new t8()};
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            s8 s8Var = this.l;
            if (s8Var != null) {
                s8Var.b(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.d(0);
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        v8.a(j8Var, false);
        return v8.a(j8Var);
    }
}
