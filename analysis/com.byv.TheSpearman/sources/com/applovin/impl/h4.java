package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.json.t2;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h4 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f487a;
    protected final JSONObject b;

    public enum a {
        NONE,
        IS_AL_GDPR
    }

    public enum b {
        ALERT,
        EVENT,
        HAS_USER_CONSENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION,
        TERMS_FLOW
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "}";
    }

    public h4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f487a = kVar;
        this.b = jSONObject;
    }

    public static h4 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        if (bVarC == b.ALERT) {
            return new i4(jSONObject, kVar);
        }
        if (bVarC == b.EVENT) {
            return new k4(jSONObject, kVar);
        }
        return new h4(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.b, "id", null);
    }

    public b c() {
        return c(JsonUtils.getString(this.b, "type", null));
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("terms_flow".equalsIgnoreCase(str)) {
            return b.TERMS_FLOW;
        }
        if ("huc".equalsIgnoreCase(str)) {
            return b.HAS_USER_CONSENT;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    public boolean d() {
        return JsonUtils.getBoolean(this.b, "is_initial_state", Boolean.FALSE).booleanValue();
    }

    public a a() {
        return a(JsonUtils.getString(this.b, "decision_type", null));
    }

    protected String b(String str) {
        String strE;
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = JsonUtils.getObjectAtIndex(jSONArray, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                if (this.f487a.y() != null) {
                    strE = this.f487a.z().g().e();
                } else {
                    strE = (String) this.f487a.x().F().get("app_name");
                }
                if (StringUtils.isValidString(strE)) {
                    arrayList.add(strE);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, t2.h.W, null), arrayList);
    }

    public String a(Boolean bool) {
        String string = JsonUtils.getString(this.b, "destination_state_id", null);
        if (StringUtils.isValidString(string)) {
            return string;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getString(this.b, "destination_state_id_true", null) : JsonUtils.getString(this.b, "destination_state_id_false", null);
        }
        throw new IllegalStateException("Decision needed for state: " + string);
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        return a.NONE;
    }
}
