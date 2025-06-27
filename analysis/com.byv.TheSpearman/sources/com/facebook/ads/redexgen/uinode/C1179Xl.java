package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1179Xl implements C4 {
    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void A5n(Format format) {
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final int AFQ(InterfaceC0646Bt interfaceC0646Bt, int i, boolean z) throws InterruptedException, IOException {
        int iAGM = interfaceC0646Bt.AGM(i);
        if (iAGM == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return iAGM;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFR(C0788Hz c0788Hz, int i) {
        c0788Hz.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFS(long j, int i, int i2, int i3, C3 c3) {
    }
}
