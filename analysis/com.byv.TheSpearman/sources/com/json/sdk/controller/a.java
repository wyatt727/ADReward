package com.json.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.json.e7;
import com.json.ic;
import com.json.ie;
import com.json.n9;
import com.json.qe;
import com.json.z6;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a implements z6 {
    private static final String d = "loadWithUrl";
    private static final String e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    public static final String m = "errMsg";
    private static final String n = "%s | unsupported AdViews API";

    /* renamed from: a, reason: collision with root package name */
    private qe f2145a;
    private e7 b = e7.a();
    private Context c;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f2146a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f2146a = jSONObject.optString("functionName");
        bVar.b = jSONObject.optJSONObject("functionParams");
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    public void a(qe qeVar) {
        this.f2145a = qeVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(String str, n9 n9Var) throws Exception {
        b bVarA = a(str);
        ic icVar = new ic();
        try {
            String str2 = bVarA.f2146a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f)) {
                        c = 2;
                        break;
                    }
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1491535759:
                    if (str2.equals(g)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.b.a(this, bVarA.b, this.c, bVarA.c, bVarA.d);
                return;
            }
            if (c == 1) {
                this.b.d(bVarA.b, bVarA.c, bVarA.d);
                return;
            }
            if (c == 2) {
                this.b.c(bVarA.b, bVarA.c, bVarA.d);
            } else if (c == 3) {
                this.b.a(bVarA.b, bVarA.c, bVarA.d);
            } else {
                if (c != 4) {
                    throw new IllegalArgumentException(String.format(n, bVarA.f2146a));
                }
                this.b.b(bVarA.b, bVarA.c, bVarA.d);
            }
        } catch (Exception e2) {
            icVar.b("errMsg", e2.getMessage());
            String strC = this.b.c(bVarA.b);
            if (!TextUtils.isEmpty(strC)) {
                icVar.b("adViewId", strC);
            }
            n9Var.a(false, bVarA.d, icVar);
        }
    }

    @Override // com.json.z6
    public void a(String str, String str2, String str3) {
        a(str, ie.a(str2, str3));
    }

    @Override // com.json.z6
    public void a(String str, JSONObject jSONObject) {
        if (this.f2145a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f2145a.a(str, jSONObject);
    }
}
