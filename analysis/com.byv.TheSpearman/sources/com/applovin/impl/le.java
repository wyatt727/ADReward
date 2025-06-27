package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class le extends c4 {
    private static final String[] e = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, com.json.mediationsdk.d.g, "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};
    private static final String[] f = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, com.json.mediationsdk.d.g, "signal_providers", "ad_unit_signal_providers"};

    public static void a(JSONObject jSONObject) {
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, e);
            kVar.b(qj.F, jSONObjectShallowCopy.toString());
            em.a(jSONObjectShallowCopy);
        }
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            em.a(jSONObject, kVar);
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            kVar.c(qj.G);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f);
        kVar.b(qj.G, jSONObjectShallowCopy.toString());
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.I6), "1.0/mediate", kVar);
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.J6), "1.0/mediate", kVar);
    }

    public static String j(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.I6), "1.0/mediate_debug", kVar);
    }

    public static String i(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.J6), "1.0/mediate_debug", kVar);
    }
}
