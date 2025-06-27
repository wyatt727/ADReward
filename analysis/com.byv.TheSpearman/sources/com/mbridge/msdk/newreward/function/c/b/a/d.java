package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.Map;
import java.util.UUID;

/* compiled from: LoadControllerReceiver.java */
/* loaded from: classes4.dex */
public final class d implements a.InterfaceC0282a, com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.a.a f3312a;
    com.mbridge.msdk.newreward.a.b.b b;
    com.mbridge.msdk.newreward.function.c.c c;
    com.mbridge.msdk.newreward.a.e d;
    com.mbridge.msdk.newreward.function.c.b.b.c e;
    private Map i;
    private String f = UUID.randomUUID().toString();
    private String g = UUID.randomUUID().toString();
    private long h = 10000;
    private volatile boolean j = false;

    public final void a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f3312a = aVar;
        this.e = new com.mbridge.msdk.newreward.function.c.b.b.c(aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        try {
            this.b = bVar2;
            int iB = b();
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f, iB, this);
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            Map map = (Map) bVar.b();
            this.i = map;
            this.c = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) this.i.get("adapter_model");
            this.d = eVar;
            eVar.f(iB);
            com.mbridge.msdk.newreward.function.c.c cVar = this.c;
            com.mbridge.msdk.newreward.a.e eVar2 = this.d;
            com.mbridge.msdk.newreward.function.c.e eVar3 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START;
            com.mbridge.msdk.newreward.function.c.c cVar2 = this.c;
            Object[] objArr = new Object[4];
            objArr[0] = "auto_load";
            objArr[1] = Integer.valueOf(this.d.B() ? 2 : 1);
            objArr[2] = "hst";
            objArr[3] = com.mbridge.msdk.foundation.same.net.g.d.f().a(this.d.C());
            cVar.a(eVar2, eVar3, cVar2.a(objArr));
            this.f3312a.a(bVar, new a(bVar, this.i));
            long jA = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY, MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT, 0);
            this.h = jA;
            if (jA > 0) {
                com.mbridge.msdk.newreward.a.c.a.a().a(this.g, this.h, this);
            }
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.d.p(), this.d.w(), this.d.A(), this.d.z(), !TextUtils.isEmpty(this.d.C()), this.d.C(), this.d.L());
        } catch (Exception e) {
            ad.a("LoadControllerReceiver", t2.h.h, e);
            if (this.d != null) {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.d.p(), this.d.w(), this.d.A(), this.d.z(), 8);
            }
            com.mbridge.msdk.newreward.a.c.a.a().a(this.g);
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f);
            if (bVar2 != null) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e.getMessage()));
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0282a
    public final void a(String str, long j) {
        if (TextUtils.equals(str, this.f)) {
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.d.p(), this.d.w(), this.d.A(), this.d.z(), 405);
            String strA = a();
            this.b.a(new com.mbridge.msdk.foundation.c.b(880010, "errorCode: 3401 errorMessage: " + strA));
            return;
        }
        if (!TextUtils.equals(str, this.g) || this.e == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(null, this.d, this.c, 3);
        com.mbridge.msdk.newreward.function.c.b bVar = new com.mbridge.msdk.newreward.function.c.b();
        bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
        com.mbridge.msdk.newreward.function.c.c cVar = this.c;
        bVar.a(cVar.a("adapter_model", this.d, "command_manager", cVar));
        this.e.a(eVar, new a(bVar, this.i));
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.d;
            if (eVar != null && eVar.x() != null) {
                com.mbridge.msdk.newreward.function.d.a.b bVarB = this.d.x().b();
                if (bVarB != null && bVarB.s() != null && bVarB.s().size() > 0) {
                    for (com.mbridge.msdk.newreward.function.d.a.a aVar : bVarB.s()) {
                        if (aVar != null) {
                            n nVarD = aVar.d();
                            if (nVarD != null && !nVarD.c()) {
                                sb.append(" video timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> dVarC = aVar.c();
                            if (dVarC != null && !dVarC.c()) {
                                sb.append(" video_template timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> dVarF = aVar.f();
                            if (dVarF != null && !dVarF.c()) {
                                sb.append(" ec_template timeout ");
                            }
                        }
                    }
                } else {
                    sb.append(" load timeout ");
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    private int b() {
        com.mbridge.msdk.newreward.function.f.e eVarR;
        com.mbridge.msdk.videocommon.d.c cVarB;
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.d;
            return (eVar == null || (eVarR = eVar.r()) == null || (cVarB = eVarR.b()) == null) ? MBridgeCommon.DEFAULT_LOAD_TIMEOUT : cVarB.F() * 1000;
        } catch (Exception unused) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
    }

    /* compiled from: LoadControllerReceiver.java */
    private final class a implements com.mbridge.msdk.newreward.a.b.b {
        private final com.mbridge.msdk.newreward.function.c.b b;
        private final Map c;

        public a(com.mbridge.msdk.newreward.function.c.b bVar, Map map) {
            this.b = bVar;
            this.c = map;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.foundation.c.b bVarA;
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.g);
            if (d.this.j) {
                return;
            }
            d.this.j = true;
            com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
            com.mbridge.msdk.newreward.function.c.c cVar = d.this.c;
            com.mbridge.msdk.newreward.a.e eVar = d.this.d;
            com.mbridge.msdk.newreward.function.c.e eVar2 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS;
            com.mbridge.msdk.newreward.function.c.c cVar2 = d.this.c;
            Object[] objArr = new Object[12];
            objArr[0] = "metrics_data";
            objArr[1] = bVar;
            objArr[2] = "auto_load";
            objArr[3] = Integer.valueOf(d.this.d.B() ? 2 : 1);
            objArr[4] = "result";
            objArr[5] = 1;
            objArr[6] = "cache";
            objArr[7] = 2;
            objArr[8] = "timeout";
            objArr[9] = Integer.valueOf(d.this.d.I());
            objArr[10] = "hst";
            objArr[11] = bVar != null ? bVar.H() : "";
            cVar.a(eVar, eVar2, cVar2.a(objArr));
            d.this.b.a(d.this.c.a("type", 1, "object", bVar));
            ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).increaseOffset(bVar.s().size());
            d.this.c.d(d.this.c.a("adapter_model", d.this.d, FirebaseAnalytics.Param.CAMPAIGN, bVar));
            try {
                d.this.c.c(d.this.c.a("adapter_model", d.this.d, FirebaseAnalytics.Param.CAMPAIGN, bVar));
                this.b.a(com.mbridge.msdk.newreward.function.c.e.REQ_DOWN_CAMPAIGN);
                this.c.put(FirebaseAnalytics.Param.CAMPAIGN, bVar);
                this.b.a(this.c);
                d.this.f3312a.a(this.b, new b());
            } catch (MBridgeError e) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 403);
                if (e.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    bVarA = com.mbridge.msdk.foundation.c.a.a(e.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e.getErrorMessage());
                } else {
                    bVarA = com.mbridge.msdk.foundation.c.a.a(e.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e.getErrorMessage());
                }
                d.this.b.a(bVarA);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            int i = 1;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, d.this.d, d.this.c, 1);
            if (!d.this.e.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.g);
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f);
                if (d.this.j) {
                    return;
                }
                d.this.j = true;
                try {
                    com.mbridge.msdk.newreward.function.c.c cVar = d.this.c;
                    com.mbridge.msdk.newreward.a.e eVar2 = d.this.d;
                    com.mbridge.msdk.newreward.function.c.e eVar3 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL;
                    com.mbridge.msdk.newreward.function.c.c cVar2 = d.this.c;
                    Object[] objArr = new Object[14];
                    objArr[0] = "auto_load";
                    objArr[1] = Integer.valueOf(d.this.d.B() ? 2 : 1);
                    objArr[2] = "result";
                    if (!bVar.m()) {
                        i = 2;
                    }
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = "code";
                    objArr[5] = Integer.valueOf(bVar.i());
                    objArr[6] = "reason";
                    objArr[7] = bVar.b();
                    objArr[8] = "timeout";
                    objArr[9] = Integer.valueOf(d.this.d.I());
                    objArr[10] = "hst";
                    objArr[11] = bVar.j();
                    objArr[12] = "err_desc";
                    objArr[13] = bVar.l();
                    cVar.a(eVar2, eVar3, cVar2.a(objArr));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).resetOffset();
                if (bVar != null) {
                    try {
                        if (bVar.a("campaign_request_error_type") != null) {
                            com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.d.p(), d.this.d.w(), d.this.d.A(), d.this.d.z(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                        }
                    } catch (Exception unused) {
                    }
                }
                d.this.b.a(bVar);
                return;
            }
            d.this.e.a(eVar, this);
        }
    }

    /* compiled from: LoadControllerReceiver.java */
    private class b implements com.mbridge.msdk.newreward.a.b.b {
        private b() {
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f);
            d.this.b.a(d.this.c.a("type", 2, "object", obj));
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, d.this.d, d.this.c, 2);
            if (d.this.e == null || !d.this.e.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.d.p(), d.this.d.w(), d.this.d.A(), d.this.d.z(), 404);
                d.this.b.a(bVar);
                return;
            }
            d.this.e.a(eVar, this);
        }
    }
}
