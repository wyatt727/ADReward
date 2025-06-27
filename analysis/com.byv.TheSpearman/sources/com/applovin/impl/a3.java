package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class a3 {
    public static void a(long j, yg ygVar, ro[] roVarArr) {
        while (true) {
            if (ygVar.a() <= 1) {
                return;
            }
            int iA = a(ygVar);
            int iA2 = a(ygVar);
            int iD = ygVar.d() + iA2;
            if (iA2 == -1 || iA2 > ygVar.a()) {
                kc.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iD = ygVar.e();
            } else if (iA == 4 && iA2 >= 8) {
                int iW = ygVar.w();
                int iC = ygVar.C();
                int iJ = iC == 49 ? ygVar.j() : 0;
                int iW2 = ygVar.w();
                if (iC == 47) {
                    ygVar.g(1);
                }
                boolean z = iW == 181 && (iC == 49 || iC == 47) && iW2 == 3;
                if (iC == 49) {
                    z &= iJ == 1195456820;
                }
                if (z) {
                    b(j, ygVar, roVarArr);
                }
            }
            ygVar.f(iD);
        }
    }

    public static void b(long j, yg ygVar, ro[] roVarArr) {
        int iW = ygVar.w();
        if ((iW & 64) != 0) {
            ygVar.g(1);
            int i = (iW & 31) * 3;
            int iD = ygVar.d();
            for (ro roVar : roVarArr) {
                ygVar.f(iD);
                roVar.a(ygVar, i);
                if (j != -9223372036854775807L) {
                    roVar.a(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int a(yg ygVar) {
        int i = 0;
        while (ygVar.a() != 0) {
            int iW = ygVar.w();
            i += iW;
            if (iW != 255) {
                return i;
            }
        }
        return -1;
    }
}
