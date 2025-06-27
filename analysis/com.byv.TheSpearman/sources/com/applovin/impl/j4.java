package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.json.t2;
import com.my.target.ads.Reward;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f558a;
    private final JSONObject b;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + "destinationStateId=" + a() + "event=" + b() + "}";
    }

    public static j4 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), t2.h.W, null);
        if ("TOS".equalsIgnoreCase(string) && kVar.t().i() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && kVar.t().h() == null) {
            return null;
        }
        return new j4(jSONObject, kVar);
    }

    private j4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f558a = kVar;
        this.b = jSONObject;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, "title", (JSONObject) null);
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, t2.h.W, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public a c() {
        String string = JsonUtils.getString(this.b, "style", null);
        if (Reward.DEFAULT.equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        if (!"destructive".equalsIgnoreCase(string) && !"cancel".equalsIgnoreCase(string)) {
            return a.NEUTRAL;
        }
        return a.NEGATIVE;
    }

    public String b() {
        return JsonUtils.getString(this.b, NotificationCompat.CATEGORY_EVENT, null);
    }

    public String a() {
        return JsonUtils.getString(this.b, "destination_state_id", null);
    }
}
