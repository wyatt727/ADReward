package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0657Ch {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C0654Ce A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C0657Ch(C0654Ce c0654Ce, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC0763Ha.A03(iArr.length == jArr2.length);
        AbstractC0763Ha.A03(jArr.length == jArr2.length);
        AbstractC0763Ha.A03(iArr2.length == jArr2.length);
        this.A03 = c0654Ce;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
    }

    public final int A00(long j) {
        for (int i = IF.A0B(this.A07, j, true, false); i >= 0; i--) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(long r4) {
        /*
            r3 = this;
            long[] r1 = r3.A07
            r0 = 0
            r2 = 1
            int r1 = com.facebook.ads.redexgen.uinode.IF.A0A(r1, r4, r2, r0)
        L8:
            long[] r0 = r3.A07
            int r0 = r0.length
            if (r1 >= r0) goto L18
            int[] r0 = r3.A04
            r0 = r0[r1]
            r0 = r0 & r2
            if (r0 == 0) goto L15
            return r1
        L15:
            int r1 = r1 + 1
            goto L8
        L18:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0657Ch.A01(long):int");
    }
}
