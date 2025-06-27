package com.mbridge.msdk.newreward.function.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: LoadCheckController.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f3369a;
    private final String b;
    private final String c;
    private final boolean d;
    private Handler g;
    private com.mbridge.msdk.newreward.function.c.c i;
    private com.mbridge.msdk.newreward.a.d l;
    private volatile boolean j = false;
    private volatile boolean k = false;
    private int e = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_INTERVAL, 120000);
    private long h = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_TOKEN_VALIDITY_PERIOD, 1800000);
    private boolean f = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_OPTIMIZED, false);

    public b(int i, String str, String str2, boolean z) {
        this.f3369a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar, com.mbridge.msdk.newreward.a.d dVar) {
        if (cVar == null || dVar == null) {
            a();
            return;
        }
        if (!this.f) {
            a();
            return;
        }
        this.l = dVar;
        this.i = cVar;
        HandlerThread handlerThread = new HandlerThread("load_check_controller");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.g = handler;
        handler.postDelayed(new Runnable() { // from class: com.mbridge.msdk.newreward.function.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.a(b.this);
                } catch (Exception e) {
                    ad.a("LoadCheckController", "startCheckTask error: " + e.getMessage());
                }
                b.this.g.postDelayed(this, b.this.e);
            }
        }, this.e);
    }

    private void a() {
        com.mbridge.msdk.newreward.function.e.c.a().b().b(this.f3369a, this.b, this.c);
    }

    private void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        eVar.y().a(bVar, bVar2);
    }

    private com.mbridge.msdk.newreward.a.e a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        com.mbridge.msdk.newreward.a.e eVar = new com.mbridge.msdk.newreward.a.e(false, this.f3369a, bVar.f(), this.c, bVar.g());
        eVar.e(bVar.e());
        eVar.e(30000);
        eVar.f(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        eVar.d(this.b);
        eVar.e(true);
        eVar.f(false);
        eVar.g(false);
        return eVar;
    }

    static /* synthetic */ void a(b bVar) {
        if (bVar.l.a() != null) {
            Iterator<com.mbridge.msdk.newreward.a.e> it = bVar.l.a().iterator();
            while (it.hasNext()) {
                if (it.next().s() == 1) {
                    return;
                }
            }
        }
        if (bVar.j) {
            return;
        }
        bVar.j = true;
        com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.f3369a, bVar.b, bVar.c, bVar.d, new com.mbridge.msdk.newreward.function.e.b() { // from class: com.mbridge.msdk.newreward.function.f.b.2
            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a(List<com.mbridge.msdk.newreward.function.d.a.b> list) {
                b.a(b.this, list);
            }

            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a() {
                b.a(b.this, (com.mbridge.msdk.newreward.a.e) null, (com.mbridge.msdk.newreward.function.d.a.b) null);
            }
        });
    }

    static /* synthetic */ void a(b bVar, List list) {
        Iterator it = list.iterator();
        final com.mbridge.msdk.newreward.function.d.a.b bVar2 = null;
        final com.mbridge.msdk.newreward.function.d.a.b bVar3 = null;
        while (it.hasNext()) {
            com.mbridge.msdk.newreward.function.d.a.b bVar4 = (com.mbridge.msdk.newreward.function.d.a.b) it.next();
            if (bVar4.g()) {
                long jG = bVar4.G();
                if (jG == 0) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (TextUtils.isEmpty(bVar4.f())) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (System.currentTimeMillis() - jG > bVar.h && bVar4.s() == null) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (bVar4.q() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && bVar4.E() != 1) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (bVar3 == null || bVar4.q() > bVar3.q()) {
                    bVar3 = bVar4;
                }
            } else if (bVar4.G() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else if (bVar4.C() == null || bVar4.C().size() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else if (bVar3 == null || bVar4.G() > bVar3.G()) {
                bVar3 = bVar4;
            }
        }
        if (list != null && list.size() != 0 && !bVar.k) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.mbridge.msdk.newreward.function.d.a.b bVar5 = (com.mbridge.msdk.newreward.function.d.a.b) it2.next();
                if (bVar5 != bVar3 && bVar5.s() != null && (bVar2 == null || bVar5.G() > bVar2.G())) {
                    bVar2 = bVar5;
                }
            }
        }
        if (!bVar.k && bVar2 != null) {
            bVar.k = true;
            final com.mbridge.msdk.newreward.a.e eVarA = bVar.a(bVar2);
            try {
                bVar.i.a(eVarA, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, bVar.i.a("check_type", "download_start_resource", FirebaseAnalytics.Param.CAMPAIGN, bVar2));
            } catch (Exception e) {
                ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e.getMessage());
            }
            bVar.a(eVarA, bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.4
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.this.k = false;
                    try {
                        b.this.i.a(eVarA, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.i.a("check_type", "download_success", FirebaseAnalytics.Param.CAMPAIGN, bVar2));
                    } catch (Exception e2) {
                        ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e2.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.this.k = false;
                    try {
                        b.this.i.a(eVarA, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.i.a("check_type", "download_failed", FirebaseAnalytics.Param.CAMPAIGN, bVar2));
                    } catch (Exception e2) {
                        ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e2.getMessage());
                    }
                }
            });
        }
        if (bVar3 != null) {
            List<CampaignEx> listC = bVar3.C();
            final com.mbridge.msdk.newreward.a.e eVarA2 = bVar.a(bVar3);
            if (listC == null) {
                try {
                    bVar.i.a(eVarA2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, bVar.i.a("check_type", "check_start_campaign"));
                } catch (Exception e2) {
                    ad.b("LoadCheckController", "handlerLoadFailedCampaigns error: " + e2.getMessage());
                }
                com.mbridge.msdk.newreward.function.c.c cVar = bVar.i;
                cVar.a(cVar.a("command_manager", cVar, "adapter_model", eVarA2), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.5
                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(Object obj) {
                        b.a(b.this, bVar3, eVarA2);
                    }

                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                        b.a(b.this, eVarA2, bVar3);
                    }
                });
                return;
            }
            try {
                bVar.i.a(eVarA2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, bVar.i.a("check_type", "check_start_resource"));
            } catch (Exception e3) {
                ad.b("LoadCheckController", "handlerLoadFailedCampaigns error: " + e3.getMessage());
            }
            bVar.a(eVarA2, bVar3, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.3
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.a(b.this, bVar3, eVarA2);
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.a(b.this, eVarA2, bVar3);
                }
            });
            return;
        }
        bVar.j = false;
    }

    static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar2) {
        Map mapA;
        bVar.j = false;
        if (eVar == null) {
            return;
        }
        try {
            if (bVar2 == null) {
                mapA = bVar.i.a("check_type", "check_failed");
            } else {
                mapA = bVar.i.a("check_type", "check_failed", FirebaseAnalytics.Param.CAMPAIGN, bVar2);
            }
            bVar.i.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, mapA);
        } catch (Exception e) {
            ad.b("LoadCheckController", "reportLoadCheckFailed error: " + e.getMessage());
        }
    }

    static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.a.e eVar) {
        bVar.j = false;
        if (eVar == null) {
            return;
        }
        bVar.i.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, bVar.i.a("check_type", "check_success", FirebaseAnalytics.Param.CAMPAIGN, bVar2));
        eVar.d(true);
        if (!bVar2.g() || bVar2.q() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bVar.l.a(eVar);
        }
    }
}
