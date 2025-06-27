package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Map;

/* compiled from: CandidateReceiver.java */
/* loaded from: classes4.dex */
public final class a implements com.mbridge.msdk.newreward.function.c.b.d {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.b.a f3310a;

    public final Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        Map map = (Map) obj;
        com.mbridge.msdk.foundation.c.b bVar = map.get("reason") != null ? (com.mbridge.msdk.foundation.c.b) map.get("reason") : null;
        com.mbridge.msdk.newreward.a.e eVar = map.get("adapter_model") != null ? (com.mbridge.msdk.newreward.a.e) map.get("adapter_model") : null;
        com.mbridge.msdk.newreward.function.c.c cVar = map.get("command_manager") != null ? (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager") : null;
        if (eVar != null && cVar != null) {
            int iIntValue = map.get("candidate_type") != null ? ((Integer) map.get("candidate_type")).intValue() : 0;
            if (this.f3310a == null) {
                this.f3310a = new com.mbridge.msdk.newreward.function.b.a(eVar.A(), eVar.p() == 287, cVar);
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar2.c(eVar.z());
            if (iIntValue == 0) {
                String strC = eVar.C();
                if (TextUtils.isEmpty(strC)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b bVarA = this.f3310a.a(bVar2, bVar, eVar, 2);
                    this.f3310a.a(bVar2, strC, bVarA, null, null, eVar, 3);
                    return bVarA;
                } catch (Exception e) {
                    ad.b("CandidateReceiver", "load error" + e.getMessage());
                    return null;
                }
            }
            if (iIntValue == 1) {
                String strC2 = eVar.C();
                if (TextUtils.isEmpty(strC2)) {
                    return false;
                }
                try {
                    return Boolean.valueOf(this.f3310a.a(strC2));
                } catch (Exception e2) {
                    ad.b("CandidateReceiver", "loadCallBack error" + e2.getMessage());
                    return false;
                }
            }
            if (iIntValue == 2) {
                String strC3 = eVar.C();
                if (TextUtils.isEmpty(strC3)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b bVarA2 = this.f3310a.a(bVar2, bVar, eVar, 2);
                    com.mbridge.msdk.newreward.function.b.a aVar = this.f3310a;
                    if (aVar != null) {
                        aVar.a(bVar2, strC3, bVarA2, null, null, eVar, 1);
                    }
                    return bVarA2;
                } catch (Exception e3) {
                    ad.b("CandidateReceiver", "loadCallBack error" + e3.getMessage());
                    return null;
                }
            }
            if (TextUtils.isEmpty(eVar.C())) {
                return null;
            }
            try {
                return this.f3310a.a(bVar2, bVar, eVar, 2);
            } catch (Exception e4) {
                ad.b("CandidateReceiver", "load error" + e4.getMessage());
            }
        }
        return null;
    }
}
