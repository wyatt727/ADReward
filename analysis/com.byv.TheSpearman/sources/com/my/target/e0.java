package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes4.dex */
public final class e0 extends h0 {
    public a d;
    public boolean e;
    public boolean f;
    public d g;

    public interface a {
        void a(WebView webView);

        void a(String str);

        void b();

        void b(String str);
    }

    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            ba.a("BannerWebView$MyWebChromeClient: JS console message " + consoleMessage.message() + " at line " + consoleMessage.lineNumber());
            return false;
        }
    }

    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            e0 e0Var = e0.this;
            if (e0Var.e) {
                return;
            }
            e0Var.e = true;
            ba.a("BannerWebView$MyWebViewClient: Page loaded");
            super.onPageFinished(webView, str);
            a aVar = e0.this.d;
            if (aVar != null) {
                aVar.a(webView);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ba.a("BannerWebView$MyWebViewClient: Load page started");
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ba.a("BannerWebView$MyWebViewClient: Load failed. Error - " + i + ", description - " + str + ", url - " + str2);
            super.onReceivedError(webView, i, str, str2);
            a aVar = e0.this.d;
            if (aVar == null) {
                return;
            }
            if (str == null) {
                str = "unknown JS error";
            }
            aVar.a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String string = description != null ? description.toString() : null;
            ba.a("BannerWebView$MyWebViewClient: Load failed. Error - " + webResourceError.getErrorCode() + ", description - " + string + ", url - " + webResourceRequest.getUrl().toString());
            a aVar = e0.this.d;
            if (aVar == null) {
                return;
            }
            if (string == null) {
                string = "Unknown JS error";
            }
            aVar.a(string);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            ba.b("WebView crashed");
            a aVar = e0.this.d;
            if (aVar == null) {
                return true;
            }
            aVar.b();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            ba.a("BannerWebView$MyWebViewClient: Scale new - " + f2 + ", old - " + f);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (!e0.this.f || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            e0.this.c(url.toString());
            e0.this.h();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            e0 e0Var = e0.this;
            if (e0Var.f && str != null) {
                e0Var.c(str);
                e0.this.h();
            }
            return true;
        }
    }

    public interface d {
        void a();
    }

    public static final class e extends GestureDetector {

        /* renamed from: a, reason: collision with root package name */
        public final View f3955a;
        public a b;

        public interface a {
            void a();
        }

        public e(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public e(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f3955a = view;
            setIsLongpressEnabled(false);
        }

        public void a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.b == null) {
                        ba.a("BannerWebView$ViewGestureDetector: View's onUserClick() is not registered");
                        return;
                    } else {
                        ba.a("BannerWebView$ViewGestureDetector: Gestures - user clicked");
                        this.b.a();
                        return;
                    }
                }
                if (action != 2 || !a(motionEvent, this.f3955a)) {
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        public void a(a aVar) {
            this.b = aVar;
        }

        public final boolean a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }
    }

    public e0(Context context) {
        super(context);
        b bVar = new b();
        c cVar = new c();
        final e eVar = new e(getContext(), this);
        eVar.a(new e.a() { // from class: com.my.target.e0$$ExternalSyntheticLambda1
            @Override // com.my.target.e0.e.a
            public final void a() {
                this.f$0.g();
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.e0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return e0.a(eVar, view, motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        setWebChromeClient(bVar);
        setWebViewClient(cVar);
    }

    public static /* synthetic */ boolean a(e eVar, View view, MotionEvent motionEvent) {
        eVar.a(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f = true;
    }

    public void b(String str) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    public void c(String str) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    public void h() {
        this.f = false;
    }

    @Override // com.my.target.h0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d dVar = this.g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setBannerWebViewListener(a aVar) {
        this.d = aVar;
    }

    public void setData(String str) {
        this.e = false;
        this.f = false;
        a("https://ad.mail.ru/", str, "text/html", C.UTF8_NAME, null);
    }

    public void setForceMediaPlayback(boolean z) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.getSettings().setMediaPlaybackRequiresUserGesture(!z);
    }

    public void setOnLayoutListener(d dVar) {
        this.g = dVar;
    }
}
