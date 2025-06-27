package com.json;

import android.net.Uri;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class u6 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2325a = "POST";
    private static final String b = "GET";
    private static final String c = "ISHttpService";

    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final String j = "UTF-8";

        /* renamed from: a, reason: collision with root package name */
        final String f2326a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList<Pair<String, String>> g;

        /* renamed from: com.ironsource.u6$a$a, reason: collision with other inner class name */
        static class C0250a {
            String b;
            String d;

            /* renamed from: a, reason: collision with root package name */
            List<Pair<String, String>> f2327a = new ArrayList();
            String c = "POST";
            int e = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            int f = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            String g = "UTF-8";

            C0250a() {
            }

            C0250a a(int i) {
                this.e = i;
                return this;
            }

            C0250a a(Pair<String, String> pair) {
                this.f2327a.add(pair);
                return this;
            }

            C0250a a(String str) {
                this.d = str;
                return this;
            }

            C0250a a(List<Pair<String, String>> list) {
                this.f2327a.addAll(list);
                return this;
            }

            a a() {
                return new a(this);
            }

            C0250a b(int i) {
                this.f = i;
                return this;
            }

            C0250a b(String str) {
                this.g = str;
                return this;
            }

            C0250a c(String str) {
                this.b = str;
                return this;
            }

            C0250a d(String str) {
                this.c = str;
                return this;
            }
        }

        public a(C0250a c0250a) {
            this.f2326a = c0250a.b;
            this.b = c0250a.c;
            this.c = c0250a.d;
            this.g = new ArrayList<>(c0250a.f2327a);
            this.d = c0250a.e;
            this.e = c0250a.f;
            this.f = c0250a.g;
        }

        boolean a() {
            return "POST".equals(this.b);
        }
    }

    public static xb a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0250a c0250a = new a.C0250a();
        c0250a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0250a.a());
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f2326a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.json.xb b(com.ironsource.u6.a r7) throws java.lang.Exception {
        /*
            java.lang.String r0 = r7.f2326a
            java.lang.String r1 = r7.c
            boolean r0 = a(r0, r1)
            if (r0 == 0) goto L89
            com.ironsource.xb r0 = new com.ironsource.xb
            r0.<init>()
            r1 = 0
            java.net.HttpURLConnection r2 = a(r7)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.g     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            a(r2, r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            a(r2, r7)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r0.f2441a = r3     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            if (r1 == 0) goto L2e
            byte[] r3 = com.json.ae.a(r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r0.b = r3     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
        L2e:
            if (r1 == 0) goto L75
            goto L70
        L31:
            r7 = move-exception
            goto L7e
        L33:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L3d
        L38:
            r7 = move-exception
            r2 = r1
            goto L7e
        L3b:
            r3 = move-exception
            r2 = r1
        L3d:
            if (r1 == 0) goto L79
            int r4 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L7a
            r0.f2441a = r4     // Catch: java.lang.Throwable -> L7a
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L79
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = "Failed post to "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r7 = r7.f2326a     // Catch: java.lang.Throwable -> L7a
            r4.append(r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch: java.lang.Throwable -> L7a
            int r7 = r0.f2441a     // Catch: java.lang.Throwable -> L7a
            r4.append(r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L7a
            android.util.Log.d(r3, r7)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L74
            r6 = r2
            r2 = r1
            r1 = r6
        L70:
            r1.close()
            goto L75
        L74:
            r2 = r1
        L75:
            r2.disconnect()
            return r0
        L79:
            throw r3     // Catch: java.lang.Throwable -> L7a
        L7a:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L7e:
            if (r1 == 0) goto L83
            r1.close()
        L83:
            if (r2 == 0) goto L88
            r2.disconnect()
        L88:
            throw r7
        L89:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.u6.b(com.ironsource.u6$a):com.ironsource.xb");
    }

    public static xb b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0250a c0250a = new a.C0250a();
        c0250a.c(str).a(str2).d("POST").a(list);
        return b(c0250a.a());
    }
}
