package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class F8 {
    public static String[] A0I = {"AXNp2q2PpEahITHLh", "xQEpoEpGgC2eanPxpW7aZYHhG9yms2rq", "3j6TAof", "i8THqobYCLYXuqAnsJGXzeKTVyKCbEfb", "ggw9auSRsP4B09On0iatBfmdaYF861sQ", "10OfiNQ0BRtOqE95ZnYZi1qGxLNxD1sx", "iFzh6NRuyiOyJdjYiPViJ2RhowiTnlD0", "JJpEbWQFS8eJaCoVgzG8fIG9CRI9jzfg"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Format A08;
    public int A01 = 1000;
    public int[] A0D = new int[1000];
    public long[] A0E = new long[1000];
    public long[] A0F = new long[1000];
    public int[] A0B = new int[1000];
    public int[] A0C = new int[1000];
    public C3[] A0H = new C3[1000];
    public Format[] A0G = new Format[1000];
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A09 = true;
    public boolean A0A = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09(C05909p c05909p, C1185Xr c1185Xr, boolean z, boolean z2, Format format, F7 f7) {
        if (!A0I()) {
            if (z2) {
                c1185Xr.A02(4);
                return -4;
            }
            Format format2 = this.A08;
            if (format2 == null || (!z && format2 == format)) {
                return -3;
            }
            c05909p.A00 = format2;
            return -5;
        }
        int iA00 = A00(this.A03);
        if (z || this.A0G[iA00] != format) {
            c05909p.A00 = this.A0G[iA00];
            return -5;
        }
        if (c1185Xr.A0B()) {
            return -3;
        }
        c1185Xr.A00 = this.A0F[iA00];
        c1185Xr.A02(this.A0B[iA00]);
        f7.A00 = this.A0C[iA00];
        f7.A01 = this.A0E[iA00];
        f7.A02 = this.A0H[iA00];
        this.A03++;
        return -4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0G(long j, int i, long j2, int i2, C3 c3) {
        if (this.A0A) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.A0A = false;
            }
        }
        AbstractC0763Ha.A04(!this.A09);
        A04(j);
        int iA00 = A00(this.A02);
        this.A0F[iA00] = j;
        long[] jArr = this.A0E;
        jArr[iA00] = j2;
        this.A0C[iA00] = i2;
        this.A0B[iA00] = i;
        this.A0H[iA00] = c3;
        this.A0G[iA00] = this.A08;
        this.A0D[iA00] = this.A05;
        int i3 = this.A02 + 1;
        this.A02 = i3;
        int i4 = this.A01;
        if (i3 == i4) {
            int i5 = i4 + 1000;
            int[] iArr = new int[i5];
            long[] jArr2 = new long[i5];
            long[] jArr3 = new long[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            C3[] c3Arr = new C3[i5];
            Format[] formatArr = new Format[i5];
            int i6 = this.A04;
            int i7 = i4 - i6;
            System.arraycopy(jArr, i6, jArr2, 0, i7);
            System.arraycopy(this.A0F, this.A04, jArr3, 0, i7);
            System.arraycopy(this.A0B, this.A04, iArr2, 0, i7);
            System.arraycopy(this.A0C, this.A04, iArr3, 0, i7);
            System.arraycopy(this.A0H, this.A04, c3Arr, 0, i7);
            System.arraycopy(this.A0G, this.A04, formatArr, 0, i7);
            System.arraycopy(this.A0D, this.A04, iArr, 0, i7);
            int i8 = this.A04;
            System.arraycopy(this.A0E, 0, jArr2, i7, i8);
            System.arraycopy(this.A0F, 0, jArr3, i7, i8);
            System.arraycopy(this.A0B, 0, iArr2, i7, i8);
            System.arraycopy(this.A0C, 0, iArr3, i7, i8);
            System.arraycopy(this.A0H, 0, c3Arr, i7, i8);
            System.arraycopy(this.A0G, 0, formatArr, i7, i8);
            System.arraycopy(this.A0D, 0, iArr, i7, i8);
            this.A0E = jArr2;
            this.A0F = jArr3;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = c3Arr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            this.A02 = this.A01;
            this.A01 = i5;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A0J(long j) {
        if (this.A02 == 0) {
            return j > this.A06;
        }
        if (Math.max(this.A06, A03(this.A03)) >= j) {
            return false;
        }
        int i = this.A02;
        int iA00 = A00(i - 1);
        while (i > this.A03 && this.A0F[iA00] >= j) {
            i--;
            iA00--;
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
            }
        }
        A0C(this.A00 + i);
        return true;
    }

    private int A00(int i) {
        int i2 = this.A04 + i;
        int relativeIndex = this.A01;
        return i2 < relativeIndex ? i2 : i2 - relativeIndex;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(int r6, int r7, long r8, boolean r10) {
        /*
            r5 = this;
            r4 = -1
            r3 = 0
        L2:
            if (r3 >= r7) goto L21
            long[] r0 = r5.A0F
            r1 = r0[r6]
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L21
            if (r10 == 0) goto L16
            int[] r0 = r5.A0B
            r0 = r0[r6]
            r0 = r0 & 1
            if (r0 == 0) goto L17
        L16:
            r4 = r3
        L17:
            int r6 = r6 + 1
            int r0 = r5.A01
            if (r6 != r0) goto L1e
            r6 = 0
        L1e:
            int r3 = r3 + 1
            goto L2
        L21:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.F8.A01(int, int, long, boolean):int");
    }

    private long A02(int i) {
        this.A06 = Math.max(this.A06, A03(i));
        int i2 = this.A02 - i;
        this.A02 = i2;
        this.A00 += i;
        int i3 = this.A04 + i;
        this.A04 = i3;
        int i4 = this.A01;
        if (i3 >= i4) {
            this.A04 = i3 - i4;
        }
        int i5 = this.A03 - i;
        this.A03 = i5;
        if (i5 < 0) {
            this.A03 = 0;
        }
        if (i2 == 0) {
            int i6 = this.A04;
            if (i6 != 0) {
                i4 = i6;
            }
            return this.A0E[i4 - 1] + this.A0C[r1];
        }
        return this.A0E[this.A04];
    }

    private long A03(int i) {
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long jMax = Long.MIN_VALUE;
        int iA00 = A00(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.A0F[iA00]);
            int i3 = this.A0B[iA00];
            if ((i3 & 1) != 0) {
                break;
            }
            iA00--;
            if (iA00 == -1) {
                int i4 = this.A01;
                String[] strArr = A0I;
                if (strArr[6].charAt(24) == strArr[3].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "ogUh654";
                strArr2[5] = "2cGjVSXzBWiJJ6u2fOJU9D000d34dgjx";
                iA00 = i4 - 1;
            }
        }
        return jMax;
    }

    private final synchronized void A04(long j) {
        this.A07 = Math.max(this.A07, j);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i;
        int skipCount = this.A02;
        i = skipCount - this.A03;
        this.A03 = skipCount;
        return i;
    }

    public final synchronized int A08(long j, boolean z, boolean z2) {
        int iA00 = A00(this.A03);
        if (!A0I() || j < this.A0F[iA00] || (j > this.A07 && !z2)) {
            return -1;
        }
        int i = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(iA00, i - relativeReadIndex, j, z);
        if (offset == -1) {
            return -1;
        }
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return offset;
    }

    public final synchronized long A0A() {
        int i = this.A02;
        if (i == 0) {
            return -1L;
        }
        return A02(i);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0C(int r6) {
        /*
            r5 = this;
            int r2 = r5.A06()
            int r2 = r2 - r6
            r4 = 1
            if (r2 < 0) goto L2b
            int r1 = r5.A02
            int r0 = r5.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L2b
            r0 = 1
        L10:
            com.facebook.ads.redexgen.uinode.AbstractC0763Ha.A03(r0)
            int r0 = r5.A02
            int r0 = r0 - r2
            r5.A02 = r0
            long r2 = r5.A06
            long r0 = r5.A03(r0)
            long r0 = java.lang.Math.max(r2, r0)
            r5.A07 = r0
            int r0 = r5.A02
            if (r0 != 0) goto L2d
            r0 = 0
            return r0
        L2b:
            r0 = 0
            goto L10
        L2d:
            int r0 = r0 - r4
            int r1 = r5.A00(r0)
            long[] r0 = r5.A0E
            r2 = r0[r1]
            int[] r0 = r5.A0C
            r0 = r0[r1]
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.F8.A0C(int):long");
    }

    public final synchronized long A0D(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.A02;
        if (i2 != 0) {
            long[] jArr = this.A0F;
            int searchLength = this.A04;
            if (j >= jArr[searchLength]) {
                if (z2 && (i = this.A03) != i2) {
                    i2 = i + 1;
                }
                int iA01 = A01(searchLength, i2, j, z);
                if (iA01 == -1) {
                    return -1L;
                }
                return A02(iA01);
            }
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final void A0H(boolean z) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0K(Format format) {
        if (format == null) {
            this.A09 = true;
            return false;
        }
        this.A09 = false;
        if (IF.A0g(format, this.A08)) {
            return false;
        }
        this.A08 = format;
        return true;
    }
}
