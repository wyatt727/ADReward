package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1153Wl implements C1 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1153Wl(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        long positionOffset = Math.max(0L, j - this.A01);
        long j2 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j2 / positionOffset2;
    }

    public final void A06(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        long j = 1000000 * (this.A00 / this.A04);
        long numFrames = this.A07;
        return j / numFrames;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j) {
        int i = this.A04;
        long positionOffset = i;
        long j2 = ((this.A02 * j) / 1000000) / positionOffset;
        long positionOffset2 = i;
        long jA0E = IF.A0E(j2 * positionOffset2, 0L, this.A00 - i);
        long j3 = this.A01 + jA0E;
        long jA05 = A05(j3);
        C2 seekPoint = new C2(jA05, j3);
        if (jA05 < j) {
            long j4 = this.A00;
            int i2 = this.A04;
            if (jA0E != j4 - i2) {
                long seekTimeUs = i2 + j3;
                long seekPosition = A05(seekTimeUs);
                return new C0(seekPoint, new C2(seekPosition, seekTimeUs));
            }
        }
        return new C0(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
