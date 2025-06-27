package com.my.target;

import com.my.target.common.models.AudioData;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b3 {
    public static b3 a() {
        return new b3();
    }

    public void a(JSONObject jSONObject, a3 a3Var) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.json.mediationsdk.d.g);
        if (jSONObjectOptJSONObject != null) {
            Iterator<c5<AudioData>> it = a3Var.c().iterator();
            while (it.hasNext()) {
                c5<AudioData> next = it.next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next.h());
                if (jSONObjectOptJSONObject2 != null) {
                    a(jSONObjectOptJSONObject2, next);
                }
            }
        }
    }

    public final void a(JSONObject jSONObject, c5 c5Var) {
        c5Var.a(jSONObject.optInt("connectionTimeout", c5Var.e()));
        int iOptInt = jSONObject.optInt("maxBannersShow", c5Var.f());
        if (iOptInt == 0) {
            iOptInt = -1;
        }
        c5Var.b(iOptInt);
    }
}
