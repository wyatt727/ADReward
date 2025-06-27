package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SQ implements C5T {
    public final /* synthetic */ C5V A00;
    public final /* synthetic */ C9P A01;

    public SQ(C9P c9p, C5V c5v) {
        this.A01 = c9p;
        this.A00 = c5v;
    }

    @Override // com.facebook.ads.redexgen.uinode.C5T
    public final boolean A8u() {
        if (!this.A01.A0X()) {
            if (this.A01.A0Y()) {
                return true;
            }
            return this.A01.A0Z();
        }
        this.A01.A0W(this.A00);
        return true;
    }
}
