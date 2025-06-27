package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DE {
    public final int A00;
    public final long A01;

    public DE(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static DE A00(InterfaceC0646Bt interfaceC0646Bt, C0788Hz c0788Hz) throws InterruptedException, IOException {
        interfaceC0646Bt.ADv(c0788Hz.A00, 0, 8);
        c0788Hz.A0Y(0);
        int iA08 = c0788Hz.A08();
        long size = c0788Hz.A0K();
        return new DE(iA08, size);
    }
}
