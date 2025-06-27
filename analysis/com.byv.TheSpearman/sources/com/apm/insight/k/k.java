package com.apm.insight.k;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static File f89a = null;
    private static boolean b = false;
    private static boolean c = false;
    private static String d = "exception_modules";
    private static String e = "npth";
    private static Map<String, String> f;

    public static void a(String str) {
        if (f == null) {
            f = new HashMap();
        }
        f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    public static void a(boolean z, JSONArray jSONArray) {
        try {
            com.apm.insight.l.i.a(new File(o.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.i.a(g(), f);
        } catch (Throwable unused2) {
        }
    }

    static boolean a() {
        return b;
    }

    static boolean a(boolean z) {
        File fileG = g();
        try {
            Map<String, String> mapE = f;
            if (mapE == null) {
                mapE = com.apm.insight.l.i.e(fileG);
            }
            f = mapE;
            if (mapE == null) {
                f = new HashMap();
                return true;
            }
            if (mapE.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z2 = false;
            for (Map.Entry<String, String> entry : f.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.e.e(entry.getKey())) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    q.a(th);
                }
            }
            q.a((Object) (z2 ? "config should be updated" : "config should not be updated"));
            return z2;
        } catch (Throwable th2) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th2);
            return true;
        }
    }

    static boolean b() {
        return c;
    }

    static void c() {
        if (b) {
            return;
        }
        c = true;
        File file = new File(o.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.i.c(file)), false);
                b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (a(false)) {
            a.a();
        }
    }

    public static void e() {
        p.b().a(new Runnable() { // from class: com.apm.insight.k.k.1
            @Override // java.lang.Runnable
            public void run() {
                if (k.a(false)) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f;
        if (map != null) {
            map.clear();
        }
    }

    private static File g() {
        if (f89a == null) {
            f89a = new File(o.j(com.apm.insight.i.g()), "apminsight/configCrash/configInvalid");
        }
        return f89a;
    }
}
