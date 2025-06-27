package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.41, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass41 extends AbstractC0638Bl {
    public final int A00;
    public final int A01;
    public final HG<? super InterfaceC0758Gu> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HG<? super InterfaceC0758Gu> hg) {
        this(str, hg, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HG<? super InterfaceC0758Gu> hg, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = hg;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC0638Bl
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0639Bm A01(H5 h5) {
        return new C0639Bm(this.A03, null, this.A02, this.A00, this.A01, this.A04, h5);
    }
}
