package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03760u {
    public static InterfaceC03710p A00;

    public final InterfaceC03710p A00(C1207Yn c1207Yn, AdPlacementType adPlacementType) {
        InterfaceC03710p interfaceC03710p = A00;
        if (interfaceC03710p != null) {
            return interfaceC03710p;
        }
        switch (C03750t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1328bN();
            case 2:
                return new C1327bM();
            case 3:
                return new C1325bK(c1207Yn);
            case 4:
                return new C0716Fb(c1207Yn);
            case 5:
                return new FY();
            default:
                return null;
        }
    }
}
