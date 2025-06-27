package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0703Eo {
    public static String[] A04 = {"TJGXeByBmTHQPhxlQWaLs9WTuhAPsvDn", "cTyjqlp8UNOQyLJMZAg4XzmxFMTsV66P", "jpK43NGJIXClE5ie7D0g7Fa1Rpa7kANX", "QOLMQ2OzOpXdQRVqr", "8HaEwRmcLljD6jWZTmAaPx2QrUAiOCOo", "DwqRJ6bMYzXyiD2Eugn3dkRE0I23BFLv", "IP6wvLF5I09xjY7fYX", "9PCiAf0"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public C0703Eo(int i) {
        this(i, -1L);
    }

    public C0703Eo(int i, int i2, int i3, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }

    public C0703Eo(int i, long j) {
        this(i, -1, -1, j);
    }

    public final C0703Eo A00(int i) {
        if (this.A02 == i) {
            return this;
        }
        return new C0703Eo(i, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 != r7) goto L4
            return r5
        L4:
            r2 = 0
            if (r7 == 0) goto L11
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r0 = r7.getClass()
            if (r1 == r0) goto L12
        L11:
            return r2
        L12:
            com.facebook.ads.redexgen.X.Eo r7 = (com.facebook.ads.redexgen.uinode.C0703Eo) r7
            int r4 = r6.A02
            int r3 = r7.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0703Eo.A04
            r0 = 5
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L5e
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0703Eo.A04
            java.lang.String r1 = "1RYqQKBI4tHo2l91LJlKc5yEyLaxvrL0"
            r0 = 5
            r2[r0] = r1
            if (r4 != r3) goto L5c
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L5c
            int r3 = r6.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0703Eo.A04
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L57
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0703Eo.A04
            java.lang.String r1 = "Mb83VhRFw0YfLpvsGxQ6UEzyZMUp7"
            r0 = 3
            r2[r0] = r1
            int r0 = r7.A01
            if (r3 != r0) goto L5c
        L4e:
            long r3 = r6.A03
            long r1 = r7.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5c
        L56:
            return r5
        L57:
            int r0 = r7.A01
            if (r3 != r0) goto L5c
            goto L4e
        L5c:
            r5 = 0
            goto L56
        L5e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0703Eo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        return ((result2 + result3) * 31) + ((int) this.A03);
    }
}
