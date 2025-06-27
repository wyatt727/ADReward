package com.json.sdk.controller;

import android.content.Context;
import com.json.environment.StringUtils;
import com.json.ic;
import com.json.n9;
import com.json.pa;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import com.json.vd;
import com.json.wd;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class u {
    private static final String f = "u";
    private static final String g = "updateToken";
    private static final String h = "getToken";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    private wd b;
    private Context d;

    /* renamed from: a, reason: collision with root package name */
    private final String f2221a = "oneToken";
    private pa c = new pa();
    private vd e = new vd();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f2222a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public u(Context context, wd wdVar) {
        this.b = wdVar;
        this.d = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f2222a = jSONObject.optString("functionName");
        bVar.b = jSONObject.optJSONObject("functionParams");
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    private JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.e.a();
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObjectA.get(next);
            if (obj instanceof String) {
                jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
            }
        }
        return jSONObjectA;
    }

    private void a(b bVar, n9 n9Var) {
        try {
            n9Var.a(true, bVar.c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? a() : this.b.c(this.d));
        } catch (Exception e) {
            n9Var.a(false, bVar.d, e.getMessage());
        }
    }

    void a(String str, n9 n9Var) throws Exception {
        b bVarA = a(str);
        if (g.equals(bVarA.f2222a)) {
            a(bVarA.b, bVarA, n9Var);
            return;
        }
        if (h.equals(bVarA.f2222a)) {
            a(bVarA, n9Var);
            return;
        }
        Logger.i(f, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, b bVar, n9 n9Var) {
        ic icVar = new ic();
        try {
            this.c.a(jSONObject);
            this.b.a(jSONObject);
            n9Var.a(true, bVar.c, icVar);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i(f, "updateToken exception " + e.getMessage());
            n9Var.a(false, bVar.d, icVar);
        }
    }
}
