package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sn {

    /* renamed from: a, reason: collision with root package name */
    private final a f1003a;
    private final Integer b;
    private final String c;
    private final String d;
    private Boolean e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i) {
            if (i == 0) {
                return TCF_VENDOR;
            }
            if (i != 1) {
                return OTHER;
            }
            return ATP_NETWORK;
        }
    }

    public a f() {
        return this.f1003a;
    }

    public Integer d() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public Boolean a() {
        return this.e;
    }

    public sn(JSONObject jSONObject, String str) {
        this.d = str;
        this.f1003a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.b = JsonUtils.getInteger(jSONObject, "id", null);
        this.c = JsonUtils.getString(jSONObject, "name", null);
    }

    public String e() {
        Boolean bool = this.e;
        return "\n" + this.d + " - " + (bool != null ? String.valueOf(bool) : y3.b().a(com.applovin.impl.sdk.k.k()));
    }

    public void a(Boolean bool) {
        this.e = bool;
    }
}
