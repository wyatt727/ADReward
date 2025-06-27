package com.json.sdk.controller;

import android.content.Context;
import com.json.b6;
import com.json.ca;
import com.json.ic;
import com.json.n9;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i {
    private static final String c = "i";
    private static final String d = "getDeviceData";
    private static final String e = "deviceDataFunction";
    private static final String f = "deviceDataParams";
    private static final String g = "success";
    private static final String h = "fail";

    /* renamed from: a, reason: collision with root package name */
    private Context f2186a;
    private final b6 b = ca.h().c();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f2187a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public i(Context context) {
        this.f2186a = context;
    }

    private ic a() throws JSONException {
        ic icVar = new ic();
        icVar.b(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(this.b.c())));
        icVar.b(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(this.b.h(this.f2186a))));
        icVar.b(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(this.b.G(this.f2186a))));
        icVar.b(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(this.b.l(this.f2186a))));
        icVar.b(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(this.b.c(this.f2186a))));
        icVar.b(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(this.b.d(this.f2186a))));
        return icVar;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f2187a = jSONObject.optString(e);
        bVar.b = jSONObject.optJSONObject(f);
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    void a(String str, n9 n9Var) throws Exception {
        b bVarA = a(str);
        if (d.equals(bVarA.f2187a)) {
            n9Var.a(true, bVarA.c, a());
            return;
        }
        Logger.i(c, "unhandled API request " + str);
    }
}
