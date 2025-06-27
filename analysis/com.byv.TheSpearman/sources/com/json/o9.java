package com.json;

import com.json.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class o9 {

    /* renamed from: a, reason: collision with root package name */
    private String f2045a;
    private JSONObject b;
    private String c;
    private String d;

    public o9(JSONObject jSONObject) {
        this.f2045a = jSONObject.optString(t2.f.b);
        this.b = jSONObject.optJSONObject(t2.f.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(t2.f.e);
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f2045a;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(t2.f.b, this.f2045a);
            jSONObject.put(t2.f.c, this.b);
            jSONObject.put("success", this.c);
            jSONObject.put(t2.f.e, this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
