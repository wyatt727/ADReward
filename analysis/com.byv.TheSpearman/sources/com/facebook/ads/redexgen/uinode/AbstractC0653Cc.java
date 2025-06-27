package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Cc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0653Cc {
    public static byte[] A00;
    public static String[] A01 = {"bdaFL9zMZ", "I63pCoSBBbO7fDlHhIa7BrZ6Ava1cIF3", "x5nJfB3W8HSDeHix", "yyLZDQNtNFC811gZWNvs8tiPSoT", "kE4kWLsRx96QKHczqOKboI9lp", "rJUZcTDeN", "z735Hr0viTdtcy9jRTmcNapxWooAX9zU", "rl5X7GmnpjWHRCYLou0FtooQfFV"};
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "MWn";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
            if (A01[7].length() == 12) {
                throw new RuntimeException();
            }
            A01[7] = "KMAr4";
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-44, 8, -45, 2, 25, 77, 24, 72, -8, 44, 42, -5, 22, 74, 74, 25, -49, 3, 12, -20, 32, 43, -17, 14, 66, 78, 17, -42, -67, -54, -87, Utf8.REPLACEMENT_BYTE, 38, 72, 18, Utf8.REPLACEMENT_BYTE, 38, 72, 66, -41, -35, -40, -32, 4, 25, 6, -44, 19, -31, 35, -51, 27, 24, 41, -28, 12, 26, 7, -43, 23, 33, 29, -32, 55, 65, Base64.padSymbol, 1, 62, 72, 68, 9, -9, 1, -3, -61, 9, 19, 15, -42, 40, 50, 46, 44, 14, 7, 7, 12, 24, 27, -33, -36, 97, 100, 40, 38, -10, -7, -91, -91};
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        if (r14 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013d, code lost:
    
        if (r17 != r11) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(com.facebook.ads.redexgen.uinode.InterfaceC0646Bt r16, boolean r17) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.AbstractC0653Cc.A05(com.facebook.ads.redexgen.X.Bt, boolean):boolean");
    }

    static {
        A01();
        A02 = new int[]{IF.A08(A00(79, 4, 69)), IF.A08(A00(59, 4, 52)), IF.A08(A00(63, 4, 84)), IF.A08(A00(67, 4, 91)), IF.A08(A00(71, 4, 20)), IF.A08(A00(75, 4, 38)), IF.A08(A00(43, 4, 41)), IF.A08(A00(55, 4, 42)), IF.A08(A00(51, 4, 57)), IF.A08(A00(87, 4, 49)), IF.A08(A00(91, 4, 122)), IF.A08(A00(0, 4, 39)), IF.A08(A00(4, 4, 108)), IF.A08(A00(19, 4, 63)), IF.A08(A00(23, 4, 97)), IF.A08(A00(8, 4, 75)), IF.A08(A00(12, 4, 105)), IF.A08(A00(31, 4, 120)), IF.A08(A00(27, 4, 15)), IF.A08(A00(47, 4, 51)), IF.A08(A00(83, 4, 41)), IF.A08(A00(35, 4, 120)), IF.A08(A00(95, 4, 11)), IF.A08(A00(39, 4, 16))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == IF.A08(A00(16, 3, 34))) {
            return true;
        }
        for (int i2 : A02) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        return A05(interfaceC0646Bt, true);
    }

    public static boolean A04(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        return A05(interfaceC0646Bt, false);
    }
}
