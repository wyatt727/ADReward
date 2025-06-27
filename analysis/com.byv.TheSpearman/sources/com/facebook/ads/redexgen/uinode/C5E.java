package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5E {
    public static byte[] A02;
    public static String[] A03 = {"WXpxlTya5H7kpLIT7UUfzIgXOYds4Vfk", "JVDNa5tAOP", "C1CZfaM4quGDjTOWU4x6KBGTC5pPu33J", "VymAVHyd", "K8p7KG0zsDoAf7GmBTiUCUpdPzk9iS4o", "MydLOSuorekD0WEADrXIrTB2aFx1Ufvf", "1zIVUT6Fxq52O6VZbnoN9TsXnO1jN3fj", "z9Q03TMU5lxkReREt3I6AE4mCa6N3G46"};
    public final C1248a5<AnonymousClass56, C5C> A00 = new C1248a5<>();
    public final C04262s<AnonymousClass56> A01 = new C04262s<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-99, -59, -61, -60, 112, -64, -62, -65, -58, -71, -76, -75, 112, -74, -68, -79, -73, 112, -96, -94, -107, 112, -65, -62, 112, -96, -97, -93, -92};
    }

    static {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r0 = r9 ^ (-1);
        r3.A00 &= r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r9 != 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r5 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r6 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (com.facebook.ads.redexgen.uinode.C5E.A03[5].charAt(20) == 'R') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.C5E.A03;
        r2[0] = "LDlhycQGZBtlD6IMRSONBH11SqKxQWfy";
        r2[6] = "DCgYh9gvbnrpKHe96mnmPCff01xTtOfJ";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r7.A00.A0A(r4);
        com.facebook.ads.redexgen.uinode.C5C.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.C5E.A03;
        r2[7] = "9mfdPnfY5V3FVy8Q2gQ6uDsmmOIXndsz";
        r2[2] = "ekMjHGebRREBiMI4gT56rHDvbCCByAvd";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.C5E.A03;
        r1 = r2[7];
        r2 = r2[2];
        r1 = r1.charAt(19);
        r0 = r2.charAt(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r1 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.C5E.A03;
        r2[1] = "AZoo0ocwP6";
        r2[3] = "Mxzo3dXJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r9 != 8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        throw new java.lang.IllegalArgumentException(A01(0, 29, 9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.uinode.C04684j A00(com.facebook.ads.redexgen.uinode.AnonymousClass56 r8, int r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C5E.A00(com.facebook.ads.redexgen.X.56, int):com.facebook.ads.redexgen.X.4j");
    }

    public final C04684j A03(AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 8);
    }

    public final C04684j A04(AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 4);
    }

    public final AnonymousClass56 A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C5C.A01();
    }

    public final void A08(long j, AnonymousClass56 anonymousClass56) {
        this.A01.A0B(j, anonymousClass56);
    }

    public final void A09(AnonymousClass56 anonymousClass56) {
        C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A00 |= 1;
    }

    public final void A0A(AnonymousClass56 anonymousClass56) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            return;
        }
        c5c.A00 &= -2;
    }

    public final void A0B(AnonymousClass56 anonymousClass56) {
        int iA06 = this.A01.A06() - 1;
        while (true) {
            if (iA06 < 0) {
                break;
            }
            if (anonymousClass56 == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
            iA06--;
        }
        C5C info = this.A00.remove(anonymousClass56);
        if (info != null) {
            C5C.A02(info);
        }
    }

    public final void A0C(AnonymousClass56 anonymousClass56) {
        A0A(anonymousClass56);
    }

    public final void A0D(AnonymousClass56 anonymousClass56, C04684j c04684j) {
        C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A00 |= 2;
        c5cA00.A02 = c04684j;
    }

    public final void A0E(AnonymousClass56 anonymousClass56, C04684j c04684j) {
        C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A01 = c04684j;
        c5cA00.A00 |= 8;
    }

    public final void A0F(AnonymousClass56 anonymousClass56, C04684j c04684j) {
        C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A02 = c04684j;
        c5cA00.A00 |= 4;
    }

    public final void A0G(C5D c5d) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AnonymousClass56 anonymousClass56A09 = this.A00.A09(size);
            C5C c5cA0A = this.A00.A0A(size);
            if ((c5cA0A.A00 & 3) == 3) {
                c5d.AGo(anonymousClass56A09);
            } else {
                int index = c5cA0A.A00;
                if ((index & 1) != 0) {
                    if (c5cA0A.A02 == null) {
                        c5d.AGo(anonymousClass56A09);
                    } else {
                        C04684j c04684j = c5cA0A.A02;
                        C04684j c04684j2 = c5cA0A.A01;
                        if (A03[5].charAt(20) == 'R') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[1] = "fJVAe19tdP";
                        strArr[3] = "3fJsXDGb";
                        c5d.AEB(anonymousClass56A09, c04684j, c04684j2);
                    }
                } else if ((c5cA0A.A00 & 14) == 14) {
                    c5d.AE9(anonymousClass56A09, c5cA0A.A02, c5cA0A.A01);
                } else if ((c5cA0A.A00 & 12) == 12) {
                    c5d.AED(anonymousClass56A09, c5cA0A.A02, c5cA0A.A01);
                } else {
                    int index2 = c5cA0A.A00;
                    if ((index2 & 4) != 0) {
                        c5d.AEB(anonymousClass56A09, c5cA0A.A02, null);
                    } else {
                        int index3 = c5cA0A.A00;
                        if ((index3 & 8) != 0) {
                            c5d.AE9(anonymousClass56A09, c5cA0A.A02, c5cA0A.A01);
                        }
                    }
                }
            }
            C5C.A02(c5cA0A);
        }
    }

    public final boolean A0H(AnonymousClass56 anonymousClass56) {
        C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AnonymousClass56 anonymousClass56) {
        C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
