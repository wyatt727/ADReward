package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: SameOptimizedController.java */
/* loaded from: classes4.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public volatile JSONObject f2972a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    private String f;
    private volatile ConcurrentHashMap<String, Boolean> g;
    private volatile ConcurrentHashMap<String, Integer> h;
    private volatile com.mbridge.msdk.c.g i;

    private af() {
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
        this.e = new Object();
    }

    public static af a() {
        return a.f2973a;
    }

    private static Integer a(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private int b(String str, String str2, int i) {
        if (a(true)) {
            return i;
        }
        try {
            String strOptString = this.f2972a.optString(str, "");
            if (TextUtils.isEmpty(strOptString)) {
                return i;
            }
            String strA = x.a(strOptString);
            return TextUtils.isEmpty(strA) ? i : new JSONObject(strA).optInt(str2, i);
        } catch (Exception unused) {
            return i;
        }
    }

    private int b(String str, int i) {
        if (a(true)) {
            return i;
        }
        try {
            return this.f2972a.optInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public final int a(String str, int i) {
        Integer numValueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            ConcurrentHashMap<String, Integer> concurrentHashMapB = b();
            Integer numA = a(str, concurrentHashMapB);
            if (numA != null) {
                return numA.intValue();
            }
            try {
                numValueOf = Integer.valueOf(b(str, i));
            } catch (Exception unused) {
                numValueOf = Integer.valueOf(i);
            }
            concurrentHashMapB.put(str, numValueOf);
            return numValueOf.intValue();
        } catch (Exception unused2) {
            return i;
        }
    }

    public final int a(String str, String str2, int i) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapB = b();
                Integer numA = a(str3, concurrentHashMapB);
                if (numA != null) {
                    return numA.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(b(str, str2, i));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i);
                }
                concurrentHashMapB.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return a(str2, i);
        } catch (Exception unused2) {
            return i;
        }
    }

    private ConcurrentHashMap<String, Integer> b() {
        synchronized (this.b) {
            if (this.h == null) {
                this.h = new ConcurrentHashMap<>();
            }
        }
        return this.h;
    }

    public final boolean a(String str, boolean z) {
        try {
            return a(str, z, true);
        } catch (Exception unused) {
            return z;
        }
    }

    public final boolean a(String str, boolean z, boolean z2) {
        Boolean boolValueOf;
        Boolean boolB;
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            ConcurrentHashMap<String, Boolean> concurrentHashMapC = c();
            if (z2 && (boolB = b(str, concurrentHashMapC)) != null) {
                return boolB.booleanValue();
            }
            try {
                boolValueOf = Boolean.valueOf(b(str, z, z2));
            } catch (Exception unused) {
                boolValueOf = Boolean.valueOf(z);
            }
            concurrentHashMapC.put(str, boolValueOf);
            return boolValueOf.booleanValue();
        } catch (Exception unused2) {
            return z;
        }
    }

    private ConcurrentHashMap<String, Boolean> c() {
        synchronized (this.d) {
            if (this.g == null) {
                this.g = new ConcurrentHashMap<>();
            }
        }
        return this.g;
    }

    private static Boolean b(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean b(String str, boolean z, boolean z2) {
        if (a(z2)) {
            return z;
        }
        try {
            return this.f2972a.optInt(str, z ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:19:0x003c, B:21:0x0040, B:22:0x0048, B:12:0x0018, B:14:0x0020, B:15:0x002c, B:18:0x003a), top: B:32:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(boolean r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            com.mbridge.msdk.c.g r1 = r4.i     // Catch: java.lang.Throwable -> L53
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            com.mbridge.msdk.c.g r1 = r4.i     // Catch: java.lang.Throwable -> L53
            int r1 = r1.I()     // Catch: java.lang.Throwable -> L53
            if (r1 != r3) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            if (r1 != 0) goto L18
            if (r5 != 0) goto L3c
        L18:
            java.lang.String r5 = r4.f     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            if (r5 == 0) goto L2c
            com.mbridge.msdk.foundation.a.a.a r5 = com.mbridge.msdk.foundation.a.a.a.a()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            java.lang.String r1 = "sdk_app_id"
            java.lang.String r5 = r5.a(r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            r4.f = r5     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
        L2c:
            com.mbridge.msdk.c.h r5 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            java.lang.String r1 = r4.f     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            com.mbridge.msdk.c.g r5 = r5.a(r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            r4.i = r5     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            goto L3c
        L39:
            r5 = 0
            r4.i = r5     // Catch: java.lang.Throwable -> L53
        L3c:
            com.mbridge.msdk.c.g r5 = r4.i     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L48
            com.mbridge.msdk.c.g r5 = r4.i     // Catch: java.lang.Throwable -> L53
            org.json.JSONObject r5 = r5.al()     // Catch: java.lang.Throwable -> L53
            r4.f2972a = r5     // Catch: java.lang.Throwable -> L53
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            com.mbridge.msdk.c.g r5 = r4.i
            if (r5 == 0) goto L51
            org.json.JSONObject r5 = r4.f2972a
            if (r5 != 0) goto L52
        L51:
            r2 = r3
        L52:
            return r2
        L53:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.af.a(boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SameOptimizedController.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final af f2973a = new af();
    }
}
