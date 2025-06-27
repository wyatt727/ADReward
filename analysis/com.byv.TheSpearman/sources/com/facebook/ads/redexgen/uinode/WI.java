package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WI implements InterfaceC0727Fo {
    public final List<C0726Fn> A00;

    public WI(List<C0726Fn> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final List<C0726Fn> A6Z(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final long A70(int i) {
        AbstractC0763Ha.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A71() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A7T(long j) {
        return j < 0 ? 0 : -1;
    }
}
