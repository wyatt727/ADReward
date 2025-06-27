package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0642Bp extends W7 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC0753Gp A0A;
    public final InterfaceC0766Hd A0B;

    public C0642Bp(TrackGroup trackGroup, int[] iArr, InterfaceC0753Gp interfaceC0753Gp, long j, long j2, long j3, float f, float f2, long j4, InterfaceC0766Hd interfaceC0766Hd) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0753Gp;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = interfaceC0766Hd;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        long jA67 = (long) (this.A0A.A67() * this.A04);
        int i = 0;
        for (int i2 = 0; i2 < super.A03; i2++) {
            if (j == Long.MIN_VALUE || !A00(i2, j)) {
                if (Math.round(A76(i2).A04 * this.A00) <= jA67) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.uinode.W7, com.facebook.ads.redexgen.uinode.InterfaceC0744Gg
    public final void A5U() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0744Gg
    public final int A7v() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.W7, com.facebook.ads.redexgen.uinode.InterfaceC0744Gg
    public final void ACc(float f) {
        this.A00 = f;
    }
}
