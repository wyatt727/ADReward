package com.bytedance.adsdk.ugeno.EYQ;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONObject;

/* compiled from: UGExpressionParser.java */
/* loaded from: classes2.dex */
public class Td {
    public static String EYQ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return str;
        }
        try {
            if (!str.startsWith("${") || !str.endsWith("}")) {
                return str;
            }
            com.bytedance.adsdk.EYQ.mZx.EYQ EYQ = com.bytedance.adsdk.EYQ.mZx.EYQ.EYQ(str.substring(2, str.length() - 1));
            Object objEYQ = EYQ.EYQ(jSONObject);
            Log.d("ELParser", "el: " + str + "; result: " + objEYQ);
            if (objEYQ instanceof String) {
                return (String) EYQ.EYQ(jSONObject);
            }
            if (objEYQ instanceof com.bytedance.adsdk.EYQ.mZx.EYQ.EYQ) {
                return String.valueOf(Pm.EYQ((com.bytedance.adsdk.EYQ.mZx.EYQ.EYQ) objEYQ));
            }
            return String.valueOf(objEYQ);
        } catch (Throwable unused) {
            return str;
        }
    }
}
