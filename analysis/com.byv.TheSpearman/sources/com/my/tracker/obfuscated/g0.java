package com.my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Integer f4228a = 1;
    private static final AtomicBoolean b = new AtomicBoolean();

    static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            z0.b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            z0.b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            z0.b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    static boolean b(Context context) {
        if (String.valueOf(f4228a).equals(x0.a(String.format("%s_mytracker_debug", context.getPackageName())))) {
            z0.a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        z0.a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static void c(final Context context) {
        if (!b.compareAndSet(false, true)) {
            z0.a("LoggingHandler: instance has already been initialized");
        } else if (z0.a()) {
            z0.a("LoggingHandler: tracing has already been enabled");
        } else {
            g.a(new Runnable() { // from class: com.my.tracker.obfuscated.g0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.d(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        String str;
        if (a(context)) {
            z0.a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (!f4228a.equals((Integer) x0.a(context, "com.my.tracker.debugMode", Integer.class))) {
                if (b(context)) {
                    z0.a(true);
                    z0.a("LoggingHandler: debug mode is enabled by system properties");
                    return;
                }
                return;
            }
            z0.a(true);
            str = "LoggingHandler: debug mode is enabled by manifest metadata";
        }
        z0.a(str);
    }
}
