package com.mbridge.msdk.foundation.same.net.h;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.json.i5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.z;

/* compiled from: CommonRequestParamsForAdd.java */
/* loaded from: classes4.dex */
public final class f {
    public static void a(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.d);
    }

    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", z.u() + "");
            eVar.a("has_wx", z.u(context) + "");
            eVar.a("integrated_wx", z.y() + "");
            eVar.a("opensdk_ver", z.t() + "");
            eVar.a("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
            eVar.a("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
            eVar.a("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
            String strI = z.i();
            if (!TextUtils.isEmpty(strI)) {
                eVar.a("hardware", strI);
            }
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.j();
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DNT, 0) == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            eVar.a("adid_limit", z.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.c.b() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f2895a, ag.b() + "");
            eVar.a(e.b, ag.a() + "");
            eVar.a(e.g, z.n());
        }
        eVar.a("pkg_source", z.a(z.e(context), context));
        if (com.mbridge.msdk.foundation.controller.c.m().i() != null) {
            eVar.a("web_env", com.mbridge.msdk.foundation.controller.c.m().i().toString());
        }
        if (Build.VERSION.SDK_INT > 18) {
            eVar.a("http_req", "2");
        }
        g.a(eVar, context);
        a(eVar, true);
        g(eVar);
        b(eVar);
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB == null) {
            com.mbridge.msdk.c.h.a();
            gVarB = i.a();
        }
        if (gVarB.I() == 1) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        } else if (gVarB.aG()) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        }
        String strI2 = com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().i();
        if (!TextUtils.isEmpty(strI2)) {
            eVar.a("tc_string", strI2);
        }
        h(eVar);
        i(eVar);
        g.a(eVar);
    }

    private static void a(e eVar, boolean z) {
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        if (gVarB != null) {
            if (!TextUtils.isEmpty(gVarB.a()) && z) {
                eVar.a("a_stid", gVarB.a());
            }
            try {
                g.a(eVar, contextC, z, gVarB);
            } catch (Exception e) {
                ad.b("CommonRequestParamsForAdd", e.getMessage());
            }
        }
    }

    private static void g(e eVar) {
        int iS = z.s();
        if (iS != -1) {
            eVar.a("unknown_source", iS + "");
        }
    }

    public static void b(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                com.mbridge.msdk.foundation.same.a.U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                eVar.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                return;
            }
            eVar.a("c", com.mbridge.msdk.foundation.same.a.g);
        } catch (Exception e) {
            ad.b("CommonRequestParamsForAdd", e.getMessage());
        }
    }

    private static void h(e eVar) {
        String strE = z.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        eVar.a("az_aid_info", strE);
    }

    private static void i(e eVar) {
        String str = com.mbridge.msdk.f.c.f2747a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eVar.a("cronet_env", str);
    }

    public static void c(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.w);
    }

    public static void d(e eVar) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", z.u() + "");
            eVar.a("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()) + "");
            eVar.a("integrated_wx", z.y() + "");
            eVar.a("opensdk_ver", z.t() + "");
            eVar.a("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
            eVar.a("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
            eVar.a("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
            String strI = z.i();
            if (!TextUtils.isEmpty(strI)) {
                eVar.a("hardware", strI);
            }
            eVar.a("adid_limit", z.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.c.b() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.g, z.n());
        }
        g.b(eVar);
        a(eVar, false);
        g(eVar);
        b(eVar);
        h(eVar);
        i(eVar);
    }

    public static void e(e eVar) {
        if (z.q() == 0) {
            return;
        }
        eVar.a("tun", z.q() + "");
    }

    public static void f(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a(i5.u);
                eVar.a("brand");
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a("network_type");
                eVar.a("useragent");
                eVar.a(i5.R);
                eVar.a("language");
                eVar.a("network_str");
                eVar.a("os_version");
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.f2895a);
                eVar.a(e.b);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a("timezone");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a(i5.w0);
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }
}
