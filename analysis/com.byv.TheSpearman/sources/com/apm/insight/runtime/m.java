package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f142a = null;
    private static int b = -1;
    private static int c;

    public static MonitorCrash a() {
        if (f142a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.i.g(), "239017", 1030839L, "1.3.8.nourl-alpha.19", "com.apm.insight");
            f142a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f142a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.i.g() != null && b()) {
            a().reportCustomErr(str, "INNER", th);
        }
    }

    private static boolean b() {
        if (b == -1) {
            b = 5;
        }
        int i = c;
        if (i >= b) {
            return false;
        }
        c = i + 1;
        return true;
    }
}
