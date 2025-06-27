package com.json.sdk.controller;

import android.content.Context;
import com.json.ic;
import com.json.n9;
import com.json.p0;
import com.json.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class q {
    private static final String b = "q";
    private static final String c = "getPermissions";
    private static final String d = "isPermissionGranted";
    private static final String e = "permissions";
    private static final String f = "permission";
    private static final String g = "status";
    private static final String h = "functionName";
    private static final String i = "functionParams";
    private static final String j = "success";
    private static final String k = "fail";
    private static final String l = "unhandledPermission";

    /* renamed from: a, reason: collision with root package name */
    private Context f2215a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f2216a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public q(Context context) {
        this.f2215a = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f2216a = jSONObject.optString("functionName");
        bVar.b = jSONObject.optJSONObject("functionParams");
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    void a(String str, n9 n9Var) throws Exception {
        b bVarA = a(str);
        if (c.equals(bVarA.f2216a)) {
            a(bVarA.b, bVarA, n9Var);
            return;
        }
        if (d.equals(bVarA.f2216a)) {
            b(bVarA.b, bVarA, n9Var);
            return;
        }
        Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, b bVar, n9 n9Var) throws JSONException {
        ic icVar = new ic();
        try {
            icVar.a(e, p0.a(this.f2215a, jSONObject.getJSONArray(e)));
            n9Var.a(true, bVar.c, icVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            icVar.b("errMsg", e2.getMessage());
            n9Var.a(false, bVar.d, icVar);
        }
    }

    public void b(JSONObject jSONObject, b bVar, n9 n9Var) throws JSONException {
        String str;
        boolean z;
        ic icVar = new ic();
        try {
            String string = jSONObject.getString(f);
            icVar.b(f, string);
            if (p0.d(this.f2215a, string)) {
                icVar.b("status", String.valueOf(p0.c(this.f2215a, string)));
                z = true;
                str = bVar.c;
            } else {
                icVar.b("status", l);
                str = bVar.d;
                z = false;
            }
            n9Var.a(z, str, icVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            icVar.b("errMsg", e2.getMessage());
            n9Var.a(false, bVar.d, icVar);
        }
    }
}
