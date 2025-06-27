package com.apm.insight.g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.l.i;
import com.apm.insight.l.o;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.k;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Context f52a;

    public d(Context context) {
        this.f52a = context;
    }

    public static int a() {
        return 6;
    }

    @Override // com.apm.insight.g.c
    public void a(final long j, final Thread thread, final Throwable th, final String str, File file, final String str2, final boolean z) {
        final File file2 = new File(o.a(this.f52a), str);
        a.a().a(file2.getName());
        file2.mkdirs();
        i.f(file2);
        final boolean zC = v.c(th);
        com.apm.insight.entity.a aVarA = f.a().a(CrashType.JAVA, null, new c.a() { // from class: com.apm.insight.g.d.1

            /* renamed from: a, reason: collision with root package name */
            long f53a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
                String strValueOf;
                String str3;
                Object objB;
                String str4;
                this.f53a = SystemClock.uptimeMillis();
                if (i == 0) {
                    aVar.a("data", (Object) v.a(th));
                    aVar.a("isOOM", Boolean.valueOf(zC));
                    aVar.a("isJava", (Object) 1);
                    aVar.a("crash_time", Long.valueOf(j));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str5 = str2;
                    if (str5 != null) {
                        aVar.a("crash_md5", (Object) str5);
                        aVar.a("crash_md5", str2);
                        boolean z2 = z;
                        if (z2) {
                            strValueOf = String.valueOf(z2);
                            str3 = "has_ignore";
                            aVar.a(str3, strValueOf);
                        }
                    }
                } else if (i == 1) {
                    Thread thread2 = thread;
                    aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                    aVar.a(ScarConstants.TOKEN_ID_KEY, Integer.valueOf(Process.myTid()));
                    boolean zHasCrashWhenJavaCrash = Npth.hasCrashWhenJavaCrash();
                    String str6 = com.json.mediationsdk.metadata.a.g;
                    aVar.a("crash_after_crash", zHasCrashWhenJavaCrash ? com.json.mediationsdk.metadata.a.g : "false");
                    if (!NativeImpl.d()) {
                        str6 = "false";
                    }
                    aVar.a("crash_after_native", str6);
                    a.a().a(thread, th, false, aVar);
                } else if (i != 2) {
                    if (i == 3) {
                        JSONObject jSONObjectB = v.b(Thread.currentThread().getName());
                        if (jSONObjectB != null) {
                            aVar.a("all_thread_stacks", jSONObjectB);
                        }
                        objB = k.b(com.apm.insight.i.f());
                        str4 = "logcat";
                    } else if (i != 4) {
                        if (i == 5) {
                            objB = str;
                            str4 = "crash_uuid";
                        }
                    } else if (!zC) {
                        com.apm.insight.l.a.a(d.this.f52a, aVar.h());
                    }
                    aVar.a(str4, objB);
                } else {
                    if (zC) {
                        com.apm.insight.l.a.a(d.this.f52a, aVar.h());
                    }
                    JSONArray jSONArrayC = g.b().c();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    JSONObject jSONObjectA = g.b().a(jUptimeMillis).a();
                    JSONArray jSONArrayA = com.apm.insight.b.k.a(100, jUptimeMillis);
                    aVar.a("history_message", (Object) jSONArrayC);
                    aVar.a("current_message", jSONObjectA);
                    aVar.a("pending_messages", (Object) jSONArrayA);
                    aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                    strValueOf = String.valueOf(com.apm.insight.c.b.a());
                    str3 = "npth_force_apm_crash";
                    aVar.a(str3, strValueOf);
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar, boolean z2) {
                if (r.a(r.b(i))) {
                    return aVar;
                }
                try {
                    i.a(new File(file2, file2.getName() + "." + i), aVar.h(), false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public void a(Throwable th2) {
            }
        }, true);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            aVarA.a("crash_type", "normal");
            aVarA.b("crash_cost", String.valueOf(jCurrentTimeMillis));
            aVarA.a("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        if (r.a(4)) {
            return;
        }
        r.a(2048);
    }

    @Override // com.apm.insight.g.c
    public boolean a(Throwable th) {
        return true;
    }
}
