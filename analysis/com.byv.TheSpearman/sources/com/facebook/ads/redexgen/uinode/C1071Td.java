package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1071Td implements L8 {
    public final /* synthetic */ BI A00;

    public C1071Td(BI bi) {
        this.A00 = bi;
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ABA() {
        this.A00.A07 = false;
        if (this.A00.A04 != null) {
            this.A00.A04.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ACm(float f) {
        if (this.A00.A04 != null) {
            this.A00.A04.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0G().A00())));
        }
    }
}
