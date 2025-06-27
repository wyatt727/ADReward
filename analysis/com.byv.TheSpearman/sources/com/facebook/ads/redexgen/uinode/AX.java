package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class AX extends AbstractC0984Pu {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
    }

    public AX(P3 p3) {
        this.A00 = p3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) throws JSONException {
        this.A00.A07();
        P2 p2 = this.A00.A0B;
        P3 p3 = this.A00;
        p2.ADY(A00(0, 9, 100), p3.A04(p3.A0D.getDuration()));
    }
}
