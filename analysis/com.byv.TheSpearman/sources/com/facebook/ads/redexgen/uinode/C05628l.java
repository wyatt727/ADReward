package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05628l {
    public static C05628l A00 = new C05628l();

    public static C05628l A00() {
        return A00;
    }

    public final YI A01(C05357f c05357f, boolean z) {
        return new YI(c05357f, z, new C6S());
    }

    public final Map<String, String> A02(C05357f c05357f) {
        try {
            return A01(c05357f, false).A05();
        } catch (Throwable th) {
            c05357f.A07().A3c(th);
            return C05548d.A01(c05357f);
        }
    }
}
