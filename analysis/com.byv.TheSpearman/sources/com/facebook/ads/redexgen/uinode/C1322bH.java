package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1322bH implements AnonymousClass61 {
    public final /* synthetic */ FY A00;
    public final /* synthetic */ boolean A01;

    public C1322bH(FY fy, boolean z) {
        this.A00 = fy;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        if (!C0796Ih.A1R(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.ACy(this.A00);
        } else {
            FY fy = this.A00;
            fy.A06 = PC.A01(fy.A04, (FS) this.A00.A03, 0, new C1323bI(this));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        this.A00.A01.AD1(this.A00, AdError.CACHE_ERROR);
    }
}
