package com.json.mediationsdk.logger;

import com.json.mediationsdk.logger.IronSourceLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f1968a;
    private String b;
    private String c;
    private int d;

    public c(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.f1968a = ironSourceTag;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.b);
            jSONObject.put("tag", this.f1968a);
            jSONObject.put("level", this.d);
            jSONObject.put("message", this.c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
