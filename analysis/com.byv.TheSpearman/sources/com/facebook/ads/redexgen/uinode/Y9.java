package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y9 implements InterfaceC05929r {
    public static byte[] A0A;
    public static String[] A0B = {"QBw2naITCC87BBmeZEHB", "QG9qcoN67OZ9HCiBeCwQ37yZ8k9VzRIx", "huClURZcVSvs210svchTpygB", "SPjUxwmyMxCkovVHB3ukUPObWP0MyL9L", "Qo3gDbJmZiOUOvD4YrLGADsp8gVNY68y", "aCbITSFANaeoynFt6tlPTZT3Ud0BkJzi", "LC42BZreN0Trrj0tndAjNl8pur2kDdxK", "yIqlj0SUGgDzqSotNJk32MbE6gj6YGfF"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final W2 A07;
    public final I3 A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-97, -30, -32, -19, -19, -18, -13, -97, -31, -28, -97, -21, -28, -14, -14, -97, -13, -25, -32, -19, -97, -55, -27, -8, -23, -23, -24, -11, -55, -14, -11, -45, -17, -28, -4, -27, -28, -26, -18, -60, -23, -9, -24, -11, -43, -24, -27, -8, -23, -23, -24, -11, -48, -10, 3, 22, 7, 7, 6, 19, -25, 16, 19, -15, 13, 2, 26, 3, 2, 4, 12, -18, 20, 25, 13, 36, -18, 33, 18, 18, 17, 30, -7, 31, -64, -68, -63, -107, -56, -71, -71, -72, -59, -96, -58};
    }

    static {
        A02();
    }

    public Y9() {
        this(new W2(true, 65536));
    }

    @Deprecated
    public Y9(W2 w2) {
        this(w2, DefaultLoadControl.DEFAULT_MIN_BUFFER_MS, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public Y9(W2 w2, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(w2, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public Y9(W2 w2, int i, int i2, int i3, int i4, int i5, boolean z, I3 i32) {
        String strA01 = A01(54, 19, 78);
        String strA012 = A01(21, 1, 70);
        A03(i3, 0, strA01, strA012);
        String strA013 = A01(22, 32, 48);
        A03(i4, 0, strA013, strA012);
        String strA014 = A01(84, 11, 0);
        A03(i, i3, strA014, strA01);
        A03(i, i4, strA014, strA013);
        A03(i2, i, A01(73, 11, 89), strA014);
        this.A07 = w2;
        this.A06 = i * 1000;
        this.A05 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A03 = i4 * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = i32;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(com.facebook.ads.redexgen.uinode.Y5[] r4, com.facebook.ads.redexgen.uinode.C0745Gh r5) {
        /*
            r3 = this;
            r2 = 0
            r1 = 0
        L2:
            int r0 = r4.length
            if (r1 >= r0) goto L19
            com.facebook.ads.redexgen.X.Gg r0 = r5.A00(r1)
            if (r0 == 0) goto L16
            r0 = r4[r1]
            int r0 = r0.A8C()
            int r0 = com.facebook.ads.redexgen.uinode.IF.A01(r0)
            int r2 = r2 + r0
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.Y9.A00(com.facebook.ads.redexgen.X.Y5[], com.facebook.ads.redexgen.X.Gh):int");
    }

    public static void A03(int i, int i2, String str, String str2) {
        AbstractC0763Ha.A05(i >= i2, str + A01(0, 21, 44) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        I3 i3 = this.A08;
        if (i3 != null && this.A01) {
            i3.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final W2 A60() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final long A65() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final void ACr() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final void ADF() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final void ADN(Y5[] y5Arr, TrackGroupArray trackGroupArray, C0745Gh c0745Gh) {
        int iA00 = this.A02;
        if (iA00 == -1) {
            iA00 = A00(y5Arr, c0745Gh);
        }
        this.A00 = iA00;
        this.A07.A04(iA00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final boolean AFO() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final boolean AGI(long j, float f) {
        boolean targetBufferSizeReached;
        boolean z = true;
        boolean z2 = this.A07.A02() >= this.A00;
        boolean z3 = this.A01;
        long jMin = this.A06;
        if (f > 1.0f) {
            jMin = Math.min(IF.A0C(jMin, f), this.A05);
        }
        if (j < jMin) {
            if (!this.A09 && z2) {
                z = false;
            }
            this.A01 = z;
        } else if (j > this.A05 || z2) {
            this.A01 = false;
        }
        I3 i3 = this.A08;
        if (A0B[0].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "QKQzs8A5eNnCMvZO6Czn4VC5jQwn3nPR";
        strArr[4] = "QpEe5JzrMZm1KKJ9dYBmwnmG628Fesko";
        if (i3 != null && (targetBufferSizeReached = this.A01) != z3) {
            if (targetBufferSizeReached) {
                i3.A00(0);
            } else {
                i3.A03(0);
            }
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final boolean AGL(long j, float f, boolean z) {
        long jA0D = IF.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        return j2 <= 0 || jA0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05929r
    public final void onPrepared() {
        A04(false);
    }
}
