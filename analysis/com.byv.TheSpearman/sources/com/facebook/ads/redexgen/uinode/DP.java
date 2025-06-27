package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class DP extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{40, 67, 75, 78, 71, 70, 2, 86, 81, 2, 83, 87, 71, 84, 91, 2, 87, 80, 70, 71, 84, 78, 91, 75, 80, 73, 2, 79, 71, 70, 75, 67, 2, 69, 81, 70, 71, 69, 85};
    }

    public DP(Throwable th) {
        super(A00(0, 39, 116), th);
    }
}
