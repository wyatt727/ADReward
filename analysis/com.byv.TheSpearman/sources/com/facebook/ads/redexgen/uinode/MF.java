package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class MF implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC0635Bi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 56, 46, 57, 20, 41, 62, 45, 45, 46, 57, 46, 47, 20, 40, 39, 34, 40, 32, 20, 42, 45, Utf8.REPLACEMENT_BYTE, 46, 57, 20, 47, 46, 39, 42, 50};
    }

    public MF(ViewOnClickListenerC0635Bi viewOnClickListenerC0635Bi) {
        this.A00 = viewOnClickListenerC0635Bi;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 125));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
