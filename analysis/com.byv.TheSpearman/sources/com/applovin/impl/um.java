package com.applovin.impl;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.ue;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class um extends xl implements ue.a {
    private final com.applovin.impl.sdk.ad.a h;
    private AppLovinAdLoadListener i;
    private com.applovin.impl.adview.b j;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Rendering AppLovin ad #" + this.h.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.um$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    public um(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessJavaScriptTagAd", kVar);
        this.h = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, kVar);
        this.i = appLovinAdLoadListener;
        kVar.U().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f1179a, a());
            this.j = bVar;
            bVar.a(new b(this.f1179a));
            this.j.loadDataWithBaseURL(this.h.h(), this.h.e1(), "text/html", null, "");
        } catch (Throwable th) {
            this.f1179a.U().b(this);
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Failed to initialize WebView", th);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(-1);
                this.i = null;
            }
        }
    }

    private class b extends com.applovin.impl.adview.c {
        private b(com.applovin.impl.sdk.k kVar) {
            super(null, kVar);
        }

        private boolean a(String str, oj ojVar) {
            Iterator it = um.this.f1179a.c(ojVar).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.impl.adview.c
        protected boolean a(WebView webView, String str) {
            com.applovin.impl.sdk.t tVar = um.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                um umVar = um.this;
                umVar.c.d(umVar.b, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.b)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (!a(scheme, oj.Z1)) {
                return true;
            }
            if (a(host, oj.a2)) {
                com.applovin.impl.sdk.t tVar2 = um.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    um umVar2 = um.this;
                    umVar2.c.a(umVar2.b, "Ad load succeeded");
                }
                if (um.this.i == null) {
                    return true;
                }
                um.this.i.adReceived(um.this.h);
                um.this.i = null;
                return true;
            }
            if (a(host, oj.b2)) {
                com.applovin.impl.sdk.t tVar3 = um.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    um umVar3 = um.this;
                    umVar3.c.a(umVar3.b, "Ad load failed");
                }
                if (um.this.i == null) {
                    return true;
                }
                um.this.i.failedToReceiveAd(204);
                um.this.i = null;
                return true;
            }
            com.applovin.impl.sdk.t tVar4 = um.this.c;
            if (!com.applovin.impl.sdk.t.a()) {
                return true;
            }
            um umVar4 = um.this;
            umVar4.c.b(umVar4.b, "Unrecognized webview event");
            return true;
        }
    }

    @Override // com.applovin.impl.ue.a
    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.h.H())) {
            this.f1179a.U().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.h);
                this.i = null;
            }
        }
    }
}
