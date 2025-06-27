package com.mbridge.msdk.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: StatisticsOnNotifyListener.java */
/* loaded from: classes4.dex */
public class k extends f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f3755a;
    protected CampaignEx b;
    protected List<CampaignEx> c;
    protected boolean d;
    protected com.mbridge.msdk.videocommon.download.a e;
    protected com.mbridge.msdk.videocommon.b.c f;
    protected String g;
    protected String h;
    protected com.mbridge.msdk.video.module.a.a i;
    protected int j;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;

    public final void a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public final void a(List<CampaignEx> list) {
        this.c = list;
    }

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i, boolean z) {
        this.d = false;
        this.i = new f();
        this.j = 1;
        if (!z && campaignEx != null && an.b(str2) && aVar != null && aVar2 != null) {
            this.b = campaignEx;
            this.h = str;
            this.g = str2;
            this.e = aVar;
            this.f = cVar;
            this.i = aVar2;
            this.f3755a = true;
            this.j = i;
            this.d = false;
            return;
        }
        if (!z || campaignEx == null || !an.b(str2) || aVar2 == null) {
            return;
        }
        this.b = campaignEx;
        this.h = str;
        this.g = str2;
        this.e = aVar;
        this.f = cVar;
        this.i = aVar2;
        this.f3755a = true;
        this.j = i;
        this.d = true;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        this.i.a(i, obj);
    }

    public final void a(int i) {
        if (this.b != null) {
            if (i == 1 || i == 2) {
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, i, this.j);
            }
        }
    }

    public final void a() {
        if (!this.f3755a || this.b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.b.getId(), this.b.getRequestId(), this.b.getRequestIdNotice(), this.g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.n.f2819a : com.mbridge.msdk.foundation.entity.n.b);
        com.mbridge.msdk.foundation.same.report.h.b(nVar, com.mbridge.msdk.foundation.controller.c.m().c(), this.g);
    }

    public final void a(int i, String str) {
        if (this.b != null) {
            com.mbridge.msdk.foundation.same.report.h.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.b.getId(), this.b.getRequestId(), this.b.getRequestIdNotice(), this.g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()), i, str), com.mbridge.msdk.foundation.controller.c.m().c(), this.g);
        }
    }

    public final void b(int i) {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i);
                    }
                    noticeUrl = sb.toString();
                } else if (i == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!k.this.f3755a || k.this.b == null || !an.b(k.this.g) || com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                        return;
                    }
                    com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                    fVar.a(System.currentTimeMillis());
                    fVar.b(k.this.g);
                    fVar.a(k.this.b.getId());
                    jVarA.a(fVar);
                } catch (Throwable th) {
                    ad.a("NotifyListener", th.getMessage(), th);
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    public final void c() {
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (k.this.f3755a && k.this.b != null && an.b(k.this.g)) {
                            com.mbridge.msdk.videocommon.a.a.a().a(k.this.b, k.this.g);
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        com.mbridge.msdk.videocommon.a.a.a().c(k.this.h, k.this.b.getAdType());
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    } catch (Throwable th) {
                        ad.a("NotifyListener", th.getMessage());
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    protected final void d() {
        com.mbridge.msdk.videocommon.download.a aVar = this.e;
        if (aVar != null) {
            aVar.f(true);
        }
    }

    protected final void e() {
        CampaignEx campaignEx;
        String str;
        try {
            CampaignEx campaignEx2 = this.b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.d && !this.b.isCampaignIsFiltered()) {
                this.l = true;
                return;
            }
            if (!this.f3755a || (campaignEx = this.b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || com.mbridge.msdk.foundation.same.a.d.k == null || com.mbridge.msdk.foundation.same.a.d.k.containsKey(this.b.getOnlyImpressionURL()) || this.l) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.d.k.put(this.b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.b.getOnlyImpressionURL();
            if (this.b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.b.getCbt() + "&tmorl=" + this.j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.b.getCbt() + "&tmorl=" + this.j;
            }
            String str2 = str;
            if (!this.d || this.b.isCampaignIsFiltered()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.g, str2, false, true, com.mbridge.msdk.click.a.a.h);
                c();
            }
            this.l = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected final void f() {
        try {
            if (!this.f3755a || this.k || TextUtils.isEmpty(this.b.getImpressionURL())) {
                return;
            }
            this.k = true;
            if (this.b.isBidCampaign() && this.b != null) {
                try {
                    HashMap map = new HashMap();
                    List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.b.getCampaignUnitId(), this.b.getRequestId());
                    if (listA != null && listA.size() > 0 && listA.get(0) != null) {
                        if (listA.get(0).c() == 1) {
                            map.put("encrypt_p=", "encrypt_p=" + listA.get(0).b());
                            map.put("irlfa=", "irlfa=1");
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                String str2 = (String) entry.getValue();
                                CampaignEx campaignEx = this.b;
                                campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                                CampaignEx campaignEx2 = this.b;
                                campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                            }
                        }
                        ad.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.b.getRequestId()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            String impressionURL = this.b.getImpressionURL();
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.g, this.b.getSpareOfferFlag() == 1 ? impressionURL + "&to=1&cbt=" + this.b.getCbt() + "&tmorl=" + this.j : impressionURL + "&to=0&cbt=" + this.b.getCbt() + "&tmorl=" + this.j, false, true, com.mbridge.msdk.click.a.a.g);
            com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b);
            new Thread(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(k.this.b.getId());
                    } catch (Throwable th) {
                        ad.a("NotifyListener", th.getMessage(), th);
                    }
                }
            }).start();
            if (!this.f3755a || com.mbridge.msdk.foundation.same.a.d.j == null || TextUtils.isEmpty(this.b.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.d.a(this.g, this.b, "reward");
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    protected final void g() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f3755a || this.m || (campaignEx = this.b) == null) {
                return;
            }
            this.m = true;
            if ((campaignEx.isDynamicView() && this.d && !this.b.isCampaignIsFiltered()) || (pv_urls = this.b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.g, it.next(), false, true);
            }
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage());
        }
    }

    protected final void h() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.b.getNativeVideoTracking() == null || this.b.getNativeVideoTracking().o() == null) {
            return;
        }
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        CampaignEx campaignEx2 = this.b;
        com.mbridge.msdk.click.a.a(contextC, campaignEx2, campaignEx2.getCampaignUnitId(), this.b.getNativeVideoTracking().o(), false, false);
    }

    protected final void a(String str) {
        try {
            if (this.b != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("url", this.b.getVideoUrlEncode());
                dVar.a("reason", str);
                String noticeUrl = this.b.getNoticeUrl();
                String clickURL = this.b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        dVar.a("offer_url", clickURL);
                    }
                } else {
                    dVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000021", this.b, dVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected final void b(String str) {
        List<CampaignEx> list;
        if (this.b == null || (list = this.c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.b = this.c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("NotifyListener", e.getMessage());
            }
        }
    }
}
