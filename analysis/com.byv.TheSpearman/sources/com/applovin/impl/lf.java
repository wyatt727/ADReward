package com.applovin.impl;

import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class lf extends bk {
    private final yg o;

    public lf() {
        super("Mp4WebvttDecoder");
        this.o = new yg();
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) throws ml {
        this.o.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.o.a() > 0) {
            if (this.o.a() >= 8) {
                int iJ = this.o.j();
                if (this.o.j() == 1987343459) {
                    arrayList.add(a(this.o, iJ - 8));
                } else {
                    this.o.g(iJ - 8);
                }
            } else {
                throw new ml("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new mf(arrayList);
    }

    private static z4 a(yg ygVar, int i) throws ml {
        CharSequence charSequenceA = null;
        z4.b bVarC = null;
        while (i > 0) {
            if (i >= 8) {
                int iJ = ygVar.j();
                int iJ2 = ygVar.j();
                int i2 = iJ - 8;
                String strA = yp.a(ygVar.c(), ygVar.d(), i2);
                ygVar.g(i2);
                i = (i - 8) - i2;
                if (iJ2 == 1937011815) {
                    bVarC = yr.c(strA);
                } else if (iJ2 == 1885436268) {
                    charSequenceA = yr.a((String) null, strA.trim(), Collections.emptyList());
                }
            } else {
                throw new ml("Incomplete vtt cue box header found.");
            }
        }
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        if (bVarC != null) {
            return bVarC.a(charSequenceA).a();
        }
        return yr.a(charSequenceA);
    }
}
