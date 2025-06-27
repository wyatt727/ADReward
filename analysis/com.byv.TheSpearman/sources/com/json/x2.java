package com.json;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class x2 {

    /* renamed from: a, reason: collision with root package name */
    private String f2436a;
    private JSONObject b;
    private String c;
    private String d;

    public x2(String str) {
        this.f2436a = str;
    }

    public x2(String str, String str2, String str3) {
        this.f2436a = str;
        this.c = str2;
        this.d = str3;
    }

    public x2(String str, JSONObject jSONObject) {
        this.f2436a = str;
        this.b = jSONObject;
    }

    public x2(String str, JSONObject jSONObject, String str2, String str3) {
        this.f2436a = str;
        this.b = jSONObject;
        this.c = str2;
        this.d = str3;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f2436a;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }
}
