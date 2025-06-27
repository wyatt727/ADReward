package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.bq;
import com.applovin.impl.eq;
import com.applovin.impl.f0;
import com.applovin.impl.h3;
import com.applovin.impl.jq;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.ur;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class b extends h3 {
    private final t c;
    private final com.applovin.impl.sdk.k d;
    private com.applovin.impl.sdk.ad.b f;
    private boolean g;
    private boolean h;
    private final List i;
    private final Object j;

    public b(com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.i = new ArrayList();
        this.j = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.d = kVar;
        this.c = kVar.L();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (x3.k() && ((Boolean) kVar.a(oj.R5)).booleanValue()) {
            setWebViewRenderProcessClient(new d(kVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return b.a(view, motionEvent);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f$0.a(view);
            }
        });
    }

    private void b() {
        synchronized (this.j) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ur.a(this, (String) it.next(), "AdWebView", this.d);
            }
            this.i.clear();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.g = true;
        this.h = false;
        super.destroy();
    }

    com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setAdHtmlLoaded(boolean z) {
        this.h = z;
        if (z && ((Boolean) this.d.a(oj.m6)).booleanValue()) {
            b();
        }
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, bq bqVar) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (t.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA);
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(oj.O4), str);
        if (StringUtils.isValidString(strA2)) {
            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled()) {
                strA2 = kVar.Y().a(strA2);
            }
            String str4 = strA2;
            if (t.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        if (t.a()) {
            this.c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!t.a()) {
            return true;
        }
        this.c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(c cVar) {
        if (((Boolean) this.d.a(oj.F1)).booleanValue()) {
            loadUrl(AndroidWebViewClient.BLANK_PAGE);
            clearView();
        }
        setWebViewClient(cVar != null ? cVar : new x());
        setWebChromeClient(new f0(cVar != null ? cVar.c() : null, this.d));
        synchronized (this.i) {
            this.i.clear();
        }
        onResume();
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.g) {
            this.f = bVar;
            try {
                applySettings(bVar);
                if (zp.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.h(), ((com.applovin.impl.sdk.ad.a) bVar).e1(), "text/html", null, "");
                    if (t.a()) {
                        this.c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof bq) {
                    bq bqVar = (bq) bVar;
                    eq eqVarE1 = bqVar.e1();
                    if (eqVarE1 != null) {
                        jq jqVarD = eqVarE1.d();
                        Uri uriB = jqVarD.b();
                        String string = uriB != null ? uriB.toString() : "";
                        String strA = jqVarD.a();
                        String strG1 = bqVar.g1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strA)) {
                            if (t.a()) {
                                this.c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (jqVarD.c() == jq.a.STATIC) {
                            if (t.a()) {
                                this.c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA2 = a((String) this.d.a(oj.N4), string);
                            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled() && bqVar.x1()) {
                                strA2 = this.d.Y().a(strA2);
                            }
                            loadDataWithBaseURL(bVar.h(), strA2, "text/html", null, "");
                            return;
                        }
                        if (jqVarD.c() == jq.a.HTML) {
                            if (StringUtils.isValidString(strA)) {
                                String strA3 = a(strG1, strA);
                                String str = StringUtils.isValidString(strA3) ? strA3 : strA;
                                if (t.a()) {
                                    this.c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.h(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (t.a()) {
                                    this.c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.h(), strG1, this.d, bqVar);
                                return;
                            }
                            return;
                        }
                        if (jqVarD.c() == jq.a.IFRAME) {
                            if (StringUtils.isValidString(string)) {
                                if (t.a()) {
                                    this.c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(string, bVar.h(), strG1, this.d, bqVar);
                                return;
                            } else {
                                if (StringUtils.isValidString(strA)) {
                                    String strA4 = a(strG1, strA);
                                    String str2 = StringUtils.isValidString(strA4) ? strA4 : strA;
                                    if (t.a()) {
                                        this.c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                    }
                                    loadDataWithBaseURL(bVar.h(), str2, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (t.a()) {
                            this.c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (t.a()) {
                        this.c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : AbstractJsonLexerKt.NULL) + ") - " + th);
            }
        }
        t.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.d.a(oj.m6)).booleanValue()) {
            if (this.h) {
                ur.a(this, str, "AdWebView", this.d);
                return;
            }
            synchronized (this.i) {
                this.i.add(str);
            }
            return;
        }
        ur.a(this, str, "AdWebView", this.d);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
