package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public abstract class OM {
    public static byte[] A00;
    public static String[] A01 = {"zHQaRI8Z04iZfuq60cOZ3MtOUQtnyLXk", "Py81lTfXTPvOohagzwztlFMwKgIeaa04", "ZBx", "ff4Sljy7OS0rEQC0yVPpTgSrr8dBXGgO", "WJ7E7dTZMlxiqC9ofw7stZL7dYzOgEyn", "lEp0yqe8iFuZgqtiF5MEL7dQIxoaDf7o", "1LQBU", "K3MGC9Pem9CSlPJADsZARPOkTW1wXgVW"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{8, 97, 91, 8, 97, 70, 91, 92, 73, 70, 92, 8, 79, 73, 69, 77, 91, 8, 73, 68, 68, 71, 95, 77, 76, 18, 8, 64, 41, 19, 64, 41, 14, 19, 20, 1, 14, 20, 64, 7, 1, 13, 5, 19, 90, 64, 77, 10, 2, 2, 10, 1, 8, 77, 11, 12, 1, 1, 15, 12, 14, 6, 77, 24, 31, 1, 77, 12, 27, 12, 4, 1, 12, 15, 1, 8, 87, 77, 119, 62, 36, 4, 35, 56, 37, 50, 109, 119, 124, 108, 58, 37, 40, 41, 35, 108, 57, 62, 32, 108, 37, Utf8.REPLACEMENT_BYTE, 108, 34, 57, 32, 32, 118, 108, 94, 82, 80, 19, 91, 92, 94, 88, 95, 82, 82, 86, 19, 86, 92, 73, 92, 83, 92, 74, 77, 86, 75, 92, 120, Byte.MAX_VALUE, 100, 121, 110, 84, 126, 121, 103, 84, 124, 110, 105, 84, 109, 106, 103, 103, 105, 106, 104, 96, 69, 90, 87, 86, 92, 108, 70, 65, 95};
    }

    static {
        A02();
    }

    public static OL A00(OP op, Bundle bundle, boolean z) throws SecurityException {
        OL c1070Tc;
        op.A05().A0F().A00(false);
        C1G c1gA0x = op.A04().A0x();
        double dA00 = OI.A00(c1gA0x);
        boolean zA0N = op.A04().A0x().A0N();
        boolean zA06 = OI.A06(op.A00(), op.A01(), dA00);
        AbstractC03640h abstractC03640hA00 = C03650i.A00(op.A05(), op.A06(), A01(0, 0, 67), AbstractC0858Ky.A00(op.A04().A0x().A0F().A05()), new HashMap(), op.A04().A0y());
        boolean z2 = !TextUtils.isEmpty(c1gA0x.A0D().A08());
        if (C0796Ih.A1W(op.A05())) {
            op.A05().A0A().AGv(op.A02(), op.A04().A12(), z2);
        }
        boolean zA03 = A03(op, z2);
        if ((zA0N && (abstractC03640hA00 instanceof C0719Fe)) || zA03) {
            c1070Tc = new TT(op, zA03);
        } else if (z2) {
            c1070Tc = new BI(op);
        } else if (!z2 && C0796Ih.A2A(op.A05())) {
            c1070Tc = new BJ(op, zA06);
        } else if (!zA06) {
            c1070Tc = new C1070Tc(op, OI.A04(dA00));
        } else {
            int iA00 = op.A00();
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            A01[6] = "JelR9";
            c1070Tc = new C1073Tf(op, iA00 == 2);
        }
        if (z) {
            c1070Tc.A10(c1gA0x, op.A04().A12(), dA00, bundle);
        }
        return c1070Tc;
    }

    public static boolean A03(OP op, boolean z) throws SecurityException {
        boolean z2 = false;
        if (!op.A04().A0p() || !z) {
            return false;
        }
        Uri uriA00 = AbstractC0858Ky.A00(op.A04().A0x().A0F().A05());
        String authority = uriA00.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            op.A05().A0E().AAF();
            return false;
        }
        boolean isInstantGames = authority.equals(A01(128, 5, 126));
        boolean isStoreUrl = uriA00.getQueryParameter(A01(155, 9, 116)) == null;
        String queryParameter = uriA00.getQueryParameter(A01(133, 22, 76));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(op.A04().A0Q());
        boolean zEquals = op.A05().getPackageName().equals(A01(109, 19, 122));
        boolean isVideoUrlNull = op.A04().A0q();
        if (isInstantGames && isStoreUrl && isGoogleFallBackUrlAvailable && (!zEquals || isVideoUrlNull)) {
            z2 = true;
        }
        if (!z2) {
            int i = Build.VERSION.SDK_INT;
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "ixVJz4LKAvkUhWpfUwnrm68OXA5reQsq";
            strArr[1] = "n4hyezKFC81nHjNiPwRfUtRp762j8aVq";
            if (i >= 24) {
                op.A05().A0E().AAE(A01(78, 11, 16) + isInstantGames + A01(89, 20, 11) + isStoreUrl + A01(46, 32, 42) + isGoogleFallBackUrlAvailable + A01(27, 19, 39) + zEquals + A01(0, 27, 111) + isVideoUrlNull);
            }
        }
        return z2;
    }
}
