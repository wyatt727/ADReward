package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.7T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7T extends MX {
    public final /* synthetic */ L7 A00;

    public C7T(L7 l7) {
        this.A00 = l7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MY my) {
        if (this.A00.A01 == null || my.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new QX(this));
    }
}
