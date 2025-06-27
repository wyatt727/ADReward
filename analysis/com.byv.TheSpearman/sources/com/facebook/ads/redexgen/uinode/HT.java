package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HT implements S1 {
    public final EnumC1035Rt A00;
    public final AnonymousClass74 A01;

    public HT(AnonymousClass74 anonymousClass74, EnumC1035Rt enumC1035Rt) {
        this.A01 = anonymousClass74;
        this.A00 = enumC1035Rt;
    }

    @Override // com.facebook.ads.redexgen.uinode.S1
    public void A3Z(Map<InterfaceC1025Rj, S6> map, Map<SyncModifiableBundle, EnumC1035Rt> map2) {
        map2.put(null, this.A00);
    }
}
