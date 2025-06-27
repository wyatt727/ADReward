package com.json.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.json.ic;
import com.json.n9;
import com.json.ra;
import com.json.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class o {
    private static final String c = "o";
    private static final String d = "activate";
    private static final String e = "startSession";
    private static final String f = "finishSession";
    private static final String g = "impressionOccurred";
    private static final String h = "getOmidData";
    private static final String i = "omidFunction";
    private static final String j = "omidParams";
    private static final String k = "success";
    private static final String l = "fail";
    private static final String m = "%s | unsupported OMID API";

    /* renamed from: a, reason: collision with root package name */
    private final Context f2206a;
    private final ra b = new ra();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f2207a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public o(Context context) {
        this.f2206a = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f2207a = jSONObject.optString(i);
        bVar.b = jSONObject.optJSONObject(j);
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(String str, n9 n9Var) throws Exception {
        b bVarA = a(str);
        ic icVar = new ic();
        JSONObject jSONObject = bVarA.b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                icVar.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = bVarA.f2207a;
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (str2.equals(h)) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (str2.equals(f)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (str2.equals(g)) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (str2.equals(e)) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    this.b.d(bVarA.b);
                } else if (c2 == 2) {
                    this.b.b(bVarA.b);
                } else if (c2 == 3) {
                    this.b.c(bVarA.b);
                } else if (c2 != 4) {
                    throw new IllegalArgumentException(String.format(m, bVarA.f2207a));
                }
                n9Var.a(true, bVarA.c, icVar);
            }
            this.b.a(this.f2206a);
            icVar = this.b.a();
            n9Var.a(true, bVarA.c, icVar);
        } catch (Exception e2) {
            icVar.b("errMsg", e2.getMessage());
            Logger.i(c, "OMIDJSAdapter " + bVarA.f2207a + " Exception: " + e2.getMessage());
            n9Var.a(false, bVarA.d, icVar);
        }
    }
}
