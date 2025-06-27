package com.facebook.ads.redexgen.uinode;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1144Vz implements InterfaceC0757Gt {
    public final Context A00;
    public final InterfaceC0757Gt A01;
    public final HG<? super InterfaceC0758Gu> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1144Vz(Context context, HG<? super InterfaceC0758Gu> hg, InterfaceC0757Gt interfaceC0757Gt) {
        this.A00 = context.getApplicationContext();
        this.A02 = hg;
        this.A01 = interfaceC0757Gt;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1144Vz(Context context, String str, HG<? super InterfaceC0758Gu> hg) {
        this(context, hg, new AnonymousClass41(str, hg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0757Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final W0 A4X() {
        return new W0(this.A00, this.A02, this.A01.A4X());
    }
}
