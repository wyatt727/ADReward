package com.facebook.ads.redexgen.uinode;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class DR {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"BAY", "ymxL57jYYv0jjQRcHQbZ4WAbO", "V4mYndI5uaXc7arEQ3TceizUtwuJpZsP", "bZ", "bvLsrur7DOWvoKolroRaEPylJxsC8CBw", "pPHP1LRPBsm50pfT1", "f9saOCuwOfCGSEN51CDIZYerwD3UjJFW", "NB4ZEOXNx"};
    public static final SparseIntArray A03;
    public static final SparseIntArray A04;
    public static final DG A05;
    public static final HashMap<DO, List<DG>> A06;
    public static final Map<String, Integer> A07;
    public static final Pattern A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00() throws DP {
        if (A00 == -1) {
            int iMax = 0;
            DG dgA06 = A06(A07(1006, 9, 38), false);
            if (dgA06 != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : dgA06.A0J()) {
                    iMax = Math.max(A01(codecProfileLevel.level), iMax);
                }
                iMax = Math.max(iMax, IF.A02 >= 21 ? 345600 : 172800);
            }
            A00 = iMax;
        }
        return A00;
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[Catch: Exception -> 0x014e, TRY_ENTER, TryCatch #0 {Exception -> 0x014e, blocks: (B:6:0x0022, B:8:0x002a, B:11:0x0036, B:39:0x00c8, B:42:0x00d8, B:44:0x00de, B:48:0x0112, B:49:0x014d, B:45:0x0109, B:46:0x010d), top: B:56:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.uinode.DG> A08(com.facebook.ads.redexgen.uinode.DO r18, com.facebook.ads.redexgen.uinode.DQ r19, java.lang.String r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.DR.A08(com.facebook.ads.redexgen.X.DO, com.facebook.ads.redexgen.X.DQ, java.lang.String):java.util.ArrayList");
    }

    public static void A0A() {
        if (A02[4].charAt(9) != 'O') {
            throw new RuntimeException();
        }
        A02[1] = "WfhNiOeVQzQSnYcncz46tqnXb";
        A01 = new byte[]{-57, -49, 3, 11, 73, 68, 76, 79, 72, 71, 3, 87, 82, 3, 84, 88, 72, 85, 92, 3, 70, 68, 83, 68, 69, 76, 79, 76, 87, 76, 72, 86, 12, -9, -92, -106, -73, -23, -23, -21, -29, -33, -28, -35, -80, -106, -101, -32, -46, -48, -30, -33, -46, -1, -28, 30, 26, 30, Base64.padSymbol, 45, 13, 13, 15, 16, 49, 47, 59, 48, 49, 62, -29, -47, -43, -48, -44, 10, -8, -4, -9, -4, -44, -62, -57, -63, -59, -31, -49, -44, -50, -45, -73, -86, -86, -92, -90, -65, -78, -78, -84, -81, -13, -26, -26, -32, -26, -72, -85, -85, -90, -85, -61, -55, -48, -63, -63, -61, -60, -27, -29, -17, -28, -27, -14, -45, -39, -32, -47, -35, -30, -34, -46, -44, -11, -13, -1, -12, -11, 2, 43, 49, 56, 53, 56, 27, 44, 77, 75, 87, 76, 77, 90, -36, -30, -23, -17, 8, 11, -5, 2, 12, -35, -2, -4, 8, -3, -2, 11, -68, -41, -33, -30, -37, -38, -106, -22, -27, -106, -25, -21, -37, -24, -17, -106, -39, -27, -38, -37, -39, -106, -67, -90, -89, -91, 49, 26, 27, 28, 25, 2, 6, 1, 48, 25, 29, 27, -31, -54, -50, -49, -64, -87, -80, -88, -60, -83, -76, -81, 18, -5, 2, 0, -3, -24, -27, -5, -23, -29, 44, 26, 23, -75, -90, -99, 18, 3, -3, 19, 24, -20, 10, 17, 18, 21, 12, 17, 10, -61, 16, 4, 15, 9, 18, 21, 16, 8, 7, -61, -28, -7, -26, -61, 6, 18, 7, 8, 6, -61, 22, 23, 21, 12, 17, 10, -35, -61, -18, 12, 19, 20, 23, 14, 19, 12, -59, 18, 6, 17, 11, 20, 23, 18, 10, 9, -59, -19, -22, -5, -24, -59, 8, 20, 9, 10, 8, -59, 24, 25, 23, 14, 19, 12, -33, -59, 8, -19, -18, -20, -35, -62, -61, -60, -17, -44, -40, -45, 6, -21, -17, -19, 3, -24, -20, -19, -61, -88, -81, -89, -5, -32, -25, -30, -50, -77, -70, -72, 5, -20, -23, -20, -45, -42, 8, -6, -28, -34, -62, -84, -87, 28, 9, 0, -1, -20, -26, 32, 35, 6, 23, 56, 54, 66, 55, 56, 69, 10, 34, 33, 38, 30, 0, 44, 33, 34, 32, 9, 38, 48, 49, -35, -2, 13, 6, -35, 33, 38, 33, 43, -28, 49, -35, 41, 38, 48, 49, -35, 48, 34, 32, 50, 47, 34, -35, 33, 34, 32, 44, 33, 34, 47, -35, 35, 44, 47, -9, -35, -32, -8, -9, -4, -12, -42, 2, -9, -8, -10, -24, 7, -4, -1, -58, -35, -16, -19, -21, -104, -87, -88, 48, 37, 51, 48, 42, 37, 14, 57, 54, 20, 6, 4, 15, -27, -4, 47, 48, 37, 38, 42, -27, -8, -8, -6, -27, -5, 28, 26, 38, 27, 28, 41, 1, -1, 10, -32, -9, 42, 43, 32, 33, 37, -32, -13, 8, -11, -32, -10, 23, 21, 33, 22, 23, 36, 12, 10, 21, -21, 2, 53, 54, 43, 44, 48, -21, -2, 19, 0, -21, 1, 34, 32, 44, 33, 34, 47, -21, 48, 34, 32, 50, 47, 34, -54, -56, -45, -87, -56, -49, -58, -87, -68, -48, -65, -60, -54, -87, -65, -64, -66, -54, -65, -64, -51, -87, -68, -68, -66, 8, 6, 17, -25, 6, 13, 4, -25, -6, 14, -3, 2, 8, -25, -3, -2, -4, 8, -3, -2, 11, -25, -3, 12, 9, -6, -4, -20, 43, 41, 52, 10, 41, 48, 39, 10, 29, 49, 32, 37, 43, 10, 32, 33, 31, 43, 32, 33, 46, 10, 46, 29, 51, -38, -40, -29, -71, -34, -48, -50, -71, -40, -37, -66, -71, -49, -16, -18, -6, -17, -16, -3, -15, -17, -6, -48, -11, -25, -27, -48, 3, 3, 5, -48, 6, 7, 5, -62, -64, -53, -95, -58, -72, -74, -95, -23, -29, -85, -95, -41, -40, -42, -7, -9, 2, -40, 17, 25, 25, 17, 22, 15, -40, 28, 11, 33, -40, 14, 15, 13, 25, 14, 15, 28, 11, 9, 20, -22, 45, 31, 43, 41, -22, 29, 49, 32, 37, 43, -22, 32, 33, 31, 43, 32, 33, 46, -22, 29, 29, 31, 14, 12, 23, -19, 48, 34, 46, 44, -19, 32, 52, 35, 40, 46, -19, 35, 36, 34, 46, 35, 36, 49, -19, 44, 47, -14, 24, 22, 33, -9, 58, 44, 56, 54, -9, Utf8.REPLACEMENT_BYTE, 50, 45, 46, 56, -9, 45, 46, 44, 56, 45, 46, 59, -9, Utf8.REPLACEMENT_BYTE, 57, 1, Utf8.REPLACEMENT_BYTE, 47, 25, 28, 32, 51, -32, -48, -70, -67, -62, -44, 49, 33, 52, 17, 15, 56, 52, 18, 21, 23, 42, 51, 75, 73, 80, 80, 73, 78, 71, 0, 67, 79, 68, 69, 67, 0, -23, 2, -1, 2, 3, 11, 2, -76, -43, -22, -41, -76, 0, -7, 10, -7, 0, -50, -76, 44, 69, 66, 69, 70, 78, 69, -9, 24, 45, 26, -9, 71, 73, 70, Base64.padSymbol, 64, 67, 60, 17, -9, 12, 37, 34, 37, 38, 46, 37, -41, -1, -4, 13, -6, -41, 35, 28, 45, 28, 35, -41, 42, 43, 41, 32, 37, 30, -15, -41, 50, 75, 72, 75, 76, 84, 75, -3, 37, 34, 51, 32, -3, 77, 79, 76, 67, 70, 73, 66, -3, 80, 81, 79, 70, 75, 68, 23, -3, -7, 10, 2, 16, 14, 10, 30, -16, -34, -36, -60, -65, -88, -36, -28, -85, -87, -92, 62, 20, 13, 25, 45, 28, 33, 39, -25, 29, 25, 27, -21, 0, 20, 3, 8, 14, -50, 4, 0, 2, -46, -52, 9, 14, 2, -25, -4, -23, -73, 66, 87, 68, 19, 73, 23, 4, 12, 24, 21, 42, 40, 40, -18, -21, -4, -73, -9, 5, -14, -64, 17, 13, 19, 27, 12, -8, -20, -3, -12, -7, -16, -9, -1, -16, -20, -1, -1, 12, 14, 11, 16, 11, 17, -20, -38, -26, -20, -18, -25, -32, -29, -47, -34, -28, -33, -29, -6, -20, -7, 
        -7, -24, -11, -10, -3, -71, 9, -4, -9, -8, 2, -62, -12, 9, -10, 43, 30, 33, 33, 26, 42, 29, 32, 32, 25, 23, -26, 53, 40, 43, 43, 36, 47, 43, 52, 50, 2, -19, -10, -12, -4, -19, 96, 75, 88, 85, 76, 82, 90, 75, 2, -19, -6, -9, -12, -4, -19};
    }

    static {
        A0A();
        A05 = DG.A01(A07(657, 22, 61));
        A08 = Pattern.compile(A07(899, 10, 19));
        A06 = new HashMap<>();
        A00 = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        A04 = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        A03 = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        A07 = map;
        map.put(A07(345, 3, 76), 1);
        map.put(A07(352, 3, 65), 4);
        map.put(A07(355, 3, 9), 16);
        map.put(A07(358, 3, 99), 64);
        map.put(A07(361, 3, 70), 256);
        map.put(A07(313, 4, 79), 1024);
        map.put(A07(317, 4, 36), 4096);
        map.put(A07(321, 4, 54), 16384);
        map.put(A07(325, 4, 77), 65536);
        map.put(A07(329, 4, 74), 262144);
        map.put(A07(333, 4, 10), 1048576);
        map.put(A07(337, 4, 66), 4194304);
        map.put(A07(341, 4, 21), 16777216);
        map.put(A07(221, 3, 72), 2);
        map.put(A07(224, 3, 70), 8);
        map.put(A07(227, 3, 119), 32);
        map.put(A07(230, 3, 0), 128);
        map.put(A07(233, 3, 93), 512);
        map.put(A07(189, 4, 8), 2048);
        map.put(A07(Opcodes.INSTANCEOF, 4, 124), 8192);
        map.put(A07(Opcodes.MULTIANEWARRAY, 4, 100), 32768);
        map.put(A07(201, 4, 123), 131072);
        map.put(A07(205, 4, 44), 524288);
        map.put(A07(209, 4, 11), 2097152);
        map.put(A07(213, 4, 15), 8388608);
        map.put(A07(217, 4, 93), 33554432);
    }

    public static int A01(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 8:
                break;
            case 16:
                break;
            case 32:
                break;
            case 64:
                break;
            case 128:
                break;
            case 256:
                break;
            case 512:
                break;
            case 1024:
                break;
            case 2048:
                break;
            case 4096:
                break;
            case 8192:
                break;
            case 16384:
                break;
            case 32768:
                break;
            case 65536:
                break;
        }
        return 9437184;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A02(java.lang.String r9) {
        /*
            r8 = 0
            if (r9 != 0) goto L4
            return r8
        L4:
            r2 = 897(0x381, float:1.257E-42)
            r1 = 2
            r0 = 85
            java.lang.String r0 = A07(r2, r1, r0)
            java.lang.String[] r3 = r9.split(r0)
            r5 = 0
            r4 = r3[r5]
            int r0 = r4.hashCode()
            switch(r0) {
                case 3006243: goto L73;
                case 3006244: goto L62;
                case 3199032: goto L52;
                case 3214780: goto L20;
                default: goto L1b;
            }
        L1b:
            r5 = -1
        L1c:
            switch(r5) {
                case 0: goto L89;
                case 1: goto L89;
                case 2: goto L84;
                case 3: goto L84;
                default: goto L1f;
            }
        L1f:
            return r8
        L20:
            r7 = 957(0x3bd, float:1.341E-42)
            r6 = 4
            r5 = 34
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.DR.A02
            r0 = 4
            r1 = r1[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            r0 = 79
            if (r1 == r0) goto L3a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.DR.A02
            java.lang.String r1 = "MmTCu4eMbW5HStPFtCsv7ZFMn3CvoIap"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "LZKP0I4cIbW5T2P3pagUWnAfz2n8Y4ic"
            r0 = 6
            r2[r0] = r1
            java.lang.String r0 = A07(r7, r6, r5)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            r5 = 1
            goto L1c
        L52:
            r2 = 953(0x3b9, float:1.335E-42)
            r1 = 4
            r0 = 25
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            goto L1c
        L62:
            r2 = 940(0x3ac, float:1.317E-42)
            r1 = 4
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            r5 = 3
            goto L1c
        L73:
            r2 = 936(0x3a8, float:1.312E-42)
            r1 = 4
            r0 = 25
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            r5 = 2
            goto L1c
        L84:
            android.util.Pair r0 = A03(r9, r3)
            return r0
        L89:
            android.util.Pair r0 = A04(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.DR.A02(java.lang.String):android.util.Pair");
    }

    public static Pair<Integer, Integer> A03(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        int length = strArr.length;
        String strA07 = A07(238, 37, 54);
        String strA072 = A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38);
        if (length < 2) {
            Log.w(strA072, strA07 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                Log.w(strA072, strA07 + str);
                return null;
            }
            int i = A04.get(numValueOf.intValue(), -1);
            if (i == -1) {
                Log.w(strA072, A07(814, 21, 106) + numValueOf);
                return null;
            }
            int i2 = A03.get(numValueOf2.intValue(), -1);
            if (i2 == -1) {
                Log.w(strA072, A07(795, 19, 39) + numValueOf2);
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (NumberFormatException unused) {
            Log.w(strA072, strA07 + str);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        android.util.Log.w(r5, A07(835, 27, 74) + r3.group(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        return new android.util.Pair<>(java.lang.Integer.valueOf(r7), r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A04(java.lang.String r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.DR.A04(java.lang.String, java.lang.String[]):android.util.Pair");
    }

    public static DG A05() {
        return A05;
    }

    public static DG A06(String str, boolean z) throws DP {
        List<DG> listA09 = A09(str, z);
        if (listA09.isEmpty()) {
            return null;
        }
        return listA09.get(0);
    }

    public static synchronized List<DG> A09(String str, boolean z) throws DP {
        DO r4 = new DO(str, z);
        HashMap<DO, List<DG>> map = A06;
        List<DG> list = map.get(r4);
        if (list != null) {
            return list;
        }
        DQ c1150Wi = IF.A02 >= 21 ? new C1150Wi(z) : new C1151Wj();
        ArrayList<DG> arrayListA08 = A08(r4, c1150Wi, str);
        if (z && arrayListA08.isEmpty() && 21 <= IF.A02 && IF.A02 <= 23) {
            c1150Wi = new C1151Wj();
            arrayListA08 = A08(r4, c1150Wi, str);
            if (!arrayListA08.isEmpty()) {
                Log.w(A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38), A07(374, 51, 80) + str + A07(34, 12, 9) + arrayListA08.get(0).A02);
            }
        }
        if (A07(922, 14, 50).equals(str)) {
            DO key = new DO(A07(912, 10, 75), r4.A01);
            arrayListA08.addAll(A08(key, c1150Wi, str));
        }
        A0B(arrayListA08);
        List<DG> listUnmodifiableList = Collections.unmodifiableList(arrayListA08);
        map.put(r4, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static void A0B(List<DG> list) {
        if (IF.A02 < 26 && list.size() > 1) {
            if (A07(583, 25, 111).equals(list.get(0).A02)) {
                for (int i = 1; i < list.size(); i++) {
                    DG dg = list.get(i);
                    if (A07(657, 22, 61).equals(dg.A02)) {
                        list.remove(i);
                        list.add(0, dg);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c1, code lost:
    
        if (A07(85, 5, 49).equals(com.facebook.ads.redexgen.uinode.IF.A03) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03d6, code lost:
    
        if (A07(769, 5, 113).equals(com.facebook.ads.redexgen.uinode.IF.A03) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (A07(364, 10, 102).equals(r8) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        if (com.facebook.ads.redexgen.uinode.IF.A03.startsWith(A07(236, 2, 94)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023a, code lost:
    
        if (A07(774, 6, 120).equals(com.facebook.ads.redexgen.uinode.IF.A03) != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0C(android.media.MediaCodecInfo r7, java.lang.String r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.DR.A0C(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    public static boolean A0D(String str) {
        if (IF.A02 <= 22) {
            if ((A07(447, 10, 116).equals(IF.A06) || A07(439, 8, 11).equals(IF.A06)) && (A07(479, 22, 69).equals(str) || A07(501, 29, 80).equals(str))) {
                return true;
            }
        }
        return false;
    }
}
