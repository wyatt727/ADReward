package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: JavaHttpSpider.java */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2533a = "h";
    private com.mbridge.msdk.c.g b;
    private String c;
    private boolean d = true;
    private final int e = 3145728;
    private com.mbridge.msdk.click.entity.a f;

    public h() {
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        this.b = gVarB;
        if (gVarB == null) {
            com.mbridge.msdk.c.h.a();
            this.b = com.mbridge.msdk.c.i.a();
        }
    }

    public final com.mbridge.msdk.click.entity.a a(String str, boolean z, boolean z2, CampaignEx campaignEx) {
        HttpURLConnection httpURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(" ", "%20");
        this.f = new com.mbridge.msdk.click.entity.a();
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(strReplace).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                if ((!z && !z2) || campaignEx == null) {
                    httpURLConnection2.setRequestProperty("User-Agent", z.g());
                }
                if (z && campaignEx != null && campaignEx.getcUA() == 1) {
                    httpURLConnection2.setRequestProperty("User-Agent", z.g());
                }
                if (z2 && campaignEx != null && campaignEx.getImpUA() == 1) {
                    httpURLConnection2.setRequestProperty("User-Agent", z.g());
                }
                httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                if (this.b.aI() && !TextUtils.isEmpty(this.c)) {
                    httpURLConnection2.setRequestProperty("referer", this.c);
                }
                httpURLConnection2.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
                httpURLConnection2.setReadTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.connect();
                this.f.f2530a = httpURLConnection2.getHeaderField("Location");
                this.f.d = httpURLConnection2.getHeaderField(HttpHeaders.REFERER);
                this.f.f = httpURLConnection2.getResponseCode();
                this.f.b = httpURLConnection2.getContentType();
                this.f.e = httpURLConnection2.getContentLength();
                this.f.c = httpURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f.c);
                if (this.f.f == 200 && this.d && this.f.e > 0 && this.f.e < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strA = a(httpURLConnection2.getInputStream(), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strA)) {
                            byte[] bytes = strA.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f.g = strA.trim();
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(f2533a, th.getMessage());
                    }
                }
                this.c = strReplace;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return this.f;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    this.f.h = th.getMessage();
                    return this.f;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x002c, TryCatch #5 {all -> 0x002c, blocks: (B:4:0x0008, B:5:0x000e, B:19:0x002f, B:21:0x0033, B:22:0x0040), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: Exception -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:10:0x0022, B:24:0x004b), top: B:37:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.io.InputStream r4, boolean r5) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto Le
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4 = r5
        Le:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L18:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r4 == 0) goto L22
            r0.append(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            goto L18
        L22:
            r5.close()     // Catch: java.lang.Exception -> L4f
            goto L59
        L26:
            r4 = move-exception
            r1 = r5
            goto L5e
        L29:
            r4 = move-exception
            r1 = r5
            goto L2f
        L2c:
            r4 = move-exception
            goto L5e
        L2e:
            r4 = move-exception
        L2f:
            com.mbridge.msdk.click.entity.a r5 = r3.f     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L40
            com.mbridge.msdk.click.entity.a r5 = new com.mbridge.msdk.click.entity.a     // Catch: java.lang.Throwable -> L2c
            r5.<init>()     // Catch: java.lang.Throwable -> L2c
            r3.f = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L2c
            r5.h = r2     // Catch: java.lang.Throwable -> L2c
        L40:
            java.lang.String r5 = com.mbridge.msdk.click.h.f2533a     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L2c
            com.mbridge.msdk.foundation.tools.ad.b(r5, r4)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.lang.Exception -> L4f
            goto L59
        L4f:
            r4 = move-exception
            java.lang.String r5 = com.mbridge.msdk.click.h.f2533a
            java.lang.String r4 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r5, r4)
        L59:
            java.lang.String r4 = r0.toString()
            return r4
        L5e:
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.lang.Exception -> L64
            goto L6e
        L64:
            r5 = move-exception
            java.lang.String r0 = com.mbridge.msdk.click.h.f2533a
            java.lang.String r5 = r5.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r0, r5)
        L6e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.h.a(java.io.InputStream, boolean):java.lang.String");
    }
}
