package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SE extends KT {
    public final /* synthetic */ SA A00;

    public SE(SA sa) {
        this.A00 = sa;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (!this.A00.A03) {
            C05688r c05688r = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c05688r.A02(new AbstractC0985Pv(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.93
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
