package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1168Xa implements CA {
    public static byte[] A07;
    public static String[] A08 = {"S6y5l6jxI9", "6mnEH66ZFffSlH4yeHJS8qNG", "YOAMbMDgHDJdJlquETda64yXe2Dsnigk", "hsyrHKVntalAWTsGKMDD", "vPfGZ", "fU8euoLNwl", "f8hQ6WKdo4yu3", "0USUeFTSnT76dGHmDwgcSkrJJgtZvyOb"};
    public int A00;
    public int A01;
    public long A02;
    public CC A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C9> A05 = new ArrayDeque<>();
    public final CH A04 = new CH();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{124, -95, -87, -108, -97, -100, -105, 83, -104, -97, -104, -96, -104, -95, -89, 83, -89, -84, -93, -104, 83, -100, -63, -55, -76, -65, -68, -73, 115, -71, -65, -62, -76, -57, 115, -58, -68, -51, -72, -115, 115, -27, 10, 18, -3, 8, 5, 0, -68, 5, 10, 16, 1, 3, 1, 14, -68, 15, 5, 22, 1, -42, -68, -127, -94, -96, -105, -100, -107, 78, -109, -102, -109, -101, -109, -100, -94, 78, -95, -105, -88, -109, 104, 78};
    }

    static {
        A05();
    }

    private double A00(InterfaceC0646Bt interfaceC0646Bt, int i) throws InterruptedException, IOException {
        long jA02 = A02(interfaceC0646Bt, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    private long A01(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        interfaceC0646Bt.AFM();
        while (true) {
            interfaceC0646Bt.ADv(this.A06, 0, 4);
            int iA00 = CH.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) CH.A01(this.A06, iA00, false);
                if (this.A03.A96(iA01)) {
                    interfaceC0646Bt.AGP(iA00);
                    return iA01;
                }
            }
            interfaceC0646Bt.AGP(1);
        }
    }

    private long A02(InterfaceC0646Bt interfaceC0646Bt, int i) throws InterruptedException, IOException {
        interfaceC0646Bt.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    private String A04(InterfaceC0646Bt interfaceC0646Bt, int i) throws InterruptedException, IOException {
        if (i == 0) {
            return A03(0, 0, 103);
        }
        byte[] bArr = new byte[i];
        interfaceC0646Bt.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.uinode.CA
    public final void A8p(CC cc) {
        this.A03 = cc;
    }

    @Override // com.facebook.ads.redexgen.uinode.CA
    public final boolean AEJ(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        AbstractC0763Ha.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long jA7i = interfaceC0646Bt.A7i();
                C9 c9Peek = this.A05.peek();
                if (A08[4].length() == 19) {
                    throw new RuntimeException();
                }
                A08[1] = "iTM85rd";
                if (jA7i >= c9Peek.A01) {
                    this.A03.A5X(this.A05.pop().A00);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long jA05 = this.A04.A05(interfaceC0646Bt, true, false, 4);
                if (jA05 == -2) {
                    jA05 = A01(interfaceC0646Bt);
                }
                if (jA05 == -1) {
                    return false;
                }
                this.A00 = (int) jA05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC0646Bt, false, true, 8);
                this.A01 = 2;
            }
            int iA6s = this.A03.A6s(this.A00);
            switch (iA6s) {
                case 0:
                    int type = (int) this.A02;
                    interfaceC0646Bt.AGP(type);
                    this.A01 = 0;
                case 1:
                    long jA7i2 = interfaceC0646Bt.A7i();
                    this.A05.push(new C9(this.A00, jA7i2 + this.A02));
                    this.A03.AGU(this.A00, jA7i2, this.A02);
                    this.A01 = 0;
                    return true;
                case 2:
                    long j = this.A02;
                    if (j <= 8) {
                        this.A03.A8t(this.A00, A02(interfaceC0646Bt, (int) j));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C05969v(A03(41, 22, 116) + this.A02);
                case 3:
                    long j2 = this.A02;
                    if (j2 <= 2147483647L) {
                        this.A03.AGc(this.A00, A04(interfaceC0646Bt, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C05969v(A03(63, 21, 6) + this.A02);
                case 4:
                    this.A03.A42(this.A00, (int) this.A02, interfaceC0646Bt);
                    if (A08[7].charAt(2) != 'S') {
                        A08[2] = "x8X2xTnJq9Kheln0ABdW7PO8kghsREvE";
                        this.A01 = 0;
                        return true;
                    }
                    A08[4] = "mGqeeb15RRoJ11oGs7LhfnjQvY";
                    this.A01 = 0;
                    return true;
                case 5:
                    long j3 = this.A02;
                    if (j3 == 4 || j3 == 8) {
                        this.A03.A5j(this.A00, A00(interfaceC0646Bt, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C05969v(A03(21, 20, 43) + this.A02);
                default:
                    throw new C05969v(A03(0, 21, 11) + iA6s);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.CA
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
