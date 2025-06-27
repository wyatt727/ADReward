package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.RewardData;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C1F implements Serializable {
    public static String A0S = null;
    public static byte[] A0T = null;
    public static String[] A0U = {"nQEL7ltu", "3I3h", "XGwMyflu2SSmsRt1RfrJRUY9I72rnsF", "QYAlpzJzU24310l7paj9Ae15", "2mdfEFQBKkTooSy2QZ4PIVa2Ztt82faR", "LWmzkzhltJuYyEaTC5aoGJqcPz9GQgBs", "qY0", "qq9iBauleUUoVYq0iZ43n7I7uVpCZZUg"};
    public static final long serialVersionUID = -8352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public RewardData A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0T, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0T = new byte[]{111, 109, 97, 124, 109, 101, 107, 98, 101, 104, 49, 123, 105, 110, 83, 109, 121, 120, 99, 83, 126, 105, 104, 101, 126, 105, 111, 120, 44, 109, 111, 120, 101, 99, 98, 49, 109, 98, 104, 126, 99, 101, 104, 34, 101, 98, 120, 105, 98, 120, 34, 109, 111, 120, 101, 99, 98, 34, 90, 69, 73, 91, 44, 124, 109, 111, 103, 109, 107, 105, 49, 111, 99, 97, 34, 109, 98, 104, 126, 99, 101, 104, 34, 122, 105, 98, 104, 101, 98, 107, 44, 101, 98, 120, 105, 98, 120, 54, 35, 35, 124, 96, 109, 117, 34, 107, 99, 99, 107, 96, 105, 34, 111, 99, 97, 35, Byte.MAX_VALUE, 120, 99, 126, 105, 42, 40, 59, 38, 60, 58, 44, 37, 43, 32, 41, 33, 38, 23, 56, 41, 58, 41, 37, 59, 101, 106, 111, 101, 109, 89, 98, 99, 106, 103, Byte.MAX_VALUE, 89, 106, 105, 97, 97, 111, 104, 97, 89, 107, 117, 5, 10, 15, 5, 13, 57, 15, 7, 4, 57, 0, 15, 10, 18, 3, 20, 15, 8, 1, 57, 3, 8, 7, 4, 10, 3, 2, 80, 92, 94, 29, 85, 82, 80, 86, 81, 92, 92, 88, 29, 82, 87, 64, 29, 90, 93, 71, 86, 65, 64, 71, 90, 71, 90, 82, 95, 29, 80, 95, 90, 80, 88, 86, 87, 118, 103, 112, 116, 97, 124, 99, 112, 74, 116, 102, 74, 118, 97, 116, 74, 112, 123, 116, 119, 121, 112, 113, 86, 65, 94, 109, 90, 91, 86, 87, 109, 92, 83, 68, 91, 85, 83, 70, 91, 93, 92, 109, 87, 92, 83, 80, 94, 87, 86, 83, 68, 91, 104, 95, 68, 104, 82, 89, 86, 85, 91, 82, 83, 5, 18, 13, 62, 9, 24, 3, 19, 8, 5, 62, 4, 15, 0, 3, 13, 4, 5, 119, 106, 125, 114, 126, 122, 112, 76, 96, 119, 120, 76, Byte.MAX_VALUE, 114, 106, 118, 97, 76, 123, 103, 126, Byte.MAX_VALUE, 76, 102, 97, Byte.MAX_VALUE, 39, 44, 33, 48, 59, 50, 54, 39, 38, 29, 33, 50, 47, 64, 72, 72, 64, 75, 66, 120, 87, 75, 70, 94, 120, 79, 72, 84, 83, 120, 84, 83, 85, 78, 73, 64, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 36, 53, 51, 38, 34, 9, 33, 51, 52, 9, Utf8.REPLACEMENT_BYTE, 56, 37, 34, 55, 58, 58, 9, 52, 35, 34, 34, 57, 56, 10, 13, 23, 6, 17, 16, 23, 10, 23, 10, 2, 15, 25, 0, 44, 4, 22, 17, 44, 26, 29, 0, 7, 18, 31, 31, 44, 17, 6, 7, 7, 28, 29, 94, 81, 68, 89, 70, 85, 84, 72, 69, 93, 10, 67, 75, 75, 67, 72, 65, 10, 71, 75, 73, 34, 53, 33, 37, 53, 35, 36, 15, 57, 52, 23, 0, 18, 4, 23, 1, 0, 1, 58, 19, 12, 1, 0, 10, 13, 10, 12, 23, 16, 25, 33, 10, 17, 33, 29, 22, 27, 29, 21, 33, 25, 17, 17, 25, 18, 27, 33, 14, 18, 31, 7, 33, 31, 11, 10, 17, 33, 12, 27, 26, 23, 12, 27, 29, 10, 121, 102, 106, 120, 110, 109, 102, 99, 102, 123, 118, 80, 108, 103, 106, 108, 100, 80, 102, 97, 102, 123, 102, 110, 99, 80, 107, 106, 99, 110, 118, 9, 22, 26, 8, 30, 29, 22, 19, 22, 11, 6, 32, 28, 23, 26, 28, 20, 32, 22, 17, 11, 26, 13, 9, 30, 19, 89, 79, 90, 77, 70, 113, 79, 64, 74, 113, 71, 64, 93, 90, 79, 66, 66, 113, 77, 90, 79, 113, 76, 91, 90, 90, 65, 64, 113, 75, 64, 79, 76, 66, 75, 74, 45, 59, 46, 57, 50, 5, 59, 52, 62, 5, 51, 52, 41, 46, 59, 54, 54, 5, Utf8.REPLACEMENT_BYTE, 52, 59, 56, 54, Utf8.REPLACEMENT_BYTE, 62, 38, 48, 37, 50, 57, 14, 48, Utf8.REPLACEMENT_BYTE, 53, 14, 56, Utf8.REPLACEMENT_BYTE, 34, 37, 48, Base64.padSymbol, Base64.padSymbol, 14, 55, 35, 62, 60, 14, 34, 37, 48, 35, 37, 14, 53, 52, Base64.padSymbol, 48, 40, 49, 39, 50, 37, 46, 25, 39, 40, 34, 25, 47, 40, 53, 50, 39, 42, 42, 25, 41, 40, 25, 47, 40, 53, 50, 39, 40, 50, 25, 33, 39, 43, 35, 53, 25, 35, 40, 39, 36, 42, 35, 34};
    }

    public abstract int A0F();

    public abstract int A0G();

    static {
        A02();
    }

    public C1F() {
        String strA01 = A01(0, 0, 100);
        this.A0C = strA01;
        this.A01 = 200;
        this.A0B = strA01;
        this.A0A = A01(438, 15, 28);
        this.A0F = strA01;
    }

    public static C1F A00(JSONObject jSONObject, C1207Yn c1207Yn) {
        boolean zHas = jSONObject.has(A01(129, 12, 112));
        boolean z = false;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(121, 8, 113));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            z = true;
        }
        C1F c1fA02 = null;
        if (zHas) {
            try {
                c1fA02 = C1308b3.A02(jSONObject, c1207Yn);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (c1fA02 == null) {
            zHas = false;
            c1fA02 = FS.A02(jSONObject, c1207Yn);
        }
        c1fA02.A0e(zHas);
        c1fA02.A0B(z);
        return c1fA02;
    }

    private void A03(int i) {
        this.A02 = i;
    }

    private final void A04(long j) {
        this.A03 = j;
    }

    private void A05(String str) {
        this.A06 = str;
    }

    private void A06(String str) {
        this.A07 = str;
    }

    private void A07(String str) {
        this.A0D = str;
    }

    private void A08(JSONObject jSONObject) {
        this.A0C = jSONObject.toString();
    }

    private final void A09(boolean z) {
        this.A0L = z;
    }

    private final void A0A(boolean z) {
        this.A0M = z;
    }

    private final void A0B(boolean z) {
        this.A0J = z;
    }

    public final int A0C() {
        return this.A02;
    }

    public final int A0D() {
        return this.A0R;
    }

    public final int A0E() {
        return this.A00;
    }

    public final long A0H() {
        return this.A03;
    }

    public final long A0I() {
        return this.A04;
    }

    public final RewardData A0J() {
        return this.A05;
    }

    public final String A0K() {
        return A0S;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0L() {
        /*
            r7 = this;
            java.lang.String r3 = r7.A09
            int r0 = r3.hashCode()
            switch(r0) {
                case -1364000502: goto L73;
                case -1052618729: goto L39;
                case 604727084: goto L27;
                default: goto L9;
            }
        L9:
            r0 = -1
        La:
            switch(r0) {
                case 0: goto La0;
                case 1: goto L99;
                case 2: goto L92;
                default: goto Ld;
            }
        Ld:
            r2 = 0
            r1 = 0
            r0 = 100
            java.lang.String r3 = A01(r2, r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C1F.A0U
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto L85
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            r2 = 399(0x18f, float:5.59E-43)
            r1 = 12
            r0 = 91
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            goto La
        L39:
            r6 = 432(0x1b0, float:6.05E-43)
            r5 = 6
            r4 = 8
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1F.A0U
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L68
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1F.A0U
            java.lang.String r1 = "HVd6lECbTZwpNvPLKB49AFB2LODoRB5A"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "XOoEMM0Y31wmGZ0mC74NUBXm297DQIjG"
            r0 = 7
            r2[r0] = r1
            java.lang.String r0 = A01(r6, r5, r4)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
        L66:
            r0 = 2
            goto La
        L68:
            java.lang.String r0 = A01(r6, r5, r4)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            goto L66
        L73:
            r2 = 463(0x1cf, float:6.49E-43)
            r1 = 14
            r0 = 93
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1F.A0U
            java.lang.String r1 = "JJjM6PLcBsngjIhBbE4reT0wE3or2kJL"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "FVmcFNC2hDJvIDmuBd4oyOix3HqDBQPX"
            r0 = 7
            r2[r0] = r1
            return r3
        L92:
            com.facebook.ads.redexgen.X.QO r0 = com.facebook.ads.redexgen.uinode.QO.A03
            java.lang.String r0 = r0.A02()
            return r0
        L99:
            com.facebook.ads.redexgen.X.QP r0 = com.facebook.ads.redexgen.uinode.QP.A04
            java.lang.String r0 = r0.A02()
            return r0
        La0:
            r2 = 190(0xbe, float:2.66E-43)
            r1 = 37
            r0 = 11
            java.lang.String r0 = A01(r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1F.A0L():java.lang.String");
    }

    public final String A0M() {
        return this.A06;
    }

    public final String A0N() {
        return this.A07;
    }

    public final String A0O() {
        return this.A08;
    }

    public final String A0P() {
        return this.A09;
    }

    public final String A0Q() {
        return this.A0A;
    }

    public final String A0R() {
        return this.A0B;
    }

    public final String A0S() {
        return this.A0D;
    }

    public final String A0T() {
        return this.A0E;
    }

    public final String A0U() {
        return this.A0F;
    }

    public final JSONObject A0V() {
        try {
            return new JSONObject(this.A0C);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A0W(int i) {
        this.A01 = i;
    }

    public final void A0X(long j) {
        this.A04 = j;
    }

    public final void A0Y(RewardData rewardData) {
        this.A05 = rewardData;
    }

    public final void A0Z(String str) {
        A0S = str;
    }

    public final void A0a(String str) {
        this.A08 = str;
    }

    public final void A0b(String str) {
        this.A09 = str;
    }

    public final void A0c(String str) {
        this.A0E = str;
    }

    public final void A0d(JSONObject jSONObject) {
        String strA01 = A01(453, 10, 104);
        String strA012 = A01(0, 0, 100);
        A07(jSONObject.optString(strA01, strA012));
        A06(jSONObject.optString(A01(335, 13, 122)));
        A08(jSONObject);
        A03(jSONObject.optInt(A01(518, 31, 55), 0));
        A0W(jSONObject.optInt(A01(549, 26, 71), 1000));
        A05(jSONObject.optString(A01(309, 26, 43), strA012));
        A0A(jSONObject.optBoolean(A01(227, 23, 45), false));
        A09(jSONObject.optBoolean(A01(Opcodes.IF_ICMPGT, 27, 94), false));
        this.A0H = jSONObject.optBoolean(A01(277, 14, 15));
        this.A0I = jSONObject.optBoolean(A01(291, 18, 89));
        this.A0G = jSONObject.optBoolean(A01(250, 27, 10), true);
        this.A0P = jSONObject.optBoolean(A01(611, 25, 98), false);
        this.A00 = jSONObject.optInt(A01(636, 34, 105), -1);
        this.A0Q = jSONObject.optBoolean(A01(670, 42, 126), false);
        this.A0O = jSONObject.optBoolean(A01(575, 36, 22), false);
        this.A0N = jSONObject.optBoolean(A01(371, 28, 110), false);
        this.A0B = jSONObject.optString(A01(TTAdConstant.IMAGE_CODE, 21, 75), strA012);
        A04(jSONObject.optLong(A01(Opcodes.F2D, 22, 62), -1L));
        if (TextUtils.isEmpty(this.A0B)) {
            String strA00 = OC.A00();
            String[] strArr = A0U;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[3] = "hnEXWAdLhVWcnFIzj2c95pGY";
            strArr2[6] = "Kkp";
            this.A0B = strA00;
        }
        String strA013 = A01(477, 41, 70);
        String strA014 = A01(0, 121, 52);
        if (A0U[1].length() != 4) {
            String[] strArr3 = A0U;
            strArr3[2] = "XaU6hHXQfaQDz3kzbxck6kRJ4tk6bqn";
            strArr3[0] = "oDjnwfDm";
            this.A0F = jSONObject.optString(strA013, strA014);
            this.A0A = jSONObject.optString(A01(Opcodes.IF_ICMPLT, 2, 0), A01(298, 10, 16));
            return;
        }
        String[] strArr4 = A0U;
        strArr4[2] = "C8MEdHxcpnYOOnUyVXAsRASaX6441HE";
        strArr4[0] = "AwkQQbt5";
        this.A0F = jSONObject.optString(strA013, strA014);
        this.A0A = jSONObject.optString(A01(348, 23, 31), A01(438, 15, 28));
    }

    public final void A0e(boolean z) {
        this.A0K = z;
    }

    public final boolean A0f() {
        return this.A0H;
    }

    public final boolean A0g() {
        return this.A0I;
    }

    public final boolean A0h() {
        return this.A0G;
    }

    public final boolean A0i() {
        return this.A0J;
    }

    public final boolean A0j() {
        return this.A0K;
    }

    public final boolean A0k() {
        return this.A0L;
    }

    public final boolean A0l() {
        return this.A0M;
    }

    public final boolean A0m() {
        return Build.VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(A0M());
    }

    public final boolean A0n() {
        return this.A0N;
    }

    public final boolean A0o() {
        return this.A0O;
    }

    public final boolean A0p() {
        return this.A0P;
    }

    public final boolean A0q() {
        return this.A0Q;
    }
}
