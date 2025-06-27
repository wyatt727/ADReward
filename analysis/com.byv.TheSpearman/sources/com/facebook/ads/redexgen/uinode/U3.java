package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class U3 implements NT {
    public final /* synthetic */ NJ A00;

    public U3(NJ nj) {
        this.A00 = nj;
    }

    @Override // com.facebook.ads.redexgen.uinode.NT
    public final void AAv(boolean z) {
        if (this.A00.A08 && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z);
            this.A00.A00.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.NT
    public final void ABZ(boolean z) {
        if (this.A00.A08 && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z);
            this.A00.A02.setAlpha(z ? 1.0f : 0.3f);
        }
    }
}
