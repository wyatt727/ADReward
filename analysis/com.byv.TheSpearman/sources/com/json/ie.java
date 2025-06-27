package com.json;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ie {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1817a = "errMsg";

    public static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
