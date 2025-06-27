package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XA implements InterfaceC0645Bs {
    public static byte[] A04;
    public static String[] A05 = {"89ZAS4gKAvfsCOhGFLRndaPlzH5Jylu0", "WDj0w8iYShPhw5JkNLQVjMzFidij1YMB", "SZD8V9ebG6DMCxkEToUDQHseHkwYH45y", "flB69VC8Ebs69L5nDVZVAs6kLxLMfW9p", "Dc9Giep11FBAOEJK", "fiVRhSZcsaoyqUlEeIiHO4czNXpaN55t", "HHz5E2PDkz6p7na9zQig", "GASwop9kiLfFsL9tAHZWlbr16muWtU3x"};
    public static final InterfaceC0648Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final X9 A02;
    public final C0788Hz A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-8, -13, -30};
        if (A05[3].charAt(6) != 'C') {
            throw new RuntimeException();
        }
        A05[6] = "Dcf";
    }

    static {
        A01();
        A06 = new XB();
        A07 = IF.A08(A00(0, 3, 105));
    }

    public XA() {
        this(0L);
    }

    public XA(long j) {
        this.A01 = j;
        this.A02 = new X9();
        this.A03 = new C0788Hz(2786);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void A8o(InterfaceC0647Bu interfaceC0647Bu) {
        this.A02.A4p(interfaceC0647Bu, new DC(0, 1));
        interfaceC0647Bu.A5Y();
        interfaceC0647Bu.AFi(new C1177Xj(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final int AEH(InterfaceC0646Bt interfaceC0646Bt, C0650Bz c0650Bz) throws InterruptedException, IOException {
        int i = interfaceC0646Bt.read(this.A03.A00, 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(i);
        if (!this.A00) {
            this.A02.ADt(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4R(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void AFh(long j, long j2) {
        this.A00 = false;
        this.A02.AFg();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final boolean AGR(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        C0788Hz c0788Hz = new C0788Hz(10);
        int startPosition = 0;
        while (true) {
            interfaceC0646Bt.ADv(c0788Hz.A00, 0, 10);
            c0788Hz.A0Y(0);
            if (c0788Hz.A0G() != A07) {
                break;
            }
            c0788Hz.A0Z(3);
            int iA0D = c0788Hz.A0D();
            startPosition += iA0D + 10;
            interfaceC0646Bt.A3W(iA0D);
        }
        interfaceC0646Bt.AFM();
        interfaceC0646Bt.A3W(startPosition);
        int syncBytes = startPosition;
        int i = 0;
        while (true) {
            interfaceC0646Bt.ADv(c0788Hz.A00, 0, 5);
            c0788Hz.A0Y(0);
            int headerPosition = c0788Hz.A0I();
            if (headerPosition != 2935) {
                i = 0;
                interfaceC0646Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0646Bt.A3W(syncBytes);
            } else {
                i++;
                if (i >= 4) {
                    return true;
                }
                int headerPosition3 = AQ.A05(c0788Hz.A00);
                if (headerPosition3 == -1) {
                    return false;
                }
                interfaceC0646Bt.A3W(headerPosition3 - 5);
            }
        }
    }
}
