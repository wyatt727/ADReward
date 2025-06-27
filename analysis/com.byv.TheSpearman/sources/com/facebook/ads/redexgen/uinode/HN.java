package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HN implements S1 {
    public final C0785Hw A00;
    public final S6 A01;

    public HN(C0785Hw c0785Hw, S6 s6) {
        this.A00 = c0785Hw;
        this.A01 = s6;
    }

    @Override // com.facebook.ads.redexgen.uinode.S1
    public void A3Z(Map<InterfaceC1025Rj, S6> map, Map<SyncModifiableBundle, EnumC1035Rt> map2) {
        map.put(this.A00, this.A01);
    }
}
