package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* compiled from: ReportUtilDiff.java */
/* loaded from: classes4.dex */
public final class l {
    public static JSONObject a(Context context, com.mbridge.msdk.c.g gVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String strL = z.l();
            if (!TextUtils.isEmpty(strL)) {
                jSONObject.put("manufacturer", strL);
            }
            int iK = z.k();
            if (iK != -1) {
                jSONObject.put("sdkint", iK);
            }
            String strM = z.m(context);
            if (!TextUtils.isEmpty(strM)) {
                jSONObject.put("is24H", strM);
            }
            String strP = z.p();
            if (!TextUtils.isEmpty(strP)) {
                jSONObject.put("totalram", strP);
            }
            String strN = z.n(context);
            if (!TextUtils.isEmpty(strN)) {
                jSONObject.put("totalmemory", strN);
            }
            jSONObject.put("adid_limit", z.a() + "");
            jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.c.b() ? "1" : "0");
        }
        if (gVar.au() == 1 && !TextUtils.isEmpty(z.d()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", z.d());
        }
        return jSONObject;
    }
}
