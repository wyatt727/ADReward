package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.6T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6T {
    public static byte[] A03;
    public static String[] A04 = {"fwnF9NqGlDDvd3tmLjHzlBLQ0vKEWHbi", "JyVh64c57ZQhNNoyVwIaBwBMCWCp47TX", "NiVjB9zhlvCIBmozr5iuMf4XPmRpTykj", "aMEAUKQnrJbxe7", "r8tEg4U8ig5A4Tipsx9WF382DZkzVk0N", "", "NXFd2c7X4J9ga52f6GNSRbndM6EeYerJ", "Iv2mUp4tdjLGTNz"};
    public static final AtomicBoolean A05;
    public C1206Ym A00;
    public String A01;
    public final LP A02 = new LP(300000000000L, new C1214Yu(this));

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{114, 125, 114, Byte.MAX_VALUE, 124, 116, 42, 33, 48, 51, 43, 54, 47, 59, 48, Base64.padSymbol, 52, 33, 75, 93, 75, 75, 81, 87, 86, 71, 76, 81, 85, 93};
    }

    static {
        A04();
        A05 = new AtomicBoolean(false);
    }

    public static InterfaceC05598i A00(C1206Ym c1206Ym) {
        if (C0796Ih.A10(c1206Ym)) {
            return C05608j.A01(A01(0, 6, 104), A01(18, 12, 67), A01(6, 12, 63));
        }
        YK ykA00 = C05608j.A00();
        String[] strArr = A04;
        if (strArr[2].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        A04[0] = "UkANKLN4N59lG96lj5R5seL3Uvk1PYyc";
        return ykA00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1206Ym c1206Ym;
        synchronized (this) {
            c1206Ym = this.A00;
        }
        if (c1206Ym == null) {
            return;
        }
        String strA04 = C05628l.A00().A01(c1206Ym, true).A04(A00(c1206Ym));
        synchronized (this) {
            this.A01 = strA04;
        }
    }

    public static void A03() {
        A05.set(true);
    }

    public final synchronized String A06(C1206Ym c1206Ym) {
        this.A00 = c1206Ym;
        c1206Ym.A07().AAL();
        if (this.A00.A06().AGJ() || ((A05.get() && C0796Ih.A1Y(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A05.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
