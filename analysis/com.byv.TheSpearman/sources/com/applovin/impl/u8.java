package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class u8 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f1059a;
    }

    private static boolean a(yg ygVar, y8 y8Var, int i) {
        int iB = b(ygVar, i);
        return iB != -1 && iB <= y8Var.b;
    }

    private static boolean b(yg ygVar, y8 y8Var, int i) {
        int i2 = y8Var.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == y8Var.f;
        }
        if (i == 12) {
            return ygVar.w() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int iC = ygVar.C();
        if (i == 14) {
            iC *= 10;
        }
        return iC == i2;
    }

    private static boolean b(int i, y8 y8Var) {
        return i <= 7 ? i == y8Var.g - 1 : i <= 10 && y8Var.g == 2;
    }

    private static boolean a(yg ygVar, int i) {
        return ygVar.w() == yp.b(ygVar.c(), i, ygVar.d() - 1, 0);
    }

    public static int b(yg ygVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ygVar.w() + 1;
            case 7:
                return ygVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean a(yg ygVar, y8 y8Var, boolean z, a aVar) {
        try {
            long jD = ygVar.D();
            if (!z) {
                jD *= y8Var.b;
            }
            aVar.f1059a = jD;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean a(yg ygVar, y8 y8Var, int i, a aVar) {
        int iD = ygVar.d();
        long jY = ygVar.y();
        long j = jY >>> 16;
        if (j != i) {
            return false;
        }
        return b((int) ((jY >> 4) & 15), y8Var) && a((int) ((jY >> 1) & 7), y8Var) && !(((jY & 1) > 1L ? 1 : ((jY & 1) == 1L ? 0 : -1)) == 0) && a(ygVar, y8Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(ygVar, y8Var, (int) ((jY >> 12) & 15)) && b(ygVar, y8Var, (int) ((jY >> 8) & 15)) && a(ygVar, iD);
    }

    private static boolean a(int i, y8 y8Var) {
        return i == 0 || i == y8Var.i;
    }

    public static boolean a(j8 j8Var, y8 y8Var, int i, a aVar) {
        long jD = j8Var.d();
        byte[] bArr = new byte[2];
        j8Var.c(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            j8Var.b();
            j8Var.c((int) (jD - j8Var.f()));
            return false;
        }
        yg ygVar = new yg(16);
        System.arraycopy(bArr, 0, ygVar.c(), 0, 2);
        ygVar.e(l8.a(j8Var, ygVar.c(), 2, 14));
        j8Var.b();
        j8Var.c((int) (jD - j8Var.f()));
        return a(ygVar, y8Var, i, aVar);
    }

    public static long a(j8 j8Var, y8 y8Var) throws ah {
        j8Var.b();
        j8Var.c(1);
        byte[] bArr = new byte[1];
        j8Var.c(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        j8Var.c(2);
        int i = z ? 7 : 6;
        yg ygVar = new yg(i);
        ygVar.e(l8.a(j8Var, ygVar.c(), 0, i));
        j8Var.b();
        a aVar = new a();
        if (a(ygVar, y8Var, z, aVar)) {
            return aVar.f1059a;
        }
        throw ah.a(null, null);
    }
}
