package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YR implements InterfaceC05377i {
    public final C05357f A00;

    public YR(C05357f c05357f) {
        this.A00 = c05357f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05377i
    public final Map<String, String> A4n() {
        return C05548d.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05377i
    public final Map<String, String> A61() {
        return C8J.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05377i
    public final String A7F() {
        return C8J.A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05377i
    public final String A7H() {
        return C6E.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05377i
    public final boolean A94() {
        return C0849Kp.A00().A03();
    }
}
