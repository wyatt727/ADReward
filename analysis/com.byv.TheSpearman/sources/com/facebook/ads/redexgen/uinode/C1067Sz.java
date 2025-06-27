package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1067Sz extends KT {
    public static byte[] A02;
    public final /* synthetic */ C1065Sx A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Byte.MAX_VALUE, -78, -93, -93, -94, -81, -90, -85, -92, 93, -90, -85, -95, -94, -93, -90, -85, -90, -79, -94, -87, -74};
    }

    public C1067Sz(C1065Sx c1065Sx, AnonymousClass93 anonymousClass93) {
        this.A00 = c1065Sx;
        this.A01 = anonymousClass93;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (this.A00.A0Z.getState() == RB.A02 && this.A00.A0Z.getCurrentPositionInMillis() == A00()) {
            this.A00.A0X.ADX(A00(0, 22, 43));
        }
    }
}
