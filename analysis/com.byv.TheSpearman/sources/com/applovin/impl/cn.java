package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cn extends xl {
    private final JSONObject h;
    private final JSONObject i;
    private final AppLovinAdLoadListener j;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.h, this.i, this.f1179a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.h, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.h, "vs_load_immediately", Boolean.TRUE).booleanValue();
        bm bmVar = new bm(aVar, this.f1179a, this.j);
        bmVar.c(zBooleanValue2);
        bmVar.b(zBooleanValue);
        this.f1179a.l0().a((xl) bmVar, sm.b.CACHING);
    }

    public cn(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.h = jSONObject;
        this.i = jSONObject2;
        this.j = appLovinAdLoadListener;
    }
}
