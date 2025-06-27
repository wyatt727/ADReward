package com.mbridge.msdk.reward.c;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.videocommon.d.b;
import java.util.List;

/* compiled from: RewardReport.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3450a = "com.mbridge.msdk.reward.c.a";
    private static String b = "";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                q qVarA = q.a(h.a(context));
                if (TextUtils.isEmpty(str) || qVarA == null || qVarA.a() <= 0) {
                    return;
                }
                List<n> listA = qVarA.a("m_download_end");
                List<n> listA2 = qVarA.a("2000021");
                List<n> listA3 = qVarA.a("2000039");
                List<n> listA4 = qVarA.a("m_download_end");
                List<n> listA5 = qVarA.a("m_download_end");
                List<n> listA6 = qVarA.a("2000044");
                String strE = n.e(listA2);
                String strA = n.a(listA);
                String strC = n.c(listA3);
                String strB = n.b(listA4);
                String strF = n.f(listA5);
                String strD = n.d(listA6);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(strE)) {
                    sb.append(strE);
                }
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                }
                if (!TextUtils.isEmpty(strC)) {
                    sb.append(strC);
                }
                if (!TextUtils.isEmpty(strB)) {
                    sb.append(strB);
                }
                if (!TextUtils.isEmpty(strF)) {
                    sb.append(strF);
                }
                if (!TextUtils.isEmpty(strD)) {
                    sb.append(strD);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    return;
                }
                String string = sb.toString();
                if (context == null || TextUtils.isEmpty(string) || TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
                    e eVarA = k.a(string, context, str);
                    eVarA.a("r_stid", b.a().b().b());
                    aVar.post(0, d.f().c, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.reward.c.a.1
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str2) {
                            ad.b(a.f3450a, str2);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str2) {
                            ad.b(a.f3450a, str2);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    ad.b(f3450a, e.getMessage());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(final Context context, CampaignEx campaignEx, String str) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000048&");
            stringBuffer.append("st=" + System.currentTimeMillis() + t2.i.c);
            if (campaignEx != null) {
                stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
            }
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str + t2.i.c);
            if (ai.c(campaignEx)) {
                stringBuffer.append("rtins_type=");
                stringBuffer.append(campaignEx.getRtinsType());
                stringBuffer.append(t2.i.c);
            }
            if (campaignEx.isBidCampaign()) {
                stringBuffer.append("hb=1&");
            } else {
                stringBuffer.append("hb=0&");
            }
            if (campaignEx != null) {
                stringBuffer.append("rid=" + campaignEx.getRequestId() + t2.i.c);
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + t2.i.c);
                StringBuilder sb = new StringBuilder();
                sb.append("adspace_t=");
                sb.append(campaignEx.getAdSpaceT());
                stringBuffer.append(sb.toString());
            }
            if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                try {
                    int iA = com.mbridge.msdk.foundation.same.d.a(campaignEx, campaignEx.getRewardTemplateMode().e());
                    if (iA != -1) {
                        stringBuffer.append("&dyview=");
                        stringBuffer.append(iA);
                    }
                } catch (Exception unused) {
                }
            }
            if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                return;
            }
            final String string = stringBuffer.toString();
            if (context == null || TextUtils.isEmpty(string) || TextUtils.isEmpty(str)) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
                e eVarA = k.a(string, context, str);
                eVarA.a("r_stid", b.a().b().b());
                aVar.post(0, d.f().c, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.reward.c.a.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str2) {
                        ad.b(a.f3450a, str2);
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(final String str2) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.c.a.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                l lVar = new l();
                                lVar.a(string);
                                lVar.a(System.currentTimeMillis());
                                lVar.a(0);
                                lVar.b("POST");
                                lVar.c(d.f().c);
                                com.mbridge.msdk.foundation.db.n.a(h.a(context)).a(lVar);
                                ad.b(a.f3450a, str2);
                            }
                        });
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                ad.b(f3450a, e.getMessage());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
