package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class YW implements KZ {
    public static byte[] A01;
    public final /* synthetic */ C1206Ym A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, Utf8.REPLACEMENT_BYTE, 34, 42, Utf8.REPLACEMENT_BYTE, 57, 46, Utf8.REPLACEMENT_BYTE, 62, 122, Utf8.REPLACEMENT_BYTE, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, Byte.MAX_VALUE, 118, 126};
    }

    public YW(C1206Ym c1206Ym) {
        this.A00 = c1206Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.KZ
    public final void A9S(int i, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A07().A9a(A00(34, 12, 21), i, new C8B(th));
    }
}
