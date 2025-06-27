package com.mbridge.msdk.splash.a;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseDeviceInfo.java */
/* loaded from: classes4.dex */
public class a {
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;
    public int q;
    public String c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f3468a = z.m();
    public String b = z.v();
    public String d = z.c();

    public a(Context context) {
        int iL = z.l(context);
        this.e = String.valueOf(iL);
        this.f = z.a(context, iL);
        this.g = z.f(context);
        this.h = com.mbridge.msdk.foundation.controller.c.m().b();
        this.i = com.mbridge.msdk.foundation.controller.c.m().k();
        this.j = String.valueOf(ai.f(context));
        this.k = String.valueOf(ai.e(context));
        this.m = String.valueOf(ai.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.l = t2.h.C;
        } else {
            this.l = t2.h.D;
        }
        this.n = z.n();
        this.o = z.d();
        this.p = z.a();
        this.q = com.mbridge.msdk.foundation.controller.authoritycontroller.c.b() ? 1 : 0;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(t2.h.G, this.f3468a);
                jSONObject.put("system_version", this.b);
                jSONObject.put("network_type", this.e);
                jSONObject.put("network_type_str", this.f);
                jSONObject.put("device_ua", this.g);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.y());
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.p);
                jSONObject.put("adid_limit_dev", this.q);
            }
            jSONObject.put("plantform", this.c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.d);
                jSONObject.put("az_aid_info", this.o);
            }
            jSONObject.put("appkey", this.h);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.i);
            jSONObject.put("screen_width", this.j);
            jSONObject.put("screen_height", this.k);
            jSONObject.put("orientation", this.l);
            jSONObject.put("scale", this.m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put("f", this.n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e) {
            ad.b("BaseDeviceInfo", e.getMessage());
        }
        return jSONObject;
    }
}
