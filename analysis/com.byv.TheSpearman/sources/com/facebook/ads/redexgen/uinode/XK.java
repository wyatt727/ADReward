package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class XK implements C1 {
    public final /* synthetic */ XJ A00;

    public XK(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A00.A0B.A03(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long granule) {
        if (granule != 0) {
            long jA04 = this.A00.A0B.A04(granule);
            XJ xj = this.A00;
            return new C0(new C2(granule, xj.A00(xj.A09, jA04, 30000L)));
        }
        return new C0(new C2(0L, this.A00.A09));
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
