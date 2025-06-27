package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.json.i5;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventLibraryCommon.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2923a = "c";

    public static JSONObject a() {
        return a.a();
    }

    public static com.mbridge.msdk.e.f b() {
        return new com.mbridge.msdk.e.f() { // from class: com.mbridge.msdk.foundation.same.report.c.1
            @Override // com.mbridge.msdk.e.f
            public final boolean a(com.mbridge.msdk.e.e eVar) throws Exception {
                return c.a(eVar);
            }
        };
    }

    public static com.mbridge.msdk.e.h c() {
        return new com.mbridge.msdk.e.h() { // from class: com.mbridge.msdk.foundation.same.report.c.2
            @Override // com.mbridge.msdk.e.h
            public final JSONObject a(com.mbridge.msdk.e.e eVar) throws JSONException {
                if (eVar == null) {
                    return null;
                }
                JSONObject jSONObjectD = eVar.d();
                if (jSONObjectD == null) {
                    jSONObjectD = new JSONObject();
                }
                try {
                    jSONObjectD.put(t2.h.W, eVar.a());
                    Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                    int iL = z.l(contextC);
                    if (!jSONObjectD.has("network_type")) {
                        jSONObjectD.put("network_type", iL);
                        jSONObjectD.put("network_str", z.a(contextC, iL));
                    }
                    if (!jSONObjectD.has(CmcdConfiguration.KEY_STREAM_TYPE)) {
                        jSONObjectD.put(CmcdConfiguration.KEY_STREAM_TYPE, System.currentTimeMillis());
                    }
                    String strOptString = jSONObjectD.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        String str = com.mbridge.msdk.foundation.controller.c.b.get(strOptString);
                        jSONObjectD.put("u_stid", str != null ? str : "");
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) && !jSONObjectD.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObjectD.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g) && !jSONObjectD.has("c")) {
                        jSONObjectD.put("c", com.mbridge.msdk.foundation.same.a.g);
                    }
                } catch (Exception e) {
                    ad.b(c.f2923a, e.getMessage());
                }
                return jSONObjectD;
            }
        };
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove(i5.u);
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove(i5.R);
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove("os_version");
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.h.e.f2895a);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.h.e.b);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove(i5.w0);
        jSONObject.remove("gaid2");
        jSONObject.remove("oaid");
        jSONObject.remove("az_aid_info");
    }

    static /* synthetic */ boolean a(com.mbridge.msdk.e.e eVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.a())) {
            return false;
        }
        String strA = eVar.a();
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB == null) {
            return true;
        }
        return b.a(gVarB, strA);
    }
}
