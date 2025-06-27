package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.json.t2;
import com.mbridge.msdk.f.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.mbsignalcommon.b.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.videocommon.d.c;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {
    private String p;
    private String q;
    private String r;
    private boolean s;
    private ImageView t;
    private boolean u;
    private c v;
    private List<CampaignEx> w;
    private WebView x;

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z) {
    }

    public c getRewardUnitSetting() {
        return this.v;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setRewardUnitSetting(c cVar) {
        this.v = cVar;
    }

    public List<CampaignEx> getCampaigns() {
        return this.w;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.x = webView;
    }

    public String getFileURL() {
        return this.p;
    }

    public void setFileURL(String str) {
        this.p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zContains = str.contains("play.google.com");
        setWebviewClickable(!zContains);
        if (zContains) {
            com.mbridge.msdk.mbsignalcommon.base.c cVar = new com.mbridge.msdk.mbsignalcommon.base.c();
            if (this.webView != null) {
                this.webView.setFilter(cVar);
            }
        }
    }

    public String getFilePath() {
        return this.q;
    }

    public void setFilePath(String str) {
        this.q = str;
    }

    public String getHtml() {
        return this.r;
    }

    public void setHtml(String str) {
        this.r = str;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    public MBridgeBTWebView(Context context) {
        super(context);
        this.s = false;
        this.u = false;
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = false;
        this.u = false;
    }

    public void setWebviewClickable(boolean z) {
        if (this.webView != null) {
            this.webView.setClickable(z);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        this.webView = new WindVaneWebView(context);
        this.webView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        this.jsCommon = new k(null, this.b, this.w);
        this.jsCommon.a(this.c);
        if (b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        this.webView.setObject(this.jsCommon);
        this.webView.setMraidObject(this);
        this.webView.setWebViewListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.1
            @Override // com.mbridge.msdk.mbsignalcommon.b.a
            public final void a(Object obj) {
                super.a(obj);
                try {
                    String strEncodeToString = "";
                    String strC = MBridgeBTWebView.this.jsCommon != null ? MBridgeBTWebView.this.jsCommon.c() : "";
                    if (!TextUtils.isEmpty(strC)) {
                        strEncodeToString = Base64.encodeToString(strC.getBytes(), 2);
                        ad.a("RVWindVaneWebView", "getEndScreenInfo success");
                    } else {
                        ad.a("RVWindVaneWebView", "getEndScreenInfo failed");
                    }
                    g.a().a(obj, strEncodeToString);
                } catch (Throwable th) {
                    ad.a("RVWindVaneWebView", th.getMessage());
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) throws JSONException {
                super.a(webView, str);
                if (MBridgeBTWebView.this.x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.d);
                        jSONObject.put("code", BTBaseView.n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.d);
                        jSONObject2.put("result", 1);
                        jSONObject.put("data", jSONObject2);
                        g.a().a(MBridgeBTWebView.this.x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        d.c().a(MBridgeBTWebView.this.x, e.getMessage());
                        ad.a("RVWindVaneWebView", e.getMessage());
                    }
                }
                g.a().a(MBridgeBTWebView.this.webView);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i, String str, String str2) throws JSONException {
                super.a(webView, i, str, str2);
                if (MBridgeBTWebView.this.x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.d);
                        jSONObject.put("code", BTBaseView.n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        g.a().a(MBridgeBTWebView.this.x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        d.c().a(MBridgeBTWebView.this.x, e.getMessage());
                        ad.a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws JSONException {
                super.a(webView, sslErrorHandler, sslError);
                if (MBridgeBTWebView.this.x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.d);
                        jSONObject.put("code", BTBaseView.n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        g.a().a(MBridgeBTWebView.this.x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        d.c().a(MBridgeBTWebView.this.x, e.getMessage());
                        ad.a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i) {
                super.a(webView, i);
            }
        });
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                if (MBridgeBTWebView.this.x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.n);
                        jSONObject.put("id", MBridgeBTWebView.this.d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        g.a().a(MBridgeBTWebView.this.x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        d.c().a(MBridgeBTWebView.this.x, "onClicked", MBridgeBTWebView.this.d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.t.setLayoutParams(layoutParams);
            this.t.setVisibility(this.s ? 4 : 8);
            if (this.b != null && this.b.isMraid()) {
                this.t.setVisibility(4);
            }
            this.t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeBTWebView.this.close();
                }
            });
            addView(this.t);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setWebViewRid(String str) {
        if (this.webView != null) {
            this.webView.setRid(str);
        }
    }

    public void setWebViewLocalRequestId(String str) {
        if (this.webView != null) {
            this.webView.setLocalRequestId(str);
        }
    }

    public void setTempTypeForMetrics(int i) {
        if (this.webView != null) {
            this.webView.setTempTypeForMetrics(i);
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.p)) {
            this.webView.loadUrl(this.p);
        } else if (!TextUtils.isEmpty(this.q)) {
            this.webView.loadUrl(this.q);
        } else {
            if (TextUtils.isEmpty(this.r)) {
                return;
            }
            this.webView.loadDataWithBaseURL("", this.r, "text/html", C.UTF8_NAME, null);
        }
    }

    public void webviewLoad(int i) {
        if (this.jsCommon == null) {
            this.jsCommon = new k(null, this.b, this.w);
        }
        if (this.b != null) {
            this.jsCommon.a(this.b);
        } else {
            List<CampaignEx> list = this.w;
            if (list != null && list.size() > 0) {
                this.jsCommon.a(this.w);
                if (this.w.size() == 1) {
                    this.jsCommon.a(this.w.get(0));
                }
            }
        }
        if (this.v != null) {
            this.jsCommon.a(this.v);
        }
        this.jsCommon.a(this.c);
        this.jsCommon.c(this.d);
        if (b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i == 1) {
            this.jsCommon.q();
        }
        if (this.webView != null) {
            this.webView.setObject(this.jsCommon);
        }
        if (this.b != null && this.b.isMraid()) {
            this.t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        if (this.webView == null) {
            return false;
        }
        this.webView.reload();
        return true;
    }

    public boolean webviewGoBack() {
        if (this.webView == null || !this.webView.canGoBack()) {
            return false;
        }
        this.webView.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        if (this.webView == null || !this.webView.canGoForward()) {
            return false;
        }
        this.webView.goForward();
        return true;
    }

    public void broadcast(String str, JSONObject jSONObject) throws JSONException {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", n);
                jSONObject2.put("id", this.d);
                jSONObject2.put(t2.h.k0, str);
                jSONObject2.put("data", jSONObject);
                g.a().a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a((WebView) this.webView, "broadcast", this.d);
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) throws JSONException {
        if (this.webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", t2.h.C);
                } else {
                    jSONObject.put("orientation", t2.h.D);
                }
                jSONObject.put("instanceId", this.d);
                g.a().a((WebView) this.webView, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        if (this.webView != null) {
            d.c().a((WebView) this.webView, "onSystemBackPressed", this.d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.u) {
            return;
        }
        this.u = true;
        try {
            if (this.webView != null) {
                d.c().a((WebView) this.webView, "onSystemDestory", this.d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (MBridgeBTWebView.this.webView != null) {
                            MBridgeBTWebView.this.webView.clearWebView();
                            MBridgeBTWebView.this.webView.release();
                        }
                        MBridgeBTWebView.this.p = null;
                        MBridgeBTWebView.this.q = null;
                        MBridgeBTWebView.this.r = null;
                        if (MBridgeBTWebView.this.x != null) {
                            MBridgeBTWebView.this.x = null;
                        }
                    } catch (Throwable th) {
                        ad.a(BTBaseView.TAG, th.getMessage());
                    }
                }
            }, 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        try {
            String clickURL = this.b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.b.setClickURL(str);
                reportOpen(str);
            }
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), this.c);
            aVar.a(this);
            aVar.a(this.b);
            this.b.setClickURL(clickURL);
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new i(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.c, str, this.b.isBidCampaign());
            }
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        WebView webView = this.x;
        if (webView != null) {
            a(webView, "onPlayerCloseBtnClicked", this.d);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.b;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z) {
        try {
            this.t.setVisibility(z ? 4 : 0);
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        ah.b(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        ah.a(campaign, this);
    }
}
