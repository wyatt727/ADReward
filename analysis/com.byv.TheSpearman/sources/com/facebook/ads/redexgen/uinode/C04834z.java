package com.facebook.ads.redexgen.uinode;

import android.view.animation.Interpolator;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04834z {
    public static byte[] A07;
    public static String[] A08 = {"mhxsSpCIE", "HPHd8ajTElCt4xjey", "7Zb31Oi", "DD", "BNYok10xEf4gIs6uNCWHihSbJqoYG9kt", "IDmLc2m45tKSy5LkWISCl9o5476O0eoP", "nkkzGeiOD1wUj3jYejs7CProiVmlcOmv", "T15Acsoxou"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Interpolator A05;
    public boolean A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{111, 64, 6, 95, 73, 83, 6, 86, 84, 73, 80, 79, 66, 67, 6, 71, 72, 6, 79, 72, 82, 67, 84, 86, 73, 74, 71, 82, 73, 84, 10, 6, 95, 73, 83, 6, 75, 83, 85, 82, 6, 85, 67, 82, 6, 71, 6, 86, 73, 85, 79, 82, 79, 80, 67, 6, 66, 83, 84, 71, 82, 79, 73, 72, 8, Utf8.REPLACEMENT_BYTE, 57, 35, 57, 54, Utf8.REPLACEMENT_BYTE, 40, 12, 51, Utf8.REPLACEMENT_BYTE, 45, 30, 46, Utf8.REPLACEMENT_BYTE, 34, 33, 33, 109, 41, 56, Utf8.REPLACEMENT_BYTE, 44, 57, 36, 34, 35, 109, 32, 56, 62, 57, 109, 47, 40, 109, 44, 109, Base64.padSymbol, 34, 62, 36, 57, 36, 59, 40, 109, 35, 56, 32, 47, 40, Utf8.REPLACEMENT_BYTE, 102, 88, 90, 90, 65, 93, 21, 102, 86, 71, 90, 89, 89, 21, 84, 86, 65, 92, 90, 91, 21, 92, 70, 21, 87, 80, 92, 91, 82, 21, 64, 69, 81, 84, 65, 80, 81, 21, 65, 90, 90, 21, 83, 71, 80, 68, 64, 80, 91, 65, 89, 76, 27, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 76, 90, 64, 21, 84, 71, 80, 21, 91, 90, 65, 21, 86, 93, 84, 91, 82, 92, 91, 82, 21, 92, 65, 21, 64, 91, 89, 80, 70, 70, 21, 91, 80, 86, 80, 70, 70, 84, 71, 76};
    }

    static {
        A02();
    }

    public C04834z(int i, int i2) {
        this(i, i2, Integer.MIN_VALUE, null);
    }

    public C04834z(int i, int i2, int i3, Interpolator interpolator) {
        this.A04 = -1;
        this.A06 = false;
        this.A00 = 0;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
    }

    private void A01() {
        if (this.A05 == null || this.A01 >= 1) {
            if (this.A01 >= 1) {
                return;
            } else {
                throw new IllegalStateException(A00(76, 41, 110));
            }
        }
        throw new IllegalStateException(A00(0, 64, 5));
    }

    public final void A03(int i) {
        this.A04 = i;
    }

    public final void A04(int i, int i2, int i3, Interpolator interpolator) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
        this.A06 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.facebook.ads.redexgen.uinode.C0690Eb r7) {
        /*
            r6 = this;
            int r0 = r6.A04
            r3 = 0
            if (r0 < 0) goto L10
            int r1 = r6.A04
            r0 = -1
            r6.A04 = r0
            r7.A1S(r1)
            r6.A06 = r3
            return
        L10:
            boolean r4 = r6.A06
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C04834z.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb2
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C04834z.A08
            java.lang.String r1 = "212KLvw"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "ScHRjLy9POjuhpXgs"
            r0 = 1
            r2[r0] = r1
            if (r4 == 0) goto Laf
            r6.A01()
            android.view.animation.Interpolator r0 = r6.A05
            if (r0 != 0) goto La1
            int r5 = r6.A01
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C04834z.A08
            r0 = 5
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L86
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C04834z.A08
            java.lang.String r1 = "zRXbG2Pg2WQl47tw6BDwFwXd2KU4dPOe"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "nOulwAzWUzM6mtcilc92MTdFBYoxfopf"
            r0 = 4
            r2[r0] = r1
            if (r5 != r4) goto L95
        L59:
            com.facebook.ads.redexgen.X.55 r2 = r7.A08
            int r1 = r6.A02
            int r0 = r6.A03
            r2.A0A(r1, r0)
        L62:
            int r0 = r6.A00
            int r1 = r0 + 1
            r6.A00 = r1
            r0 = 10
            if (r1 <= r0) goto L83
            r2 = 64
            r1 = 12
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r4 = A00(r2, r1, r0)
            r2 = 117(0x75, float:1.64E-43)
            r1 = 104(0x68, float:1.46E-43)
            r0 = 22
            java.lang.String r0 = A00(r2, r1, r0)
            android.util.Log.e(r4, r0)
        L83:
            r6.A06 = r3
        L85:
            return
        L86:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C04834z.A08
            java.lang.String r1 = "ZgMLwAgsg"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "4bf8d9ADjt"
            r0 = 7
            r2[r0] = r1
            if (r5 != r4) goto L95
            goto L59
        L95:
            com.facebook.ads.redexgen.X.55 r4 = r7.A08
            int r2 = r6.A02
            int r1 = r6.A03
            int r0 = r6.A01
            r4.A0B(r2, r1, r0)
            goto L62
        La1:
            com.facebook.ads.redexgen.X.55 r5 = r7.A08
            int r4 = r6.A02
            int r2 = r6.A03
            int r1 = r6.A01
            android.view.animation.Interpolator r0 = r6.A05
            r5.A0C(r4, r2, r1, r0)
            goto L62
        Laf:
            r6.A00 = r3
            goto L85
        Lb2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C04834z.A05(com.facebook.ads.redexgen.X.Eb):void");
    }

    public final boolean A06() {
        return this.A04 >= 0;
    }
}
