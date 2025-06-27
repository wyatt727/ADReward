package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class EE implements XV {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public EE(long j, long j2, By by) {
        this.A04 = j2;
        this.A01 = by.A02;
        this.A00 = by.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j - j2;
            this.A03 = A88(j);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j) {
        long j2 = this.A02;
        if (j2 == -1) {
            return new C0(new C2(0L, this.A04));
        }
        int i = this.A01;
        long jA0E = IF.A0E((((this.A00 * j) / 8000000) / i) * i, 0L, j2 - i);
        long j3 = this.A04 + jA0E;
        long jA88 = A88(j3);
        C2 seekPoint = new C2(jA88, j3);
        if (jA88 < j) {
            long j4 = this.A02;
            int i2 = this.A01;
            if (jA0E != j4 - i2) {
                long j5 = i2 + j3;
                return new C0(seekPoint, new C2(A88(j5), j5));
            }
        }
        return new C0(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.uinode.XV
    public final long A88(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return this.A02 != -1;
    }
}
