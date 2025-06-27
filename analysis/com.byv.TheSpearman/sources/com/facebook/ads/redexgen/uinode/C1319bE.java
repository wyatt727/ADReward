package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1319bE implements InterfaceC03981q {
    public final /* synthetic */ FY A00;

    public C1319bE(FY fy) {
        this.A00 = fy;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03981q
    public final void ACZ(AdError adError) {
        this.A00.A01.AD1(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03981q
    public final void ACa() {
        this.A00.A0C.set(true);
        this.A00.A01.ACy(this.A00);
    }
}
