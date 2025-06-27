package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class TR implements InterfaceC0919Nh {
    public final WeakReference<B4> A00;

    public TR(B4 b4) {
        this.A00 = new WeakReference<>(b4);
    }

    public /* synthetic */ TR(B4 b4, BH bh) {
        this(b4);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Nh
    public final void ABh(boolean z) {
        B4 cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z;
            cardLayout.A04();
        }
    }
}
