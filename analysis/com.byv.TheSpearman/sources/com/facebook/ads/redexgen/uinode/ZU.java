package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class ZU extends KG {
    public final /* synthetic */ ZQ A00;
    public final /* synthetic */ C0813Jb A01;

    public ZU(ZQ zq, C0813Jb c0813Jb) {
        this.A00 = zq;
        this.A01 = c0813Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.KG
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onError(this.A00.A01.A07(), L1.A00(this.A01));
        }
    }
}
