package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {
    public static void a(com.apm.insight.entity.a aVar, Header header, CrashType crashType) throws JSONException {
        if (aVar != null) {
            a(aVar.h(), header, crashType);
        }
    }

    public static void a(JSONObject jSONObject, Header header, CrashType crashType) throws JSONException {
        if (jSONObject == null || crashType == null) {
            return;
        }
        long jOptLong = jSONObject.optLong("crash_time");
        String strA = com.apm.insight.i.c().a();
        if (jOptLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            String str = "android__" + strA + "_" + jOptLong + "_" + crashType;
            if (header == null || (jSONObject = header.f()) != null) {
                jSONObject.put("unique_key", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
