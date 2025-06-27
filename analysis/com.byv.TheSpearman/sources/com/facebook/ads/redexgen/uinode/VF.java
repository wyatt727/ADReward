package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class VF implements JK {
    public WeakReference<V2> A00;

    public VF(V2 v2) {
        this.A00 = new WeakReference<>(v2);
    }

    @Override // com.facebook.ads.redexgen.uinode.JK
    public final void ACX(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z, false);
        }
    }
}
