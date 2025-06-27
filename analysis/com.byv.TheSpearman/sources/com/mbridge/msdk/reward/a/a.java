package com.mbridge.msdk.reward.a;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.b.d;
import com.mbridge.msdk.foundation.controller.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RewardCandidateController.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f3387a = "RewardCandidateController";
    private d b;

    public a(String str, boolean z) {
        try {
            this.b = b.a().a(str, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), str, z).G());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(List<CampaignEx> list, String str, com.mbridge.msdk.reward.adapter.c cVar, String str2) {
        try {
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.b.a(com.mbridge.msdk.foundation.b.a.b, 2, list, this.b.a(list, str) > 0, "", "", -1, str2);
            d dVar = this.b;
            JSONObject jSONObjectA = dVar.a(dVar.b(str));
            if (jSONObjectA == null || this.b.d(str) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            a(this.b.a(jSONObjectA.optInt("max_usage_limit", 10), 0L), jSONObjectA, jSONObjectA.optInt("max_cache_num", 20), -1.0d, cVar, new com.mbridge.msdk.foundation.same.report.d.b(), str, false, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final com.mbridge.msdk.foundation.b.c a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, CampaignEx campaignEx, com.mbridge.msdk.foundation.c.b bVar2, int i, com.mbridge.msdk.reward.adapter.c cVar) {
        String requestId;
        String strB;
        int iF;
        com.mbridge.msdk.foundation.b.c cVarA;
        com.mbridge.msdk.foundation.b.c cVar2 = new com.mbridge.msdk.foundation.b.c();
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                try {
                    requestId = campaignEx.getRequestId();
                } catch (Exception unused) {
                    cVar2.d("getRewardCandidateCampaignList result exception");
                    cVar2.a(com.mbridge.msdk.foundation.b.c.c);
                    return cVar2;
                }
            } catch (Exception unused2) {
                cVar2.d("getCandidateCampaignList result exception");
                cVar2.a(com.mbridge.msdk.foundation.b.c.c);
                return cVar2;
            }
        }
        if (bVar2 != null) {
            iF = bVar2.f();
            strB = bVar2.b();
        } else {
            strB = null;
            iF = 0;
        }
        d dVar = this.b;
        if (dVar == null) {
            cVarA = new com.mbridge.msdk.foundation.b.c();
            cVarA.d("can not get manager");
            cVarA.a(com.mbridge.msdk.foundation.b.c.c);
        } else {
            com.mbridge.msdk.foundation.b.c cVarC = dVar.c(str);
            if (cVarC.g() > com.mbridge.msdk.foundation.b.c.b) {
                cVarA = cVarC;
            } else {
                String[] strArrSplit = x.a(str.split("_")[3]).split("\\|");
                double d = Double.parseDouble(strArrSplit[0]);
                cVarA = a(d, strArrSplit.length > 1 ? strArrSplit[1] : "", cVar, bVar, str, i);
                this.b.a(cVarA.a(), bVar, requestId, iF, strB, i, d);
            }
        }
        return cVarA;
    }

    private com.mbridge.msdk.foundation.b.c a(double d, String str, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.d.b bVar, String str2, int i) {
        com.mbridge.msdk.foundation.b.c cVarA = this.b.a();
        try {
        } catch (Exception unused) {
            cVarA.d("getHighestCampaigns exception");
            cVarA.a(com.mbridge.msdk.foundation.b.c.c);
        }
        if (cVarA.g() > 0) {
            return cVarA;
        }
        JSONObject jSONObjectA = this.b.a(str);
        if (jSONObjectA != null) {
            int iOptInt = jSONObjectA.optInt("max_usage_limit", 10);
            int iOptInt2 = jSONObjectA.optInt("max_cache_num", 20);
            if (iOptInt2 > 0) {
                long j = 8640000;
                long jOptLong = jSONObjectA.optLong("show_interval_time", 8640000L);
                if (jOptLong != 0) {
                    j = jOptLong;
                }
                List<com.mbridge.msdk.foundation.b.b> listA = this.b.a(iOptInt, System.currentTimeMillis() - (j * 1000));
                if (listA != null && listA.size() > 0) {
                    return a(listA, jSONObjectA, iOptInt2, d, cVar, bVar, str2, true, i);
                }
                cVarA.d("no cache");
                cVarA.a(com.mbridge.msdk.foundation.b.c.c);
                a(bVar, str2, cVarA, (List<a.C0262a>) null, jSONObjectA, 2);
            } else {
                cVarA.d("max cache num error");
                cVarA.a(com.mbridge.msdk.foundation.b.c.c);
            }
        } else {
            cVarA.d("setting config not mapping");
            cVarA.a(com.mbridge.msdk.foundation.b.c.c);
        }
        return cVarA;
    }

    private com.mbridge.msdk.foundation.b.c a(List<com.mbridge.msdk.foundation.b.b> list, JSONObject jSONObject, int i, double d, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, boolean z, int i2) {
        ArrayList arrayList;
        int i3;
        com.mbridge.msdk.foundation.b.c cVar2;
        a aVar = this;
        List<com.mbridge.msdk.foundation.b.b> listA = list;
        com.mbridge.msdk.foundation.b.c cVar3 = new com.mbridge.msdk.foundation.b.c();
        if (jSONObject == null) {
            cVar3.d("config is null");
            cVar3.a(com.mbridge.msdk.foundation.b.c.c);
            return cVar3;
        }
        if (listA == null || list.size() == 0) {
            cVar3.d("candidate is null");
            cVar3.a(com.mbridge.msdk.foundation.b.c.c);
            return cVar3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.mbridge.msdk.foundation.b.b bVar2 = listA.get(i5);
            if (bVar2 != null) {
                cVar3.a(bVar2.e());
            }
        }
        if (list.size() > 0 && ((listA = aVar.a(listA, cVar3)) == null || listA.size() == 0)) {
            cVar3.d("existed");
            cVar3.a(com.mbridge.msdk.foundation.b.c.c);
        }
        if (listA.size() > 0 && ((listA = aVar.a(listA, cVar, cVar3)) == null || listA.size() == 0)) {
            cVar3.d("not ready");
            cVar3.a(com.mbridge.msdk.foundation.b.c.c);
        }
        com.mbridge.msdk.foundation.b.b bVar3 = null;
        if (listA == null || listA.size() <= 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            double dOptDouble = jSONObject.optDouble("t_disc", 0.8d);
            double dOptDouble2 = jSONObject.optDouble("u_disc", 0.95d);
            double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double dOptDouble3 = jSONObject.optDouble("max_ecppv_diff", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            int iOptInt = jSONObject.optInt("time_interval", 1800);
            int size = listA.size();
            while (i4 < size) {
                List<com.mbridge.msdk.foundation.b.b> list2 = listA;
                com.mbridge.msdk.foundation.b.b bVar4 = listA.get(i4);
                if (bVar4 != null) {
                    i3 = size;
                    cVar2 = cVar3;
                    double dPow = Math.pow(dOptDouble2, bVar4.f()) * bVar4.c() * Math.pow(dOptDouble, (System.currentTimeMillis() - bVar4.h()) / (iOptInt * 1000.0d));
                    arrayList2.add(new a.C0262a(dPow, bVar4));
                    if (dPow >= d - dOptDouble3 && dPow > d2) {
                        bVar3 = bVar4;
                        d2 = dPow;
                    }
                } else {
                    i3 = size;
                    cVar2 = cVar3;
                }
                i4++;
                aVar = this;
                listA = list2;
                size = i3;
                cVar3 = cVar2;
            }
            com.mbridge.msdk.foundation.b.c cVar4 = cVar3;
            d dVar = aVar.b;
            if (dVar != null) {
                dVar.a(arrayList2, i);
            }
            if (bVar3 != null) {
                cVar3 = cVar4;
                cVar3.a(bVar3.b());
                cVar3.a(com.mbridge.msdk.foundation.b.c.d);
            } else {
                cVar3 = cVar4;
                cVar3.d("no match campaign");
                cVar3.a(com.mbridge.msdk.foundation.b.c.c);
            }
            arrayList = arrayList2;
        }
        if (z) {
            a(bVar, str, cVar3, arrayList, jSONObject, 2);
        }
        return cVar3;
    }

    private List<com.mbridge.msdk.foundation.b.b> a(List<com.mbridge.msdk.foundation.b.b> list, com.mbridge.msdk.foundation.b.c cVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.foundation.b.b bVar = list.get(i);
            if (bVar != null && (copyOnWriteArrayListB = bVar.b()) != null && copyOnWriteArrayListB.size() != 0) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 >= copyOnWriteArrayListB.size()) {
                        break;
                    }
                    CampaignEx campaignEx = copyOnWriteArrayListB.get(i2);
                    boolean zC = ai.c(c.m().c(), campaignEx.getPackageName());
                    if (zC) {
                        cVar.c(bVar.e());
                        d dVar = this.b;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                        z = zC;
                    } else {
                        i2++;
                        z = zC;
                    }
                }
                if (!z) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    private List<com.mbridge.msdk.foundation.b.b> a(List<com.mbridge.msdk.foundation.b.b> list, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.b.c cVar2) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.foundation.b.b bVar = list.get(i);
            if (bVar != null && (copyOnWriteArrayListB = bVar.b()) != null && copyOnWriteArrayListB.size() != 0) {
                int i2 = 0;
                boolean zA = false;
                while (true) {
                    if (i2 >= copyOnWriteArrayListB.size()) {
                        break;
                    }
                    CampaignEx campaignEx = copyOnWriteArrayListB.get(i2);
                    if (cVar == null || (zA = cVar.a(copyOnWriteArrayListB, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())))) {
                        i2++;
                    } else {
                        cVar2.b(bVar.e());
                        d dVar = this.b;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                    }
                }
                if (zA) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        JSONObject jSONObjectA;
        try {
            d dVar = this.b;
            if (dVar != null && (jSONObjectA = dVar.a(dVar.b(str))) != null) {
                return jSONObjectA.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public final void a(String str, String str2, int i, String str3) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(str, str2, i, str3);
        }
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str, com.mbridge.msdk.foundation.b.c cVar, List<a.C0262a> list, JSONObject jSONObject, int i) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("scene", i != 1 ? i != 2 ? i != 3 ? "unknown" : "track" : "candidate" : "cb");
            d dVar2 = this.b;
            if (dVar2 != null) {
                double d = dVar2.d(str);
                if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dVar.a("bp", x.b(d + ""));
                }
                dVar.a("cb_state", a(str) ? "open" : "close");
                try {
                    d dVar3 = this.b;
                    JSONObject jSONObjectA = dVar3.a(dVar3.b(str));
                    if (jSONObjectA != null) {
                        dVar.a("config", jSONObjectA.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cVar != null) {
                if (cVar.g() == com.mbridge.msdk.foundation.b.c.d) {
                    dVar.a("result", 1);
                } else {
                    dVar.a("result", 2);
                    dVar.a("reason", cVar.b());
                }
                dVar.a("acr", cVar.c());
                dVar.a("her", cVar.e());
                dVar.a("nrr", cVar.d());
                dVar.a("cer", cVar.f());
            } else {
                dVar.a("result", 2);
                dVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    com.mbridge.msdk.foundation.b.b bVarA = list.get(i2).a();
                    if (bVarA != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", x.b(bVarA.c() + ""));
                        jSONObject2.put("showCount", bVarA.f());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - bVarA.h());
                        jSONArray.put(jSONObject2);
                    }
                }
                dVar.a("data", jSONArray.toString());
            }
            if (bVar != null) {
                bVar.a("m_candidate_data");
                bVar.k("m_candidate_data");
                bVar.a("m_candidate_data", dVar);
                if (cVar != null && cVar.a() != null) {
                    bVar.b(cVar.a());
                }
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_candidate_data", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
