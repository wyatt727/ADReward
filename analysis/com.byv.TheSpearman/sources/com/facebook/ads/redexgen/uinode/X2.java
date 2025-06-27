package com.facebook.ads.redexgen.uinode;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC0671Cy {
    public static byte[] A0D;
    public static final double[] A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C4 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final Cz A0B = new Cz(128);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Format, Long> A00(Cz cz, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(cz.A02, cz.A00);
        int i = bArrCopyOf[4] & 255;
        int i2 = bArrCopyOf[5] & 255;
        int i3 = (i << 4) | (i2 >> 4);
        int i4 = ((i2 & 15) << 8) | (bArrCopyOf[6] & 255);
        float f = 1.0f;
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                f = (i4 * 4) / (i3 * 3);
                break;
            case 3:
                f = (i4 * 16) / (i3 * 9);
                break;
            case 4:
                f = (i4 * 121) / (i3 * 100);
                break;
        }
        Format formatA03 = Format.A03(str, A01(0, 11, 121), null, -1, -1, i3, i4, -1.0f, Collections.singletonList(bArrCopyOf), -1, f, null);
        long j = 0;
        int i5 = (bArrCopyOf[7] & 15) - 1;
        if (i5 >= 0) {
            double[] dArr = A0E;
            if (i5 < dArr.length) {
                double d = dArr[i5];
                int i6 = cz.A01;
                int i7 = (bArrCopyOf[i6 + 9] & 96) >> 5;
                if (i7 != (bArrCopyOf[i6 + 9] & 31)) {
                    d *= (i7 + 1.0d) / (r4 + 1);
                }
                j = (long) (1000000.0d / d);
            }
        }
        return Pair.create(formatA03, Long.valueOf(j));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{7, 24, 21, 20, 30, 94, 28, 1, 20, 22, 67};
    }

    static {
        A02();
        A0E = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0671Cy
    public final void A4R(C0788Hz c0788Hz) {
        int iA06 = c0788Hz.A06();
        int iA07 = c0788Hz.A07();
        byte[] bArr = c0788Hz.A00;
        this.A04 += c0788Hz.A04();
        this.A05.AFR(c0788Hz, c0788Hz.A04());
        while (true) {
            int iA04 = AbstractC0784Hv.A04(bArr, iA06, iA07, this.A0C);
            if (iA04 == iA07) {
                break;
            }
            int i = c0788Hz.A00[iA04 + 3] & 255;
            if (!this.A07) {
                int i2 = iA04 - iA06;
                if (i2 > 0) {
                    this.A0B.A01(bArr, iA06, iA04);
                }
                if (this.A0B.A02(i, i2 < 0 ? -i2 : 0)) {
                    Pair<Format, Long> pairA00 = A00(this.A0B, this.A06);
                    this.A05.A5n((Format) pairA00.first);
                    this.A00 = ((Long) pairA00.second).longValue();
                    this.A07 = true;
                }
            }
            if (i == 0 || i == 179) {
                int i3 = iA07 - iA04;
                if (this.A0A && this.A08 && this.A07) {
                    this.A05.AFS(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i3, i3, null);
                }
                boolean z = this.A0A;
                if (!z || this.A08) {
                    this.A02 = this.A04 - i3;
                    long j = this.A01;
                    if (j == -9223372036854775807L) {
                        j = z ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j;
                    this.A09 = false;
                    this.A01 = -9223372036854775807L;
                    this.A0A = true;
                }
                this.A08 = i == 0;
            } else if (i == 184) {
                this.A09 = true;
            }
            iA06 = iA04 + 3;
        }
        if (!this.A07) {
            this.A0B.A01(bArr, iA06, iA07);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0671Cy
    public final void A4p(InterfaceC0647Bu interfaceC0647Bu, DC dc) {
        dc.A05();
        this.A06 = dc.A04();
        this.A05 = interfaceC0647Bu.AGi(dc.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0671Cy
    public final void ADs() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0671Cy
    public final void ADt(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0671Cy
    public final void AFg() {
        AbstractC0784Hv.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
