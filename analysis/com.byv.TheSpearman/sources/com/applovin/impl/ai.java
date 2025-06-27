package com.applovin.impl;

import com.applovin.impl.zh;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
abstract class ai {
    private static int a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean a(yg ygVar) {
        ygVar.g(4);
        int iJ = ygVar.j();
        ygVar.f(0);
        return iJ == 1886547818;
    }

    public static zh a(byte[] bArr, int i) {
        ArrayList arrayListD;
        yg ygVar = new yg(bArr);
        try {
            arrayListD = a(ygVar) ? d(ygVar) : c(ygVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListD = null;
        }
        if (arrayListD == null) {
            return null;
        }
        int size = arrayListD.size();
        if (size == 1) {
            return new zh((zh.a) arrayListD.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new zh((zh.a) arrayListD.get(0), (zh.a) arrayListD.get(1), i);
    }

    private static ArrayList d(yg ygVar) {
        int iJ;
        ygVar.g(8);
        int iD = ygVar.d();
        int iE = ygVar.e();
        while (iD < iE && (iJ = ygVar.j() + iD) > iD && iJ <= iE) {
            int iJ2 = ygVar.j();
            if (iJ2 != 2037673328 && iJ2 != 1836279920) {
                ygVar.f(iJ);
                iD = iJ;
            } else {
                ygVar.e(iJ);
                return c(ygVar);
            }
        }
        return null;
    }

    private static ArrayList c(yg ygVar) {
        if (ygVar.w() != 0) {
            return null;
        }
        ygVar.g(7);
        int iJ = ygVar.j();
        if (iJ == 1684433976) {
            yg ygVar2 = new yg();
            Inflater inflater = new Inflater(true);
            try {
                if (!yp.a(ygVar, ygVar2, inflater)) {
                    return null;
                }
                inflater.end();
                ygVar = ygVar2;
            } finally {
                inflater.end();
            }
        } else if (iJ != 1918990112) {
            return null;
        }
        return e(ygVar);
    }

    private static ArrayList e(yg ygVar) {
        ArrayList arrayList = new ArrayList();
        int iD = ygVar.d();
        int iE = ygVar.e();
        while (iD < iE) {
            int iJ = ygVar.j() + iD;
            if (iJ <= iD || iJ > iE) {
                return null;
            }
            if (ygVar.j() == 1835365224) {
                zh.a aVarB = b(ygVar);
                if (aVarB == null) {
                    return null;
                }
                arrayList.add(aVarB);
            }
            ygVar.f(iJ);
            iD = iJ;
        }
        return arrayList;
    }

    private static zh.a b(yg ygVar) {
        int iJ = ygVar.j();
        if (iJ > 10000) {
            return null;
        }
        float[] fArr = new float[iJ];
        for (int i = 0; i < iJ; i++) {
            fArr[i] = ygVar.i();
        }
        int iJ2 = ygVar.j();
        if (iJ2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(iJ * 2.0d) / dLog);
        xg xgVar = new xg(ygVar.c());
        int i2 = 8;
        xgVar.c(ygVar.d() * 8);
        float[] fArr2 = new float[iJ2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < iJ2) {
            int i6 = 0;
            while (i6 < i3) {
                int iA = iArr[i6] + a(xgVar.a(iCeil));
                if (iA >= iJ || iA < 0) {
                    return null;
                }
                fArr2[i5] = fArr[iA];
                iArr[i6] = iA;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        xgVar.c((xgVar.e() + 7) & (-8));
        int i7 = 32;
        int iA2 = xgVar.a(32);
        zh.b[] bVarArr = new zh.b[iA2];
        int i8 = 0;
        while (i8 < iA2) {
            int iA3 = xgVar.a(i2);
            int iA4 = xgVar.a(i2);
            int iA5 = xgVar.a(i7);
            if (iA5 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(iJ2 * d) / dLog);
            float[] fArr3 = new float[iA5 * 3];
            float[] fArr4 = new float[iA5 * 2];
            int iA6 = 0;
            for (int i9 = 0; i9 < iA5; i9++) {
                iA6 += a(xgVar.a(iCeil2));
                if (iA6 < 0 || iA6 >= iJ2) {
                    return null;
                }
                int i10 = i9 * 3;
                int i11 = iA6 * 5;
                fArr3[i10] = fArr2[i11];
                fArr3[i10 + 1] = fArr2[i11 + 1];
                fArr3[i10 + 2] = fArr2[i11 + 2];
                int i12 = i9 * 2;
                fArr4[i12] = fArr2[i11 + 3];
                fArr4[i12 + 1] = fArr2[i11 + 4];
            }
            bVarArr[i8] = new zh.b(iA3, fArr3, fArr4, iA4);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new zh.a(bVarArr);
    }
}
