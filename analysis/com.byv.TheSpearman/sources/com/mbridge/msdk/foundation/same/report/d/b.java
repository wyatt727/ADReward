package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MetricsData.java */
/* loaded from: classes4.dex */
public final class b implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2926a;
    private Map<String, Map<String, String>> b;
    private Map<String, Map<String, String>> c;
    private Map<String, Long> d;
    private com.mbridge.msdk.foundation.c.b e;
    private String f;
    private List<CampaignEx> g;
    private String h;
    private int i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private CampaignEx x;
    private List<CampaignEx> y;

    public b() {
        this.f2926a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.r = -1;
        this.t = false;
        this.v = false;
    }

    public b(boolean z) {
        this.f2926a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.r = -1;
        this.t = false;
        this.v = false;
        this.f2926a = z;
    }

    public final boolean a() {
        return this.f2926a;
    }

    public final void a(boolean z) {
        this.t = z;
    }

    public final void a(int i) {
        this.r = i;
    }

    public final int b() {
        return this.r;
    }

    public final void a(String str) {
        this.q = str;
    }

    public final String c() {
        return this.q;
    }

    public final String d() {
        return this.p;
    }

    public final void b(String str) {
        this.p = str;
    }

    public final List<CampaignEx> e() {
        return this.g;
    }

    public final void a(List<CampaignEx> list) {
        this.g = list;
    }

    public final String f() {
        return this.f;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final CampaignEx g() {
        return this.x;
    }

    public final void a(CampaignEx campaignEx) {
        this.x = campaignEx;
    }

    public final List<CampaignEx> h() {
        return this.y;
    }

    public final void b(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.y = list;
    }

    public final String i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.h)) {
            return this.h;
        }
        try {
            if (TextUtils.isEmpty(this.h)) {
                String str = this.f + this.q;
                Map<String, Map<String, String>> map2 = this.b;
                if (map2 != null && map2.containsKey(str) && (map = this.b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return this.h;
    }

    public final void d(String str) {
        this.h = str;
    }

    public final int j() {
        return this.i;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final String k() {
        return this.k;
    }

    public final void f(String str) {
        this.k = str;
    }

    public final String l() {
        return this.l;
    }

    public final void g(String str) {
        this.l = str;
    }

    public final String m() {
        return this.n;
    }

    public final void h(String str) {
        this.n = str;
    }

    public final int n() {
        return this.s;
    }

    public final void c(int i) {
        this.s = i;
    }

    public final void i(String str) {
        this.o = str;
    }

    public final Map<String, String> j(String str) {
        int iF;
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.foundation.c.b bVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d dVar = new d();
        try {
            this.q = str;
            dVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(i())) {
                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, i());
            }
            int i = this.i;
            if (i != 0) {
                dVar.a("adtp", Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(this.o)) {
                dVar.a("hb", this.o);
            }
            if (!TextUtils.isEmpty(this.j)) {
                dVar.a("bid_tk", this.j);
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.a(t2.h.W, str);
            }
            if (Arrays.asList(a.f2925a).contains(str)) {
                dVar.a("from_cache", this.t ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVar2 = this.e) != null) {
                dVar.a("type", Integer.valueOf(bVar2.f()));
                dVar.a("reason", bVar2.b());
                if (!TextUtils.isEmpty(bVar2.h())) {
                    dVar.a("reason_d", bVar2.h());
                    dVar.a("type_d", Integer.valueOf(bVar2.g()));
                }
            }
            if ("2000048".contains(str) && (bVar = this.e) != null && !TextUtils.isEmpty(bVar.h())) {
                dVar.a("type", Integer.valueOf(bVar.g()));
                dVar.a("reason", bVar.h());
            }
            if ("2000126".equals(this.q)) {
                String str2 = this.j;
                g gVarA = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (TextUtils.isEmpty(str2)) {
                    iF = gVarA.ar();
                } else {
                    iF = gVarA.F();
                }
                String strA = com.mbridge.msdk.foundation.same.net.g.d.f().a(str2, iF);
                String strA2 = TextUtils.isEmpty(strA) ? "" : ao.a(strA);
                dVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.c.e.a().a(strA2)));
                dVar.a("dns_hs", strA2);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return dVar.a();
    }

    public final void a(String str, d dVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map2 = this.b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.b.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.b.put(str2, dVar.a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void a(String str, d dVar, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f + "_" + i + "_" + str;
            Map<String, Map<String, String>> map2 = this.c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.c.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.c.put(str2, dVar.a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map = this.b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.b.remove(str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final long l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l = this.d.get(str);
            return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e.printStackTrace();
            return 0L;
        }
    }

    public final void m(String str) {
        if (this.d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public final com.mbridge.msdk.foundation.c.b o() {
        return this.e;
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        this.e = bVar;
    }

    public final Map<String, Map<String, String>> p() {
        return this.b;
    }

    public final Map<String, Map<String, String>> q() {
        return this.c;
    }

    public final boolean r() {
        return this.u;
    }

    public final void b(boolean z) {
        this.u = z;
    }

    public final boolean s() {
        return this.v;
    }

    public final void c(boolean z) {
        this.v = z;
    }

    public final void d(boolean z) {
        this.w = z;
    }

    public final String t() {
        return this.m;
    }

    public final void n(String str) {
        this.m = str;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
