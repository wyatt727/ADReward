package com.my.target;

import android.content.Context;
import android.os.Build;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Map;

/* loaded from: classes4.dex */
public class c2 extends a2<String> {

    /* renamed from: a, reason: collision with root package name */
    public final b2<String> f3934a = new b2<>();
    public int b;

    public static c2 a() {
        return new c2();
    }

    @Override // com.my.target.a2
    public b2<String> a(String str, String str2, Map<String, String> map, Context context) {
        this.b = 0;
        a(str, context);
        return this.f3934a;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public final String a(HttpURLConnection httpURLConnection) {
        if (this.b <= 10) {
            try {
                ?? string = httpURLConnection.getURL().toURI().resolve(new URI(httpURLConnection.getHeaderField("Location"))).toString();
                boolean z = true;
                if (Build.VERSION.SDK_INT >= 28 && !da.c(string)) {
                    z = false;
                }
                if (!da.d(string) && z) {
                    return string;
                }
                this.f3934a.d = string;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6, android.content.Context r7) {
        /*
            r5 = this;
            com.my.target.b2<java.lang.String> r0 = r5.f3934a
            r0.d = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpStatRequest: Send stat request - "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.my.target.ba.a(r0)
            com.my.target.x5 r0 = com.my.target.x5.a(r7)
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L8d
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            java.net.URLConnection r6 = r3.openConnection()     // Catch: java.lang.Throwable -> L8d
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L8d
            r3 = 10000(0x2710, float:1.4013E-41)
            r6.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L8b
            r6.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "GET"
            r6.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "http.agent"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.lang.Throwable -> L8b
            r6.addRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L8b
            r6.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "connection"
            java.lang.String r4 = "close"
            r6.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L8b
            r0.b(r6)     // Catch: java.lang.Throwable -> L8b
            int r3 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L8b
            com.my.target.b2<java.lang.String> r4 = r5.f3934a     // Catch: java.lang.Throwable -> L8b
            r4.c = r3     // Catch: java.lang.Throwable -> L8b
            java.io.InputStream r4 = r6.getInputStream()     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L5f
            r4.close()     // Catch: java.lang.Throwable -> L8b
        L5f:
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L87
            r4 = 204(0xcc, float:2.86E-43)
            if (r3 == r4) goto L87
            r4 = 404(0x194, float:5.66E-43)
            if (r3 == r4) goto L87
            r4 = 403(0x193, float:5.65E-43)
            if (r3 != r4) goto L70
            goto L87
        L70:
            r0 = 302(0x12e, float:4.23E-43)
            if (r3 == r0) goto L7c
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L7c
            r0 = 303(0x12f, float:4.25E-43)
            if (r3 != r0) goto Lb1
        L7c:
            int r0 = r5.b     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + 1
            r5.b = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = r5.a(r6)     // Catch: java.lang.Throwable -> L8b
            goto Lb1
        L87:
            r0.a(r6)     // Catch: java.lang.Throwable -> L8b
            goto Lb1
        L8b:
            r0 = move-exception
            goto L8f
        L8d:
            r0 = move-exception
            r6 = r2
        L8f:
            com.my.target.b2<java.lang.String> r3 = r5.f3934a
            r3.f3927a = r1
            java.lang.String r0 = r0.getMessage()
            r3.e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpStatRequest: Stat request error - "
            r0.append(r1)
            com.my.target.b2<java.lang.String> r1 = r5.f3934a
            java.lang.String r1 = r1.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.my.target.ba.a(r0)
        Lb1:
            if (r6 == 0) goto Lb6
            r6.disconnect()
        Lb6:
            if (r2 == 0) goto Lcf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "HttpStatRequest: Redirected to - "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.my.target.ba.a(r6)
            r5.a(r2, r7)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.c2.a(java.lang.String, android.content.Context):void");
    }
}
