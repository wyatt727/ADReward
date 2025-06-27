package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yf {

    /* renamed from: a, reason: collision with root package name */
    private final String f1207a;
    private final String b;

    public yf(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f1207a = JsonUtils.getString(jSONObject, "id", "");
        this.b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f1207a;
    }

    public String b() {
        return this.b;
    }
}
