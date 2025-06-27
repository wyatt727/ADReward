package com.json;

import com.json.f7;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class z8 {

    /* renamed from: a, reason: collision with root package name */
    static String f2478a = "ManRewInst_";

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(q8 q8Var) {
        return (q8Var.g() ? f7.e.Banner : q8Var.l() ? f7.e.RewardedVideo : f7.e.Interstitial).toString();
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f2478a + jSONObject.optString("name");
    }
}
