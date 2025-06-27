package com.facebook.ads.redexgen.uinode;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class XJ implements InterfaceC0661Cl {
    public static byte[] A0C;
    public static String[] A0D = {"qlUqm53dx2wRFYI19yFYkvkmPQFopPfK", "kfzPj4jiKhQrTstJ9wOtTomcMDMJFI2R", "tio4jxSpdKgrcMNksdh3F2ai0PxCizyi", "S5qskWqDqPkhPpuUuuvRcKySD9vc4n0H", "X67UodKHNvmZa3DnASt4fZlpL2cJMcNV", "01LnOYH7rGQp5f5o2UGBiyg7bnJQxBa8", "qDTiiMVukWANjWrPbJo4riKeblMOo1tu", "5dAWhKcmsHilqUXjq3PFXu2GkNxyPnDG"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C0660Ck A0A = new C0660Ck();
    public final AbstractC0664Co A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final long A01(long j, InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long jA7i = interfaceC0646Bt.A7i();
        if (!A0D(interfaceC0646Bt, this.A01)) {
            long j2 = this.A04;
            if (j2 != jA7i) {
                return j2;
            }
            throw new IOException(A09(0, 25, 22));
        }
        this.A0A.A03(interfaceC0646Bt, false);
        interfaceC0646Bt.AFM();
        long j3 = j - this.A0A.A05;
        int i = this.A0A.A01 + this.A0A.A00;
        if (j3 >= 0 && j3 <= 72000) {
            interfaceC0646Bt.AGP(i);
            return -(this.A0A.A05 + 2);
        }
        if (j3 < 0) {
            this.A01 = jA7i;
            this.A02 = this.A0A.A05;
        } else {
            this.A04 = interfaceC0646Bt.A7i() + i;
            this.A05 = this.A0A.A05;
            if ((this.A01 - this.A04) + i < 100000) {
                interfaceC0646Bt.AGP(i);
                return -(this.A05 + 2);
            }
        }
        long j4 = this.A01;
        long j5 = this.A04;
        String[] strArr = A0D;
        if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
            throw new RuntimeException();
        }
        A0D[3] = "zvKF8WQUI0SajHpo4Xv9v8DHT9e2MTPL";
        if (j4 - j5 < 100000) {
            this.A01 = j5;
            return j5;
        }
        long j6 = i;
        long j7 = j3 > 0 ? 1L : 2L;
        long jA7i2 = interfaceC0646Bt.A7i();
        long j8 = this.A01;
        long j9 = this.A04;
        return Math.min(Math.max((jA7i2 - (j6 * j7)) + (((j8 - j9) * j3) / (this.A02 - this.A05)), j9), this.A01 - 1);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{22, 55, 120, 55, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 120, 40, 57, Utf8.REPLACEMENT_BYTE, Base64.padSymbol, 120, 59, 57, 54, 120, 58, Base64.padSymbol, 120, 62, 55, 45, 54, 60, 118};
    }

    static {
        A0A();
    }

    public XJ(long j, long j2, AbstractC0664Co abstractC0664Co, int i, long j3) {
        AbstractC0763Ha.A03(j >= 0 && j2 > j);
        this.A0B = abstractC0664Co;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        long j4 = this.A08;
        long j5 = this.A09;
        long j6 = j + ((((j4 - j5) * j2) / this.A07) - j3);
        if (j6 < j5) {
            j6 = this.A09;
        }
        if (j6 >= j4) {
            return j4 - 1;
        }
        return j6;
    }

    private final long A02(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        A0C(interfaceC0646Bt);
        this.A0A.A02();
        while (true) {
            int i = this.A0A.A04;
            String[] strArr = A0D;
            if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "8L7HD1AI4we5ropKbStlQEIIPOmJrEUL";
            strArr2[2] = "xLnKc6RM4Edpr9DSdPLSxPAMnW98GKHb";
            if ((i & 4) == 4 || interfaceC0646Bt.A7i() >= this.A08) {
                break;
            }
            this.A0A.A03(interfaceC0646Bt, false);
            interfaceC0646Bt.AGP(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(InterfaceC0646Bt interfaceC0646Bt, long j, long j2) throws InterruptedException, IOException {
        this.A0A.A03(interfaceC0646Bt, false);
        while (this.A0A.A05 < j) {
            interfaceC0646Bt.AGP(this.A0A.A01 + this.A0A.A00);
            j2 = this.A0A.A05;
            this.A0A.A03(interfaceC0646Bt, false);
        }
        interfaceC0646Bt.AFM();
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0661Cl
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final XK A4m() {
        C0658Ci c0658Ci = null;
        if (this.A07 != 0) {
            return new XK(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        if (A0D(interfaceC0646Bt, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(InterfaceC0646Bt interfaceC0646Bt, long j) throws InterruptedException, IOException {
        long jMin = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int i = bArr.length;
        while (true) {
            if (interfaceC0646Bt.A7i() + i > jMin && (i = (int) (jMin - interfaceC0646Bt.A7i())) < 4) {
                return false;
            }
            interfaceC0646Bt.ADw(bArr, 0, i, false);
            for (int i2 = 0; i2 < i - 3; i2++) {
                int peekLength = bArr[i2];
                if (peekLength == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103) {
                    int peekLength2 = bArr[i2 + 3];
                    if (peekLength2 == 83) {
                        interfaceC0646Bt.AGP(i2);
                        return true;
                    }
                }
            }
            interfaceC0646Bt.AGP(i - 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r1 > r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r1 > r3) goto L25;
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0661Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEI(com.facebook.ads.redexgen.uinode.InterfaceC0646Bt r14) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r13 = this;
            int r0 = r13.A00
            r5 = 3
            r8 = r14
            switch(r0) {
                case 0: goto L50;
                case 1: goto L94;
                case 2: goto L10;
                case 3: goto Ld;
                default: goto L7;
            }
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Ld:
            r0 = -1
            return r0
        L10:
            long r2 = r13.A06
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.XJ.A0D
            r0 = 3
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L27
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            java.lang.String[] r4 = com.facebook.ads.redexgen.uinode.XJ.A0D
            java.lang.String r1 = "5HAo5Th3dlJMt4bYi9vd99sok2AKRnDx"
            r0 = 3
            r4[r0] = r1
            r0 = 2
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L3d
            r2 = 0
        L38:
            r13.A00 = r5
            long r0 = r0 + r2
            long r2 = -r0
            return r2
        L3d:
            long r2 = r13.A01(r2, r8)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L46
            return r2
        L46:
            long r9 = r13.A06
            long r2 = r2 + r0
            long r11 = -r2
            r7 = r13
            long r2 = r7.A03(r8, r9, r11)
            goto L38
        L50:
            long r3 = r8.A7i()
            r13.A03 = r3
            r0 = 1
            r13.A00 = r0
            long r1 = r13.A08
            java.lang.String[] r6 = com.facebook.ads.redexgen.uinode.XJ.A0D
            r0 = 5
            r6 = r6[r0]
            r0 = 14
            char r6 = r6.charAt(r0)
            r0 = 69
            if (r6 == r0) goto L7f
            java.lang.String[] r7 = com.facebook.ads.redexgen.uinode.XJ.A0D
            java.lang.String r6 = "y7O6pPdi4ZltSjD6KADDWtfh1EQ3ypYE"
            r0 = 1
            r7[r0] = r6
            java.lang.String r6 = "PCOWfrd56ab6qHMTUxzEVaAjhpd6ZxlM"
            r0 = 2
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L94
        L7e:
            return r1
        L7f:
            java.lang.String[] r7 = com.facebook.ads.redexgen.uinode.XJ.A0D
            java.lang.String r6 = "CYddPgWATLyxqxIaeTkpx7ccDiEA63Cn"
            r0 = 4
            r7[r0] = r6
            java.lang.String r6 = "yHXSkk2QTXaOjUGCO1LifWaF4YjGjaVe"
            r0 = 0
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L94
            goto L7e
        L94:
            long r0 = r13.A02(r8)
            r13.A07 = r0
            r13.A00 = r5
            long r0 = r13.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.XJ.AEI(com.facebook.ads.redexgen.X.Bt):long");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0661Cl
    public final long AGX(long j) {
        int i = this.A00;
        AbstractC0763Ha.A03(i == 3 || i == 2);
        long jA04 = 0;
        if (j != 0) {
            jA04 = this.A0B.A04(j);
        }
        this.A06 = jA04;
        this.A00 = 2;
        A0B();
        return this.A06;
    }
}
