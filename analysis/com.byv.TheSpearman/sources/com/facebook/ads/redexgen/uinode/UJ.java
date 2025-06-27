package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class UJ implements O0 {
    public final /* synthetic */ UD A00;

    public UJ(UD ud) {
        this.A00 = ud;
    }

    @Override // com.facebook.ads.redexgen.uinode.O0
    public final void AAh() {
        if (this.A00.A0V()) {
            this.A00.A0L();
            this.A00.A0W.setToolbarActionMessage("");
            this.A00.A0W.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.O0
    public final void ACB() {
        this.A00.A0C = false;
        this.A00.A0L.A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.O0
    public final void ACC() {
        this.A00.A0C = true;
        this.A00.A0L.A06();
    }
}
