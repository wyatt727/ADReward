package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.4P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4P implements Runnable {
    public static Comparator<C4O> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<C4P> A07;
    public long A00;
    public long A01;
    public ArrayList<C0690Eb> A02 = new ArrayList<>();
    public ArrayList<C4O> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C4O>() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C4O c4o, C4O c4o2) {
                if ((c4o.A03 == null) != (c4o2.A03 == null)) {
                    return c4o.A03 == null ? 1 : -1;
                }
                if (c4o.A04 != c4o2.A04) {
                    return c4o.A04 ? -1 : 1;
                }
                int i = c4o2.A02 - c4o.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = c4o.A00;
                int deltaViewVelocity = c4o2.A00;
                int i3 = i2 - deltaViewVelocity;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        };
    }

    private AnonymousClass56 A00(C0690Eb c0690Eb, int i, long j) {
        if (A08(c0690Eb, i)) {
            return null;
        }
        C04804w c04804w = c0690Eb.A0r;
        try {
            c0690Eb.A1K();
            AnonymousClass56 anonymousClass56A0I = c04804w.A0I(i, false, j);
            if (anonymousClass56A0I != null) {
                if (anonymousClass56A0I.A0Y() && !anonymousClass56A0I.A0Z()) {
                    c04804w.A0T(anonymousClass56A0I.A0H);
                } else {
                    c04804w.A0Z(anonymousClass56A0I, false);
                }
            }
            return anonymousClass56A0I;
        } finally {
            c0690Eb.A1m(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x0078 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r10 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.Eb> r0 = r10.A02
            int r4 = r0.size()
            r5 = 0
            r3 = 0
        L8:
            r2 = 0
            if (r3 >= r4) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.Eb> r0 = r10.A02
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.Eb r1 = (com.facebook.ads.redexgen.uinode.C0690Eb) r1
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L23
            com.facebook.ads.redexgen.X.Zp r0 = r1.A02
            r0.A04(r1, r2)
            com.facebook.ads.redexgen.X.Zp r0 = r1.A02
            int r0 = r0.A00
            int r5 = r5 + r0
        L23:
            int r3 = r3 + 1
            goto L8
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            r0.ensureCapacity(r5)
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4P.A06
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L44
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4P.A06
            java.lang.String r1 = "OH"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "7S"
            r0 = 7
            r2[r0] = r1
            r8 = 0
        L51:
            if (r8 >= r4) goto Lb3
            java.util.ArrayList<com.facebook.ads.redexgen.X.Eb> r0 = r10.A02
            java.lang.Object r9 = r0.get(r8)
            com.facebook.ads.redexgen.X.Eb r9 = (com.facebook.ads.redexgen.uinode.C0690Eb) r9
            int r0 = r9.getWindowVisibility()
            if (r0 == 0) goto L64
        L61:
            int r8 = r8 + 1
            goto L51
        L64:
            com.facebook.ads.redexgen.X.Zp r7 = r9.A02
            int r0 = r7.A01
            int r6 = java.lang.Math.abs(r0)
            int r0 = r7.A02
            int r0 = java.lang.Math.abs(r0)
            int r6 = r6 + r0
            r5 = 0
        L74:
            int r0 = r7.A00
            int r0 = r0 * 2
            if (r5 >= r0) goto L61
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            int r0 = r0.size()
            if (r3 < r0) goto Laa
            com.facebook.ads.redexgen.X.4O r0 = new com.facebook.ads.redexgen.X.4O
            r0.<init>()
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r1 = r10.A03
            r1.add(r0)
        L8c:
            int[] r2 = r7.A03
            int r1 = r5 + 1
            r2 = r2[r1]
            if (r2 > r6) goto La8
            r1 = 1
        L95:
            r0.A04 = r1
            r0.A02 = r6
            r0.A00 = r2
            r0.A03 = r9
            int[] r1 = r7.A03
            r1 = r1[r5]
            r0.A01 = r1
            int r3 = r3 + 1
            int r5 = r5 + 2
            goto L74
        La8:
            r1 = 0
            goto L95
        Laa:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.4O r0 = (com.facebook.ads.redexgen.uinode.C4O) r0
            goto L8c
        Lb3:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r1 = r10.A03
            java.util.Comparator<com.facebook.ads.redexgen.X.4O> r0 = com.facebook.ads.redexgen.uinode.C4P.A04
            java.util.Collections.sort(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4P.A02():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04(long r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r3.A03
            int r0 = r0.size()
            if (r2 >= r0) goto L15
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r3.A03
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.4O r1 = (com.facebook.ads.redexgen.uinode.C4O) r1
            com.facebook.ads.redexgen.X.Eb r0 = r1.A03
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            r3.A06(r1, r4)
            r1.A00()
            int r2 = r2 + 1
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4P.A04(long):void");
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(C4O c4o, long j) {
        AnonymousClass56 anonymousClass56A00 = A00(c4o.A03, c4o.A01, c4o.A04 ? Long.MAX_VALUE : j);
        if (anonymousClass56A00 != null && anonymousClass56A00.A09 != null && anonymousClass56A00.A0Y() && !anonymousClass56A00.A0Z()) {
            A07(anonymousClass56A00.A09.get(), j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.uinode.C0690Eb r7, long r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L26
            com.facebook.ads.redexgen.X.4C r3 = r7.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C4P.A06
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4P.A06
            java.lang.String r1 = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW"
            r0 = 6
            r2[r0] = r1
            int r0 = r3.A06()
            if (r0 == 0) goto L26
            r7.A1N()
        L26:
            com.facebook.ads.redexgen.X.Zp r3 = r7.A02
            r0 = 1
            r3.A04(r7, r0)
            int r0 = r3.A00
            if (r0 == 0) goto L76
            r2 = 0
            r1 = 18
            r0 = 7
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L6e
            com.facebook.ads.redexgen.uinode.AbstractC04242q.A01(r0)     // Catch: java.lang.Throwable -> L6e
            com.facebook.ads.redexgen.X.53 r1 = r7.A0s     // Catch: java.lang.Throwable -> L6e
            com.facebook.ads.redexgen.X.4c r0 = r7.A04     // Catch: java.lang.Throwable -> L6e
            r1.A05(r0)     // Catch: java.lang.Throwable -> L6e
            r4 = 0
        L43:
            int r0 = r3.A00     // Catch: java.lang.Throwable -> L6e
            int r5 = r0 * 2
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C4P.A06
            r0 = 6
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 73
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4P.A06
            java.lang.String r1 = "nG"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "TD"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L73
            int[] r0 = r3.A03     // Catch: java.lang.Throwable -> L6e
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L6e
            r6.A00(r7, r0, r8)     // Catch: java.lang.Throwable -> L6e
            int r4 = r4 + 2
            goto L43
        L6e:
            r0 = move-exception
            com.facebook.ads.redexgen.uinode.AbstractC04242q.A00()
            throw r0
        L73:
            com.facebook.ads.redexgen.uinode.AbstractC04242q.A00()
        L76:
            return
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4P.A07(com.facebook.ads.redexgen.X.Eb, long):void");
    }

    public static boolean A08(C0690Eb c0690Eb, int i) {
        int iA06 = c0690Eb.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            AnonymousClass56 anonymousClass56A0F = C0690Eb.A0F(c0690Eb.A01.A0A(i2));
            int childCount = anonymousClass56A0F.A03;
            if (childCount == i && !anonymousClass56A0F.A0Z()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C0690Eb c0690Eb) {
        this.A02.add(c0690Eb);
    }

    public final void A0A(C0690Eb c0690Eb) {
        this.A02.remove(c0690Eb);
    }

    public final void A0B(C0690Eb c0690Eb, int i, int i2) {
        if (c0690Eb.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = c0690Eb.getNanoTime();
            c0690Eb.post(this);
        }
        c0690Eb.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC04242q.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                C0690Eb c0690Eb = this.A02.get(i);
                if (c0690Eb.getWindowVisibility() == 0) {
                    jMax = Math.max(c0690Eb.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                AbstractC04242q.A00();
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
        } finally {
            this.A01 = 0L;
            AbstractC04242q.A00();
        }
    }
}
