package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.wl;
import java.util.Collections;

/* loaded from: classes.dex */
final class r1 extends wl {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public r1(ro roVar) {
        super(roVar);
    }

    @Override // com.applovin.impl.wl
    protected boolean a(yg ygVar) throws wl.a {
        if (!this.b) {
            int iW = ygVar.w();
            int i = (iW >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.f1136a.a(new d9.b().f("audio/mpeg").c(1).n(e[(iW >> 2) & 3]).a());
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.f1136a.a(new d9.b().f(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).n(8000).a());
                this.c = true;
            } else if (i != 10) {
                throw new wl.a("Audio format not supported: " + this.d);
            }
            this.b = true;
        } else {
            ygVar.g(1);
        }
        return true;
    }

    @Override // com.applovin.impl.wl
    protected boolean b(yg ygVar, long j) {
        if (this.d == 2) {
            int iA = ygVar.a();
            this.f1136a.a(ygVar, iA);
            this.f1136a.a(j, 1, iA, 0, null);
            return true;
        }
        int iW = ygVar.w();
        if (iW == 0 && !this.c) {
            int iA2 = ygVar.a();
            byte[] bArr = new byte[iA2];
            ygVar.a(bArr, 0, iA2);
            a.b bVarA = a.a(bArr);
            this.f1136a.a(new d9.b().f("audio/mp4a-latm").a(bVarA.c).c(bVarA.b).n(bVarA.f233a).a(Collections.singletonList(bArr)).a());
            this.c = true;
            return false;
        }
        if (this.d == 10 && iW != 1) {
            return false;
        }
        int iA3 = ygVar.a();
        this.f1136a.a(ygVar, iA3);
        this.f1136a.a(j, 1, iA3, 0, null);
        return true;
    }
}
