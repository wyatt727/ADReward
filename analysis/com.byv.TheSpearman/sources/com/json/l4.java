package com.json;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class l4 {

    /* renamed from: a, reason: collision with root package name */
    private int f1869a;
    private long b;
    private JSONObject c;

    public l4(int i, long j, JSONObject jSONObject) {
        this.f1869a = i;
        this.b = j;
        if (jSONObject == null) {
            this.c = new JSONObject();
        } else {
            this.c = jSONObject;
        }
    }

    public l4(int i, JSONObject jSONObject) {
        this.b = -1L;
        this.f1869a = i;
        this.b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.c = new JSONObject();
        } else {
            this.c = jSONObject;
        }
    }

    public String a() {
        return this.c.toString();
    }

    public void a(int i) {
        this.f1869a = i;
    }

    public void a(String str, Object obj) throws JSONException {
        try {
            this.c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONObject b() {
        return this.c;
    }

    public int c() {
        return this.f1869a;
    }

    public long d() {
        return this.b;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }
}
