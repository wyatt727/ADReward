package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class EX extends O7 {
    public final /* synthetic */ C04915h A00;

    public EX(C04915h c04915h) {
        this.A00 = c04915h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o8) {
        if (this.A00.A08 != null) {
            V2.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
