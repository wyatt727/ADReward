package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class YV implements RI {
    public static byte[] A01;
    public final C1206Ym A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, 27, 26, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, 100, 86, 99, 30, 82, 88, 86, 95, 101};
    }

    public YV(C1206Ym c1206Ym) {
        this.A00 = c1206Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.RI
    public final Map<String, String> A5o(boolean z) {
        HashMap map = new HashMap();
        if (!C6E.A00().A04()) {
            map.put(A00(0, 23, 39), C05628l.A00().A01(this.A00, true).A03());
        }
        map.put(A00(23, 10, 114), AbstractC05658o.A06(new C8K(this.A00), this.A00, z));
        return map;
    }
}
