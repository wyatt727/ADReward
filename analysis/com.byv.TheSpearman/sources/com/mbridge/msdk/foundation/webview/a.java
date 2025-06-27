package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import java.util.ArrayList;

/* compiled from: BackPointBrowserViewListener.java */
/* loaded from: classes4.dex */
public class a implements BrowserView.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f3014a = "a";
    private int b;
    private String d;
    private boolean e;
    private BaseTrackingListener f;
    private BrowserView g;
    private CampaignEx h;
    private com.mbridge.msdk.click.a i;
    private Context j;
    private JumpLoaderResult l;
    private long o;
    private boolean c = true;
    private boolean m = false;
    private final Runnable n = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.1
        @Override // java.lang.Runnable
        public final void run() throws ClassNotFoundException {
            ad.b(a.f3014a, "webview js！超时上限：" + a.this.b + "ms");
            if (a.this.i != null && a.this.l != null) {
                a.this.l.setSuccess(false);
                a.this.l.setUrl(a.this.d);
                a.this.l.setType(2);
                a.this.l.setExceptionMsg("linktype 8 time out");
                a.this.i.a(a.this.l, a.this.h, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.d) && !a.this.m) {
                a.this.m = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.j, a.this.d, a.this.h);
            }
            if (a.this.f != null) {
                a.this.f.onFinishRedirection(a.this.h, a.this.d);
            }
        }
    };
    private Handler k = new Handler(Looper.getMainLooper());

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a() {
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.b = 10000;
        this.l = null;
        this.j = context;
        this.h = campaignEx;
        this.g = browserView;
        this.f = baseTrackingListener;
        g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB == null) {
            h.a();
            gVarB = i.a();
        }
        this.i = aVar;
        this.l = new JumpLoaderResult();
        this.b = (int) gVarB.aq();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str) {
        if (this.o == 0) {
            this.o = System.currentTimeMillis();
            if (!this.e) {
                this.e = true;
                d();
            }
        }
        this.d = str;
        this.c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.o == 0) {
            this.o = System.currentTimeMillis();
            if (!this.e) {
                this.e = true;
                d();
            }
            this.m = false;
        }
        this.d = str;
        this.c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final boolean b(WebView webView, final String str) {
        ad.b(f3014a, "shouldOverrideUrlLoading1  " + str);
        this.c = false;
        if (ah.a.b(str) && ah.a.a(this.j, str, null)) {
            this.m = true;
        }
        boolean zE = e(webView, str);
        if (zE) {
            this.o = 0L;
            this.c = false;
            c();
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.i != null && a.this.l != null) {
                        a.this.l.setSuccess(true);
                        a.this.l.setUrl(str);
                        a.this.l.setType(2);
                        a.this.i.a(a.this.l, a.this.h, 1, true);
                    }
                    if (a.this.f != null) {
                        a.this.f.onFinishRedirection(a.this.h, str);
                    }
                }
            });
        }
        return zE;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void c(WebView webView, final String str) throws ClassNotFoundException {
        ad.b(f3014a, "onPageFinished1  " + str);
        if (this.c) {
            this.o = 0L;
            this.c = false;
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f != null) {
                        a.this.f.onFinishRedirection(a.this.h, str);
                    }
                    if (a.this.i == null || a.this.l == null) {
                        return;
                    }
                    a.this.l.setSuccess(true);
                    a.this.l.setUrl(str);
                    a.this.l.setType(2);
                    a.this.i.a(a.this.l, a.this.h, 1, true);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if (!(uri.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri.getScheme().equals("https")) || this.m) {
                return;
            }
            this.m = true;
            a(this.j, str, this.h);
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, int i, final String str, final String str2) throws ClassNotFoundException {
        ad.d(f3014a, str);
        c();
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f != null) {
                    a.this.f.onFinishRedirection(a.this.h, str2);
                }
                if (a.this.i == null || a.this.l == null) {
                    return;
                }
                a.this.l.setSuccess(false);
                a.this.l.setUrl(str2);
                a.this.l.setType(2);
                a.this.l.setExceptionMsg(str);
                a.this.i.a(a.this.l, a.this.h, 1, true);
            }
        });
        if (!d(webView, str2) || this.m) {
            return;
        }
        this.m = true;
        a(this.j, str2, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.webkit.WebView r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r7 = "http"
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto La
            return r0
        La:
            android.net.Uri r1 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "https"
            r4 = 0
            if (r2 != 0) goto L28
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = r4
            goto L29
        L28:
            r2 = r0
        L29:
            if (r2 == 0) goto L2c
            return r0
        L2c:
            java.lang.String r1 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "intent"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L94
            android.content.Intent r1 = android.content.Intent.parseUri(r8, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r1.getPackage()     // Catch: java.lang.Throwable -> L53
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L5d
            android.content.Context r5 = r6.j     // Catch: java.lang.Throwable -> L53
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L53
            android.content.Intent r2 = r5.getLaunchIntentForPackage(r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L5d
            return r4
        L53:
            r2 = move-exception
            java.lang.String r5 = com.mbridge.msdk.foundation.webview.a.f3014a     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> La5
            com.mbridge.msdk.foundation.tools.ad.b(r5, r2)     // Catch: java.lang.Throwable -> La5
        L5d:
            java.lang.String r2 = "browser_fallback_url"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch: java.lang.Throwable -> L8a
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L94
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r2.getScheme()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r5.equals(r7)     // Catch: java.lang.Throwable -> L8a
            if (r7 != 0) goto L84
            java.lang.String r7 = r2.getScheme()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L82
            goto L84
        L82:
            r7 = r4
            goto L85
        L84:
            r7 = r0
        L85:
            if (r7 == 0) goto L88
            return r0
        L88:
            r8 = r1
            goto L94
        L8a:
            r7 = move-exception
            java.lang.String r1 = com.mbridge.msdk.foundation.webview.a.f3014a     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> La5
            com.mbridge.msdk.foundation.tools.ad.b(r1, r7)     // Catch: java.lang.Throwable -> La5
        L94:
            android.content.Context r7 = r6.j     // Catch: java.lang.Throwable -> La5
            boolean r7 = com.mbridge.msdk.click.c.d(r7, r8)     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto La4
            java.lang.String r7 = com.mbridge.msdk.foundation.webview.a.f3014a     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.ad.b(r7, r8)     // Catch: java.lang.Throwable -> La5
            return r4
        La4:
            return r0
        La5:
            r7 = move-exception
            java.lang.String r8 = com.mbridge.msdk.foundation.webview.a.f3014a
            java.lang.String r7 = r7.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.a.d(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) throws ClassNotFoundException {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            Class.forName("com.mbridge.msdk.activity.MBCommonActivity");
            Intent intent = new Intent(context, Class.forName("com.mbridge.msdk.activity.MBCommonActivity"));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.f3019a.put(str, this.g);
            if (ah.a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            ad.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            ah.a(context, str, this.f, campaignEx, new ArrayList());
        }
    }

    private boolean e(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th) {
            ad.b(f3014a, th.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri.getScheme().equals("https")) {
            return false;
        }
        if (uri.getScheme().equals("intent")) {
            Intent uri2 = Intent.parseUri(str, 1);
            try {
                str2 = uri2.getPackage();
            } catch (Throwable th2) {
                ad.b(f3014a, th2.getMessage());
            }
            if (!TextUtils.isEmpty(str2) && this.j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                uri2.setFlags(268435456);
                this.j.startActivity(uri2);
                this.m = true;
                return true;
            }
            try {
                String stringExtra = uri2.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Uri uri3 = Uri.parse(str);
                    if (uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri3.getScheme().equals("https")) {
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                    str = stringExtra;
                }
            } catch (Throwable th3) {
                ad.b(f3014a, th3.getMessage());
            }
            ad.b(f3014a, th.getMessage());
            return false;
        }
        if (!com.mbridge.msdk.click.c.d(this.j, str)) {
            return false;
        }
        ad.b(f3014a, "openDeepLink");
        this.m = true;
        return true;
    }

    private void c() {
        this.k.removeCallbacks(this.n);
    }

    private void d() {
        this.k.postDelayed(this.n, this.b);
    }
}
