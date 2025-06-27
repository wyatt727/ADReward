package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1120Vb implements InterfaceC1027Rl {
    public static byte[] A02;
    public final /* synthetic */ C1206Ym A00;
    public final /* synthetic */ InterfaceC1025Rj A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C1120Vb(InterfaceC1025Rj interfaceC1025Rj, C1206Ym c1206Ym) {
        this.A01 = interfaceC1025Rj;
        this.A00 = c1206Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1027Rl
    public final void A45() {
        try {
            C0796Ih.A0R(this.A00).A2Y(this.A01.A6h().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e) {
            this.A00.A07().A3c(e);
        }
    }
}
