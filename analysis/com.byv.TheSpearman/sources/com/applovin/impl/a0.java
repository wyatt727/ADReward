package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f234a;
    private final String b;
    private final lr c;
    private final List d;
    private final List e;
    private boolean f = false;

    a0(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f234a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "experiment", null);
        this.c = a(jSONObject);
        this.d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.e = a(com.json.mediationsdk.d.h, jSONObject, map, maxAdFormat, kVar);
    }

    public String c() {
        return this.f234a;
    }

    public String b() {
        return this.b;
    }

    public lr d() {
        return this.c;
    }

    public List a() {
        return this.d;
    }

    public List e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        fe feVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (feVar = (fe) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (feVar.A()) {
                    this.f = true;
                }
                arrayList.add(new kr(jSONObject2, maxAdFormat, feVar, kVar));
            }
        }
        return arrayList;
    }

    private lr a(JSONObject jSONObject) {
        return new lr(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }
}
