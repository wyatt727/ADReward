package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1333bS implements AnonymousClass61 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1328bN A01;
    public final /* synthetic */ C1328bN A02;
    public final /* synthetic */ C8T A03;

    public C1333bS(C1328bN c1328bN, int i, C8T c8t, C1328bN c1328bN2) {
        this.A01 = c1328bN;
        this.A00 = i;
        this.A03 = c8t;
        this.A02 = c1328bN2;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.A00.ABw(this.A02, C0813Jb.A00(AdErrorType.NO_FILL));
    }
}
