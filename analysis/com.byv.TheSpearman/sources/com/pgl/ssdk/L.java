package com.pgl.ssdk;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    private String f4293a;
    private int c;
    private int d;
    private byte[] e;
    public String b = "";
    private int f = -1;
    private byte[] g = null;
    private int h = 10000;
    private int i = 2;
    private int j = 0;
    private boolean k = false;
    private HttpURLConnection l = null;
    private Runnable m = new K(this);

    public L(Context context, String str) {
        this.f4293a = (str == null || str.length() <= 0) ? "" : str;
    }

    private void a(int i) {
        HttpURLConnection httpURLConnection;
        StringBuilder sb;
        String str;
        String str2 = i != 1 ? i != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (str2.length() > 0) {
            this.l.addRequestProperty("Content-Type", str2);
        }
        this.l.addRequestProperty(HttpHeaders.COOKIE, "sessionid=" + this.f4293a);
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                httpURLConnection = this.l;
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(",");
                sb.append(language);
                str = ";q=0.9";
            } else {
                httpURLConnection = this.l;
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(",");
                sb.append(language);
                str = ";q=0.9,en-US;q=0.6,en;q=0.4";
            }
            sb.append(str);
            httpURLConnection.addRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, sb.toString());
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ int c(L l) {
        int i = l.j;
        l.j = i + 1;
        return i;
    }

    public void a(int i, int i2, byte[] bArr) {
        X xB;
        this.c = i;
        this.d = i2;
        this.e = bArr;
        Runnable runnable = this.m;
        if (runnable == null || (xB = W.a().b()) == null) {
            return;
        }
        xB.post(runnable);
    }

    public abstract boolean a(int i, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1 A[PHI: r1 r2
      0x00c1: PHI (r1v4 boolean) = (r1v2 boolean), (r1v0 boolean) binds: [B:47:0x00be, B:42:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r2v2 java.net.HttpURLConnection) = (r2v1 java.net.HttpURLConnection), (r2v4 java.net.HttpURLConnection) binds: [B:47:0x00be, B:42:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = r9.b     // Catch: java.lang.Throwable -> Lb8
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb8
            boolean r4 = r9.k     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L24
            java.lang.String r4 = "TLS"
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getInstance(r4)     // Catch: java.lang.Throwable -> Lb8
            javax.net.ssl.SSLSocketFactory r4 = r4.getSocketFactory()     // Catch: java.lang.Throwable -> Lb8
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r4)     // Catch: java.lang.Throwable -> Lb8
            java.net.Proxy r4 = java.net.Proxy.NO_PROXY     // Catch: java.lang.Throwable -> Lb8
            java.net.URLConnection r3 = r3.openConnection(r4)     // Catch: java.lang.Throwable -> Lb8
        L21:
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> Lb8
            goto L29
        L24:
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> Lb8
            goto L21
        L29:
            r9.l = r3     // Catch: java.lang.Throwable -> Lb8
            int r4 = r9.h     // Catch: java.lang.Throwable -> Lb8
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> Lb8
            java.net.HttpURLConnection r3 = r9.l     // Catch: java.lang.Throwable -> Lb8
            int r4 = r9.h     // Catch: java.lang.Throwable -> Lb8
            r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> Lb8
            int r3 = r9.c     // Catch: java.lang.Throwable -> Lb8
            if (r3 == r1) goto L56
            r4 = 3
            if (r3 == r4) goto L53
            r4 = 4
            if (r3 == r4) goto L50
            r4 = 5
            if (r3 == r4) goto L4d
            r4 = 6
            if (r3 == r4) goto L4a
            java.lang.String r3 = "GET"
            goto L58
        L4a:
            java.lang.String r3 = "TRACE"
            goto L58
        L4d:
            java.lang.String r3 = "HEAD"
            goto L58
        L50:
            java.lang.String r3 = "DELETE"
            goto L58
        L53:
            java.lang.String r3 = "PUT"
            goto L58
        L56:
            java.lang.String r3 = "POST"
        L58:
            java.net.HttpURLConnection r4 = r9.l     // Catch: java.lang.Throwable -> Lb8
            r4.setRequestMethod(r3)     // Catch: java.lang.Throwable -> Lb8
            int r3 = r9.d     // Catch: java.lang.Throwable -> Lb8
            r9.a(r3)     // Catch: java.lang.Throwable -> Lb8
            byte[] r3 = r9.e     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto L7f
            int r3 = r3.length     // Catch: java.lang.Throwable -> Lb8
            if (r3 <= 0) goto L7f
            java.net.HttpURLConnection r3 = r9.l     // Catch: java.lang.Throwable -> Lb8
            r3.setDoOutput(r1)     // Catch: java.lang.Throwable -> Lb8
            java.net.HttpURLConnection r3 = r9.l     // Catch: java.lang.Throwable -> Lb8
            java.io.OutputStream r3 = r3.getOutputStream()     // Catch: java.lang.Throwable -> Lb8
            byte[] r4 = r9.e     // Catch: java.lang.Throwable -> Lb8
            r3.write(r4)     // Catch: java.lang.Throwable -> Lb8
            r3.flush()     // Catch: java.lang.Throwable -> Lb8
            r3.close()     // Catch: java.lang.Throwable -> Lb8
        L7f:
            java.net.HttpURLConnection r3 = r9.l     // Catch: java.lang.Throwable -> Lb8
            r3.connect()     // Catch: java.lang.Throwable -> Lb8
            java.net.HttpURLConnection r3 = r9.l     // Catch: java.lang.Throwable -> Laf
            int r3 = r3.getResponseCode()     // Catch: java.lang.Throwable -> Laf
            r9.f = r3     // Catch: java.lang.Throwable -> Laf
            java.net.HttpURLConnection r3 = r9.l     // Catch: java.lang.Throwable -> Laf
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> Laf
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lb0
            r4.<init>()     // Catch: java.lang.Throwable -> Lb0
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> Lb0
        L9b:
            int r7 = r3.read(r6, r2, r5)     // Catch: java.lang.Throwable -> Lb0
            if (r7 <= 0) goto La5
            r4.write(r6, r2, r7)     // Catch: java.lang.Throwable -> Lb0
            goto L9b
        La5:
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> Lb0
            r9.g = r4     // Catch: java.lang.Throwable -> Lb0
        Lab:
            r3.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lb3
        Laf:
            r3 = r0
        Lb0:
            if (r3 == 0) goto Lb3
            goto Lab
        Lb3:
            java.net.HttpURLConnection r2 = r9.l
            if (r2 == 0) goto Lc6
            goto Lc1
        Lb8:
            java.net.HttpURLConnection r1 = r9.l
            if (r1 != 0) goto Lbe
            r1 = r2
            goto Lc6
        Lbe:
            r8 = r2
            r2 = r1
            r1 = r8
        Lc1:
            r2.disconnect()
            r9.l = r0
        Lc6:
            if (r1 == 0) goto Lcf
            int r0 = r9.f
            byte[] r2 = r9.g
            r9.a(r0, r2)
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.L.a():boolean");
    }
}
