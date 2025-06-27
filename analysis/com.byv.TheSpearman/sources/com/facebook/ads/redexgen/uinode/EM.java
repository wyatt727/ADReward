package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class EM implements Y5, AA {
    public static byte[] A09;
    public static String[] A0A = {"9qnQyWyVOy7Yt1e5kI69WFnVp2gMy1V", "BpqCVyh3b", "BBu5XuJM3kgxNsyZ7X9f0tLDZOMhAb0I", "70xG0YQvSL9bnkI9uxU7IiqBWrnzW1xT", "FprTHacbfyfVlL7HNnWkMu7r", "uMfJClZk5qH56MPpWubSpXt", "rGQzHUHjzvUiqILZEsrKwpyReixzpim3", "VNUv5nSJy2Heuf3XsCr3Vyrq4xzGHGIU"};
    public int A00;
    public int A01;
    public long A02;
    public AB A03;
    public FB A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public static String A0w(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            String[] strArr = A0A;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "sONUtG9kcKy8d61ZBFdh1qYmD6uC6oh7";
            strArr2[6] = "okSWHoPOYn7Fcc6ZCgaoehlpub0ImFoA";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0x() {
        A09 = new byte[]{52, 54, 57, 22, 52, 38, 34, 62, 37, 50, 4, 50, 36, 36, 62, 56, 57};
    }

    public abstract void A15();

    public abstract void A16(long j, boolean z) throws C05789c;

    static {
        A0x();
    }

    public EM(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0y(InterfaceC0629Bc<?> interfaceC0629Bc, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC0629Bc == null) {
            return false;
        }
        throw new NullPointerException(A0w(0, 17, 120));
    }

    public final int A0z() {
        return this.A00;
    }

    public final int A10(long j) {
        return this.A04.AGO(j - this.A02);
    }

    public final int A11(C05909p c05909p, C1185Xr c1185Xr, boolean z) {
        int iAEK = this.A04.AEK(c05909p, c1185Xr, z);
        if (iAEK == -4) {
            if (c1185Xr.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c1185Xr.A00 += this.A02;
        } else if (iAEK == -5) {
            Format format = c05909p.A00;
            if (format.A0G != Long.MAX_VALUE) {
                c05909p.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return iAEK;
    }

    public final AB A12() {
        return this.A03;
    }

    public void A13() throws C05789c {
    }

    public void A14() throws C05789c {
    }

    public void A17(boolean z) throws C05789c {
    }

    public void A18(Format[] formatArr, long j) throws C05789c {
    }

    public final boolean A19() {
        return this.A05 ? this.A06 : this.A04.A9C();
    }

    public final Format[] A1A() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void A58() {
        AbstractC0763Ha.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A15();
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void A5V(AB ab, Format[] formatArr, FB fb, long j, boolean z, long j2) throws C05789c {
        AbstractC0763Ha.A04(this.A01 == 0);
        this.A03 = ab;
        this.A01 = 1;
        A17(z);
        AFD(formatArr, fb, j2);
        A16(j, z);
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final AA A6I() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public InterfaceC0779Hq A7N() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final int A81() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final FB A84() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5, com.facebook.ads.redexgen.uinode.AA
    public final int A8C() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.A7
    public void A8V(int i, Object obj) throws C05789c {
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final boolean A8a() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final boolean A8y() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void AAP() throws IOException {
        this.A04.AAM();
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void AFD(Format[] formatArr, FB fb, long j) throws C05789c {
        AbstractC0763Ha.A04(!this.A06);
        this.A04 = fb;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A18(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void AFN(long j) throws C05789c {
        this.A06 = false;
        this.A05 = false;
        A16(j, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void AFy() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void AG2(int i) {
        this.A00 = i;
    }

    public int AGg() throws C05789c {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void start() throws C05789c {
        AbstractC0763Ha.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void stop() throws C05789c {
        AbstractC0763Ha.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
