package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1128Vj implements InterfaceC0757Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC0755Gr A01;
    public final InterfaceC0757Gt A02;
    public final InterfaceC0757Gt A03;
    public final HK A04;
    public final HM A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{106, 123, 108, 104, 125, 108, 77, 104, 125, 104, 90, 96, 103, 98};
    }

    public C1128Vj(HK hk, InterfaceC0757Gt interfaceC0757Gt, InterfaceC0757Gt interfaceC0757Gt2, InterfaceC0755Gr interfaceC0755Gr, int i, HM hm) {
        this.A04 = hk;
        this.A03 = interfaceC0757Gt;
        this.A02 = interfaceC0757Gt2;
        this.A01 = interfaceC0755Gr;
        this.A00 = i;
        this.A05 = hm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0757Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1129Vk A4X() {
        HK hk = this.A04;
        InterfaceC0758Gu interfaceC0758GuA4X = this.A03.A4X();
        InterfaceC0758Gu interfaceC0758GuA4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C1129Vk(hk, interfaceC0758GuA4X, interfaceC0758GuA4X2, null, this.A00, null);
    }
}
