package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0656Cg {
    public static String[] A0J = {"Hx", "VutN6lGbTtI", "", "qYQ0MvWUv8Y", "S03PbS7CBB7Qa9LNqne809kWTfsCcOYT", "wkl2QKty73uWRgng3ylrY2sBCsabW7qE", "iu4lxNjBwDGgTbBIaWVT9T7j7cQi6zNN", "a5Fde8I7YqGVonU3ugZgHcMmcsmCDOtB"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public CP A07;
    public C0655Cf A08;
    public C0788Hz A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i) {
        return this.A0F[i] + this.A0C[i];
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    public final void A02(int i) {
        C0788Hz c0788Hz = this.A09;
        if (c0788Hz == null || c0788Hz.A07() < i) {
            this.A09 = new C0788Hz(i);
        }
        this.A01 = i;
        this.A0A = true;
        this.A0B = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r5, int r6) {
        /*
            r4 = this;
            r4.A02 = r5
            r4.A00 = r6
            int[] r0 = r4.A0E
            if (r0 == 0) goto Lb
            int r0 = r0.length
            if (r0 >= r5) goto L31
        Lb:
            long[] r3 = new long[r5]
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0656Cg.A0J
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 0
            if (r1 == r0) goto L1f
        L19:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0656Cg.A0J
            java.lang.String r1 = "ZgUWYZPBUUH4f5IflhoFXt9Z2beMZ7L4"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "VeOPEMocQkhcG8xqDUtsqj4H6GWeaBG3"
            r0 = 5
            r2[r0] = r1
            r4.A0G = r3
            int[] r0 = new int[r5]
            r4.A0E = r0
        L31:
            int[] r0 = r4.A0D
            if (r0 == 0) goto L38
            int r0 = r0.length
            if (r0 >= r6) goto L64
        L38:
            int r0 = r6 * 125
            int r3 = r0 / 100
            int[] r0 = new int[r3]
            r4.A0D = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0656Cg.A0J
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L4d
            goto L19
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0656Cg.A0J
            java.lang.String r1 = "QhoZMJVE40X"
            r0 = 1
            r2[r0] = r1
            int[] r0 = new int[r3]
            r4.A0C = r0
            long[] r0 = new long[r3]
            r4.A0F = r0
            boolean[] r0 = new boolean[r3]
            r4.A0I = r0
            boolean[] r0 = new boolean[r3]
            r4.A0H = r0
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0656Cg.A03(int, int):void");
    }

    public final void A04(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        interfaceC0646Bt.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(C0788Hz c0788Hz) {
        c0788Hz.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
