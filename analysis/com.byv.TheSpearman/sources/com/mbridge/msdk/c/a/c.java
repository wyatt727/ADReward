package com.mbridge.msdk.c.a;

import android.content.Context;
import android.os.Build;
import com.json.i5;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.h.f;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: SettingRequest.java */
/* loaded from: classes4.dex */
public final class c extends com.mbridge.msdk.foundation.same.net.h.c {
    public c(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.h.c
    public final void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a("platform", "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", z.e(this.mContext));
        eVar.a("app_version_name", z.p(this.mContext));
        eVar.a("app_version_code", z.q(this.mContext) + "");
        eVar.a("orientation", z.r(this.mContext) + "");
        eVar.a(i5.u, z.h());
        eVar.a("brand", z.w());
        eVar.a("gaid2", z.b());
        int iL = z.l(this.mContext);
        eVar.a("network_type", iL + "");
        eVar.a("network_str", z.a(this.mContext, iL));
        eVar.a("language", z.s(this.mContext));
        eVar.a("timezone", z.x());
        eVar.a("useragent", z.g());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", z.i(this.mContext) + "x" + z.g(this.mContext));
        d.a(this.mContext, eVar);
        f.d(eVar);
    }
}
