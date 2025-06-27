package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class T0 extends KT {
    public static byte[] A01;
    public final /* synthetic */ C1065Sx A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{35, 54, 49, 50, 60, -19, 68, 46, 64, -19, 59, 50, 67, 50, Utf8.REPLACEMENT_BYTE, -19, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 50, Base64.padSymbol, 46, Utf8.REPLACEMENT_BYTE, 50, 49};
    }

    public T0(C1065Sx c1065Sx) {
        this.A00 = c1065Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (!this.A00.A0S) {
            this.A00.A0X.ADX(A00(0, 24, 79));
        }
    }
}
