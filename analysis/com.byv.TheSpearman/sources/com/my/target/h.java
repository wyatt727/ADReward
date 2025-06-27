package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.ads.Reward;
import com.my.target.c;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h {
    public static h a() {
        return new h();
    }

    public final c.a a(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, Context context) {
        if (jSONObject == null) {
            a("Bad value", "null adChoices option", str2, str3, i, z, context);
            return null;
        }
        if (!jSONObject.has("type")) {
            a("Bad value", "AdChoices option hasn't type", str2, str3, i, z, context);
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (strOptString.equals(Reward.DEFAULT)) {
            return c(jSONObject, str, str2, str3, i, z, context);
        }
        if (strOptString.equals("copy")) {
            return b(jSONObject, str, str2, str3, i, z, context);
        }
        a("Required field", "Invalid adChoices option type", str2, str3, i, z, context);
        return null;
    }

    public c a(JSONObject jSONObject, String str, String str2, int i, boolean z, Context context) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("iconLink");
        if (TextUtils.isEmpty(strOptString) || !da.e(strOptString)) {
            a("Required field", "Invalid iconLink in adChoices", str, str2, i, z, context);
            return null;
        }
        String strOptString2 = jSONObject.optString("clickLink");
        List<c.a> listB = b(jSONObject, str, str2, i, z, context);
        if (listB == null && (TextUtils.isEmpty(strOptString2) || !da.e(strOptString2))) {
            a("Required field", "Invalid clickLink in adChoices", str, str2, i, z, context);
            return null;
        }
        c cVarA = c.a(ImageData.newImageData(strOptString), strOptString2);
        cVarA.a(listB);
        return cVarA;
    }

    public final String a(JSONObject jSONObject) {
        return jSONObject.optString("clickLink");
    }

    public final String a(JSONObject jSONObject, String str, boolean z, String str2, String str3, int i, boolean z2, Context context) {
        String strOptString = jSONObject.optString("url");
        if (da.e(strOptString)) {
            return strOptString;
        }
        if (!strOptString.isEmpty()) {
            a("Bad value", "Invalid url in adChoices option", str2, str3, i, z2, context);
        }
        if (str == null || !z) {
            return null;
        }
        String str4 = str + "&reason=";
        boolean z3 = !jSONObject.isNull("id");
        int iOptInt = jSONObject.optInt("id");
        if (!z3) {
            return str4;
        }
        if (iOptInt < 1) {
            a("Bad value", "Invalid id in adChoices option", str2, str3, i, z2, context);
            return str4;
        }
        return str4 + iOptInt;
    }

    public final void a(String str, String str2, String str3, String str4, int i, boolean z, Context context) {
        if (z) {
            z4.a(str).e(str2).a(i).b(str4).c(str3).b(context);
        }
    }

    public final c.a b(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, Context context) {
        String strC = c(jSONObject);
        if (TextUtils.isEmpty(strC)) {
            a("Required field", "Invalid name in adChoices option", str2, str3, i, z, context);
            return null;
        }
        boolean zD = d(jSONObject);
        String strA = a(jSONObject, str, zD, str2, str3, i, z, context);
        String strB = b(jSONObject);
        if (!TextUtils.isEmpty(strB)) {
            return c.a.a(strC, "copy", strA, null, strB, zD);
        }
        a("Bad value", "AdChoices option hasn't copy text ", str2, str3, i, z, context);
        return null;
    }

    public final String b(JSONObject jSONObject) {
        if (jSONObject.has("copyText")) {
            return jSONObject.optString("copyText");
        }
        return null;
    }

    public final List<c.a> b(JSONObject jSONObject, String str, String str2, int i, boolean z, Context context) {
        int length;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
        if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) == 0) {
            return null;
        }
        String strOptString = jSONObject.optString("closeUrl");
        if (strOptString.isEmpty()) {
            strOptString = null;
        } else if (!da.e(strOptString)) {
            a("Bad value", "Invalid closeUrl in adChoices", str, str2, i, z, context);
            strOptString = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            c.a aVarA = a(jSONArrayOptJSONArray.optJSONObject(i2), strOptString, str, str2, i, z, context);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final c.a c(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, Context context) {
        String strC = c(jSONObject);
        if (TextUtils.isEmpty(strC)) {
            a("Required field", "Invalid name in adChoices option", str2, str3, i, z, context);
            return null;
        }
        boolean zD = d(jSONObject);
        String strA = a(jSONObject);
        String strA2 = a(jSONObject, str, zD, str2, str3, i, z, context);
        if (!strA.isEmpty() && !da.e(strA)) {
            a("Bad value", "Invalid clickLink in adChoices option", str2, str3, i, z, context);
            if (strA2 == null) {
                return null;
            }
        }
        return c.a.a(strC, Reward.DEFAULT, strA2, strA, null, zD);
    }

    public final String c(JSONObject jSONObject) {
        return jSONObject.optString("name");
    }

    public final boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean("shouldCloseAd", true);
    }
}
