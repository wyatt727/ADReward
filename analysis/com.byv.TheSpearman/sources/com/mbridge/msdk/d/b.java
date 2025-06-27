package com.mbridge.msdk.d;

import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.d.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: TimerController.java */
/* loaded from: classes4.dex */
public class b {

    /* compiled from: TimerController.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static b f2552a = new b();
    }

    private b() {
    }

    public static b getInstance() {
        return a.f2552a;
    }

    public void start() {
        g gVarB = h.a().b(c.m().k());
        if (gVarB == null) {
            h.a();
            gVarB = i.a();
        }
        if (gVarB.l() > 0) {
            a.C0257a.f2551a.a(r0 * 1000);
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            a.C0257a.f2551a.a(str, str2);
        } catch (Exception e) {
            ad.b("TimerController", "addRewardList error:" + e.getMessage());
        }
    }

    public void addInterstitialList(String str, String str2) {
        try {
            a.C0257a.f2551a.b(str, str2);
        } catch (Exception e) {
            ad.b("TimerController", "addInterstitialList error:" + e.getMessage());
        }
    }
}
