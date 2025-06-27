package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.6E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6E {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C6C> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C6C A00() {
        C6C c6c = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C6C c6c2 = c6c;
            if (c6c2 == null) {
                C6C c6cA00 = C6C.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return c6cA00;
                }
            } else {
                return c6c2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.uinode.C6C A01(com.facebook.ads.redexgen.uinode.C05357f r5, com.facebook.ads.redexgen.uinode.C6C r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.6C r0 = com.facebook.ads.redexgen.uinode.C6K.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.89 r5 = r5.A07()
            int r4 = com.facebook.ads.redexgen.uinode.C8A.A1Q
            com.facebook.ads.redexgen.X.8B r3 = new com.facebook.ads.redexgen.X.8B
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A9a(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C6E.A01(com.facebook.ads.redexgen.X.7f, com.facebook.ads.redexgen.X.6C):com.facebook.ads.redexgen.X.6C");
    }

    public static C6C A02(C05357f c05357f, C6C c6c, C6D c6d) {
        C6F c6fA00 = null;
        try {
            if (AbstractC0795Ig.A06(c05357f) && (c6c == null || TextUtils.isEmpty(c6c.A03()))) {
                c6fA00 = C6G.A00(c05357f.getContentResolver());
            }
        } catch (Throwable th) {
            c05357f.A07().A9a(A04(12, 7, 6), C8A.A1S, new C8B(th));
        }
        if (c6fA00 != null && c6fA00.A01 != null) {
            A03.set(c6fA00.A01);
            c6d.A05(c6fA00.A01);
        }
        if (c6c == null && c6fA00 != null && !TextUtils.isEmpty(c6fA00.A00)) {
            return new C6C(c6fA00.A00, c6fA00.A02, C6B.A05);
        }
        return c6c;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C6D c6d) {
        A02.set(c6d.A02());
        A03.set(c6d.A03());
    }

    public static void A07(C05357f c05357f) {
        long jA01;
        C6C c6cA02;
        try {
            C6D c6d = new C6D(c05357f);
            A06(c6d);
            if (A08()) {
                return;
            }
            AtomicReference<C6C> atomicReference = A02;
            C6C c6c = atomicReference.get();
            if (c6c != null && !TextUtils.isEmpty(c6c.A03())) {
                jA01 = c6c.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0) {
                long cacheTS = System.currentTimeMillis();
                if (cacheTS - jA01 < AbstractC0795Ig.A00(c05357f)) {
                    return;
                }
            }
            if (AbstractC0795Ig.A07(c05357f)) {
                c6cA02 = A01(c05357f, A02(c05357f, null, c6d));
            } else {
                c6cA02 = A02(c05357f, A01(c05357f, null), c6d);
            }
            if (c6cA02 != null && !TextUtils.isEmpty(c6cA02.A03())) {
                atomicReference.set(c6cA02);
                c6d.A04(c6cA02);
            }
        } catch (Throwable t) {
            c05357f.A07().A9a(A04(12, 7, 6), C8A.A1R, new C8B(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = L0.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String strA04 = A04(0, 12, 9);
            boolean updated2 = L0.A05(strA04);
            if (updated2) {
                A03.set(L0.A01(strA04));
                z = true;
            }
        }
        boolean zA04 = L0.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!zA04) {
                return z;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!zA04) {
                return z;
            }
        }
        String strA042 = A04(19, 13, 79);
        boolean updated3 = L0.A05(strA042);
        if (updated3) {
            String strA01 = L0.A01(strA042);
            AtomicReference<C6C> atomicReference = A02;
            if (strA01 == null) {
                strA01 = A04(0, 0, 68);
            }
            atomicReference.set(new C6C(strA01, false, C6B.A04));
            return true;
        }
        return z;
    }
}
