package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04001s {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            bArrCopyOfRange[i4] = b;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1207Yn c1207Yn, AbstractC1310b5 abstractC1310b5, boolean z, InterfaceC03981q interfaceC03981q) {
        if (!C0796Ih.A1k(c1207Yn)) {
            C05126c c05126c = new C05126c(c1207Yn);
            C03841c c03841cA06 = abstractC1310b5.A0x().A0D().A06();
            c05126c.A0d(new JA(abstractC1310b5.A12(), c1207Yn.A09()));
            if (c03841cA06 == null) {
                interfaceC03981q.ACZ(AdError.CACHE_ERROR);
                return;
            }
            if (c03841cA06.A0J()) {
                interfaceC03981q.ACa();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C6Y c6y = new C6Y(c03841cA06.A0E(), abstractC1310b5.A0S(), abstractC1310b5.A0P());
            c6y.A04 = true;
            if (C0796Ih.A1Z(c1207Yn)) {
                c6y.A03 = A00(0, 5, 22);
            }
            switch (C03971p.A00[c03841cA06.A09().ordinal()]) {
                case 1:
                case 2:
                    c05126c.A0X(c6y);
                    break;
            }
            c05126c.A0b(new C05106a(abstractC1310b5.A10().A01(), -1, -1, abstractC1310b5.A0S(), abstractC1310b5.A0P()));
            c05126c.A0b(new C05106a(c03841cA06.A0D(), -1, -1, abstractC1310b5.A0S(), abstractC1310b5.A0P()));
            c05126c.A0W(new C1297as(c1207Yn, interfaceC03981q, c05126c, c03841cA06, z), new C6V(abstractC1310b5.A0S(), abstractC1310b5.A0P()));
            return;
        }
        interfaceC03981q.ACa();
    }
}
