package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class VC extends AbstractC03720q {
    public static byte[] A01;
    public final /* synthetic */ V2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, Base64.padSymbol, 50, Utf8.REPLACEMENT_BYTE, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, Base64.padSymbol, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public VC(V2 v2) {
        this.A00 = v2;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0B(C1325bK c1325bK) {
        this.A00.A1T(c1325bK);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0C() {
        if (this.A00.A0G != null) {
            this.A00.A0G.AAc();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0F(InterfaceC03710p interfaceC03710p) {
        if (this.A00.A0A != null) {
            this.A00.A0A.A0J();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0G(C0813Jb c0813Jb) {
        this.A00.A11().A0E().A2m(C0865Lf.A01(this.A00.A00), c0813Jb.A03().getErrorCode(), c0813Jb.A04());
        if (this.A00.A0G != null) {
            this.A00.A0G.ABR(c0813Jb);
        }
    }
}
