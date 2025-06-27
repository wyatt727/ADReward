package com.applovin.impl;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.webkit.ProxyConfig;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.ma;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class b6 extends z1 implements ma {
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final ma.f i;
    private final ma.f j;
    private final boolean k;
    private Predicate l;
    private j5 m;
    private HttpURLConnection n;
    private InputStream o;
    private boolean p;
    private int q;
    private long r;
    private long s;

    public static final class b implements ma.b {
        private yo b;
        private Predicate c;
        private String d;
        private boolean g;
        private boolean h;

        /* renamed from: a, reason: collision with root package name */
        private final ma.f f290a = new ma.f();
        private int e = 8000;
        private int f = 8000;

        @Override // com.applovin.impl.ma.b, com.applovin.impl.g5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b6 a() {
            b6 b6Var = new b6(this.d, this.e, this.f, this.g, this.f290a, this.c, this.h);
            yo yoVar = this.b;
            if (yoVar != null) {
                b6Var.a(yoVar);
            }
            return b6Var;
        }

        public b a(String str) {
            this.d = str;
            return this;
        }
    }

    private b6(String str, int i, int i2, boolean z, ma.f fVar, Predicate predicate, boolean z2) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = fVar;
        this.l = predicate;
        this.j = new ma.f();
        this.k = z2;
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.g5
    public Map e() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        try {
            InputStream inputStream = this.o;
            if (inputStream != null) {
                long j = this.r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.s;
                }
                a(this.n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new ma.c(e, (j5) yp.a(this.m), 2000, 3);
                }
            }
        } finally {
            this.o = null;
            h();
            if (this.p) {
                this.p = false;
                g();
            }
        }
    }

    private HttpURLConnection d(j5 j5Var) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url = new URL(j5Var.f560a.toString());
        int i = j5Var.c;
        byte[] bArr = j5Var.d;
        long j = j5Var.g;
        long j2 = j5Var.h;
        boolean zB = j5Var.b(1);
        if (!this.e && !this.k) {
            return a(url, i, bArr, j, j2, zB, true, j5Var.e);
        }
        int i2 = 0;
        URL urlA = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 <= 20) {
                int i5 = i3;
                long j3 = j;
                URL url2 = urlA;
                long j4 = j2;
                httpURLConnectionA = a(urlA, i3, bArr2, j, j2, zB, false, j5Var.e);
                int responseCode = httpURLConnectionA.getResponseCode();
                String headerField = httpURLConnectionA.getHeaderField("Location");
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionA.disconnect();
                    urlA = a(url2, headerField, j5Var);
                    i2 = i4;
                    i3 = i5;
                } else {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    httpURLConnectionA.disconnect();
                    if (this.k && responseCode == 302) {
                        i3 = i5;
                    } else {
                        bArr2 = null;
                        i3 = 1;
                    }
                    urlA = a(url2, headerField, j5Var);
                    i2 = i4;
                }
                j = j3;
                j2 = j4;
            } else {
                throw new ma.c(new NoRouteToHostException("Too many redirects: " + i4), j5Var, 2001, 1);
            }
        }
        return httpURLConnectionA;
    }

    private URL a(URL url, String str, j5 j5Var) throws ma.c {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                    throw new ma.c("Unsupported protocol redirect: " + protocol, j5Var, 2001, 1);
                }
                if (this.e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new ma.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", j5Var, 2001, 1);
            } catch (MalformedURLException e) {
                throw new ma.c(e, j5Var, 2001, 1);
            }
        }
        throw new ma.c("Null location redirect", j5Var, 2001, 1);
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                kc.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.n = null;
        }
    }

    private int e(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.r;
        if (j != -1) {
            long j2 = j - this.s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) yp.a((Object) this.o)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.s += i3;
        d(i3);
        return i3;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f);
        httpURLConnectionA.setReadTimeout(this.g);
        HashMap map2 = new HashMap();
        ma.f fVar = this.i;
        if (fVar != null) {
            map2.putAll(fVar.a());
        }
        map2.putAll(this.j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = oa.a(j, j2);
        if (strA != null) {
            httpURLConnectionA.setRequestProperty("Range", strA);
        }
        String str = this.h;
        if (str != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionA.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z2);
        httpURLConnectionA.setDoOutput(bArr != null);
        httpURLConnectionA.setRequestMethod(j5.a(i));
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA.connect();
        }
        return httpURLConnectionA;
    }

    private static void a(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        if (httpURLConnection == null || (i = yp.f1214a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) a1.a(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) throws IOException, NumberFormatException {
        byte[] bArrA;
        this.m = j5Var;
        long j = 0;
        this.s = 0L;
        this.r = 0L;
        b(j5Var);
        try {
            HttpURLConnection httpURLConnectionD = d(j5Var);
            this.n = httpURLConnectionD;
            this.q = httpURLConnectionD.getResponseCode();
            String responseMessage = httpURLConnectionD.getResponseMessage();
            int i = this.q;
            if (i >= 200 && i <= 299) {
                String contentType = httpURLConnectionD.getContentType();
                Predicate predicate = this.l;
                if (predicate != null && !predicate.apply(contentType)) {
                    h();
                    throw new ma.d(contentType, j5Var);
                }
                if (this.q == 200) {
                    long j2 = j5Var.g;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                boolean zA = a(httpURLConnectionD);
                if (!zA) {
                    long j3 = j5Var.h;
                    if (j3 != -1) {
                        this.r = j3;
                    } else {
                        long jA = oa.a(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        this.r = jA != -1 ? jA - j : -1L;
                    }
                } else {
                    this.r = j5Var.h;
                }
                try {
                    this.o = httpURLConnectionD.getInputStream();
                    if (zA) {
                        this.o = new GZIPInputStream(this.o);
                    }
                    this.p = true;
                    c(j5Var);
                    try {
                        a(j, j5Var);
                        return this.r;
                    } catch (IOException e) {
                        h();
                        if (e instanceof ma.c) {
                            throw ((ma.c) e);
                        }
                        throw new ma.c(e, j5Var, 2000, 1);
                    }
                } catch (IOException e2) {
                    h();
                    throw new ma.c(e2, j5Var, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
            if (this.q == 416) {
                if (j5Var.g == oa.a(httpURLConnectionD.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                    this.p = true;
                    c(j5Var);
                    long j4 = j5Var.h;
                    if (j4 != -1) {
                        return j4;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = httpURLConnectionD.getErrorStream();
            try {
                if (errorStream != null) {
                    bArrA = yp.a(errorStream);
                } else {
                    bArrA = yp.f;
                }
            } catch (IOException unused) {
                bArrA = yp.f;
            }
            byte[] bArr = bArrA;
            h();
            throw new ma.e(this.q, responseMessage, this.q == 416 ? new h5(2008) : null, headerFields, j5Var, bArr);
        } catch (IOException e3) {
            h();
            throw ma.c.a(e3, j5Var, 1);
        }
    }

    HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) throws ma.c {
        try {
            return e(bArr, i, i2);
        } catch (IOException e) {
            throw ma.c.a(e, (j5) yp.a(this.m), 2);
        }
    }

    private void a(long j, j5 j5Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) yp.a((Object) this.o)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new ma.c(new InterruptedIOException(), j5Var, 2000, 1);
            }
            if (i != -1) {
                j -= i;
                d(i);
            } else {
                throw new ma.c(j5Var, 2008, 1);
            }
        }
    }
}
