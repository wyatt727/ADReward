package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VY implements JE {
    public static byte[] A04;
    public static String[] A05 = {"Y66c6k3Hy3UvBBfpHck", "fJ4NdAtGEgbYsoLarolV0m2U2ouke5wB", "RcyYmVgVLeSkKDa12w3", "KskJyNeVQ7IEAjxWCckPmucmu9amULkO", "1ed8Y", "R", "mHN6PRZU6o6WB3AjYfdaJfhjKiNadrGW", "OPv53LJXnFYa9uQB3GUlIx9f3blXJ2fU"};
    public static final String A06;
    public VZ A00;
    public C1390ca<C0801Io, C0806It> A01;
    public final C1206Ym A02;
    public final C1385cU A03 = C1385cU.A01();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[1].charAt(19) != 'V') {
                throw new RuntimeException();
            }
            A05[1] = "obfng8wQuS9GtxnUf86VO2yIawxGqzEf";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A02() {
        A04 = new byte[]{-29, -9, -12, -81, -4, -12, -13, -8, -16, -81, -14, 1, -12, -16, 3, -8, 5, -12, -81, 5, -8, -12, 6, -81, -8, 2, -81, -3, 4, -5, -5, -67, -57, -32, -28, -41, -39, -37, -27, -26, -41, -28, -37, -32, -39, -110, -45, -110, -32, -25, -34, -34, -110, -43, -28, -41, -45, -26, -37, -24, -41, -110, -24, -37, -41, -23, -109, 6, 25, 21, 39, 32, 31, 25, 30, 36, -12, 17, 36, 17, -48, 25, 35, -48, 30, 37, 28, 28, -47, 4, -10, -12, 0, -1, -11, -16, -12, -7, -14, -1, -1, -10, -3};
    }

    static {
        A02();
        A06 = VY.class.getSimpleName();
    }

    public VY(C1206Ym c1206Ym) {
        this.A02 = c1206Ym;
    }

    private void A01() {
        this.A02.A07().A9a(A00(89, 14, 40), 3600, new C8B(A00(67, 22, 71)));
    }

    @Override // com.facebook.ads.redexgen.uinode.JE
    public final void ABG() {
        C1390ca<C0801Io, C0806It> c1390ca = this.A01;
        if (c1390ca != null) {
            c1390ca.A03.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.JE
    public final void ADg() {
        C1390ca<C0801Io, C0806It> c1390ca = this.A01;
        if (c1390ca != null) {
            c1390ca.A03.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.JE
    public final void AGk(View view) {
        if (this.A01 == null) {
            this.A02.A07().A9a(A00(89, 14, 40), 3600, new C8B(A00(32, 35, 9)));
            return;
        }
        this.A03.A06(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.JE
    public final void AGv(View view, String str, boolean z) {
        AGw(view, str, z, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.JE
    public final void AGw(View view, String str, boolean z, boolean z2) {
        AGx(view, str, z, z2, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.JE
    public final void AGx(View view, String str, boolean z, boolean z2, boolean z3) {
        if (view != null) {
            VZ vz = new VZ(view);
            this.A00 = vz;
            this.A03.A08(vz, view);
            if (z2) {
                VZ vz2 = this.A00;
                String[] strArr = A05;
                if (strArr[0].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "hwPcHACCkDldKsuu7a1";
                strArr2[2] = "KVS16a9OP0E0NreE4Vx";
                vz2.A03();
            }
            C1390ca<C0801Io, C0806It> c1390caA06 = C1390ca.A00(new C0801Io(this.A02, view, str, z, z3), new C0806It(), A06).A05(new C1119Va(new VX())).A06();
            this.A01 = c1390caA06;
            this.A03.A07(view, c1390caA06);
            return;
        }
        this.A02.A07().A9a(A00(89, 14, 40), 3600, new C8B(A00(0, 32, 38)));
    }
}
