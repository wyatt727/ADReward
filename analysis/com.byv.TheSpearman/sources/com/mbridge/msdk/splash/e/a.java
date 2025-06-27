package com.mbridge.msdk.splash.e;

import android.content.Context;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.e.b;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.net.URLEncoder;

/* compiled from: SplashReport.java */
/* loaded from: classes4.dex */
public final class a {
    public static void a(Context context, CampaignEx campaignEx, String str, String str2, long j, int i) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    n nVar = new n();
                    nVar.f(campaignEx.getRequestId());
                    nVar.g(campaignEx.getRequestIdNotice());
                    nVar.e(campaignEx.getId());
                    nVar.b(i);
                    nVar.l(String.valueOf(System.currentTimeMillis() - j));
                    nVar.n("");
                    nVar.h(str2);
                    nVar.d("6");
                    nVar.d(n.f2819a);
                    h.b(nVar, str, campaignEx);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str, CampaignEx campaignEx) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        n nVar = new n("2000061", campaignEx.getId(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), str, z.l(c.m().c()));
        nVar.d(n.f2819a);
        h.b(nVar, c.m().c(), str);
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(c.m().c());
            StringBuilder sb = new StringBuilder();
            if (campaignEx.isBidCampaign()) {
                sb.append("hb=");
                sb.append(1);
                sb.append(t2.i.c);
            }
            sb.append(t2.h.W);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("2000070", m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), m4.M));
            sb.append(t2.i.c);
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), m4.M));
            sb.append(t2.i.c);
            sb.append("cid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getId(), m4.M));
            sb.append(t2.i.c);
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str, m4.M));
            sb.append(t2.i.c);
            sb.append(CampaignEx.JSON_KEY_CLICK_URL);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str2, m4.M));
            sb.append(t2.i.c);
            sb.append("network_type");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(String.valueOf(z.l(c.m().c())), m4.M));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, d.f().c, k.a(sb.toString(), c.m().c(), str), new b() { // from class: com.mbridge.msdk.splash.e.a.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str3) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str3) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public static void a(CampaignEx campaignEx, String str, String str2) {
        a(campaignEx, str, 2, str2);
    }

    public static void a(CampaignEx campaignEx, String str) {
        a(campaignEx, "", 1, str);
    }

    private static void a(CampaignEx campaignEx, String str, int i, String str2) {
        a(com.mbridge.msdk.splash.a.c.a().c(campaignEx.getId()).b(str2).d(campaignEx.getRequestId()).g(campaignEx.getRequestIdNotice()).f(str).b(i).a(campaignEx.isBidCampaign()), str2);
    }

    private static void a(com.mbridge.msdk.splash.a.c cVar, String str) {
        if (cVar != null) {
            cVar.a("2000068");
            if (e.a().b()) {
                e.a().a(cVar.b());
            } else {
                h.a(cVar.b(), c.m().c(), str);
            }
        }
    }

    public static void a(com.mbridge.msdk.splash.a.c cVar, String str, int i) {
        if (cVar != null) {
            cVar.a("2000069");
            cVar.a(i);
            if (e.a().b()) {
                e.a().a(cVar.b());
            } else {
                h.a(cVar.b(), c.m().c(), str);
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().l() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
    }

    public static void b(CampaignEx campaignEx, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(c.m().c());
            StringBuilder sb = new StringBuilder();
            sb.append(t2.h.W);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("2000092", m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), m4.M));
            sb.append(t2.i.c);
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), m4.M));
            sb.append(t2.i.c);
            sb.append("cid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getId(), m4.M));
            sb.append(t2.i.c);
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str, m4.M));
            sb.append(t2.i.c);
            sb.append("network_type");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(String.valueOf(z.l(c.m().c())), m4.M));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, d.f().c, k.a(sb.toString(), c.m().c(), str), new b() { // from class: com.mbridge.msdk.splash.e.a.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str2) {
                        ad.a("", "FLBClick REPORT SUCCESS");
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str2) {
                        ad.a("", "FLBClick REPORT FAILED");
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
