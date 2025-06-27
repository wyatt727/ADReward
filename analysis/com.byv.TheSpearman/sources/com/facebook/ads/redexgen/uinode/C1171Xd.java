package com.facebook.ads.redexgen.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1171Xd extends C6 {
    public static byte[] A01;
    public static String[] A02 = {"lkUmj0P9ANZweJy", "AYR", "2bCiSP20yUx8Jjv69HyX94pfkMFX1Tn5", "GuptQSCxLEDTiFK9bPX0ljmbSmBcx9xx", "QILfBos", "yeLNYaj", "n8HrTtIUehfoTgx", "xV0sp6lxPyztL8QZzt7llBh4QSI4V12v"};
    public long A00;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 31);
            String[] strArr = A02;
            if (strArr[3].charAt(7) != strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "WF1W4nbxyUcfRBlDsHDD1CgmrC98ElX3";
            strArr2[7] = "aIs3tFZxis4srcfFD6vTbXobqrKXyR4d";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{-40, -23, -26, -43, -24, -35, -29, -30, 5, 4, -29, -5, 10, -9, -38, -9, 10, -9};
    }

    static {
        A0A();
    }

    public C1171Xd() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C0788Hz c0788Hz) {
        return c0788Hz.A0E();
    }

    public static Boolean A01(C0788Hz c0788Hz) {
        return Boolean.valueOf(c0788Hz.A0E() == 1);
    }

    public static Double A02(C0788Hz c0788Hz) {
        return Double.valueOf(Double.longBitsToDouble(c0788Hz.A0L()));
    }

    public static Object A03(C0788Hz c0788Hz, int i) {
        switch (i) {
            case 0:
                return A02(c0788Hz);
            case 1:
                return A01(c0788Hz);
            case 2:
                return A05(c0788Hz);
            case 3:
                return A09(c0788Hz);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                String[] strArr = A02;
                if (strArr[3].charAt(7) == strArr[7].charAt(7)) {
                    A02[2] = "Zl5TZ6M60aHBYOe9FM2F5W6f579JKUNd";
                    return null;
                }
                break;
            case 8:
                HashMap<String, Object> mapA08 = A08(c0788Hz);
                String[] strArr2 = A02;
                if (strArr2[0].length() == strArr2[6].length()) {
                    String[] strArr3 = A02;
                    strArr3[0] = "AtnlLuJZPUjXwht";
                    strArr3[6] = "kJYayAh32s2xp3N";
                    return mapA08;
                }
                break;
            case 10:
                return A06(c0788Hz);
            case 11:
                return A07(c0788Hz);
        }
        throw new RuntimeException();
    }

    public static String A05(C0788Hz c0788Hz) {
        int iA0I = c0788Hz.A0I();
        int iA06 = c0788Hz.A06();
        c0788Hz.A0Z(iA0I);
        return new String(c0788Hz.A00, iA06, iA0I);
    }

    public static ArrayList<Object> A06(C0788Hz c0788Hz) {
        int iA0H = c0788Hz.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(iA0H);
        for (int i = 0; i < iA0H; i++) {
            int count = A00(c0788Hz);
            arrayList.add(A03(c0788Hz, count));
        }
        return arrayList;
    }

    public static Date A07(C0788Hz c0788Hz) {
        Date date = new Date((long) A02(c0788Hz).doubleValue());
        c0788Hz.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C0788Hz c0788Hz) {
        int iA0H = c0788Hz.A0H();
        HashMap<String, Object> map = new HashMap<>(iA0H);
        for (int i = 0; i < iA0H; i++) {
            String strA05 = A05(c0788Hz);
            int count = A00(c0788Hz);
            map.put(strA05, A03(c0788Hz, count));
        }
        return map;
    }

    public static HashMap<String, Object> A09(C0788Hz c0788Hz) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strA05 = A05(c0788Hz);
            int iA00 = A00(c0788Hz);
            if (iA00 == 9) {
                return map;
            }
            map.put(strA05, A03(c0788Hz, iA00));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C6
    public final void A0B(C0788Hz c0788Hz, long j) throws C05969v {
        if (A00(c0788Hz) == 2) {
            if (!A04(8, 10, 119).equals(A05(c0788Hz)) || A00(c0788Hz) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c0788Hz);
            String name = A04(0, 8, 85);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((Double) metadata.get(name)).doubleValue();
                if (durationSeconds > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new C05969v();
    }

    @Override // com.facebook.ads.redexgen.uinode.C6
    public final boolean A0C(C0788Hz c0788Hz) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
