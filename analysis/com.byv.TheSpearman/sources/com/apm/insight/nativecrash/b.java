package com.apm.insight.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.b.k;
import com.apm.insight.i;
import com.apm.insight.l.q;
import com.apm.insight.l.v;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import com.json.t2;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    public static int a() {
        return 6;
    }

    private static void a(String str, String str2, String str3) {
        for (ICrashCallback iCrashCallback : o.a().d()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.NATIVE, str, str3, str2);
                } else {
                    iCrashCallback.onCrash(CrashType.NATIVE, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (t2.h.Z.equalsIgnoreCase(str)) {
            return v.a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int iActiveCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[iActiveCount + (iActiveCount / 2)];
        int iEnumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < iEnumerate; i++) {
            String name = threadArr[i].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return v.a(threadArr[i].getStackTrace());
            }
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = entry.getKey().getName();
                if (name2.equals(str) || name2.startsWith(str) || name2.endsWith(str)) {
                    return v.a(entry.getValue());
                }
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return "";
    }

    public static void onNativeCrash(final String str) {
        String strC;
        String strA;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        q.a((Object) "[onNativeCrash] enter");
        try {
            try {
                com.apm.insight.k.b.a().b();
                final File fileE = com.apm.insight.l.o.e(new File(com.apm.insight.l.o.a(), i.f()));
                com.apm.insight.entity.a aVarA = f.a().a(CrashType.NATIVE, null, new c.a() { // from class: com.apm.insight.nativecrash.b.1
                    @Override // com.apm.insight.runtime.a.c.a
                    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
                        String str2;
                        String str3 = com.json.mediationsdk.metadata.a.g;
                        if (i != 1) {
                            if (i == 2) {
                                JSONArray jSONArrayC = g.b().c();
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                JSONObject jSONObjectA = g.b().a(jUptimeMillis).a();
                                JSONArray jSONArrayA = k.a(100, jUptimeMillis);
                                aVar.a("history_message", (Object) jSONArrayC);
                                aVar.a("current_message", jSONObjectA);
                                aVar.a("pending_messages", (Object) jSONArrayA);
                                aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                                aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.b.a()));
                            } else if (i != 3) {
                                if (i == 4) {
                                    com.apm.insight.l.a.a(i.g(), aVar.h());
                                }
                            } else if (com.apm.insight.runtime.a.e()) {
                                aVar.a("all_thread_stacks", v.b(str));
                                str2 = "has_all_thread_stack";
                            }
                            return aVar;
                        }
                        String str4 = str;
                        if (str4 != null && str4.length() != 0) {
                            aVar.a("java_data", (Object) b.b(str));
                        }
                        if (!Npth.hasCrashWhenNativeCrash()) {
                            str3 = "false";
                        }
                        str2 = "crash_after_crash";
                        aVar.a(str2, str3);
                        return aVar;
                    }

                    @Override // com.apm.insight.runtime.a.c.a
                    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar, boolean z) {
                        try {
                            JSONObject jSONObjectH = aVar.h();
                            if (jSONObjectH.length() > 0) {
                                com.apm.insight.l.i.a(new File(fileE.getAbsolutePath() + '.' + i), jSONObjectH, false);
                            }
                        } catch (IOException e) {
                            com.apm.insight.c.a().a("NPTH_CATCH", e);
                        }
                        if (i == 0) {
                            com.apm.insight.a.a.a().b();
                            com.apm.insight.a.a.a().a(CrashType.NATIVE, jCurrentTimeMillis, i.f());
                        }
                        return aVar;
                    }

                    @Override // com.apm.insight.runtime.a.c.a
                    public void a(Throwable th) {
                    }
                }, true);
                JSONObject jSONObjectH = aVarA.h();
                if (jSONObjectH != null && jSONObjectH.length() != 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    try {
                        jSONObjectH.put("java_end", jCurrentTimeMillis2);
                        aVarA.b("crash_cost", String.valueOf(j));
                        aVarA.a("crash_cost", String.valueOf(j / 1000));
                    } catch (Throwable unused) {
                    }
                    File file = new File(fileE.getAbsolutePath() + ".tmp");
                    com.apm.insight.l.i.a(file, jSONObjectH, false);
                    file.renameTo(fileE);
                }
            } catch (Throwable unused2) {
                a("", null, str);
                return;
            }
        } catch (Throwable th) {
            try {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                if (o.a().d().isEmpty()) {
                    return;
                }
                File file2 = new File(com.apm.insight.l.o.a(), i.f());
                e eVar = new e(file2);
                eVar.b(file2);
                strC = eVar.c();
                strA = eVar.a();
            } catch (Throwable th2) {
                try {
                    if (!o.a().d().isEmpty()) {
                        File file3 = new File(com.apm.insight.l.o.a(), i.f());
                        e eVar2 = new e(file3);
                        eVar2.b(file3);
                        a(eVar2.c(), eVar2.a(), str);
                    }
                } catch (Throwable unused3) {
                    a("", null, str);
                }
                throw th2;
            }
        }
        if (o.a().d().isEmpty()) {
            return;
        }
        File file4 = new File(com.apm.insight.l.o.a(), i.f());
        e eVar3 = new e(file4);
        eVar3.b(file4);
        strC = eVar3.c();
        strA = eVar3.a();
        a(strC, strA, str);
    }
}
