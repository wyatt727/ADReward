package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z;

/* compiled from: PlayableReportUtils.java */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f2936a = new Handler(Looper.getMainLooper());

    public static void a(CampaignEx campaignEx, String str, String str2, String str3) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", TextUtils.isEmpty(campaignEx.getMraid()) ^ true ? 1 : 3, "0", "", campaignEx.getId(), str2, str, String.valueOf(campaignEx.getKeyIaRst()));
        nVar.e(campaignEx.getId());
        nVar.f(campaignEx.getRequestId());
        nVar.s(campaignEx.getCurrentLocalRid());
        nVar.g(campaignEx.getRequestIdNotice());
        nVar.c(campaignEx.getAdSpaceT());
        nVar.d(str3);
        nVar.e(7);
        nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.f2819a : com.mbridge.msdk.foundation.entity.n.b);
        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
    }

    public static void a(com.mbridge.msdk.foundation.entity.n nVar, String str, CampaignEx campaignEx) {
        int adType;
        if (nVar != null) {
            nVar.j(z.c());
            if (campaignEx != null && ((adType = campaignEx.getAdType()) == 94 || adType == 287)) {
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
                return;
            }
            String strE = com.mbridge.msdk.foundation.entity.n.e(nVar);
            if (e.a().b()) {
                e.a().a(strE);
            } else {
                a(strE, com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
    }

    public static void a(String str, Context context, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a(new com.mbridge.msdk.foundation.same.f.a(str, str2));
    }

    private static void a(Runnable runnable) {
        Handler handler = f2936a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.a("2000063");
            nVar.c(str);
            nVar.a(z.l(context));
            String strD = com.mbridge.msdk.foundation.entity.n.d(nVar);
            if (e.a().b()) {
                e.a().a(strD);
            } else {
                a(strD, context, str);
            }
        }
    }

    public static void b(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        String strB = com.mbridge.msdk.foundation.entity.n.b(nVar);
        if (e.a().b()) {
            e.a().a(strB);
        } else {
            a(strB, context, str);
        }
    }

    public static void c(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        String strC = com.mbridge.msdk.foundation.entity.n.c(nVar);
        if (e.a().b()) {
            e.a().a(strC);
        } else {
            a(strC, context, str);
        }
    }

    public static void b(com.mbridge.msdk.foundation.entity.n nVar, String str, CampaignEx campaignEx) {
        if (nVar != null) {
            nVar.a("2000059");
            nVar.c(str);
            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
            nVar.j(z.c());
            String strG = com.mbridge.msdk.foundation.entity.n.g(nVar);
            if (e.a().b()) {
                e.a().a(strG);
            } else {
                a(strG, com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
    }

    public static void d(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.a("2000060");
            nVar.c(str);
            nVar.a(z.l(context));
            String strF = com.mbridge.msdk.foundation.entity.n.f(nVar);
            if (e.a().b()) {
                e.a().a(strF);
            } else {
                a(strF, context, str);
            }
        }
    }
}
