package com.facebook.ads.redexgen.uinode;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum LA {
    A05(0),
    A06(1),
    A04(2);

    public static byte[] A01;
    public static String[] A02 = {"D", "C", "8vWlkexf09f1piT", "bgKjpA4PjvHZdywoorD", "7PPvca8DkKgRdh14PD5p9M98ffpM", "UMv18", "Efwwh", "kVnW00famwT2UvCG2iLw1Nw0GuoWmmQs"};
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT;
        strArr[0] = "v";
        A01 = new byte[]{117, 104, 104, 115, 98, 99, 122, 97, 100, 97, 96, 120, 97, 68, 95, 67, 94, 94, 69, 84, 85};
    }

    static {
        A01();
    }

    LA(int i) {
        this.A00 = i;
    }
}
