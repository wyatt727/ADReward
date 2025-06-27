package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class ZN extends KT {
    public final /* synthetic */ ZM A00;
    public final /* synthetic */ B0 A01;

    public ZN(ZM zm, B0 b0) {
        this.A00 = zm;
        this.A01 = b0;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1A());
        this.A00.A02.A1c(true, true);
    }
}
