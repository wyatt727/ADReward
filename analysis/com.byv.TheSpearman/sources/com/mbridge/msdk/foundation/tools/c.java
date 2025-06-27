package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseDomainDeviceInfo.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f2985a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String j;
    public String k;
    public int m;
    public String n;
    public String o;
    public String p;
    public String r;
    public String s;
    public String t;
    public String v;
    public String q = "android";
    public String i = z.m();
    public String u = z.v();
    public String l = z.c();

    public c(Context context) {
        int iL = z.l(context);
        this.n = String.valueOf(iL);
        this.o = z.a(context, iL);
        this.j = z.f(context);
        this.e = com.mbridge.msdk.foundation.controller.c.m().b();
        this.d = com.mbridge.msdk.foundation.controller.c.m().k();
        this.t = String.valueOf(ai.f(context));
        this.s = String.valueOf(ai.e(context));
        this.r = String.valueOf(ai.d(context));
        this.v = com.mbridge.msdk.foundation.controller.c.m().i().toString();
        this.g = z.w();
        this.m = ai.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.p = t2.h.C;
        } else {
            this.p = t2.h.D;
        }
        this.f = com.mbridge.msdk.foundation.same.a.U;
        this.h = com.mbridge.msdk.foundation.same.a.g;
        this.k = z.n();
        this.c = z.d();
        this.f2985a = z.a();
        this.b = com.mbridge.msdk.foundation.controller.authoritycontroller.c.b() ? 1 : 0;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(t2.h.G, this.i);
                jSONObject.put("system_version", this.u);
                jSONObject.put("network_type", this.n);
                jSONObject.put("network_type_str", this.o);
                jSONObject.put("device_ua", this.j);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.y());
                jSONObject.put("opensdk_ver", z.t() + "");
                jSONObject.put("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
                jSONObject.put("brand", this.g);
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f2985a);
                jSONObject.put("adid_limit_dev", this.b);
            }
            jSONObject.put("plantform", this.q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.l);
                jSONObject.put("az_aid_info", this.c);
            }
            jSONObject.put("appkey", this.e);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.d);
            jSONObject.put("screen_width", this.t);
            jSONObject.put("screen_height", this.s);
            jSONObject.put("orientation", this.p);
            jSONObject.put("scale", this.r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f);
            jSONObject.put("c", this.h);
            jSONObject.put("web_env", this.v);
            jSONObject.put("f", this.k);
            jSONObject.put("misk_spt", this.m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.h.e.c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f2985a);
                jSONObject2.put("adid_limit_dev", this.b);
                jSONObject.put("dvi", x.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.a()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
