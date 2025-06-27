package com.bytedance.sdk.component.adexpress.dynamic.Pm;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicParserUtils.java */
/* loaded from: classes2.dex */
public class HX {
    public static void EYQ(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectXL = com.bytedance.sdk.component.adexpress.mZx.XL(str);
        if (jSONObjectXL == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectXL.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        EYQ(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject EYQ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectXL = com.bytedance.sdk.component.adexpress.mZx.XL(str);
        if (jSONObjectXL == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return EYQ(jSONObject2, jSONObjectXL.optJSONObject("themeValues"), jSONObject);
    }

    private static void EYQ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject EYQ(JSONObject... jSONObjectArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String EYQ(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectXL = com.bytedance.sdk.component.adexpress.mZx.XL(str);
        if (jSONObjectXL == null || (jSONObjectOptJSONObject = jSONObjectXL.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String EYQ(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectXL = com.bytedance.sdk.component.adexpress.mZx.XL(str);
        if (jSONObjectXL == null || (jSONObjectOptJSONObject = jSONObjectXL.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject EYQ(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }

    public static String mZx(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            if (str.indexOf(46) < 0) {
                str = str + ".png";
            }
            return str2 + "static/images/" + str;
        }
        return EYQ.EYQ(str);
    }
}
