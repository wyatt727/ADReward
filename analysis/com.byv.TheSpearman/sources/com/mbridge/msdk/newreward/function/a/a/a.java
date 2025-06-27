package com.mbridge.msdk.newreward.function.a.a;

import com.mbridge.msdk.newreward.function.a.c;
import java.util.HashMap;

/* compiled from: CandidateController.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, c> f3301a;

    /* compiled from: CandidateController.java */
    /* renamed from: com.mbridge.msdk.newreward.function.a.a.a$a, reason: collision with other inner class name */
    static class C0284a {

        /* renamed from: a, reason: collision with root package name */
        static a f3303a = new a();
    }

    private a() {
        this.f3301a = new HashMap<>();
    }

    public static a a() {
        return C0284a.f3303a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mbridge.msdk.newreward.function.a.c a(java.lang.String r7, org.json.JSONArray r8) throws org.json.JSONException {
        /*
            r6 = this;
            java.util.HashMap<java.lang.String, com.mbridge.msdk.newreward.function.a.c> r0 = r6.f3301a
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f3301a = r0
        Lb:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.newreward.function.a.c> r0 = r6.f3301a
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L8a
            if (r8 != 0) goto L62
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L54
            r0.<init>()     // Catch: java.lang.Exception -> L54
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L52
            r8.<init>()     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "c_cb"
            r2 = 0
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "t_disc"
            r3 = 4606732058837280358(0x3fee666666666666, double:0.95)
            r8.put(r1, r3)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "u_disc"
            r8.put(r1, r3)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "max_ecppv_diff"
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "max_cache_num"
            r2 = 20
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "max_usage_limit"
            r2 = 10
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "time_interval"
            r2 = 7200(0x1c20, float:1.009E-41)
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            r0.put(r8)     // Catch: java.lang.Exception -> L52
            goto L61
        L52:
            r8 = move-exception
            goto L58
        L54:
            r0 = move-exception
            r5 = r0
            r0 = r8
            r8 = r5
        L58:
            java.lang.String r8 = r8.getMessage()
            java.lang.String r1 = "CandidateController"
            android.util.Log.e(r1, r8)
        L61:
            r8 = r0
        L62:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.newreward.function.a.c> r0 = r6.f3301a
            if (r0 != 0) goto L6d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f3301a = r0
        L6d:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.newreward.function.a.c> r0 = r6.f3301a
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L7e
            java.util.HashMap<java.lang.String, com.mbridge.msdk.newreward.function.a.c> r8 = r6.f3301a
            java.lang.Object r7 = r8.get(r7)
            com.mbridge.msdk.newreward.function.a.c r7 = (com.mbridge.msdk.newreward.function.a.c) r7
            goto L89
        L7e:
            com.mbridge.msdk.newreward.function.a.c r0 = new com.mbridge.msdk.newreward.function.a.c
            r0.<init>(r7, r8)
            java.util.HashMap<java.lang.String, com.mbridge.msdk.newreward.function.a.c> r8 = r6.f3301a
            r8.put(r7, r0)
            r7 = r0
        L89:
            return r7
        L8a:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.newreward.function.a.c> r8 = r6.f3301a
            java.lang.Object r7 = r8.get(r7)
            com.mbridge.msdk.newreward.function.a.c r7 = (com.mbridge.msdk.newreward.function.a.c) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.a.a.a.a(java.lang.String, org.json.JSONArray):com.mbridge.msdk.newreward.function.a.c");
    }
}
