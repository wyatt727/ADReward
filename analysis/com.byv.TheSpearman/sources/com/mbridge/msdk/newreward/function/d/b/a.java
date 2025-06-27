package com.mbridge.msdk.newreward.function.d.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.a.m;
import com.mbridge.msdk.e.a.o;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.u;
import com.mbridge.msdk.e.a.v;
import com.mbridge.msdk.e.a.y;
import com.mbridge.msdk.e.a.z;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.VolleyErrorUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseCampaignRequest.java */
/* loaded from: classes4.dex */
public class a extends p<JSONObject> implements r.a {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.newreward.function.d.a.b f3344a;
    protected Context b;
    protected int c;
    protected String d;
    protected String e;
    protected String f;
    private Map<String, String> g;
    private c h;
    private v i;
    private long j;
    private long k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Map<String, String> p;

    @Override // com.mbridge.msdk.e.a.p
    protected final /* synthetic */ void a(JSONObject jSONObject) {
        c cVar;
        JSONObject jSONObject2 = jSONObject;
        if (MBridgeConstans.DEBUG) {
            ad.a("BaseCampaignRequest", "deliverResponse: " + jSONObject2);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.l);
        int iOptInt = jSONObject2.optInt("status");
        if (iOptInt == 1) {
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                CampaignUnit campaignUnit = CampaignUnit.parseCampaignUnit(jSONObjectOptJSONObject, this.m);
                this.f3344a.a(jSONObjectOptJSONObject);
                this.f3344a.f(jSONObjectOptJSONObject.optString("c"));
                this.f3344a.e(jSONObjectOptJSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                this.f3344a.d(jSONObjectOptJSONObject.optString("a"));
                this.f3344a.b(jSONObjectOptJSONObject.optInt("template"));
                this.f3344a.a(System.currentTimeMillis());
                this.f3344a.c(this.m);
                this.f3344a.g(jSONObjectOptJSONObject.optString(com.mbridge.msdk.foundation.same.a.S));
                this.f3344a.a(1);
                this.f3344a.c(0);
                this.f3344a.a(campaignUnit.getRequestId());
                this.f3344a.a(campaignUnit.getEcppv());
                this.f3344a.i(this.o);
                ArrayList arrayList = new ArrayList();
                ArrayList<CampaignEx> ads = campaignUnit.getAds();
                for (CampaignEx campaignEx : ads) {
                    campaignEx.setRequestId(this.f3344a.d());
                    campaignEx.setLocalRequestId(this.n);
                    com.mbridge.msdk.newreward.function.d.a.a aVar = new com.mbridge.msdk.newreward.function.d.a.a(this.f3344a);
                    aVar.c(campaignEx.getRequestIdNotice());
                    aVar.b(campaignEx.getAppName());
                    aVar.a(campaignEx.getId());
                    aVar.a(campaignEx);
                    arrayList.add(aVar);
                    this.f3344a.h(campaignEx.getCMPTEntryUrl());
                    this.f3344a.f(campaignEx.getMof_tplid());
                    long candidateCacheTime = campaignEx.getCandidateCacheTime();
                    if (candidateCacheTime > 0) {
                        this.f3344a.b((candidateCacheTime * 1000) + System.currentTimeMillis());
                    }
                    this.f3344a.h(campaignEx.getVcn());
                    this.f3344a.i(campaignEx.getTokenRule());
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        this.f3344a.g(rewardTemplateMode.b());
                    }
                }
                this.f3344a.b(ads);
                this.f3344a.a(arrayList);
                com.mbridge.msdk.newreward.function.d.a.b bVar = this.f3344a;
                if (bVar != null && (cVar = this.h) != null) {
                    try {
                        cVar.a(bVar, this);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e);
                        }
                    }
                }
            } else {
                a(this, this.f3344a, new b(7, "data is null"));
            }
        } else {
            b bVar2 = new b(9);
            bVar2.a(jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
            bVar2.a(iOptInt);
            bVar2.c(jSONObject2.toString());
            a(this, this.f3344a, bVar2);
        }
        this.k = SystemClock.elapsedRealtime();
    }

    public a(int i, String str, String str2, String str3, long j, String str4) {
        super(0, str4);
        this.b = com.mbridge.msdk.foundation.controller.c.m().c();
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.l = UUID.randomUUID().toString();
        this.j = SystemClock.elapsedRealtime();
        this.o = str4;
        this.f3344a = new com.mbridge.msdk.newreward.function.d.a.b(this.c, this.d, this.e, this.f);
        a((r.a) this);
        c(true);
        b(true);
        com.mbridge.msdk.newreward.a.c.a.a().a(this.l, j <= 0 ? 30000L : j, new C0286a(this, this.f3344a));
    }

    public final void a(c cVar) {
        this.h = cVar;
    }

    public final void a(String str, String str2) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.g;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    public final void a(String str) {
        this.m = str;
    }

    public final void b(String str) {
        this.n = str;
    }

    public final void a(Map<String, String> map) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.g.putAll(map);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        if (this.g == null) {
            this.g = new HashMap();
        }
        return this.g;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final v b() {
        if (this.i == null) {
            this.i = new com.mbridge.msdk.e.a.f(30000, 5, 1.0f);
        }
        return this.i;
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final r<JSONObject> a(m mVar) {
        if (mVar != null) {
            try {
                if (mVar.b != null && mVar.b.length != 0) {
                    return r.a(new JSONObject(new String(mVar.b, com.mbridge.msdk.e.a.a.e.a(mVar.c))), com.mbridge.msdk.e.a.a.e.a(mVar));
                }
            } catch (UnsupportedEncodingException e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse UnsupportedEncodingException: ", e);
                }
                return r.a(new com.mbridge.msdk.e.a.g(e));
            } catch (JSONException e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse JSONException: ", e2);
                }
                return r.a(new o(e2));
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse Exception: ", e3);
                }
                return r.a(new y(e3));
            }
        }
        return r.a(new u());
    }

    @Override // com.mbridge.msdk.e.a.r.a
    public final void a(z zVar) {
        c cVar;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.l);
        if (MBridgeConstans.DEBUG) {
            ad.b("BaseCampaignRequest", "onErrorResponse: " + zVar.getMessage());
        }
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f3344a;
        if (bVar == null || (cVar = this.h) == null) {
            return;
        }
        try {
            cVar.b(bVar, this, VolleyErrorUtils.parseVolleyError(zVar));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "onError Exception: ", e);
            }
        }
    }

    @Override // com.mbridge.msdk.e.a.p
    public final void c() {
        com.mbridge.msdk.newreward.a.c.a.a().a(this.l);
        super.c();
    }

    /* compiled from: BaseCampaignRequest.java */
    /* renamed from: com.mbridge.msdk.newreward.function.d.b.a$a, reason: collision with other inner class name */
    private static final class C0286a implements a.InterfaceC0282a {

        /* renamed from: a, reason: collision with root package name */
        private final a f3345a;
        private final com.mbridge.msdk.newreward.function.d.a.b b;

        public C0286a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.f3345a = aVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0282a
        public final void a(String str, long j) {
            ad.a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j);
            f.a();
            a aVar = this.f3345a;
            if (aVar != null && !aVar.m()) {
                aVar.c();
            }
            a.a(this.f3345a, this.b, j);
        }
    }

    public final void b(String str, String str2) {
        if (this.p == null) {
            this.p = new HashMap();
        }
        this.p.put(str, str2);
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        if (this.p == null) {
            this.p = new HashMap();
        }
        return this.p;
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, b bVar2) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, bVar2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "handlerOnFailedEvent Exception: ", e);
            }
        }
    }

    static /* synthetic */ void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, long j) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, j, new b(10, "v3 is timeout"));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "onTimeout Exception: ", e);
            }
        }
    }
}
