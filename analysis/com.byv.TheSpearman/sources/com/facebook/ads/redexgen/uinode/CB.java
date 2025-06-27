package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CB extends WW implements InterfaceC0700El {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0648Bv A05;
    public final InterfaceC0757Gt A06;
    public final Object A07;
    public final String A08;

    public CB(Uri uri, InterfaceC0757Gt interfaceC0757Gt, InterfaceC0648Bv interfaceC0648Bv, int i, String str, int i2, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0757Gt;
        this.A05 = interfaceC0648Bv;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new WN(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.uinode.WW
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.uinode.WW
    public final void A03(Y6 y6, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0705Eq
    public final WP A4k(C0703Eo c0703Eo, InterfaceC0750Gm interfaceC0750Gm) {
        AbstractC0763Ha.A03(c0703Eo.A02 == 0);
        return new CD(this.A04, this.A06.A4X(), this.A05.A4b(), this.A03, A00(c0703Eo), this, interfaceC0750Gm, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0705Eq
    public final void AAO() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0700El
    public final void AD9(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0705Eq
    public final void AEa(WP wp) {
        ((CD) wp).A0R();
    }
}
