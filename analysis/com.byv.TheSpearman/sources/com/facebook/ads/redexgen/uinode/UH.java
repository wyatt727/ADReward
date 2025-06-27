package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UH implements L8 {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public UH(UD ud) {
        this.A00 = ud;
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ABA() {
        if (!this.A00.A0A && !this.A00.A09) {
            this.A00.A0U(false, A00(0, 9, 108));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ACm(float f) {
    }
}
