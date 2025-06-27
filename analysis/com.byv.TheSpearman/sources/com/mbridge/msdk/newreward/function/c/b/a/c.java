package com.mbridge.msdk.newreward.function.c.b.a;

import com.json.t2;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Map;

/* compiled from: LoadCheckReceiver.java */
/* loaded from: classes4.dex */
public final class c implements com.mbridge.msdk.newreward.function.c.b.d {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.b f3311a;

    public final Object a(Object obj) {
        com.mbridge.msdk.newreward.b.b bVar;
        com.mbridge.msdk.newreward.function.c.c cVar;
        com.mbridge.msdk.newreward.a.d dVar;
        if (this.f3311a != null || obj == null) {
            return null;
        }
        try {
            Map map = (Map) obj;
            bVar = (com.mbridge.msdk.newreward.b.b) map.get("controller_model");
            cVar = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            dVar = (com.mbridge.msdk.newreward.a.d) map.get("adapter_manager");
        } catch (Exception e) {
            ad.a("LoadCheckReceiver", t2.h.h, e);
        }
        if (bVar != null && cVar != null && dVar != null) {
            com.mbridge.msdk.newreward.function.f.b bVar2 = new com.mbridge.msdk.newreward.function.f.b(bVar.e(), bVar.d(), bVar.c(), bVar.f());
            this.f3311a = bVar2;
            bVar2.a(cVar, dVar);
            return null;
        }
        return null;
    }
}
