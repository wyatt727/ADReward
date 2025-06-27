package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdSettings;
import java.util.Arrays;
import java.util.Set;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1264aL implements C8Z {
    public static byte[] A03;
    public static String[] A04 = {"4N8cmsj9EpnkUl6", "5tC9qbfxhkURykO", "7Ii9dZjOw8fqZt8JqFJn6POj1Sxnt", "zMWlB1xQ8DN59FuCS2f9BQ4ro9lkAFBp", "yrh", "h0PeY1Uyun6wVHVATHObfU3jtt7wCFOH", "mv5BCa1PFGvzWeML14qDpWXs1XRIKMch", "rICUpP"};
    public final Bundle A00;
    public final String A01;
    public final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {112, 125, 125, 122, -115, 115, -122, 126, 122, 119, 113, 119, -126, -115, -126, 115, -127, -126, -115, 123, 125, 114, 115, -115, 121, 115, -121, 88, 101, 101, 98, 117, 95, 105, 117, 107, 100, 95, 106, 111, 113, 126, 126, 123, -114, 124, 120, -121, 116, 115, -114, 112, -124, 115, 120, 116, 125, 114, 116, -114, 122, 116, -120, -101, -104, -85, -104, -74, -89, -87, -90, -102, -100, -86, -86, -96, -91, -98, -74, -90, -89, -85, -96, -90, -91, -86, -74, -102, -90, -84, -91, -85, -87, -80, -74, -94, -100, -80, 74, 71, 90, 71, 101, 86, 88, 85, 73, 75, 89, 89, 79, 84, 77, 101, 85, 86, 90, 79, 85, 84, 89, 101, 81, 75, 95, -126, Byte.MAX_VALUE, -110, Byte.MAX_VALUE, -99, -114, -112, -115, -127, -125, -111, -111, -121, -116, -123, -99, -115, -114, -110, -121, -115, -116, -111, -99, -111, -110, Byte.MAX_VALUE, -110, -125, -99, -119, -125, -105, -47, -46, -48, -35, -65, -62, -35, -46, -61, -47, -46, -35, -46, -41, -50, -61, -35, -55, -61, -41, -95, -94, -96, -83, -101, -109, -110, -105, -113, -94, -105, -99, -100, -83, -95, -109, -96, -92, -105, -111, -109, -83, -103, -109, -89};
        if (A04[7].length() != 6) {
            throw new RuntimeException();
        }
        A04[4] = "0dqJ";
        A03 = bArr;
    }

    static {
        A01();
    }

    public C1264aL(String str, String str2, Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A6E() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A6S() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final C05457t A6k(C05357f c05357f) {
        String[] stringArray = this.A00.getStringArray(A00(98, 27, 3));
        Integer numValueOf = Integer.valueOf(this.A00.getInt(A00(63, 35, 84), -1));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        Integer country = Integer.valueOf(this.A00.getInt(A00(125, 33, 59), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new C05457t(stringArray, numValueOf, country);
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A7Q() {
        return this.A00.getString(A00(Opcodes.GETSTATIC, 25, 75));
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A87() {
        String string = this.A00.getString(A00(158, 20, 123));
        String adTestTypeStr = AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (AdSettings.TestAdType testAdType : AdSettings.TestAdType.values()) {
            String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                String adTypeString = testAdType.getAdTypeString();
                String adTestTypeStr3 = A04[4];
                if (adTestTypeStr3.length() == 20) {
                    throw new RuntimeException();
                }
                A04[2] = "FKrwRA6JBECpV1xBEOFunH5DhTS9V";
                return adTypeString;
            }
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final boolean A99() {
        return this.A00.getBoolean(A00(40, 23, 44));
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final boolean A9E() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final Boolean A9J() {
        Set<String> setKeySet = this.A00.keySet();
        String strA00 = A00(27, 13, 19);
        if (setKeySet.contains(strA00)) {
            return Boolean.valueOf(this.A00.getBoolean(strA00));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final boolean isTestMode(Context context) {
        return this.A00.getBoolean(A00(0, 27, 43)) || AdSettings.isTestMode(context);
    }
}
