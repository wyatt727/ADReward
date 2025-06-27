package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4018a;
    public final j b;
    public final String c;
    public final Context d;

    public j7(j jVar, String str, boolean z, Context context) {
        this.b = jVar;
        this.c = str;
        this.f4018a = z;
        this.d = context;
    }

    public static j7 a(j jVar, String str, boolean z, Context context) {
        return new j7(jVar, str, z, context);
    }

    public i7 a(i7 i7Var, JSONObject jSONObject) {
        if (i7Var == null) {
            String strOptString = jSONObject.optString("customReferenceData", null);
            if (strOptString != null && strOptString.length() > 256) {
                a("Bad value", "customReferenceData more then 256 symbols");
                strOptString = null;
            }
            i7Var = i7.a(jSONObject.optString("contentUrl", null), strOptString);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        if (jSONArrayOptJSONArray != null) {
            a(jSONArrayOptJSONArray, i7Var);
        }
        return i7Var;
    }

    public final void a(String str, String str2) {
        if (this.f4018a) {
            z4.a(str).e(str2).a(this.b.getSlotId()).b(this.c).b(this.d);
        }
    }

    public final void a(JSONArray jSONArray, i7 i7Var) {
        ga gaVarA;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                if (jSONObjectOptJSONObject.has("url")) {
                    String strOptString = jSONObjectOptJSONObject.optString("url");
                    if (jSONObjectOptJSONObject.has("vendorKey") && jSONObjectOptJSONObject.has("params")) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("vendorKey");
                        String strOptString3 = jSONObjectOptJSONObject.optString("params");
                        if (TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
                            ba.a("VerificationScriptResource has empty param: vendorKey=" + strOptString2 + ", verificationParameters=" + strOptString3);
                        } else {
                            gaVarA = ga.a(strOptString, strOptString2, strOptString3);
                        }
                    } else {
                        gaVarA = ga.a(strOptString);
                    }
                    i7Var.c.add(gaVarA);
                } else {
                    a("Required field", "VerificationScriptResource has no url");
                }
            }
        }
    }
}
