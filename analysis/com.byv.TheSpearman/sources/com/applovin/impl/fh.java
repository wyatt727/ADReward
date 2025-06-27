package com.applovin.impl;

import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class fh implements ep {

    /* renamed from: a, reason: collision with root package name */
    private final o7 f431a;
    private final xg b = new xg(new byte[10]);
    private int c = 0;
    private int d;
    private io e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public fh(o7 o7Var) {
        this.f431a = o7Var;
    }

    @Override // com.applovin.impl.ep
    public final void a(yg ygVar, int i) {
        a1.b(this.e);
        if ((i & 1) != 0) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    kc.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        kc.d("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.f431a.b();
                }
            }
            a(1);
        }
        while (ygVar.a() > 0) {
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (a(ygVar, this.b.f1169a, Math.min(10, this.i)) && a(ygVar, (byte[]) null, this.i)) {
                            c();
                            i |= this.k ? 4 : 0;
                            this.f431a.a(this.l, i);
                            a(3);
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = ygVar.a();
                        int i4 = this.j;
                        int i5 = i4 != -1 ? iA - i4 : 0;
                        if (i5 > 0) {
                            iA -= i5;
                            ygVar.e(ygVar.d() + iA);
                        }
                        this.f431a.a(ygVar);
                        int i6 = this.j;
                        if (i6 != -1) {
                            int i7 = i6 - iA;
                            this.j = i7;
                            if (i7 == 0) {
                                this.f431a.b();
                                a(1);
                            }
                        }
                    }
                } else if (a(ygVar, this.b.f1169a, 9)) {
                    a(b() ? 2 : 0);
                }
            } else {
                ygVar.g(ygVar.a());
            }
        }
    }

    private boolean b() {
        this.b.c(0);
        int iA = this.b.a(24);
        if (iA != 1) {
            kc.d("PesReader", "Unexpected start code prefix: " + iA);
            this.j = -1;
            return false;
        }
        this.b.d(8);
        int iA2 = this.b.a(16);
        this.b.d(5);
        this.k = this.b.f();
        this.b.d(2);
        this.f = this.b.f();
        this.g = this.b.f();
        this.b.d(6);
        int iA3 = this.b.a(8);
        this.i = iA3;
        if (iA2 == 0) {
            this.j = -1;
        } else {
            int i = (iA2 - 3) - iA3;
            this.j = i;
            if (i < 0) {
                kc.d("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.b.c(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.d(4);
            this.b.d(1);
            this.b.d(1);
            long jA = (this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15);
            this.b.d(1);
            if (!this.h && this.g) {
                this.b.d(4);
                this.b.d(1);
                this.b.d(1);
                this.b.d(1);
                this.e.b((this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15));
                this.h = true;
            }
            this.l = this.e.b(jA);
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i) {
        int iMin = Math.min(ygVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            ygVar.g(iMin);
        } else {
            ygVar.a(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.ep
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.e = ioVar;
        this.f431a.a(k8Var, dVar);
    }

    @Override // com.applovin.impl.ep
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f431a.a();
    }

    private void a(int i) {
        this.c = i;
        this.d = 0;
    }
}
