package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05347e {
    public static final AtomicReference<C1206Ym> A00 = new AtomicReference<>();

    public static C1206Ym A00() {
        return A00.get();
    }

    public static void A01(C1206Ym c1206Ym) {
        if (c1206Ym == null) {
            return;
        }
        AbstractC05337d.A00(A00, null, c1206Ym);
    }
}
