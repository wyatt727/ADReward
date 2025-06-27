package com.mbridge.msdk.video.bt.module.b;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RewardReport.java */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3611a = "com.mbridge.msdk.video.bt.module.b.f";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                q qVarA = q.a(com.mbridge.msdk.foundation.db.h.a(context));
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
                    com.mbridge.msdk.foundation.same.net.h.e eVarA = k.a(string, context, str);
                    eVarA.a("r_stid", com.mbridge.msdk.videocommon.d.b.a().b().b());
                    aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.video.bt.module.b.f.1
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str2) {
                            ad.b(f.f3611a, str2);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str2) {
                            ad.b(f.f3611a, str2);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    ad.b(f3611a, e.getMessage());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void a(final Context context, final String str, String str2) {
        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            context = com.mbridge.msdk.foundation.controller.c.m().c();
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
            com.mbridge.msdk.foundation.same.net.h.e eVarA = k.a(str, context, str2);
            eVarA.a("r_stid", com.mbridge.msdk.videocommon.d.b.a().b().b());
            aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.video.bt.module.b.f.2
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                    ad.b(f.f3611a, str3);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(final String str3) {
                    com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.b.f.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            l lVar = new l();
                            lVar.a(str);
                            lVar.a(System.currentTimeMillis());
                            lVar.a(0);
                            lVar.b("POST");
                            lVar.c(com.mbridge.msdk.foundation.same.net.g.d.f().c);
                            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(lVar);
                            ad.b(f.f3611a, str3);
                        }
                    });
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            ad.b(f3611a, e.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, int i) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str + t2.i.c);
            stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
            stringBuffer.append("reason=&");
            stringBuffer.append("templateshowtype=" + i + " offer show success&");
            stringBuffer.append("result=2&");
            if (campaignEx != null && campaignEx.getAdType() == 287) {
                stringBuffer.append("ad_type=3&");
            } else if (campaignEx == null || campaignEx.getAdType() == 94) {
                stringBuffer.append("ad_type=1&");
            } else {
                stringBuffer.append("ad_type=1&");
            }
            String str2 = campaignEx.getendcard_url();
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append("creative=" + URLEncoder.encode(str2) + t2.i.c);
            }
            stringBuffer.append("devid=" + z.c() + t2.i.c);
            if (campaignEx != null) {
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("adspace_t=");
                stringBuffer.append(campaignEx.getAdSpaceT());
            }
            if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                stringBuffer.append("unit_id=" + str + t2.i.c);
                stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
                stringBuffer.append("reason=" + str2 + t2.i.c);
                stringBuffer.append("templateshowtype=" + i + t2.i.c);
                stringBuffer.append("reason=" + str2 + t2.i.c);
                stringBuffer.append("result=1&");
                if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                    stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + t2.i.c);
                }
                stringBuffer.append("devid=" + z.c() + t2.i.c);
                if (campaignEx != null && campaignEx.getAdType() == 287) {
                    stringBuffer.append("ad_type=3&");
                } else if (campaignEx == null || campaignEx.getAdType() == 94) {
                    stringBuffer.append("ad_type=1&");
                } else {
                    stringBuffer.append("ad_type=1&");
                }
                if (campaignEx != null) {
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append(t2.i.c);
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    stringBuffer.append(t2.i.c);
                    stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                }
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                } else {
                    a(context, stringBuffer.toString(), str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.size() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str + t2.i.c);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(list.get(i).getId());
            }
            stringBuffer.append("cid=" + arrayList.toString() + t2.i.c);
            stringBuffer.append("result=2&");
            if (list.get(0) != null) {
                CampaignEx campaignEx = list.get(0);
                stringBuffer.append("reason=&");
                stringBuffer.append("templateshowtype=two offer ec show success&");
                stringBuffer.append("ad_type=" + campaignEx.getAdType() + t2.i.c);
                stringBuffer.append("devid=" + z.c() + t2.i.c);
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("&adspace_t=");
                stringBuffer.append(campaignEx.getAdSpaceT());
            }
            if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, String str2) {
        if (context == null || list == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                stringBuffer.append("unit_id=" + str + t2.i.c);
                String[] strArr = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    strArr[i] = list.get(i).getId();
                }
                stringBuffer.append("cid=" + strArr + t2.i.c);
                stringBuffer.append("reason=" + str2 + t2.i.c);
                stringBuffer.append("result=1&");
                stringBuffer.append("devid=" + z.c() + t2.i.c);
                if (list.get(0) != null) {
                    CampaignEx campaignEx = list.get(0);
                    stringBuffer.append("ad_type=" + campaignEx.getAdType() + t2.i.c);
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append(t2.i.c);
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    stringBuffer.append(t2.i.c);
                    stringBuffer.append("templateshowtype=" + campaignEx.getMof_tplid());
                    stringBuffer.append(t2.i.c);
                    stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                }
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                } else {
                    a(context, stringBuffer.toString(), str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i) {
        try {
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            if (contextC != null && campaignEx != null && !TextUtils.isEmpty(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000115&");
                stringBuffer.append("network_type=" + z.l(contextC) + t2.i.c);
                stringBuffer.append("unit_id=" + str + t2.i.c);
                stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
                stringBuffer.append("play_cur_time=" + i + t2.i.c);
                stringBuffer.append("reason=close ad in advance " + campaignEx.getMof_tplid() + t2.i.c);
                stringBuffer.append("result=1&");
                stringBuffer.append("devid=" + z.c() + t2.i.c);
                stringBuffer.append("ad_type=" + campaignEx.getAdType() + t2.i.c);
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                } else {
                    a(contextC, stringBuffer.toString(), str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
