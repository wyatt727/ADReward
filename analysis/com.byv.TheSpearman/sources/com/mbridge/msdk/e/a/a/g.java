package com.mbridge.msdk.e.a.a;

import android.text.TextUtils;
import com.mbridge.msdk.e.a.p;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: HurlStack.java */
/* loaded from: classes4.dex */
public final class g extends com.mbridge.msdk.e.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final b f2692a;
    private final SSLSocketFactory b;

    /* compiled from: HurlStack.java */
    public interface b extends k {
    }

    public g() {
        this(null);
    }

    private g(b bVar) {
        this(bVar, null);
    }

    private g(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f2692a = bVar;
        this.b = sSLSocketFactory;
    }

    @Override // com.mbridge.msdk.e.a.a.a
    public final f a(p<?> pVar, Map<String, String> map) throws Throwable {
        String strI;
        SSLSocketFactory sSLSocketFactory;
        if (pVar.g() != 0) {
            strI = pVar.i();
        } else {
            strI = pVar.i();
            if (TextUtils.isEmpty(strI)) {
                strI = "";
            } else {
                byte[] bArrO = pVar.o();
                if (bArrO != null && bArrO.length != 0) {
                    strI = strI.endsWith("?") ? strI + new String(bArrO) : strI + "?" + new String(bArrO);
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(pVar.d());
        b bVar = this.f2692a;
        if (bVar != null) {
            String strA = bVar.a(strI);
            if (strA == null) {
                throw new IOException("URL blocked by rewriter: " + strI);
            }
            strI = strA;
        }
        URL url = new URL(strI);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iS = pVar.s();
        httpURLConnection.setConnectTimeout(iS);
        httpURLConnection.setReadTimeout(iS);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            switch (pVar.g()) {
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    a(httpURLConnection, pVar);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    a(httpURLConnection, pVar);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    httpURLConnection.setRequestMethod("PATCH");
                    a(httpURLConnection, pVar);
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (!((pVar.g() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                f fVar = new f(responseCode, a(httpURLConnection.getHeaderFields()));
                httpURLConnection.disconnect();
                return fVar;
            }
            try {
                return new f(responseCode, a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static List<com.mbridge.msdk.e.a.i> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.mbridge.msdk.e.a.i(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* compiled from: HurlStack.java */
    static class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f2693a;

        a(HttpURLConnection httpURLConnection) {
            super(g.b(httpURLConnection));
            this.f2693a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f2693a.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private void a(HttpURLConnection httpURLConnection, p<?> pVar) throws IOException {
        byte[] bArrO = pVar.o();
        if (bArrO != null) {
            a(httpURLConnection, pVar, bArrO);
        }
    }

    private void a(HttpURLConnection httpURLConnection, p<?> pVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", pVar.n());
        }
        int length = bArr.length;
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
