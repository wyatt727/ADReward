package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f709a;
    private final String b;
    private final boolean c;

    n6(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f709a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.c = zp.a(list);
        } else {
            this.c = zp.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String b() {
        return this.f709a;
    }

    public String a() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || zp.a(str2, str) != 1) {
            return str3 == null || zp.a(str3, str) != -1;
        }
        return false;
    }
}
