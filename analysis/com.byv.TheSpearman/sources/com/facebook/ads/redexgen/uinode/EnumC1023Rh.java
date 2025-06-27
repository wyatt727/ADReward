package com.facebook.ads.redexgen.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC1023Rh {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC1023Rh[] A02;
    public static final EnumC1023Rh A03;
    public static final EnumC1023Rh A04;
    public static final EnumC1023Rh A05;
    public static final EnumC1023Rh A06;
    public static final EnumC1023Rh A07;
    public static final EnumC1023Rh A08;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Byte.MAX_VALUE, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String strA02 = A02(0, 5, 105);
        final int i = 0;
        EnumC1023Rh enumC1023Rh = new EnumC1023Rh(strA02, i) { // from class: com.facebook.ads.redexgen.X.J6
            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A04(JSONArray jSONArray, int i2) {
                return jSONArray.optJSONArray(i2) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i2) {
                return AbstractC1024Ri.A00(jSONArray.optJSONArray(i2), jSONArray2.optJSONArray(i2));
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC1024Ri.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A03 = enumC1023Rh;
        final String strA022 = A02(5, 7, 40);
        final int i2 = 1;
        EnumC1023Rh enumC1023Rh2 = new EnumC1023Rh(strA022, i2) { // from class: com.facebook.ads.redexgen.X.In
            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A04(JSONArray jSONArray, int i3) {
                return jSONArray.optBoolean(i3, true) == jSONArray.optBoolean(i3, false);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                return jSONArray.optBoolean(i3) == jSONArray2.optBoolean(i3);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = enumC1023Rh2;
        final String strA023 = A02(12, 6, 81);
        final int i3 = 2;
        EnumC1023Rh enumC1023Rh3 = new EnumC1023Rh(strA023, i3) { // from class: com.facebook.ads.redexgen.X.ID
            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A04(JSONArray jSONArray, int i4) {
                return jSONArray.optInt(i4, 0) == jSONArray.optInt(i4, 1) && jSONArray.optDouble(i4, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONArray.optDouble(i4, 1.0d) && ((double) jSONArray.optInt(i4, 0)) != jSONArray.optDouble(i4, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                return jSONArray.optDouble(i4) == jSONArray2.optDouble(i4);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = enumC1023Rh3;
        final String strA024 = A02(18, 3, 50);
        final int i4 = 3;
        EnumC1023Rh enumC1023Rh4 = new EnumC1023Rh(strA024, i4) { // from class: com.facebook.ads.redexgen.X.I5
            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A04(JSONArray jSONArray, int i5) {
                return jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) && jSONArray.optDouble(i5, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONArray.optDouble(i5, 1.0d) && ((double) jSONArray.optInt(i5, 0)) == jSONArray.optDouble(i5, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return jSONArray.optInt(i5) == jSONArray2.optInt(i5);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = enumC1023Rh4;
        final String strA025 = A02(21, 6, 18);
        final int i5 = 4;
        EnumC1023Rh enumC1023Rh5 = new EnumC1023Rh(strA025, i5) { // from class: com.facebook.ads.redexgen.X.I4
            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A04(JSONArray jSONArray, int i6) {
                return jSONArray.optJSONObject(i6) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return AbstractC1024Ri.A02(jSONArray.optJSONObject(i6), jSONArray2.optJSONObject(i6));
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC1024Ri.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = enumC1023Rh5;
        final String strA026 = A02(27, 6, 36);
        final int i6 = 5;
        EnumC1023Rh enumC1023Rh6 = new EnumC1023Rh(strA026, i6) { // from class: com.facebook.ads.redexgen.X.Hx
            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A04(JSONArray jSONArray, int i7) {
                return jSONArray.optString(i7) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                return jSONArray.optString(i7).equals(jSONArray2.optString(i7));
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC1023Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = enumC1023Rh6;
        A02 = new EnumC1023Rh[]{enumC1023Rh, enumC1023Rh2, enumC1023Rh3, enumC1023Rh4, enumC1023Rh5, enumC1023Rh6};
    }

    public EnumC1023Rh(String str, int i) {
    }

    public static EnumC1023Rh A00(JSONArray jSONArray, int i) {
        for (EnumC1023Rh type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC1023Rh A01(JSONObject jSONObject, String str) {
        for (EnumC1023Rh enumC1023Rh : values()) {
            boolean zA06 = enumC1023Rh.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (zA06) {
                return enumC1023Rh;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC1023Rh valueOf(String str) {
        return (EnumC1023Rh) Enum.valueOf(EnumC1023Rh.class, str);
    }

    public static EnumC1023Rh[] values() {
        return (EnumC1023Rh[]) A02.clone();
    }
}
