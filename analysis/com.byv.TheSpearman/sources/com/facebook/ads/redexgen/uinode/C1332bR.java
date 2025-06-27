package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1332bR extends KT {
    public final /* synthetic */ C1331bQ A00;
    public final /* synthetic */ B0 A01;

    public C1332bR(C1331bQ c1331bQ, B0 b0) {
        this.A00 = c1331bQ;
        this.A01 = b0;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}
