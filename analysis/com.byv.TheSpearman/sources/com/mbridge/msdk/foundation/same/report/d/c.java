package com.mbridge.msdk.foundation.same.report.d;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.a.a.g;
import com.mbridge.msdk.e.m;
import com.mbridge.msdk.e.o;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MetricsManager.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f2927a;
    private volatile m b;
    private Map<String, d> c = new HashMap();
    private LinkedHashMap<String, b> d = new LinkedHashMap<>();
    private Map<String, d> e = new HashMap();

    public final void a(b bVar) {
        if (bVar != null) {
            try {
                if (this.c != null) {
                    d dVar = new d();
                    dVar.a("rs_rid", bVar.k());
                    dVar.a("r_stid", bVar.m());
                    dVar.a("rus_rid", bVar.l());
                    dVar.a("u_stid", bVar.t());
                    this.c.put(bVar.i(), dVar);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final d a(String str) {
        Map<String, d> map;
        d dVar = new d();
        try {
            return (TextUtils.isEmpty(str) || (map = this.c) == null || !map.containsKey(str)) ? dVar : this.c.get(str);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return dVar;
            }
            e.printStackTrace();
            return dVar;
        }
    }

    public final void a(String str, d dVar) {
        Map<String, d> map = this.e;
        if (map != null) {
            map.put(str, dVar);
        }
    }

    public final d a(int i, int i2, String str, boolean z, int i3) {
        d dVar = new d();
        try {
            dVar.a("hb", Integer.valueOf(i));
            dVar.a("adtp", Integer.valueOf(i2));
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z) {
                dVar.a("auto_load", Integer.valueOf(i3));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return dVar;
    }

    private w c() {
        o oVar;
        try {
            int iA = af.a().a("metrics", "t_m_e_t", af.a().a("t_m_e_t", 604800000));
            int iA2 = af.a().a("metrics", "t_m_e_s", af.a().a("t_m_e_s", 50));
            int iA3 = af.a().a("metrics", "t_m_r_c", af.a().a("t_m_r_c", 50));
            int iA4 = af.a().a("metrics", "t_m_t", af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS));
            int iA5 = af.a().a("metrics", "t_m_r_t_s", af.a().a("t_m_r_t_s", 2));
            int iA6 = af.a().a("metrics", "t_r_t", af.a().a("t_r_t", 1));
            if (iA6 != 0 && iA6 != 1) {
                iA6 = 0;
            }
            w.a aVarA = new w.a().e(iA).a(iA2).d(iA3).b(iA4).c(iA5).a(new com.mbridge.msdk.foundation.same.report.d()).a(com.mbridge.msdk.foundation.same.report.c.b()).a(new com.mbridge.msdk.foundation.same.report.o());
            if (iA6 == 1) {
                oVar = new o(new n((byte) 2), com.mbridge.msdk.foundation.same.net.g.d.f().i, com.mbridge.msdk.foundation.same.net.g.d.f().m);
            } else {
                oVar = new o(new g(), DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS, 0);
            }
            return aVarA.a(iA6, oVar).a();
        } catch (Exception e) {
            ad.b("EventLibraryReport", "configTrackManager error: " + e.getMessage());
            return null;
        }
    }

    private c() {
        if (this.b == null) {
            this.b = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.m().c(), c());
        }
        JSONObject jSONObjectA = com.mbridge.msdk.foundation.same.report.c.a();
        if (this.b != null) {
            this.b.a(jSONObjectA);
            this.b.a();
        }
    }

    public static c a() {
        if (f2927a == null) {
            synchronized (c.class) {
                if (f2927a == null) {
                    f2927a = new c();
                }
            }
        }
        return f2927a;
    }

    public final void a(String str, CampaignEx campaignEx, d dVar) {
        b bVar;
        String localRequestId = "";
        if (campaignEx != null) {
            try {
                localRequestId = campaignEx.getLocalRequestId();
                bVar = this.d.get(localRequestId);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            bVar = null;
        }
        if (bVar != null) {
            if (Arrays.asList(a.h).contains(str)) {
                bVar = b(bVar);
            }
        } else {
            bVar = new b();
        }
        bVar.a(campaignEx);
        bVar.c(localRequestId);
        bVar.a(str, dVar);
        b(str, bVar, null);
    }

    public final void a(String str, CampaignEx campaignEx) {
        String currentLocalRid = "";
        if (campaignEx != null) {
            try {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.d.get(currentLocalRid);
        if (bVar == null) {
            bVar = new b();
        }
        bVar.a(campaignEx);
        bVar.c(currentLocalRid);
        b(str, bVar, null);
    }

    public final void a(String str, List<CampaignEx> list, d dVar) {
        CampaignEx campaignEx;
        String currentLocalRid = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    currentLocalRid = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.d.get(currentLocalRid);
        if (bVar == null) {
            bVar = new b();
        }
        bVar.b(list);
        if (list != null && list.size() > 0) {
            bVar.c(list.get(0).getCurrentLocalRid());
        }
        bVar.a(str, dVar);
        b(str, bVar, null);
    }

    public final void a(String str, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        b(str, bVar, aVar);
    }

    public final void b(String str, d dVar) {
        try {
            b bVar = new b();
            if (dVar.b(MBridgeConstans.PROPERTIES_UNIT_ID) != null) {
                bVar.d(String.valueOf(dVar.b(MBridgeConstans.PROPERTIES_UNIT_ID)));
            }
            if (dVar.b("lrid") != null && (dVar.b("lrid") instanceof String)) {
                bVar.c(String.valueOf(dVar.b("lrid")));
            }
            bVar.a(str, dVar);
            new e().b(str, this.b, bVar, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        d dVar = new d();
        dVar.a("result", Integer.valueOf(nVar.m()));
        dVar.a("scenes", nVar.b("scenes", ""));
        dVar.a("resource_type", Integer.valueOf(nVar.A()));
        dVar.a("url", nVar.b("url", ""));
        dVar.a("reason", nVar.h());
        dVar.a("mraid_type", Integer.valueOf(nVar.y()));
        a().a(nVar.a(), campaignEx, dVar);
    }

    public final void a(String str, b bVar) {
        try {
            Map<String, d> map = this.e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.e.get(str));
            }
            new e().a(str, this.b, bVar, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void a(String str, b bVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (bVar == null) {
                bVar = new b();
            }
            d dVar = new d();
            dVar.a(CmcdConfiguration.KEY_STREAM_TYPE, Long.valueOf(System.currentTimeMillis()));
            if (campaignEx != null) {
                dVar.a("cid", campaignEx.getId());
                dVar.a("lrid", campaignEx.getLocalRequestId());
                dVar.a("rid", campaignEx.getRequestId());
                dVar.a("rid_n", campaignEx.getRequestIdNotice());
                dVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                if (!dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                }
                dVar.a("hb", Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                dVar.a("bid_tk", campaignEx.getBidToken());
            }
            if (context != null) {
                dVar.a("network_type", Integer.valueOf(z.l(context)));
            }
            bVar.a(str, dVar);
            b(str, bVar, aVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void b(String str, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            if (Arrays.asList(a.c).contains(str)) {
                bVar.m(str);
            }
            Map<String, d> map = this.e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.e.get(str));
            }
            new e().a(str, this.b, bVar, aVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final LinkedHashMap<String, b> b() {
        return this.d;
    }

    public final b b(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.d) != null && linkedHashMap.containsKey(str)) {
                return this.d.get(str);
            }
            return null;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public final void c(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.d) != null && linkedHashMap.containsKey(str)) {
                this.d.remove(str);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final b b(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            return (b) bVar.clone();
        } catch (CloneNotSupportedException e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
