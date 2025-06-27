package com.json.mediationsdk.server;

import com.json.v5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a, reason: collision with root package name */
    private static final int f1996a = 15000;
    private static final String b = "GET";
    private static final String c = "POST";
    private static final String d = "UTF-8";
    private static final String e = "Bad Request - 400";
    private static final ExecutorService f = Executors.newSingleThreadExecutor();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1997a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ v5 e;

        a(String str, String str2, String str3, String str4, v5 v5Var) {
            this.f1997a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = v5Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.io.OutputStream, java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                java.lang.String r3 = r8.f1997a     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                java.lang.String r3 = r8.b     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                if (r3 == 0) goto L16
                java.lang.String r4 = r8.c     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                if (r4 != 0) goto L12
                goto L16
            L12:
                com.json.mediationsdk.utils.IronSourceUtils.getBase64Auth(r3, r4)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                throw r1     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            L16:
                java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                r3 = 15000(0x3a98, float:2.102E-41)
                r2.setReadTimeout(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r2.setConnectTimeout(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.lang.String r3 = "POST"
                r2.setRequestMethod(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r3 = 1
                r2.setDoInput(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r2.setDoOutput(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.io.OutputStream r1 = r2.getOutputStream()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.lang.String r6 = "UTF-8"
                r5.<init>(r1, r6)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r4.<init>(r5)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.lang.String r5 = r8.d     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r4.write(r5)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r4.flush()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r4.close()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                int r4 = r2.getResponseCode()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r5 = 200(0xc8, float:2.8E-43)
                if (r4 != r5) goto L54
                goto L55
            L54:
                r3 = r0
            L55:
                if (r3 != 0) goto L72
                com.ironsource.mediationsdk.logger.IronLog r5 = com.json.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r6.<init>()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.lang.String r7 = "invalid response code "
                r6.append(r7)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r6.append(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.lang.String r4 = " sending request"
                r6.append(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r5.error(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
            L72:
                com.ironsource.v5 r4 = r8.e     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                r4.a(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lbc
                if (r1 == 0) goto Lb8
                r1.close()     // Catch: java.io.IOException -> L7d
                goto Lb8
            L7d:
                r0 = move-exception
                r0.printStackTrace()
                goto Lb8
            L82:
                r3 = move-exception
                goto L8a
            L84:
                r0 = move-exception
                r2 = r1
                goto Lbd
            L87:
                r2 = move-exception
                r3 = r2
                r2 = r1
            L8a:
                r3.printStackTrace()     // Catch: java.lang.Throwable -> Lbc
                com.ironsource.mediationsdk.logger.IronLog r4 = com.json.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Lbc
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
                r5.<init>()     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r6 = "exception while sending request "
                r5.append(r6)     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lbc
                r5.append(r3)     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lbc
                r4.error(r3)     // Catch: java.lang.Throwable -> Lbc
                com.ironsource.v5 r3 = r8.e     // Catch: java.lang.Throwable -> Lbc
                r3.a(r0)     // Catch: java.lang.Throwable -> Lbc
                if (r1 == 0) goto Lb6
                r1.close()     // Catch: java.io.IOException -> Lb2
                goto Lb6
            Lb2:
                r0 = move-exception
                r0.printStackTrace()
            Lb6:
                if (r2 == 0) goto Lbb
            Lb8:
                r2.disconnect()
            Lbb:
                return
            Lbc:
                r0 = move-exception
            Lbd:
                if (r1 == 0) goto Lc7
                r1.close()     // Catch: java.io.IOException -> Lc3
                goto Lc7
            Lc3:
                r1 = move-exception
                r1.printStackTrace()
            Lc7:
                if (r2 == 0) goto Lcc
                r2.disconnect()
            Lcc:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.a.run():void");
        }
    }

    public static String getStringFromURL(String str) throws Exception {
        return getStringFromURL(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getStringFromURL(java.lang.String r4, com.ironsource.mediationsdk.p.c r5) throws java.lang.Exception {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L76
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L76
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L76
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L76
            r1 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            r4.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            java.lang.String r1 = "GET"
            r4.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            r1 = 1
            r4.setDoInput(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            r4.connect()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            int r1 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            r2 = 400(0x190, float:5.6E-43)
            if (r1 != r2) goto L33
            if (r5 == 0) goto L2f
            java.lang.String r1 = "Bad Request - 400"
            r5.a(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
        L2f:
            r4.disconnect()
            return r0
        L33:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            java.io.InputStream r2 = r4.getInputStream()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L77
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L78
        L46:
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L78
            if (r2 == 0) goto L50
            r1.append(r2)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L78
            goto L46
        L50:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L78
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L78
            r4.disconnect()
            r5.close()
            if (r2 == 0) goto L61
            return r0
        L61:
            return r1
        L62:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L6b
        L67:
            r5 = move-exception
            goto L6b
        L69:
            r5 = move-exception
            r4 = r0
        L6b:
            if (r4 == 0) goto L70
            r4.disconnect()
        L70:
            if (r0 == 0) goto L75
            r0.close()
        L75:
            throw r5
        L76:
            r4 = r0
        L77:
            r5 = r0
        L78:
            if (r4 == 0) goto L7d
            r4.disconnect()
        L7d:
            if (r5 == 0) goto L82
            r5.close()
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.server.HttpFunctions.getStringFromURL(java.lang.String, com.ironsource.mediationsdk.p$c):java.lang.String");
    }

    public static void sendPostRequest(String str, String str2, v5 v5Var) {
        sendPostRequestWithAutho(str, str2, null, null, v5Var);
    }

    public static void sendPostRequestWithAutho(String str, String str2, String str3, String str4, v5 v5Var) {
        f.submit(new a(str, str3, str4, str2, v5Var));
    }
}
