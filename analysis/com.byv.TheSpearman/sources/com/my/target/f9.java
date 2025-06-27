package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public final class f9 extends h0 {
    public a d;
    public boolean e;
    public boolean f;
    public long g;

    public interface a {
        void a(int i, String str, String str2);

        void a(String str);
    }

    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String strMessage = consoleMessage.message();
            ba.a("JS Console Message at line " + consoleMessage.lineNumber() + ": " + strMessage);
            return false;
        }
    }

    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            f9 f9Var = f9.this;
            if (f9Var.e) {
                return;
            }
            f9Var.e = true;
            ba.a("ShoppableWebView$MyWebViewClient: page loaded");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ba.a("ShoppableWebView$MyWebViewClient: page started");
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ba.a("ShoppableWebView$MyWebViewClient: load failed, error - " + i + ", description - " + str + ", url - " + str2);
            super.onReceivedError(webView, i, str, str2);
            a aVar = f9.this.d;
            if (aVar != null) {
                aVar.a(i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String string = description != null ? description.toString() : null;
            int errorCode = webResourceError.getErrorCode();
            String string2 = webResourceRequest.getUrl().toString();
            ba.a("ShoppableWebView$MyWebViewClient: load failed, error - " + errorCode + ", description - " + string + ", url - " + string2);
            a aVar = f9.this.d;
            if (aVar != null) {
                aVar.a(errorCode, string, string2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            ba.a("ShoppableWebView$MyWebViewClient: new scale - " + f2 + ", old scale - " + f);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (!f9.this.f || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            f9.this.b(url.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            f9 f9Var = f9.this;
            if (f9Var.f && str != null) {
                f9Var.b(str);
            }
            return true;
        }
    }

    public f9(Context context) {
        super(context);
        this.g = 0L;
        b bVar = new b();
        c cVar = new c();
        new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()).setIsLongpressEnabled(false);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.f9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.a(view, motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebViewBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g = Long.MAX_VALUE;
            ba.a("ShoppableWebView: action down");
        } else {
            if (action == 1) {
                this.g = System.currentTimeMillis();
                ba.a("ShoppableWebView: action up");
                this.f = true;
                return false;
            }
            if (action != 2) {
                if (action != 3) {
                    return false;
                }
                this.g = System.currentTimeMillis();
                ba.a("ShoppableWebView: action cancel");
                return false;
            }
            ba.a("ShoppableWebView: action move");
            this.g = Long.MAX_VALUE;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x < 0.0f || x > view.getWidth() || y < 0.0f || y > view.getHeight()) {
                return false;
            }
        }
        onTouchEvent(motionEvent);
        return false;
    }

    public void b(String str) {
        this.f = false;
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public long getAndResetInteractionEnd() {
        long j = this.g;
        this.g = 0L;
        return j;
    }

    @Override // com.my.target.h0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setListener(a aVar) {
        this.d = aVar;
    }
}
