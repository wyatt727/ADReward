package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.ads.redexgen.X.3B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3B {
    public static String[] A05 = {"efs8eZdEWHsCfUb6qOzicmMnQm4SneBY", "GPD1kjm6fR3i7blABsL8PkfqVt5tQ0ec", "1ZMAOqgxiysbgCK2QhJ8YR6mzQdOOVTU", "tADzoHnDRwqyF4JfOWpRm", "", "2dCxtsKJi8key4A0", "YZUwpVg0T4azRRaUQd2X9mlkfrI9cQeh", "C6BrW2LKkOXM7XSn"};
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C3B(View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i) {
        switch (i) {
            case 0:
                return this.A01;
            case 1:
                return this.A00;
            default:
                return null;
        }
    }

    private void A01(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.A01 = viewParent;
                break;
            case 1:
                this.A00 = viewParent;
                break;
        }
    }

    public final void A02() {
        A03(0);
    }

    public final void A03(int i) {
        ViewParent viewParentA00 = A00(i);
        if (viewParentA00 != null) {
            AbstractC04433j.A02(viewParentA00, this.A04, i);
            A01(i, null);
        }
    }

    public final void A04(boolean z) {
        if (this.A02) {
            C3T.A08(this.A04);
        }
        this.A02 = z;
    }

    public final boolean A05() {
        return A09(0);
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07(float f, float f2) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(0)) == null) {
            return false;
        }
        return AbstractC04433j.A06(viewParentA00, this.A04, f, f2);
    }

    public final boolean A08(float f, float f2, boolean z) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(0)) == null) {
            return false;
        }
        return AbstractC04433j.A07(viewParentA00, this.A04, f, f2, z);
    }

    public final boolean A09(int i) {
        return A00(i) != null;
    }

    public final boolean A0A(int i) {
        return A0B(i, 0);
    }

    public final boolean A0B(int i, int i2) {
        if (A09(i2)) {
            return true;
        }
        if (A06()) {
            if (A05[0].charAt(13) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "WHooJguTbRSPJrOooyt3LEnarcCTCzBe";
            strArr[1] = "8Bjeqw0rr3DdKBFvYwfvH0FxnGa8049d";
            View view = this.A04;
            for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
                if (AbstractC04433j.A08(parent, view, this.A04, i, i2)) {
                    A01(i2, parent);
                    AbstractC04433j.A05(parent, view, this.A04, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A0C(int i, int i2, int i3, int i4, int[] iArr) {
        return A0D(i, i2, i3, i4, iArr, 0);
    }

    public final boolean A0D(int i, int i2, int i3, int i4, int[] iArr, int startX) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(startX)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            int i5 = 0;
            int i6 = 0;
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                i5 = iArr[0];
                i6 = iArr[1];
            }
            AbstractC04433j.A03(viewParentA00, this.A04, i, i2, i3, i4, startX);
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i5;
                iArr[1] = iArr[1] - i6;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean A0E(int i, int i2, int[] iArr, int[] iArr2) {
        return A0F(i, i2, iArr, iArr2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0F(int r17, int r18, int[] r19, int[] r20, int r21) {
        /*
            r16 = this;
            r14 = r19
            r1 = r16
            r3 = r1
            boolean r0 = r1.A06()
            r9 = 0
            if (r0 == 0) goto La6
            r15 = r21
            android.view.ViewParent r10 = r1.A00(r15)
            if (r10 != 0) goto L15
            return r9
        L15:
            r8 = 1
            r12 = r17
            r13 = r18
            r4 = r20
            if (r12 != 0) goto L20
            if (r13 == 0) goto La0
        L20:
            r7 = 0
            r6 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C3B.A05
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto L9a
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3B.A05
            java.lang.String r1 = "3VbjZKhXDsexEmt2meqPVZABMNEQkFPW"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L41
            android.view.View r0 = r3.A04
            r0.getLocationInWindow(r4)
            r7 = r4[r9]
            r6 = r4[r8]
        L41:
            if (r14 != 0) goto L67
            int[] r5 = r3.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3B.A05
            r0 = 5
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L8b
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3B.A05
            java.lang.String r1 = ""
            r0 = 4
            r2[r0] = r1
            if (r5 != 0) goto L65
        L60:
            r0 = 2
            int[] r0 = new int[r0]
            r3.A03 = r0
        L65:
            int[] r14 = r3.A03
        L67:
            r14[r9] = r9
            r14[r8] = r9
            android.view.View r11 = r3.A04
            com.facebook.ads.redexgen.uinode.AbstractC04433j.A04(r10, r11, r12, r13, r14, r15)
            if (r4 == 0) goto L81
            android.view.View r0 = r3.A04
            r0.getLocationInWindow(r4)
            r0 = r4[r9]
            int r0 = r0 - r7
            r4[r9] = r0
            r0 = r4[r8]
            int r0 = r0 - r6
            r4[r8] = r0
        L81:
            r0 = r14[r9]
            if (r0 != 0) goto L89
            r0 = r14[r8]
            if (r0 == 0) goto L8a
        L89:
            r9 = 1
        L8a:
            return r9
        L8b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3B.A05
            java.lang.String r1 = "gHL5QaZEq3qu3ZW6"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "on2hgQBHubksAtN0"
            r0 = 7
            r2[r0] = r1
            if (r5 != 0) goto L65
            goto L60
        L9a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La0:
            if (r4 == 0) goto La6
            r4[r9] = r9
            r4[r8] = r9
        La6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3B.A0F(int, int, int[], int[], int):boolean");
    }
}
