package com.json.sdk.controller;

import com.json.b5;
import com.json.db;
import com.json.g7;
import com.json.n9;
import com.json.o7;
import com.json.o9;
import com.json.p9;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.z4;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f2188a;
    private final b5 b;

    class a implements db {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p9 f2189a;
        final /* synthetic */ o9 b;

        a(p9 p9Var, o9 o9Var) {
            this.f2189a = p9Var;
            this.b = o9Var;
        }

        @Override // com.json.db
        public void a(o7 o7Var) {
            try {
                p9 p9Var = this.f2189a;
                o9 o9Var = this.b;
                p9Var.b(o9Var, j.this.a(o9Var, o7Var.a()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.json.db
        public void a(o7 o7Var, g7 g7Var) {
            try {
                p9 p9Var = this.f2189a;
                o9 o9Var = this.b;
                p9Var.a(o9Var, j.this.a(o9Var, g7Var.b()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    j(String str, b5 b5Var) {
        this.f2188a = str;
        this.b = b5Var;
    }

    private db a(o9 o9Var, p9 p9Var) {
        return new a(p9Var, o9Var);
    }

    private o7 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(z4.c.d)) {
            return new o7(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(z4.c.d)));
        }
        throw new Exception(z4.a.b);
    }

    private JSONObject a(o9 o9Var, long j) {
        try {
            return o9Var.e().put("result", j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(o9 o9Var, String str) {
        try {
            return o9Var.e().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(o9 o9Var, JSONObject jSONObject) {
        try {
            return o9Var.e().put("result", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private o7 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(z4.c.c) || !jSONObject.has(z4.c.b)) {
            throw new Exception(z4.a.f2473a);
        }
        String string = jSONObject.getString(z4.c.c);
        return new o7(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(z4.c.b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(JSONObject jSONObject, n9 n9Var) {
        JSONObject jSONObjectA;
        JSONObject jSONObjectA2;
        o9 o9Var = new o9(jSONObject);
        p9 p9Var = new p9(n9Var);
        try {
            String strB = o9Var.b();
            JSONObject jSONObjectC = o9Var.c();
            o7 o7VarB = b(jSONObjectC, this.f2188a);
            IronSourceStorageUtils.ensurePathSafety(o7VarB, this.f2188a);
            char c = 65535;
            switch (strB.hashCode()) {
                case -2073025383:
                    if (strB.equals(z4.b.f2474a)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1137024519:
                    if (strB.equals(z4.b.c)) {
                        c = 2;
                        break;
                    }
                    break;
                case -318115535:
                    if (strB.equals(z4.b.e)) {
                        c = 4;
                        break;
                    }
                    break;
                case 537556755:
                    if (strB.equals(z4.b.f)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1764172231:
                    if (strB.equals(z4.b.b)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1953259713:
                    if (strB.equals(z4.b.d)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.b.a(o7VarB, jSONObjectC.optString(z4.c.f2475a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(o9Var, p9Var));
                return;
            }
            if (c == 1) {
                this.b.a(o7VarB);
                jSONObjectA = o7VarB.a();
            } else if (c == 2) {
                this.b.b(o7VarB);
                jSONObjectA = o7VarB.a();
            } else if (c == 3) {
                jSONObjectA = this.b.c(o7VarB);
            } else if (c == 4) {
                jSONObjectA2 = a(o9Var, this.b.d(o7VarB));
                p9Var.b(o9Var, jSONObjectA2);
            } else {
                if (c != 5) {
                    return;
                }
                this.b.a(o7VarB, jSONObjectC.optJSONObject(z4.c.g));
                jSONObjectA = o7VarB.a();
            }
            jSONObjectA2 = a(o9Var, jSONObjectA);
            p9Var.b(o9Var, jSONObjectA2);
        } catch (Exception e) {
            p9Var.a(o9Var, a(o9Var, e.getMessage()));
        }
    }
}
