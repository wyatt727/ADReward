package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f16a = null;
    private static long b = -1;
    private static boolean c = false;
    private static FileObserver d;
    private static ActivityManager.ProcessErrorStateInfo e;

    static String a(Context context, int i) {
        if (r.a(256)) {
            c = false;
            return "TEST_ANR_INFO";
        }
        if (SystemClock.uptimeMillis() - b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoA = com.apm.insight.l.a.a(context, i);
            if (processErrorStateInfoA != null && Process.myPid() == processErrorStateInfoA.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = e;
                if (processErrorStateInfo != null && a.a(processErrorStateInfo, processErrorStateInfoA)) {
                    return null;
                }
                e = processErrorStateInfoA;
                f16a = null;
                b = SystemClock.uptimeMillis();
                c = false;
                return a.a(processErrorStateInfoA);
            }
        } catch (Throwable unused) {
        }
        String str = f16a;
        if (str == null) {
            return null;
        }
        c = true;
        f16a = null;
        b = SystemClock.uptimeMillis();
        return str;
    }

    public static JSONObject a(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", v.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        FileObserver fileObserver = d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str, 136) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public void onEvent(int i, String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f16a = fVar.a(str, str2);
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            }
        };
        d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static boolean a() {
        return c;
    }

    public static void b() {
        e = null;
    }
}
