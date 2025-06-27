package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class F9 {
    public F9 A00;
    public C0749Gl A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public F9(long j, int i) {
        this.A04 = j;
        this.A03 = i + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final F9 A01() {
        this.A01 = null;
        F9 f9 = this.A00;
        this.A00 = null;
        return f9;
    }

    public final void A02(C0749Gl c0749Gl, F9 f9) {
        this.A01 = c0749Gl;
        this.A00 = f9;
        this.A02 = true;
    }
}
