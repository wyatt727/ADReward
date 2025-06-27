package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class PP {
    public static byte[] A00;
    public static String[] A01 = {"qzld4Qy39Azn7KYrj1sXbPZPr2qv6GgB", "1yyYiWnNu", "Zg1voNH89a01plQdKkVOTIE3hJJ00If9", "AO", "oO", "LhD7lTYtuMCYkgD1PnemOg5ERT23PX0", "YB3LukNHUN2DaV56yaS9yy46zwl6QYin", "pfYbPlfLNAe5pcAyURRpn9lPUi7k7Z7a"};
    public static final String A02;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {21, 51, 53, 58, 55, -14, Utf8.REPLACEMENT_BYTE, 59, 69, 69, -14, 56, 65, 68, -14, 56, 59, 62, 55, -14, 71, 68, 62, 12, -14, -61, -31, -29, -24, -27, -96, -19, -23, -13, -13, -96, -26, -17, -14, -96, -23, -19, -31, -25, -27, -96, -11, -14, -20, -70, -96, 33, 37, 48, -46, -1, -1, -4, -1, -83, -4, -3, -14, -5, -10, -5, -12, -83, -16, -18, -16, -11, -14, -15, -83, -13, -10, -7, -14, -83, -13, -4, -1, -83, 2, -1, -7, -57, -83, -26, -30, -31, 21, 4, 9, 5, 14, 3, 5, -18, 5, 20, 23, 15, 18, 11, -61, -65, -56, -22, -25, -37, -35, -21, -21, -31, -26, -33, -104, -34, -31, -28, -35, -104, -19, -22, -28, -78, -104, -2, 32, 29, 17, 19, 33, 33, 23, 28, 21, -50, 23, 27, 15, 21, 19, -50, 35, 32, 26, -24, -50, -7, 27, 24, 12, 14, 28, 28, 18, 23, 16, -55, 31, 18, 13, 14, 24, -55, 30, 27, 21, -29, -55, 73, 88, 81, -16, -5, -6, -9, -15};
        String[] strArr = A01;
        if (strArr[7].charAt(12) != strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        A01[1] = "7l6kM9ADseoG9RLfCJpKjz7J";
        A00 = bArr;
    }

    static {
        A04();
        A02 = PP.class.getSimpleName();
    }

    public static WebResourceResponse A00(C1207Yn c1207Yn, C05126c c05126c, WebResourceRequest webResourceRequest, PN pn, boolean z) {
        String string = webResourceRequest.getUrl().toString();
        if (pn.A05) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(string);
            if (pn.A01.contains(string)) {
                StringBuilder sb = new StringBuilder();
                String url = A03(108, 21, 15);
                sb.append(url).append(string).toString();
                File cachedFile = c05126c.A0O(string);
                if (cachedFile != null) {
                    if (z) {
                        String url2 = pn.A00;
                        if (string.equals(url2)) {
                            return A02(map, strGuessContentTypeFromName, new PH(c1207Yn.A01(), new FileInputStream(cachedFile), new TC(c1207Yn, string)));
                        }
                    }
                    return A01(map, strGuessContentTypeFromName, cachedFile);
                }
                StringBuilder sb2 = new StringBuilder();
                String url3 = A03(0, 25, 105);
                sb2.append(url3).append(string).toString();
            }
            if (pn.A02.contains(string)) {
                StringBuilder sb3 = new StringBuilder();
                String url4 = A03(129, 22, 69);
                sb3.append(url4).append(string).toString();
                File fileA0P = c05126c.A0P(string);
                if (fileA0P != null) {
                    return A01(map, strGuessContentTypeFromName, fileA0P);
                }
                StringBuilder sb4 = new StringBuilder();
                String url5 = A03(25, 26, 23);
                sb4.append(url5).append(string).toString();
            }
            if (pn.A03.contains(string)) {
                StringBuilder sb5 = new StringBuilder();
                String url6 = A03(Opcodes.DCMPL, 22, 64);
                sb5.append(url6).append(string).toString();
                return PE.A00(c1207Yn, webResourceRequest, webResourceRequest.getUrl(), strGuessContentTypeFromName, map);
            }
        } catch (IOException e) {
            StringBuilder sb6 = new StringBuilder();
            String url7 = A03(54, 35, 36);
            String mimeType = sb6.append(url7).append(string).toString();
            String url8 = A03(89, 17, 55);
            Log.e(url8, mimeType, e);
        }
        return null;
    }

    public static WebResourceResponse A01(HashMap<String, String> responseHeaders, String str, File file) throws FileNotFoundException {
        return A02(responseHeaders, str, new FileInputStream(file));
    }

    public static WebResourceResponse A02(HashMap<String, String> responseHeaders, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 11), responseHeaders, inputStream);
    }

    public static void A05(C05357f c05357f, String str, String str2) throws JSONException {
        C8B c8b = new C8B(A03(51, 3, 116));
        c8b.A05(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(Opcodes.ARETURN, 2, 31), str);
            jSONObject.put(A03(Opcodes.GETSTATIC, 3, 28), str2);
            c8b.A07(jSONObject);
        } catch (JSONException unused) {
        }
        c05357f.A07().A9b(A03(Opcodes.LRETURN, 3, 124), C8A.A12, c8b);
    }
}
