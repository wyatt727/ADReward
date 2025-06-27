package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.d9;
import com.applovin.impl.hj;
import com.applovin.impl.of;
import com.applovin.impl.ta;
import com.applovin.impl.we;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class jf implements i8 {
    public static final m8 u = new m8() { // from class: com.applovin.impl.jf$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return jf.d();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };
    private static final ta.a v = new ta.a() { // from class: com.applovin.impl.jf$$ExternalSyntheticLambda1
        @Override // com.applovin.impl.ta.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return jf.a(i, i2, i3, i4, i5);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f571a;
    private final long b;
    private final yg c;
    private final of.a d;
    private final x9 e;
    private final va f;
    private final ro g;
    private k8 h;
    private ro i;
    private ro j;
    private int k;
    private we l;
    private long m;
    private long n;
    private long o;
    private int p;
    private hj q;
    private boolean r;
    private boolean s;
    private long t;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    private static boolean a(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public jf() {
        this(0);
    }

    public void c() {
        this.r = true;
    }

    private int e(j8 j8Var) throws ah {
        if (this.k == 0) {
            try {
                b(j8Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.q == null) {
            hj hjVarB = b(j8Var);
            this.q = hjVarB;
            this.h.a(hjVarB);
            this.j.a(new d9.b().f(this.d.b).i(4096).c(this.d.e).n(this.d.d).e(this.e.f1163a).f(this.e.b).a((this.f571a & 8) != 0 ? null : this.l).a());
            this.o = j8Var.f();
        } else if (this.o != 0) {
            long jF = j8Var.f();
            long j = this.o;
            if (jF < j) {
                j8Var.a((int) (j - jF));
            }
        }
        return f(j8Var);
    }

    private int f(j8 j8Var) {
        if (this.p == 0) {
            j8Var.b();
            if (d(j8Var)) {
                return -1;
            }
            this.c.f(0);
            int iJ = this.c.j();
            if (a(iJ, this.k) && of.b(iJ) != -1) {
                this.d.a(iJ);
                if (this.m == -9223372036854775807L) {
                    this.m = this.q.a(j8Var.f());
                    if (this.b != -9223372036854775807L) {
                        this.m += this.b - this.q.a(0L);
                    }
                }
                this.p = this.d.c;
                hj hjVar = this.q;
                if (hjVar instanceof jb) {
                    jb jbVar = (jb) hjVar;
                    jbVar.a(a(this.n + r0.g), j8Var.f() + this.d.c);
                    if (this.s && jbVar.c(this.t)) {
                        this.s = false;
                        this.j = this.i;
                    }
                }
            } else {
                j8Var.a(1);
                this.k = 0;
                return 0;
            }
        }
        int iA = this.j.a((e5) j8Var, this.p, true);
        if (iA == -1) {
            return -1;
        }
        int i = this.p - iA;
        this.p = i;
        if (i > 0) {
            return 0;
        }
        this.j.a(a(this.n), 1, this.d.c, 0, null);
        this.n += this.d.g;
        this.p = 0;
        return 0;
    }

    public jf(int i) {
        this(i, -9223372036854775807L);
    }

    private long a(long j) {
        return this.m + ((j * 1000000) / this.d.d);
    }

    private boolean d(j8 j8Var) {
        hj hjVar = this.q;
        if (hjVar != null) {
            long jC = hjVar.c();
            if (jC != -1 && j8Var.d() > jC - 4) {
                return true;
            }
        }
        try {
            return !j8Var.b(this.c.c(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] d() {
        return new i8[]{new jf()};
    }

    public jf(int i, long j) {
        this.f571a = (i & 2) != 0 ? i | 1 : i;
        this.b = j;
        this.c = new yg(10);
        this.d = new of.a();
        this.e = new x9();
        this.m = -9223372036854775807L;
        this.f = new va();
        g7 g7Var = new g7();
        this.g = g7Var;
        this.j = g7Var;
    }

    private void b() {
        a1.b(this.i);
        yp.a(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.applovin.impl.hj c(com.applovin.impl.j8 r11) {
        /*
            r10 = this;
            com.applovin.impl.yg r5 = new com.applovin.impl.yg
            com.applovin.impl.of$a r0 = r10.d
            int r0 = r0.c
            r5.<init>(r0)
            byte[] r0 = r5.c()
            com.applovin.impl.of$a r1 = r10.d
            int r1 = r1.c
            r6 = 0
            r11.c(r0, r6, r1)
            com.applovin.impl.of$a r0 = r10.d
            int r1 = r0.f758a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L24
            int r0 = r0.e
            if (r0 == r2) goto L28
            r0 = 36
            goto L2d
        L24:
            int r0 = r0.e
            if (r0 == r2) goto L2b
        L28:
            r0 = 21
            goto L2d
        L2b:
            r0 = 13
        L2d:
            r7 = r0
            int r8 = a(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L5d
            if (r8 != r9) goto L3d
            goto L5d
        L3d:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L58
            long r0 = r11.a()
            long r2 = r11.f()
            com.applovin.impl.of$a r4 = r10.d
            com.applovin.impl.qq r0 = com.applovin.impl.qq.a(r0, r2, r4, r5)
            com.applovin.impl.of$a r1 = r10.d
            int r1 = r1.c
            r11.a(r1)
            goto Lad
        L58:
            r0 = 0
            r11.b()
            goto Lad
        L5d:
            long r0 = r11.a()
            long r2 = r11.f()
            com.applovin.impl.of$a r4 = r10.d
            com.applovin.impl.es r0 = com.applovin.impl.es.a(r0, r2, r4, r5)
            if (r0 == 0) goto L97
            com.applovin.impl.x9 r1 = r10.e
            boolean r1 = r1.a()
            if (r1 != 0) goto L97
            r11.b()
            int r7 = r7 + 141
            r11.c(r7)
            com.applovin.impl.yg r1 = r10.c
            byte[] r1 = r1.c()
            r2 = 3
            r11.c(r1, r6, r2)
            com.applovin.impl.yg r1 = r10.c
            r1.f(r6)
            com.applovin.impl.x9 r1 = r10.e
            com.applovin.impl.yg r2 = r10.c
            int r2 = r2.z()
            r1.a(r2)
        L97:
            com.applovin.impl.of$a r1 = r10.d
            int r1 = r1.c
            r11.a(r1)
            if (r0 == 0) goto Lad
            boolean r1 = r0.b()
            if (r1 != 0) goto Lad
            if (r8 != r9) goto Lad
            com.applovin.impl.hj r11 = r10.a(r11, r6)
            return r11
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.jf.c(com.applovin.impl.j8):com.applovin.impl.hj");
    }

    private hj a(j8 j8Var, boolean z) {
        j8Var.c(this.c.c(), 0, 4);
        this.c.f(0);
        this.d.a(this.c.j());
        return new o4(j8Var.a(), j8Var.f(), this.d, z);
    }

    private hj b(j8 j8Var) {
        long jA;
        long j;
        long jD;
        long jC;
        hj hjVarC = c(j8Var);
        ff ffVarA = a(this.l, j8Var.f());
        if (this.r) {
            return new hj.a();
        }
        if ((this.f571a & 4) != 0) {
            if (ffVarA != null) {
                jD = ffVarA.d();
                jC = ffVarA.c();
            } else if (hjVarC != null) {
                jD = hjVarC.d();
                jC = hjVarC.c();
            } else {
                jA = a(this.l);
                j = -1;
                hjVarC = new jb(jA, j8Var.f(), j);
            }
            j = jC;
            jA = jD;
            hjVarC = new jb(jA, j8Var.f(), j);
        } else if (ffVarA != null) {
            hjVarC = ffVarA;
        } else if (hjVarC == null) {
            hjVarC = null;
        }
        if (hjVarC == null || !(hjVarC.b() || (this.f571a & 1) == 0)) {
            return a(j8Var, (this.f571a & 2) != 0);
        }
        return hjVarC;
    }

    private boolean b(j8 j8Var, boolean z) throws EOFException, ah {
        int iD;
        int i;
        int iB;
        int i2 = z ? 32768 : 131072;
        j8Var.b();
        if (j8Var.f() == 0) {
            we weVarA = this.f.a(j8Var, (this.f571a & 8) == 0 ? null : v);
            this.l = weVarA;
            if (weVarA != null) {
                this.e.a(weVarA);
            }
            iD = (int) j8Var.d();
            if (!z) {
                j8Var.a(iD);
            }
            i = 0;
        } else {
            iD = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!d(j8Var)) {
                this.c.f(0);
                int iJ = this.c.j();
                if ((i == 0 || a(iJ, i)) && (iB = of.b(iJ)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(iJ);
                        i = iJ;
                    }
                    j8Var.c(iB - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ah.a("Searched too many bytes.", null);
                    }
                    if (z) {
                        j8Var.b();
                        j8Var.c(iD + i5);
                    } else {
                        j8Var.a(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            j8Var.a(iD + i4);
        } else {
            j8Var.b();
        }
        this.k = i;
        return true;
    }

    private static long a(we weVar) {
        if (weVar == null) {
            return -9223372036854775807L;
        }
        int iC = weVar.c();
        for (int i = 0; i < iC; i++) {
            we.b bVarA = weVar.a(i);
            if (bVarA instanceof ao) {
                ao aoVar = (ao) bVarA;
                if (aoVar.f1060a.equals("TLEN")) {
                    return r2.a(Long.parseLong(aoVar.c));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int a(yg ygVar, int i) {
        if (ygVar.e() >= i + 4) {
            ygVar.f(i);
            int iJ = ygVar.j();
            if (iJ == 1483304551 || iJ == 1231971951) {
                return iJ;
            }
        }
        if (ygVar.e() < 40) {
            return 0;
        }
        ygVar.f(36);
        return ygVar.j() == 1447187017 ? 1447187017 : 0;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.h = k8Var;
        ro roVarA = k8Var.a(0, 1);
        this.i = roVarA;
        this.j = roVarA;
        this.h.c();
    }

    private static ff a(we weVar, long j) {
        if (weVar == null) {
            return null;
        }
        int iC = weVar.c();
        for (int i = 0; i < iC; i++) {
            we.b bVarA = weVar.a(i);
            if (bVarA instanceof ef) {
                return ff.a(j, (ef) bVarA, a(weVar));
            }
        }
        return null;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        b();
        int iE = e(j8Var);
        if (iE == -1 && (this.q instanceof jb)) {
            long jA = a(this.n);
            if (this.q.d() != jA) {
                ((jb) this.q).d(jA);
                this.h.a(this.q);
            }
        }
        return iE;
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        hj hjVar = this.q;
        if (!(hjVar instanceof jb) || ((jb) hjVar).c(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return b(j8Var, true);
    }
}
