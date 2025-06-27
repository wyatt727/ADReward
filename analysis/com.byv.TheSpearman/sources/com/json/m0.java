package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    private NetworkSettings f1887a;
    private JSONObject b;
    private IronSource.AD_UNIT c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public m0(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f1887a = networkSettings;
        this.b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f = iOptInt;
        this.d = iOptInt == 2;
        this.e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.c = ad_unit;
    }

    public String a() {
        return this.f1887a.getAdSourceNameForEvents();
    }

    public IronSource.AD_UNIT b() {
        return this.c;
    }

    public JSONObject c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return this.f1887a.getProviderName();
    }

    public String g() {
        return this.f1887a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f1887a;
    }

    public String i() {
        return this.f1887a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
