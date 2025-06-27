package com.my.target;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class y4 {
    public static String a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }
}
