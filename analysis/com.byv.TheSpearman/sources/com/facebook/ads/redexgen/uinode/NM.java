package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class NM {
    public final String A07;
    public long A01 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A00 = -1;
    public long A05 = -1;
    public long A02 = -1;
    public long A06 = -1;

    public NM(String str) {
        this.A07 = str;
    }

    public final NM A00(long j) {
        this.A00 = j;
        return this;
    }

    public final NM A01(long j) {
        this.A01 = j;
        return this;
    }

    public final NM A02(long j) {
        this.A02 = j;
        return this;
    }

    public final NM A03(long j) {
        this.A03 = j;
        return this;
    }

    public final NM A04(long j) {
        this.A04 = j;
        return this;
    }

    public final NM A05(long j) {
        this.A05 = j;
        return this;
    }

    public final NM A06(long j) {
        this.A06 = j;
        return this;
    }

    public final NN A07() {
        return new NN(this.A07, this.A01, this.A03, this.A04, this.A00, this.A05, this.A02, this.A06);
    }
}
