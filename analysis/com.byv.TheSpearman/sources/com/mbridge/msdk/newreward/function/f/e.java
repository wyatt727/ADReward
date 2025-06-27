package com.mbridge.msdk.newreward.function.f;

import com.json.t2;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: SettingModel.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f3378a = com.mbridge.msdk.foundation.controller.c.m().k();
    private String b;
    private int c;
    private g d;
    private com.mbridge.msdk.videocommon.d.a e;
    private com.mbridge.msdk.videocommon.d.c f;

    public final com.mbridge.msdk.videocommon.d.a a() {
        return this.e;
    }

    public final com.mbridge.msdk.videocommon.d.c b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(t2.h.W, "2000112");
            dVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.g.d.f().s));
            int i2 = 0;
            if (eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_START) {
                i2 = 3;
            } else if (eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_SUCCESS) {
                i2 = 1;
            } else if (eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_FAIL) {
                i2 = 2;
            }
            dVar.a("result", Integer.valueOf(i2));
            dVar.a("type", Integer.valueOf(i));
            dVar.a("url", com.mbridge.msdk.foundation.same.net.g.d.f().r ? com.mbridge.msdk.foundation.same.net.g.d.f().J : com.mbridge.msdk.foundation.same.net.g.d.f().I);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th) {
            ad.b("SettingModel", th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, com.mbridge.msdk.newreward.a.b.b r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.f.e.a(java.lang.Object, com.mbridge.msdk.newreward.a.b.b):void");
    }
}
