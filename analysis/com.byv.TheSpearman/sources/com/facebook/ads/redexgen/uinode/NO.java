package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class NO {
    public static byte[] A02;
    public static String[] A03 = {"LmKV0vies2yKzOatCTvdNkioufxejCG9", "NFLVmCZa277818VmZZ44o4VnddjY0G", "VEYTkYrZyGJHkQMFJ6r271ULcITBjkmP", "QAYXVPOyB3q0GFKcmaeo", "Gi5tRpcY", "pjHEhG2Dj870L2LSHBRlpkG", "H2ZPqTwArbqxA8DeWP2m9Ve", "WDxae7s2p2mOylBC2o4p"};
    public boolean A00 = true;
    public final U1 A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[2].charAt(3) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "6YNWQQidVDsdqlc2Mjd0";
            strArr[3] = "jinJQ2QcXnMSMR7RoRBd";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 5);
            i4++;
        }
    }

    public static void A02() {
        A02 = new byte[]{106, 101, 101, 74, 93, 111, 68, 70, 104, 68, 69, 95, 78, 69, 95, 103, 68, 74, 79, 78, 79, 17, 42, 37, 37, 10, 29, 39, 4, 10, 15, 46, 29, 14, 5, 31, 46, 5, 15, 81, 85, 90, 90, 117, 98, 70, 113, 103, 100, 123, 122, 103, 113, 81, 122, 112, 46, 36, Base64.padSymbol, 59, 54, 122, 122, 52, 39, 60, 49, 38, 59, Base64.padSymbol, 60, 122, 123, 114, 41, 38, 32, 43, 114, 41, 114, 114, 59, 52, 114, 122, 115, 37, 59, 60, 54, Base64.padSymbol, 37, 124, 34, 55, 32, 52, Base64.padSymbol, 32, Utf8.REPLACEMENT_BYTE, 51, 60, 49, 55, 114, 46, 46, 114, 115, 37, 59, 60, 54, Base64.padSymbol, 37, 124, 34, 55, 32, 52, Base64.padSymbol, 32, Utf8.REPLACEMENT_BYTE, 51, 60, 49, 55, 124, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 114, 46, 46, 114, 115, 54, Base64.padSymbol, 49, 39, Utf8.REPLACEMENT_BYTE, 55, 60, 38, 114, 114, 114, 114, 114, 114, 114, 46, 46, 114, 115, 54, Base64.padSymbol, 49, 39, Utf8.REPLACEMENT_BYTE, 55, 60, 38, 124, 48, Base64.padSymbol, 54, 43, 114, 46, 46, 114, 115, 54, Base64.padSymbol, 49, 39, Utf8.REPLACEMENT_BYTE, 55, 60, 38, 124, 48, Base64.padSymbol, 54, 43, 124, 49, 58, 59, 62, 54, 32, 55, 60, 114, 114, 114, 114, 114, 114, 114, 46, 46, 114, 54, Base64.padSymbol, 49, 39, Utf8.REPLACEMENT_BYTE, 55, 60, 38, 124, 48, Base64.padSymbol, 54, 43, 124, 49, 58, 59, 62, 54, 32, 55, 60, 124, 62, 55, 60, 53, 38, 58, 114, 110, 114, 99, 123, 114, 41, 114, 114, 114, 114, 32, 55, 38, 39, 32, 60, 105, 114, 114, 47, 114, 114, 36, 51, 32, 114, 60, 36, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 13, 51, 60, 13, 38, 114, 111, 114, 37, 59, 60, 54, Base64.padSymbol, 37, 124, 34, 55, 32, 52, Base64.padSymbol, 32, Utf8.REPLACEMENT_BYTE, 51, 60, 49, 55, 124, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 105, 114, 114, 59, 52, 114, 122, 60, 36, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 32, 55, 33, 34, Base64.padSymbol, 60, 33, 55, 23, 60, 54, 114, 108, 114, 98, 123, 114, 41, 114, 114, 114, 114, 49, Base64.padSymbol, 60, 33, Base64.padSymbol, 62, 55, 124, 62, Base64.padSymbol, 53, 122, 117, 19, 28, 28, 51, 36, 0, 55, 33, 34, Base64.padSymbol, 60, 33, 55, 23, 60, 54, 104, 117, 114, 121, 114, 60, 36, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 32, 55, 33, 34, Base64.padSymbol, 60, 33, 55, 23, 60, 54, 123, 105, 114, 114, 47, 114, 114, 59, 52, 114, 122, 60, 36, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 54, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 17, Base64.padSymbol, 60, 38, 55, 60, 38, 30, Base64.padSymbol, 51, 54, 55, 54, 23, 36, 55, 60, 38, 1, 38, 51, 32, 38, 114, 108, 114, 98, 123, 114, 41, 114, 114, 114, 114, 49, Base64.padSymbol, 60, 33, Base64.padSymbol, 62, 55, 124, 62, Base64.padSymbol, 53, 122, 117, 19, 28, 28, 51, 36, 22, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 17, Base64.padSymbol, 60, 38, 55, 60, 38, 30, Base64.padSymbol, 51, 54, 55, 54, 104, 117, 114, 121, 114, 60, 36, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 54, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 17, Base64.padSymbol, 60, 38, 55, 60, 38, 30, Base64.padSymbol, 51, 54, 55, 54, 23, 36, 55, 60, 38, 1, 38, 51, 32, 38, 123, 105, 114, 114, 47, 114, 114, 59, 52, 114, 122, 60, 36, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 62, Base64.padSymbol, 51, 54, 23, 36, 55, 60, 38, 23, 60, 54, 114, 108, 114, 98, 123, 114, 41, 114, 114, 114, 114, 49, Base64.padSymbol, 60, 33, Base64.padSymbol, 62, 55, 124, 62, Base64.padSymbol, 53, 122, 117, 19, 28, 28, 51, 36, 30, Base64.padSymbol, 51, 54, 23, 36, 55, 60, 38, 23, 60, 54, 104, 117, 114, 121, 114, 60, 36, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 62, Base64.padSymbol, 51, 54, 23, 36, 55, 60, 38, 23, 60, 54, 123, 105, 114, 114, 47, 47, 114, 49, 51, 38, 49, 58, 122, 55, 32, 32, 123, 114, 41, 114, 114, 49, Base64.padSymbol, 60, 33, Base64.padSymbol, 62, 55, 124, 62, Base64.padSymbol, 53, 122, 117, 51, 60, 13, 60, 51, 36, 59, 53, 51, 38, 59, Base64.padSymbol, 60, 13, 38, 59, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 55, 32, 32, Base64.padSymbol, 32, 104, 117, 114, 121, 114, 55, 32, 32, 124, Utf8.REPLACEMENT_BYTE, 55, 33, 33, 51, 53, 55, 123, 105, 47, 47, 123, 122, 123, 123, 105};
    }

    static {
        A02();
    }

    public NO(U1 u1) {
        this.A01 = u1;
    }

    public static long A00(String str, String str2) throws NumberFormatException {
        String strSubstring = str.substring(str2.length());
        if (TextUtils.isEmpty(strSubstring)) {
            return -1L;
        }
        try {
            long j = Long.parseLong(strSubstring);
            if (j < 0) {
                return -1L;
            }
            return j;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A05(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (this.A00) {
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "lMaXHRAU";
            strArr2[1] = "QM70xrbmIGMjqTbaypH7CHN9HGfK3S";
            String strA01 = A01(40, 17, 17);
            if (str.startsWith(strA01)) {
                this.A01.A0H(A00(str, strA01));
                return;
            }
            String strA012 = A01(0, 22, 46);
            if (str.startsWith(strA012)) {
                this.A01.A0F(A00(str, strA012));
                return;
            }
            String strA013 = A01(22, 18, 110);
            if (!str.startsWith(strA013)) {
                return;
            }
            this.A01.A0G(A00(str, strA013));
        }
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
