package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1154Wm implements InterfaceC0645Bs {
    public static byte[] A05;
    public static String[] A06 = {"4UYaWsXN1cGpTlRGsO1EVWVYv3mJMVWU", "hbK8JAe0mxfaYRX1PJWZwY", "A0tXjRJ", "osk77A0r9", "0YYQ7Ec", "0ahCLR5uyRlwKx93emwBc8GJDT750HRT", "YIO", "F1mMZvBQ8EiEftVGCLgPL0zcj9avMacR"};
    public static final InterfaceC0648Bv A07;
    public int A00;
    public int A01;
    public InterfaceC0647Bu A02;
    public C4 A03;
    public C1153Wl A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 78, 83, 85, 80, 80, 79, 82, 84, 69, 68, 0, 79, 82, 0, 85, 78, 82, 69, 67, 79, 71, 78, 73, 90, 69, 68, 0, 87, 65, 86, 0, 72, 69, 65, 68, 69, 82, 14, 52, 72, 55, 60, 66, 2, 69, 52, 74};
    }

    static {
        A01();
        A07 = new C1155Wn();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void A8o(InterfaceC0647Bu interfaceC0647Bu) {
        this.A02 = interfaceC0647Bu;
        this.A03 = interfaceC0647Bu.AGi(0, 1);
        this.A04 = null;
        interfaceC0647Bu.A5Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final int AEH(InterfaceC0646Bt interfaceC0646Bt, C0650Bz c0650Bz) throws InterruptedException, IOException {
        if (this.A04 == null) {
            C1153Wl c1153WlA00 = DF.A00(interfaceC0646Bt);
            this.A04 = c1153WlA00;
            if (c1153WlA00 != null) {
                this.A03.A5n(Format.A06(null, A00(39, 9, 113), null, c1153WlA00.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C05969v(A00(0, 39, 126));
            }
        }
        C1153Wl c1153Wl = this.A04;
        if (A06[0].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "XBd";
        strArr[3] = "hS3DTCCH9";
        if (!c1153Wl.A07()) {
            DF.A03(interfaceC0646Bt, this.A04);
            this.A02.AFi(this.A04);
        }
        int iAFQ = this.A03.AFQ(interfaceC0646Bt, 32768 - this.A01, true);
        if (iAFQ != -1) {
            this.A01 += iAFQ;
        }
        int i = this.A01 / this.A00;
        if (i > 0) {
            long jA05 = this.A04.A05(interfaceC0646Bt.A7i() - this.A01);
            int i2 = this.A00 * i;
            int i3 = this.A01 - i2;
            this.A01 = i3;
            this.A03.AFS(jA05, 1, i2, i3, null);
        }
        return iAFQ == -1 ? -1 : 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void AFh(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final boolean AGR(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        return DF.A00(interfaceC0646Bt) != null;
    }
}
