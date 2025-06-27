package com.mbridge.msdk.foundation.same.net.stack;

import android.content.Context;
import android.text.TextUtils;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.net.dns.MBDns;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.thrid.okhttp.ConnectionPool;
import com.mbridge.msdk.thrid.okhttp.Dispatcher;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

/* compiled from: OKHTTPClientManager.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f2908a;
    private OkHttpClient b;
    private g c;

    private c() {
        this.f2908a = "";
        this.b = null;
    }

    public static c a() {
        return a.f2912a;
    }

    public final synchronized OkHttpClient b() {
        if (this.b == null) {
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequestsPerHost(50);
            dispatcher.setMaxRequests(256);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.readTimeout(100L, TimeUnit.SECONDS);
            builder.connectTimeout(60L, TimeUnit.SECONDS);
            builder.writeTimeout(60L, TimeUnit.SECONDS);
            builder.connectionPool(new ConnectionPool(32, 5L, TimeUnit.MINUTES));
            builder.dispatcher(dispatcher);
            builder.eventListener(new EventListener() { // from class: com.mbridge.msdk.foundation.same.net.stack.c.1
            });
            builder.dns(new MBDns());
            this.b = builder.build();
        }
        return this.b;
    }

    public final b c() {
        b bVar = new b();
        bVar.h = this.f2908a;
        return bVar;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.c == null) {
                this.c = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
            }
            g gVar = this.c;
            if (gVar == null) {
                return false;
            }
            String strH = gVar.H();
            String str2 = d.f().c;
            if (TextUtils.isEmpty(strH) || !str.startsWith(strH) || TextUtils.equals(strH, str2)) {
                return false;
            }
            this.f2908a = strH;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a(b bVar) {
        if (bVar == null) {
            return;
        }
        final b bVarA = b.a(bVar);
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.stack.c.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    StringBuilder sb = new StringBuilder("key=2000102&");
                    sb.append("app_id=");
                    sb.append(com.mbridge.msdk.foundation.controller.c.m().k());
                    sb.append(t2.i.c);
                    sb.append("status=");
                    sb.append(bVarA.k);
                    sb.append(t2.i.c);
                    sb.append("domain=");
                    sb.append(bVarA.h);
                    sb.append(t2.i.c);
                    sb.append("method=");
                    sb.append(bVarA.j);
                    sb.append(t2.i.c);
                    if (TextUtils.isEmpty(bVarA.g)) {
                        if (!TextUtils.isEmpty(bVarA.b)) {
                            sb.append("connect_e=");
                            sb.append(bVarA.b);
                        } else if (!TextUtils.isEmpty(bVarA.d)) {
                            sb.append("connect_e=");
                            sb.append(bVarA.d);
                        }
                    } else {
                        sb.append("dns_r=");
                        sb.append(bVarA.g);
                        sb.append(t2.i.c);
                        sb.append("dns_d=");
                        sb.append(bVarA.f);
                        sb.append(t2.i.c);
                        sb.append("host=");
                        sb.append(bVarA.i);
                        sb.append(t2.i.c);
                        if (TextUtils.isEmpty(bVarA.d)) {
                            if (TextUtils.isEmpty(bVarA.b)) {
                                sb.append("call_d=");
                                sb.append(bVarA.f2913a);
                                sb.append(t2.i.c);
                                sb.append("connect_d=");
                                sb.append(bVarA.c);
                                sb.append(t2.i.c);
                                sb.append("connection_d=");
                                sb.append(bVarA.e);
                            } else {
                                sb.append("connect_d=");
                                sb.append(bVarA.c);
                                sb.append(t2.i.c);
                                sb.append("connection_e=");
                                sb.append(bVarA.b);
                            }
                        } else if (!TextUtils.isEmpty(bVarA.d)) {
                            sb.append("connect_e=");
                            sb.append(bVarA.d);
                        } else if (!TextUtils.isEmpty(bVarA.b)) {
                            sb.append("connect_e=");
                            sb.append(bVarA.b);
                        }
                    }
                    if (e.a().b()) {
                        e.a().a(sb.toString());
                        return;
                    }
                    final c cVar = c.this;
                    String string = sb.toString();
                    Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                    com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(contextC);
                    com.mbridge.msdk.foundation.same.net.h.e eVarA = k.a(contextC);
                    eVarA.a("data", URLEncoder.encode(string, m4.M));
                    eVarA.a("m_sdk", "msdk");
                    aVar.post(0, d.f().c, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.net.stack.c.3
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str) {
                            ad.a("OKHTTPClientManager", "report success");
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str) {
                            ad.a("OKHTTPClientManager", "report failed");
                        }
                    });
                } catch (Exception e) {
                    ad.b("OKHTTPClientManager", e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OKHTTPClientManager.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f2912a = new c();
    }

    /* compiled from: OKHTTPClientManager.java */
    public static class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public long f2913a = 0;
        public String b = "";
        public long c = 0;
        public String d = "";
        public long e = 0;
        public long f = 0;
        public String g = "";
        public String h = "";
        public String i = "";
        public String j = "";
        public int k;

        public static b a(b bVar) {
            b bVar2 = new b();
            bVar2.k = bVar.k;
            bVar2.j = bVar.j;
            bVar2.h = bVar.h;
            bVar2.f2913a = bVar.f2913a;
            bVar2.c = bVar.c;
            bVar2.b = bVar.b;
            bVar2.g = bVar.g;
            bVar2.f = bVar.f;
            bVar2.i = bVar.i;
            bVar2.d = bVar.d;
            bVar2.e = bVar.e;
            return bVar2;
        }
    }
}
