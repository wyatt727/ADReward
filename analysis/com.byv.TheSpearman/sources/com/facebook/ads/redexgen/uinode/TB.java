package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TB extends RD {
    public static byte[] A01;
    public final /* synthetic */ PQ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 81, 88, 80, 87, 92, 93, 102, 88, 93, 102, 80, 87, 93, 92, 65};
    }

    public TB(PQ pq) {
        this.A00 = pq;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A12())) {
                Map<String, String> mapA05 = new C0920Ni().A03(this.A00.A0B).A02(this.A00.A08).A04(this.A00.A05.A0O()).A05();
                mapA05.put(A00(0, 16, 10), A00(0, 0, 11) + this.A00.A01);
                this.A00.A07.A9g(this.A00.A05.A12(), mapA05);
                C1U.A07(this.A00.A05.A0y(), this.A00.A06);
                this.A00.A06.A0E().A2k();
                if (!this.A00.A03) {
                    C2O.A00(this.A00.A05.A0N());
                }
                if (!this.A00.A04) {
                    this.A00.A09.A43(this.A00.A0A.A7B());
                }
            }
        }
    }
}
