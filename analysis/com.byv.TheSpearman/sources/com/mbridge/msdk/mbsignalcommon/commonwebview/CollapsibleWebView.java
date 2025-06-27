package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class CollapsibleWebView extends CommonWebView {
    private CopyOnWriteArrayList<CommonWebView.a> e;
    private CopyOnWriteArrayList<CommonWebView.a> f;
    private CopyOnWriteArrayList<a> g;
    private String h;
    private String i;

    public interface a {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCollapseIconName(String str) {
        this.h = str;
    }

    public String getCollapseIconName() {
        return this.h;
    }

    public void setExpandIconName(String str) {
        this.i = str;
    }

    public String getExpandIconName() {
        return this.i;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.e = new CopyOnWriteArrayList<>();
        this.f = new CopyOnWriteArrayList<>();
        this.g = new CopyOnWriteArrayList<>();
        this.h = "mbridge_arrow_down_white_blackbg";
        this.i = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.c = false;
        bVar.b = "mbridge_arrow_down_white_blackbg";
        bVar.d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doCollapse");
                CollapsibleWebView.this.showToolBarButton("doSpand");
                CollapsibleWebView.a(CollapsibleWebView.this);
            }
        };
        arrayList.add(bVar);
        ToolBar.b bVar2 = new ToolBar.b("doSpand");
        bVar2.b = "mbridge_arrow_up_black";
        bVar2.d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doSpand");
                CollapsibleWebView.this.showToolBarButton("doCollapse");
                CollapsibleWebView.b(CollapsibleWebView.this);
            }
        };
        arrayList.add(bVar2);
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new CommonWebView.b() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.3
            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.b
            public final void a(String str) {
                CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
                CollapsibleWebView.a(collapsibleWebView, (View) collapsibleWebView.d, str);
            }
        });
        setPageLoadTimtout(DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.4

            /* renamed from: a, reason: collision with root package name */
            Boolean f3159a = false;
            String b = "";

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.b = str;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                if (this.f3159a.booleanValue()) {
                    return;
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, str);
                this.f3159a = false;
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                HashMap map = new HashMap();
                map.put("type", "error");
                map.put("url", str2);
                map.put("description", str);
                if (!this.f3159a.booleanValue() && this.b.equals(str2)) {
                    this.f3159a = true;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, map);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, map);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                HashMap map = new HashMap();
                map.put("type", "ssl");
                map.put("url", sslError.getUrl());
                map.put("description", "ssl error");
                if (!this.f3159a.booleanValue()) {
                    if (this.b.equals(sslError.getUrl() + "")) {
                        this.f3159a = true;
                        CollapsibleWebView.a(CollapsibleWebView.this, webView, map);
                    }
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, map);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                HashMap map = new HashMap();
                map.put("type", ProxyConfig.MATCH_HTTP);
                String str = "";
                if (Build.VERSION.SDK_INT >= 21) {
                    String str2 = webResourceRequest.getUrl() + "";
                    map.put("url", str2);
                    map.put("statusCode", webResourceResponse.getStatusCode() + "");
                    str = str2;
                } else {
                    map.put("url", "unknow_url");
                    map.put("statusCode", "unknow_url");
                }
                map.put("description", "http error");
                if (!this.f3159a.booleanValue() && (this.b.equals(str) || TextUtils.isEmpty(this.b))) {
                    this.f3159a = true;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, map);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, map);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                ad.b("CollapsibleWebView", "WebView called onRenderProcessGone");
                return true;
            }
        });
    }

    public void setCustomizedToolBarMarginWidthPixel(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3160a.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.f3160a.setLayoutParams(layoutParams);
    }

    public void setCollapseListener(CommonWebView.a aVar) {
        this.e.add(aVar);
    }

    public void setExpandListener(CommonWebView.a aVar) {
        this.f.add(aVar);
    }

    public void setPageLoadListener(a aVar) {
        this.g.add(aVar);
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ void b(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.g.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }

    static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.g.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.g.iterator();
        while (it.hasNext()) {
            it.next().a(view, (Map<String, String>) map);
        }
    }

    static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.g.iterator();
        while (it.hasNext()) {
            it.next().b(view, (Map<String, String>) map);
        }
    }
}
