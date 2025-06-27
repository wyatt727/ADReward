package com.my.target;

import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class t2 {
    public static t2 a() {
        return new t2();
    }

    public final void a(JSONObject jSONObject, h3 h3Var) {
        h3Var.a(jSONObject.optInt("connectionTimeout", h3Var.e()));
        int iOptInt = jSONObject.optInt("maxBannersShow", h3Var.f());
        if (iOptInt == 0) {
            iOptInt = -1;
        }
        h3Var.b(iOptInt);
    }

    public void a(JSONObject jSONObject, s2 s2Var) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.json.mediationsdk.d.g);
        if (jSONObjectOptJSONObject != null) {
            Iterator<h3> it = s2Var.c().iterator();
            while (it.hasNext()) {
                h3 next = it.next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next.h());
                if (jSONObjectOptJSONObject2 != null) {
                    a(jSONObjectOptJSONObject2, next);
                }
            }
        }
    }
}
