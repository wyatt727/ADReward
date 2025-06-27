package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0979Pp {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1G A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, 12, 10, 27, 13, 18, 23, 13};
    }

    public C0979Pp(int i, int i2, C1G c1g) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c1g;
    }

    public final int A02() {
        return this.A01;
    }

    public final C1G A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap map = new HashMap();
        StringBuilder sbAppend = new StringBuilder().append(this.A01);
        String strA00 = A00(0, 0, 12);
        map.put(A00(7, 7, 94), sbAppend.append(strA00).toString());
        map.put(A00(0, 7, 55), this.A00 + strA00);
        return map;
    }
}
