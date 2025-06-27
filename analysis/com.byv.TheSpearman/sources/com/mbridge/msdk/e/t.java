package com.mbridge.msdk.e;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: ReportMonitor.java */
/* loaded from: classes4.dex */
public class t {
    private static volatile t d;
    private m b;
    private w c;
    private volatile boolean e = false;
    private int f = 30000;
    private final HashMap<String, String> g = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    Handler f2739a = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.e.t.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                t.this.c();
                t.this.f2739a.removeMessages(1);
                t.this.d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    private t() {
    }

    public final void a(Context context, w wVar, int i, JSONObject jSONObject) {
        this.c = wVar;
        this.f = i;
        m mVarA = m.a("monitor", context, wVar);
        this.b = mVarA;
        if (mVarA != null) {
            mVarA.a(jSONObject);
            this.b.a();
        }
        b();
    }

    public static t a() {
        if (d == null) {
            synchronized (t.class) {
                if (d == null) {
                    d = new t();
                }
            }
        }
        return d;
    }

    public final synchronized void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f2739a.sendEmptyMessageDelayed(1, this.f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ab, blocks: (B:5:0x0008, B:7:0x000d, B:9:0x001b, B:12:0x002e, B:15:0x003a, B:18:0x0058, B:23:0x00a4, B:20:0x0070), top: B:28:0x0008, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws org.json.JSONException {
        /*
            r14 = this;
            com.mbridge.msdk.e.m[] r0 = com.mbridge.msdk.e.m.d()
            int r1 = r0.length
            if (r1 != 0) goto L8
            return
        L8:
            int r1 = r0.length     // Catch: java.lang.Exception -> Lab
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto Laf
            r4 = r0[r3]     // Catch: java.lang.Exception -> Lab
            java.lang.String r5 = r4.c()     // Catch: java.lang.Exception -> Lab
            java.lang.String r6 = "monitor"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Exception -> Lab
            if (r6 != 0) goto La7
            java.lang.String r6 = r4.b()     // Catch: java.lang.Exception -> Lab
            long[] r4 = r4.g()     // Catch: java.lang.Exception -> Lab
            r7 = 1
            r8 = r4[r7]     // Catch: java.lang.Exception -> Lab
            r10 = 0
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L2e
            goto La7
        L2e:
            r10 = r4[r2]     // Catch: java.lang.Exception -> Lab
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.g     // Catch: java.lang.Exception -> Lab
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r12 = ""
            if (r4 == 0) goto L58
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.g     // Catch: java.lang.Exception -> Lab
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lab
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            r13.<init>()     // Catch: java.lang.Exception -> Lab
            r13.append(r10)     // Catch: java.lang.Exception -> Lab
            r13.append(r12)     // Catch: java.lang.Exception -> Lab
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> Lab
            boolean r4 = r13.equals(r4)     // Catch: java.lang.Exception -> Lab
            if (r4 == 0) goto L58
            goto La7
        L58:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.g     // Catch: java.lang.Exception -> Lab
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            r13.<init>()     // Catch: java.lang.Exception -> Lab
            r13.append(r10)     // Catch: java.lang.Exception -> Lab
            r13.append(r12)     // Catch: java.lang.Exception -> Lab
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Exception -> Lab
            r4.put(r5, r12)     // Catch: java.lang.Exception -> Lab
            com.mbridge.msdk.e.m r4 = r14.b     // Catch: java.lang.Exception -> Lab
            if (r4 == 0) goto La7
            com.mbridge.msdk.e.e r4 = new com.mbridge.msdk.e.e     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = "event_lib_monitor"
            r4.<init>(r12)     // Catch: java.lang.Exception -> La3
            r4.b(r7)     // Catch: java.lang.Exception -> La3
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> La3
            r7.<init>()     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = "key"
            java.lang.String r13 = "m_report_rate"
            r7.put(r12, r13)     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = "task_name"
            r7.put(r12, r5)     // Catch: java.lang.Exception -> La3
            java.lang.String r5 = "task_count"
            r7.put(r5, r8)     // Catch: java.lang.Exception -> La3
            java.lang.String r5 = "task_session_id"
            r7.put(r5, r6)     // Catch: java.lang.Exception -> La3
            java.lang.String r5 = "task_ts"
            r7.put(r5, r10)     // Catch: java.lang.Exception -> La3
            r4.a(r7)     // Catch: java.lang.Exception -> La3
            com.mbridge.msdk.e.m r5 = r14.b     // Catch: java.lang.Exception -> La3
            r5.a(r4)     // Catch: java.lang.Exception -> La3
            goto La7
        La3:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Exception -> Lab
        La7:
            int r3 = r3 + 1
            goto Lb
        Lab:
            r0 = move-exception
            r0.printStackTrace()
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.e.t.c():void");
    }
}
