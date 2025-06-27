package com.mbridge.msdk.newreward.function.g;

import android.content.Context;
import android.os.Build;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.json.i5;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.Map;

/* compiled from: BaseRequestParameters.java */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, String> f3381a;

    protected final Map<String, String> a() {
        if (f3381a == null) {
            e eVar = new e();
            eVar.a("platform", "1");
            eVar.a("os_version", Build.VERSION.RELEASE);
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            eVar.a("package_name", z.e(contextC));
            eVar.a("app_version_name", z.p(contextC));
            eVar.a("app_version_code", z.q(contextC) + "");
            eVar.a("orientation", z.r(contextC) + "");
            eVar.a(i5.u, z.h());
            eVar.a("brand", z.w());
            eVar.a("gaid2", z.b());
            eVar.a(i5.w0, "");
            int iL = z.l(contextC);
            eVar.a("network_type", iL + "");
            eVar.a("network_str", z.a(contextC, iL));
            eVar.a("language", z.s(contextC));
            eVar.a("timezone", z.x());
            eVar.a("useragent", z.g());
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("screen_size", z.i(contextC) + "x" + z.g(contextC));
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "app_id", com.mbridge.msdk.foundation.controller.c.m().k());
            String strA = Aa.a();
            if (strA == null) {
                strA = "";
            }
            eVar.a("channel", strA);
            eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.a().d() + "");
            eVar.a("open", com.mbridge.msdk.foundation.same.a.R);
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.a()) {
                eVar.a("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                eVar.a("re_domain", "1");
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strL = com.mbridge.msdk.foundation.controller.c.m().l();
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "sign", strL);
            eVar.a("ts", jCurrentTimeMillis + "");
            if (com.mbridge.msdk.f.b.a()) {
                eVar.a(CmcdConfiguration.KEY_STREAM_TYPE, SameMD5.getMD5(strL + jCurrentTimeMillis));
            } else {
                eVar.a(CmcdConfiguration.KEY_STREAM_TYPE, SameMD5.getMD5(jCurrentTimeMillis + strL));
            }
            f3381a = eVar.a();
        }
        return f3381a;
    }
}
