package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0778Hp {
    public static byte[] A02;
    public static String[] A03 = {"ufcJ2HAihJosUsaZFLNZtYY8", "bmlqQEKzdEWSmfzemHV42aEu6x62Jcg2", "qe0e3vE0", "cU6ka9kke0C1UssuXKKId6s3LH0TnDgR", "NBXEsDwyr5gxTvwsXm2VTXnbHZeH6Vn2", "9ROYvUVyiX7gohkAn481H2mOSrWfwkEW", "kg13vNZY", "wCuY9NPZDJo5EDMJHr19Ezs"};
    public int A00;
    public long[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
            if (A03[5].charAt(4) != 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "qrOxj9WknsOFQ70fALMeLyi";
            strArr[0] = "P1AmcEUhDx5DKosu43I345dx";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{90, 78, -95, -105, -88, -109, 78, -105, -95, 78, -118, -81, -73, -94, -83, -86, -91, 97, -86, -81, -91, -90, -71, 97};
    }

    static {
        A01();
    }

    public C0778Hp() {
        this(32);
    }

    public C0778Hp(int i) {
        this.A01 = new long[i];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01[i];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 44) + i + A00(0, 10, 25) + this.A00);
    }

    public final void A04(long j) {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            int i2 = i * 2;
            String[] strArr = A03;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "C4hqpLWZ";
            strArr2[2] = "upiEXy76";
            this.A01 = Arrays.copyOf(jArr, i2);
        }
        long[] jArr2 = this.A01;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        jArr2[i3] = j;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
