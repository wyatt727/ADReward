package com.applovin.impl;

import com.applovin.impl.l0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xn {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1180a;
    private boolean b;
    private List c;

    public xn(com.applovin.impl.sdk.k kVar) {
        this.f1180a = kVar;
        qj qjVar = qj.J;
        this.b = ((Boolean) kVar.a(qjVar, Boolean.FALSE)).booleanValue() || t0.a(com.applovin.impl.sdk.k.k()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator();
        kVar.c(qjVar);
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        List list = this.c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public List b() {
        return this.c;
    }

    public void a() {
        this.f1180a.b(qj.J, Boolean.TRUE);
    }

    private void e() {
        com.applovin.impl.sdk.h hVarO = this.f1180a.o();
        if (this.b) {
            hVarO.b(this.c);
        } else {
            hVarO.a(this.c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public void a(List list) {
        if (list == null && this.c == null) {
            return;
        }
        if (list == null || !list.equals(this.c)) {
            this.c = list;
            e();
        }
    }

    public void a(JSONObject jSONObject) {
        boolean zL;
        String strA;
        if (this.b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        String strA2 = null;
        if (this.f1180a.y() != null) {
            com.applovin.impl.sdk.n nVarZ = this.f1180a.z();
            zL = nVarZ.G();
            l0.a aVarD = nVarZ.d();
            strA = aVarD != null ? aVarD.a() : null;
            n.c cVarH = nVarZ.h();
            if (cVarH != null) {
                strA2 = cVarH.a();
            }
        } else {
            com.applovin.impl.sdk.l lVarX = this.f1180a.x();
            zL = lVarX.L();
            strA = lVarX.f().a();
            l.b bVarB = lVarX.B();
            if (bVarB != null) {
                strA2 = bVarB.f943a;
            }
        }
        this.b = zL || JsonUtils.containsCaseInsensitiveString(strA, jSONArray) || JsonUtils.containsCaseInsensitiveString(strA2, jSONArray);
    }
}
