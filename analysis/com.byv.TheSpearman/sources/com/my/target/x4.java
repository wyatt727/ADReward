package com.my.target;

import android.graphics.Color;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class x4 {
    public static int a(JSONObject jSONObject, String str, int i) {
        String strOptString = jSONObject.optString(str);
        if (TextUtils.isEmpty(strOptString)) {
            return i;
        }
        try {
            return Color.parseColor(strOptString);
        } catch (Throwable unused) {
            ba.b("JsonParser: Error parsing color " + strOptString);
            return i;
        }
    }
}
