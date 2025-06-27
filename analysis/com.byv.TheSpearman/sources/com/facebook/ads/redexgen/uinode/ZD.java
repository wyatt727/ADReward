package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class ZD extends KG {
    public final /* synthetic */ ZA A00;
    public final /* synthetic */ C0813Jb A01;

    public ZD(ZA za, C0813Jb c0813Jb) {
        this.A00 = za;
        this.A01 = c0813Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.KG
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(L1.A00(this.A01));
        }
    }
}
