package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.out.MBridgeIds;

/* compiled from: LoadController.java */
/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.newreward.a.b.b {
    private static String d = "LoadController";

    /* renamed from: a, reason: collision with root package name */
    protected c f3256a;
    protected MBridgeIds b;
    protected e c;
    private RewardVideoListener e;

    public a(c cVar) {
        this.f3256a = cVar;
    }

    protected final void b(final com.mbridge.msdk.foundation.c.b bVar) {
        c cVar = this.f3256a;
        cVar.b(cVar.a("adapter_model", this.c, "command_manager", cVar, "scene", 2, "reason", bVar), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a.this.a(1, obj);
                a.this.a(2, obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                a aVar = a.this;
                aVar.a(aVar.b, bVar);
            }
        });
    }

    public final void a(int i, Object obj) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.c.b(2);
            if (this.c.i()) {
                return;
            }
            this.f3256a.a(this.c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS, this.f3256a.a("cache", 2));
            if (this.e != null) {
                this.c.d(true);
                this.e.onVideoLoadSuccess(this.b);
                return;
            }
            return;
        }
        if (this.c.h()) {
            return;
        }
        c cVar = this.f3256a;
        e eVar = this.c;
        com.mbridge.msdk.newreward.function.c.e eVar2 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS;
        c cVar2 = this.f3256a;
        Object[] objArr = new Object[6];
        objArr[0] = "metrics_data";
        objArr[1] = obj;
        objArr[2] = "auto_load";
        objArr[3] = Integer.valueOf(this.c.B() ? 2 : 1);
        objArr[4] = "cache";
        objArr[5] = 2;
        cVar.a(eVar, eVar2, cVar2.a(objArr));
        if (this.e != null) {
            this.c.c(true);
            this.e.onLoadSuccess(this.b);
        }
    }

    public final void a(MBridgeIds mBridgeIds, com.mbridge.msdk.foundation.c.b bVar) {
        this.c.b(2);
        if (this.c.i()) {
            return;
        }
        this.f3256a.a(this.c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, this.f3256a.a("metrics_data", bVar));
        if (this.e != null) {
            this.c.d(true);
            RewardVideoListener rewardVideoListener = this.e;
            if (rewardVideoListener != null) {
                rewardVideoListener.onVideoLoadFail(mBridgeIds, bVar.b());
            }
        }
    }

    public final void a(e eVar) {
        eVar.b(1);
        this.c = eVar;
        this.e = eVar.D();
        MBridgeIds mBridgeIds = (MBridgeIds) this.f3256a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        this.b = mBridgeIds;
        mBridgeIds.setLocalRequestId(this.c.z());
        this.b.setBidToken(this.c.C());
        c cVar = this.f3256a;
        cVar.c(cVar.a("command_type", com.mbridge.msdk.newreward.function.c.e.PRE_HANDLE_LOAD, "command_manager", this.f3256a, "adapter_model", this.c), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a.this.f3256a.a(a.this.f3256a.a("command_manager", a.this.f3256a, "adapter_model", a.this.c), a.this);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar) {
                a aVar = a.this;
                aVar.a(aVar.b, bVar);
            }
        });
    }
}
