package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC0755Gr A00;
    public final InterfaceC0757Gt A01;
    public final InterfaceC0757Gt A02;
    public final HK A03;
    public final I3 A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] - i3) - 26;
            String[] strArr = A06;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A06[5] = "z6hEl1VDyGriGJRg";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, -115, Byte.MIN_VALUE, 124, -113, Byte.MIN_VALUE, 95, 124, -113, 124, 110, -124, -119, -122};
    }

    static {
        A01();
    }

    public EL(HK hk, InterfaceC0757Gt interfaceC0757Gt) {
        this(hk, interfaceC0757Gt, null, null, null);
    }

    public EL(HK hk, InterfaceC0757Gt interfaceC0757Gt, InterfaceC0757Gt interfaceC0757Gt2, InterfaceC0755Gr interfaceC0755Gr, I3 i3) {
        AbstractC0763Ha.A01(interfaceC0757Gt);
        this.A03 = hk;
        this.A02 = interfaceC0757Gt;
        this.A01 = interfaceC0757Gt2;
        this.A00 = interfaceC0755Gr;
        this.A04 = i3;
    }

    public final HK A02() {
        return this.A03;
    }

    public final C1129Vk A03(boolean z) {
        InterfaceC0758Gu c1141Vw;
        InterfaceC0757Gt interfaceC0757Gt = this.A01;
        if (interfaceC0757Gt != null) {
            c1141Vw = interfaceC0757Gt.A4X();
        } else {
            c1141Vw = new C1141Vw();
        }
        if (z) {
            return new C1129Vk(this.A03, C1142Vx.A02, c1141Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C1130Vl c1130Vl = new C1130Vl(this.A03, 2097152L);
        InterfaceC0758Gu interfaceC0758GuA4X = this.A02.A4X();
        I3 i3 = this.A04;
        if (i3 != null) {
            interfaceC0758GuA4X = new C1134Vp(interfaceC0758GuA4X, i3, -1000);
        }
        InterfaceC0758Gu upstream = c1141Vw;
        return new C1129Vk(this.A03, interfaceC0758GuA4X, upstream, c1130Vl, 1, null);
    }

    public final I3 A04() {
        I3 i3 = this.A04;
        return i3 != null ? i3 : new I3();
    }
}
