package com.facebook.ads.redexgen.uinode;

import android.content.Context;

/* loaded from: assets/audience_network.dex */
public class ZE extends C04413h {
    public static String[] A01 = {"OZnJYNnF6iNpWafuL0M1gR4fftLtNKLH", "jp3I09eVvza8VUO8I2V9bgD0uqoo2eoT", "o0dN6TNbDPM1OFHwgByg4fes3ij5f0X", "koNydS70AznyGH22QswPXmmCOWqgW7Lp", "FfQJA5dgq067zFURnAgi95yx0TDwU15M", "ldbJEvhnHaVxGyPD7qN3mcBmJCgMtAqs", "ixVhzklDdFphFwHpdcaKVfByjOKIZSaQ", "Bo7wQ6HJBqNsqngGB"};
    public int A00;

    public ZE(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[PHI: r0
      0x0049: PHI (r0v15 'height' int) = (r0v14 'height' int), (r0v16 'height' int) binds: [B:16:0x0058, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.ads.redexgen.uinode.C04413h, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            int r3 = r6.A00
            r4 = 0
        L3:
            int r5 = r6.getChildCount()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.ZE.A01
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L20:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.ZE.A01
            java.lang.String r1 = "oQM5as2Hx349sp"
            r0 = 2
            r2[r0] = r1
            if (r4 >= r5) goto L5b
            android.view.View r5 = r6.getChildAt(r4)
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r5.measure(r7, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.ZE.A01
            r0 = 3
            r1 = r1[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            r0 = 78
            if (r1 == r0) goto L4d
            int r0 = r5.getMeasuredHeight()
            if (r0 <= r3) goto L4a
        L49:
            r3 = r0
        L4a:
            int r4 = r4 + 1
            goto L3
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.ZE.A01
            java.lang.String r1 = "8uJesuWryF1bocGxs"
            r0 = 7
            r2[r0] = r1
            int r0 = r5.getMeasuredHeight()
            if (r0 <= r3) goto L4a
            goto L49
        L5b:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.ZE.onMeasure(int, int):void");
    }
}
