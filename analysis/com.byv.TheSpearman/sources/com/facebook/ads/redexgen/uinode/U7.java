package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class U7 implements InterfaceC0902Mq {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ AbstractC0900Mo A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public U7(AbstractC0900Mo abstractC0900Mo) {
        this.A00 = abstractC0900Mo;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0902Mq
    public final void A4L() {
        if (this.A00.A07 != null) {
            this.A00.A07.A43(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0902Mq
    public final void A4M() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.ACu(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0902Mq
    public final void A8P() {
        if (this.A00.A03 == null) {
            A4M();
            return;
        }
        AbstractC0900Mo.A01(this.A00);
        if (this.A00.A03.A02() == null) {
            AbstractC0900Mo abstractC0900Mo = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            abstractC0900Mo.A0C();
        } else {
            AbstractC0900Mo abstractC0900Mo2 = this.A00;
            abstractC0900Mo2.A0E(abstractC0900Mo2.A03.A02());
        }
        if (Build.VERSION.SDK_INT >= 16 && C0796Ih.A23(this.A00.A05)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0902Mq
    public final void A9N() {
        if (!TextUtils.isEmpty(this.A00.A04.A0I())) {
            C0855Kv.A0M(new C0855Kv(), this.A00.A05, AbstractC0858Ky.A00(this.A00.A04.A0I()), this.A00.A09);
        }
        this.A00.A02.A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0902Mq
    public final void A9O() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.ACu(true);
        }
        if (!TextUtils.isEmpty(this.A00.A04.A0C())) {
            C0855Kv.A0M(new C0855Kv(), this.A00.A05, AbstractC0858Ky.A00(this.A00.A04.A0C()), this.A00.A09);
        }
        this.A00.A02.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0902Mq
    public final void ACI(C2U c2u) {
        AbstractC0900Mo.A00(this.A00);
        this.A00.A01 = c2u;
        this.A00.A0E(this.A00.A01 == C2U.A03 ? this.A00.A04.A0A() : this.A00.A04.A0B());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0902Mq
    public final void ACS(C2W c2w) {
        AbstractC0900Mo.A00(this.A00);
        this.A00.A02.A07(c2w.A01());
        if (!c2w.A05().isEmpty()) {
            this.A00.A0E(c2w);
        } else {
            this.A00.A0D(c2w);
        }
    }
}
