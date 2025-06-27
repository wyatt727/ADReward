package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class J8 implements InterfaceC1036Ru {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1036Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1036Ru
    public final void AGQ(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
