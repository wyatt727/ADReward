package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class gr {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f473a;
        public final String[] b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.f473a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f475a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f475a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f474a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.f474a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    private static c[] c(dr drVar) {
        int iA = drVar.a(6) + 1;
        c[] cVarArr = new c[iA];
        for (int i = 0; i < iA; i++) {
            cVarArr[i] = new c(drVar.c(), drVar.a(16), drVar.a(16), drVar.a(8));
        }
        return cVarArr;
    }

    private static void d(dr drVar) throws ah {
        int iA = drVar.a(6) + 1;
        for (int i = 0; i < iA; i++) {
            if (drVar.a(16) <= 2) {
                drVar.b(24);
                drVar.b(24);
                drVar.b(24);
                int iA2 = drVar.a(6) + 1;
                drVar.b(8);
                int[] iArr = new int[iA2];
                for (int i2 = 0; i2 < iA2; i2++) {
                    iArr[i2] = ((drVar.c() ? drVar.a(5) : 0) * 8) + drVar.a(3);
                }
                for (int i3 = 0; i3 < iA2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            drVar.b(8);
                        }
                    }
                }
            } else {
                throw ah.a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    private static void b(dr drVar) throws ah {
        int iA = drVar.a(6) + 1;
        for (int i = 0; i < iA; i++) {
            int iA2 = drVar.a(16);
            if (iA2 == 0) {
                drVar.b(8);
                drVar.b(16);
                drVar.b(16);
                drVar.b(6);
                drVar.b(8);
                int iA3 = drVar.a(4) + 1;
                for (int i2 = 0; i2 < iA3; i2++) {
                    drVar.b(8);
                }
            } else {
                if (iA2 != 1) {
                    throw ah.a("floor type greater than 1 not decodable: " + iA2, null);
                }
                int iA4 = drVar.a(5);
                int i3 = -1;
                int[] iArr = new int[iA4];
                for (int i4 = 0; i4 < iA4; i4++) {
                    int iA5 = drVar.a(4);
                    iArr[i4] = iA5;
                    if (iA5 > i3) {
                        i3 = iA5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = drVar.a(3) + 1;
                    int iA6 = drVar.a(2);
                    if (iA6 > 0) {
                        drVar.b(8);
                    }
                    for (int i7 = 0; i7 < (1 << iA6); i7++) {
                        drVar.b(8);
                    }
                }
                drVar.b(2);
                int iA7 = drVar.a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iA4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        drVar.b(iA7);
                        i9++;
                    }
                }
            }
        }
    }

    private static long a(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f472a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f472a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    public static d b(yg ygVar) throws ah {
        a(1, ygVar, false);
        int iQ = ygVar.q();
        int iW = ygVar.w();
        int iQ2 = ygVar.q();
        int iM = ygVar.m();
        if (iM <= 0) {
            iM = -1;
        }
        int iM2 = ygVar.m();
        if (iM2 <= 0) {
            iM2 = -1;
        }
        int iM3 = ygVar.m();
        if (iM3 <= 0) {
            iM3 = -1;
        }
        int iW2 = ygVar.w();
        return new d(iQ, iW, iQ2, iM, iM2, iM3, (int) Math.pow(2.0d, iW2 & 15), (int) Math.pow(2.0d, (iW2 & 240) >> 4), (ygVar.w() & 1) > 0, Arrays.copyOf(ygVar.c(), ygVar.e()));
    }

    private static a a(dr drVar) throws ah {
        if (drVar.a(24) == 5653314) {
            int iA = drVar.a(16);
            int iA2 = drVar.a(24);
            long[] jArr = new long[iA2];
            boolean zC = drVar.c();
            long jA = 0;
            if (!zC) {
                boolean zC2 = drVar.c();
                for (int i = 0; i < iA2; i++) {
                    if (zC2) {
                        if (drVar.c()) {
                            jArr[i] = drVar.a(5) + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        jArr[i] = drVar.a(5) + 1;
                    }
                }
            } else {
                int iA3 = drVar.a(5) + 1;
                int i2 = 0;
                while (i2 < iA2) {
                    int iA4 = drVar.a(a(iA2 - i2));
                    for (int i3 = 0; i3 < iA4 && i2 < iA2; i3++) {
                        jArr[i2] = iA3;
                        i2++;
                    }
                    iA3++;
                }
            }
            int iA5 = drVar.a(4);
            if (iA5 <= 2) {
                if (iA5 == 1 || iA5 == 2) {
                    drVar.b(32);
                    drVar.b(32);
                    int iA6 = drVar.a(4) + 1;
                    drVar.b(1);
                    if (iA5 != 1) {
                        jA = iA2 * iA;
                    } else if (iA != 0) {
                        jA = a(iA2, iA);
                    }
                    drVar.b((int) (jA * iA6));
                }
                return new a(iA, iA2, jArr, iA5, zC);
            }
            throw ah.a("lookup type greater than 2 not decodable: " + iA5, null);
        }
        throw ah.a("expected code book to start with [0x56, 0x43, 0x42] at " + drVar.b(), null);
    }

    private static void a(int i, dr drVar) throws ah {
        int iA = drVar.a(6) + 1;
        for (int i2 = 0; i2 < iA; i2++) {
            int iA2 = drVar.a(16);
            if (iA2 != 0) {
                kc.b("VorbisUtil", "mapping type other than 0 not supported: " + iA2);
            } else {
                int iA3 = drVar.c() ? drVar.a(4) + 1 : 1;
                if (drVar.c()) {
                    int iA4 = drVar.a(8) + 1;
                    for (int i3 = 0; i3 < iA4; i3++) {
                        int i4 = i - 1;
                        drVar.b(a(i4));
                        drVar.b(a(i4));
                    }
                }
                if (drVar.a(2) != 0) {
                    throw ah.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iA3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        drVar.b(4);
                    }
                }
                for (int i6 = 0; i6 < iA3; i6++) {
                    drVar.b(8);
                    drVar.b(8);
                    drVar.b(8);
                }
            }
        }
    }

    public static b a(yg ygVar) {
        return a(ygVar, true, true);
    }

    public static b a(yg ygVar, boolean z, boolean z2) throws ah {
        if (z) {
            a(3, ygVar, false);
        }
        String strC = ygVar.c((int) ygVar.p());
        int length = strC.length();
        long jP = ygVar.p();
        String[] strArr = new String[(int) jP];
        int length2 = length + 15;
        for (int i = 0; i < jP; i++) {
            String strC2 = ygVar.c((int) ygVar.p());
            strArr[i] = strC2;
            length2 = length2 + 4 + strC2.length();
        }
        if (z2 && (ygVar.w() & 1) == 0) {
            throw ah.a("framing bit expected to be set", null);
        }
        return new b(strC, strArr, length2 + 1);
    }

    public static c[] a(yg ygVar, int i) throws ah {
        a(5, ygVar, false);
        int iW = ygVar.w() + 1;
        dr drVar = new dr(ygVar.c());
        drVar.b(ygVar.d() * 8);
        for (int i2 = 0; i2 < iW; i2++) {
            a(drVar);
        }
        int iA = drVar.a(6) + 1;
        for (int i3 = 0; i3 < iA; i3++) {
            if (drVar.a(16) != 0) {
                throw ah.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        b(drVar);
        d(drVar);
        a(i, drVar);
        c[] cVarArrC = c(drVar);
        if (drVar.c()) {
            return cVarArrC;
        }
        throw ah.a("framing bit after modes not set as expected", null);
    }

    public static boolean a(int i, yg ygVar, boolean z) throws ah {
        if (ygVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ah.a("too short header: " + ygVar.a(), null);
        }
        if (ygVar.w() != i) {
            if (z) {
                return false;
            }
            throw ah.a("expected header type " + Integer.toHexString(i), null);
        }
        if (ygVar.w() == 118 && ygVar.w() == 111 && ygVar.w() == 114 && ygVar.w() == 98 && ygVar.w() == 105 && ygVar.w() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ah.a("expected characters 'vorbis'", null);
    }
}
