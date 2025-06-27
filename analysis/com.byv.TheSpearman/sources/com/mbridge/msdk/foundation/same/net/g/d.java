package com.mbridge.msdk.foundation.same.net.g;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.e.o;
import com.mbridge.msdk.e.t;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: RequestUrlUtil.java */
/* loaded from: classes4.dex */
public final class d {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    private final String P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;

    /* renamed from: a, reason: collision with root package name */
    public String f2891a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private boolean ae;
    private int af;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public ArrayList<String> t;
    public int u;
    public int v;
    public ArrayList<String> w;
    public String x;
    public String y;
    public String z;

    private d() {
        this.P = "RequestUrlUtil";
        this.f2891a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.m = 9377;
        this.n = 9377;
        this.o = 9988;
        this.p = 9377;
        this.q = false;
        this.r = false;
        this.s = 1;
        this.t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.u = 0;
        this.v = 0;
        this.w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.R = "/bid";
        this.x = this.Q + this.R;
        this.S = "/sdk/customid";
        this.y = this.h + this.S;
        this.z = this.l + this.S;
        this.T = "/image";
        this.A = this.d + this.T;
        this.U = "/load";
        this.B = this.Q + this.U;
        this.V = "/mapping";
        this.C = this.h + this.V;
        this.D = this.l + this.V;
        this.W = "";
        this.E = this.g + this.W;
        this.X = "/batchPaidEvent";
        this.F = this.g + this.X;
        this.Y = "/setting";
        this.G = this.h + this.Y;
        this.H = this.l + this.Y;
        this.Z = "/rewardsetting";
        this.I = this.h + this.Z;
        this.J = this.l + this.Z;
        this.aa = "/appwall/setting";
        this.K = this.h + this.aa;
        this.L = this.l + this.aa;
        this.ab = "/openapi/ad/v3";
        this.M = this.d + this.ab;
        this.ac = "/openapi/ad/v4";
        this.N = this.d + this.ac;
        this.ad = "/openapi/ad/v5";
        this.O = this.d + this.ad;
        this.ae = true;
        this.af = 0;
    }

    public final boolean a() {
        try {
            if (!this.r) {
                ArrayList<String> arrayList = this.t;
                if (arrayList != null && this.u <= arrayList.size() - 1) {
                    this.h = this.t.get(this.u);
                    b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.w;
                if (arrayList2 != null && this.v <= arrayList2.size() - 1) {
                    if (!b(this.w.get(this.v))) {
                        this.l = this.w.get(this.v);
                        c();
                    }
                    return true;
                }
            }
            if (this.q) {
                this.u = 0;
                this.v = 0;
            }
            return false;
        } catch (Throwable th) {
            ad.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public final void b() {
        this.G = this.h + this.Y;
        this.y = this.h + this.S;
        this.I = this.h + this.Z;
        this.C = this.h + this.V;
        this.K = this.h + this.aa;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    public final void c() {
        this.H = this.l + this.Y;
        this.z = this.l + this.S;
        this.J = this.l + this.Z;
        this.D = this.l + this.V;
        this.L = this.l + this.aa;
    }

    public final String a(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e) {
            ad.b("RequestUrlUtil", e.getMessage());
        }
        return i % 2 == 0 ? this.O : this.M;
    }

    public final String a(boolean z, String str) {
        if (z) {
            if (this.B.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.B.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.B.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.x.replace(JsonUtils.EMPTY_JSON, "");
    }

    public final int d() {
        return this.af;
    }

    public final void a(int i) {
        this.af = i;
    }

    public final void e() {
        HashMap<String, String> mapG;
        com.mbridge.msdk.c.d dVarC;
        o oVar;
        g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB != null) {
            com.mbridge.msdk.c.a aVarN = gVarB.n();
            if (aVarN != null) {
                this.k = aVarN.f();
                this.o = aVarN.g();
                this.g = aVarN.e();
                this.F = this.g + this.X;
            }
            com.mbridge.msdk.c.d dVarC2 = gVarB.C();
            if (dVarC2 != null) {
                this.j = dVarC2.d();
                this.n = dVarC2.e();
                this.e = dVarC2.c();
                this.E = this.e + this.W;
                if (gVarB != null && (dVarC = gVarB.C()) != null && dVarC.a() != 1) {
                    int iA = af.a().a("monitor", "type", af.a().a("t_r_t", 1));
                    if (iA != 0 && iA != 1) {
                        iA = 0;
                    }
                    w.a aVarA = new w.a().a(new com.mbridge.msdk.foundation.same.report.d()).a(new com.mbridge.msdk.foundation.same.report.o());
                    if (iA == 1) {
                        oVar = new o(new n((byte) 2), a.f2892a.j, a.f2892a.n);
                    } else {
                        oVar = new o(new com.mbridge.msdk.e.a.a.g(), a.f2892a.E, 0);
                    }
                    t.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), aVarA.a(iA, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 2)).a(), dVarC.b() * 1000, com.mbridge.msdk.foundation.same.report.c.a());
                }
            }
            this.r = gVarB.ap() == 2;
            this.s = gVarB.ap();
            this.ae = !gVarB.y(2);
            if (gVarB.G() != null && gVarB.G().size() > 0 && (mapG = gVarB.G()) != null && mapG.size() > 0) {
                if (mapG.containsKey("v") && !TextUtils.isEmpty(mapG.get("v")) && b(mapG.get("v"))) {
                    this.d = mapG.get("v");
                    this.M = this.d + this.ab;
                    this.N = this.d + this.ac;
                    this.O = this.d + this.ad;
                    this.A = this.d + this.T;
                }
                if (mapG.containsKey("hb") && !TextUtils.isEmpty(mapG.get("hb")) && b(mapG.get("hb"))) {
                    this.Q = mapG.get("hb");
                    this.x = this.Q + this.R;
                    this.B = this.Q + this.U;
                }
                if (mapG.containsKey("lg") && !TextUtils.isEmpty(mapG.get("lg"))) {
                    String str = mapG.get("lg");
                    if (b(str)) {
                        this.c = str;
                    } else {
                        this.i = str;
                    }
                }
                if (mapG.containsKey("lgt") && !TextUtils.isEmpty(mapG.get("lgt"))) {
                    String str2 = mapG.get("lgt");
                    if (b(str2)) {
                        String strC = c(str2);
                        if (!TextUtils.isEmpty(strC)) {
                            this.i = strC;
                        }
                    } else {
                        this.i = str2;
                    }
                }
            }
            String strY = gVarB.y();
            if (!TextUtils.isEmpty(strY)) {
                this.h = strY;
                b();
                this.t.add(0, strY);
            }
            String strZ = gVarB.z();
            if (TextUtils.isEmpty(strZ)) {
                return;
            }
            this.l = strZ;
            c();
            this.w.add(0, strZ);
        }
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            ad.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    public static d f() {
        return a.f2892a;
    }

    /* compiled from: RequestUrlUtil.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f2892a = new d();
    }

    public final String a(String str) {
        return a.f2892a.a(str, 1);
    }
}
