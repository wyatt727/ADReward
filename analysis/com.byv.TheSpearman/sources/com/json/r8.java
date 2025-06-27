package com.json;

import com.json.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class r8 {

    /* renamed from: a, reason: collision with root package name */
    private String f2098a;
    private Map<String, String> e;
    private final wa f;
    private boolean g;
    private boolean b = false;
    private boolean c = false;
    private w6 d = null;
    protected boolean h = false;

    public r8(String str, wa waVar) throws NullPointerException {
        this.f2098a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f = (wa) SDKUtils.requireNonNull(waVar, "AdListener name can't be null");
    }

    public q8 a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f2098a);
            jSONObject.put("rewarded", this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new q8((this.c || this.g) ? z8.a() : z8.a(jSONObject), this.f2098a, this.b, this.c, this.g, this.h, this.e, this.f, this.d);
    }

    public r8 a(w6 w6Var) {
        this.d = w6Var;
        return this;
    }

    public r8 a(Map<String, String> map) {
        this.e = map;
        return this;
    }

    public r8 a(boolean z) {
        this.c = z;
        return this;
    }

    public r8 b() {
        this.b = true;
        return this;
    }

    public r8 b(boolean z) {
        this.h = z;
        return this;
    }

    public r8 c(boolean z) {
        this.g = z;
        return this;
    }
}
