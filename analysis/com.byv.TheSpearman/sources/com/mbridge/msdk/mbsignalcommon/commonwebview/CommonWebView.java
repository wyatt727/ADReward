package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.click.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* renamed from: a, reason: collision with root package name */
    protected ToolBar f3160a;
    protected ToolBar b;
    protected ProgressBar c;
    protected BaseWebView d;
    private int e;
    private int f;
    private RelativeLayout g;
    private View.OnClickListener h;
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b i;
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a j;
    private View.OnClickListener k;
    private View.OnClickListener l;
    private View.OnClickListener m;
    private View.OnClickListener n;
    private Handler o;
    private int p;
    private WebViewClient q;
    private String r;
    private b s;
    private boolean t;
    private final Runnable u;

    public interface a {
        void a();
    }

    public interface b {
        void a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.p + "ms");
                if (CommonWebView.this.s != null) {
                    CommonWebView.this.t = false;
                    CommonWebView.this.s.a(CommonWebView.this.r);
                }
            }
        };
        init();
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.p + "ms");
                if (CommonWebView.this.s != null) {
                    CommonWebView.this.t = false;
                    CommonWebView.this.s.a(CommonWebView.this.r);
                }
            }
        };
        init();
    }

    public CommonWebView(Context context) {
        super(context);
        this.u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.p + "ms");
                if (CommonWebView.this.s != null) {
                    CommonWebView.this.t = false;
                    CommonWebView.this.s.a(CommonWebView.this.r);
                }
            }
        };
        init();
    }

    public WebView getWebView() {
        return this.d;
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.g = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.g, layoutParams);
        this.e = ai.a(getContext(), 40.0f);
        this.f = ai.a(getContext(), 40.0f);
        this.i = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.j = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f3160a.getParent()).removeView(this.f3160a);
        this.g.addView(this.f3160a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f3160a.getParent()).removeView(this.f3160a);
        addView(this.f3160a, 0);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z) {
        a(arrayList, z);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public void useProgressBar() throws Resources.NotFoundException {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                ad.c("CommonWebView", "newProgress! 开始! = " + str);
                CommonWebView.this.c.setVisible(true);
                CommonWebView.this.c.setProgressState(5);
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                ad.c("CommonWebView", "newProgress! = " + i);
                if (i == 100) {
                    CommonWebView.this.c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.c);
        this.c.initResource(true);
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f3160a;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.b) == null) ? item : toolBar.getItem(str);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f3160a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f3160a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.b;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.b;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z) {
        if (this.f3160a != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.f3169a = 40;
        ToolBar.a.b = 80;
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f3160a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.e);
            layoutParams.addRule(10);
            this.f3160a.setLayoutParams(layoutParams);
            this.g.addView(this.f3160a);
            return;
        }
        this.f3160a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.e));
        addView(this.f3160a, 0);
    }

    public void initWebview() {
        try {
            if (this.d == null) {
                this.d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.d.setLayoutParams(layoutParams);
            com.mbridge.msdk.mbsignalcommon.base.b bVar = this.d.mWebViewClient;
            this.d.setWebViewClient(this.i);
            this.d.setWebChromeClient(this.j);
            addWebViewClient(bVar);
        } catch (Throwable th) {
            ad.a("CommonWebView", "webview is error", th);
        }
        this.g.addView(this.d);
    }

    public void loadUrl(String str) {
        this.d.loadUrl(str);
        if (this.q != null) {
            a();
        }
    }

    public String getUrl() {
        BaseWebView baseWebView = this.d;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.i.a(webViewClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.i.b(webViewClient);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.j.a(webChromeClient);
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.j.b(webChromeClient);
    }

    public void setToolBarTitle(String str, int i) {
        this.f3160a.setTitle(str, i);
    }

    public void setToolBarTitle(String str) {
        this.f3160a.setTitle(str);
    }

    public void showToolBarTitle() {
        this.f3160a.showTitle();
    }

    public void hideToolBarTitle() {
        this.f3160a.hideTitle();
    }

    public void useDeeplink() {
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.6
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (ah.a.b(str)) {
                    ah.a.a(CommonWebView.this.getContext(), str, null);
                }
                return CommonWebView.this.a(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th) {
            ad.b("CommonWebView", th.getMessage());
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
                ad.b("CommonWebView", th2.getMessage());
            }
            if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                uri2.setFlags(268435456);
                getContext().startActivity(uri2);
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
                ad.b("CommonWebView", th3.getMessage());
            }
            ad.b("CommonWebView", th.getMessage());
            return false;
        }
        if (c.d(getContext(), str)) {
            ad.b("CommonWebView", "openDeepLink");
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !(str.startsWith(ProxyConfig.MATCH_HTTP) || str.startsWith("https"));
    }

    public void setPageLoadTimtout(int i) {
        this.p = i;
        if (this.o == null) {
            this.o = new Handler(Looper.getMainLooper());
        }
        if (this.q == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.r = str;
                    if (CommonWebView.this.t) {
                        return;
                    }
                    CommonWebView.this.t = true;
                    CommonWebView.this.a();
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.r = str;
                    if (CommonWebView.this.t) {
                        CommonWebView.k(CommonWebView.this);
                    }
                    CommonWebView.this.t = true;
                    CommonWebView.this.a();
                    return false;
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.t = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i2, String str, String str2) {
                    CommonWebView.this.t = false;
                    CommonWebView.k(CommonWebView.this);
                }
            };
            this.q = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.o.postDelayed(this.u, this.p);
    }

    public void setPageLoadTimtoutListener(b bVar) {
        this.s = bVar;
    }

    public void useDefaultToolBar() {
        if (this.b != null) {
            return;
        }
        this.b = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f);
        layoutParams.bottomMargin = 0;
        this.b.setLayoutParams(layoutParams);
        this.b.setBackgroundColor(-1);
        this.b.setOnItemClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CommonWebView.this.d != null) {
                    CommonWebView.this.d.stopLoading();
                    String str = (String) view.getTag();
                    if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                        CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(true);
                        if (CommonWebView.this.d.canGoBack()) {
                            CommonWebView.this.d.goBack();
                        }
                        CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.d.canGoBack());
                        if (CommonWebView.this.k != null) {
                            CommonWebView.this.k.onClick(view);
                            return;
                        }
                        return;
                    }
                    if (TextUtils.equals(str, ToolBar.FORWARD)) {
                        CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(true);
                        if (CommonWebView.this.d.canGoForward()) {
                            CommonWebView.this.d.goForward();
                        }
                        CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.d.canGoForward());
                        if (CommonWebView.this.l != null) {
                            CommonWebView.this.l.onClick(view);
                            return;
                        }
                        return;
                    }
                    if (TextUtils.equals(str, ToolBar.REFRESH)) {
                        CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.d.canGoBack());
                        CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.d.canGoForward());
                        CommonWebView.this.d.reload();
                        if (CommonWebView.this.m != null) {
                            CommonWebView.this.m.onClick(view);
                            return;
                        }
                        return;
                    }
                    if (TextUtils.equals(str, ToolBar.EXITS)) {
                        if (CommonWebView.this.h != null) {
                            CommonWebView.this.h.onClick(view);
                        }
                    } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                        if (CommonWebView.this.n != null) {
                            CommonWebView.this.n.onClick(view);
                        }
                        c.c(CommonWebView.this.getContext(), CommonWebView.this.d.getUrl());
                    }
                }
            }
        });
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.5
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(true);
                CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(false);
                return false;
            }
        });
        addView(this.b);
    }

    static /* synthetic */ void k(CommonWebView commonWebView) {
        commonWebView.o.removeCallbacks(commonWebView.u);
    }
}
