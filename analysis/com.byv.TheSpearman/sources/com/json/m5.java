package com.json;

import android.content.Context;
import com.json.environment.ContextProvider;
import com.json.i5;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class m5 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1890a = "adunit_data";

    public void a(Context context) {
        j5.a().c(context);
    }

    public void a(String str, i5.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            j5 j5VarA = j5.a();
            JSONObject jSONObjectOptJSONObject2 = j5VarA.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f1890a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            j5VarA.b(f1890a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException unused) {
        }
    }

    public void a(String str, Object obj) {
        j5.a().b(str, obj);
    }

    public void a(String str, Object obj, i5.a aVar) {
        try {
            String strName = aVar.name();
            j5 j5VarA = j5.a();
            JSONObject jSONObjectOptJSONObject = j5VarA.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f1890a);
            if (jSONObjectOptJSONObject == null) {
                j5VarA.b(f1890a, new JSONObject().put(strName, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                j5VarA.b(f1890a, jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)));
            } else {
                j5VarA.b(f1890a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException unused) {
        }
    }

    public void a(String str, JSONObject jSONObject) throws JSONException {
        j5.a().a(str, jSONObject);
    }

    public void a(Map<String, Object> map) {
        j5.a().a(map);
    }
}
