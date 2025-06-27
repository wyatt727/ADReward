package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class FZ extends AbstractC1295aq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FY A01;
    public final /* synthetic */ C1308b3 A02;
    public final /* synthetic */ FS A03;
    public final /* synthetic */ C1207Yn A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZ(FY fy, boolean z, C1207Yn c1207Yn, FS fs, C1308b3 c1308b3, int i) {
        super(z);
        this.A01 = fy;
        this.A04 = c1207Yn;
        this.A03 = fs;
        this.A02 = c1308b3;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1295aq
    public final void A00() {
        this.A01.A01.AD1(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1295aq
    public final void A01(boolean z) {
        FY.A0D = null;
        if (z) {
            this.A04.A00().AFq(this.A03.A12(), this.A02.A0w());
        }
        if (this.A00 == 0) {
            this.A01.A0C.set(true);
            this.A01.A01.ACy(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
