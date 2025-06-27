package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1299au implements InterfaceC03981q {
    public final /* synthetic */ C03901i A00;

    public C1299au(C03901i c03901i) {
        this.A00 = c03901i;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03981q
    public final void ACZ(AdError adError) {
        this.A00.A04.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03981q
    public final void ACa() {
        this.A00.A04.AAf();
    }
}
