package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CommonDeviceInfo.java */
/* loaded from: classes4.dex */
public final class a {
    public static JSONObject a() throws JSONException {
        JSONObject jSONObject;
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        try {
            jSONObject = k.a(contextC).c();
        } catch (Exception e) {
            ad.a("CommonDeviceInfo", "getCommonProperty error", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                com.mbridge.msdk.foundation.same.a.U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                jSONObject.put("c", com.mbridge.msdk.foundation.same.a.g);
            }
            jSONObject.put("open", com.mbridge.msdk.foundation.same.a.R);
            String strA = Aa.a();
            if (strA == null) {
                strA = "";
            }
            jSONObject.put("channel", strA);
            jSONObject.put("band_width", com.mbridge.msdk.foundation.same.net.a.a().d());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.a()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB == null) {
                com.mbridge.msdk.c.h.a();
                gVarB = com.mbridge.msdk.c.i.a();
            }
            JSONObject jSONObjectA = a(gVarB);
            if (jSONObjectA != null) {
                String string = jSONObjectA.toString();
                if (!TextUtils.isEmpty(string)) {
                    String strB = x.b(string);
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObject.put("dvi", strB);
                    }
                }
            }
            jSONObject.put("app_id", com.mbridge.msdk.foundation.controller.c.m().k());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(ai.l(contextC)));
            String strO = "UNKNOWN";
            if (gVarB != null) {
                strO = gVarB.o();
                jSONObject.put("a_stid", gVarB.a());
            }
            jSONObject.put("country_code", strO);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(com.mbridge.msdk.c.g gVar) {
        try {
            return k.a(com.mbridge.msdk.foundation.controller.c.m().c(), gVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
