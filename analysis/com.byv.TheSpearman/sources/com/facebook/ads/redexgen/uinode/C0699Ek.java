package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0699Ek {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public InterfaceC0645Bs A00;
    public final InterfaceC0647Bu A01;
    public final InterfaceC0645Bs[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BFR1v4rNBeEaqGbowcf";
        strArr2[5] = "QYASgTnFJ";
        A03 = new byte[]{-52, -61, 6, 18, 24, 15, 7, -61, 21, 8, 4, 7, -61, 23, 11, 8, -61, 22, 23, 21, 8, 4, 16, -47, -17, 16, 15, 6, -63, 16, 7, -63, 21, 9, 6, -63, 2, 23, 2, 10, 13, 2, 3, 13, 6, -63, 6, 25, 21, 19, 2, 4, 21, 16, 19, 20, -63, -55};
    }

    static {
        A01();
    }

    public C0699Ek(InterfaceC0645Bs[] interfaceC0645BsArr, InterfaceC0647Bu interfaceC0647Bu) {
        this.A02 = interfaceC0645BsArr;
        this.A01 = interfaceC0647Bu;
    }

    public final InterfaceC0645Bs A02(InterfaceC0646Bt interfaceC0646Bt, Uri uri) throws InterruptedException, IOException {
        InterfaceC0645Bs interfaceC0645Bs = this.A00;
        if (interfaceC0645Bs != null) {
            return interfaceC0645Bs;
        }
        InterfaceC0645Bs[] interfaceC0645BsArr = this.A02;
        int length = interfaceC0645BsArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC0645Bs interfaceC0645Bs2 = interfaceC0645BsArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0646Bt.AFM();
                throw th;
            }
            if (interfaceC0645Bs2.AGR(interfaceC0646Bt)) {
                this.A00 = interfaceC0645Bs2;
                interfaceC0646Bt.AFM();
                break;
            }
            continue;
            interfaceC0646Bt.AFM();
            i++;
        }
        InterfaceC0645Bs interfaceC0645Bs3 = this.A00;
        if (interfaceC0645Bs3 != null) {
            interfaceC0645Bs3.A8o(this.A01);
            return this.A00;
        }
        throw new WM(A00(24, 34, 114) + IF.A0S(this.A02) + A00(0, 24, 116), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
