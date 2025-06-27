package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0655Cf {
    public static byte[] A05;
    public static String[] A06 = {"ACQ", "Z1SKPMzbMAJhhabQH0qvIzzSk7pS7MzN", "6aLpRH6Tia4Sh8DeOCrm6uJB9pdHn", "T4Je7I0RF5bnUk10PIFXPnn9hg731vE9", "YJYhptho8kfm6vGcPcLLXGA80bzp3", "trfcxoKHMENKiNLiuCQzDNtcz23hOMTL", "PokKsHpwVBHIedcIPmeYCrQhpW", "5FKTxH2gEdxAxWs98iwby2xSeh4hilLh"};
    public final int A00;
    public final C3 A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{110, 117, 103, -120, -70, -70, -68, -76, -80, -75, -82, 103, -120, -116, -102, 116, -118, -101, -103, 103, -86, -71, -64, -73, -69, -74, 103, -76, -74, -85, -84, 117, -102, -72, -89, -87, -79, -117, -76, -87, -72, -65, -74, -70, -81, -75, -76, -120, -75, -66, -103, -78, -73, -71, -76, -76, -77, -74, -72, -87, -88, 100, -76, -74, -77, -72, -87, -89, -72, -83, -77, -78, 100, -73, -89, -84, -87, -79, -87, 100, -72, -67, -76, -87, 100, 107, -118, -119, -118, 88, -76, -77, -76, -60, -64, -62, -53, -64, -54, -52, -43, -38};
    }

    static {
        A02();
    }

    public C0655Cf(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        AbstractC0763Ha.A03((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new C3(A00(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r8) {
        /*
            r7 = 1
            if (r8 != 0) goto L4
            return r7
        L4:
            int r0 = r8.hashCode()
            r6 = 2
            switch(r0) {
                case 3046605: goto L98;
                case 3046671: goto L86;
                case 3049879: goto L75;
                case 3049895: goto L46;
                default: goto Lc;
            }
        Lc:
            r0 = -1
        Ld:
            switch(r0) {
                case 0: goto Lab;
                case 1: goto Lab;
                case 2: goto Laa;
                case 3: goto Laa;
                default: goto L10;
            }
        L10:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 50
            r1 = 36
            r0 = 66
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r3 = r0.append(r8)
            r2 = 0
            r1 = 32
            r0 = 69
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = r0.toString()
            r2 = 32
            r1 = 18
            r0 = 68
            java.lang.String r0 = A01(r2, r1, r0)
            android.util.Log.w(r0, r3)
            return r7
        L46:
            r5 = 98
            r4 = 4
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0655Cf.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lac
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0655Cf.A06
            java.lang.String r1 = "rNJbBmSCz61bnA88RIw0tsQVuO"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wNvz1GaKF14i8ay7xmv7DcMchQNLl"
            r0 = 4
            r2[r0] = r1
            java.lang.String r0 = A01(r5, r4, r3)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        L75:
            r2 = 94
            r1 = 4
            r0 = 91
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            goto Ld
        L86:
            r2 = 90
            r1 = 4
            r0 = 79
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 3
            goto Ld
        L98:
            r2 = 86
            r1 = 4
            r0 = 37
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 2
            goto Ld
        Laa:
            return r6
        Lab:
            return r7
        Lac:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0655Cf.A00(java.lang.String):int");
    }
}
