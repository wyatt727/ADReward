package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* compiled from: NetManager.java */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f2998a;

    public static synchronized ConnectivityManager a() {
        try {
        } catch (Exception e) {
            ad.b("NetManager", e.getMessage());
        }
        if (f2998a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            f2998a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.m().c().getSystemService("connectivity");
        }
        return f2998a;
    }
}
