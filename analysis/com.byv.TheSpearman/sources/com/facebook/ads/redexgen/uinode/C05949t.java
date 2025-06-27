package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05949t {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C0703Eo A04;
    public final boolean A05;
    public final boolean A06;

    public C05949t(C0703Eo c0703Eo, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A04 = c0703Eo;
        this.A03 = j;
        this.A02 = j2;
        this.A00 = j3;
        this.A01 = j4;
        this.A06 = z;
        this.A05 = z2;
    }

    public final C05949t A00(int i) {
        return new C05949t(this.A04.A00(i), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C05949t A01(long j) {
        return new C05949t(this.A04, j, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
