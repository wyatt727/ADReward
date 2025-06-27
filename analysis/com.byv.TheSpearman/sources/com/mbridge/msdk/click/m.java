package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.net.HttpHeaders;
import com.json.m4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: WebViewSpider.java */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static long f2537a = 0;
    private static final String d = "m";
    boolean b;
    boolean c;
    private int e;
    private int f;
    private com.mbridge.msdk.c.g h;
    private a i;
    private String j;
    private String k;
    private WebView l;
    private boolean m;
    private String n;
    private int o;
    private boolean q;
    private boolean p = false;
    private final Runnable r = new Runnable() { // from class: com.mbridge.msdk.click.m.4
        @Override // java.lang.Runnable
        public final void run() {
            m.this.p = true;
            m.this.o = 1;
            m.m(m.this);
        }
    };
    private final Runnable s = new Runnable() { // from class: com.mbridge.msdk.click.m.5
        @Override // java.lang.Runnable
        public final void run() {
            m.this.p = true;
            m.this.o = 2;
            m.m(m.this);
        }
    };
    private Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: WebViewSpider.java */
    interface a {
        void a(int i, String str, String str2, String str3);

        void a(String str, boolean z, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public m() {
        this.e = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
        this.f = 3000;
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        this.h = gVarB;
        if (gVarB == null) {
            com.mbridge.msdk.c.h.a();
            this.h = com.mbridge.msdk.c.i.a();
        }
        this.m = this.h.aI();
        this.e = (int) this.h.aq();
        this.f = (int) this.h.aq();
    }

    public final void a(String str, String str2, Context context, String str3, String str4, a aVar) {
        Objects.requireNonNull(aVar, "OverrideUrlLoadingListener can not be null");
        this.k = str4;
        this.j = str3;
        this.i = aVar;
        a(str, str2, context);
    }

    public final void a(String str, String str2, Context context, String str3, a aVar) {
        Objects.requireNonNull(aVar, "OverrideUrlLoadingListener can not be null");
        this.j = str3;
        this.i = aVar;
        a(str, str2, context);
    }

    private void a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.j);
        } else {
            this.g.post(new Runnable() { // from class: com.mbridge.msdk.click.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = m.this;
                    mVar.a(str, str2, context, mVar.j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.k)) {
                this.l.getSettings().setDefaultTextEncodingName(m4.M);
                this.f = 2000;
                this.e = 2000;
                ad.c(d, this.k);
                this.l.loadDataWithBaseURL(str3, this.k, "*/*", m4.M, str3);
                return;
            }
            if (this.m) {
                HashMap map = new HashMap();
                if (this.l.getUrl() != null) {
                    map.put(HttpHeaders.REFERER, this.l.getUrl());
                }
                this.l.loadUrl(str3, map);
                return;
            }
            this.l.loadUrl(str3);
        } catch (Throwable th) {
            try {
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(0, this.j, th.getMessage(), this.n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(final Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.l.getSettings().setCacheMode(2);
        this.l.getSettings().setLoadsImagesAutomatically(false);
        this.l.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.click.m.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (m.this.q) {
                        m.this.o = 0;
                        m.c(m.this);
                        return;
                    }
                    m.this.c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        m.this.b = true;
                    }
                    synchronized (m.d) {
                        m.this.j = str3;
                        if (m.this.i != null && m.this.i.a(str3)) {
                            m.this.q = true;
                            m.c(m.this);
                        } else {
                            m.e(m.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (m.d) {
                    m.this.c = true;
                    m.this.d();
                    if (m.this.q) {
                        m.this.c();
                        m.c(m.this);
                        return true;
                    }
                    m.this.j = str3;
                    if (m.this.i == null || !m.this.i.b(str3)) {
                        if (!m.this.m) {
                            m.this.l.loadUrl(str3);
                        } else {
                            HashMap map = new HashMap();
                            if (m.this.l.getUrl() != null) {
                                map.put(HttpHeaders.REFERER, m.this.l.getUrl());
                            }
                            m.this.l.loadUrl(str3, map);
                        }
                        return true;
                    }
                    m.this.q = true;
                    m.this.c();
                    m.c(m.this);
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str3, String str4) {
                synchronized (m.d) {
                    m.this.q = true;
                    m.this.b();
                    m.c(m.this);
                }
                if (m.this.i != null) {
                    m.this.i.a(i, webView2.getUrl(), str3, m.this.n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                        return;
                    }
                    new com.mbridge.msdk.foundation.same.report.i(context).a(str, str2, webView2.getUrl());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    synchronized (m.d) {
                        m.this.q = true;
                        m.this.b();
                        m.c(m.this);
                    }
                    if (m.this.i != null) {
                        m.this.i.a(-1, webView2.getUrl(), "WebView render process crash.", m.this.n);
                    }
                    if (webView2 != null) {
                        webView2.destroy();
                    }
                    return true;
                } catch (Throwable th) {
                    ad.b(m.d, th.getMessage());
                    return true;
                }
            }
        });
        this.l.setWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.click.m.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i) {
                if (i == 100) {
                    try {
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!m.this.q && !m.this.c) {
                            m.l(m.this);
                        }
                        if (m.this.i != null) {
                            m.this.i.c(webView2.getUrl());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        d();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.g.removeCallbacks(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.g.removeCallbacks(this.r);
    }

    static /* synthetic */ void c(m mVar) {
        a aVar;
        synchronized (d) {
            try {
                mVar.b();
                aVar = mVar.i;
            } catch (Exception e) {
                ad.b(d, e.getMessage());
            } catch (Throwable th) {
                ad.b(d, th.getMessage());
            }
            if (aVar != null) {
                aVar.a(mVar.j, mVar.p, mVar.n);
            }
        }
    }

    static /* synthetic */ void e(m mVar) {
        mVar.c();
        mVar.g.postDelayed(mVar.s, mVar.e);
    }

    static /* synthetic */ void l(m mVar) {
        mVar.d();
        mVar.g.postDelayed(mVar.r, mVar.f);
    }

    static /* synthetic */ void m(m mVar) {
        a aVar;
        synchronized (d) {
            try {
                try {
                    mVar.b();
                    mVar.l.destroy();
                    aVar = mVar.i;
                } finally {
                }
            } catch (Exception e) {
                ad.b(d, e.getMessage());
            }
            if (aVar != null) {
                aVar.a(mVar.j, mVar.p, mVar.n);
            }
        }
    }
}
