package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.2r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04252r {
    public static final int[] A00 = new int[0];
    public static final long[] A01 = new long[0];
    public static final Object[] A02 = new Object[0];

    public static int A00(int i) {
        return A01(i * 8) / 8;
    }

    public static int A01(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = 1 << i2;
            if (i <= i3 - 12) {
                int i4 = (1 << i2) - 12;
                return i4;
            }
        }
        return i;
    }

    public static int A02(int[] iArr, int i, int i2) {
        int midVal = 0;
        int mid = i - 1;
        while (midVal <= mid) {
            int lo = midVal + mid;
            int hi = lo >>> 1;
            int lo2 = iArr[hi];
            if (lo2 < i2) {
                midVal = hi + 1;
            } else if (lo2 > i2) {
                mid = hi - 1;
            } else {
                return hi;
            }
        }
        int lo3 = midVal ^ (-1);
        return lo3;
    }

    public static int A03(long[] jArr, int i, long j) {
        int i2 = 0;
        int i3 = i - 1;
        while (i2 <= i3) {
            int lo = i2 + i3;
            int i4 = lo >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i2 = i4 + 1;
            } else if (j2 > j) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        int lo2 = i2 ^ (-1);
        return lo2;
    }

    public static boolean A04(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
