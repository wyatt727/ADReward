package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0659Cj {
    public static String[] A05 = {"lKy0YI5EGjXv2", "kqfQDU0iwDhqaMHC0BsTfGE6FjC2jeup", "jv6iVn6YCI", "Kbod1kIlqRm2x7YGttwPvO3kKDdBerP9", "AKxPCvcOfBY8Sui08oZDK8EPANpoB5ev", "JY0GDhLNZiQYBqJ9WzpbNW6VWiMf19In", "nhad57ygvI1TjLq62wNjXmGRomNY9pWS", "x2lvOIXYuZTotm1szSwJqESRclSL2a8b"};
    public int A01;
    public boolean A02;
    public final C0660Ck A03 = new C0660Ck();
    public final C0788Hz A04 = new C0788Hz(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i) {
        int segmentLength;
        this.A01 = 0;
        int i2 = 0;
        do {
            int i3 = this.A01 + i;
            C0660Ck c0660Ck = this.A03;
            if (A05[0].length() == 13) {
                A05[5] = "SgZ2PRj4NlkJ3BHKSnaMRED72QUEdulA";
                int size = c0660Ck.A02;
                if (i3 >= size) {
                    break;
                }
                int[] iArr = this.A03.A09;
                int i4 = this.A01;
                int size2 = i4 + 1;
                this.A01 = size2;
                segmentLength = iArr[i4 + i];
                i2 += segmentLength;
            } else {
                throw new RuntimeException();
            }
        } while (segmentLength == 255);
        return i2;
    }

    public final C0660Ck A01() {
        return this.A03;
    }

    public final C0788Hz A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C0788Hz c0788Hz = this.A04;
        byte[] bArr = c0788Hz.A00;
        C0788Hz c0788Hz2 = this.A04;
        if (A05[2].length() == 26) {
            throw new RuntimeException();
        }
        A05[0] = "HnsfJzdopseCo";
        c0788Hz.A00 = Arrays.copyOf(bArr, Math.max(65025, c0788Hz2.A07()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[PHI: r3
      0x0097: PHI (r3v5 'segmentIndex' int) = (r3v1 'segmentIndex' int), (r3v6 'segmentIndex' int) binds: [B:46:0x0108, B:30:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.redexgen.uinode.InterfaceC0646Bt r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0659Cj.A05(com.facebook.ads.redexgen.X.Bt):boolean");
    }
}
