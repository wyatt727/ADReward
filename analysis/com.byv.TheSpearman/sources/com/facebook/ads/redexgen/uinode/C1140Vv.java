package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1140Vv implements InterfaceC0757Gt {
    public final HG<? super C1141Vw> A00;

    public C1140Vv() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C1140Vv(HG<? super C1141Vw> hg) {
        this.A00 = hg;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0757Gt
    public final InterfaceC0758Gu A4X() {
        return new C1141Vw(this.A00);
    }
}
