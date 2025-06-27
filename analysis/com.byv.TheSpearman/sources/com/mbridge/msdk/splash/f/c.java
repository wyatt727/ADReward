package com.mbridge.msdk.splash.f;

import android.content.Context;
import android.os.Build;
import com.json.i5;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: SplashMBLoadRequest.java */
/* loaded from: classes4.dex */
public final class c extends com.mbridge.msdk.foundation.same.net.h.b {
    public c(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.h.a, com.mbridge.msdk.foundation.same.net.h.c
    public final void addExtraParams(String str, com.mbridge.msdk.foundation.same.net.h.e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a("platform", "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", z.e(this.mContext));
        eVar.a("app_version_name", z.p(this.mContext));
        eVar.a("app_version_code", z.q(this.mContext) + "");
        eVar.a("orientation", z.r(this.mContext) + "");
        eVar.a(i5.u, z.h());
        eVar.a("brand", z.w());
        eVar.a(i5.w0, "");
        eVar.a("gaid2", z.b());
        int iL = z.l(this.mContext);
        eVar.a("network_type", iL + "");
        eVar.a("network_str", z.a(this.mContext, iL) + "");
        eVar.a("language", z.s(this.mContext));
        eVar.a("timezone", z.x());
        eVar.a("useragent", z.g());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", z.i(this.mContext) + "x" + z.g(this.mContext));
        eVar.a("version_flag", "1");
        if (com.mbridge.msdk.f.b.a()) {
            eVar.a("gp_version", z.c(this.mContext));
        }
        com.mbridge.msdk.foundation.same.net.h.f.a(eVar, this.mContext);
        com.mbridge.msdk.foundation.same.net.h.f.a(eVar);
        com.mbridge.msdk.foundation.same.net.h.f.e(eVar);
    }
}
