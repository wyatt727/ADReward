package com.facebook.ads.redexgen.uinode;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0644Br extends AbstractC1184Xq implements InterfaceC0727Fo {
    public long A00;
    public InterfaceC0727Fo A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.uinode.B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, InterfaceC0727Fo interfaceC0727Fo, long j2) {
        super.A01 = j;
        this.A01 = interfaceC0727Fo;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final List<C0726Fn> A6Z(long j) {
        return this.A01.A6Z(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final long A70(int i) {
        return this.A01.A70(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A7T(long j) {
        return this.A01.A7T(j - this.A00);
    }
}
