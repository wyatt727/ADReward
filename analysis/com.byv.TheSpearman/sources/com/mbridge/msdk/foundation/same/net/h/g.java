package com.mbridge.msdk.foundation.same.net.h;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* compiled from: CommonRequestParamsForAddDiff.java */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static String f2896a = "";
    private static String b = "";

    public static void a(e eVar) {
    }

    public static void a(e eVar, Context context) {
    }

    public static void b(e eVar) {
    }

    public static void c(e eVar) {
    }

    public static void a(e eVar, Context context, boolean z, com.mbridge.msdk.c.g gVar) {
        if (eVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("dmt", z.o() + "");
                jSONObject.put("dmf", z.f());
                jSONObject.put("adid_limit", z.a() + "");
                jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.c.b() ? "1" : "0");
            }
            if (gVar.au() == 1 && !TextUtils.isEmpty(z.d()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("az_aid_info", z.d());
            }
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return;
            }
            if (!jSONObject.equals(b)) {
                f2896a = x.b(jSONObject.toString());
            }
            if (TextUtils.isEmpty(f2896a)) {
                return;
            }
            eVar.a("dvi", f2896a);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonRequestParamsForAddDiff", e.getMessage());
            }
        }
    }
}
