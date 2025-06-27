package com.applovin.impl;

import androidx.core.util.Consumer;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zf;
import com.applovin.sdk.AppLovinErrorCodes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b4 {
    private static final List e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f284a;
    private final com.applovin.impl.sdk.t b;
    private final zf c;
    private d d;

    public interface e {
        void a(String str, int i, String str2, Object obj);

        void a(String str, Object obj, int i);
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f284a = kVar;
        this.b = kVar.L();
        zf zfVar = new zf(kVar);
        this.c = zfVar;
        zfVar.a();
    }

    private class c implements Consumer {

        /* renamed from: a, reason: collision with root package name */
        private final String f286a;
        private final com.applovin.impl.sdk.network.a b;
        private final String c;
        private final Object d;
        private final boolean e;
        private final b f;
        private final e g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z, b bVar, e eVar) {
            this.f286a = str;
            this.b = aVar;
            this.c = str2;
            this.d = obj;
            this.e = z;
            this.f = bVar;
            this.g = eVar;
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(zf.d dVar) {
            int i;
            long jE = dVar.e();
            Object objA = null;
            int iA = 0;
            try {
                int iC = dVar.c();
                try {
                    if (iC <= 0) {
                        b4.this.a(this.c, this.f286a, iC, jE, (Throwable) null);
                        this.g.a(this.f286a, iC, null, null);
                        return;
                    }
                    if (iC >= 200 && iC < 400) {
                        b bVar = this.f;
                        if (bVar != null) {
                            bVar.a(jE);
                        }
                        b4.this.a(this.c, this.f286a, iC, jE);
                        byte[] bArrD = dVar.d();
                        if (zp.f(com.applovin.impl.sdk.k.k()) && (!this.e || qi.b(bArrD) != qi.a.V2)) {
                            b4.this.f284a.o().a(bArrD != null ? new String(dVar.d(), Charset.forName(C.UTF8_NAME)) : "", this.f286a, this.b.b() != null ? this.b.b().toString() : "");
                        }
                        if (bArrD != null) {
                            String str = new String(dVar.d(), Charset.forName(C.UTF8_NAME));
                            b bVar2 = this.f;
                            if (bVar2 != null) {
                                bVar2.b(bArrD.length);
                                if (this.b.r()) {
                                    b4.this.d = new d(this.b.f(), bArrD.length, jE);
                                }
                            }
                            if (this.e) {
                                String strB = qi.b(bArrD, b4.this.f284a.d0(), b4.this.f284a);
                                if (strB == null) {
                                    HashMap map = new HashMap(2);
                                    map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f286a));
                                    map.put(com.json.mediationsdk.utils.c.Y1, str);
                                    b4.this.f284a.C().trackEvent("rdf", map);
                                }
                                str = strB;
                            }
                            try {
                                this.g.a(this.f286a, b4.this.a(str, this.d), iC);
                                return;
                            } catch (Throwable th) {
                                String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f286a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                com.applovin.impl.sdk.t unused = b4.this.b;
                                if (com.applovin.impl.sdk.t.a()) {
                                    b4.this.b.a("ConnectionManager", str2, th);
                                }
                                b4.this.f284a.F().c(aa.n);
                                b4.this.f284a.B().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f286a)));
                                this.g.a(this.f286a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                return;
                            }
                        }
                        this.g.a(this.f286a, this.d, iC);
                        return;
                    }
                    this.g.a(this.f286a, iC, null, null);
                } catch (MalformedURLException e) {
                    e = e;
                    i = iC;
                    if (this.d == null) {
                        b4.this.a(this.c, this.f286a, i, jE);
                        this.g.a(this.f286a, this.d, -901);
                    } else {
                        b4.this.a(this.c, this.f286a, i, jE, e);
                        this.g.a(this.f286a, -901, e.getMessage(), null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    iA = iC;
                    if (((Boolean) b4.this.f284a.a(oj.u)).booleanValue()) {
                        iA = dVar.b();
                    }
                    if (iA == 0) {
                        iA = b4.this.a(th);
                    }
                    int i2 = iA;
                    try {
                        byte[] bArrF = dVar.f();
                        String str3 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.e) {
                                str3 = qi.b(bArrF, b4.this.f284a.d0(), b4.this.f284a);
                            }
                            objA = b4.this.a(str3, this.d);
                        }
                    } catch (Throwable unused2) {
                    }
                    b4.this.a(this.c, this.f286a, i2, jE, th);
                    this.g.a(this.f286a, i2, th.getMessage(), objA);
                }
            } catch (MalformedURLException e2) {
                e = e2;
                i = 0;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f285a;
        private long b;

        public long a() {
            return this.f285a;
        }

        public long b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f285a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.b = j;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f287a = System.currentTimeMillis();
        private final String b;
        private final long c;
        private final long d;

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public d(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public long c() {
            return this.f287a;
        }

        public String d() {
            return this.b;
        }

        public long b() {
            return this.c;
        }

        public long a() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    public d a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof fs) {
                return gs.a(str, this.f284a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0247 A[Catch: all -> 0x029d, TryCatch #2 {all -> 0x029d, blocks: (B:44:0x0128, B:46:0x0138, B:50:0x0164, B:49:0x0160, B:51:0x0173, B:54:0x0198, B:56:0x01b4, B:60:0x01d5, B:76:0x022d, B:79:0x023c, B:81:0x0247, B:62:0x01d9, B:65:0x01e1, B:71:0x01f9, B:73:0x01ff, B:74:0x0219, B:57:0x01c2, B:82:0x024a, B:84:0x0250, B:85:0x0264, B:67:0x01f2), top: B:107:0x0128, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.impl.sdk.network.a r24, com.applovin.impl.b4.b r25, com.applovin.impl.b4.e r26) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.a(com.applovin.impl.sdk.network.a, com.applovin.impl.b4$b, com.applovin.impl.b4$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + c4.g(this.f284a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j, Throwable th) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + c4.g(this.f284a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
