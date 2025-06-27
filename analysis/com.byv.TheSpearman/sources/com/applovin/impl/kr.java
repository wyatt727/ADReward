package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class kr {

    /* renamed from: a, reason: collision with root package name */
    private final ec f608a;
    private final yf b;
    private final List c;

    public kr(JSONObject jSONObject, MaxAdFormat maxAdFormat, fe feVar, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.b = new yf(jSONObject2, kVar);
        } else {
            this.b = null;
        }
        this.f608a = new ec(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, feVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.c.add(new yf(jSONObject3, kVar));
            }
        }
    }

    public ec b() {
        return this.f608a;
    }

    public yf a() {
        return this.b;
    }

    public boolean d() {
        return this.b != null;
    }

    public List c() {
        return this.c;
    }
}
