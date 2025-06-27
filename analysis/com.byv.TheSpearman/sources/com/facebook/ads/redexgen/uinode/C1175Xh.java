package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.exoplayer2.audio.AacUtil;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Xh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1175Xh implements InterfaceC0645Bs {
    public static byte[] A07;
    public static String[] A08 = {"ovn62aUcwqSIvWTqoELg4J4D8wHkUDmq", "Ycr5XQrqBi4bqXq", "xp8qJzBZ1bRZYruPJEcRAHgYPTR5RYjX", "i3q4o3QoTWkNmhcyfYOgrV6edePVNuRX", "3foLzBlJQPuSe9je9cnopJfCpNuQ", "jIofLs5qujimwrYxWQlB52zkZNTbvGhY", "Oin2hfMzoDcJa9P29jyigMxfd8hffyV", "DiUz7SyfwAQ"};
    public static final InterfaceC0648Bv A09;
    public static final int A0A;
    public static final byte[] A0B;
    public static final byte[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public int A00;
    public int A01;
    public long A02;
    public C4 A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
            String[] strArr = A08;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A08[7] = "o17bMTHd2bo";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-89, -19, -7, -24, -12, -20, -89, -5, 0, -9, -20, -89, -65, -67, -35, -23, -18, -90, -17, -19, 13, 25, 30, -7, 35, 14, -42, 14, 58, 64, 55, 47, -21, 57, 58, Utf8.REPLACEMENT_BYTE, -21, 49, 52, 57, 47, -21, 12, 24, 29, -21, 51, 48, 44, 47, 48, Base64.padSymbol, -7, 37, 72, 72, 65, 67, Base64.padSymbol, 72, -4, 29, 41, 46, -4, 36, 73, 81, 60, 71, 68, Utf8.REPLACEMENT_BYTE, -5, 75, 60, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 68, 73, 66, -5, Base64.padSymbol, 68, 79, 78, -5, 65, 74, 77, -5, 65, 77, 60, 72, 64, -5, 67, 64, 60, Utf8.REPLACEMENT_BYTE, 64, 77, -5, -53, -65, -34, -55, 67, 87, 70, 75, 81, 17, 21, 73, 82, 82, -3, 17, 0, 5, 11, -53, -3, 9, 14, -55, 19, -2};
        if (A08[6].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "iWdi7SFZoODeZbEJMl3L6ntPbKeDMNvO";
        strArr[2] = "0wFRuzGYIju4XbKNAoPYNxHAh615x32s";
        A07 = bArr;
    }

    static {
        A05();
        A09 = new C1176Xi();
        A0D = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0E = iArr;
        A0B = IF.A0i(A03(12, 6, 52));
        A0C = IF.A0i(A03(18, 9, 100));
        A0A = iArr[8];
    }

    private int A00(int i) throws C05969v {
        String strA03;
        if (!A07(i)) {
            StringBuilder sbAppend = new StringBuilder().append(A03(53, 12, 116));
            if (!this.A05) {
                strA03 = A03(103, 2, 21);
            } else if (A08[6].length() == 31) {
                A08[7] = "wEjTIiVmShi";
                strA03 = A03(105, 2, 31);
            }
            throw new C05969v(sbAppend.append(strA03).append(A03(0, 12, 31)).append(i).toString());
        }
        if (this.A05) {
            return A0E[i];
        }
        int[] iArr = A0D;
        if (A08[6].length() == 31) {
            String[] strArr = A08;
            strArr[4] = "W5GqdpRCUv4UTAd2FZcqfYNQbOUH";
            strArr[1] = "vSYrWd8JkI4l23w";
            return iArr[i];
        }
        throw new RuntimeException();
    }

    private int A01(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        interfaceC0646Bt.AFM();
        interfaceC0646Bt.ADv(this.A06, 0, 1);
        byte b = this.A06[0];
        if ((b & 131) <= 0) {
            return A00((b >> 3) & 15);
        }
        throw new C05969v(A03(65, 38, 115) + ((int) b));
    }

    private int A02(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            try {
                int iA01 = A01(interfaceC0646Bt);
                this.A01 = iA01;
                this.A00 = iA01;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iAFQ = this.A03.AFQ(interfaceC0646Bt, this.A00, true);
        if (iAFQ == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - iAFQ;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A03.AFS(this.A02, 1, this.A01, 0, null);
        this.A02 += 20000;
        return 0;
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            boolean z = this.A05;
            this.A03.A5n(Format.A06(null, z ? A03(117, 12, 52) : A03(107, 10, 122), null, -1, A0A, 1, z ? AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND : 8000, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i) {
        return !this.A05 && (i < 12 || i > 14);
    }

    private boolean A07(int i) {
        return i >= 0 && i <= 15 && (A08(i) || A06(i));
    }

    private boolean A08(int i) {
        if (this.A05) {
            if (i >= 10) {
                if (A08[6].length() != 31) {
                    throw new RuntimeException();
                }
                A08[5] = "qMGeUOCLNxoOBJxwE1u31s5i7NTepy4l";
                if (i > 13) {
                }
            }
            return true;
        }
        return false;
    }

    private boolean A09(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        byte[] bArr = A0B;
        if (A0A(interfaceC0646Bt, bArr)) {
            this.A05 = false;
            interfaceC0646Bt.AGP(bArr.length);
            return true;
        }
        byte[] bArr2 = A0C;
        if (!A0A(interfaceC0646Bt, bArr2)) {
            return false;
        }
        this.A05 = true;
        interfaceC0646Bt.AGP(bArr2.length);
        return true;
    }

    private boolean A0A(InterfaceC0646Bt interfaceC0646Bt, byte[] bArr) throws InterruptedException, IOException {
        interfaceC0646Bt.AFM();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0646Bt.ADv(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void A8o(InterfaceC0647Bu interfaceC0647Bu) {
        interfaceC0647Bu.AFi(new C1177Xj(-9223372036854775807L));
        this.A03 = interfaceC0647Bu.AGi(0, 1);
        interfaceC0647Bu.A5Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final int AEH(InterfaceC0646Bt interfaceC0646Bt, C0650Bz c0650Bz) throws InterruptedException, IOException {
        if (interfaceC0646Bt.A7i() != 0 || A09(interfaceC0646Bt)) {
            A04();
            return A02(interfaceC0646Bt);
        }
        throw new C05969v(A03(27, 26, 99));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void AFh(long j, long j2) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final boolean AGR(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        return A09(interfaceC0646Bt);
    }
}
