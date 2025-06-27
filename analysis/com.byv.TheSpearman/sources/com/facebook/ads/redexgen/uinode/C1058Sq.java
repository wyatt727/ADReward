package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1058Sq implements InterfaceC0967Pd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1056So A01;

    public C1058Sq(C1056So c1056So, int i) {
        this.A01 = c1056So;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0967Pd
    public final void AAu() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0967Pd
    public final void ABH(int i) {
        C1056So.A02(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0967Pd
    public final void ABY(float f) {
        if (!this.A01.A08) {
            this.A01.A0G(f);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0967Pd
    public final void AD7(boolean z) {
        this.A01.A0Q(z);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0967Pd
    public final void ADX(String str) {
        this.A01.A0D.A0E().A2z(str);
        this.A01.A0H.A43(this.A01.A0J.A6y());
        this.A01.A0H(3);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0967Pd
    public final void AGq() {
        this.A01.A09 = false;
        this.A01.A0I.setProgressImmediate(0.0f);
        this.A01.A0I.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0967Pd
    public final void AGr(float f) {
        this.A01.A0I.setProgress(100.0f * f);
    }
}
