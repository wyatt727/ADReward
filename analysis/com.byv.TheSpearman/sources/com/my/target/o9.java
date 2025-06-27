package com.my.target;

import android.content.Context;
import com.my.target.l5;
import com.my.target.o5;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class o9 extends o<q9> implements l5.a {

    /* renamed from: a, reason: collision with root package name */
    public String f4090a;

    public static o<q9> a() {
        return new o9();
    }

    public q9 a(String str, s sVar, q9 q9Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        m mVar;
        JSONObject jSONObjectOptJSONObject;
        j9 j9VarB;
        JSONObject jSONObjectOptJSONObject2;
        e5 e5VarB;
        JSONObject jSONObjectA = o.a(str, aVar, o5Var, list, nVar);
        if (jSONObjectA == null) {
            mVar = m.j;
        } else {
            if (q9Var == null) {
                q9Var = q9.e();
            }
            this.f4090a = jSONObjectA.optString("mraid.js");
            JSONObject jSONObjectA2 = a(jSONObjectA, jVar.getFormat());
            if (jSONObjectA2 != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectA2.optJSONArray("banners");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    r9.a().a(jSONObjectA2, q9Var);
                    if (jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null && (j9VarB = b(jSONObjectOptJSONObject, sVar, jVar, nVar, context)) != null) {
                        q9Var.a(j9VarB);
                        return q9Var;
                    }
                }
                mVar = m.r;
            } else {
                if (jVar.isMediationEnabled() && (jSONObjectOptJSONObject2 = jSONObjectA.optJSONObject("mediation")) != null && (e5VarB = l5.a(this, sVar, jVar, context).b(jSONObjectOptJSONObject2, nVar)) != null) {
                    q9Var.a(e5VarB);
                    return q9Var;
                }
                mVar = m.m;
            }
        }
        nVar.a(mVar);
        return null;
    }

    @Override // com.my.target.o
    public /* bridge */ /* synthetic */ q a(String str, s sVar, q qVar, j jVar, o5.a aVar, o5 o5Var, List list, n nVar, Context context) {
        return a(str, sVar, (q9) qVar, jVar, aVar, o5Var, (List<String>) list, nVar, context);
    }

    @Override // com.my.target.l5.a
    public q a(JSONObject jSONObject, s sVar, j jVar, n nVar, Context context) {
        m mVar;
        q9 q9VarE;
        j9 j9VarB;
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("banners", jSONArray);
            new JSONObject().put(jVar.getFormat(), jSONObject2);
            q9VarE = q9.e();
            j9VarB = b(jSONObject, sVar, jVar, nVar, context);
        } catch (Throwable unused) {
            mVar = m.k;
        }
        if (j9VarB != null) {
            q9VarE.a(j9VarB);
            return q9VarE;
        }
        mVar = m.r;
        nVar.a(mVar);
        return null;
    }

    public final JSONObject a(JSONObject jSONObject, String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "standard_320x50":
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("standard");
                return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : jSONObject.optJSONObject("standard_320x50");
            case "standard_728x90":
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("standard");
                return jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2 : jSONObject.optJSONObject("standard_728x90");
            case "standard":
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("standard");
                if (jSONObjectOptJSONObject3 == null) {
                    jSONObjectOptJSONObject3 = jSONObject.optJSONObject("standard_320x50");
                }
                return jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3 : jSONObject.optJSONObject("standard_728x90");
            default:
                return jSONObject.optJSONObject(str);
        }
    }

    public final j9 b(JSONObject jSONObject, s sVar, j jVar, n nVar, Context context) {
        k9 k9VarA = k9.a(sVar, jVar, context);
        j9 j9VarNewBanner = j9.newBanner();
        if (k9VarA.a(jSONObject, j9VarNewBanner, this.f4090a, nVar)) {
            return j9VarNewBanner;
        }
        return null;
    }
}
