package com.mbridge.msdk.newreward.function.f;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;

/* compiled from: MetricsModel.java */
/* loaded from: classes4.dex */
public final class c {
    public final void a(com.mbridge.msdk.newreward.a.e eVar, Map map, com.mbridge.msdk.newreward.function.c.e eVar2) {
        com.mbridge.msdk.foundation.c.b bVar;
        List<CampaignEx> listC;
        if (eVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVarB = com.mbridge.msdk.foundation.same.report.d.c.a().b(eVar.z());
            if (bVarB == null) {
                bVarB = new com.mbridge.msdk.foundation.same.report.d.b();
                bVarB.c(eVar.z());
                bVarB.b(eVar.p());
            }
            bVarB.d(eVar.A());
            bVarB.e(eVar.C());
            bVarB.i(eVar.K() ? "1" : "0");
            if (eVar.x() != null) {
                bVarB.b(eVar.x().a());
            }
            if (eVar.r() != null) {
                com.mbridge.msdk.videocommon.d.a aVarA = eVar.r().a();
                if (aVarA != null) {
                    bVarB.h(aVarA.b());
                    bVarB.f(aVarA.c());
                }
                com.mbridge.msdk.videocommon.d.c cVarB = eVar.r().b();
                if (cVarB != null) {
                    bVarB.g(cVarB.l());
                    bVarB.n(cVarB.k());
                }
            }
            Object obj = (map == null || !map.containsKey("metrics_data")) ? null : map.get("metrics_data");
            switch (AnonymousClass1.f3375a[eVar2.ordinal()]) {
                case 1:
                    bVarB.a("2000125");
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a(map);
                    bVarB.a("2000125", dVar);
                    break;
                case 2:
                    bVarB.a("2000126");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        bVarB.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a(map);
                    bVarB.a("2000126", dVar2);
                    break;
                case 3:
                    bVarB.a("2000126");
                    com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar3.a(map);
                    bVarB.a("2000126", dVar3);
                    break;
                case 4:
                    bVarB.a("m_v3_req_retry_start");
                    com.mbridge.msdk.foundation.same.report.d.d dVar4 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar4.a(map);
                    bVarB.a("m_v3_req_retry_start", dVar4);
                    break;
                case 5:
                    bVarB.a("m_v3_req_retry_end");
                    com.mbridge.msdk.foundation.same.report.d.d dVar5 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar5.a(map);
                    bVarB.a("m_v3_req_retry_end", dVar5);
                    break;
                case 6:
                    bVarB.a("2000127");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        bVarB.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar6 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar6.a(map);
                    bVarB.a("2000127", dVar6);
                    break;
                case 7:
                    bVarB.a("2000048");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        bVarB.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar7 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar7.a(map);
                    bVarB.a("2000048", dVar7);
                    break;
                case 8:
                    bVarB.a("2000047");
                    if (obj != null && (obj instanceof com.mbridge.msdk.foundation.c.b) && (bVar = (com.mbridge.msdk.foundation.c.b) obj) != null) {
                        bVarB.a(bVar);
                        break;
                    }
                    break;
                case 9:
                    com.mbridge.msdk.foundation.same.report.d.d dVar8 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar8.a("m_load_check", Integer.valueOf(eVar.l() ? 1 : 0));
                    bVarB.a("2000128", dVar8);
                    bVarB.a("2000128");
                    break;
                case 10:
                    bVarB.a("m_download_start");
                    com.mbridge.msdk.foundation.same.report.d.d dVar9 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar9.a(map);
                    if (map != null && (map.get("resource_type") instanceof Integer)) {
                        iIntValue = ((Integer) map.get("resource_type")).intValue();
                    }
                    int i = iIntValue;
                    bVarB.a("m_download_start", dVar9, i);
                    bVarB.a(i);
                    break;
                case 11:
                    bVarB.a("m_download_end");
                    com.mbridge.msdk.foundation.same.report.d.d dVar10 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar10.a(map);
                    if (map != null && (map.get("resource_type") instanceof Integer)) {
                        iIntValue = ((Integer) map.get("resource_type")).intValue();
                    }
                    int i2 = iIntValue;
                    bVarB.a("m_download_end", dVar10, i2);
                    bVarB.a(i2);
                    break;
                case 12:
                    bVarB.a("m_candidate_data");
                    bVarB.a("m_candidate_data", (com.mbridge.msdk.foundation.same.report.d.d) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.d.d()));
                    break;
                case 13:
                    bVarB.a("m_candidate_db");
                    bVarB.a("m_candidate_db", (com.mbridge.msdk.foundation.same.report.d.d) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.d.d()));
                    break;
                case 14:
                    bVarB.a("m_load_check");
                    com.mbridge.msdk.newreward.function.d.a.b bVar2 = (map == null || !map.containsKey(FirebaseAnalytics.Param.CAMPAIGN)) ? null : (com.mbridge.msdk.newreward.function.d.a.b) map.remove(FirebaseAnalytics.Param.CAMPAIGN);
                    if (bVar2 != null && (listC = bVar2.C()) != null) {
                        bVarB.b(listC);
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar11 = new com.mbridge.msdk.foundation.same.report.d.d();
                    if (map != null) {
                        dVar11.a(map);
                    }
                    bVarB.a("m_load_check", dVar11);
                    break;
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVarB);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVarB.c(), bVarB, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: MetricsModel.java */
    /* renamed from: com.mbridge.msdk.newreward.function.f.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3375a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f3375a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DB.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3375a[com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public final void a(com.mbridge.msdk.newreward.b.b bVar, Map map, com.mbridge.msdk.newreward.function.c.e eVar) {
        if (bVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar2.c(bVar.b());
            bVar2.b(bVar.e());
            bVar2.d(bVar.c());
            bVar2.i(bVar.f() ? "1" : "0");
            if (bVar.g() != null) {
                com.mbridge.msdk.videocommon.d.a aVarA = bVar.g().a();
                if (aVarA != null) {
                    bVar2.h(aVarA.b());
                    bVar2.f(aVarA.c());
                }
                com.mbridge.msdk.videocommon.d.c cVarB = bVar.g().b();
                if (cVarB != null) {
                    bVar2.g(cVarB.l());
                    bVar2.n(cVarB.k());
                }
            }
            int i = AnonymousClass1.f3375a[eVar.ordinal()];
            if (i == 9) {
                bVar2.a("2000128");
            } else if (i == 15) {
                bVar2.a("2000131");
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a(map);
                bVar2.a("2000131", dVar);
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar2.c(), bVar2, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
