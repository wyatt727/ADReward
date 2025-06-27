package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0750Gm {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public C0749Gl[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0749Gl[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, 24, 5, 13, 24, 30, 9, 24, 25, 93, 28, 17, 17, 18, 30, 28, 9, 20, 18, 19, 71, 93};
    }

    public W2(boolean z, int i) {
        this(z, i, 0);
    }

    public W2(boolean z, int i, int i2) {
        AbstractC0763Ha.A03(i > 0);
        AbstractC0763Ha.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C0749Gl[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C0749Gl(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0749Gl[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AGj();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0750Gm
    public final synchronized C0749Gl A3X() {
        C0749Gl c0749Gl;
        this.A00++;
        int i = this.A01;
        if (i > 0) {
            C0749Gl[] c0749GlArr = this.A03;
            int i2 = i - 1;
            this.A01 = i2;
            c0749Gl = c0749GlArr[i2];
            c0749GlArr[i2] = null;
        } else {
            c0749Gl = new C0749Gl(new byte[this.A04], 0);
        }
        return c0749Gl;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0750Gm
    public final int A7D() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0750Gm
    public final synchronized void AEW(C0749Gl c0749Gl) {
        C0749Gl[] c0749GlArr = this.A07;
        c0749GlArr[0] = c0749Gl;
        AEX(c0749GlArr);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0750Gm
    public final synchronized void AEX(C0749Gl[] c0749GlArr) {
        int i = this.A01;
        int length = c0749GlArr.length + i;
        C0749Gl[] c0749GlArr2 = this.A03;
        if (length >= c0749GlArr2.length) {
            this.A03 = (C0749Gl[]) Arrays.copyOf(c0749GlArr2, Math.max(c0749GlArr2.length * 2, i + c0749GlArr.length));
        }
        for (C0749Gl c0749Gl : c0749GlArr) {
            if (c0749Gl.A01 == this.A06 || c0749Gl.A01.length == this.A04) {
                C0749Gl[] c0749GlArr3 = this.A03;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                c0749GlArr3[i2] = c0749Gl;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(c0749Gl.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + c0749Gl.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= c0749GlArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0750Gm
    public final synchronized void AGj() {
        int iA04 = IF.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, iA04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i = targetAvailableCount - 1;
            while (lowIndex <= i) {
                C0749Gl highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0749Gl lowAllocation = this.A03[i];
                    if (lowAllocation.A01 != this.A06) {
                        i--;
                    } else {
                        C0749Gl[] c0749GlArr = this.A03;
                        c0749GlArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i - 1;
                        c0749GlArr[i] = highAllocation;
                        i = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
