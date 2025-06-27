package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public abstract class GS {
    public static byte[] A00;
    public static String[] A01 = {"mrSAwXtvA48pKDbYm7Wldl5aXQuRkGdI", "fbJ004pbEzPzRxWccwuVKG55hrVCh", "rUGvTWjAKrexOA4wkcPi8vLiUWrJjNTX", "GXri66PfJCwBQDboa2OTJvm", "EWHNad80frv4tcDt6njDAOtFLZM1nox1", "w8DKXrbkod7LTDg6ra7kwJaOsoQJy0WV", "9chw5e5", "pdwJMmZou7a5Bc5N0u9b6z7FU4fjoJm4"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].charAt(7) == 'a') {
                throw new RuntimeException();
            }
            A01[4] = "NgHJChfDsWA9aQDgFnI07vXtmTssrLt0";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
            i4++;
        }
    }

    public static void A03() {
        A00 = new byte[]{7, -39, -35, 16, 8, -3, -5, 12, -3, -4, -72, -17, -35, -38, -18, -20, -20, -58, -72, -33, 7, 12, -72, -12, 9, 22, 7, 9, 18, 24, 5, 11, 9, 23, -60, 17, 25, 23, 24, -60, 9, 18, 8, -60, 27, 13, 24, 12, -60, -55, -45, -91, 55, 39, 40, 45, 30, 1, 1, -7, 85, -30, 2, 7, 3, 2, 24, -3, -27, 118, 66, 70, -58, -34, -52, -55, -35, -37, -37, -81, -81, -89, 3, -112, -80, -75, -79, -80, -58, -85};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(52, 16, 114));
        A03 = Pattern.compile(A02(68, 22, 32));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 123))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 61));
    }

    public static long A01(String str) throws NumberFormatException {
        long j = 0;
        String[] strArrA0m = IF.A0m(str, A02(50, 2, 16));
        for (String str2 : IF.A0l(strArrA0m[0], A02(1, 1, 56))) {
            long value = Long.parseLong(str2);
            j = (60 * j) + value;
        }
        long j2 = j * 1000;
        if (strArrA0m.length == 2) {
            long value2 = Long.parseLong(strArrA0m[1]);
            j2 += value2;
        }
        return 1000 * j2;
    }

    public static void A04(C0788Hz c0788Hz) throws C0728Fp {
        String strA0P = c0788Hz.A0P();
        if (strA0P != null && A03.matcher(strA0P).matches()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String line = A02(2, 21, 49);
        throw new C0728Fp(sb.append(line).append(strA0P).toString());
    }
}
