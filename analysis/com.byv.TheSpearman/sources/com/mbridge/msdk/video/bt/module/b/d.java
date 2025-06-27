package com.mbridge.msdk.video.bt.module.b;

import android.content.Context;

/* compiled from: ProxyShowRewardListener.java */
/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private h f3609a;
    private com.mbridge.msdk.videocommon.d.c d;
    private String e;
    private String f;
    private boolean g;
    private Context h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r4, boolean r5, com.mbridge.msdk.videocommon.d.c r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.video.bt.module.b.h r8, java.lang.String r9, java.lang.String r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.i = r0
            r3.j = r0
            r3.k = r0
            r3.f3609a = r8
            r3.d = r6
            r3.e = r10
            r3.f = r9
            r3.g = r5
            r3.h = r4
            com.mbridge.msdk.foundation.controller.c r4 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L70
            java.lang.String r4 = r4.k()     // Catch: java.lang.Exception -> L70
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L70
            r8 = 0
            if (r5 != 0) goto L41
            com.mbridge.msdk.c.h r5 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L70
            com.mbridge.msdk.c.g r4 = r5.b(r4)     // Catch: java.lang.Exception -> L70
            if (r4 != 0) goto L37
            com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L70
            com.mbridge.msdk.c.g r4 = com.mbridge.msdk.c.i.a()     // Catch: java.lang.Exception -> L70
        L37:
            if (r4 == 0) goto L41
            long r4 = r4.ac()     // Catch: java.lang.Exception -> L70
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            goto L42
        L41:
            r4 = r8
        L42:
            com.mbridge.msdk.videocommon.d.b r10 = com.mbridge.msdk.videocommon.d.b.a()     // Catch: java.lang.Exception -> L70
            com.mbridge.msdk.videocommon.d.a r10 = r10.b()     // Catch: java.lang.Exception -> L70
            if (r10 == 0) goto L50
            long r8 = r10.f()     // Catch: java.lang.Exception -> L70
        L50:
            if (r7 == 0) goto L70
            boolean r4 = r7.isSpareOffer(r8, r4)     // Catch: java.lang.Exception -> L70
            if (r4 == 0) goto L6a
            r4 = 1
            r7.setSpareOfferFlag(r4)     // Catch: java.lang.Exception -> L70
            int r5 = r6.y()     // Catch: java.lang.Exception -> L70
            if (r5 != r4) goto L66
            r7.setCbt(r4)     // Catch: java.lang.Exception -> L70
            goto L70
        L66:
            r7.setCbt(r0)     // Catch: java.lang.Exception -> L70
            goto L70
        L6a:
            r7.setSpareOfferFlag(r0)     // Catch: java.lang.Exception -> L70
            r7.setCbt(r0)     // Catch: java.lang.Exception -> L70
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.b.d.<init>(android.content.Context, boolean, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.video.bt.module.b.h, java.lang.String, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        super.a(bVar);
        if (this.f3609a == null || this.i) {
            return;
        }
        this.i = true;
        this.c = true;
        this.f3609a.a(bVar);
        this.f3609a.a(2, this.f, this.e);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z, com.mbridge.msdk.videocommon.b.c cVar) {
        super.a(bVar, z, cVar);
        h hVar = this.f3609a;
        if (hVar == null || this.k) {
            return;
        }
        this.k = true;
        hVar.a(7, this.f, this.e);
        this.f3609a.a(bVar, z, cVar);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z, int i) {
        super.a(z, i);
        h hVar = this.f3609a;
        if (hVar == null || this.k) {
            return;
        }
        hVar.a(z, i);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        super.a(bVar, str);
        if (this.f3609a == null || this.j) {
            return;
        }
        this.j = true;
        this.c = true;
        this.f3609a.a(bVar, str);
        this.f3609a.a(4, this.f, this.e);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z, String str, String str2) {
        super.a(z, str, str2);
        h hVar = this.f3609a;
        if (hVar != null) {
            hVar.a(z, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void b(String str, String str2) {
        super.b(str, str2);
        h hVar = this.f3609a;
        if (hVar != null) {
            hVar.b(str, str2);
            this.f3609a.a(6, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(String str, String str2) {
        super.a(str, str2);
        h hVar = this.f3609a;
        if (hVar != null) {
            hVar.a(str, str2);
            this.f3609a.a(5, str, str2);
        }
    }
}
