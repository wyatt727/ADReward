package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class XH extends AbstractC0664Co {
    public static byte[] A02;
    public static String[] A03 = {"8dTWvXK8tch0WiEnFvHb8QUOTjgSOqY9", "GP5XsFGUIcP3F8wb7eo6", "CqCUMDrIKsNfOt03xA9INRdZ8", "ntm6pkiJXJn0b4vYMFRbAtYqalurqDmt", "MKNWZ4ceQqyXKZHhShlPBWdiS", "qmQfSGtBK4Bh2Swsb", "DS4", "jEA"};
    public XI A00;
    public C0775Hm A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-97, -77, -94, -89, -83, 109, -92, -86, -97, -95};
    }

    static {
        A03();
    }

    private int A00(C0788Hz c0788Hz) {
        int i = (c0788Hz.A00[2] & 255) >> 4;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int i2 = i - 2;
                String[] strArr = A03;
                String str = strArr[3];
                String str2 = strArr[0];
                int iCharAt = str.charAt(11);
                int blockSizeCode = str2.charAt(11);
                if (iCharAt == blockSizeCode) {
                    A03[1] = "m7WV3F64xJdvTLT";
                    return 576 << i2;
                }
                String[] strArr2 = A03;
                strArr2[6] = "ZGd";
                strArr2[7] = "V9k";
                return 576 << i2;
            case 6:
            case 7:
                c0788Hz.A0Z(4);
                c0788Hz.A0O();
                String[] strArr3 = A03;
                String str3 = strArr3[3];
                String str4 = strArr3[0];
                int iCharAt2 = str3.charAt(11);
                int blockSizeCode2 = str4.charAt(11);
                if (iCharAt2 != blockSizeCode2) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[6] = "ycs";
                strArr4[7] = "AJV";
                int value = i == 6 ? c0788Hz.A0E() : c0788Hz.A0I();
                c0788Hz.A0Y(0);
                int blockSizeCode3 = value + 1;
                return blockSizeCode3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode4 = 256 << (i - 8);
                return blockSizeCode4;
            default:
                return -1;
        }
    }

    public static boolean A04(C0788Hz c0788Hz) {
        return c0788Hz.A04() >= 5 && c0788Hz.A0E() == 127 && c0788Hz.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0664Co
    public final long A07(C0788Hz c0788Hz) {
        if (!A05(c0788Hz.A00)) {
            return -1L;
        }
        return A00(c0788Hz);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0664Co
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0664Co
    public final boolean A0A(C0788Hz c0788Hz, long j, C0663Cn c0663Cn) throws InterruptedException, IOException {
        byte[] bArr = c0788Hz.A00;
        if (this.A01 == null) {
            this.A01 = new C0775Hm(bArr, 17);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, c0788Hz.A07());
            bArrCopyOfRange[4] = Byte.MIN_VALUE;
            c0663Cn.A00 = Format.A07(null, A02(0, 10, 50), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, Collections.singletonList(bArrCopyOfRange), null, 0, null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            XI xi = new XI(this);
            this.A00 = xi;
            xi.A01(c0788Hz);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        XI xi2 = this.A00;
        if (A03[5].length() != 17) {
            throw new RuntimeException();
        }
        A03[1] = "qWJSCS9yuHod5mMI2FbA5J9U";
        if (xi2 != null) {
            xi2.A00(j);
            c0663Cn.A01 = this.A00;
        }
        return false;
    }
}
