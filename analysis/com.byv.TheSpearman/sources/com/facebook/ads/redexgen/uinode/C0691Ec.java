package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0691Ec extends ZY {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    public C4Y A00;
    public C4Y A01;

    private int A00(AbstractC04734o abstractC04734o, View view, C4Y c4y) {
        int containerCenter;
        int iA0F = c4y.A0F(view) + (c4y.A0D(view) / 2);
        if (abstractC04734o.A1T()) {
            int iA0A = c4y.A0A();
            int childCenter = c4y.A0B();
            containerCenter = iA0A + (childCenter / 2);
        } else {
            int childCenter2 = c4y.A06();
            containerCenter = childCenter2 / 2;
        }
        return iA0F - containerCenter;
    }

    private View A01(AbstractC04734o abstractC04734o, C4Y c4y) {
        int childCenter;
        int iA0W = abstractC04734o.A0W();
        if (iA0W == 0) {
            return null;
        }
        View view = null;
        if (abstractC04734o.A1T()) {
            int iA0A = c4y.A0A();
            int iA0B = c4y.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            int childCount = iA0B / 2;
            childCenter = iA0A + childCount;
        } else {
            int childCount2 = c4y.A06();
            childCenter = childCount2 / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int absClosest = 0; absClosest < iA0W; absClosest++) {
            View viewA0t = abstractC04734o.A0t(absClosest);
            int iA0F = c4y.A0F(viewA0t);
            int childCount3 = c4y.A0D(viewA0t);
            int childCount4 = Math.abs((iA0F + (childCount3 / 2)) - childCenter);
            if (childCount4 < i) {
                i = childCount4;
                view = viewA0t;
            }
        }
        return view;
    }

    private View A02(AbstractC04734o abstractC04734o, C4Y c4y) {
        int iA0W = abstractC04734o.A0W();
        if (iA0W == 0) {
            return null;
        }
        View closestChild = null;
        int childStart = Integer.MAX_VALUE;
        for (int i = 0; i < iA0W; i++) {
            View viewA0t = abstractC04734o.A0t(i);
            int childCount = c4y.A0F(viewA0t);
            if (childCount < childStart) {
                childStart = childCount;
                if (A02[3].length() != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                closestChild = viewA0t;
            }
        }
        return closestChild;
    }

    private C4Y A03(AbstractC04734o abstractC04734o) {
        C4Y c4y = this.A00;
        if (c4y == null || c4y.A02 != abstractC04734o) {
            this.A00 = C4Y.A00(abstractC04734o);
        }
        return this.A00;
    }

    private C4Y A04(AbstractC04734o abstractC04734o) {
        C4Y c4y = this.A01;
        if (c4y == null || c4y.A02 != abstractC04734o) {
            this.A01 = C4Y.A01(abstractC04734o);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    @Override // com.facebook.ads.redexgen.uinode.ZY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0C(com.facebook.ads.redexgen.uinode.AbstractC04734o r10, int r11, int r12) {
        /*
            r9 = this;
            int r8 = r10.A0Z()
            r4 = -1
            if (r8 != 0) goto L8
            return r4
        L8:
            r1 = 0
            boolean r0 = r10.A21()
            if (r0 == 0) goto L1a
            com.facebook.ads.redexgen.X.4Y r0 = r9.A04(r10)
            android.view.View r1 = r9.A02(r10, r0)
        L17:
            if (r1 != 0) goto L42
            return r4
        L1a:
            boolean r0 = r10.A20()
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.4Y r3 = r9.A03(r10)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0691Ec.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L36
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0691Ec.A02
            java.lang.String r1 = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo"
            r0 = 4
            r2[r0] = r1
            android.view.View r1 = r9.A02(r10, r3)
            goto L17
        L42:
            int r3 = r10.A0p(r1)
            if (r3 != r4) goto L49
            return r4
        L49:
            boolean r0 = r10.A20()
            r7 = 0
            if (r0 == 0) goto La1
            if (r11 <= 0) goto L9f
            r6 = 1
        L53:
            r5 = 0
            boolean r0 = r10 instanceof com.facebook.ads.redexgen.uinode.AnonymousClass50
            if (r0 == 0) goto L89
            com.facebook.ads.redexgen.X.50 r10 = (com.facebook.ads.redexgen.uinode.AnonymousClass50) r10
            int r0 = r8 + (-1)
            android.graphics.PointF r4 = r10.A4O(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0691Ec.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L95
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0691Ec.A02
            java.lang.String r1 = "yuw4mNpzW34AqVSRehlxNeo"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkUUhZpWZ02e"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L89
        L7a:
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L87
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L88
        L87:
            r7 = 1
        L88:
            r5 = r7
        L89:
            if (r5 == 0) goto L90
            if (r6 == 0) goto L8f
            int r3 = r3 + (-1)
        L8f:
            return r3
        L90:
            if (r6 == 0) goto L8f
            int r3 = r3 + 1
            goto L8f
        L95:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0691Ec.A02
            java.lang.String r1 = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L89
            goto L7a
        L9f:
            r6 = 0
            goto L53
        La1:
            if (r12 <= 0) goto La5
            r6 = 1
            goto L53
        La5:
            r6 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0691Ec.A0C(com.facebook.ads.redexgen.X.4o, int, int):int");
    }

    @Override // com.facebook.ads.redexgen.uinode.ZY
    public final View A0D(AbstractC04734o abstractC04734o) {
        if (abstractC04734o.A21()) {
            return A01(abstractC04734o, A04(abstractC04734o));
        }
        if (abstractC04734o.A20()) {
            return A01(abstractC04734o, A03(abstractC04734o));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.ZY
    public final C1232Zn A0E(AbstractC04734o abstractC04734o) {
        if (!(abstractC04734o instanceof AnonymousClass50)) {
            return null;
        }
        return new C0692Ed(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.uinode.ZY
    public final int[] A0H(AbstractC04734o abstractC04734o, View view) {
        int[] iArr = new int[2];
        if (abstractC04734o.A20()) {
            iArr[0] = A00(abstractC04734o, view, A03(abstractC04734o));
        } else {
            iArr[0] = 0;
        }
        boolean zA21 = abstractC04734o.A21();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (zA21) {
            iArr[1] = A00(abstractC04734o, view, A04(abstractC04734o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
