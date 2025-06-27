package com.mbridge.msdk.newreward.function.c.b.a;

import com.json.t2;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Map;

/* compiled from: SmartLoadReceiver.java */
/* loaded from: classes4.dex */
public final class j implements com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f3321a;

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        if (bVar == null || bVar.b() == null) {
            a(bVar2, new com.mbridge.msdk.foundation.c.b(-1, "command or object is null"));
            return;
        }
        try {
            Map map = (Map) bVar.b();
            this.f3321a = (com.mbridge.msdk.foundation.c.b) map.get("reason");
            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
            com.mbridge.msdk.newreward.function.c.c cVar = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            map.put("candidate_type", 0);
            map.put("scene", 2);
            com.mbridge.msdk.newreward.function.a.b bVar3 = (com.mbridge.msdk.newreward.function.a.b) cVar.b(map);
            if (!com.mbridge.msdk.newreward.function.h.a.c(eVar.C())) {
                a(bVar2, this.f3321a);
                return;
            }
            eVar.f(true);
            if (bVar3 == null) {
                a(bVar2, this.f3321a);
                return;
            }
            if (bVar3.h() == com.mbridge.msdk.newreward.function.a.b.d) {
                eVar.x().a(bVar3.a());
                if (bVar2 != null) {
                    try {
                        bVar2.a(bVar3.a());
                        return;
                    } catch (Exception e) {
                        ad.a("SmartLoadReceiver", "handlerCandidateSuccess", e);
                        return;
                    }
                }
                return;
            }
            a(bVar2, new com.mbridge.msdk.foundation.c.b(bVar3.g(), bVar3.b()));
        } catch (Exception e2) {
            ad.a("SmartLoadReceiver", t2.h.h, e2);
            if (bVar2 != null) {
                com.mbridge.msdk.foundation.c.b bVar4 = this.f3321a;
                if (bVar4 == null) {
                    a(bVar2, new com.mbridge.msdk.foundation.c.b(-1, "SmartLoadReceiver action exception"));
                } else {
                    a(bVar2, bVar4);
                }
            }
        }
    }

    private static void a(com.mbridge.msdk.newreward.a.b.b bVar, com.mbridge.msdk.foundation.c.b bVar2) {
        if (bVar != null) {
            try {
                bVar.a(bVar2);
            } catch (Exception e) {
                ad.a("SmartLoadReceiver", "handlerCandidateFailed", e);
            }
        }
    }
}
