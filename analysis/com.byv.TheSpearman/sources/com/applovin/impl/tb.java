package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.we;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class tb implements i8 {
    private k8 b;
    private int c;
    private int d;
    private int e;
    private Cif g;
    private j8 h;
    private al i;
    private kf j;

    /* renamed from: a, reason: collision with root package name */
    private final yg f1026a = new yg(6);
    private long f = -1;

    private int c(j8 j8Var) {
        this.f1026a.d(2);
        j8Var.c(this.f1026a.c(), 0, 2);
        return this.f1026a.C();
    }

    private void b(j8 j8Var) {
        this.f1026a.d(2);
        j8Var.c(this.f1026a.c(), 0, 2);
        j8Var.c(this.f1026a.C() - 2);
    }

    private void d(j8 j8Var) {
        this.f1026a.d(2);
        j8Var.d(this.f1026a.c(), 0, 2);
        int iC = this.f1026a.C();
        this.d = iC;
        if (iC == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((iC < 65488 || iC > 65497) && iC != 65281) {
            this.c = 1;
        }
    }

    private void f(j8 j8Var) {
        this.f1026a.d(2);
        j8Var.d(this.f1026a.c(), 0, 2);
        this.e = this.f1026a.C() - 2;
        this.c = 2;
    }

    private void e(j8 j8Var) {
        String strT;
        if (this.d == 65505) {
            yg ygVar = new yg(this.e);
            j8Var.d(ygVar.c(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(ygVar.t()) && (strT = ygVar.t()) != null) {
                Cif cifA = a(strT, j8Var.a());
                this.g = cifA;
                if (cifA != null) {
                    this.f = cifA.d;
                }
            }
        } else {
            j8Var.a(this.e);
        }
        this.c = 0;
    }

    private void g(j8 j8Var) {
        if (!j8Var.b(this.f1026a.c(), 0, 1, true)) {
            b();
            return;
        }
        j8Var.b();
        if (this.j == null) {
            this.j = new kf();
        }
        al alVar = new al(j8Var, this.f);
        this.i = alVar;
        if (this.j.a(alVar)) {
            this.j.a(new bl(this.f, (k8) a1.a(this.b)));
            c();
        } else {
            b();
        }
    }

    private static Cif a(String str, long j) {
        hf hfVarA;
        if (j == -1 || (hfVarA = is.a(str)) == null) {
            return null;
        }
        return hfVarA.a(j);
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.b = k8Var;
    }

    private void c() {
        a((we.b) a1.a(this.g));
        this.c = 5;
    }

    private void b() {
        a(new we.b[0]);
        ((k8) a1.a(this.b)).c();
        this.b.a(new ej.b(-9223372036854775807L));
        this.c = 6;
    }

    private void a(we.b... bVarArr) {
        ((k8) a1.a(this.b)).a(1024, 4).a(new d9.b().b(MimeTypes.IMAGE_JPEG).a(new we(bVarArr)).a());
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int i = this.c;
        if (i == 0) {
            d(j8Var);
            return 0;
        }
        if (i == 1) {
            f(j8Var);
            return 0;
        }
        if (i == 2) {
            e(j8Var);
            return 0;
        }
        if (i == 4) {
            long jF = j8Var.f();
            long j = this.f;
            if (jF != j) {
                qhVar.f835a = j;
                return 1;
            }
            g(j8Var);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.i == null || j8Var != this.h) {
            this.h = j8Var;
            this.i = new al(j8Var, this.f);
        }
        int iA = ((kf) a1.a(this.j)).a(this.i, qhVar);
        if (iA == 1) {
            qhVar.f835a += this.f;
        }
        return iA;
    }

    @Override // com.applovin.impl.i8
    public void a() {
        kf kfVar = this.j;
        if (kfVar != null) {
            kfVar.a();
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((kf) a1.a(this.j)).a(j, j2);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        if (c(j8Var) != 65496) {
            return false;
        }
        int iC = c(j8Var);
        this.d = iC;
        if (iC == 65504) {
            b(j8Var);
            this.d = c(j8Var);
        }
        if (this.d != 65505) {
            return false;
        }
        j8Var.c(2);
        this.f1026a.d(6);
        j8Var.c(this.f1026a.c(), 0, 6);
        return this.f1026a.y() == 1165519206 && this.f1026a.C() == 0;
    }
}
