package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1063Sv implements L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KT A01;
    public final /* synthetic */ AbstractC1060Ss A02;

    public C1063Sv(AbstractC1060Ss abstractC1060Ss, int i, KT kt) {
        this.A02 = abstractC1060Ss;
        this.A00 = i;
        this.A01 = kt;
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ABA() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ACm(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
