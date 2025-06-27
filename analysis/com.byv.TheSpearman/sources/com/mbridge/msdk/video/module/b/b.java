package com.mbridge.msdk.video.module.b;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.x;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: VideoViewReport.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap<String, ArrayList<String>> f3763a = new HashMap<>();

    public static void a(String str) {
        f3763a.remove(str);
    }

    public static void a(String str, String str2) {
        try {
            if (c.m().c() == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(c.m().c());
            e eVarA = k.a(str, c.m().c(), str2);
            eVarA.a("r_stid", com.mbridge.msdk.videocommon.d.b.a().b().b());
            aVar.post(0, d.f().c, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.video.module.b.b.1
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                    ad.b("VideoViewReport", str3);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str3) {
                    ad.b("VideoViewReport", str3);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            ad.b("VideoViewReport", e.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000141", campaignEx);
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public static void b(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().j() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().j(), false, false);
    }

    public static void c(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().k() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().k(), false, false);
    }

    public static void d(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().l() == null) {
            return;
        }
        String campaignUnitId = campaignEx.getCampaignUnitId();
        ArrayList<String> arrayList = f3763a.get(campaignUnitId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f3763a.put(campaignUnitId, arrayList);
        }
        if (arrayList.contains(campaignEx.getId())) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000142", campaignEx);
        } catch (Exception unused) {
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
        arrayList.add(campaignEx.getId());
    }

    public static void a(Context context, CampaignEx campaignEx, int i, int i2) {
        try {
            String[] strArrR = campaignEx.getNativeVideoTracking().r();
            if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || strArrR == null) {
                return;
            }
            String[] strArr = new String[strArrR.length];
            for (int i3 = 0; i3 < strArrR.length; i3++) {
                String str = strArrR[i3];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i);
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = x.b(string);
                }
                if (!TextUtils.isEmpty(string)) {
                    str = str + "&value=" + URLEncoder.encode(string);
                }
                strArr[i3] = campaignEx.getSpareOfferFlag() == 1 ? str + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2 : str + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000144", campaignEx, dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000147", campaignEx, dVar);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
        } catch (Throwable unused2) {
            ad.b("VideoViewReport", "reportEndcardshowData error");
        }
    }

    public static void e(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().s() == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000143", campaignEx);
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().s(), false, false);
    }

    public static void f(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m(), false, false);
    }

    public static void a(Context context, CampaignEx campaignEx, int i, int i2, int i3) {
        String str;
        if (i2 == 0 || context == null || campaignEx == null) {
            return;
        }
        try {
            List<Map<Integer, String>> listI = campaignEx.getNativeVideoTracking().i();
            int i4 = ((i + 1) * 100) / i2;
            if (listI != null) {
                int i5 = 0;
                int i6 = 0;
                while (i5 < listI.size()) {
                    Map<Integer, String> map = listI.get(i5);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        int i7 = i5;
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int iIntValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (campaignEx.getSpareOfferFlag() == 1) {
                                str = value + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i3;
                            } else {
                                str = value + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i3;
                            }
                            if (iIntValue <= i4 && !TextUtils.isEmpty(str)) {
                                String[] strArr = {str};
                                if (i6 < 1) {
                                    i6++;
                                    try {
                                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                                        dVar.a("percent", Integer.valueOf(iIntValue));
                                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000140", campaignEx, dVar);
                                    } catch (Exception unused) {
                                    }
                                }
                                int i8 = i6;
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
                                it.remove();
                                listI.remove(i7);
                                i7--;
                                i6 = i8;
                            }
                        }
                        i5 = i7;
                    }
                    i5++;
                }
            }
        } catch (Throwable unused2) {
            ad.b("VideoViewReport", "reportPlayPercentageData error");
        }
    }

    public static void a(CampaignEx campaignEx, Map<Integer, String> map, String str, int i) {
        if (campaignEx == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i == key.intValue() && !TextUtils.isEmpty(value)) {
                        com.mbridge.msdk.click.a.a(c.m().c(), campaignEx, str, value, false, false);
                        it.remove();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAdUrlList() == null || campaignEx.getAdUrlList().size() <= 0) {
                    return;
                }
                for (String str2 : campaignEx.getAdUrlList()) {
                    if (!TextUtils.isEmpty(str2)) {
                        com.mbridge.msdk.click.a.a(c.m().c(), campaignEx, str, str2, false, false);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, String str3) {
        String str4 = t2.i.c;
        String str5 = "";
        if (campaignEx == null || cVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.video.module.c.b bVar = new com.mbridge.msdk.video.module.c.b(c.m().c());
            e eVar = new e();
            eVar.a("user_id", x.b(str2));
            eVar.a("cb_type", "1");
            eVar.a("reward_name", cVar.a());
            eVar.a("reward_amount", cVar.b() + "");
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("click_id", campaignEx.getRequestIdNotice());
            if (!TextUtils.isEmpty(str3)) {
                eVar.a("extra", str3);
            }
            bVar.addExtraParams("", eVar);
            String string = campaignEx.getHost() + "/addReward?";
            String strTrim = eVar.b().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                if (!string.endsWith("?") && !string.endsWith(t2.i.c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    if (!string.contains("?")) {
                        str4 = "?";
                    }
                    sb.append(str4);
                    string = sb.toString();
                }
                str5 = string + strTrim;
            }
            String str6 = str5;
            ad.b("VideoViewReport", "rewardUrl:" + str6);
            com.mbridge.msdk.click.a.a(c.m().c(), campaignEx, campaignEx.getCampaignUnitId(), str6, false, false);
        } catch (Throwable th) {
            ad.a("VideoViewReport", th.getMessage(), th);
        }
    }
}
