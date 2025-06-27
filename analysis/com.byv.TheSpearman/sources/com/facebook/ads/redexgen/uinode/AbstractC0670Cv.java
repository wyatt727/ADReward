package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Cv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0670Cv {
    public static byte[] A00;
    public static String[] A01 = {"7VlHbmI4sHauhoCWaFlUZM9mZRV70mzp", "LqGkn09UNvdqUAgssIpSCyoRJ1iI6QKK", "ZmFU8Mfu7g0bs6JKYNiQ5l9NQyV6", "IM1BduvbFOrOx4pkelis2wS2axXVXfJJ", "7P5Q", "68Q2Pgf", "FTYWHoYlDOl1N68V4e618z2hAoSaWMYg", "QxGNaBvq4MkZwy6AnQRq9NbnhINTK41p"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0669Cu A04(C0788Hz c0788Hz) throws C05969v {
        A0A(1, c0788Hz, false);
        long jA0K = c0788Hz.A0K();
        int iA0E = c0788Hz.A0E();
        long jA0K2 = c0788Hz.A0K();
        int iA0A = c0788Hz.A0A();
        int iA0A2 = c0788Hz.A0A();
        int iA0A3 = c0788Hz.A0A();
        int iA0E2 = c0788Hz.A0E();
        return new C0669Cu(jA0K, iA0E, jA0K2, iA0A, iA0A2, iA0A3, (int) Math.pow(2.0d, iA0E2 & 15), (int) Math.pow(2.0d, (iA0E2 & 240) >> 4), (c0788Hz.A0E() & 1) > 0, Arrays.copyOf(c0788Hz.A00, c0788Hz.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{116, 77, 80, 64, 75, 81, 119, 86, 75, 78, 28, 1, 9, 28, 26, 13, 28, 29, 89, 26, 17, 24, 11, 24, 26, 13, 28, 11, 10, 89, 94, 15, 22, 11, 27, 16, 10, 94, 87, 74, 66, 87, 81, 70, 87, 86, 18, 81, 93, 86, 87, 18, 80, 93, 93, 89, 18, 70, 93, 18, 65, 70, 83, 64, 70, 18, 69, 91, 70, 90, 18, 105, 2, 74, 7, 4, 30, 18, 2, 74, 6, 1, 30, 18, 2, 74, 6, 0, 111, 18, 83, 70, 18, 78, 83, 91, 78, 72, 95, 78, 79, 11, 67, 78, 74, 79, 78, 89, 11, 95, 82, 91, 78, 11, 70, 76, 79, 79, 82, 0, 84, 89, 80, 69, 0, 71, 82, 69, 65, 84, 69, 82, 0, 84, 72, 65, 78, 0, 17, 0, 78, 79, 84, 0, 68, 69, 67, 79, 68, 65, 66, 76, 69, 26, 0, 49, 37, 54, 58, 62, 57, 48, 119, 53, 62, 35, 119, 54, 49, 35, 50, 37, 119, 58, 56, 51, 50, 36, 119, 57, 56, 35, 119, 36, 50, 35, 119, 54, 36, 119, 50, 47, 39, 50, 52, 35, 50, 51, 48, 36, 55, 59, Utf8.REPLACEMENT_BYTE, 56, 49, 118, 52, Utf8.REPLACEMENT_BYTE, 34, 118, 51, 46, 38, 51, 53, 34, 51, 50, 118, 34, 57, 118, 52, 51, 118, 37, 51, 34, 16, 19, 19, 23, 9, 12, 92, 8, 5, 12, 25, 92, 27, 14, 25, 29, 8, 25, 14, 92, 8, 20, 29, 18, 92, 78, 92, 18, 19, 8, 92, 24, 25, 31, 19, 24, 29, 30, 16, 25, 70, 92, 104, 100, 117, 117, 108, 107, 98, 37, 113, 124, 117, 96, 37, 106, 113, 109, 96, 119, 37, 113, 109, 100, 107, 37, 53, 37, 107, 106, 113, 37, 118, 112, 117, 117, 106, 119, 113, 96, 97, Utf8.REPLACEMENT_BYTE, 37, 93, 65, 76, 78, 72, 69, 66, 65, 73, 72, 95, 13, 66, 75, 13, 89, 68, 64, 72, 13, 73, 66, 64, 76, 68, 67, 13, 89, 95, 76, 67, 94, 75, 66, 95, 64, 94, 13, 67, 66, 89, 13, 87, 72, 95, 66, 72, 73, 13, 66, 88, 89, 114, 101, 115, 105, 100, 117, 101, 84, 121, 112, 101, 32, 103, 114, 101, 97, 116, 101, 114, 32, 116, 104, 97, 110, 32, 50, 32, 105, 115, 32, 110, 111, 116, 32, 100, 101, 99, 111, 100, 97, 98, 108, 101, 107, 112, Utf8.REPLACEMENT_BYTE, 109, 122, 108, 122, 109, 105, 122, 123, Utf8.REPLACEMENT_BYTE, 125, 118, 107, 108, Utf8.REPLACEMENT_BYTE, 114, 106, 108, 107, Utf8.REPLACEMENT_BYTE, 125, 122, Utf8.REPLACEMENT_BYTE, 101, 122, 109, 112, Utf8.REPLACEMENT_BYTE, 126, 121, 107, 122, 109, Utf8.REPLACEMENT_BYTE, 114, 126, 111, 111, 118, 113, 120, Utf8.REPLACEMENT_BYTE, 124, 112, 106, 111, 115, 118, 113, 120, Utf8.REPLACEMENT_BYTE, 108, 107, 122, 111, 108, 82, 73, 73, 6, 85, 78, 73, 84, 82, 6, 78, 67, 71, 66, 67, 84, 28, 6};
        if (A01[2].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "mgdhOJqoKNbrHZTmAlzuBC741swozh2A";
        strArr[0] = "We2DdWBOrlseFOiGq0myNglhwb5nF2sN";
    }

    static {
        A06();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r12 <= 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r12 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r12 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        r14.A03(32);
        r14.A03(32);
        r4 = r14.A02(4) + 1;
        r14.A03(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r12 != 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r9 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        r0 = A01(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        r0 = (int) (r4 * r0);
        r14.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        return new com.facebook.ads.redexgen.uinode.C0667Cr(r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        r0 = r10 * r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (r12 <= 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        throw new com.facebook.ads.redexgen.uinode.C05969v(A05(228, 42, 126) + r12);
     */
    /* JADX WARN: Incorrect condition in loop: B:25:0x0083 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.uinode.C0667Cr A02(com.facebook.ads.redexgen.uinode.C0665Cp r14) throws com.facebook.ads.redexgen.uinode.C05969v {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.AbstractC0670Cv.A02(com.facebook.ads.redexgen.X.Cp):com.facebook.ads.redexgen.X.Cr");
    }

    public static C0668Cs A03(C0788Hz c0788Hz) throws C05969v {
        A0A(3, c0788Hz, false);
        int length = (int) c0788Hz.A0K();
        String strA0S = c0788Hz.A0S(length);
        int length2 = strA0S.length();
        int i = 7 + 4 + length2;
        long jA0K = c0788Hz.A0K();
        int length3 = (int) jA0K;
        String[] strArr = new String[length3];
        int i2 = i + 4;
        int i3 = 0;
        while (true) {
            long j = i3;
            String vendor = A01[3];
            if (vendor.charAt(18) != 'i') {
                throw new RuntimeException();
            }
            A01[5] = "ziwCMa4";
            if (j < jA0K) {
                int len = (int) c0788Hz.A0K();
                strArr[i3] = c0788Hz.A0S(len);
                int length4 = strArr[i3].length();
                i2 = i2 + 4 + length4;
                i3++;
            } else {
                int length5 = c0788Hz.A0E();
                if ((length5 & 1) != 0) {
                    return new C0668Cs(strA0S, strArr, i2 + 1);
                }
                String vendor2 = A05(Opcodes.IFNULL, 30, 84);
                throw new C05969v(vendor2);
            }
        }
    }

    public static void A07(int i, C0665Cp c0665Cp) throws C05969v {
        int j;
        int iA02 = c0665Cp.A02(6) + 1;
        for (int i2 = 0; i2 < iA02; i2++) {
            int iA022 = c0665Cp.A02(16);
            switch (iA022) {
                case 0:
                    if (c0665Cp.A04()) {
                        j = c0665Cp.A02(4) + 1;
                    } else {
                        j = 1;
                    }
                    if (c0665Cp.A04()) {
                        int i3 = c0665Cp.A02(8);
                        int i4 = i3 + 1;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int mappingsCount = i - 1;
                            c0665Cp.A03(A00(mappingsCount));
                            int mappingsCount2 = i - 1;
                            c0665Cp.A03(A00(mappingsCount2));
                        }
                    }
                    int mappingsCount3 = c0665Cp.A02(2);
                    if (mappingsCount3 == 0) {
                        if (j > 1) {
                            for (int i6 = 0; i6 < i; i6++) {
                                c0665Cp.A03(4);
                                String[] strArr = A01;
                                String str = strArr[6];
                                String str2 = strArr[0];
                                int iCharAt = str.charAt(31);
                                int mappingsCount4 = str2.charAt(31);
                                if (iCharAt == mappingsCount4) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A01;
                                strArr2[6] = "Wlyx46da0LhUJCMQF7d9pJYsMbXYpIdM";
                                strArr2[0] = "HglI0wxUFDuveiNJ2qiTiY5BYhneBiG1";
                            }
                        }
                        for (int mappingsCount5 = 0; mappingsCount5 < j; mappingsCount5++) {
                            c0665Cp.A03(8);
                            c0665Cp.A03(8);
                            c0665Cp.A03(8);
                        }
                        break;
                    } else {
                        throw new C05969v(A05(406, 58, 29));
                    }
                default:
                    Log.e(A05(0, 10, 32), A05(270, 41, 7) + iA022);
                    break;
            }
        }
    }

    public static void A08(C0665Cp c0665Cp) throws C05969v {
        int iA02 = c0665Cp.A02(6) + 1;
        for (int j = 0; j < iA02; j++) {
            int iA022 = c0665Cp.A02(16);
            switch (iA022) {
                case 0:
                    c0665Cp.A03(8);
                    c0665Cp.A03(16);
                    c0665Cp.A03(16);
                    c0665Cp.A03(6);
                    c0665Cp.A03(8);
                    int floorCount = c0665Cp.A02(4);
                    int floorCount2 = floorCount + 1;
                    for (int i = 0; i < floorCount2; i++) {
                        c0665Cp.A03(8);
                    }
                    break;
                case 1:
                    int j2 = c0665Cp.A02(5);
                    int i2 = -1;
                    int[] partitionClassList = new int[j2];
                    for (int floorCount3 = 0; floorCount3 < j2; floorCount3++) {
                        partitionClassList[floorCount3] = c0665Cp.A02(4);
                        if (partitionClassList[floorCount3] > i2) {
                            i2 = partitionClassList[floorCount3];
                        }
                    }
                    int[] iArr = new int[i2 + 1];
                    for (int partitions = 0; partitions < iArr.length; partitions++) {
                        iArr[partitions] = c0665Cp.A02(3) + 1;
                        int iA023 = c0665Cp.A02(2);
                        if (iA023 > 0) {
                            c0665Cp.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << iA023); floorCount4++) {
                            c0665Cp.A03(8);
                        }
                    }
                    c0665Cp.A03(2);
                    int partitions2 = c0665Cp.A02(4);
                    int i3 = 0;
                    int floorCount5 = 0;
                    for (int i4 = 0; i4 < j2; i4++) {
                        i3 += iArr[partitionClassList[i4]];
                        while (floorCount5 < i3) {
                            c0665Cp.A03(partitions2);
                            floorCount5++;
                        }
                    }
                    break;
                default:
                    throw new C05969v(A05(114, 41, 34) + iA022);
            }
        }
    }

    public static void A09(C0665Cp c0665Cp) throws C05969v {
        int iA02 = c0665Cp.A02(6) + 1;
        for (int i = 0; i < iA02; i++) {
            int residueCount = c0665Cp.A02(16);
            if (residueCount <= 2) {
                c0665Cp.A03(24);
                c0665Cp.A03(24);
                c0665Cp.A03(24);
                int iA022 = c0665Cp.A02(6) + 1;
                c0665Cp.A03(8);
                int[] iArr = new int[iA022];
                for (int i2 = 0; i2 < iA022; i2++) {
                    int iA023 = 0;
                    int residueCount2 = c0665Cp.A02(3);
                    if (c0665Cp.A04()) {
                        iA023 = c0665Cp.A02(5);
                    }
                    iArr[i2] = (iA023 * 8) + residueCount2;
                }
                for (int i3 = 0; i3 < iA022; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int residueCount3 = iArr[i3];
                        if ((residueCount3 & (1 << i4)) != 0) {
                            c0665Cp.A03(8);
                        }
                    }
                }
            } else {
                throw new C05969v(A05(363, 43, 2));
            }
        }
    }

    public static boolean A0A(int i, C0788Hz c0788Hz, boolean z) throws C05969v {
        if (c0788Hz.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C05969v(A05(464, 18, 36) + c0788Hz.A04());
        }
        if (c0788Hz.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C05969v(A05(93, 21, 41) + Integer.toHexString(i));
        }
        if (c0788Hz.A0E() != 118 || c0788Hz.A0E() != 111 || c0788Hz.A0E() != 114 || c0788Hz.A0E() != 98 || c0788Hz.A0E() != 105 || c0788Hz.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C05969v(A05(10, 28, 123));
        }
        return true;
    }

    public static Ct[] A0B(C0665Cp c0665Cp) {
        int iA02 = c0665Cp.A02(6) + 1;
        Ct[] ctArr = new Ct[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            boolean zA04 = c0665Cp.A04();
            int iA022 = c0665Cp.A02(16);
            int i = c0665Cp.A02(16);
            ctArr[windowType] = new Ct(zA04, iA022, i, c0665Cp.A02(8));
        }
        return ctArr;
    }

    public static Ct[] A0C(C0788Hz c0788Hz, int i) throws C05969v {
        A0A(5, c0788Hz, false);
        int iA0E = c0788Hz.A0E() + 1;
        C0665Cp c0665Cp = new C0665Cp(c0788Hz.A00);
        int numberOfBooks = c0788Hz.A06();
        c0665Cp.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < iA0E; numberOfBooks2++) {
            A02(c0665Cp);
        }
        int numberOfBooks3 = c0665Cp.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = c0665Cp.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C05969v(A05(311, 52, 47));
            }
        }
        A08(c0665Cp);
        A09(c0665Cp);
        A07(i, c0665Cp);
        Ct[] ctArrA0B = A0B(c0665Cp);
        if (c0665Cp.A04()) {
            return ctArrA0B;
        }
        throw new C05969v(A05(155, 43, 85));
    }
}
