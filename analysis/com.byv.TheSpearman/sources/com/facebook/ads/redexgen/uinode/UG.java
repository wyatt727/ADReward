package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class UG implements MA {
    public final /* synthetic */ UD A00;

    public UG(UD ud) {
        this.A00 = ud;
    }

    @Override // com.facebook.ads.redexgen.uinode.MA
    public final void AB6() {
        if (this.A00.A0W() && !this.A00.A0S.get()) {
            this.A00.A0Q.A07(this.A00);
            return;
        }
        if (!this.A00.A0U || this.A00.A0S.get() || !this.A00.A0V()) {
            this.A00.A0K.A04(J9.A07, null);
            this.A00.A0N.A43(this.A00.A0O.A6u());
        } else {
            this.A00.A0W.setToolbarActionMode(0);
            this.A00.A0L();
        }
    }
}
