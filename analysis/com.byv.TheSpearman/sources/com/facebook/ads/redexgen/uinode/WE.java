package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0727Fo {
    public final long[] A00;
    public final C0726Fn[] A01;

    public WE(C0726Fn[] c0726FnArr, long[] jArr) {
        this.A01 = c0726FnArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final List<C0726Fn> A6Z(long j) {
        C0726Fn c0726Fn;
        int iA0B = IF.A0B(this.A00, j, true, false);
        if (iA0B == -1 || (c0726Fn = this.A01[iA0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(c0726Fn);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final long A70(int i) {
        boolean z = true;
        AbstractC0763Ha.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC0763Ha.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A7T(long j) {
        int iA0A = IF.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
