package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1388cY {
    public InterfaceC1389cZ A00;

    public final void A00() {
        InterfaceC1389cZ interfaceC1389cZ = this.A00;
        if (interfaceC1389cZ != null) {
            interfaceC1389cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1389cZ interfaceC1389cZ = this.A00;
        if (interfaceC1389cZ != null) {
            interfaceC1389cZ.onStop();
        }
    }

    public final void A02(InterfaceC1389cZ interfaceC1389cZ) {
        this.A00 = interfaceC1389cZ;
    }
}
