package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class XU implements InterfaceC0645Bs {
    public static byte[] A0E;
    public static String[] A0F = {"FKupPKXcsIkycQ3l5ptAH5wluEqc6YoI", "RW", "ogqWAOna8QODFLIqijT7vOYnhApvYyU7", "UAOUtvFDqNmRNLgZ1GU6DrNnbPesxUgh", "z4WGtVpeHmr0jWMfeyoB2cmDzFByDj9w", "gdGWUcFUabEj8aTRXEAi5amp", "tmhvTid", "WDNv6R6VbALBmvSk6DCmHF7NFi0i9puO"};
    public static final InterfaceC0648Bv A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0647Bu A04;
    public C4 A05;
    public XV A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0649Bw A0A;
    public final Bx A0B;
    public final By A0C;
    public final C0788Hz A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-94, -57, -65, -56, -110, -92, -96, -79, -94, -89, -92, -93, 95, -77, -82, -82, 95, -84, -96, -83, -72, 95, -95, -72, -77, -92, -78, 109, -115, 121, -119, Byte.MIN_VALUE, -100, -83, -78, -85};
    }

    static {
        A05();
        A0G = new XW();
        A0J = IF.A08(A04(32, 4, 37));
        A0H = IF.A08(A04(0, 4, 58));
        A0I = IF.A08(A04(28, 4, 24));
    }

    public XU() {
        this(0);
    }

    public XU(int i) {
        this(i, -9223372036854775807L);
    }

    public XU(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C0788Hz(10);
        this.A0C = new By();
        this.A0A = new C0649Bw();
        this.A02 = -9223372036854775807L;
        this.A0B = new Bx();
    }

    private int A00(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            interfaceC0646Bt.AFM();
            if (!interfaceC0646Bt.ADw(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int iA08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(iA08, sampleHeaderData)) {
                int sampleHeaderData2 = By.A00(iA08);
                if (sampleHeaderData2 != -1) {
                    By.A04(iA08, this.A0C);
                    if (this.A02 == -9223372036854775807L) {
                        XV xv = this.A06;
                        long jA7i = interfaceC0646Bt.A7i();
                        if (A0F[0].charAt(7) == '2') {
                            throw new RuntimeException();
                        }
                        A0F[5] = "uwsYCHPiCgNXlhDD9rc7dT19";
                        this.A02 = xv.A88(jA7i);
                        if (this.A09 != -9223372036854775807L) {
                            this.A02 += this.A09 - this.A06.A88(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            interfaceC0646Bt.AGP(1);
            this.A01 = 0;
            return 0;
        }
        int iAFQ = this.A05.AFQ(interfaceC0646Bt, this.A00, true);
        if (iAFQ == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - iAFQ;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A05.AFS(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r3 == r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.uinode.C0788Hz r4, int r5) {
        /*
            int r1 = r4.A07()
            int r0 = r5 + 4
            if (r1 < r0) goto L3e
            r4.A0Y(r5)
            int r3 = r4.A08()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XU.A0F
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L38
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XU.A0F
            java.lang.String r1 = "RZ9mFeyNnV0sPgPCsPCuasZg37Uzdp17"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fK9CAyTZYj28knSP6u8xHPIK1qnXYcxa"
            r0 = 3
            r2[r0] = r1
            int r0 = com.facebook.ads.redexgen.uinode.XU.A0J
            if (r3 == r0) goto L37
            int r0 = com.facebook.ads.redexgen.uinode.XU.A0H
            if (r3 != r0) goto L3e
        L37:
            return r3
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            int r1 = r4.A07()
            r0 = 40
            if (r1 < r0) goto L54
            r0 = 36
            r4.A0Y(r0)
            int r1 = r4.A08()
            int r0 = com.facebook.ads.redexgen.uinode.XU.A0I
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.XU.A01(com.facebook.ads.redexgen.X.Hz, int):int");
    }

    private EE A02(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        interfaceC0646Bt.ADv(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        By.A04(this.A0D.A08(), this.A0C);
        return new EE(interfaceC0646Bt.A7I(), interfaceC0646Bt.A7i(), this.A0C);
    }

    private XV A03(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        C0788Hz c0788Hz = new C0788Hz(this.A0C.A02);
        interfaceC0646Bt.ADv(c0788Hz.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            int i2 = this.A0C.A01;
            if (A0F[5].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "1a7oiXE";
            strArr[1] = "rh";
            if (i2 != 1) {
                i = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i = 13;
        }
        int xingBase = A01(c0788Hz, i);
        if (xingBase == A0J || xingBase == A0H) {
            E4 e4A01 = E4.A01(interfaceC0646Bt.A7I(), interfaceC0646Bt.A7i(), this.A0C, c0788Hz);
            if (e4A01 != null && !this.A0A.A03()) {
                interfaceC0646Bt.AFM();
                interfaceC0646Bt.A3W(i + Opcodes.F2D);
                C0788Hz frame = this.A0D;
                interfaceC0646Bt.ADv(frame.A00, 0, 3);
                C0788Hz frame2 = this.A0D;
                frame2.A0Y(0);
                C0649Bw c0649Bw = this.A0A;
                C0788Hz frame3 = this.A0D;
                c0649Bw.A04(frame3.A0G());
            }
            interfaceC0646Bt.AGP(this.A0C.A02);
            if (e4A01 != null && !e4A01.A9I() && xingBase == A0H) {
                return A02(interfaceC0646Bt);
            }
            return e4A01;
        }
        if (xingBase == A0I) {
            EC ecA00 = EC.A00(interfaceC0646Bt.A7I(), interfaceC0646Bt.A7i(), this.A0C, c0788Hz);
            interfaceC0646Bt.AGP(this.A0C.A02);
            return ecA00;
        }
        interfaceC0646Bt.AFM();
        return null;
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(com.facebook.ads.redexgen.uinode.InterfaceC0646Bt r14, boolean r15) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.XU.A07(com.facebook.ads.redexgen.X.Bt, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void A8o(InterfaceC0647Bu interfaceC0647Bu) {
        this.A04 = interfaceC0647Bu;
        this.A05 = interfaceC0647Bu.AGi(0, 1);
        this.A04.A5Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final int AEH(InterfaceC0646Bt interfaceC0646Bt, C0650Bz c0650Bz) throws InterruptedException, IOException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0646Bt, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            XV xvA03 = A03(interfaceC0646Bt);
            this.A06 = xvA03;
            if (xvA03 == null || (!xvA03.A9I() && (this.A08 & 1) != 0)) {
                this.A06 = A02(interfaceC0646Bt);
            }
            this.A04.AFi(this.A06);
            this.A05.A5n(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0646Bt);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void AFh(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final boolean AGR(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        return A07(interfaceC0646Bt, true);
    }
}
