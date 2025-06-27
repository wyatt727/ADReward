package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1076Ti implements InterfaceC0919Nh {
    public final WeakReference<BK> A00;

    public C1076Ti(BK bk) {
        this.A00 = new WeakReference<>(bk);
    }

    public /* synthetic */ C1076Ti(BK bk, BP bp) {
        this(bk);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Nh
    public final void ABh(boolean z) {
        BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A04();
        }
    }
}
