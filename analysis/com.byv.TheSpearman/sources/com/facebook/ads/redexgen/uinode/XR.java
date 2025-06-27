package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class XR implements CL {
    public final int A00;
    public final int A01;
    public final C0788Hz A02;

    public XR(XS xs) {
        C0788Hz c0788Hz = xs.A00;
        this.A02 = c0788Hz;
        c0788Hz.A0Y(12);
        this.A00 = c0788Hz.A0H();
        this.A01 = c0788Hz.A0H();
    }

    @Override // com.facebook.ads.redexgen.uinode.CL
    public final int A7o() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.CL
    public final boolean A93() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.CL
    public final int AEN() {
        int i = this.A00;
        return i == 0 ? this.A02.A0H() : i;
    }
}
