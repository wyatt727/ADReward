package com.applovin.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zr extends bk {
    private final yg o;
    private final vr p;

    public zr() {
        super("WebvttDecoder");
        this.o = new yg();
        this.p = new vr();
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) throws ml {
        xr xrVarA;
        this.o.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            as.b(this.o);
            while (!TextUtils.isEmpty(this.o.l())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iA = a(this.o);
                if (iA == 0) {
                    return new bs(arrayList2);
                }
                if (iA == 1) {
                    b(this.o);
                } else if (iA == 2) {
                    if (arrayList2.isEmpty()) {
                        this.o.l();
                        arrayList.addAll(this.p.c(this.o));
                    } else {
                        throw new ml("A style block was found after the first cue.");
                    }
                } else if (iA == 3 && (xrVarA = yr.a(this.o, arrayList)) != null) {
                    arrayList2.add(xrVarA);
                }
            }
        } catch (ah e) {
            throw new ml(e);
        }
    }

    private static void b(yg ygVar) {
        while (!TextUtils.isEmpty(ygVar.l())) {
        }
    }

    private static int a(yg ygVar) {
        int iD = 0;
        int i = -1;
        while (i == -1) {
            iD = ygVar.d();
            String strL = ygVar.l();
            if (strL == null) {
                i = 0;
            } else if ("STYLE".equals(strL)) {
                i = 2;
            } else {
                i = strL.startsWith("NOTE") ? 1 : 3;
            }
        }
        ygVar.f(iD);
        return i;
    }
}
