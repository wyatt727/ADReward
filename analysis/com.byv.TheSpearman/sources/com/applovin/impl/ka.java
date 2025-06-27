package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    public final List f593a;
    public final int b;
    public final String c;

    public static ka a(yg ygVar) throws ah {
        try {
            ygVar.g(21);
            int iW = ygVar.w() & 3;
            int iW2 = ygVar.w();
            int iD = ygVar.d();
            int i = 0;
            for (int i2 = 0; i2 < iW2; i2++) {
                ygVar.g(1);
                int iC = ygVar.C();
                for (int i3 = 0; i3 < iC; i3++) {
                    int iC2 = ygVar.C();
                    i += iC2 + 4;
                    ygVar.g(iC2);
                }
            }
            ygVar.f(iD);
            byte[] bArr = new byte[i];
            int i4 = 0;
            String strA = null;
            for (int i5 = 0; i5 < iW2; i5++) {
                int iW3 = ygVar.w() & 127;
                int iC3 = ygVar.C();
                for (int i6 = 0; i6 < iC3; i6++) {
                    int iC4 = ygVar.C();
                    byte[] bArr2 = uf.f1064a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(ygVar.c(), ygVar.d(), bArr, length, iC4);
                    if (iW3 == 33 && i6 == 0) {
                        strA = m3.a(new zg(bArr, length, length + iC4));
                    }
                    i4 = length + iC4;
                    ygVar.g(iC4);
                }
            }
            return new ka(i == 0 ? null : Collections.singletonList(bArr), iW + 1, strA);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ah.a("Error parsing HEVC config", e);
        }
    }

    private ka(List list, int i, String str) {
        this.f593a = list;
        this.b = i;
        this.c = str;
    }
}
