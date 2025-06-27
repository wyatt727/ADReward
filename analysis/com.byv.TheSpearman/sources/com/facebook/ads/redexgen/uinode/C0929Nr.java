package com.facebook.ads.redexgen.uinode;

import android.content.ActivityNotFoundException;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0929Nr {
    public static long A0C;
    public static byte[] A0D;
    public static String[] A0E = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    public AbstractC1310b5 A00;
    public InterfaceC0928Nq A01;
    public OG A02;
    public boolean A03;
    public boolean A04;
    public final C1U A05;
    public final C1207Yn A06;
    public final J2 A07;
    public final C0866Lg A08;
    public final MC A09;
    public final RE A0A;
    public final String A0B;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, Utf8.REPLACEMENT_BYTE, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A01();
        A0C = 0L;
    }

    public C0929Nr(C1207Yn c1207Yn, String str, RE re, C0866Lg c0866Lg, J2 j2, C1U c1u) {
        this(c1207Yn, str, re, c0866Lg, j2, c1u, new C1080Tm());
    }

    public C0929Nr(C1207Yn c1207Yn, String str, RE re, C0866Lg c0866Lg, J2 j2, C1U c1u, MC mc) {
        this.A03 = true;
        this.A06 = c1207Yn;
        this.A0B = str;
        this.A0A = re;
        this.A08 = c0866Lg;
        this.A07 = j2;
        this.A05 = c1u;
        this.A09 = mc;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String strA00 = A00(0, 22, 52);
        try {
            AbstractC0874Lo.A0Z(map, this.A00);
            AbstractC03640h abstractC03640hA01 = C03650i.A01(this.A06, this.A07, str, AbstractC0858Ky.A00(str2), new C0920Ni(map).A03(this.A0A).A02(this.A08).A05(), this.A03, this.A04, this.A05);
            if (abstractC03640hA01 instanceof C0721Fg) {
                ((C0721Fg) abstractC03640hA01).A0H(this.A02);
            }
            EnumC03630g actionOutcome = EnumC03630g.A08;
            if (abstractC03640hA01 != null) {
                actionOutcome = abstractC03640hA01.A0C();
            }
            if (!(((abstractC03640hA01 instanceof C0719Fe) || (abstractC03640hA01 instanceof C0721Fg)) && AbstractC0874Lo.A0e(this.A06, actionOutcome, map)) && actionOutcome != EnumC03630g.A05) {
                InterfaceC0928Nq interfaceC0928Nq = this.A01;
                if (interfaceC0928Nq != null) {
                    interfaceC0928Nq.ABE();
                }
                this.A09.A43(this.A0B);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(strA00, A00(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            Log.e(strA00, A00(22, 22, 95), e2);
        }
    }

    public static boolean A03(C1207Yn c1207Yn) {
        boolean isIABBottomSheetEnabled = C0796Ih.A2N(c1207Yn);
        int iA06 = C0796Ih.A06(c1207Yn);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = A0C;
        long j2 = jCurrentTimeMillis - j;
        if (isIABBottomSheetEnabled) {
            String[] strArr = A0E;
            String str = strArr[0];
            String str2 = strArr[6];
            int clickguardTime = str.length();
            if (clickguardTime == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "iHhMWVvnkjnFrqYtRUL";
            strArr2[4] = "26cGs68neeVahMKc5kl";
            if (j > 0 && j2 < iA06) {
                return true;
            }
        }
        A0C = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC1310b5 abstractC1310b5) {
        this.A00 = abstractC1310b5;
    }

    public final void A05(InterfaceC0928Nq interfaceC0928Nq) {
        this.A01 = interfaceC0928Nq;
    }

    public final void A06(OG og) {
        this.A02 = og;
    }

    public final void A07(String str, String str2, Map<String, String> extraData) {
        new JA(str, this.A07).A04(J9.A0J, extraData);
        if (this.A08.A09(this.A06)) {
            this.A07.A9W(str, extraData);
        } else {
            A02(str, str2, extraData);
        }
    }

    public final void A08(boolean z) {
        this.A04 = z;
    }
}
