package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ir, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0804Ir {
    A07,
    A08,
    A05,
    A06,
    A04,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"CoeI5qxpy1nzBU2HqPuBP2EjNKXl", "2QVULSr2cnp6GdJqlDXRW8b5XXXh3hMX", "813w1lpmsq", "162t", "yQveOSeoJgK3GG", "9w5E8CzY6m1n4hygXrseg7VRB7EsZT51", "L2DlJsKGhh650sdNsXzHdsi3nonkomMk", "9e896LaDKrRwUGEGxpikTCFLA2EDc0Ve"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, -5, 3, 6, -1, -2, -43, -40, -48, -48, -50, -51, -55, -52, -60, -60, -58, -53, -60, -70, -67, -75, -75, -73, -68, -75, -51, -70, -77, -63, -63, -51, -63, -62, -64, -73, -79, -62, -92, -91, -86, -75, -94, -91, -99, -99, -101, -102, -73, -84, -75, -85, -80, -75, -82};
        if (A01[2].length() == 4) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "Y6chWCHiEHN0DdaKB8VVwvMQijKJ1yIC";
        strArr[6] = "jbJMvCo49VWYI4oJAoDoWItgvmTGViMF";
    }

    static {
        A01();
    }
}
