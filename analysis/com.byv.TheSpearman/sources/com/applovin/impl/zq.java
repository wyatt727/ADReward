package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.wl;

/* loaded from: classes.dex */
final class zq extends wl {
    private final yg b;
    private final yg c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public zq(ro roVar) {
        super(roVar);
        this.b = new yg(uf.f1064a);
        this.c = new yg(4);
    }

    @Override // com.applovin.impl.wl
    protected boolean a(yg ygVar) throws wl.a {
        int iW = ygVar.w();
        int i = (iW >> 4) & 15;
        int i2 = iW & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new wl.a("Video format not supported: " + i2);
    }

    @Override // com.applovin.impl.wl
    protected boolean b(yg ygVar, long j) throws ah {
        int iW = ygVar.w();
        long jK = j + (ygVar.k() * 1000);
        if (iW == 0 && !this.e) {
            yg ygVar2 = new yg(new byte[ygVar.a()]);
            ygVar.a(ygVar2.c(), 0, ygVar.a());
            v1 v1VarB = v1.b(ygVar2);
            this.d = v1VarB.b;
            this.f1136a.a(new d9.b().f("video/avc").a(v1VarB.f).q(v1VarB.c).g(v1VarB.d).b(v1VarB.e).a(v1VarB.f1078a).a());
            this.e = true;
            return false;
        }
        if (iW != 1 || !this.e) {
            return false;
        }
        int i = this.g == 1 ? 1 : 0;
        if (!this.f && i == 0) {
            return false;
        }
        byte[] bArrC = this.c.c();
        bArrC[0] = 0;
        bArrC[1] = 0;
        bArrC[2] = 0;
        int i2 = 4 - this.d;
        int i3 = 0;
        while (ygVar.a() > 0) {
            ygVar.a(this.c.c(), i2, this.d);
            this.c.f(0);
            int iA = this.c.A();
            this.b.f(0);
            this.f1136a.a(this.b, 4);
            this.f1136a.a(ygVar, iA);
            i3 = i3 + 4 + iA;
        }
        this.f1136a.a(jK, i, i3, 0, null);
        this.f = true;
        return true;
    }
}
