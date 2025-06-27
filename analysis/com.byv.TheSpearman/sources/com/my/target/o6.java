package com.my.target;

import android.content.Context;
import com.my.target.l5;
import com.my.target.o5;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class o6 extends o<q6> implements l5.a {
    public static o<q6> a() {
        return new o6();
    }

    public q6 a(String str, s sVar, q6 q6Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        m mVar;
        JSONObject jSONObjectOptJSONObject;
        e5 e5VarB;
        JSONObject jSONObjectA = o.a(str, aVar, o5Var, list, nVar);
        if (jSONObjectA == null) {
            mVar = m.j;
        } else {
            if (q6Var == null) {
                q6Var = q6.f();
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectA.optJSONObject(jVar.getFormat());
            if (jSONObjectOptJSONObject2 != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("banners");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    mVar = m.r;
                } else {
                    e6 e6VarA = e6.a(sVar, jVar, context);
                    int bannersCount = jVar.getBannersCount();
                    if (bannersCount > 0) {
                        int length = jSONArrayOptJSONArray.length();
                        if (bannersCount > length) {
                            bannersCount = length;
                        }
                    } else {
                        bannersCount = 1;
                    }
                    for (int i = 0; i < bannersCount; i++) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject3 != null) {
                            d6 d6VarNewBanner = d6.newBanner();
                            e6VarA.a(jSONObjectOptJSONObject3, d6VarNewBanner, nVar);
                            q6Var.a(d6VarNewBanner);
                        }
                    }
                    if (q6Var.a() > 0) {
                        return q6Var;
                    }
                    mVar = m.i;
                }
            } else {
                if (jVar.isMediationEnabled() && (jSONObjectOptJSONObject = jSONObjectA.optJSONObject("mediation")) != null && (e5VarB = l5.a(this, sVar, jVar, context).b(jSONObjectOptJSONObject, nVar)) != null) {
                    q6Var.a(e5VarB);
                    return q6Var;
                }
                mVar = m.m;
            }
        }
        nVar.a(mVar);
        return null;
    }

    @Override // com.my.target.o
    public /* bridge */ /* synthetic */ q a(String str, s sVar, q qVar, j jVar, o5.a aVar, o5 o5Var, List list, n nVar, Context context) {
        return a(str, sVar, (q6) qVar, jVar, aVar, o5Var, (List<String>) list, nVar, context);
    }

    @Override // com.my.target.l5.a
    public q a(JSONObject jSONObject, s sVar, j jVar, n nVar, Context context) {
        q6 q6VarF = q6.f();
        e6 e6VarA = e6.a(sVar, jVar, context);
        d6 d6VarNewBanner = d6.newBanner();
        e6VarA.a(jSONObject, d6VarNewBanner, nVar);
        q6VarF.a(d6VarNewBanner);
        return q6VarF;
    }
}
