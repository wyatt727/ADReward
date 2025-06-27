package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONArray;

/* loaded from: assets/audience_network.dex */
public enum L2 {
    A06(0),
    A0F(1),
    A07(2),
    A0G(3),
    A08(4),
    A05(5),
    A0D(6),
    A0E(7),
    A0J(8),
    A0C(9),
    A09(10),
    A0H(11),
    A0I(16),
    A0B(17),
    A0A(18);

    public static byte[] A01;
    public static final L2[] A02;
    public static final String A03;
    public final int A00;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-77, -74, -47, -75, -70, -63, -69, -75, -73, -59, -115, -100, -100, -85, -115, -112, 98, 113, 113, Byte.MIN_VALUE, 98, 101, Byte.MIN_VALUE, 119, 83, -120, -105, -105, -90, -116, -107, -114, -120, -114, -116, -108, -116, -107, -101, -90, -120, -117, 112, 111, 124, 124, 115, Byte.MIN_VALUE, -115, -126, 125, -115, 119, 124, -126, 115, Byte.MIN_VALUE, -127, -126, 119, -126, 119, 111, 122, -68, -56, -69, -57, -53, -69, -60, -71, -49, -43, -71, -73, -58, -58, -65, -60, -67, 100, 112, 112, 108, 123, 104, 101, 106, 103, 111, 104, 109, 107, 104, 109, 100, 126, 117, 104, 99, 100, 110, 126, 96, 99, -73, -64, -52, -63, -65, -74, -76, -76, -78, -65, -122, -113, -101, -112, -114, -123, -125, -125, -127, -114, -101, -118, -117, -101, 125, -111, -112, -117, -101, -123, -119, -116, -101, -120, -117, -125, -125, -123, -118, -125, -110, -113, -108, -111, -91, -121, -118, -43, -46, -41, -44, -24, -54, -51, -24, -33, -69, -47, -60, -41, -52, -39, -56, -30, -58, -49, -46, -42, -56, -30, -59, -40, -41, -41, -46, -47, -72, -79, -84, -87, -84, -88, -89, -62, -81, -78, -86, -86, -84, -79, -86, -123, 120, 115, 116, 126, -114, 112, 115};
    }

    static {
        A03();
        L2[] l2Arr = {A0G, A08, A05, A0E, A0H, A0I, A0B, A0A};
        A02 = l2Arr;
        JSONArray array = new JSONArray();
        for (L2 l2 : l2Arr) {
            array.put(l2.A00());
        }
        A03 = array.toString();
    }

    L2(int i) {
        this.A00 = i;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A03;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
