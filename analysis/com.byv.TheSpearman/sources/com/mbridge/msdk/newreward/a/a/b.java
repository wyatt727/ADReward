package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.c.c;
import java.util.Map;

/* compiled from: RewardVideoLoadController.java */
/* loaded from: classes4.dex */
public final class b extends a {
    public b(c cVar) {
        super(cVar);
    }

    @Override // com.mbridge.msdk.newreward.a.b.b
    public final void a(Object obj) {
        Map map = (Map) obj;
        a(((Integer) map.get("type")).intValue(), map.get("object"));
    }

    @Override // com.mbridge.msdk.newreward.a.b.b
    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        if (bVar != null && this.c != null) {
            try {
                if (bVar.i() == -1) {
                    this.c.c(System.currentTimeMillis());
                }
                this.c.b(bVar.i() + "");
                com.mbridge.msdk.foundation.same.net.g.c.a().a(this.c.v() + "_" + this.c.w() + "_" + this.c.A() + "_" + this.c.p(), bVar.i(), bVar.k(), System.currentTimeMillis());
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
        if (!this.c.l() && !this.c.m() && !this.c.n()) {
            b(bVar);
        } else {
            a(this.b, bVar);
        }
    }
}
