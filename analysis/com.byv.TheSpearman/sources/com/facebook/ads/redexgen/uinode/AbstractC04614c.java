package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.uinode.AnonymousClass56;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04614c<VH extends AnonymousClass56> {
    public static byte[] A02;
    public static String[] A03 = {"W324oDAhe3QD27ZyNAxx1dE4409WhTwA", "Ikg10MzvREcGgl38", "tAS262iMJzRr57vvpxPoG7SYxewns3xN", "rCt", "3uu7", "cbDGC8uMMSmc1mSYy17nilWnTwttZfvA", "2T", "U5f6pdP97"};
    public final C04624d A01 = new C04624d();
    public boolean A00 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WHsKZN6zyncpMK6d";
            strArr[4] = "wlW4";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-48, -44, -98, -63, -16, -29, -33, -14, -29, -44, -25, -29, -11, -54, -50, -104, -57, -26, -70, -31, -26, -36, -50, -31, -35, -17};
    }

    public abstract VH A0C(ViewGroup viewGroup, int i);

    public abstract void A0D(VH vh, int i);

    public abstract int A0E();

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    private final void A02(VH holder, int i, List<Object> payloads) {
        A0D(holder, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final int A03(int i) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final long A04(int i) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final VH A05(ViewGroup viewGroup, int i) {
        AbstractC04242q.A01(A00(0, 13, 94));
        VH vh = (VH) A0C(viewGroup, i);
        vh.A00 = i;
        AbstractC04242q.A00();
        return vh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A06() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A07(AbstractC04634e abstractC04634e) {
        this.A01.registerObserver(abstractC04634e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A08(AbstractC04634e abstractC04634e) {
        this.A01.unregisterObserver(abstractC04634e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(VH r6, int r7) {
        /*
            r5 = this;
            r6.A03 = r7
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L2c
            long r2 = r5.A04(r7)
            java.lang.String[] r4 = com.facebook.ads.redexgen.uinode.AbstractC04614c.A03
            r0 = 7
            r1 = r4[r0]
            r0 = 6
            r0 = r4[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L6e
            java.lang.String[] r4 = com.facebook.ads.redexgen.uinode.AbstractC04614c.A03
            java.lang.String r1 = "OgtetI94x"
            r0 = 7
            r4[r0] = r1
            java.lang.String r1 = "QU"
            r0 = 6
            r4[r0] = r1
            r6.A05 = r2
        L2c:
            r0 = 519(0x207, float:7.27E-43)
            r3 = 1
            r6.A0U(r3, r0)
            r2 = 13
            r1 = 13
            r0 = 88
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.uinode.AbstractC04242q.A01(r0)
            java.util.List r0 = r6.A0L()
            r5.A02(r6, r7, r0)
            r6.A0N()
            android.view.View r0 = r6.A0H
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof com.facebook.ads.redexgen.uinode.C04744p
            if (r0 == 0) goto L57
            com.facebook.ads.redexgen.X.4p r1 = (com.facebook.ads.redexgen.uinode.C04744p) r1
            r1.A01 = r3
        L57:
            com.facebook.ads.redexgen.uinode.AbstractC04242q.A00()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.AbstractC04614c.A03
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L74
        L6e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L74:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.AbstractC04614c.A03
            java.lang.String r1 = "GQKIQ0ZEK"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "Zf"
            r0 = 6
            r2[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.AbstractC04614c.A09(com.facebook.ads.redexgen.X.56, int):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final boolean A0A() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final boolean A0B(VH holder) {
        return false;
    }
}
