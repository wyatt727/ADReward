package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class M6 {
    public static byte[] A00;
    public static String[] A01 = {"75", "", "84T1cPcVhFaG3gZ5iFCuz5VGfvW435Ys", "hmgtvPST3LKdfFpjmmFZYvFoyIGtsiKE", "1o0hQSlG2MREJWQYXtVsar2Zo68mKpVL", "LjPyS32kIH6YipP2gsYrsbvo7R8K", "pRhgJcRZc8j2ATnbWVmWTgInp0JNCNsL", "EpPf5pm3Rz1UtI6LaI9QQC8GFK2ymH0S"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{75, 44, 126, 67, 88, 94, 75, 79, 82, 84, 85, 27, 82, 85, 27, 76, 82, 85, 95, 84, 76, 27, 82, 85, 93, 84, 27, 88, 83, 94, 88, 80, 28, 18, 14, 16, 2, 22, 5, 19, 119, 123, 110, 115, 104, 114, 106, 120, 10, 27, 25, 22, 26, 22, 7, 18, 22, 13, 90, 89};
    }

    static {
        A02();
        A02 = M6.class.getSimpleName();
    }

    public static Map<String, String> A01(C1207Yn c1207Yn) {
        Window window;
        HashMap map = new HashMap();
        if (c1207Yn == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, 111), String.valueOf(A04(c1207Yn)));
            Activity activityA0D = c1207Yn.A0D();
            if (activityA0D != null && (window = activityA0D.getWindow()) != null) {
                int i = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                map.put(A00(58, 2, 94), Integer.toString(flags));
                int type = 4194304 & i;
                String strA00 = A00(1, 1, 110);
                String strA002 = A00(0, 1, 8);
                map.put(A00(48, 5, 14), type > 0 ? strA00 : strA002);
                if (A01[1].length() == 23) {
                    throw new RuntimeException();
                }
                A01[7] = "fwmMHJhcrVWyeAGw8Re8ymmckApbJBDL";
                int type2 = 524288 & i;
                if (type2 <= 0) {
                    strA00 = strA002;
                }
                map.put(A00(53, 5, 18), strA00);
            }
        } catch (Exception e) {
            Log.e(A02, A00(2, 30, 72), e);
            AnonymousClass89 anonymousClass89A07 = c1207Yn.A07();
            int type3 = C8A.A2T;
            anonymousClass89A07.A9a(A00(43, 5, 114), type3, new C8B(e));
        }
        return map;
    }

    public static boolean A03(C1207Yn c1207Yn) {
        return !C0875Lp.A04(A01(c1207Yn));
    }

    public static boolean A04(C1207Yn c1207Yn) {
        KeyguardManager keyguardManager = (KeyguardManager) c1207Yn.getSystemService(A00(32, 8, 4));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
