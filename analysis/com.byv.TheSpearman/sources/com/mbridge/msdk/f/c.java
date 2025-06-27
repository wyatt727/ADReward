package com.mbridge.msdk.f;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CronetEnvironmentCheckUtil.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f2747a = "";
    private static boolean b = false;

    private static String d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.m().c().getClassLoader();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.m().c()).getClass().getName())) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(pair.first);
                    }
                } catch (Throwable th) {
                    ad.b("CronetEnvCheckUtil", th.getMessage());
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            ad.b("CronetEnvCheckUtil", th2.getMessage());
            return "";
        }
    }

    public static boolean b() {
        return af.a().a("cronet_engine_open", false) && b;
    }

    public static boolean c() {
        return b;
    }

    public static boolean a(boolean z) {
        return b && z;
    }

    public static void a() {
        if (af.a().a("cronet_env_check", false)) {
            try {
                Class.forName("com.google.android.gms.common.GoogleApiAvailability");
                GoogleApiAvailability.getInstance().getApkVersion(com.mbridge.msdk.foundation.controller.c.m().c());
                GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(com.mbridge.msdk.foundation.controller.c.m().c(), 11925000);
                try {
                    String strD = d();
                    boolean z = TextUtils.isEmpty(strD) ? false : true;
                    b = z;
                    if (z) {
                        f2747a = strD;
                    }
                } catch (Throwable th) {
                    ad.b("CronetEnvCheckUtil", th.getMessage());
                }
            } catch (Throwable th2) {
                ad.b("CronetEnvCheckUtil", th2.getMessage());
                b = false;
            }
        }
    }
}
