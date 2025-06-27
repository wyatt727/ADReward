package com.apm.insight.b;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.l.l;
import com.apm.insight.l.o;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    static volatile boolean f11a = true;
    private static volatile boolean f;
    private c c;
    private final Context d;
    private volatile boolean e;
    private JSONObject j;
    private JSONObject k;
    private JSONArray p;
    private JSONObject q;
    private JSONArray t;
    private JSONArray u;
    private JSONObject v;
    private boolean w;
    private volatile boolean y;
    private long g = -1;
    private File h = null;
    private boolean i = true;
    private String l = "unknown";
    private String m = "unknown";
    private String n = "unknown";
    private String o = "npth_inner_default";
    private int r = 0;
    private long s = -1;
    private final Object x = new Object();
    private long z = -1;
    private long A = 0;
    private final Runnable B = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.a(200, 25);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    };
    private int C = 0;
    private List<Pattern> D = null;
    Pattern b = null;
    private File E = null;

    public b(Context context) {
        this.d = context;
    }

    private static String a(float f2) {
        return f2 <= 0.0f ? "0%" : f2 <= 0.1f ? "0% - 10%" : f2 <= 0.3f ? "10% - 30%" : f2 <= 0.6f ? "30% - 60%" : f2 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String a(float f2, float f3) {
        return f3 > 0.0f ? a(f2 / f3) : f2 > 0.0f ? "100%" : "0%";
    }

    private JSONObject a(String str, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayA = l.a(256, 128, jSONArray);
        if (jSONArrayA.length() != jSONArray.length()) {
            this.r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayA);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0226, code lost:
    
        if (r3 != 5) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0269 A[PHI: r20 r28
      0x0269: PHI (r20v3 char) = (r20v2 char), (r20v16 char) binds: [B:126:0x0263, B:116:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r28v3 char) = (r28v2 char), (r28v9 char) binds: [B:126:0x0263, B:116:0x022f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0277 A[PHI: r20 r28
      0x0277: PHI (r20v4 char) = (r20v3 char), (r20v17 char) binds: [B:129:0x0271, B:115:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r28v4 char) = (r28v3 char), (r28v10 char) binds: [B:129:0x0271, B:115:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0283 A[PHI: r28
      0x0283: PHI (r28v6 char) = (r28v4 char), (r28v11 char) binds: [B:132:0x027d, B:113:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02eb A[LOOP:2: B:100:0x020c->B:154:0x02eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x040d A[EDGE_INSN: B:227:0x040d->B:203:0x040d BREAK  A[LOOP:0: B:3:0x0038->B:201:0x03f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03b6 A[EDGE_INSN: B:231:0x03b6->B:190:0x03b6 BREAK  A[LOOP:2: B:100:0x020c->B:154:0x02eb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r30, org.json.JSONObject r31) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String str2;
        String strA;
        String str3 = "npth_anr_" + str;
        if (map.isEmpty()) {
            str2 = str3 + "_total";
            strA = "not found";
        } else {
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            float fFloatValue3 = 0.0f;
            float fFloatValue4 = 0.0f;
            float fFloatValue5 = 0.0f;
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    fFloatValue += entry.getValue().floatValue();
                } else if (key.endsWith("kernel")) {
                    fFloatValue2 += entry.getValue().floatValue();
                } else if (key.endsWith("iowait")) {
                    fFloatValue3 += entry.getValue().floatValue();
                } else if (key.endsWith("irq")) {
                    fFloatValue4 += entry.getValue().floatValue();
                } else if (key.endsWith("softirq")) {
                    fFloatValue5 += entry.getValue().floatValue();
                }
            }
            float f2 = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
            jSONObject.put(str3 + "_total", b(f2));
            jSONObject.put(str3 + "_kernel_user_ratio", a(fFloatValue2, f2));
            str2 = str3 + "_iowait_user_ratio";
            strA = a(fFloatValue3, f2);
        }
        jSONObject.put(str2, strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONArray r17) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(org.json.JSONArray):void");
    }

    private boolean a(long j) {
        if (this.y) {
            this.y = false;
            b(j);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.D == null) {
            JSONArray jSONArrayC = com.apm.insight.runtime.a.c();
            if (jSONArrayC != null) {
                this.D = new LinkedList();
                this.o = jSONArrayC.optString(0);
                for (int i = 1; i < jSONArrayC.length(); i++) {
                    try {
                        this.D.add(Pattern.compile(jSONArrayC.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.D == null) {
                LinkedList linkedList = new LinkedList();
                this.D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.D.add(Pattern.compile("^default_npth_thread$"));
                this.D.add(Pattern.compile("^RenderThread$"));
                this.D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.D.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static String b(float f2) {
        return a(f2 / 100.0f);
    }

    private void b(long j) {
        if (this.A != this.z) {
            try {
                this.s = System.currentTimeMillis();
                this.u = g.b().c();
                this.t = k.a(100, j);
                this.k = g.b().a(j).a();
                JSONObject jSONObject = new JSONObject();
                this.v = jSONObject;
                com.apm.insight.l.a.a(this.d, jSONObject);
                this.w = g();
                this.i = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.g = this.s;
                    String strB = o.b();
                    File file = new File(new File(o.f(this.d), strB), "trace_" + com.apm.insight.l.a.c(this.d).replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                    file.getParentFile().mkdirs();
                    com.apm.insight.l.i.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                    r.a("anr_trace", strB);
                    NativeImpl.i(file.getAbsolutePath());
                    try {
                        JSONArray jSONArrayB = com.apm.insight.l.i.b(file.getAbsolutePath());
                        this.p = jSONArrayB;
                        a(jSONArrayB);
                    } catch (IOException unused2) {
                    } catch (Throwable th) {
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                    }
                }
                if (this.j == null) {
                    this.j = d.a(true);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            com.apm.insight.l.f.a();
        } else {
            try {
                this.g = this.s;
                if (Build.VERSION.SDK_INT >= 21) {
                    String strB2 = o.b();
                    File file2 = new File(new File(o.f(this.d), strB2), "trace" + com.apm.insight.l.a.c(this.d).replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                    file2.getParentFile().mkdirs();
                    com.apm.insight.l.i.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                    r.a("anr_trace", strB2);
                    NativeImpl.i(file2.getAbsolutePath());
                    try {
                        JSONArray jSONArrayB2 = com.apm.insight.l.i.b(file2.getAbsolutePath());
                        this.p = jSONArrayB2;
                        a(jSONArrayB2);
                    } catch (IOException unused3) {
                    } catch (Throwable th3) {
                        com.apm.insight.c.a().a("NPTH_CATCH", th3);
                    }
                }
                if (this.j == null) {
                    this.j = d.a(true);
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a().a("NPTH_CATCH", th4);
            }
        }
        long j2 = this.z;
        this.A = j2;
        this.z = -1L;
        if (j2 == -1) {
            this.A = (-1) - 1;
        }
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : com.apm.insight.runtime.o.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    private int[] b(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.b == null) {
                    this.b = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.b.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
            }
        }
        return null;
    }

    private String c(long j) {
        long j2 = j - com.apm.insight.i.j();
        return j2 < 30000 ? "0 - 30s" : j2 < 60000 ? "30s - 1min" : j2 < 120000 ? "1min - 2min" : j2 < 300000 ? "2min - 5min" : j2 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j2 < 1800000 ? "10min - 30min" : j2 < 3600000 ? "30min - 1h" : "1h - ";
    }

    private JSONObject c(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayA = l.a(256, 128, jSONArray);
        if (jSONArrayA.length() != jSONArray.length()) {
            this.r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArrayA.length(); i++) {
                sb.append(jSONArrayA.getString(i));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean g() {
        boolean z = !com.apm.insight.l.a.a(this.d);
        if (!z || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z;
        }
        return false;
    }

    private File h() {
        if (this.E == null) {
            this.E = new File(this.d.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.c(this.d).replaceAll(":", "_"));
        }
        return this.E;
    }

    private boolean i() {
        return com.apm.insight.runtime.a.i();
    }

    public void a() {
        if (this.e) {
            return;
        }
        this.c = new c(this);
        this.g = com.apm.insight.i.j();
        this.e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03e1 A[Catch: all -> 0x0485, TRY_ENTER, TryCatch #5 {all -> 0x0485, blocks: (B:77:0x017f, B:81:0x01fc, B:83:0x0201, B:86:0x020a, B:88:0x020e, B:90:0x0214, B:92:0x021c, B:126:0x03e1, B:127:0x040a, B:129:0x040e, B:130:0x0414, B:137:0x0469, B:91:0x021a), top: B:159:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040a A[Catch: all -> 0x0485, TryCatch #5 {all -> 0x0485, blocks: (B:77:0x017f, B:81:0x01fc, B:83:0x0201, B:86:0x020a, B:88:0x020e, B:90:0x0214, B:92:0x021c, B:126:0x03e1, B:127:0x040a, B:129:0x040e, B:130:0x0414, B:137:0x0469, B:91:0x021a), top: B:159:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean a(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(int, int):boolean");
    }

    public void b() {
        if (this.e) {
            this.e = false;
            c cVar = this.c;
            if (cVar != null) {
                cVar.b();
            }
            this.c = null;
        }
    }

    public void c() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void d() {
        if (f) {
            return;
        }
        synchronized (this.x) {
            if (f) {
                return;
            }
            this.B.run();
        }
    }

    public void e() {
        if (NativeImpl.g()) {
            try {
                com.apm.insight.l.i.a(h(), String.valueOf(this.C + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        this.z = SystemClock.uptimeMillis();
        this.y = true;
    }

    public void f() {
        File fileH = h();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.i.c(fileH.getAbsolutePath())).intValue();
            this.C = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.i.a(fileH);
        }
    }
}
