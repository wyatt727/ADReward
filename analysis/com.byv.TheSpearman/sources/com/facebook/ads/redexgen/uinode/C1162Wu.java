package com.facebook.ads.redexgen.uinode;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1162Wu implements InterfaceC0645Bs {
    public static String[] A08 = {"pV6afMZIVEGTOqSkK4PJAxqV3cRTXe0d", "IAHwWl6p9dkO64XBfZ0QYdoG1FARrH3l", "8O8qDLmpQAmlCV9yXa4a4pqjSYQFT4zH", "zdF1gQZIlZar6BQddk1LhfG9pE3e2nBq", "3CFwU8lFm", "v9T9Lg78nTaSAiVLG9Jw7rJGA2UCfL0z", "6lAaLpwrnWkg", "Pzi"};
    public static final InterfaceC0648Bv A09 = new C1163Wv();
    public long A00;
    public InterfaceC0647Bu A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<D5> A05;
    public final C0788Hz A06;
    public final IB A07;

    public C1162Wu() {
        this(new IB(0L));
    }

    public C1162Wu(IB ib) {
        this.A07 = ib;
        this.A06 = new C0788Hz(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final void A8o(InterfaceC0647Bu interfaceC0647Bu) {
        this.A01 = interfaceC0647Bu;
        interfaceC0647Bu.AFi(new C1177Xj(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final int AEH(InterfaceC0646Bt interfaceC0646Bt, C0650Bz c0650Bz) throws InterruptedException, IOException {
        long j;
        if (!interfaceC0646Bt.ADw(this.A06.A00, 0, 4, true)) {
            return -1;
        }
        this.A06.A0Y(0);
        int iA08 = this.A06.A08();
        if (iA08 == 441) {
            return -1;
        }
        if (iA08 == 442) {
            interfaceC0646Bt.ADv(this.A06.A00, 0, 10);
            this.A06.A0Y(9);
            int nextStartCode = this.A06.A0E();
            interfaceC0646Bt.AGP((nextStartCode & 7) + 14);
            return 0;
        }
        if (iA08 == 443) {
            interfaceC0646Bt.ADv(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode2 = this.A06.A0I();
            int i = nextStartCode2 + 6;
            if (A08[7].length() != 22) {
                String[] strArr = A08;
                strArr[5] = "HKquBkRqV5bg6e7zOk5qC1bF2o25gd0c";
                strArr[0] = "faW9VDigV6ilhrF8PW3drZ4wwMfODA0N";
                interfaceC0646Bt.AGP(i);
                return 0;
            }
        } else {
            int nextStartCode3 = iA08 & InputDeviceCompat.SOURCE_ANY;
            if ((nextStartCode3 >> 8) != 1) {
                interfaceC0646Bt.AGP(1);
                return 0;
            }
            int i2 = iA08 & 255;
            D5 d5 = this.A05.get(i2);
            if (!this.A02) {
                if (d5 == null) {
                    InterfaceC0671Cy elementaryStreamReader = null;
                    if (i2 == 189) {
                        elementaryStreamReader = new X9();
                        this.A03 = true;
                        this.A00 = interfaceC0646Bt.A7i();
                    } else if ((i2 & 224) == 192) {
                        elementaryStreamReader = new C1165Wx();
                        this.A03 = true;
                        this.A00 = interfaceC0646Bt.A7i();
                    } else if ((i2 & 240) == 224) {
                        elementaryStreamReader = new X2();
                        this.A04 = true;
                        this.A00 = interfaceC0646Bt.A7i();
                    }
                    if (elementaryStreamReader != null) {
                        elementaryStreamReader.A4p(this.A01, new DC(i2, 256));
                        d5 = new D5(elementaryStreamReader, this.A07);
                        this.A05.put(i2, d5);
                    }
                }
                if (this.A03 && this.A04) {
                    j = this.A00 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                } else {
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                }
                if (interfaceC0646Bt.A7i() > j) {
                    this.A02 = true;
                    InterfaceC0647Bu interfaceC0647Bu = this.A01;
                    if (A08[6].length() != 7) {
                        A08[4] = "xdmI1xGjCkbROfx6HlMFi8Q1HtnAUXbK";
                        interfaceC0647Bu.A5Y();
                    }
                }
            }
            interfaceC0646Bt.ADv(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode4 = this.A06.A0I();
            int i3 = nextStartCode4 + 6;
            if (d5 == null) {
                interfaceC0646Bt.AGP(i3);
            } else {
                this.A06.A0W(i3);
                interfaceC0646Bt.readFully(this.A06.A00, 0, i3);
                this.A06.A0Y(6);
                d5.A03(this.A06);
                C0788Hz c0788Hz = this.A06;
                int nextStartCode5 = c0788Hz.A05();
                c0788Hz.A0X(nextStartCode5);
            }
            return 0;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFh(long r3, long r5) {
        /*
            r2 = this;
            com.facebook.ads.redexgen.X.IB r0 = r2.A07
            r0.A08()
            r1 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.D5> r0 = r2.A05
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            android.util.SparseArray<com.facebook.ads.redexgen.X.D5> r0 = r2.A05
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.D5 r0 = (com.facebook.ads.redexgen.uinode.D5) r0
            r0.A02()
            int r1 = r1 + 1
            goto L6
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1162Wu.AFh(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0645Bs
    public final boolean AGR(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        interfaceC0646Bt.ADv(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4) {
            return false;
        }
        int i = bArr[8] & 4;
        if (A08[4].length() != 31) {
            A08[6] = "Yb1F33WkxQfWiaSVh137";
            if (i != 4) {
                return false;
            }
            String[] strArr = A08;
            if (strArr[5].charAt(30) == strArr[0].charAt(30)) {
                String[] strArr2 = A08;
                strArr2[2] = "0jRSG84WTzZndWahG37MGXBabYk0DmjV";
                strArr2[3] = "QaZZpRdUVGXpS1N3yC2DPVE3W204sMee";
                if ((bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
                    return false;
                }
                int packStuffingLength = bArr[13] & 7;
                interfaceC0646Bt.A3W(packStuffingLength);
                interfaceC0646Bt.ADv(bArr, 0, 3);
                int packStuffingLength2 = bArr[0];
                int i2 = (packStuffingLength2 & 255) << 16;
                int packStuffingLength3 = bArr[1];
                int i3 = i2 | ((packStuffingLength3 & 255) << 8);
                int packStuffingLength4 = bArr[2];
                return 1 == ((packStuffingLength4 & 255) | i3);
            }
        }
        throw new RuntimeException();
    }
}
