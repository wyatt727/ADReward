package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* compiled from: ReqDownBigTempleService.java */
/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f3263a;
    private com.mbridge.msdk.newreward.a.e b;
    private int c = 0;

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.b bVar2 = (com.mbridge.msdk.newreward.function.d.a.b) obj;
        final com.mbridge.msdk.newreward.function.d.c.d<?> dVarU = bVar2.u();
        if (bVar2 != null && bVar2.F() != null) {
            if (bVar2.F().containsKey("command_manager")) {
                this.f3263a = (com.mbridge.msdk.newreward.function.c.c) bVar2.F().get("command_manager");
            }
            if (bVar2.F().containsKey("adapter_model")) {
                this.b = (com.mbridge.msdk.newreward.a.e) bVar2.F().get("adapter_model");
            }
        }
        if (dVarU == null) {
            bVar.a(bVar2);
            return;
        }
        if (dVarU.e() == 1) {
            this.c = 1;
        } else {
            this.c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, bVar2, 0, "");
        dVarU.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.d.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
                if (bVar3.x()) {
                    bVar.a(bVar3);
                }
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 1, "");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 3, mBridgeError != null ? mBridgeError.getErrorMessage() : "");
                a(bVar3, bVar, mBridgeError, "errorCode: 3203 errorMessage:");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 2, mBridgeError != null ? mBridgeError.getErrorMessage() : "");
                a(bVar3, bVar, mBridgeError, "errorCode: 3401 errorMessage: ");
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, b bVar4, MBridgeError mBridgeError, String str) {
                if (bVar3.x()) {
                    try {
                        bVar4.a(bVar3);
                        return;
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("ReqDownBigTempleService", "doReq: ", e);
                            return;
                        }
                        return;
                    }
                }
                int errorCode = -1;
                String errorMessage = "big temp load fail ";
                if (mBridgeError != null) {
                    try {
                        errorCode = mBridgeError.getErrorCode();
                        errorMessage = mBridgeError.getErrorMessage();
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("ReqDownBigTempleService", "doReq: ", e2);
                            return;
                        }
                        return;
                    }
                }
                if (dVarU.c()) {
                    return;
                }
                bVar4.a(com.mbridge.msdk.foundation.c.a.a(errorCode, 880005, str + errorMessage));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, int i, String str) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.f3263a;
        if (cVar == null || this.b == null) {
            return;
        }
        try {
            Map mapA = cVar.a("resource_type", 1, "url", bVar.u().j());
            int i2 = AnonymousClass2.f3265a[eVar.ordinal()];
            if (i2 == 1) {
                mapA.put("cache", Integer.valueOf(this.c));
                this.f3263a.a(this.b, eVar, mapA);
            } else if (i2 == 2 && this.c == 2) {
                mapA.put("result", Integer.valueOf(i));
                if (i != 1) {
                    mapA.put("reason", str);
                }
                this.f3263a.a(this.b, eVar, mapA);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: ReqDownBigTempleService.java */
    /* renamed from: com.mbridge.msdk.newreward.a.b.d$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3265a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f3265a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3265a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
