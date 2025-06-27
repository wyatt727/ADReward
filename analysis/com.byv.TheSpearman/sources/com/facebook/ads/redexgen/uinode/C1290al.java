package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1290al extends KT {
    public final /* synthetic */ C1327bM A00;
    public final /* synthetic */ C04031v A01;
    public final /* synthetic */ FQ A02;

    public C1290al(FQ fq, C04031v c04031v, C1327bM c1327bM) {
        this.A02 = fq;
        this.A01 = c04031v;
        this.A00 = c1327bM;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C0813Jb c0813JbA00 = C0813Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(c0813JbA00.A03().getErrorCode(), c0813JbA00.A04());
        this.A02.A06.A0G(c0813JbA00);
    }
}
