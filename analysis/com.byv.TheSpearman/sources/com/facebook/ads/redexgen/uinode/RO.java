package com.facebook.ads.redexgen.uinode;

import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class RO {
    public RS A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final RO A00(RS rs) {
        this.A00 = rs;
        return this;
    }

    public final RO A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final RO A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final RO A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final RO A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final RP A05() {
        return new RP(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
