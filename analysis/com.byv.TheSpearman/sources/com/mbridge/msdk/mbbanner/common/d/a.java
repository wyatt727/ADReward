package com.mbridge.msdk.mbbanner.common.d;

import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.e.b;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.net.URLEncoder;

/* compiled from: BannerReport.java */
/* loaded from: classes4.dex */
public final class a {
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
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), m4.M));
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
                aVar.post(0, d.f().c, k.a(sb.toString(), c.m().c(), str), new b() { // from class: com.mbridge.msdk.mbbanner.common.d.a.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str3) {
                        ad.a("", "Mraid Expand REPORT SUCCESS");
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str3) {
                        ad.a("", "Mraid Expand REPORT FAILED");
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public static void a(com.mbridge.msdk.mbbanner.common.a.a aVar, String str) {
        if (aVar != null) {
            aVar.a("2000068");
            if (e.a().b()) {
                e.a().a(aVar.b());
            } else {
                h.a(aVar.b(), c.m().c(), str);
            }
        }
    }
}
