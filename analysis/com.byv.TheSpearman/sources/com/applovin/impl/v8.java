package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.y8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v8 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y8 f1087a;

        public a(y8 y8Var) {
            this.f1087a = y8Var;
        }
    }

    public static boolean a(j8 j8Var) {
        yg ygVar = new yg(4);
        j8Var.c(ygVar.c(), 0, 4);
        return ygVar.y() == 1716281667;
    }

    public static void d(j8 j8Var) throws ah {
        yg ygVar = new yg(4);
        j8Var.d(ygVar.c(), 0, 4);
        if (ygVar.y() != 1716281667) {
            throw ah.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static we a(j8 j8Var, boolean z) {
        we weVarA = new va().a(j8Var, z ? null : ta.b);
        if (weVarA == null || weVarA.c() == 0) {
            return null;
        }
        return weVarA;
    }

    public static int b(j8 j8Var) throws ah {
        j8Var.b();
        yg ygVar = new yg(2);
        j8Var.c(ygVar.c(), 0, 2);
        int iC = ygVar.C();
        if ((iC >> 2) == 16382) {
            j8Var.b();
            return iC;
        }
        j8Var.b();
        throw ah.a("First frame does not start with sync code.", null);
    }

    private static y8 c(j8 j8Var) {
        byte[] bArr = new byte[38];
        j8Var.d(bArr, 0, 38);
        return new y8(bArr, 4);
    }

    private static List c(j8 j8Var, int i) {
        yg ygVar = new yg(i);
        j8Var.d(ygVar.c(), 0, i);
        ygVar.g(4);
        return Arrays.asList(gr.a(ygVar, false, false).b);
    }

    public static boolean a(j8 j8Var, a aVar) {
        j8Var.b();
        xg xgVar = new xg(new byte[4]);
        j8Var.c(xgVar.f1169a, 0, 4);
        boolean zF = xgVar.f();
        int iA = xgVar.a(7);
        int iA2 = xgVar.a(24) + 4;
        if (iA == 0) {
            aVar.f1087a = c(j8Var);
        } else {
            y8 y8Var = aVar.f1087a;
            if (y8Var == null) {
                throw new IllegalArgumentException();
            }
            if (iA == 3) {
                aVar.f1087a = y8Var.a(b(j8Var, iA2));
            } else if (iA == 4) {
                aVar.f1087a = y8Var.b(c(j8Var, iA2));
            } else if (iA == 6) {
                aVar.f1087a = y8Var.a(Collections.singletonList(a(j8Var, iA2)));
            } else {
                j8Var.a(iA2);
            }
        }
        return zF;
    }

    public static we b(j8 j8Var, boolean z) {
        j8Var.b();
        long jD = j8Var.d();
        we weVarA = a(j8Var, z);
        j8Var.a((int) (j8Var.d() - jD));
        return weVarA;
    }

    public static y8.a a(yg ygVar) {
        ygVar.g(1);
        int iZ = ygVar.z();
        long jD = ygVar.d() + iZ;
        int i = iZ / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jS = ygVar.s();
            if (jS == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jS;
            jArrCopyOf2[i2] = ygVar.s();
            ygVar.g(2);
            i2++;
        }
        ygVar.g((int) (jD - ygVar.d()));
        return new y8.a(jArrCopyOf, jArrCopyOf2);
    }

    private static ih a(j8 j8Var, int i) {
        yg ygVar = new yg(i);
        j8Var.d(ygVar.c(), 0, i);
        ygVar.g(4);
        int iJ = ygVar.j();
        String strA = ygVar.a(ygVar.j(), Charsets.US_ASCII);
        String strC = ygVar.c(ygVar.j());
        int iJ2 = ygVar.j();
        int iJ3 = ygVar.j();
        int iJ4 = ygVar.j();
        int iJ5 = ygVar.j();
        int iJ6 = ygVar.j();
        byte[] bArr = new byte[iJ6];
        ygVar.a(bArr, 0, iJ6);
        return new ih(iJ, strA, strC, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    private static y8.a b(j8 j8Var, int i) {
        yg ygVar = new yg(i);
        j8Var.d(ygVar.c(), 0, i);
        return a(ygVar);
    }
}
