package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YQ implements C0T {
    public static byte[] A01;
    public static String[] A02 = {"EcOoOPxvgIM5VM8gU5MNIX90mja3CaI7", "nhJ", "HCYDUCxXnFbS3htlRPDiG7BoiyzyMxIV", "Fv3YAwH75PiBj9X6AN971g", "yIx", "", "9xkhFmOksAfwag3lVFNPfz", "xjMRz"};
    public final C05357f A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "mKsg4hxQhHaV0fiKABuoeRg1A6SJU8YP";
        strArr2[2] = "TgUrCFxQKf96ICwhyLjRHk1rYV6JKdAm";
        A01 = new byte[]{-91, -111, -94, -120, -18, 29, 22, 22, 13, 20, -12, 35, 28, 28, 19, 26, -24, -50, -3, 12, 34, -16, 33, 16, 25, 31, 10, -37, -22, -29, -29, -38, -31, 57, 72, 65, 65, 56, Utf8.REPLACEMENT_BYTE, 50, Utf8.REPLACEMENT_BYTE, 66, 58, 58, 56, 55};
    }

    static {
        A01();
    }

    public YQ(C05357f c05357f) {
        this.A00 = c05357f;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z, int i2) throws JSONException {
        C8B c8b = new C8B(A00(4, 6, 78));
        c8b.A07(jSONObject);
        c8b.A05(1);
        c8b.A09(z);
        c8b.A04(i2);
        try {
            jSONObject.put(A00(33, 13, 121), AnonymousClass84.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A07().A9b(A00(27, 6, 27), i + 4000, c8b);
        if (this.A00.A04().A8z()) {
            String str2 = A00(10, 8, 84) + str + A00(0, 1, 35) + i + A00(1, 3, 14) + jSONObject.toString();
        }
    }

    public static boolean A03(C0V c0v) {
        for (C0V c0v2 : YI.A06) {
            if (c0v2.equals(c0v)) {
                String[] strArr = A02;
                if (strArr[5].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "Wnbl1SxbPUMoFXuq6aB18pNeXqZWWzDi";
                strArr2[2] = "Lc0ARXxjXBXBpMD71LOao0gY4EKFysHu";
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0T
    public final void A9c(C0V c0v, JSONObject jSONObject, int i) throws JSONException {
        A02(c0v.A02(), c0v.toString(), jSONObject, A03(c0v), i);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0T
    public final void A9x(int i, JSONObject jSONObject) throws JSONException {
        A02(i, A00(18, 9, 81) + i, jSONObject, false, 0);
    }
}
