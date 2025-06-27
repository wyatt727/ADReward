package com.my.target;

import android.content.Context;
import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b7 {
    public b7(s sVar, j jVar, Context context) {
    }

    public static b7 a(s sVar, j jVar, Context context) {
        return new b7(sVar, jVar, context);
    }

    public void a(JSONObject jSONObject, a7 a7Var) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.json.mediationsdk.d.g);
        if (jSONObjectOptJSONObject != null) {
            b(jSONObjectOptJSONObject, a7Var);
        }
    }

    public final void b(JSONObject jSONObject, a7 a7Var) {
        a7Var.h(jSONObject.optString("title", a7Var.l()));
        a7Var.e(jSONObject.optString("icon_hd", a7Var.f()));
        a7Var.c(jSONObject.optString("bubble_icon_hd", a7Var.d()));
        a7Var.g(jSONObject.optString("label_icon_hd", a7Var.h()));
        a7Var.d(jSONObject.optString("goto_app_icon_hd", a7Var.e()));
        a7Var.f(jSONObject.optString("item_highlight_icon", a7Var.g()));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("icon_status");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    a7Var.k().add(new Pair<>(jSONObjectOptJSONObject.optString("value"), jSONObjectOptJSONObject.optString("icon_hd")));
                }
            }
        }
    }
}
