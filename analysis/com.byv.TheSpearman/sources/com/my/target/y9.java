package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class y9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4196a;
    public final s b;
    public final j c;
    public String d;
    public boolean e = true;

    public y9(s sVar, j jVar, Context context) {
        this.b = sVar;
        this.c = jVar;
        this.f4196a = context;
    }

    public static y9 a(s sVar, j jVar, Context context) {
        return new y9(sVar, jVar, context);
    }

    public final l7 a(JSONObject jSONObject, String str) {
        if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            return l7.b(str, jSONObject.optString(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW));
        }
        return null;
    }

    public t7 a(JSONObject jSONObject, String str, float f) {
        t7 t7VarA = t7.a(str);
        if (jSONObject.has("pvalue")) {
            float fOptDouble = (float) jSONObject.optDouble("pvalue", t7VarA.d());
            if (fOptDouble >= 0.0f && fOptDouble <= 100.0f) {
                if (f > 0.0f) {
                    t7VarA.b((fOptDouble * f) / 100.0f);
                } else {
                    t7VarA.a(fOptDouble);
                }
                return t7VarA;
            }
        }
        if (!jSONObject.has("value")) {
            return null;
        }
        float fOptDouble2 = (float) jSONObject.optDouble("value", t7VarA.e());
        if (fOptDouble2 < 0.0f) {
            return null;
        }
        t7VarA.b(fOptDouble2);
        return t7VarA;
    }

    public u9 a(JSONObject jSONObject, float f) {
        u9 u9VarA;
        String str;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("url");
        if (!da.e(strOptString2)) {
            str = "failed to parse stat url: url is empty or broken";
        } else {
            if (!TextUtils.isEmpty(strOptString)) {
                strOptString.hashCode();
                strOptString.hashCode();
                switch (strOptString) {
                    case "orientation":
                        u9VarA = a(jSONObject, strOptString2);
                        break;
                    case "playheadViewabilityValue":
                        u9VarA = b(jSONObject, strOptString2, f);
                        break;
                    case "playheadReachedValue":
                        u9VarA = a(jSONObject, strOptString2, f);
                        break;
                    default:
                        u9VarA = u9.a(strOptString, strOptString2);
                        break;
                }
                if (u9VarA != null) {
                    u9VarA.a(jSONObject.optBoolean("needDecodeUrl", u9VarA.c()));
                }
                return u9VarA;
            }
            str = "failed to parse stat: no type";
        }
        a("Required field", str);
        return null;
    }

    public void a(v9 v9Var, JSONObject jSONObject, String str, float f) {
        int length;
        u9 u9VarA;
        v9Var.a(this.b.m(), f);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("statistics");
        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            this.d = str;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (u9VarA = a(jSONObjectOptJSONObject, f)) != null) {
                    v9Var.a(u9VarA);
                }
            }
        }
    }

    public void a(Boolean bool) {
        this.e = bool.booleanValue();
    }

    public void a(String str, String str2) {
        if (this.e) {
            String str3 = this.b.f4116a;
            z4 z4VarC = z4.a(str).e(str2).a(this.c.getSlotId()).c(this.d);
            if (str3 == null) {
                str3 = this.b.b;
            }
            z4VarC.b(str3).b(this.f4196a);
        }
    }

    public final u9 b(JSONObject jSONObject, String str, float f) {
        String str2;
        int iOptInt = jSONObject.optInt("viewablePercent", -1);
        if (iOptInt < 0 || iOptInt > 100) {
            str2 = "failed to parse viewabilityStat: invalid viewable percent value";
        } else {
            if (jSONObject.has("ovv")) {
                m7 m7VarA = m7.a(str, iOptInt);
                m7VarA.b(jSONObject.optBoolean("ovv", false));
                if (jSONObject.has("pvalue")) {
                    float fOptDouble = (float) jSONObject.optDouble("pvalue", m7VarA.d());
                    if (fOptDouble >= 0.0f && fOptDouble <= 100.0f) {
                        if (f > 0.0f) {
                            m7VarA.b((fOptDouble * f) / 100.0f);
                        } else {
                            m7VarA.a(fOptDouble);
                        }
                        return m7VarA;
                    }
                }
                if (jSONObject.has("value")) {
                    float fOptDouble2 = (float) jSONObject.optDouble("value", m7VarA.e());
                    if (fOptDouble2 >= 0.0f) {
                        m7VarA.b(fOptDouble2);
                        return m7VarA;
                    }
                }
            }
            float fOptDouble3 = (float) jSONObject.optDouble("duration", -1.0d);
            if (fOptDouble3 >= 0.0f) {
                return w5.a(str, fOptDouble3, iOptInt, jSONObject.optBoolean("mrc", true));
            }
            str2 = "failed to parse viewabilityStat: no ovv or wrong duration";
        }
        a("Bad value", str2);
        return null;
    }
}
