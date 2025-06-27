package com.mbridge.msdk.newreward.function.c.b.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CampaignRetryStrategy.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f3323a;
    private long c;
    private volatile boolean b = false;
    private int d = 0;
    private long e = 0;

    public final boolean a() {
        return this.b;
    }

    public a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f3323a = aVar;
    }

    public final void a(e eVar, com.mbridge.msdk.newreward.a.b.b bVar) {
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, eVar, "", false);
        b(eVar, bVar);
    }

    final void b(final e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        if (eVar == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.newreward.function.c.b.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.newreward.function.c.b bVar2 = new com.mbridge.msdk.newreward.function.c.b();
                bVar2.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
                HashMap map = new HashMap();
                final com.mbridge.msdk.newreward.a.e eVarB = eVar.b();
                map.put("adapter_model", eVarB);
                map.put("command_manager", eVar.d());
                bVar2.a(map);
                eVarB.c();
                a.this.f3323a.a(bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.a.1.1
                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(Object obj) {
                        a.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, "", true);
                        bVar.a(obj);
                    }

                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(com.mbridge.msdk.foundation.c.b bVar3) {
                        ad.a("CampaignRetryStrategy", "reqFailed，try retry");
                        if (!a.this.a(bVar3, eVar, eVarB)) {
                            a.this.b = true;
                            a.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, bVar3 != null ? bVar3.b() : "", false);
                            bVar.a(bVar3);
                        } else {
                            eVar.a(bVar3);
                            a.this.b(eVar, bVar);
                        }
                    }
                });
            }
        };
        ad.a("CampaignRetryStrategy", "retryReqCampaign，retryReqCampaign: " + this.c);
        MBridgeTaskManager.directorExecute(runnable, this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean a(com.mbridge.msdk.foundation.c.b r9, com.mbridge.msdk.newreward.function.c.b.b.e r10, com.mbridge.msdk.newreward.a.e r11) {
        /*
            r8 = this;
            r0 = 0
            if (r11 == 0) goto L89
            if (r9 == 0) goto L89
            if (r10 == 0) goto L89
            int r10 = r9.a()
            r1 = 2
            if (r10 != r1) goto L10
            goto L89
        L10:
            com.mbridge.msdk.foundation.tools.af r10 = com.mbridge.msdk.foundation.tools.af.a()
            r1 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r2 = "retry_strategy"
            java.lang.String r3 = "campaign_request_interval"
            int r10 = r10.a(r2, r3, r1)
            long r3 = (long) r10
            r8.c = r3
            com.mbridge.msdk.foundation.tools.af r10 = com.mbridge.msdk.foundation.tools.af.a()
            java.lang.String r1 = "campaign_request_max"
            int r10 = r10.a(r2, r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "campaignRequestRetryInvalidTime = "
            r1.append(r2)
            long r2 = r8.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CampaignRetryStrategy"
            com.mbridge.msdk.foundation.tools.ad.a(r2, r1)
            long r1 = r8.c
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L89
            if (r10 > 0) goto L4e
            goto L89
        L4e:
            java.lang.String r1 = "can_retry"
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto L5f
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L5e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> L5e
            if (r9 != 0) goto L5f
        L5e:
            return r0
        L5f:
            int r9 = r8.d
            if (r9 != 0) goto L69
            long r1 = java.lang.System.currentTimeMillis()
            r8.e = r1
        L69:
            int r9 = r8.d
            r1 = 1
            int r9 = r9 + r1
            r8.d = r9
            long r2 = r11.g()
            int r9 = r11.I()
            long r4 = (long) r9
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r2
            long r2 = r8.c
            long r4 = r4 - r2
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L89
            int r9 = r8.d
            if (r9 > r10) goto L89
            r0 = r1
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.c.b.b.a.a(com.mbridge.msdk.foundation.c.b, com.mbridge.msdk.newreward.function.c.b.b.e, com.mbridge.msdk.newreward.a.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, e eVar2, String str, boolean z) {
        if (eVar2 == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVarD = eVar2.d();
        com.mbridge.msdk.newreward.a.e eVarB = eVar2.b();
        if (cVarD == null || eVarB == null) {
            return;
        }
        try {
            int i = 1;
            Map mapA = cVarD.a("retry_count", Integer.valueOf(this.d), "type", 1);
            int i2 = AnonymousClass2.f3326a[eVar.ordinal()];
            if (i2 == 1) {
                cVarD.a(eVarB, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, mapA);
                return;
            }
            if (i2 != 2) {
                return;
            }
            mapA.put("duration", Long.valueOf(System.currentTimeMillis() - this.e));
            if (z) {
                mapA.put("reason", str);
            }
            if (!z) {
                i = 2;
            }
            mapA.put("result", Integer.valueOf(i));
            cVarD.a(eVarB, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, mapA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: CampaignRetryStrategy.java */
    /* renamed from: com.mbridge.msdk.newreward.function.c.b.b.a$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3326a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f3326a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3326a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
