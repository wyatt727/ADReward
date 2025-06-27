package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* compiled from: ReqEcService.java */
/* loaded from: classes4.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f3269a;
    private com.mbridge.msdk.newreward.a.e b;
    private int c = 0;

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        final com.mbridge.msdk.newreward.function.d.c.d<?> dVarF = aVar.f();
        if (aVar != null && aVar.h().F() != null) {
            if (aVar.h().F().containsKey("command_manager")) {
                this.f3269a = (com.mbridge.msdk.newreward.function.c.c) aVar.h().F().get("command_manager");
            }
            if (aVar.h().F().containsKey("adapter_model")) {
                this.b = (com.mbridge.msdk.newreward.a.e) aVar.h().F().get("adapter_model");
            }
        }
        if (dVarF == null) {
            bVar.a(aVar);
            return;
        }
        if (dVarF.e() == 1) {
            this.c = 1;
        } else {
            this.c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, 0, aVar, null);
        dVarF.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.f.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
                f.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 1, aVar2, null);
                if (dVarF.c()) {
                    bVar.a(aVar2);
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                f.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 3, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError, "errorCode: 3202 errorMessage: ");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                f.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 2, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError, "errorCode: 3401 errorMessage: ");
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar2, MBridgeError mBridgeError, String str) {
                if (bVar2.x()) {
                    try {
                        bVar3.a(aVar2);
                        return;
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("ReqEcService", "doReq: ", e);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if (dVarF.c()) {
                        return;
                    }
                    bVar3.a(com.mbridge.msdk.foundation.c.a.a(mBridgeError.getErrorCode(), 880007, str + mBridgeError.getErrorMessage()));
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("ReqEcService", "doReq: ", e2);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i, com.mbridge.msdk.newreward.function.d.a.a aVar, MBridgeError mBridgeError) {
        if (this.f3269a == null || this.b == null) {
            return;
        }
        try {
            com.mbridge.msdk.newreward.function.d.c.d<?> dVarF = aVar.f();
            com.mbridge.msdk.newreward.function.c.c cVar = this.f3269a;
            Object[] objArr = new Object[10];
            objArr[0] = "resource_type";
            objArr[1] = 3;
            objArr[2] = "scenes";
            objArr[3] = 1;
            objArr[4] = "url";
            objArr[5] = dVarF.j();
            objArr[6] = CampaignEx.JSON_KEY_READY_RATE;
            objArr[7] = 100;
            objArr[8] = "mraid_type";
            objArr[9] = Integer.valueOf(aVar.i() ? 1 : 0);
            Map mapA = cVar.a(objArr);
            int i2 = AnonymousClass2.f3271a[eVar.ordinal()];
            if (i2 == 1) {
                mapA.put("cache", Integer.valueOf(this.c));
                this.f3269a.a(this.b, eVar, mapA);
            } else if (i2 == 2 && this.c == 2) {
                mapA.put("result", Integer.valueOf(i));
                if (i != 1 && mBridgeError != null) {
                    mapA.put("reason", mBridgeError.getErrorMessage());
                }
                this.f3269a.a(this.b, eVar, mapA);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: ReqEcService.java */
    /* renamed from: com.mbridge.msdk.newreward.a.b.f$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3271a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f3271a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3271a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
