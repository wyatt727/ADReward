package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05869k {
    public int A00;
    public int A01;
    public C05979w A02;
    public boolean A03;

    public C05869k() {
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03 && this.A00 != 4) {
            AbstractC0763Ha.A03(i == 4);
        } else {
            this.A03 = true;
            this.A00 = i;
        }
    }

    public final void A05(C05979w c05979w) {
        this.A02 = c05979w;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C05979w c05979w) {
        return c05979w != this.A02 || this.A01 > 0 || this.A03;
    }
}
