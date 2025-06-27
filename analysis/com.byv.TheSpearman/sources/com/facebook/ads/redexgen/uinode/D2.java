package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class D2 {
    public static String[] A0I = {"F0jWKjQTCy62z5RMZ8LXaJxAHVXVw03", "jefijzmMiLSAGWVfBYlCHQnNu7WiK65", "5NKy3uod9nHosUme2DvPYxtYVEy", "OBCuuRHFU9olC8zTnYpCIYDmocSOdWsL", "GchpYIdYbHeAJ5Ou", "h9yGOulo4c92iX", "0WO8HWLEfGPVrZyS", "YTVxkuYMC8IrkJuZM8HCcFhUbHlAsN8p"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public byte[] A0B;
    public final C4 A0E;
    public final I0 A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0783Hu> A0D = new SparseArray<>();
    public final SparseArray<C0782Ht> A0C = new SparseArray<>();
    public D1 A06 = new D1();
    public D1 A07 = new D1();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.D2.A06(byte[], int, int):void");
    }

    public D2(C4 c4, boolean z, boolean z2) {
        this.A0E = c4;
        this.A0G = z;
        this.A0H = z2;
        byte[] bArr = new byte[128];
        this.A0B = bArr;
        this.A0F = new I0(bArr, 0, 0);
        A01();
    }

    private void A00(int i) {
        boolean z = this.A0A;
        this.A0E.AFS(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    public final void A02(long j, int i) {
        boolean z = false;
        if (this.A01 == 9 || (this.A0H && this.A07.A00(this.A06))) {
            boolean z2 = this.A09;
            String[] strArr = A0I;
            if (strArr[0].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0I[2] = "rg9RD6QhDdRr";
            if (z2) {
                A00(i + ((int) (j - this.A02)));
            }
            this.A04 = this.A02;
            this.A05 = this.A03;
            this.A0A = false;
            this.A09 = true;
        }
        boolean z3 = this.A0A;
        int i2 = this.A01;
        if (i2 == 5 || (this.A0G && i2 == 1 && this.A07.A05())) {
            z = true;
        }
        this.A0A = z3 | z;
    }

    public final void A03(long j, int i, long j2) {
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || i != 1) {
            if (!this.A0H) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        D1 d1 = this.A06;
        D1 newSliceHeader = this.A07;
        this.A06 = newSliceHeader;
        this.A07 = d1;
        d1.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(C0782Ht c0782Ht) {
        this.A0C.append(c0782Ht.A00, c0782Ht);
    }

    public final void A05(C0783Hu c0783Hu) {
        this.A0D.append(c0783Hu.A05, c0783Hu);
    }

    public final boolean A07() {
        return this.A0H;
    }
}
