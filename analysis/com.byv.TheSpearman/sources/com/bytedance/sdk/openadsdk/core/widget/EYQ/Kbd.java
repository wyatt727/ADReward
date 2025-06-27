package com.bytedance.sdk.openadsdk.core.widget.EYQ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.hu;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.HX;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.mZx.tp;
import com.bytedance.sdk.openadsdk.utils.pi;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TTWebViewClient.java */
/* loaded from: classes2.dex */
public class Kbd extends SSWebView.EYQ {
    private static final HashSet<String> nWX;
    private final boolean EYQ;
    private HX HX;
    protected tp IPb;
    protected final String Kbd;
    private boolean MxO;
    protected final Context Pm;
    protected final wBa Td;
    private String mZx;
    private UB pi;
    private Map<String, Object> tp;
    private JSONObject tsL;
    protected boolean VwS = true;
    protected boolean QQ = true;

    public void EYQ(HX hx) {
        this.HX = hx;
    }

    public void EYQ(Map<String, Object> map) {
        this.tp = map;
    }

    public void EYQ(JSONObject jSONObject) {
        this.tsL = jSONObject;
    }

    public void EYQ(String str) {
        this.mZx = str;
    }

    public void EYQ(UB ub) {
        this.pi = ub;
    }

    public Kbd(Context context, wBa wba, String str, tp tpVar, boolean z) {
        this.Pm = context;
        this.Td = wba;
        this.Kbd = str;
        this.IPb = tpVar;
        this.EYQ = z;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        String lowerCase;
        try {
            uri = Uri.parse(str);
            lowerCase = uri.getScheme().toLowerCase();
        } catch (Throwable unused) {
            wBa wba = this.Td;
            if (wba != null && wba.Pm()) {
                return true;
            }
        }
        if ("bytedance".equals(lowerCase)) {
            pi.EYQ(uri, this.Td);
            return true;
        }
        if (Td(str)) {
            return true;
        }
        if (!hu.EYQ(str)) {
            if (KO.IPb(this.pi)) {
                EYQ(lowerCase, str);
                return true;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addFlags(268435456);
                this.Pm.startActivity(intent);
            } catch (Throwable unused2) {
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    private void EYQ(String str, String str2) {
        if ((Kbd(str) || "market".equals(str)) && ((this.HX != null || this.tsL != null) && mZx(str2))) {
            mZx();
        }
        this.HX = null;
        this.tsL = null;
    }

    public boolean mZx(String str) {
        String strEYQ;
        if (this.Pm == null) {
            return false;
        }
        UB ub = this.pi;
        String strTd = "";
        if (ub == null || ub.xh() == null) {
            strEYQ = "";
        } else {
            strTd = this.pi.xh().Td();
            strEYQ = this.pi.xh().EYQ();
        }
        return com.com.bytedance.overseas.sdk.EYQ.EYQ.EYQ(str, this.Pm, this.mZx, this.pi, (Map<String, Object>) null) || com.com.bytedance.overseas.sdk.EYQ.EYQ.EYQ(this.pi, strTd, this.Pm, this.mZx, (Map<String, Object>) null) || com.com.bytedance.overseas.sdk.EYQ.mZx.EYQ(this.Pm, strEYQ, strTd, this.mZx, this.pi);
    }

    private boolean Kbd(String str) {
        if (KO.IPb(this.pi)) {
            return TextUtils.equals(this.pi.HR(), str);
        }
        return false;
    }

    public void mZx() {
        if (TextUtils.isEmpty(this.mZx) || !KO.Kbd(this.pi) || this.MxO) {
            return;
        }
        HX hx = this.HX;
        if (hx != null) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.pi, hx, this.mZx, true, this.tp, 1);
            this.MxO = true;
            return;
        }
        JSONObject jSONObject = this.tsL;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.pi, this.mZx, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
            this.MxO = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        tp tpVar = this.IPb;
        if (tpVar != null) {
            tpVar.EYQ(webView, str, this.EYQ);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        tp tpVar = this.IPb;
        if (tpVar != null) {
            tpVar.EYQ(webView, str, bitmap);
        }
        if (this.QQ) {
            Td.EYQ(this.Pm).EYQ(Build.VERSION.SDK_INT >= 19).mZx(webView.getSettings().getBuiltInZoomControls()).EYQ(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23 && this.IPb != null) {
            this.IPb.EYQ(webView, i, str, str2, Pm(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT < 23 || this.IPb == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.IPb.EYQ(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.IPb == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.IPb.EYQ(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.IPb != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.IPb.EYQ(webView, primaryError, strConcat, str, Pm(str), true);
        }
    }

    public boolean Td(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (KO.IPb(this.pi) && this.tsL == null && this.HX == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.Pm instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.Pm.startActivity(intent);
                mZx();
                this.tsL = null;
                this.HX = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        nWX = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    protected static String Pm(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !nWX.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(String.valueOf(strSubstring));
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView.EYQ, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().mZx();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
