package com.iab.omid.library.bytedance2.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b extends AdSessionStatePublisher {
    private WebView f;
    private Long g = null;
    private final Map<String, VerificationScriptResource> h;
    private final String i;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f1502a;

        a() {
            this.f1502a = b.this.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1502a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.h = map;
        this.i = str;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    void j() {
        WebView webView = new WebView(com.iab.omid.library.bytedance2.internal.f.b().a());
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f.getSettings().setAllowContentAccess(false);
        this.f.getSettings().setAllowFileAccess(false);
        a(this.f);
        g.a().c(this.f, this.i);
        for (String str : this.h.keySet()) {
            g.a().a(this.f, this.h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.g = Long.valueOf(f.b());
    }
}
