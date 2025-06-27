package com.json;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.json.sdk.utils.Logger;
import com.json.t2;
import com.json.w7;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d7 implements w7 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "d7";
    private static final String i = "file://";

    /* renamed from: a, reason: collision with root package name */
    private final String f1731a;
    private String b;
    private WebView c;
    private b7 d;
    private w6 e;
    private Context f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1732a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        a(String str, JSONObject jSONObject, String str2) {
            this.f1732a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (d7.this.c != null) {
                m7.a(hc.q, new h7().a(m4.z, d7.g).a());
            }
            try {
                d7.this.b(this.f1732a);
                d7.this.c.loadUrl(d7.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", d7.this.f1731a);
                d7.this.d.a(this.c, jSONObject);
            } catch (Exception e) {
                d7.this.b(this.f1732a, e.getMessage());
                m7.a(hc.q, new h7().a(m4.z, e.getMessage()).a());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1733a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.f1733a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (d7.this.c != null) {
                    d7.this.c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", d7.this.f1731a);
                if (d7.this.d != null) {
                    d7.this.d.a(this.f1733a, jSONObject);
                    d7.this.d.b();
                }
                d7.this.d = null;
                d7.this.f = null;
            } catch (Exception e) {
                Log.e(d7.h, "performCleanup | could not destroy ISNAdView webView ID: " + d7.this.f1731a);
                m7.a(hc.r, new h7().a(m4.z, e.getMessage()).a());
                d7.this.b(this.b, e.getMessage());
            }
        }
    }

    class c implements w7.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1734a;

        c(String str) {
            this.f1734a = str;
        }

        @Override // com.ironsource.w7.a
        public void a(String str) {
            Logger.i(d7.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            d7.this.b(this.f1734a, str);
        }

        @Override // com.ironsource.w7.a
        public void b(String str) {
            Logger.i(d7.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) d7.this.c.getParent()).removeView(d7.this.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
            d7.this.e();
        }
    }

    public d7(z6 z6Var, Context context, String str, w6 w6Var) {
        this.f = context;
        b7 b7Var = new b7();
        this.d = b7Var;
        b7Var.g(str);
        this.f1731a = str;
        this.d.a(z6Var);
        this.e = w6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.b + d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new a7(this), x6.e);
        this.c.setWebViewClient(new c7(new c(str)));
        re.a(this.c);
        this.d.a(this.c);
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        a("", "");
    }

    @Override // com.json.w7
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        o6.f2043a.c(new b(str, str2));
    }

    @Override // com.json.w7
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, t2.c.F);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(t2.h.t0)) {
                this.c.onPause();
            } else {
                if (!str.equals(t2.h.u0)) {
                    b(str3, t2.c.E);
                    return;
                }
                this.c.onResume();
            }
            this.d.f(str2);
        } catch (Exception unused) {
            b(str3, t2.c.G);
        }
    }

    @Override // com.json.w7
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e) {
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    public String b() {
        return this.f1731a;
    }

    public void b(String str, String str2) {
        b7 b7Var = this.d;
        if (b7Var != null) {
            b7Var.a(str, str2);
        }
    }

    @Override // com.json.w7
    public void b(JSONObject jSONObject, String str, String str2) {
        o6.f2043a.c(new a(str2, jSONObject, str));
    }

    public b7 c() {
        return this.d;
    }

    @Override // com.json.w7
    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            Logger.i(h, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    public w6 d() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    @Override // com.json.w7
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }
}
