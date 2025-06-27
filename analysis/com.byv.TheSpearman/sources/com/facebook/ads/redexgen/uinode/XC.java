package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XC extends AbstractC0664Co {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public C0666Cq A01;
    public C0668Cs A02;
    public C0669Cu A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final C0666Cq A02(C0788Hz c0788Hz) throws IOException {
        if (this.A03 == null) {
            this.A03 = AbstractC0670Cv.A04(c0788Hz);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = AbstractC0670Cv.A03(c0788Hz);
            return null;
        }
        byte[] bArr = new byte[c0788Hz.A07()];
        System.arraycopy(c0788Hz.A00, 0, bArr, 0, c0788Hz.A07());
        return new C0666Cq(this.A03, this.A02, bArr, AbstractC0670Cv.A0C(c0788Hz, this.A03.A05), AbstractC0670Cv.A00(r4.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, 22, 79, 86, 75, 91, 80, 74};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C0666Cq c0666Cq) {
        if (!c0666Cq.A04[A00(b, c0666Cq.A00, 1)].A03) {
            int modeNumber = c0666Cq.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0666Cq.A02.A04;
        return modeNumber2;
    }

    public static void A05(C0788Hz c0788Hz, long j) {
        c0788Hz.A0X(c0788Hz.A07() + 4);
        c0788Hz.A00[c0788Hz.A07() - 4] = (byte) (j & 255);
        c0788Hz.A00[c0788Hz.A07() - 3] = (byte) ((j >>> 8) & 255);
        c0788Hz.A00[c0788Hz.A07() - 2] = (byte) ((j >>> 16) & 255);
        c0788Hz.A00[c0788Hz.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C0788Hz c0788Hz) {
        try {
            return AbstractC0670Cv.A0A(1, c0788Hz, true);
        } catch (C05969v unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0664Co
    public final long A07(C0788Hz c0788Hz) {
        int i = 0;
        if ((c0788Hz.A00[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c0788Hz.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + iA01) / 4;
        }
        A05(c0788Hz, i);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
        strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
        this.A00 = iA01;
        return i;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0664Co
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        C0669Cu c0669Cu = this.A03;
        this.A00 = c0669Cu != null ? c0669Cu.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0664Co
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0664Co
    public final boolean A0A(C0788Hz c0788Hz, long j, C0663Cn c0663Cn) throws InterruptedException, IOException {
        if (this.A01 == null) {
            C0666Cq c0666CqA02 = A02(c0788Hz);
            this.A01 = c0666CqA02;
            if (c0666CqA02 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c0663Cn.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
