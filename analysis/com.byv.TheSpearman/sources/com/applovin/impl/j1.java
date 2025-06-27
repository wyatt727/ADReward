package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.i1;
import com.applovin.impl.we;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f550a = yp.c("OpusHead");

    private interface b {
        int a();

        int b();

        int c();
    }

    private static int a(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static long e(yg ygVar) {
        ygVar.f(8);
        ygVar.g(i1.c(ygVar.j()) != 0 ? 16 : 8);
        return ygVar.y();
    }

    private static f f(yg ygVar) {
        long j;
        ygVar.f(8);
        int iC = i1.c(ygVar.j());
        ygVar.g(iC == 0 ? 8 : 16);
        int iJ = ygVar.j();
        ygVar.g(4);
        int iD = ygVar.d();
        int i = iC == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 < i) {
                if (ygVar.c()[iD + i3] != -1) {
                    long jY = iC == 0 ? ygVar.y() : ygVar.B();
                    if (jY != 0) {
                        j = jY;
                    }
                } else {
                    i3++;
                }
            } else {
                ygVar.g(i);
                break;
            }
        }
        ygVar.g(16);
        int iJ2 = ygVar.j();
        int iJ3 = ygVar.j();
        ygVar.g(4);
        int iJ4 = ygVar.j();
        int iJ5 = ygVar.j();
        if (iJ2 == 0 && iJ3 == 65536 && iJ4 == -65536 && iJ5 == 0) {
            i2 = 90;
        } else if (iJ2 == 0 && iJ3 == -65536 && iJ4 == 65536 && iJ5 == 0) {
            i2 = 270;
        } else if (iJ2 == -65536 && iJ3 == 0 && iJ4 == 0 && iJ5 == -65536) {
            i2 = Opcodes.GETFIELD;
        }
        return new f(iJ, j, i2);
    }

    private static int c(yg ygVar) {
        ygVar.f(16);
        return ygVar.j();
    }

    private static Pair d(yg ygVar) {
        ygVar.f(8);
        int iC = i1.c(ygVar.j());
        ygVar.g(iC == 0 ? 8 : 16);
        long jY = ygVar.y();
        ygVar.g(iC == 0 ? 4 : 8);
        int iC2 = ygVar.C();
        return Pair.create(Long.valueOf(jY), "" + ((char) (((iC2 >> 10) & 31) + 96)) + ((char) (((iC2 >> 5) & 31) + 96)) + ((char) ((iC2 & 31) + 96)));
    }

    private static we e(yg ygVar, int i) {
        ygVar.g(8);
        a(ygVar);
        while (ygVar.d() < i) {
            int iD = ygVar.d();
            int iJ = ygVar.j();
            if (ygVar.j() == 1768715124) {
                ygVar.f(iD);
                return b(ygVar, iD + iJ);
            }
            ygVar.f(iD + iJ);
        }
        return null;
    }

    static Pair b(yg ygVar, int i, int i2) throws ah {
        int i3 = i + 8;
        int i4 = -1;
        String strC = null;
        Integer numValueOf = null;
        int i5 = 0;
        while (i3 - i < i2) {
            ygVar.f(i3);
            int iJ = ygVar.j();
            int iJ2 = ygVar.j();
            if (iJ2 == 1718775137) {
                numValueOf = Integer.valueOf(ygVar.j());
            } else if (iJ2 == 1935894637) {
                ygVar.g(4);
                strC = ygVar.c(4);
            } else if (iJ2 == 1935894633) {
                i4 = i3;
                i5 = iJ;
            }
            i3 += iJ;
        }
        if (!"cenc".equals(strC) && !"cbc1".equals(strC) && !"cens".equals(strC) && !"cbcs".equals(strC)) {
            return null;
        }
        l8.a(numValueOf != null, "frma atom is mandatory");
        l8.a(i4 != -1, "schi atom is mandatory");
        no noVarA = a(ygVar, i4, i5, strC);
        l8.a(noVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (no) yp.a(noVarA));
    }

    private static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[yp.a(4, 0, length)] && jArr[yp.a(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f551a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final yg f;
        private final yg g;
        private int h;
        private int i;

        public a(yg ygVar, yg ygVar2, boolean z) throws ah {
            this.g = ygVar;
            this.f = ygVar2;
            this.e = z;
            ygVar2.f(12);
            this.f551a = ygVar2.A();
            ygVar.f(12);
            this.i = ygVar.A();
            l8.a(ygVar.j() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            long jY;
            int i = this.b + 1;
            this.b = i;
            if (i == this.f551a) {
                return false;
            }
            if (this.e) {
                jY = this.f.B();
            } else {
                jY = this.f.y();
            }
            this.d = jY;
            if (this.b == this.h) {
                this.c = this.g.A();
                this.g.g(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.A() - 1 : -1;
            }
            return true;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f555a;
        private final long b;
        private final int c;

        public f(int i, long j, int i2) {
            this.f555a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final no[] f552a;
        public d9 b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.f552a = new no[i];
        }
    }

    static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final int f553a;
        private final int b;
        private final yg c;

        public d(i1.b bVar, d9 d9Var) {
            yg ygVar = bVar.b;
            this.c = ygVar;
            ygVar.f(12);
            int iA = ygVar.A();
            if ("audio/raw".equals(d9Var.m)) {
                int iB = yp.b(d9Var.B, d9Var.z);
                if (iA == 0 || iA % iB != 0) {
                    kc.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iA);
                    iA = iB;
                }
            }
            this.f553a = iA == 0 ? -1 : iA;
            this.b = ygVar.A();
        }

        @Override // com.applovin.impl.j1.b
        public int b() {
            return this.b;
        }

        @Override // com.applovin.impl.j1.b
        public int a() {
            return this.f553a;
        }

        @Override // com.applovin.impl.j1.b
        public int c() {
            int i = this.f553a;
            return i == -1 ? this.c.A() : i;
        }
    }

    static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final yg f554a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        @Override // com.applovin.impl.j1.b
        public int a() {
            return -1;
        }

        public e(i1.b bVar) {
            yg ygVar = bVar.b;
            this.f554a = ygVar;
            ygVar.f(12);
            this.c = ygVar.A() & 255;
            this.b = ygVar.A();
        }

        @Override // com.applovin.impl.j1.b
        public int b() {
            return this.b;
        }

        @Override // com.applovin.impl.j1.b
        public int c() {
            int i = this.c;
            if (i == 8) {
                return this.f554a.w();
            }
            if (i == 16) {
                return this.f554a.C();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int iW = this.f554a.w();
                this.e = iW;
                return (iW & 240) >> 4;
            }
            return this.e & 15;
        }
    }

    private static float c(yg ygVar, int i) {
        ygVar.f(i + 8);
        return ygVar.A() / ygVar.A();
    }

    private static Pair d(yg ygVar, int i, int i2) throws ah {
        Pair pairB;
        int iD = ygVar.d();
        while (iD - i < i2) {
            ygVar.f(iD);
            int iJ = ygVar.j();
            l8.a(iJ > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1936289382 && (pairB = b(ygVar, iD, iJ)) != null) {
                return pairB;
            }
            iD += iJ;
        }
        return null;
    }

    private static int a(yg ygVar, int i, int i2) throws ah {
        int iD = ygVar.d();
        while (iD - i < i2) {
            ygVar.f(iD);
            int iJ = ygVar.j();
            l8.a(iJ > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1702061171) {
                return iD;
            }
            iD += iJ;
        }
        return -1;
    }

    private static we d(yg ygVar, int i) {
        ygVar.g(12);
        while (ygVar.d() < i) {
            int iD = ygVar.d();
            int iJ = ygVar.j();
            if (ygVar.j() == 1935766900) {
                if (iJ < 14) {
                    return null;
                }
                ygVar.g(5);
                int iW = ygVar.w();
                if (iW != 12 && iW != 13) {
                    return null;
                }
                float f2 = iW == 12 ? 240.0f : 120.0f;
                ygVar.g(1);
                return new we(new hk(f2, ygVar.w()));
            }
            ygVar.f(iD + iJ);
        }
        return null;
    }

    private static int b(yg ygVar) {
        int iW = ygVar.w();
        int i = iW & 127;
        while ((iW & 128) == 128) {
            iW = ygVar.w();
            i = (i << 7) | (iW & 127);
        }
        return i;
    }

    public static void a(yg ygVar) {
        int iD = ygVar.d();
        ygVar.g(4);
        if (ygVar.j() != 1751411826) {
            iD += 4;
        }
        ygVar.f(iD);
    }

    private static byte[] c(yg ygVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            ygVar.f(i3);
            int iJ = ygVar.j();
            if (ygVar.j() == 1886547818) {
                return Arrays.copyOfRange(ygVar.c(), i3, iJ + i3);
            }
            i3 += iJ;
        }
        return null;
    }

    private static we b(yg ygVar, int i) {
        ygVar.g(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar.d() < i) {
            we.b bVarB = cf.b(ygVar);
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    public static we b(i1.a aVar) {
        i1.b bVarE = aVar.e(Atom.TYPE_hdlr);
        i1.b bVarE2 = aVar.e(Atom.TYPE_keys);
        i1.b bVarE3 = aVar.e(Atom.TYPE_ilst);
        if (bVarE == null || bVarE2 == null || bVarE3 == null || c(bVarE.b) != 1835299937) {
            return null;
        }
        yg ygVar = bVarE2.b;
        ygVar.f(12);
        int iJ = ygVar.j();
        String[] strArr = new String[iJ];
        for (int i = 0; i < iJ; i++) {
            int iJ2 = ygVar.j();
            ygVar.g(4);
            strArr[i] = ygVar.c(iJ2 - 8);
        }
        yg ygVar2 = bVarE3.b;
        ygVar2.f(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar2.a() > 8) {
            int iD = ygVar2.d();
            int iJ3 = ygVar2.j();
            int iJ4 = ygVar2.j() - 1;
            if (iJ4 >= 0 && iJ4 < iJ) {
                ad adVarA = cf.a(ygVar2, iD + iJ3, strArr[iJ4]);
                if (adVarA != null) {
                    arrayList.add(adVarA);
                }
            } else {
                kc.d("AtomParsers", "Skipped metadata with unknown key index: " + iJ4);
            }
            ygVar2.f(iD + iJ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.applovin.impl.yg r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.impl.w6 r27, com.applovin.impl.j1.c r28, int r29) throws com.applovin.impl.ah {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j1.a(com.applovin.impl.yg, int, int, int, int, java.lang.String, boolean, com.applovin.impl.w6, com.applovin.impl.j1$c, int):void");
    }

    private static Pair a(i1.a aVar) {
        i1.b bVarE = aVar.e(Atom.TYPE_elst);
        if (bVarE == null) {
            return null;
        }
        yg ygVar = bVarE.b;
        ygVar.f(8);
        int iC = i1.c(ygVar.j());
        int iA = ygVar.A();
        long[] jArr = new long[iA];
        long[] jArr2 = new long[iA];
        for (int i = 0; i < iA; i++) {
            jArr[i] = iC == 1 ? ygVar.B() : ygVar.y();
            jArr2[i] = iC == 1 ? ygVar.s() : ygVar.j();
            if (ygVar.u() == 1) {
                ygVar.g(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair a(yg ygVar, int i) {
        ygVar.f(i + 12);
        ygVar.g(1);
        b(ygVar);
        ygVar.g(2);
        int iW = ygVar.w();
        if ((iW & 128) != 0) {
            ygVar.g(2);
        }
        if ((iW & 64) != 0) {
            ygVar.g(ygVar.C());
        }
        if ((iW & 32) != 0) {
            ygVar.g(2);
        }
        ygVar.g(1);
        b(ygVar);
        String strA = df.a(ygVar.w());
        if (!"audio/mpeg".equals(strA) && !"audio/vnd.dts".equals(strA) && !"audio/vnd.dts.hd".equals(strA)) {
            ygVar.g(12);
            ygVar.g(1);
            int iB = b(ygVar);
            byte[] bArr = new byte[iB];
            ygVar.a(bArr, 0, iB);
            return Pair.create(strA, bArr);
        }
        return Pair.create(strA, null);
    }

    private static void a(yg ygVar, int i, int i2, int i3, c cVar) {
        ygVar.f(i2 + 16);
        if (i == 1835365492) {
            ygVar.t();
            String strT = ygVar.t();
            if (strT != null) {
                cVar.b = new d9.b().h(i3).f(strT).a();
            }
        }
    }

    private static no a(yg ygVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            ygVar.f(i5);
            int iJ = ygVar.j();
            if (ygVar.j() == 1952804451) {
                int iC = i1.c(ygVar.j());
                ygVar.g(1);
                if (iC == 0) {
                    ygVar.g(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iW = ygVar.w();
                    i3 = iW & 15;
                    i4 = (iW & 240) >> 4;
                }
                boolean z = ygVar.w() == 1;
                int iW2 = ygVar.w();
                byte[] bArr2 = new byte[16];
                ygVar.a(bArr2, 0, 16);
                if (z && iW2 == 0) {
                    int iW3 = ygVar.w();
                    bArr = new byte[iW3];
                    ygVar.a(bArr, 0, iW3);
                }
                return new no(z, str, iW2, bArr2, i4, i3, bArr);
            }
            i5 += iJ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0428 A[EDGE_INSN: B:208:0x0428->B:169:0x0428 BREAK  A[LOOP:2: B:152:0x03c5->B:168:0x0420], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.so a(com.applovin.impl.mo r38, com.applovin.impl.i1.a r39, com.applovin.impl.x9 r40) throws com.applovin.impl.ah {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j1.a(com.applovin.impl.mo, com.applovin.impl.i1$a, com.applovin.impl.x9):com.applovin.impl.so");
    }

    private static c a(yg ygVar, int i, int i2, String str, w6 w6Var, boolean z) throws ah {
        int i3;
        ygVar.f(12);
        int iJ = ygVar.j();
        c cVar = new c(iJ);
        for (int i4 = 0; i4 < iJ; i4++) {
            int iD = ygVar.d();
            int iJ2 = ygVar.j();
            l8.a(iJ2 > 0, "childAtomSize must be positive");
            int iJ3 = ygVar.j();
            if (iJ3 == 1635148593 || iJ3 == 1635148595 || iJ3 == 1701733238 || iJ3 == 1831958048 || iJ3 == 1836070006 || iJ3 == 1752589105 || iJ3 == 1751479857 || iJ3 == 1932670515 || iJ3 == 1211250227 || iJ3 == 1987063864 || iJ3 == 1987063865 || iJ3 == 1635135537 || iJ3 == 1685479798 || iJ3 == 1685479729 || iJ3 == 1685481573 || iJ3 == 1685481521) {
                i3 = iD;
                a(ygVar, iJ3, i3, iJ2, i, i2, w6Var, cVar, i4);
            } else if (iJ3 == 1836069985 || iJ3 == 1701733217 || iJ3 == 1633889587 || iJ3 == 1700998451 || iJ3 == 1633889588 || iJ3 == 1685353315 || iJ3 == 1685353317 || iJ3 == 1685353320 || iJ3 == 1685353324 || iJ3 == 1685353336 || iJ3 == 1935764850 || iJ3 == 1935767394 || iJ3 == 1819304813 || iJ3 == 1936684916 || iJ3 == 1953984371 || iJ3 == 778924082 || iJ3 == 778924083 || iJ3 == 1835557169 || iJ3 == 1835560241 || iJ3 == 1634492771 || iJ3 == 1634492791 || iJ3 == 1970037111 || iJ3 == 1332770163 || iJ3 == 1716281667) {
                i3 = iD;
                a(ygVar, iJ3, iD, iJ2, i, str, z, w6Var, cVar, i4);
            } else {
                if (iJ3 == 1414810956 || iJ3 == 1954034535 || iJ3 == 2004251764 || iJ3 == 1937010800 || iJ3 == 1664495672) {
                    a(ygVar, iJ3, iD, iJ2, i, str, cVar);
                } else if (iJ3 == 1835365492) {
                    a(ygVar, iJ3, iD, i, cVar);
                } else if (iJ3 == 1667329389) {
                    cVar.b = new d9.b().h(i).f("application/x-camera-motion").a();
                }
                i3 = iD;
            }
            ygVar.f(i3 + iJ2);
        }
        return cVar;
    }

    private static void a(yg ygVar, int i, int i2, int i3, int i4, String str, c cVar) {
        ygVar.f(i2 + 16);
        String str2 = "application/ttml+xml";
        ab abVarA = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                ygVar.a(bArr, 0, i5);
                abVarA = ab.a(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                cVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.b = new d9.b().h(i4).f(str2).e(str).a(j).a(abVarA).a();
    }

    private static mo a(i1.a aVar, i1.b bVar, long j, w6 w6Var, boolean z, boolean z2) throws ah {
        i1.b bVar2;
        long j2;
        long[] jArr;
        long[] jArr2;
        i1.a aVarD;
        Pair pairA;
        i1.a aVar2 = (i1.a) a1.a(aVar.d(Atom.TYPE_mdia));
        int iA = a(c(((i1.b) a1.a(aVar2.e(Atom.TYPE_hdlr))).b));
        if (iA == -1) {
            return null;
        }
        f fVarF = f(((i1.b) a1.a(aVar.e(Atom.TYPE_tkhd))).b);
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = fVarF.b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long jE = e(bVar2.b);
        long jC = j2 != -9223372036854775807L ? yp.c(j2, 1000000L, jE) : -9223372036854775807L;
        i1.a aVar3 = (i1.a) a1.a(((i1.a) a1.a(aVar2.d(Atom.TYPE_minf))).d(Atom.TYPE_stbl));
        Pair pairD = d(((i1.b) a1.a(aVar2.e(Atom.TYPE_mdhd))).b);
        c cVarA = a(((i1.b) a1.a(aVar3.e(Atom.TYPE_stsd))).b, fVarF.f555a, fVarF.c, (String) pairD.second, w6Var, z2);
        if (z || (aVarD = aVar.d(Atom.TYPE_edts)) == null || (pairA = a(aVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairA.first;
            jArr2 = (long[]) pairA.second;
            jArr = jArr3;
        }
        if (cVarA.b == null) {
            return null;
        }
        return new mo(fVarF.f555a, iA, ((Long) pairD.first).longValue(), jE, jC, cVarA.b, cVarA.d, cVarA.f552a, cVarA.c, jArr, jArr2);
    }

    public static Pair a(i1.b bVar) {
        yg ygVar = bVar.b;
        ygVar.f(8);
        we weVarE = null;
        we weVarD = null;
        while (ygVar.a() >= 8) {
            int iD = ygVar.d();
            int iJ = ygVar.j();
            int iJ2 = ygVar.j();
            if (iJ2 == 1835365473) {
                ygVar.f(iD);
                weVarE = e(ygVar, iD + iJ);
            } else if (iJ2 == 1936553057) {
                ygVar.f(iD);
                weVarD = d(ygVar, iD + iJ);
            }
            ygVar.f(iD + iJ);
        }
        return Pair.create(weVarE, weVarD);
    }

    private static void a(yg ygVar, int i, int i2, int i3, int i4, int i5, w6 w6Var, c cVar, int i6) throws ah {
        w6 w6Var2;
        String str;
        yg ygVar2 = ygVar;
        int i7 = i2;
        int i8 = i3;
        w6 w6VarA = w6Var;
        ygVar2.f(i7 + 16);
        ygVar2.g(16);
        int iC = ygVar.C();
        int iC2 = ygVar.C();
        ygVar2.g(50);
        int iD = ygVar.d();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairD = d(ygVar2, i7, i8);
            if (pairD != null) {
                iIntValue = ((Integer) pairD.first).intValue();
                w6VarA = w6VarA == null ? null : w6VarA.a(((no) pairD.second).b);
                cVar.f552a[i6] = (no) pairD.second;
            }
            ygVar2.f(iD);
        }
        String str2 = "video/3gpp";
        String str3 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i9 = -1;
        float fC = 1.0f;
        String str4 = null;
        List listA = null;
        byte[] bArrC = null;
        p3 p3Var = null;
        boolean z = false;
        while (true) {
            if (iD - i7 >= i8) {
                w6Var2 = w6VarA;
                break;
            }
            ygVar2.f(iD);
            int iD2 = ygVar.d();
            String str5 = str2;
            int iJ = ygVar.j();
            if (iJ == 0) {
                w6Var2 = w6VarA;
                if (ygVar.d() - i7 == i8) {
                    break;
                }
            } else {
                w6Var2 = w6VarA;
            }
            l8.a(iJ > 0, "childAtomSize must be positive");
            int iJ2 = ygVar.j();
            if (iJ2 == 1635148611) {
                l8.a(str3 == null, (String) null);
                ygVar2.f(iD2 + 8);
                v1 v1VarB = v1.b(ygVar);
                listA = v1VarB.f1078a;
                cVar.c = v1VarB.b;
                if (!z) {
                    fC = v1VarB.e;
                }
                str4 = v1VarB.f;
                str = "video/avc";
            } else if (iJ2 == 1752589123) {
                l8.a(str3 == null, (String) null);
                ygVar2.f(iD2 + 8);
                ka kaVarA = ka.a(ygVar);
                listA = kaVarA.f593a;
                cVar.c = kaVarA.b;
                str4 = kaVarA.c;
                str = "video/hevc";
            } else {
                if (iJ2 == 1685480259 || iJ2 == 1685485123) {
                    v6 v6VarA = v6.a(ygVar);
                    if (v6VarA != null) {
                        str4 = v6VarA.c;
                        str3 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else if (iJ2 == 1987076931) {
                    l8.a(str3 == null, (String) null);
                    str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (iJ2 == 1635135811) {
                    l8.a(str3 == null, (String) null);
                    str3 = "video/av01";
                } else if (iJ2 == 1681012275) {
                    l8.a(str3 == null, (String) null);
                    str3 = str5;
                } else if (iJ2 == 1702061171) {
                    l8.a(str3 == null, (String) null);
                    Pair pairA = a(ygVar2, iD2);
                    String str6 = (String) pairA.first;
                    byte[] bArr = (byte[]) pairA.second;
                    if (bArr != null) {
                        listA = ab.a(bArr);
                    }
                    str3 = str6;
                } else if (iJ2 == 1885434736) {
                    fC = c(ygVar2, iD2);
                    z = true;
                } else if (iJ2 == 1937126244) {
                    bArrC = c(ygVar2, iD2, iJ);
                } else if (iJ2 == 1936995172) {
                    int iW = ygVar.w();
                    ygVar2.g(3);
                    if (iW == 0) {
                        int iW2 = ygVar.w();
                        if (iW2 == 0) {
                            i9 = 0;
                        } else if (iW2 == 1) {
                            i9 = 1;
                        } else if (iW2 == 2) {
                            i9 = 2;
                        } else if (iW2 == 3) {
                            i9 = 3;
                        }
                    }
                } else if (iJ2 == 1668246642) {
                    int iJ3 = ygVar.j();
                    boolean z2 = iJ3 == 1852009592;
                    if (!z2 && iJ3 != 1852009571) {
                        kc.d("AtomParsers", "Unsupported color type: " + i1.a(iJ3));
                    } else {
                        int iC3 = ygVar.C();
                        int iC4 = ygVar.C();
                        ygVar2.g(2);
                        p3Var = new p3(p3.a(iC3), z2 && (ygVar.w() & 128) != 0 ? 1 : 2, p3.b(iC4), null);
                    }
                }
                iD += iJ;
                ygVar2 = ygVar;
                i7 = i2;
                i8 = i3;
                str2 = str5;
                w6VarA = w6Var2;
            }
            str3 = str;
            iD += iJ;
            ygVar2 = ygVar;
            i7 = i2;
            i8 = i3;
            str2 = str5;
            w6VarA = w6Var2;
        }
        if (str3 == null) {
            return;
        }
        cVar.b = new d9.b().h(i4).f(str3).a(str4).q(iC).g(iC2).b(fC).m(i5).a(bArrC).p(i9).a(listA).a(w6Var2).a(p3Var).a();
    }

    public static List a(i1.a aVar, x9 x9Var, long j, w6 w6Var, boolean z, boolean z2, Function function) {
        mo moVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.d.size(); i++) {
            i1.a aVar2 = (i1.a) aVar.d.get(i);
            if (aVar2.f514a == 1953653099 && (moVar = (mo) function.apply(a(aVar2, (i1.b) a1.a(aVar.e(Atom.TYPE_mvhd)), j, w6Var, z, z2))) != null) {
                arrayList.add(a(moVar, (i1.a) a1.a(((i1.a) a1.a(((i1.a) a1.a(aVar2.d(Atom.TYPE_mdia))).d(Atom.TYPE_minf))).d(Atom.TYPE_stbl)), x9Var));
            }
        }
        return arrayList;
    }
}
