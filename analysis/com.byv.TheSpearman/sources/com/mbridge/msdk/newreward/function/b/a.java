package com.mbridge.msdk.newreward.function.b;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.a.a;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.videocommon.d.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RewardCandidateController.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f3305a = "RewardCandidateController";
    private final c b;
    private com.mbridge.msdk.newreward.function.a.c c;

    public a(String str, boolean z, c cVar) {
        this.b = cVar;
        try {
            com.mbridge.msdk.newreward.function.a.c cVarA = com.mbridge.msdk.newreward.function.a.a.a.a().a(str, b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, z).G());
            this.c = cVarA;
            cVarA.a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final com.mbridge.msdk.newreward.function.a.b a(com.mbridge.msdk.foundation.same.report.d.b bVar, com.mbridge.msdk.foundation.c.b bVar2, e eVar, int i) {
        int i2;
        String str;
        CampaignEx campaignEx;
        String str2;
        String requestId;
        int i3;
        com.mbridge.msdk.newreward.function.a.b bVarC;
        com.mbridge.msdk.newreward.function.a.b bVar3 = new com.mbridge.msdk.newreward.function.a.b();
        String strB = null;
        if (eVar != null) {
            try {
                String strC = eVar.C();
                CampaignEx campaignEx2 = (eVar.x() == null || eVar.x().b() == null || eVar.x().b().C() == null || eVar.x().b().C().size() <= 0) ? null : eVar.x().b().C().get(0);
                if (this.c != null) {
                    int iP = eVar.p();
                    String strW = eVar.w();
                    this.c.a(iP);
                    this.c.f(strW);
                    this.c.a(eVar);
                    i2 = iP;
                    campaignEx = campaignEx2;
                    str = strW;
                } else {
                    i2 = 94;
                    str = "";
                    campaignEx = campaignEx2;
                }
                str2 = strC;
            } catch (Exception unused) {
                bVar3.d("getCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.c);
                return bVar3;
            }
        } else {
            i2 = 94;
            str = "";
            campaignEx = null;
            str2 = null;
        }
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                requestId = campaignEx.getRequestId();
            } catch (Exception unused2) {
                bVar3.d("getRewardCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.c);
                return bVar3;
            }
        }
        if (bVar2 != null) {
            int iF = bVar2.f();
            strB = bVar2.b();
            i3 = iF;
        } else {
            i3 = 0;
        }
        String str3 = strB;
        com.mbridge.msdk.newreward.function.a.c cVar = this.c;
        if (cVar == null) {
            bVarC = new com.mbridge.msdk.newreward.function.a.b();
            bVarC.d("can not get manager");
            bVarC.a(com.mbridge.msdk.foundation.b.c.c);
        } else {
            bVarC = cVar.c(str2);
            if (bVarC.h() <= com.mbridge.msdk.foundation.b.c.b) {
                String[] strArrSplit = x.a(str2.split("_")[3]).split("\\|");
                double d = Double.parseDouble(strArrSplit[0]);
                bVarC = a(d, strArrSplit.length > 1 ? strArrSplit[1] : "", bVar, str2, eVar, i, i2, str);
                if (bVarC != null && bVarC.a() != null) {
                    this.c.a(bVarC.a().s(), bVar, requestId, i3, str3, i, d);
                }
            }
        }
        return bVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x023d: MOVE (r8 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:106:0x023d */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6 */
    private com.mbridge.msdk.newreward.function.a.b a(double d, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, String str2, e eVar, int i, int i2, String str3) {
        Object obj;
        JSONObject jSONObject;
        ArrayList arrayList;
        int i3;
        JSONObject jSONObject2;
        com.mbridge.msdk.newreward.function.a.b bVar2;
        List<com.mbridge.msdk.newreward.function.d.a.a> listS;
        com.mbridge.msdk.newreward.function.a.b bVar3 = this;
        com.mbridge.msdk.newreward.function.a.b bVarA = bVar3.c.a();
        try {
        } catch (Exception unused) {
            bVar3 = bVarA;
        }
        if (bVarA.h() > 0) {
            return bVarA;
        }
        JSONObject jSONObjectA = bVar3.c.a(str);
        try {
            if (jSONObjectA != null) {
                int iOptInt = jSONObjectA.optInt("max_usage_limit", 10);
                if (jSONObjectA.optInt("max_cache_num", 20) > 0) {
                    List<com.mbridge.msdk.newreward.function.d.a.b> listA = bVar3.c.a(iOptInt, i2, str3);
                    if (listA == null || listA.size() <= 0) {
                        com.mbridge.msdk.newreward.function.a.b bVar4 = bVarA;
                        bVar4.d("no cache");
                        bVar4.a(com.mbridge.msdk.foundation.b.c.c);
                        a(bVar, str2, bVar4, null, jSONObjectA, eVar, 2);
                        bVar3 = bVar4;
                    } else {
                        com.mbridge.msdk.newreward.function.a.b bVar5 = new com.mbridge.msdk.newreward.function.a.b();
                        if (jSONObjectA == null) {
                            bVar5.d("config is null");
                            bVar5.a(com.mbridge.msdk.foundation.b.c.c);
                        } else {
                            try {
                                if (listA == null || listA.size() == 0) {
                                    bVar5.d("candidate is null");
                                    bVar5.a(com.mbridge.msdk.foundation.b.c.c);
                                } else {
                                    for (int i4 = 0; i4 < listA.size(); i4++) {
                                        com.mbridge.msdk.newreward.function.d.a.b bVar6 = listA.get(i4);
                                        if (bVar6 != null) {
                                            bVar5.a(bVar6.d());
                                        }
                                    }
                                    if (listA.size() > 0) {
                                        if (listA != null && listA.size() != 0) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (int i5 = 0; i5 < listA.size(); i5++) {
                                                com.mbridge.msdk.newreward.function.d.a.b bVar7 = listA.get(i5);
                                                if (bVar7 != null && (listS = bVar7.s()) != null && listS.size() != 0) {
                                                    int i6 = 0;
                                                    boolean z = false;
                                                    while (true) {
                                                        if (i6 >= listS.size()) {
                                                            break;
                                                        }
                                                        com.mbridge.msdk.newreward.function.d.a.a aVar = listS.get(i6);
                                                        boolean zC = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), aVar.g().getPackageName());
                                                        if (zC) {
                                                            bVar5.c(bVar7.d());
                                                            com.mbridge.msdk.newreward.function.a.c cVar = bVar3.c;
                                                            if (cVar != null) {
                                                                cVar.a(bVar7.e(), bVar7.d(), 2, aVar.h().q());
                                                            }
                                                            z = zC;
                                                        } else {
                                                            i6++;
                                                            z = zC;
                                                        }
                                                    }
                                                    if (!z) {
                                                        arrayList2.add(bVar7);
                                                    }
                                                }
                                            }
                                            listA = arrayList2;
                                        }
                                        if (listA == null || listA.size() == 0) {
                                            bVar5.d("existed");
                                            bVar5.a(com.mbridge.msdk.foundation.b.c.c);
                                        }
                                    }
                                    if (listA.size() > 0 && ((listA = bVar3.a(listA, bVar5)) == null || listA.size() == 0)) {
                                        bVar5.d("not ready");
                                        bVar5.a(com.mbridge.msdk.foundation.b.c.c);
                                    }
                                    if (listA.size() > 0 && ((listA = bVar3.b(listA, bVar5)) == null || listA.size() == 0)) {
                                        bVar5.d("had in cache");
                                        bVar5.a(com.mbridge.msdk.foundation.b.c.c);
                                    }
                                    if (listA == null || listA.size() <= 0) {
                                        jSONObject = jSONObjectA;
                                        arrayList = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        double dOptDouble = jSONObjectA.optDouble("t_disc", 0.8d);
                                        double dOptDouble2 = jSONObjectA.optDouble("u_disc", 0.95d);
                                        double dOptDouble3 = jSONObjectA.optDouble("max_ecppv_diff", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                                        int iOptInt2 = jSONObjectA.optInt("time_interval", 1800);
                                        int size = listA.size();
                                        double d2 = 0.0d;
                                        com.mbridge.msdk.newreward.function.d.a.b bVar8 = null;
                                        int i7 = 0;
                                        while (i7 < size) {
                                            com.mbridge.msdk.newreward.function.d.a.b bVar9 = listA.get(i7);
                                            if (bVar9 != null) {
                                                bVar2 = bVarA;
                                                i3 = size;
                                                jSONObject2 = jSONObjectA;
                                                double dPow = Math.pow(dOptDouble2, bVar9.r()) * bVar9.q() * Math.pow(dOptDouble, (System.currentTimeMillis() - bVar9.G()) / (iOptInt2 * 1000.0d));
                                                arrayList3.add(new a.C0283a(dPow, bVar9));
                                                if (dPow >= d - dOptDouble3 && dPow > d2) {
                                                    d2 = dPow;
                                                    bVar8 = bVar9;
                                                }
                                            } else {
                                                i3 = size;
                                                jSONObject2 = jSONObjectA;
                                                bVar2 = bVarA;
                                            }
                                            i7++;
                                            jSONObjectA = jSONObject2;
                                            size = i3;
                                            bVarA = bVar2;
                                        }
                                        jSONObject = jSONObjectA;
                                        if (bVar8 != null) {
                                            bVar5.a(bVar8);
                                            bVar5.a(com.mbridge.msdk.foundation.b.c.d);
                                        } else {
                                            bVar5.d("no match campaign");
                                            bVar5.a(com.mbridge.msdk.foundation.b.c.c);
                                        }
                                        arrayList = arrayList3;
                                    }
                                    a(bVar, str2, bVar5, arrayList, jSONObject, eVar, i);
                                }
                            } catch (Exception unused2) {
                                bVar3 = obj;
                                bVar3.d("getHighestCampaigns exception");
                                bVar3.a(com.mbridge.msdk.foundation.b.c.c);
                                return bVar3;
                            }
                        }
                        return bVar5;
                    }
                } else {
                    com.mbridge.msdk.newreward.function.a.b bVar10 = bVarA;
                    bVar10.d("max cache num error");
                    bVar10.a(com.mbridge.msdk.foundation.b.c.c);
                    bVar3 = bVar10;
                }
            } else {
                com.mbridge.msdk.newreward.function.a.b bVar11 = bVarA;
                bVar11.d("setting config not mapping");
                bVar11.a(com.mbridge.msdk.foundation.b.c.c);
                bVar3 = bVar11;
            }
        } catch (Exception unused3) {
        }
        return bVar3;
    }

    private List<com.mbridge.msdk.newreward.function.d.a.b> a(List<com.mbridge.msdk.newreward.function.d.a.b> list, com.mbridge.msdk.newreward.function.a.b bVar) {
        List<com.mbridge.msdk.newreward.function.d.a.a> listS;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i);
            if (bVar2 != null && (listS = bVar2.s()) != null && listS.size() != 0) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 >= listS.size()) {
                        break;
                    }
                    com.mbridge.msdk.newreward.function.d.a.a aVar = listS.get(i2);
                    boolean zY = aVar.h().y();
                    if (zY) {
                        i2++;
                        z = zY;
                    } else {
                        bVar.b(bVar2.d());
                        com.mbridge.msdk.newreward.function.a.c cVar = this.c;
                        if (cVar != null) {
                            cVar.a(bVar2.e(), bVar2.d(), 2, aVar.h().q());
                        }
                        z = zY;
                    }
                }
                if (z) {
                    arrayList.add(bVar2);
                }
            }
        }
        return arrayList;
    }

    private List<com.mbridge.msdk.newreward.function.d.a.b> b(List<com.mbridge.msdk.newreward.function.d.a.b> list, com.mbridge.msdk.newreward.function.a.b bVar) {
        List<com.mbridge.msdk.newreward.function.d.a.a> listS;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i);
            if (bVar2 != null && (listS = bVar2.s()) != null && listS.size() != 0) {
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        JSONObject jSONObjectA;
        try {
            com.mbridge.msdk.newreward.function.a.c cVar = this.c;
            if (cVar != null && (jSONObjectA = cVar.a(cVar.b(str))) != null) {
                return jSONObjectA.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str, com.mbridge.msdk.newreward.function.a.b bVar2, List<a.C0283a> list, JSONObject jSONObject, e eVar, int i) {
        try {
            d dVar = new d();
            dVar.a("scene", i != 1 ? i != 2 ? i != 3 ? "unknown" : "track" : "candidate" : "cb");
            com.mbridge.msdk.newreward.function.a.c cVar = this.c;
            if (cVar != null) {
                double d = cVar.d(str);
                if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dVar.a("bp", x.b(d + ""));
                }
                dVar.a("cb_state", a(str) ? "open" : "close");
                try {
                    com.mbridge.msdk.newreward.function.a.c cVar2 = this.c;
                    JSONObject jSONObjectA = cVar2.a(cVar2.b(str));
                    if (jSONObjectA != null) {
                        dVar.a("config", jSONObjectA.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (bVar2 != null) {
                if (bVar2.h() == com.mbridge.msdk.foundation.b.c.d) {
                    dVar.a("result", 1);
                } else {
                    dVar.a("result", 2);
                    dVar.a("reason", bVar2.b());
                }
                dVar.a("acr", bVar2.c());
                dVar.a("her", bVar2.e());
                dVar.a("nrr", bVar2.d());
                dVar.a("cer", bVar2.f());
            } else {
                dVar.a("result", 2);
                dVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    com.mbridge.msdk.newreward.function.d.a.b bVarA = list.get(i2).a();
                    if (bVarA != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", x.b(bVarA.q() + ""));
                        jSONObject2.put("showCount", bVarA.r());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - bVarA.G());
                        jSONArray.put(jSONObject2);
                    }
                }
                dVar.a("data", jSONArray.toString());
            }
            if (bVar != null) {
                bVar.a("m_candidate_data");
                bVar.k("m_candidate_data");
                bVar.a("m_candidate_data", dVar);
                if (bVar2 != null && bVar2.a() != null && eVar != null) {
                    bVar.b(eVar.x().a());
                }
            }
            this.b.a(eVar, com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DATE, this.b.a("metrics_data", dVar));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
