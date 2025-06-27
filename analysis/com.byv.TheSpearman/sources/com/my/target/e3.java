package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.o5;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e3 extends o<f3> {

    /* renamed from: a, reason: collision with root package name */
    public final int f3957a;

    public e3(int i) {
        this.f3957a = i;
    }

    public static o<f3> a(int i) {
        return new e3(i);
    }

    public f3 a(String str, s sVar, f3 f3Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        m mVar;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectA = o.a(str, aVar, o5Var, list, nVar);
        if (jSONObjectA == null) {
            mVar = m.j;
        } else {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectA.optJSONObject(jVar.getFormat());
            if (jSONObjectOptJSONObject2 == null) {
                mVar = m.m;
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("banners");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                    mVar = m.r;
                } else {
                    c3 c3VarNewBanner = c3.newBanner();
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = jSONObjectOptJSONObject.optString("bannerID", c3VarNewBanner.getId());
                    }
                    c3VarNewBanner.setId(strOptString);
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        c3VarNewBanner.setType(strOptString2);
                    }
                    if (jSONObjectOptJSONObject.optJSONArray("statistics") != null) {
                        s8.b(sVar, jVar, context).a(c3VarNewBanner.getStatHolder(), jSONObjectOptJSONObject, strOptString, this.f3957a);
                    }
                    if (c3VarNewBanner.getStatHolder().d()) {
                        f3 f3VarD = f3.d();
                        f3VarD.a(c3VarNewBanner);
                        return f3VarD;
                    }
                    mVar = m.i;
                }
            }
        }
        nVar.a(mVar);
        return null;
    }

    @Override // com.my.target.o
    public /* bridge */ /* synthetic */ q a(String str, s sVar, q qVar, j jVar, o5.a aVar, o5 o5Var, List list, n nVar, Context context) {
        return a(str, sVar, (f3) qVar, jVar, aVar, o5Var, (List<String>) list, nVar, context);
    }
}
