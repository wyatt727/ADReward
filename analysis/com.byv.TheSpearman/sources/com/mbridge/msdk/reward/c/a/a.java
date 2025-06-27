package com.mbridge.msdk.reward.c.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.videocommon.d.c;
import java.util.List;

/* compiled from: MetricsRewardReport.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f3453a;

    private a() {
    }

    public static a a() {
        if (f3453a == null) {
            synchronized (a.class) {
                if (f3453a == null) {
                    f3453a = new a();
                }
            }
        }
        return f3453a;
    }

    public final void a(String str, b bVar) {
        b bVar2;
        List<CampaignEx> listH;
        try {
            if (bVar == null) {
                try {
                    bVar2 = new b();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            } else {
                bVar2 = bVar;
            }
            com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
            if (aVarB != null) {
                bVar2.h(aVarB.b());
                bVar2.f(aVarB.c());
            }
            if (bVar != null) {
                try {
                    int iJ = bVar.j();
                    String strI = bVar.i();
                    if (TextUtils.isEmpty(strI) && (listH = bVar.h()) != null && listH.size() > 0 && listH.get(0) != null) {
                        strI = listH.get(0).getCampaignUnitId();
                        iJ = listH.get(0).getAdType();
                        bVar.b(iJ);
                        bVar.d(strI);
                    }
                    c cVarA = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), strI, iJ == 287);
                    if (cVarA != null) {
                        bVar.g(cVarA.l());
                        bVar.n(cVarA.k());
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        }
    }
}
