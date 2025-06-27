package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.6R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6R {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C6S A00;
    public final C6T A01;
    public final C1206Ym A02;
    public final InterfaceC1025Rj A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, Utf8.REPLACEMENT_BYTE};
    }

    static {
        A01();
        A06 = C6R.class.getSimpleName();
    }

    public C6R(C1206Ym c1206Ym, InterfaceC0772Hj interfaceC0772Hj, C6S c6s, C6T c6t) {
        this.A02 = c1206Ym;
        InterfaceC1025Rj interfaceC1025RjA4i = interfaceC0772Hj.A4i(EnumC1026Rk.A06);
        this.A03 = interfaceC1025RjA4i;
        this.A00 = c6s;
        this.A01 = c6t;
        interfaceC1025RjA4i.A3R(new C1215Yv(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A03.A9C()) {
                this.A02.A04().A8z();
                return;
            }
            String btExtras = this.A03.A6h().optString(A00(0, 9, 62));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C0796Ih.A0f(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
