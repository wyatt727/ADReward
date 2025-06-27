package com.mbridge.msdk.mbnative.f.a;

import android.content.Context;
import android.os.Build;
import com.json.i5;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.h.f;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: NativeRequest.java */
/* loaded from: classes4.dex */
public final class a extends com.mbridge.msdk.foundation.same.net.h.b {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.h.a, com.mbridge.msdk.foundation.same.net.h.c
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
        if (com.mbridge.msdk.f.b.a()) {
            eVar.a("gp_version", z.c(this.mContext));
        }
        f.a(eVar, this.mContext);
        f.a(eVar);
        f.e(eVar);
    }
}
