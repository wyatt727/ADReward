package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class WO implements C4 {
    public static String[] A0F = {"J778k2tN1A71aNteuaiayf8W9Cwuw9", "SddvXAFvjaaaNZPS5hBFE72C4u8NAkzU", "DlS6L0Rs4yOHZbnixJzGuxf7gpgZ1", "jQlCDwUBXdtP", "ybgFHcAQFxf90xR6S9k4k72uXmSANsHZ", "TXMpPdQfareL1guTNfB0PsKfFvbJoTHv", "R2X9ywuliv1XsGmKXBlkokivcnsZ5nAf", "17XTwjN4yTPZEt52JUGlNgZMXTvW6CfX"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public F9 A04;
    public F9 A05;
    public F9 A06;
    public FA A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final F7 A0B;
    public final F8 A0C;
    public final InterfaceC0750Gm A0D;
    public final C0788Hz A0E;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(C1185Xr c1185Xr, F7 f7) {
        int iA0I;
        long j = f7.A01;
        this.A0E.A0W(1);
        A06(j, this.A0E.A00, 1);
        long j2 = j + 1;
        byte b = this.A0E.A00[0];
        boolean z = (b & 128) != 0;
        int i = b & Byte.MAX_VALUE;
        if (c1185Xr.A02.A04 == null) {
            c1185Xr.A02.A04 = new byte[16];
        }
        A06(j2, c1185Xr.A02.A04, i);
        long j3 = j2 + i;
        if (z) {
            this.A0E.A0W(2);
            A06(j3, this.A0E.A00, 2);
            j3 += 2;
            iA0I = this.A0E.A0I();
        } else {
            iA0I = 1;
            if (A0F[4].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "qfwCamou4xH4TsJy70kUYaPJ1paRPrQS";
            strArr[6] = "GMGbKrn5SK4TcHFeKaSIsaM2NwTeIDah";
        }
        int[] iArr = c1185Xr.A02.A06;
        if (iArr == null || iArr.length < iA0I) {
            iArr = new int[iA0I];
        }
        int[] iArr2 = c1185Xr.A02.A07;
        if (A0F[1].charAt(27) == 'T') {
            throw new RuntimeException();
        }
        A0F[3] = "l74rmj1cvzMl";
        if (iArr2 == null || iArr2.length < iA0I) {
            iArr2 = new int[iA0I];
            if (A0F[3].length() != 12) {
                A0F[5] = "mTjJh6O10GTQKtsNTzpZkGXCEgBidJyY";
            } else {
                String[] strArr2 = A0F;
                strArr2[2] = "gGnYbSzqov18WRGS84osGLTli7oQ4";
                strArr2[0] = "bcZjTvBd8pDqGicoFFRFmeT3NfcxuZ";
            }
        }
        if (z) {
            int i2 = iA0I * 6;
            this.A0E.A0W(i2);
            A06(j3, this.A0E.A00, i2);
            j3 += i2;
            this.A0E.A0Y(0);
            for (int i3 = 0; i3 < iA0I; i3++) {
                iArr[i3] = this.A0E.A0I();
                iArr2[i3] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = f7.A00 - ((int) (j3 - f7.A01));
        }
        C3 c3 = f7.A02;
        c1185Xr.A02.A03(iA0I, iArr, iArr2, c3.A03, c1185Xr.A02.A04, c3.A01, c3.A02, c3.A00);
        int i4 = (int) (j3 - f7.A01);
        f7.A01 += i4;
        f7.A00 -= i4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFS(long j, int i, int i2, int i3, C3 c3) {
        if (this.A08) {
            A5n(this.A03);
        }
        if (this.A09) {
            if ((i & 1) == 0 || !this.A0C.A0J(j)) {
                return;
            } else {
                this.A09 = false;
            }
        }
        this.A0C.A0G(j + this.A00, i, (this.A01 - i2) - i3, i2, c3);
    }

    public WO(InterfaceC0750Gm interfaceC0750Gm) {
        this.A0D = interfaceC0750Gm;
        int iA7D = interfaceC0750Gm.A7D();
        this.A0A = iA7D;
        this.A0C = new F8();
        this.A0B = new F7();
        this.A0E = new C0788Hz(32);
        F9 f9 = new F9(0L, iA7D);
        this.A04 = f9;
        this.A05 = f9;
        this.A06 = f9;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3X(), new F9(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[5] = "lOB1PW6jUN1Flr4ublIocLHYYSFUXZqB";
        if (j != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j);
        }
        return format;
    }

    private void A02(int i) {
        long j = this.A01 + i;
        this.A01 = j;
        if (j == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            this.A0D.AEW(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int remaining = (int) (this.A05.A03 - j);
            int iMin = Math.min(i, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j);
            byteBuffer.put(bArr, remaining2, iMin);
            i -= iMin;
            j += iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.A05.A03 - j));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j);
            int remaining = i - i2;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A08(F9 f9) {
        if (!f9.A02) {
            return;
        }
        boolean z = this.A06.A02;
        int i = (z ? 1 : 0) + (((int) (this.A06.A04 - f9.A04)) / this.A0A);
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[1] = "iejtrz5gn5ypfg4If5spWIciPKrb2ZMM";
        C0749Gl[] c0749GlArr = new C0749Gl[i];
        for (int i2 = 0; i2 < c0749GlArr.length; i2++) {
            c0749GlArr[i2] = f9.A01;
            f9 = f9.A01();
        }
        this.A0D.AEX(c0749GlArr);
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        F9 f9 = new F9(0L, this.A0A);
        this.A04 = f9;
        this.A05 = f9;
        this.A06 = f9;
        this.A01 = 0L;
        this.A0D.AGj();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(C05909p c05909p, C1185Xr c1185Xr, boolean z, boolean z2, long j) {
        int result = this.A0C.A09(c05909p, c1185Xr, z, z2, this.A02, this.A0B);
        switch (result) {
            case -5:
                this.A02 = c05909p.A00;
                return -5;
            case -4:
                if (!c1185Xr.A04()) {
                    if (c1185Xr.A00 < j) {
                        String[] strArr = A0F;
                        String str = strArr[2];
                        String str2 = strArr[0];
                        int length = str.length();
                        int result2 = str2.length();
                        if (length == result2) {
                            throw new RuntimeException();
                        }
                        A0F[3] = "3oC8GcXqxYNt";
                        c1185Xr.A00(Integer.MIN_VALUE);
                    }
                    if (c1185Xr.A0A()) {
                        A07(c1185Xr, this.A0B);
                    }
                    int result3 = this.A0B.A00;
                    c1185Xr.A09(result3);
                    long j2 = this.A0B.A01;
                    ByteBuffer byteBuffer = c1185Xr.A01;
                    int result4 = this.A0B.A00;
                    A05(j2, byteBuffer, result4);
                    return -4;
                }
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(FA fa) {
        this.A07 = fa;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void A5n(Format format) {
        Format formatA01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(formatA01);
        this.A03 = format;
        this.A08 = false;
        FA fa = this.A07;
        if (fa != null && formatChanged) {
            fa.ADS(formatA01);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final int AFQ(InterfaceC0646Bt interfaceC0646Bt, int i, boolean z) throws InterruptedException, IOException {
        int i2 = interfaceC0646Bt.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(i2);
        return i2;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFR(C0788Hz c0788Hz, int i) {
        while (i > 0) {
            int iA00 = A00(i);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            c0788Hz.A0c(bArr, bytesAppended, iA00);
            i -= iA00;
            A02(iA00);
        }
    }
}
