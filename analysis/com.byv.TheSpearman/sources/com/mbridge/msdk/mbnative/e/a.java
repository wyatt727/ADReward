package com.mbridge.msdk.mbnative.e;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import java.util.List;

/* compiled from: NativeReport.java */
/* loaded from: classes4.dex */
public final class a {
    public static void a(final Context context, List<Campaign> list, String str) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.size() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000048&");
            stringBuffer.append("st=" + System.currentTimeMillis() + t2.i.c);
            if (list != null && list.size() > 0) {
                stringBuffer.append("cid=" + list.get(0).getId() + t2.i.c);
            }
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str + t2.i.c);
            if (list != null && list.size() > 1) {
                CampaignEx campaignEx = (CampaignEx) list.get(0);
                if (campaignEx.isBidCampaign()) {
                    stringBuffer.append("hb=");
                    stringBuffer.append(1);
                    stringBuffer.append(t2.i.c);
                }
                if (ai.c(campaignEx)) {
                    stringBuffer.append("rtins_type=");
                    stringBuffer.append(campaignEx.getRtinsType());
                    stringBuffer.append(t2.i.c);
                }
                stringBuffer.append("rid=" + campaignEx.getRequestId() + t2.i.c);
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
            } else if (list.size() == 1) {
                CampaignEx campaignEx2 = (CampaignEx) list.get(0);
                if (campaignEx2.isBidCampaign()) {
                    stringBuffer.append("hb=");
                    stringBuffer.append(1);
                    stringBuffer.append(t2.i.c);
                }
                if (ai.c(campaignEx2)) {
                    stringBuffer.append("rtins_type=");
                    stringBuffer.append(campaignEx2.getRtinsType());
                    stringBuffer.append(t2.i.c);
                }
                stringBuffer.append("rid=" + campaignEx2.getRequestId() + t2.i.c);
                stringBuffer.append("rid_n=" + campaignEx2.getRequestIdNotice());
            }
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
                return;
            }
            final String string = stringBuffer.toString();
            if (context == null || TextUtils.isEmpty(string) || TextUtils.isEmpty(str)) {
                return;
            }
            try {
                new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, d.f().c, k.a(string, context, str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.mbnative.e.a.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str2) {
                        ad.b("NativeReport", str2);
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str2) {
                        l lVar = new l();
                        lVar.a(string);
                        lVar.a(System.currentTimeMillis());
                        lVar.a(0);
                        lVar.b("POST");
                        lVar.c(d.f().c);
                        n.a(h.a(context)).a(lVar);
                        ad.b("NativeReport", str2);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                ad.b("NativeReport", e.getMessage());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(final Context context, String str, String str2, boolean z, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000047&");
                stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                stringBuffer.append("unit_id=" + str2 + t2.i.c);
                stringBuffer.append("st=" + System.currentTimeMillis() + t2.i.c);
                if (campaignEx != null) {
                    stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
                    stringBuffer.append("adtp=" + campaignEx.getAdType() + t2.i.c);
                    stringBuffer.append("rid=" + campaignEx.getRequestId());
                    stringBuffer.append(t2.i.c);
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + t2.i.c);
                }
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = c.b.get(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("u_stid=");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(t2.i.c);
                    stringBuffer.append(sb.toString());
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                    stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.U + t2.i.c);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.g + t2.i.c);
                }
                if (z) {
                    stringBuffer.append("hb=1&");
                }
                stringBuffer.append("reason=" + str);
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                    return;
                }
                final String string = stringBuffer.toString();
                if (context == null || TextUtils.isEmpty(string)) {
                    return;
                }
                try {
                    new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, d.f().c, k.a(string, context), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.mbnative.e.a.2
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str4) {
                            ad.b("NativeReport", str4);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str4) {
                            l lVar = new l();
                            lVar.a(string);
                            lVar.a(System.currentTimeMillis());
                            lVar.a(0);
                            lVar.b("POST");
                            lVar.c(d.f().c);
                            n.a(h.a(context)).a(lVar);
                            ad.b("NativeReport", str4);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    ad.b("NativeReport", e.getMessage());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar, campaignEx, context, aVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
