package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1078Tk extends KT {
    public final /* synthetic */ AbstractC0933Nv A00;

    public C1078Tk(AbstractC0933Nv abstractC0933Nv) {
        this.A00 = abstractC0933Nv;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (this.A00.isPressed()) {
            this.A00.postDelayed(this, r2.A07);
        } else {
            this.A00.setPressed(true);
            AbstractC0933Nv abstractC0933Nv = this.A00;
            abstractC0933Nv.postOnAnimationDelayed(abstractC0933Nv.A09, 250L);
        }
    }
}
