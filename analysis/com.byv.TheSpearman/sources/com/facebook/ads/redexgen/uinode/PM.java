package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PM {
    public static byte[] A08;
    public WeakReference<PB> A00;
    public WeakReference<TD> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1207Yn A03;
    public final C0962Oy A04;
    public final String A05;
    public final String A06;
    public final WeakReference<J2> A07;

    static {
        A09();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, Utf8.REPLACEMENT_BYTE, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, Utf8.REPLACEMENT_BYTE, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, Utf8.REPLACEMENT_BYTE, 27, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public PM(C1207Yn c1207Yn, PB pb, J2 j2, C0962Oy c0962Oy, String str, String str2) {
        this.A03 = c1207Yn;
        this.A00 = new WeakReference<>(pb);
        this.A07 = new WeakReference<>(j2);
        this.A04 = c0962Oy;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8X();
    }

    private void A06() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9K();
    }

    private void A07() {
        this.A03.A0E().A5F();
        this.A02 = true;
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AGY();
        if (C0796Ih.A1W(this.A03)) {
            this.A03.A0A().ABG();
        }
    }

    private void A08() {
        TD uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ABb();
    }

    private void A0A(PB pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = KE.A00(this.A03);
        String strA01 = A01(57, 5, 81);
        String strA012 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(strA01, strA012);
        String key = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        String string = sharedPreferencesA00.getString(A01(14, 4, 103) + key, strA012);
        if (string != null) {
            strA012 = string;
        }
        pb.A0g(storageValue, strA012);
    }

    private void A0B(PB pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(98, 5, 12);
        String strA012 = A01(0, 0, 21);
        String strOptString = jSONObject.optString(strA01, strA012);
        String strOptString2 = jSONObject.optString(A01(57, 5, 81), strA012);
        KE.A00(this.A03).edit().putString(A01(14, 4, 103) + jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50)), strOptString).apply();
        pb.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(PK pk, String str) throws JSONException {
        switch (PJ.A00[pk.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0E().A5R(str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(pk, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        PB pb = this.A00.get();
        if (pb == null) {
        }
        switch (pk) {
            case A06:
                pb.A0S();
                break;
            case A05:
                pb.A0R();
                break;
            case A0P:
                A0B(pb, str);
                break;
            case A0L:
                A0A(pb, str);
                break;
            case A0F:
                pb.A0i(A03(new JSONObject(str)));
                break;
        }
    }

    private void A0D(PK pk, String str) throws JSONException {
        TD td = this.A01.get();
        if (td == null) {
        }
        switch (pk) {
            case A0C:
                td.ABf();
                break;
            case A0N:
                td.AD8();
                break;
            case A0K:
                A0G(td, str);
                break;
            case A0J:
                A0F(td, str);
                break;
            case A0G:
                A0E(td, str);
                break;
        }
    }

    private void A0E(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        td.ACL(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        td.ADc(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        td.ADe(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        TD td = this.A01.get();
        if (td == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            td.A8S();
        } else {
            td.A8T(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        J2 j2 = this.A07.get();
        if (j2 == null) {
            return;
        }
        String strOptString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new JA(this.A06, j2).A05(strOptString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (iOptInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9Y(iOptInt, message);
    }

    private void A0M(JSONObject jSONObject) {
        String strOptString;
        TD td = this.A01.get();
        if (td == null || (strOptString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        td.ADr(strOptString);
    }

    public final void A0N(TD td) {
        this.A01 = new WeakReference<>(td);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC0868Li.A00(new PI(this, str));
    }
}
