package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class s8 extends y9 {
    public s8(s sVar, j jVar, Context context) {
        super(sVar, jVar, context);
    }

    public static s8 b(s sVar, j jVar, Context context) {
        return new s8(sVar, jVar, context);
    }

    @Override // com.my.target.y9
    public u9 a(JSONObject jSONObject, float f) {
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            a("Required field", "failed to parse stat: no type or url");
            return null;
        }
        strOptString.hashCode();
        strOptString.hashCode();
        switch (strOptString) {
            case "playheadTimerValue":
                return b(jSONObject, strOptString2);
            case "playheadViewabilityValue":
                return c(jSONObject, strOptString2);
            case "playheadReachedValue":
                t7 t7VarA = super.a(jSONObject, strOptString2, f);
                if (t7VarA == null || t7VarA.e() < 0.0f) {
                    return null;
                }
                return t7VarA;
            default:
                return super.a(jSONObject, f);
        }
    }

    public final u9 b(JSONObject jSONObject, String str) {
        if (!str.contains("[CONTENTPLAYHEAD]")) {
            a("Required field", "failed to parse researchTimerStat: no [CONTENTPLAYHEAD] macros");
            return null;
        }
        int iOptInt = jSONObject.optInt("startTimer", 0);
        int iOptInt2 = jSONObject.optInt("endTimer", 0);
        if (iOptInt < 0) {
            a("Bad value", "failed to parse researchTimerStat: wrong start timer " + iOptInt);
            return null;
        }
        if (iOptInt2 < 0) {
            a("Bad value", "failed to parse researchTimerStat: wrong end timer " + iOptInt);
            return null;
        }
        if (iOptInt2 == 0 || iOptInt < iOptInt2) {
            t8 t8VarA = t8.a(str);
            t8VarA.b(jSONObject.optInt("rate", 1));
            t8VarA.c(iOptInt);
            t8VarA.a(iOptInt2);
            return t8VarA;
        }
        a("Bad value", "failed to parse researchTimerStat: start timer (" + iOptInt + ") cannot be less than end timer (" + iOptInt + ")");
        return null;
    }

    public final u9 c(JSONObject jSONObject, String str) {
        String string;
        StringBuilder sb;
        String str2;
        int iOptInt = jSONObject.optInt("viewablePercent", -1);
        if (iOptInt < 0 || iOptInt > 100) {
            string = "failed to parse viewabilityStat: invalid viewable percent value";
        } else {
            int iOptInt2 = jSONObject.optInt("duration", -1);
            if (iOptInt2 < 0) {
                return null;
            }
            int iOptInt3 = jSONObject.optInt("startTimer", 0);
            int iOptInt4 = jSONObject.optInt("endTimer", 0);
            if (iOptInt3 < 0) {
                sb = new StringBuilder();
                str2 = "failed to parse viewabilityStat: wrong start timer ";
            } else if (iOptInt4 < 0) {
                sb = new StringBuilder();
                str2 = "failed to parse viewabilityStat: wrong end timer ";
            } else {
                if (iOptInt4 == 0 || iOptInt3 < iOptInt4) {
                    u8 u8VarB = u8.b(str, iOptInt2, iOptInt, jSONObject.optBoolean("mrc", true));
                    u8VarB.b(iOptInt3);
                    u8VarB.a(iOptInt4);
                    return u8VarB;
                }
                sb = new StringBuilder();
                sb.append("failed to parse viewabilityStat: start timer (");
                sb.append(iOptInt3);
                sb.append(") cannot be less than end timer (");
                sb.append(iOptInt4);
                sb.append(")");
                string = sb.toString();
            }
            sb.append(str2);
            sb.append(iOptInt3);
            string = sb.toString();
        }
        a("Bad value", string);
        return null;
    }
}
