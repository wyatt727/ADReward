package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class C6 {
    public final C4 A00;

    public abstract void A0B(C0788Hz c0788Hz, long j) throws C05969v;

    public abstract boolean A0C(C0788Hz c0788Hz) throws C05969v;

    public C6(C4 c4) {
        this.A00 = c4;
    }

    public final void A00(C0788Hz c0788Hz, long j) throws C05969v {
        if (A0C(c0788Hz)) {
            A0B(c0788Hz, j);
        }
    }
}
