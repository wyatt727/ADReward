package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.8b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05528b {
    public static byte[] A00;
    public static String[] A01 = {"y8PCDKtn8ucpWGHfqNdB7sz1AvxWDZl3", "5Uq5Tef01e5KR7nT6LwcHl3Vg4tg40ar", "x9FTdDf00FrCnddkCjcdWeA", "gJiYN9ifTBNONuuvPUf8ziVgoR00vK3d", "v3Miu0NURb4uLk241XhX4ihrJ8pIqCRx", "uSiAXhU6isZ", "cMhUI2Br8Brps1bGyIGx9oWkH3OZduaS", "WInOHqHvpegDLpa6TzR108vL1QbKC1c7"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 31;
            if (A01[0].charAt(17) == 'S') {
                throw new RuntimeException();
            }
            A01[0] = "5vWxIODTobtAshUzPXWGHOLgD2JZewLd";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{105, 105, 100, 104, 126, 105, 109, 114, 120, 126, 100, 126, 99, 111, 105, 122, 104, 46, 46, 35, 47, 57, 46, 42, 53, Utf8.REPLACEMENT_BYTE, 57, 35, 47, 56, 55, 35, 42, 57, 46, 47, 53, 51, 50};
    }

    static {
        A03();
    }

    public static String A01(C1206Ym c1206Ym) {
        return KE.A00(c1206Ym).getString(A00(0, 17, 36), null);
    }

    public static String A02(C1206Ym c1206Ym) {
        return KE.A00(c1206Ym).getString(A00(17, 22, 99), null);
    }

    public static void A04(C1206Ym c1206Ym) {
        KE.A00(c1206Ym).edit().remove(A00(17, 22, 99)).apply();
    }

    public static void A05(C1206Ym c1206Ym, String str, String str2) {
        KE.A00(c1206Ym).edit().putString(A00(17, 22, 99), str).putString(A00(0, 17, 36), str2).apply();
    }
}
