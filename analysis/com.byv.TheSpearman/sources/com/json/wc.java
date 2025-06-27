package com.json;

import com.json.t2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wc {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f2432a;

    public wc(JSONObject jSONObject) {
        this.f2432a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f2432a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f2432a.optBoolean(t2.a.n, false);
    }

    public boolean c() {
        return this.f2432a.optBoolean(t2.a.o, false);
    }

    public boolean d() {
        return this.f2432a.optBoolean(t2.a.k, false);
    }

    public boolean e() {
        return this.f2432a.optBoolean(t2.a.m, false);
    }
}
