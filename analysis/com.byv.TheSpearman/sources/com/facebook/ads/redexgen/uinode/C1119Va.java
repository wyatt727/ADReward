package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1119Va implements InterfaceC1393cd<C0801Io, C0806It> {
    public VX A00;

    public C1119Va(VX vx) {
        this.A00 = vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1393cd
    public final void A5c(C1390ca<C0801Io, C0806It> c1390ca, InterfaceC1380cP interfaceC1380cP) {
        switch (Im.A00[interfaceC1380cP.A8J(c1390ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1390ca, interfaceC1380cP);
                break;
        }
    }
}
