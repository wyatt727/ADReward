package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.i;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import com.apm.insight.l.s;
import com.apm.insight.l.v;
import com.apm.insight.l.w;
import com.apm.insight.runtime.q;
import com.json.t2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    private static Boolean d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f110a;
    private JSONObject b = null;
    private b c;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader;
            String line;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    line = bufferedReader.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    try {
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return "";
                    } finally {
                        k.a(bufferedReader2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (line == null) {
                k.a(bufferedReader);
                return "";
            }
            if (!line.startsWith("[FATAL:jni_android.cc") || !line.contains("Please include Java exception stack in crash report ttwebview:")) {
                k.a(bufferedReader);
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int iIndexOf = line.indexOf(" ttwebview:");
            sb.append("Caused by: ");
            sb.append("Please include Java exception stack in crash report");
            sb.append("\n");
            sb.append(line.substring(iIndexOf + 11));
            while (true) {
                sb.append("\n");
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    String string = sb.toString();
                    k.a(bufferedReader);
                    return string;
                }
                sb.append(line2);
            }
        }
    }

    private class b {
        private final com.apm.insight.nativecrash.e b;
        private final com.apm.insight.nativecrash.a c;
        private final File d;
        private final File e;

        public b(File file) {
            this.d = file;
            this.e = o.a(i.g(), file.getName());
            com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(file);
            this.c = aVar;
            com.apm.insight.nativecrash.e eVar = new com.apm.insight.nativecrash.e(file);
            this.b = eVar;
            if (aVar.a() && eVar.a() == null) {
                eVar.a(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long a() {
            /*
                r3 = this;
                com.apm.insight.nativecrash.a r0 = r3.c
                java.util.Map r0 = r0.c()
                if (r0 == 0) goto L19
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r0 = move-exception
                goto L21
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L2a
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L17
                return r0
            L21:
                com.apm.insight.d r1 = com.apm.insight.c.a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.a(r2, r0)
            L2a:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.b.a():long");
        }

        public File b() {
            return this.d;
        }

        public boolean c() {
            return this.c.a();
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c, reason: collision with other inner class name */
    public class C0012c extends e {
        C0012c() {
            super();
            this.c = "Total FD Count:";
            this.b = o.i(c.this.c.b());
            this.d = ":";
            this.e = -2;
        }
    }

    public class d extends e {
        d() {
            super();
            this.c = "VmSize:";
            this.b = o.k(c.this.c.b());
            this.d = "\\s+";
            this.e = -1;
        }
    }

    public class e {
        protected File b;
        protected String c;
        protected String d;
        protected int e;

        public e() {
        }

        public int a() {
            int i;
            Throwable th;
            if (!this.b.exists() || !this.b.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.b));
                int iA = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iA = a(line);
                    } catch (Throwable th2) {
                        th = th2;
                        i = iA;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (iA == -1);
                k.a(bufferedReader2);
                return iA;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }

        public int a(String str) throws NumberFormatException {
            int i = this.e;
            if (!str.startsWith(this.c)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.d)[1].trim());
            } catch (NumberFormatException e) {
                com.apm.insight.c.a().a("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    public class f extends e {
        f() {
            super();
            this.c = "Total Threads Count:";
            this.b = o.j(c.this.c.b());
            this.d = ":";
            this.e = -2;
        }
    }

    public c(Context context) {
        this.f110a = context;
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    private void a(com.apm.insight.entity.a aVar) {
        aVar.a(n());
        aVar.a("is_native_crash", (Object) 1);
        aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
        aVar.a("crash_uuid", (Object) this.c.b().getName());
        aVar.a("jiffy", Long.valueOf(q.a.a()));
    }

    private void a(Map<String, String> map) {
        boolean zExists = o.i(this.c.b()).exists();
        String str = com.json.mediationsdk.metadata.a.g;
        map.put("has_fds_file", zExists ? com.json.mediationsdk.metadata.a.g : "false");
        File fileH = o.h(this.c.b());
        map.put("has_logcat_file", (!fileH.exists() || fileH.length() <= 128) ? "false" : com.json.mediationsdk.metadata.a.g);
        map.put("has_maps_file", o.d(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
        map.put("has_tombstone_file", o.b(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
        map.put("has_meminfo_file", o.k(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
        if (!o.j(this.c.b()).exists()) {
            str = "false";
        }
        map.put("has_threads_file", str);
    }

    private void b(com.apm.insight.entity.a aVar) throws JSONException {
        com.apm.insight.entity.d.b(aVar.h());
        HashMap map = new HashMap();
        if (m()) {
            map.put("is_root", com.json.mediationsdk.metadata.a.g);
            aVar.a("is_root", com.json.mediationsdk.metadata.a.g);
        } else {
            map.put("is_root", "false");
            aVar.a("is_root", "false");
        }
        a(map);
        int iO = o();
        if (iO > 0) {
            if (iO > 960) {
                map.put("fd_leak", com.json.mediationsdk.metadata.a.g);
            } else {
                map.put("fd_leak", "false");
            }
            aVar.a("fd_count", Integer.valueOf(iO));
        }
        int iP = p();
        if (iP > 0) {
            if (iP > 350) {
                map.put("threads_leak", com.json.mediationsdk.metadata.a.g);
            } else {
                map.put("threads_leak", "false");
            }
            aVar.a("threads_count", Integer.valueOf(iP));
        }
        int iQ = q();
        if (iQ > 0) {
            if (iQ > i()) {
                map.put("memory_leak", com.json.mediationsdk.metadata.a.g);
            } else {
                map.put("memory_leak", "false");
            }
            aVar.a("memory_size", Integer.valueOf(iQ));
        }
        map.put("sdk_version", "1.3.8.nourl-alpha.19");
        map.put("has_java_stack", String.valueOf(aVar.h().opt("java_data") != null));
        JSONArray jSONArrayA = com.apm.insight.nativecrash.d.a(o.l(this.c.d), o.m(this.c.d));
        map.put("leak_threads_count", String.valueOf(jSONArrayA.length()));
        if (jSONArrayA.length() > 0) {
            try {
                com.apm.insight.l.i.a(o.n(this.c.d), jSONArrayA, false);
            } catch (Throwable unused) {
            }
        }
        aVar.b();
        aVar.c();
        aVar.c(map);
    }

    private void c(com.apm.insight.entity.a aVar) throws JSONException {
        Map<String, String> mapB = this.c.b.b();
        if (mapB.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : mapB.keySet()) {
            String strA = a(mapB.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", strA);
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                com.apm.insight.c.a().a("NPTH_CATCH", e2);
            }
        }
        aVar.a("crash_lib_uuid", (Object) jSONArray);
    }

    private void d(com.apm.insight.entity.a aVar) {
        File fileE = o.e(this.c.b());
        if (!fileE.exists() && this.b == null) {
            aVar.b(w.a(i.g()));
            aVar.a("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(com.apm.insight.l.i.c(fileE.getAbsolutePath()));
            }
            aVar.c(jSONObject);
            aVar.a("has_callback", com.json.mediationsdk.metadata.a.g);
            if (aVar.h().opt(t2.a.j) == null) {
                aVar.b(w.a(i.g()));
            }
            s.a(aVar, aVar.i(), CrashType.NATIVE);
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        long j = -1;
        long jOptLong = aVar.h().optLong("crash_time", -1L);
        long jOptLong2 = aVar.h().optLong("java_end", -1L);
        if (jOptLong2 != -1 && jOptLong != -1) {
            j = jOptLong2 - jOptLong;
        }
        try {
            aVar.b("total_cost", String.valueOf(j));
            aVar.a("total_cost", String.valueOf(j / 1000));
        } catch (Throwable unused) {
        }
    }

    private void e(com.apm.insight.entity.a aVar) {
        String strA;
        File fileG = o.g(this.c.b());
        if (fileG.exists()) {
            try {
                strA = v.a(fileG.getAbsolutePath());
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        } else {
            strA = "";
        }
        File fileO = o.o(this.c.b());
        if (fileO.exists()) {
            String strB = a.b(fileO);
            if (strA.isEmpty()) {
                strA = strB;
            } else {
                strA = strA + "\n" + strB;
            }
        }
        try {
            if (strA.isEmpty()) {
                return;
            }
            aVar.a("java_data", (Object) strA);
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    private void f(com.apm.insight.entity.a aVar) {
        File fileA = o.a(this.c.b());
        if (fileA.exists()) {
            try {
                aVar.a("native_log", (Object) com.apm.insight.l.i.b(com.apm.insight.l.i.a(fileA.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    private void g(com.apm.insight.entity.a aVar) {
        File fileH = o.h(this.c.b());
        if (!fileH.exists()) {
            NativeImpl.a(fileH.getAbsolutePath(), String.valueOf(i.i().getLogcatDumpCount()), String.valueOf(i.i().getLogcatLevel()));
        }
        BufferedReader bufferedReader = null;
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.c.c.c().get("pid") + " ";
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileH));
            try {
                if (fileH.length() > 512000) {
                    bufferedReader2.skip(fileH.length() - 512000);
                }
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(str)) {
                        jSONArray.put(line);
                    }
                }
                k.a(bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                k.a(bufferedReader);
                aVar.a("logcat", (Object) jSONArray);
            }
        } catch (Throwable unused2) {
        }
        aVar.a("logcat", (Object) jSONArray);
    }

    private void h(com.apm.insight.entity.a aVar) {
        Map<String, String> mapA = a();
        if (mapA == null || aVar == null) {
            return;
        }
        String str = mapA.get("process_name");
        if (str != null) {
            aVar.a("process_name", (Object) str);
        }
        String str2 = mapA.get("start_time");
        if (str2 != null) {
            try {
                aVar.a(Long.decode(str2).longValue());
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        String str3 = mapA.get("pid");
        if (str3 != null) {
            try {
                aVar.a("pid", Long.decode(str3));
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        String str4 = mapA.get("crash_thread_name");
        if (str4 != null) {
            aVar.a("crash_thread_name", (Object) str4);
        }
        String str5 = mapA.get("crash_time");
        if (str5 != null) {
            try {
                aVar.a("crash_time", Long.decode(str5));
            } catch (Throwable th3) {
                com.apm.insight.c.a().a("NPTH_CATCH", th3);
            }
        }
        aVar.a("data", (Object) b());
    }

    public static long i() {
        if (NativeImpl.e()) {
            return Long.MAX_VALUE;
        }
        return Header.a() ? 3891200L : 2867200L;
    }

    public static boolean m() {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = 11;
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i2 = 0; i2 < i; i2++) {
            try {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (new File(strArr[i2]).exists()) {
                Boolean bool2 = true;
                d = bool2;
                return bool2.booleanValue();
            }
            continue;
        }
        Boolean bool3 = false;
        d = bool3;
        return bool3.booleanValue();
    }

    private Header n() throws JSONException {
        Header header = new Header(this.f110a);
        JSONObject jSONObjectA = com.apm.insight.runtime.s.a().a(this.c.a());
        if (jSONObjectA != null) {
            header.a(jSONObjectA);
            header.d();
            header.e();
        }
        Header.b(header);
        return header;
    }

    private int o() {
        return new C0012c().a();
    }

    private int p() {
        return new f().a();
    }

    private int q() {
        return new d().a();
    }

    public Map<String, String> a() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c.c();
        }
        return null;
    }

    public void a(File file) {
        this.c = new b(file);
    }

    public String b() {
        b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        String strC = bVar.b.c();
        return (strC == null || strC.isEmpty()) ? this.c.c.b() : strC;
    }

    public boolean c() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    public JSONObject d() {
        File fileF = o.f(this.c.b());
        if (!fileF.exists()) {
            return null;
        }
        try {
            String strC = com.apm.insight.l.i.c(fileF.getAbsolutePath());
            if (strC != null && !strC.isEmpty()) {
                return new JSONObject(strC);
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return null;
    }

    public void e() {
        try {
            File fileE = o.e(this.c.b());
            File file = new File(fileE.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i = 0;
            if (fileE.exists()) {
                while (i < com.apm.insight.nativecrash.b.a()) {
                    File file2 = new File(fileE.getAbsolutePath() + '.' + i);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i2 = 0; i2 < com.apm.insight.nativecrash.b.a(); i2++) {
                File file3 = new File(fileE.getAbsolutePath() + '.' + i2);
                if (file3.exists()) {
                    try {
                        String strC = com.apm.insight.l.i.c(file3.getAbsolutePath());
                        if (!TextUtils.isEmpty(strC)) {
                            JSONObject jSONObject = new JSONObject(strC);
                            if (jSONObject.length() > 0) {
                                aVar.c(jSONObject);
                            }
                        }
                    } catch (JSONException e2) {
                        com.apm.insight.c.a().a("NPTH_CATCH", e2);
                    }
                }
            }
            JSONObject jSONObjectH = aVar.h();
            try {
                if (jSONObjectH.length() != 0 && jSONObjectH.opt(t2.a.j) == null) {
                    com.apm.insight.entity.a.a(jSONObjectH, w.a(i.g()));
                }
            } catch (Throwable unused) {
            }
            if (jSONObjectH.length() != 0) {
                this.b = jSONObjectH;
                com.apm.insight.l.i.b(file, jSONObjectH, false);
                if (file.renameTo(fileE)) {
                    while (i < com.apm.insight.nativecrash.b.a()) {
                        File file4 = new File(fileE.getAbsolutePath() + '.' + i);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i++;
                    }
                }
            }
        } catch (IOException e3) {
            com.apm.insight.c.a().a("NPTH_CATCH", e3);
        }
    }

    public boolean f() {
        ICrashFilter iCrashFilterB = i.b().b();
        if (iCrashFilterB == null) {
            return true;
        }
        try {
            return iCrashFilterB.onNativeCrashFilter(b(), "");
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return true;
        }
    }

    public boolean g() {
        return com.apm.insight.e.a.a().a(o.f(this.c.b()).getAbsolutePath());
    }

    public void h() {
        com.apm.insight.e.a.a().a(com.apm.insight.e.a.a.a(o.f(this.c.b()).getAbsolutePath()));
    }

    public JSONObject j() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            a(aVar);
            h(aVar);
            c(aVar);
            d(aVar);
            e(aVar);
            g(aVar);
            f(aVar);
            b(aVar);
            File fileF = o.f(this.c.b());
            JSONObject jSONObjectH = aVar.h();
            com.apm.insight.l.i.a(fileF, jSONObjectH, false);
            return jSONObjectH;
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public boolean k() {
        return com.apm.insight.l.i.a(this.c.b());
    }

    public void l() {
        try {
            com.apm.insight.l.i.c(this.c.b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + i.g().getPackageName() + "/" + this.c.b().getName() + ".zip");
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }
}
