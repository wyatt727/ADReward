package com.mbridge.msdk.foundation.same.report;

/* compiled from: DomainReport.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f2916a = "DomainReport";

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.mbridge.msdk.c.g r6, java.lang.String r7) {
        /*
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L52
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L47
            if (r2 != 0) goto L52
            int r2 = r6.O()     // Catch: java.lang.Exception -> L47
            org.json.JSONArray r3 = r6.M()     // Catch: java.lang.Exception -> L47
            org.json.JSONArray r6 = r6.L()     // Catch: java.lang.Exception -> L47
            if (r6 == 0) goto L2d
            r4 = r0
        L19:
            int r5 = r6.length()     // Catch: java.lang.Exception -> L47
            if (r4 >= r5) goto L2d
            java.lang.String r5 = r6.getString(r4)     // Catch: java.lang.Exception -> L47
            boolean r5 = r7.contains(r5)     // Catch: java.lang.Exception -> L47
            if (r5 == 0) goto L2a
            return r0
        L2a:
            int r4 = r4 + 1
            goto L19
        L2d:
            r6 = 2
            if (r2 != r6) goto L52
            if (r3 == 0) goto L53
            r6 = r0
        L33:
            int r2 = r3.length()     // Catch: java.lang.Exception -> L47
            if (r6 >= r2) goto L53
            java.lang.String r2 = r3.getString(r6)     // Catch: java.lang.Exception -> L47
            boolean r2 = r7.contains(r2)     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L44
            return r1
        L44:
            int r6 = r6 + 1
            goto L33
        L47:
            r6 = move-exception
            java.lang.String r7 = com.mbridge.msdk.foundation.same.report.b.f2916a
            java.lang.String r6 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r7, r6)
            goto L54
        L52:
            r0 = r1
        L53:
            r1 = r0
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.b.a(com.mbridge.msdk.c.g, java.lang.String):boolean");
    }
}
