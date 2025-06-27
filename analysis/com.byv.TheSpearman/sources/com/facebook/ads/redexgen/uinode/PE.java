package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class PE {
    public static byte[] A00;
    public static String[] A01 = {"CXRchRuqobcH0303RF", "0PvsG2xJSmQLgGTcWH9EYe7sEgRs7pRt", "Ep2muPcKb5OPprn584rkOKVS7ZwPor7u", "ESdTFl6hgzo0PrNou", "ifIc3126Iu24LMQAqXU9MKX3mrrg1qWL", "gYyPZy3RrUjZ7", "cRp6DEQTFSLuVCLvwOm8", "Iag0U1Rq9Q0ZydVPffrz8fjunI2ky4CH"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static WebResourceResponse A00(C1207Yn c1207Yn, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> map) throws JSONException, IOException {
        String strA02 = A02(85, 5, 49);
        C1128Vj c1128VjA0F = R0.A05(c1207Yn.A01()).A0F(c1207Yn);
        C05126c.A0H(c1207Yn, uri.toString());
        try {
            PF pf = new PF(c1207Yn.A01(), uri, c1128VjA0F);
            int iAvailable = pf.available();
            if (iAvailable <= 0) {
                A05(c1207Yn, 1, new Pair[]{new Pair(A02(61, 9, 77), String.valueOf(iAvailable))});
                return null;
            }
            String strA03 = A03(webResourceRequest.getRequestHeaders());
            if (strA03 == null) {
                c1207Yn.A0E().A5O();
                A06(map, iAvailable);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 15), map, pf);
            }
            try {
                PD pdA01 = A01(strA03);
                boolean z = pdA01.A03;
                if (A01[7].charAt(0) == '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "V65aPOMRpqA07";
                strArr[6] = "uUbGIz9l3eQBVw2CYc6n";
                if (!z) {
                    Pair[] pairArr = new Pair[1];
                    pairArr[0] = new Pair(A02(94, 5, 44), pdA01.A02 != null ? pdA01.A02 : A02(90, 4, 76));
                    A05(c1207Yn, 0, pairArr);
                    return null;
                }
                int i = pdA01.A01;
                int i2 = pdA01.A00 == -1 ? iAvailable - 1 : pdA01.A00;
                A06(map, iAvailable);
                map.put(A02(31, 13, 81), A02(75, 6, 17) + i + A02(1, 1, 52) + i2 + A02(2, 1, 110) + iAvailable);
                c1207Yn.A0E().A5O();
                return new WebResourceResponse(str, null, 206, A02(46, 15, 36), map, pf);
            } catch (NumberFormatException e) {
                A05(c1207Yn, 3, new Pair[]{new Pair(strA02, e.toString())});
                return null;
            }
        } catch (IOException e2) {
            A05(c1207Yn, 2, new Pair[]{new Pair(strA02, e2.toString())});
            return null;
        }
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-119, -68, -8, -14, -50, -16, -16, -14, -3, 1, -70, -33, -18, -5, -12, -14, 0, -46, -2, -3, 3, -12, -3, 3, -68, -37, -12, -3, -10, 3, -9, -17, 27, 26, 32, 17, 26, 32, -39, -2, 13, 26, 19, 17, -71, -75, -49, -32, -15, -13, -24, -32, -21, -97, -62, -18, -19, -13, -28, -19, -13, 9, 30, 9, 17, 20, 9, 10, 20, 13, -7, 16, 11, -4, 10, -50, -27, -32, -47, -33, -116, 4, 16, 5, 6, -15, -2, -2, -5, -2, 21, 28, 19, 19, -7, -24, -11, -18, -20};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A05(C1207Yn c1207Yn, int i, Pair<String, String>[] pairArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 70), i);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c1207Yn.A0E().A5N(jSONObject.toString());
    }

    static {
        A04();
    }

    public static PD A01(String str) {
        if (str == null) {
            PD parseResult = new PD();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] strArrSplit = str.split(A02(3, 1, 90));
        if (strArrSplit.length >= 2) {
            if (A02(70, 5, 60).equals(strArrSplit[0].toLowerCase(Locale.US).trim())) {
                if (strArrSplit[1].trim().split(A02(0, 1, 2)).length != 1) {
                    PD pd = new PD();
                    pd.A03 = false;
                    pd.A02 = str;
                    return pd;
                }
                String[] ranges = strArrSplit[1].trim().split(A02(1, 1, 52));
                PD pd2 = new PD();
                pd2.A03 = true;
                pd2.A02 = str;
                pd2.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    pd2.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    pd2.A00 = -1;
                }
                return pd2;
            }
        }
        PD pd3 = new PD();
        pd3.A03 = false;
        pd3.A02 = str;
        return pd3;
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            if (A02(94, 5, 44).equals(str.toLowerCase(Locale.US))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> map, int i) {
        map.put(A02(4, 13, 50), A02(70, 5, 60));
        map.put(A02(17, 14, 52), String.valueOf(i));
    }
}
