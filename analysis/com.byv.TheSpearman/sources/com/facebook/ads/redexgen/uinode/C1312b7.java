package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1312b7 implements InterfaceC0919Nh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1311b6 A01;
    public final /* synthetic */ V2 A02;

    public C1312b7(AbstractC1311b6 abstractC1311b6, int i, V2 v2) {
        this.A01 = abstractC1311b6;
        this.A00 = i;
        this.A02 = v2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Nh
    public final void ABh(boolean z) {
        if (this.A00 == 0) {
            this.A02.A1Z(this.A01.A04);
        }
        this.A02.A1c(z, true);
    }
}
