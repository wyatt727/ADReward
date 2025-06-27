package com.facebook.ads.redexgen.uinode;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Message;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2A {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-120, -101, -108, -118, -110, -117, -91, -117, -98, -102, -104, -121, -103, -91, -111, -117, -97, -53, -52, -54, -41, -53, -67, -54, -50, -63, -69, -67, -41, -67, -48, -52, -54, -71, -53, -121, -120, -122, -109, -121, 121, -122, -118, 125, 119, 121, -109, -121, 120, Byte.MAX_VALUE, -109, -118, 121, -122, -121, 125, -125, -126, -124, -112, -114, 79, -121, -126, -124, -122, -125, -112, -112, -116, 79, -126, -123, -108, 79, -118, -113, -107, -122, -109, -113, -126, -115, 79, -118, -111, -124, 79, 98, -106, -123, -118, -122, -113, -124, -122, 111, -122, -107, -104, -112, -109, -116, 115, -122, -114, -112, -107, -122, 116, -122, -109, -105, -118, -124, -122, -89, -77, -79, 114, -86, -91, -89, -87, -90, -77, -77, -81, 114, -81, -91, -72, -91, -78, -91};
    }

    public static void A02(C1206Ym c1206Ym, Message message) {
        Bundle bundle = message.getData().getBundle(A00(0, 17, 52));
        if (bundle != null) {
            AbstractC05528b.A05(c1206Ym, bundle.getString(A00(35, 23, 34)), bundle.getString(A00(17, 18, 102)));
        }
    }

    public static boolean A03(Context context, String str) {
        PackageManager packageManager;
        if (!A00(116, 19, 50).equals(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            boolean validationPassed = FbValidationUtils.isFbSigningCertificateValid(FbValidationUtils.getSigningCertificate(packageManager.getPackageInfo(str, 64)));
            return validationPassed;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean A04(C1206Ym c1206Ym, boolean z, ServiceConnection serviceConnection) {
        boolean validationPassed = (c1206Ym.A04().A8z() && z) || A03(c1206Ym, AbstractC0798Ik.A04(z));
        if (!validationPassed) {
            return false;
        }
        boolean validationPassed2 = c1206Ym.bindService(new Intent().setComponent(new ComponentName(AbstractC0798Ik.A04(z), A00(58, 58, 15))), serviceConnection, 1);
        return validationPassed2;
    }
}
