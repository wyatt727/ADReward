package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class HV {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{64, 93, 74, 122, 73, 64, 75, 10, 23, 0, 48, 29, 10, 11, 6, 29};
    }

    public static long A00(HU hu) {
        return hu.A5p(A02(0, 7, 70), -1L);
    }

    public static Uri A01(HU hu) {
        String strA5r = hu.A5r(A02(7, 9, 12), null);
        if (strA5r == null) {
            return null;
        }
        return Uri.parse(strA5r);
    }

    public static void A04(HW hw) {
        hw.A01(A02(7, 9, 12));
    }

    public static void A05(HW hw, long j) {
        hw.A02(A02(0, 7, 70), j);
    }

    public static void A06(HW hw, Uri uri) {
        hw.A03(A02(7, 9, 12), uri.toString());
    }
}
