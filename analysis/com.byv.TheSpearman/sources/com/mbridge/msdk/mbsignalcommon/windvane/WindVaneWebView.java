package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* loaded from: classes4.dex */
public class WindVaneWebView extends BaseWebView {
    protected k b;
    protected c c;
    protected f d;
    private Object e;
    private Object f;
    private String g;
    private d h;
    private String i;
    private String j;
    private CampaignEx k;
    private int l;
    private boolean m;
    private float n;
    private float o;

    public WindVaneWebView(Context context) {
        super(context);
        this.m = false;
        this.n = 0.0f;
        this.o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.n = 0.0f;
        this.o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = false;
        this.n = 0.0f;
        this.o = 0.0f;
    }

    public void setSignalCommunication(c cVar) {
        this.c = cVar;
        cVar.a(this);
    }

    public c getSignalCommunication() {
        return this.c;
    }

    public void setRid(String str) {
        this.i = str;
    }

    public String getRid() {
        return this.i;
    }

    public String getLocalRequestId() {
        return this.j;
    }

    public void setLocalRequestId(String str) {
        this.j = str;
    }

    public CampaignEx getCampaignEx() {
        return this.k;
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.k = campaignEx;
    }

    public void setTempTypeForMetrics(int i) {
        this.l = i;
    }

    public Object getJsObject(String str) {
        f fVar = this.d;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public void registerWindVanePlugin(Class cls) {
        f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.a(cls.getSimpleName(), cls);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    protected final void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.b == null) {
            this.b = new k(this);
        }
        setWebViewChromeClient(this.b);
        this.mWebViewClient = new l();
        setWebViewClient(this.mWebViewClient);
        if (this.c == null) {
            i iVar = new i(this.f3147a);
            this.c = iVar;
            setSignalCommunication(iVar);
        }
        this.d = new f(this.f3147a, this);
    }

    public void setApiManagerContext(Context context) {
        f fVar = this.d;
        if (fVar != null) {
            fVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        f fVar = this.d;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void setWebViewChromeClient(k kVar) {
        this.b = kVar;
        setWebChromeClient(kVar);
    }

    public void setObject(Object obj) {
        this.e = obj;
    }

    public Object getObject() {
        return this.e;
    }

    public void setMraidObject(Object obj) {
        this.f = obj;
    }

    public Object getMraidObject() {
        return this.f;
    }

    public void setWebViewListener(d dVar) {
        this.h = dVar;
        k kVar = this.b;
        if (kVar != null) {
            kVar.a(dVar);
        }
        if (this.mWebViewClient != null) {
            this.mWebViewClient.a(dVar);
        }
    }

    public d getWebViewListener() {
        return this.h;
    }

    public boolean isDestoryed() {
        return this.m;
    }

    public void release() {
        try {
            if (!this.m) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(this.l));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000135", this.k, dVar);
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.e = null;
            if (ai.b(getContext()) == 0) {
                this.m = true;
                destroy();
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.this.m = true;
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearWebView() {
        if (this.m) {
            return;
        }
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    public String getCampaignId() {
        return this.g;
    }

    public void setCampaignId(String str) {
        this.g = str;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mWebViewClient != null && (this.mWebViewClient.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.n = motionEvent.getRawX();
                    this.o = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.n;
                    float y = motionEvent.getY() - this.o;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y >= 0.0f || (-1.0f) * y <= 48) && (y <= 0.0f || y <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
