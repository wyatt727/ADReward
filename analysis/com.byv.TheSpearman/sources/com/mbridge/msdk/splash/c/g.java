package com.mbridge.msdk.splash.c;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* compiled from: WebViewRenderManager.java */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3502a;
    private boolean b;

    /* compiled from: WebViewRenderManager.java */
    public interface b {
        void a();

        void a(int i);

        void a(String str);
    }

    private g() {
        this.f3502a = false;
        this.b = false;
    }

    /* compiled from: WebViewRenderManager.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f3504a = new g();
    }

    public final void a() {
        this.f3502a = false;
        this.b = false;
    }

    public final void a(final MBSplashView mBSplashView, c cVar, final b bVar) {
        String requestId;
        if (mBSplashView == null || cVar == null) {
            return;
        }
        final String strC = cVar.c();
        String strB = cVar.b();
        final CampaignEx campaignExD = cVar.d();
        String strA = cVar.a();
        boolean zE = cVar.e();
        int iF = cVar.f();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.c cVar2 = new com.mbridge.msdk.splash.signal.c(mBSplashView.getContext(), strB, strC);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExD);
        cVar2.a(arrayList);
        cVar2.a(zE ? 1 : 0);
        cVar2.b(iF);
        mBSplashView.setSplashSignalCommunicationImpl(cVar2);
        if (TextUtils.isEmpty(campaignExD.getRequestId())) {
            requestId = campaignExD.getRequestIdNotice();
        } else {
            requestId = campaignExD.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        ad.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f3502a || this.b)) {
            mBSplashView.setH5Ready(true);
            if (bVar != null) {
                bVar.a(1);
                return;
            }
            return;
        }
        a();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.a.c cVarA = com.mbridge.msdk.splash.a.c.a().c(campaignExD.getId()).d(campaignExD.getRequestId()).g(campaignExD.getRequestIdNotice()).b(strC).a(campaignExD.isBidCampaign());
        if (cVarA != null) {
            cVarA.a("2000067");
            if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                com.mbridge.msdk.foundation.same.report.e.a().a(cVarA.b());
            } else {
                h.a(cVarA.b(), com.mbridge.msdk.foundation.controller.c.m().c(), strC);
            }
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.splash.c.g.1
            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i) {
                super.a(webView, i);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(i);
                }
                if (i == 1) {
                    g.this.f3502a = true;
                    mBSplashView.setH5Ready(true);
                    com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignExD, strC, "", jCurrentTimeMillis, 1);
                    com.mbridge.msdk.splash.e.a.a(campaignExD, strC);
                    return;
                }
                g.this.f3502a = false;
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(campaignExD, "readyState 2", strC);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignExD, strC, "readyState 2", jCurrentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i, String str, String str2) {
                super.a(webView, i, str, str2);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(str);
                }
                g.this.a();
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(campaignExD, "error code:" + i + str, strC);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignExD, strC, "error code:" + i + str, jCurrentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.a(webView, sslErrorHandler, sslError);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(sslError.toString());
                }
                g.this.a();
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(campaignExD, "error url:" + sslError.getUrl(), strC);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignExD, strC, "error url:" + sslError.getUrl(), jCurrentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
                g.this.b = true;
                if (!campaignExD.isHasMBTplMark()) {
                    mBSplashView.setH5Ready(true);
                    com.mbridge.msdk.splash.e.a.a(campaignExD, strC);
                    com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignExD, strC, "", jCurrentTimeMillis, 1);
                }
                com.mbridge.msdk.splash.signal.d.a(webView);
            }
        });
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(strA);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignExD, strC, "webview had destory", jCurrentTimeMillis, 3);
        }
    }

    /* compiled from: WebViewRenderManager.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f3505a;
        private String b;
        private CampaignEx c;
        private String d;
        private boolean e;
        private int f;

        public final String a() {
            return this.d;
        }

        public final void a(String str) {
            this.d = str;
        }

        public final String b() {
            return this.f3505a;
        }

        public final void b(String str) {
            this.f3505a = str;
        }

        public final String c() {
            return this.b;
        }

        public final void c(String str) {
            this.b = str;
        }

        public final CampaignEx d() {
            return this.c;
        }

        public final void a(CampaignEx campaignEx) {
            this.c = campaignEx;
        }

        public final boolean e() {
            return this.e;
        }

        public final void a(boolean z) {
            this.e = z;
        }

        public final int f() {
            return this.f;
        }

        public final void a(int i) {
            this.f = i;
        }
    }
}
