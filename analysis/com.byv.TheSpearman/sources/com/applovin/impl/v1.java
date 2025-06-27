package com.applovin.impl;

import com.applovin.impl.uf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f1078a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public static v1 b(yg ygVar) throws ah {
        float f;
        String strA;
        int i;
        try {
            ygVar.g(4);
            int iW = (ygVar.w() & 3) + 1;
            if (iW != 3) {
                ArrayList arrayList = new ArrayList();
                int iW2 = ygVar.w() & 31;
                for (int i2 = 0; i2 < iW2; i2++) {
                    arrayList.add(a(ygVar));
                }
                int iW3 = ygVar.w();
                for (int i3 = 0; i3 < iW3; i3++) {
                    arrayList.add(a(ygVar));
                }
                int i4 = -1;
                if (iW2 > 0) {
                    uf.b bVarC = uf.c((byte[]) arrayList.get(0), iW, ((byte[]) arrayList.get(0)).length);
                    int i5 = bVarC.e;
                    int i6 = bVarC.f;
                    float f2 = bVarC.g;
                    strA = m3.a(bVarC.f1066a, bVarC.b, bVarC.c);
                    i4 = i5;
                    i = i6;
                    f = f2;
                } else {
                    f = 1.0f;
                    strA = null;
                    i = -1;
                }
                return new v1(arrayList, iW, i4, i, f, strA);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ah.a("Error parsing AVC config", e);
        }
    }

    private v1(List list, int i, int i2, int i3, float f, String str) {
        this.f1078a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    private static byte[] a(yg ygVar) {
        int iC = ygVar.C();
        int iD = ygVar.d();
        ygVar.g(iC);
        return m3.a(ygVar.c(), iD, iC);
    }
}
