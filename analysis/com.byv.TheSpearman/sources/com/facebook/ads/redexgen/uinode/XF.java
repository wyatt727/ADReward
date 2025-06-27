package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XF implements InterfaceC0645Bs {
    public static byte[] A03;
    public static final InterfaceC0648Bv A04;
    public InterfaceC0647Bu A00;
    public AbstractC0664Co A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new XG();
    }

    public static C0788Hz A00(C0788Hz c0788Hz) {
        c0788Hz.A0Y(0);
        return c0788Hz;
    }

    private boolean A03(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        C0660Ck c0660Ck = new C0660Ck();
        if (!c0660Ck.A03(interfaceC0646Bt, true) || (c0660Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0660Ck.A00, 8);
        C0788Hz c0788Hz = new C0788Hz(length);
        interfaceC0646Bt.ADv(c0788Hz.A00, 0, length);
        if (XH.A04(A00(c0788Hz))) {
            this.A01 = new XH();
        } else if (XC.A06(A00(c0788Hz))) {
            this.A01 = new XC();
        } else {
            if (!XE.A04(A00(c0788Hz))) {
                return false;
            }
            this.A01 = new XE();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void A8o(InterfaceC0647Bu interfaceC0647Bu) {
        this.A00 = interfaceC0647Bu;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final int AEH(InterfaceC0646Bt interfaceC0646Bt, C0650Bz c0650Bz) throws InterruptedException, IOException {
        if (this.A01 == null) {
            if (A03(interfaceC0646Bt)) {
                interfaceC0646Bt.AFM();
            } else {
                throw new C05969v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            C4 c4AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, c4AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0646Bt, c0650Bz);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void AFh(long j, long j2) {
        AbstractC0664Co abstractC0664Co = this.A01;
        if (abstractC0664Co != null) {
            abstractC0664Co.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final boolean AGR(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        try {
            return A03(interfaceC0646Bt);
        } catch (C05969v unused) {
            return false;
        }
    }
}
