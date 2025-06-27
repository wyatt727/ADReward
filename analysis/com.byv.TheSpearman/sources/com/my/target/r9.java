package com.my.target;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class r9 {
    public static r9 a() {
        return new r9();
    }

    public void a(JSONObject jSONObject, q9 q9Var) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.json.mediationsdk.d.g);
        if (jSONObjectOptJSONObject != null) {
            b(jSONObjectOptJSONObject, q9Var);
        }
    }

    public final void b(JSONObject jSONObject, q9 q9Var) {
        q9Var.a(jSONObject.optBoolean("hasAdditionalAds", q9Var.d()));
    }
}
