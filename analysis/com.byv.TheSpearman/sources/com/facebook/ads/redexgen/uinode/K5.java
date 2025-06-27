package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class K5 {
    public static K5 A00;
    public static byte[] A01;
    public static String[] A02 = {"Nd0aIJaSSdT6golxDxmvfQ8KGIhkioAs", "ixyRHf3ginhO64aTdthArc1g6ok2H3", "GbO21nRDfLqDtubwMBv4WZcS7UdykcI0", "mXXayHEFxYYogLv80iNIAWV0V8DSaho2", "P31SQSGtrqVfDfZK9ecLZSYzpsOr4NmF", "LoLWC0hqSx9uRqEUKclND68NLRAhrZnk", "BjBhbLG4paZ7rOUqjAFqxmQoWglNay8W", "K86adGKhBwKF7i3Zzr1zFaSNRf7F"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1109Up A01(C1207Yn c1207Yn, JSONObject jSONObject, long j) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(Opcodes.DCMPL, 10, 78)).getJSONObject(0);
        C8T c8tA00 = C8T.A00(jSONObject2.getJSONObject(A04(115, 10, 70)));
        String strOptString = jSONObject2.optString(A04(130, 14, 18));
        String strOptString2 = jSONObject2.optString(A04(0, 19, 98));
        String strA04 = A04(100, 15, 87);
        C8S c8s = new C8S(c8tA00, strOptString, strOptString2, jSONObject2.has(strA04) ? jSONObject2.optString(strA04) : null);
        String strA042 = A04(26, 3, 57);
        if (jSONObject2.has(strA042)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(strA042);
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                String[] strArr = A02;
                if (strArr[5].charAt(22) == strArr[0].charAt(22)) {
                    String[] strArr2 = A02;
                    strArr2[5] = "EVHdYwJmDBIkQbvU6cH0jf8LCXZeDjo6";
                    strArr2[0] = "LqKeHeP2dtVwdsKCNOcbJj8gANtIspsD";
                    if (i >= length) {
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JC.A06(c1207Yn, jSONObject3, j, null);
                    String strOptString3 = jSONObject3.optString(A04(19, 7, 39));
                    String strOptString4 = jSONObject3.optString(A04(85, 15, 63));
                    JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject(A04(63, 4, 116));
                    JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray(A04(Opcodes.IF_ICMPLT, 8, 90));
                    if (jSONObjectOptJSONObject != null) {
                        c8s.A0A(new C8Q(strOptString3, strOptString4, jSONObjectOptJSONObject, jSONArrayOptJSONArray));
                    } else {
                        c1207Yn.A0E().A4t(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(67, 18, 82));
                    }
                    i++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        String strA043 = A04(47, 12, 116);
        if (jSONObject2.has(strA043)) {
            c8s.A0B(jSONObject2.getJSONObject(strA043));
        }
        return new C1109Up(c8s, jSONObject.optString(A04(29, 18, 1)));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, Base64.padSymbol, 23, 24, 41, 0, 23, 26, 31, 18, 23, 2, 31, 25, 24, 41, 3, 3, 31, 18, 96, 107, 98, 106, 109, 92, 115, 98, 113, 98, 110, 112, 23, 27, 16, 17, 103, 98, 119, 98, 65, 68, 81, 68, 106, 71, 79, 64, 70, 81, 5, 76, 86, 5, 75, 80, 73, 73, 44, 41, 60, 41, 23, 37, 39, 44, 45, 36, 23, 60, 49, 56, 45, 68, 67, 76, Byte.MAX_VALUE, 84, 69, 83, 84, Byte.MAX_VALUE, 67, 79, 78, 70, 73, 71, 85, 84, 87, 88, 95, 88, 69, 88, 94, 95, 74, 93, 93, 64, 93, 3, 0, 4, 17, 16, 23, 0, 58, 6, 10, 11, 3, 12, 2, 15, 7, 17, 17, 3, 5, 7, 73, 85, 88, 90, 92, 84, 92, 87, 77, 74, 89, 95, 76, 78, 70, 72, 95, 94, 69, 72, 65, 84};
    }

    static {
        A05();
        A00 = new K5();
    }

    public static synchronized K5 A00() {
        return A00;
    }

    private C1108Uo A02(JSONObject jSONObject) {
        return new C1108Uo(jSONObject.optString(A04(Opcodes.D2F, 7, 21), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), null);
    }

    private C1108Uo A03(JSONObject jSONObject) throws JSONException {
        try {
            JSONArray placements = jSONObject.getJSONArray(A04(Opcodes.DCMPL, 10, 78));
            JSONObject definition = placements.getJSONObject(0);
            C8T c8tA00 = C8T.A00(definition.getJSONObject(A04(115, 10, 70)));
            String adReportingConfig = definition.optString(A04(130, 14, 18));
            return new C1108Uo(jSONObject.optString(A04(Opcodes.D2F, 7, 21), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), new C8S(c8tA00, adReportingConfig, definition.optString(A04(0, 19, 98)), null));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.uinode.K7 A06(com.facebook.ads.redexgen.uinode.C1207Yn r8, java.lang.String r9, long r10) throws org.json.JSONException {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L5a
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r9)
            r2 = 169(0xa9, float:2.37E-43)
            r1 = 4
            r0 = 70
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r6 = r4.optString(r0)
            int r5 = r6.hashCode()
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 5
            r0 = 88
            java.lang.String r3 = A04(r2, r1, r0)
            switch(r5) {
                case 96432: goto L3f;
                case 96784904: goto L37;
                default: goto L28;
            }
        L28:
            r0 = -1
        L29:
            switch(r0) {
                case 0: goto L55;
                case 1: goto L50;
                default: goto L2c;
            }
        L2c:
            org.json.JSONObject r0 = r4.optJSONObject(r3)
            if (r0 == 0) goto L5a
            com.facebook.ads.redexgen.X.Uo r0 = r7.A02(r0)
            return r0
        L37:
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L3f:
            r2 = 26
            r1 = 3
            r0 = 57
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L28
            r0 = 0
            goto L29
        L50:
            com.facebook.ads.redexgen.X.Uo r0 = r7.A03(r4)
            return r0
        L55:
            com.facebook.ads.redexgen.X.Up r0 = r7.A01(r8, r4, r10)
            return r0
        L5a:
            com.facebook.ads.redexgen.X.K6 r1 = com.facebook.ads.redexgen.uinode.K6.A04
            com.facebook.ads.redexgen.X.K7 r0 = new com.facebook.ads.redexgen.X.K7
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.K5.A06(com.facebook.ads.redexgen.X.Yn, java.lang.String, long):com.facebook.ads.redexgen.X.K7");
    }
}
