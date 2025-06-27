package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WS implements FB {
    public final int A00;
    public final /* synthetic */ CD A01;

    public WS(CD cd, int i) {
        this.A01 = cd;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final boolean A9C() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final void AAM() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final int AEK(C05909p c05909p, C1185Xr c1185Xr, boolean z) {
        return this.A01.A0P(this.A00, c05909p, c1185Xr, z);
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final int AGO(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
