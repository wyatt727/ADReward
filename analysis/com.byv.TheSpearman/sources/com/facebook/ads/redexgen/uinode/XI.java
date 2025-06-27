package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class XI implements InterfaceC0661Cl, C1 {
    public static String[] A05 = {"RxrevBHwZunvWtoC5v6V", "BM7NoIYIDKALVkWYBFUm4mgKfD4surZT", "wT545zonAETVeqcNIpSLQKDSBA4psZtT", "O6YerNOVuBIV8g4cn8DH", "f7xxxnJira03VIlY2bxNtwSQeXyrwxct", "8kRv9b0m26r6Uh6XKMOB9WasCMU5o07v", "0W8GSaK37PxtOyOV4bIEUVoiYe2UqjRN", "TYUMHNguvpgJeUJ5Wme9D9z4"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ XH A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j) {
        int iA0B = IF.A0B(this.A02, this.A04.A04(j), true, true);
        long jA03 = this.A04.A03(this.A02[iA0B]);
        C2 c2 = new C2(jA03, this.A00 + this.A03[iA0B]);
        if (jA03 < j) {
            long[] jArr = this.A02;
            if (iA0B != jArr.length - 1) {
                return new C0(c2, new C2(this.A04.A03(jArr[iA0B + 1]), this.A00 + this.A03[iA0B + 1]));
            }
        }
        return new C0(c2);
    }

    public XI(XH xh) {
        this.A04 = xh;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(C0788Hz c0788Hz) {
        c0788Hz.A0Z(1);
        int length = c0788Hz.A0G();
        int i = length / 18;
        this.A02 = new long[i];
        this.A03 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A02[i2] = c0788Hz.A0L();
            this.A03[i2] = c0788Hz.A0L();
            c0788Hz.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0661Cl
    public final C1 A4m() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A04.A01.A01();
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0661Cl
    public final long AEI(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        long j = this.A01;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.A01 = -1L;
        if (A05[5].charAt(9) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "MeEp95NFLxRX8bxkfA2m";
        strArr[3] = "RwTpOb1Sie1PnKrI5U9E";
        return j2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0661Cl
    public final long AGX(long j) {
        long jA04 = this.A04.A04(j);
        long granule = this.A02[IF.A0B(this.A02, jA04, true, true)];
        this.A01 = granule;
        return jA04;
    }
}
