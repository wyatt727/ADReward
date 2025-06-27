package com.json.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.json.MessageToNative;
import com.json.OpenUrl;
import com.json.OpenUrlConfigurations;
import com.json.b6;
import com.json.bb;
import com.json.c3;
import com.json.c4;
import com.json.ca;
import com.json.db;
import com.json.e7;
import com.json.e9;
import com.json.ee;
import com.json.f7;
import com.json.fb;
import com.json.g3;
import com.json.g7;
import com.json.g9;
import com.json.h3;
import com.json.h7;
import com.json.hc;
import com.json.i3;
import com.json.i5;
import com.json.ic;
import com.json.j0;
import com.json.j3;
import com.json.jb;
import com.json.k0;
import com.json.k7;
import com.json.kb;
import com.json.m4;
import com.json.m7;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.n2;
import com.json.n9;
import com.json.o6;
import com.json.o7;
import com.json.od;
import com.json.p0;
import com.json.p2;
import com.json.q2;
import com.json.q5;
import com.json.q9;
import com.json.qe;
import com.json.re;
import com.json.sdk.controller.OpenUrlActivity;
import com.json.sdk.controller.f;
import com.json.sdk.controller.k;
import com.json.sdk.controller.l;
import com.json.sdk.controller.m;
import com.json.sdk.controller.p;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import com.json.t3;
import com.json.t5;
import com.json.u2;
import com.json.u3;
import com.json.u5;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.json.v2;
import com.json.w7;
import com.json.x3;
import com.json.y2;
import com.json.y6;
import com.json.yd;
import com.json.z2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class v implements com.json.sdk.controller.l, db, DownloadListener {
    private static final String b0 = "about:blank";
    public static int c0 = 0;
    private static String d0 = "success";
    private static String e0 = "fail";
    private bb A;
    private h3 B;
    private String C;
    private com.json.sdk.controller.d D;
    private ee E;
    private k0 F;
    private u3 I;
    private com.json.sdk.controller.o J;
    private com.json.sdk.controller.q K;
    private com.json.sdk.controller.u L;
    private com.json.sdk.controller.i M;
    private com.json.sdk.controller.a N;
    private com.json.sdk.controller.j O;
    private qe P;
    private com.json.sdk.controller.c Q;
    private n2 R;
    private JSONObject S;
    private l.a T;
    private l.b U;
    private c3 V;
    private boolean W;
    v2 Y;
    final g9 Z;

    /* renamed from: a, reason: collision with root package name */
    private final o6 f2223a;
    private fb a0;
    private y2 b;
    private String f;
    private String g;
    private Map<String, String> h;
    private final c4 i;
    private boolean j;
    private s k;
    private boolean l;
    private CountDownTimer m;
    public CountDownTimer n;
    private final r r;
    private View s;
    private FrameLayout t;
    private WebChromeClient.CustomViewCallback u;
    private FrameLayout v;
    private x w;
    private String x;
    private j3 y;
    private i3 z;
    private String c = "v";
    private String d = IronSourceConstants.IRONSOURCE_CONFIG_NAME;
    private final String e = "We're sorry, some error occurred. we will investigate it";
    private int o = 50;
    private int p = 50;
    private String q = t2.e.b;
    private Object G = new Object();
    private boolean H = false;
    private final b6 X = ca.h().c();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.e f2224a;
        final /* synthetic */ t3 b;
        final /* synthetic */ String c;

        a(f7.e eVar, t3 t3Var, String str) {
            this.f2224a = eVar;
            this.b = t3Var;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f7.e eVar = f7.e.RewardedVideo;
            f7.e eVar2 = this.f2224a;
            if (eVar != eVar2 && f7.e.Interstitial != eVar2 && f7.e.Banner != eVar2) {
                if (f7.e.OfferWall == eVar2) {
                    v.this.A.onOfferwallInitFail(this.c);
                    return;
                } else {
                    if (f7.e.OfferWallCredits == eVar2) {
                        v.this.A.onGetOWCreditsFailed(this.c);
                        return;
                    }
                    return;
                }
            }
            t3 t3Var = this.b;
            if (t3Var == null || TextUtils.isEmpty(t3Var.h())) {
                return;
            }
            g3 g3VarA = v.this.a(this.f2224a);
            Log.d(v.this.c, "onAdProductInitFailed (message:" + this.c + ")(" + this.f2224a + ")");
            if (g3VarA != null) {
                g3VarA.a(this.f2224a, this.b.h(), this.c);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g7 f2227a;

        d(g7 g7Var) {
            this.f2227a = g7Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.Q.b("controller html - failed to download - " + this.f2227a.b());
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2228a;
        final /* synthetic */ String b;

        e(String str, String str2) {
            this.f2228a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.this.r() == f7.d.MODE_3.a()) {
                Toast.makeText(v.this.q(), this.f2228a + " : " + this.b, 1).show();
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2229a;

        f(Context context) {
            this.f2229a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f2229a);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2230a;

        g(Context context) {
            this.f2230a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f2230a);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.e f2231a;
        final /* synthetic */ String b;

        h(f7.e eVar, String str) {
            this.f2231a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f7.e eVar = this.f2231a;
            if (eVar != f7.e.RewardedVideo && eVar != f7.e.Interstitial) {
                if (eVar == f7.e.OfferWall) {
                    v.this.A.onOWAdClosed();
                }
            } else {
                g3 g3VarA = v.this.a(eVar);
                if (g3VarA != null) {
                    g3VarA.a(this.f2231a, this.b);
                }
            }
        }
    }

    class i extends n2 {
        i(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.json.n2, com.json.y5
        public void a() {
            if (v.this.j) {
                v.this.m("none");
            }
        }

        @Override // com.json.n2, com.json.y5
        public void a(String str, JSONObject jSONObject) {
            if (v.this.j) {
                v.this.m(str);
            }
        }

        @Override // com.json.n2, com.json.y5
        public void b(String str, JSONObject jSONObject) throws JSONException {
            if (jSONObject == null || !v.this.j) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.e(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    class j implements qe {
        j() {
        }

        @Override // com.json.qe
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2233a;
        final /* synthetic */ WebView b;
        final /* synthetic */ String c;

        k(JSONObject jSONObject, WebView webView, String str) {
            this.f2233a = jSONObject;
            this.b = webView;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f2233a, this.b);
            v.this.l("about:blank");
            v.this.l(this.c);
        }
    }

    class l extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2234a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Q.b(t2.c.j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j, long j2, int i) {
            super(j, j2);
            this.f2234a = i;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.c, "Loading Controller Timer Finish");
            int i = this.f2234a;
            if (i == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(v.this.c, "Loading Controller Timer Tick " + j);
        }
    }

    class m implements InterfaceC0249v {
        m() {
        }

        @Override // com.json.sdk.controller.v.InterfaceC0249v
        public void a(String str, f7.e eVar, t3 t3Var) {
            v.this.a(str, eVar, t3Var);
        }
    }

    class n implements InterfaceC0249v {
        n() {
        }

        @Override // com.json.sdk.controller.v.InterfaceC0249v
        public void a(String str, f7.e eVar, t3 t3Var) {
            v.this.a(str, eVar, t3Var);
        }
    }

    class o implements InterfaceC0249v {
        o() {
        }

        @Override // com.json.sdk.controller.v.InterfaceC0249v
        public void a(String str, f7.e eVar, t3 t3Var) {
            v.this.a(str, eVar, t3Var);
        }
    }

    class p implements InterfaceC0249v {
        p() {
        }

        @Override // com.json.sdk.controller.v.InterfaceC0249v
        public void a(String str, f7.e eVar, t3 t3Var) {
            v.this.a(str, eVar, t3Var);
        }
    }

    class q implements InterfaceC0249v {
        q() {
        }

        @Override // com.json.sdk.controller.v.InterfaceC0249v
        public void a(String str, f7.e eVar, t3 t3Var) {
            v.this.a(str, eVar, t3Var);
        }
    }

    private class r extends WebChromeClient {
        private r() {
        }

        /* synthetic */ r(v vVar, i iVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new t(v.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (v.this.s == null) {
                return;
            }
            v.this.s.setVisibility(8);
            v.this.t.removeView(v.this.s);
            v.this.s = null;
            v.this.t.setVisibility(8);
            v.this.u.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.s != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.t.addView(view);
            v.this.s = view;
            v.this.u = customViewCallback;
            v.this.t.setVisibility(0);
        }
    }

    static class s {

        /* renamed from: a, reason: collision with root package name */
        f7.e f2242a;
        String b;

        public s(f7.e eVar, String str) {
            this.f2242a = eVar;
            this.b = str;
        }

        String a() {
            return this.b;
        }

        f7.e b() {
            return this.f2242a;
        }
    }

    private class t extends WebViewClient {
        private t() {
        }

        /* synthetic */ t(v vVar, i iVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextQ = v.this.q();
            contextQ.startActivity(new OpenUrlActivity.e(new k.b()).a(str).b(false).a(contextQ));
            return true;
        }
    }

    public class u {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2245a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.f2245a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2245a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onRVShowFail(message:" + this.f2245a + ")");
                v.this.y.d(this.b, str);
            }
        }

        class a0 implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2246a;
            final /* synthetic */ String b;
            final /* synthetic */ int c;
            final /* synthetic */ boolean d;
            final /* synthetic */ int e;
            final /* synthetic */ boolean f;
            final /* synthetic */ String g;
            final /* synthetic */ String h;

            a0(String str, String str2, int i, boolean z, int i2, boolean z2, String str3, String str4) {
                this.f2246a = str;
                this.b = str2;
                this.c = i;
                this.d = z;
                this.e = i2;
                this.f = z2;
                this.g = str3;
                this.h = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f2246a.equalsIgnoreCase(f7.e.RewardedVideo.toString())) {
                    v.this.y.a(this.b, this.c);
                    return;
                }
                if (this.f2246a.equalsIgnoreCase(f7.e.OfferWall.toString()) && this.d && v.this.A.onOWAdCredited(this.c, this.e, this.f) && !TextUtils.isEmpty(this.g)) {
                    if (e9.e().a(this.g, v.this.f, v.this.g)) {
                        v.this.a(this.h, true, (String) null, (String) null);
                    } else {
                        v.this.a(this.h, false, "Time Stamp could not be stored", (String) null);
                    }
                }
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2247a;

            b(String str) {
                this.f2247a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.A.onOWShowSuccess(this.f2247a);
            }
        }

        class b0 implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2248a;
            final /* synthetic */ int b;

            b0(String str, int i) {
                this.f2248a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.z.onInterstitialAdRewarded(this.f2248a, this.b);
            }
        }

        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2249a;

            c(String str) {
                this.f2249a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2249a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.A.onOWShowFail(str);
            }
        }

        class c0 implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2250a;
            final /* synthetic */ String b;

            c0(String str, String str2) {
                this.f2250a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2250a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onRVInitFail(message:" + str + ")");
                v.this.y.a(f7.e.RewardedVideo, this.b, str);
            }
        }

        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2251a;

            d(String str) {
                this.f2251a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onInterstitialInitSuccess()");
                v.this.z.a(f7.e.Interstitial, this.f2251a, (j0) null);
            }
        }

        public class d0 implements n9 {
            public d0() {
            }

            @Override // com.json.n9
            public void a(boolean z, String str, ic icVar) throws JSONException {
                icVar.b(z ? v.d0 : v.e0, str);
                v.this.a(icVar.toString(), z, (String) null, (String) null);
            }

            @Override // com.json.n9
            public void a(boolean z, String str, String str2) throws JSONException {
                ic icVar = new ic();
                icVar.b(z ? v.d0 : v.e0, str);
                icVar.b("data", str2);
                v.this.a(icVar.toString(), z, (String) null, (String) null);
            }

            @Override // com.json.n9
            public void a(boolean z, String str, JSONObject jSONObject) throws JSONException {
                try {
                    jSONObject.put(z ? v.d0 : v.e0, str);
                    v.this.a(jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2253a;
            final /* synthetic */ String b;

            e(String str, String str2) {
                this.f2253a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2253a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onInterstitialInitFail(message:" + str + ")");
                v.this.z.a(f7.e.Interstitial, this.b, str);
            }
        }

        class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g3 f2254a;
            final /* synthetic */ f7.e b;
            final /* synthetic */ String c;

            f(g3 g3Var, f7.e eVar, String str) {
                this.f2254a = g3Var;
                this.b = eVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2254a.c(this.b, this.c);
            }
        }

        class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2255a;

            g(String str) {
                this.f2255a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.z.b(f7.e.Interstitial, this.f2255a);
                v.this.z.c(this.f2255a);
            }
        }

        class h implements Runnable {
            h() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onOfferWallInitSuccess()");
                v.this.A.onOfferwallInitSuccess();
            }
        }

        class i implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2257a;

            i(String str) {
                this.f2257a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2257a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onOfferWallInitFail(message:" + str + ")");
                v.this.A.onOfferwallInitFail(str);
            }
        }

        class j implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2258a;

            j(String str) {
                this.f2258a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.z.b(this.f2258a);
            }
        }

        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        class l implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2260a;
            final /* synthetic */ String b;

            l(String str, String str2) {
                this.f2260a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2260a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.z.c(this.b, str);
            }
        }

        class m implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2261a;
            final /* synthetic */ String b;

            m(String str, String str2) {
                this.f2261a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2261a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.z.b(this.b, str);
            }
        }

        class n implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2262a;

            n(String str) {
                this.f2262a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onBannerInitSuccess()");
                v.this.B.a(f7.e.Banner, this.f2262a, (j0) null);
            }
        }

        class o implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2263a;
            final /* synthetic */ String b;

            o(String str, String str2) {
                this.f2263a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2263a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onBannerInitFail(message:" + str + ")");
                v.this.B.a(f7.e.Banner, this.b, str);
            }
        }

        class p implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2264a;
            final /* synthetic */ y6 b;

            p(String str, y6 y6Var) {
                this.f2264a = str;
                this.b = y6Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onBannerLoadSuccess()");
                v.this.B.a(this.f2264a, this.b);
            }
        }

        class q implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2265a;
            final /* synthetic */ String b;

            q(String str, String str2) {
                this.f2265a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onLoadBannerFail()");
                String str = this.f2265a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.B.a(this.b, str);
            }
        }

        class r implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2266a;

            r(String str) {
                this.f2266a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f2266a).has(f.b.MSG_ID)) {
                        v.this.T.a(f.CallbackToNative.a(this.f2266a));
                    } else {
                        v.this.U.a(MessageToNative.a(this.f2266a));
                    }
                } catch (JSONException e) {
                    Logger.e(v.this.c, "failed to parse received message");
                    e.printStackTrace();
                }
            }
        }

        class s implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2267a;

            s(String str) {
                this.f2267a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f2267a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.A.onGetOWCreditsFailed(str);
            }
        }

        class t implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f7.e f2268a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ JSONObject d;

            t(f7.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f2268a = eVar;
                this.b = str;
                this.c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                f7.e eVar = this.f2268a;
                if (eVar != f7.e.Interstitial && eVar != f7.e.RewardedVideo && eVar != f7.e.Banner) {
                    if (eVar == f7.e.OfferWall) {
                        v.this.A.onOfferwallEventNotificationReceived(this.c, this.d);
                    }
                } else {
                    g3 g3VarA = v.this.a(eVar);
                    if (g3VarA != null) {
                        g3VarA.a(this.f2268a, this.b, this.c, this.d);
                    }
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$u$u, reason: collision with other inner class name */
        class RunnableC0247u implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2269a;

            RunnableC0247u(String str) {
                this.f2269a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.c, "omidAPI(" + this.f2269a + ")");
                    v.this.J.a(new ic(this.f2269a).toString(), u.this.new d0());
                } catch (Exception e) {
                    e.printStackTrace();
                    Logger.i(v.this.c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$u$v, reason: collision with other inner class name */
        class RunnableC0248v implements Runnable {
            RunnableC0248v() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        class w implements Runnable {
            w() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(t2.f);
            }
        }

        class x implements Runnable {
            x() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Build.VERSION.SDK_INT >= 21) {
                    v.this.Z.getSettings().setMixedContentMode(0);
                }
            }
        }

        class y implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2273a;
            final /* synthetic */ String b;
            final /* synthetic */ j0 c;

            y(int i, String str, j0 j0Var) {
                this.f2273a = i;
                this.b = str;
                this.c = j0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f2273a <= 0) {
                    v.this.y.d(this.b);
                } else {
                    Log.d(v.this.c, "onRVInitSuccess()");
                    v.this.y.a(f7.e.RewardedVideo, this.b, this.c);
                }
            }
        }

        class z implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2274a;

            z(String str) {
                this.f2274a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.O.a(new JSONObject(this.f2274a), u.this.new d0());
                } catch (Exception e) {
                    e.printStackTrace();
                    Logger.i(v.this.c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        public u() {
        }

        private void a(String str, int i2) {
            t3 t3VarA;
            v vVar = v.this;
            f7.e eVar = f7.e.Interstitial;
            if (vVar.q(eVar.toString()) && (t3VarA = v.this.I.a(eVar, str)) != null && t3VarA.k()) {
                v.this.b(new b0(str, i2));
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, boolean z2) {
            t3 t3VarA = v.this.I.a(f7.e.Interstitial, str);
            if (t3VarA != null) {
                t3VarA.a(z2);
            }
        }

        private void a(JSONObject jSONObject) throws JSONException {
            try {
                jSONObject.put("controllerSourceData", v.this.D.f());
            } catch (Exception unused) {
                Logger.d(v.this.c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void a(JSONObject jSONObject, String str) throws JSONException {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.d(v.this.c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        private void b(JSONObject jSONObject) throws JSONException {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(t2.a.g, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e2) {
                m7.a(hc.p, new h7().a(m4.z, e2.getMessage()).a());
                Logger.d(v.this.c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) throws JSONException {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e2) {
                e2.printStackTrace();
                return false;
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.c, "adClicked(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d(t2.h.m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            f7.e eVarG = v.this.g(strD);
            g3 g3VarA = v.this.a(eVarG);
            if (eVarG == null || g3VarA == null) {
                return;
            }
            v.this.b(new f(g3VarA, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            boolean z2;
            boolean z3;
            String strD;
            Log.d(v.this.d, "adCredited(" + str + ")");
            ic icVar = new ic(str);
            String strD2 = icVar.d("credits");
            boolean z4 = false;
            int i2 = strD2 != null ? Integer.parseInt(strD2) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            String strD3 = icVar.d(t2.h.m);
            if (TextUtils.isEmpty(strD3)) {
                Log.d(v.this.d, "adCredited | product type is missing");
            }
            if (f7.e.Interstitial.toString().equalsIgnoreCase(strD3)) {
                a(strFetchDemandSourceId, i2);
                return;
            }
            String strD4 = icVar.d(t2.h.l);
            int i3 = strD4 != null ? Integer.parseInt(strD4) : 0;
            if (!f7.e.OfferWall.toString().equalsIgnoreCase(strD3)) {
                z2 = false;
                z3 = false;
                strD = null;
            } else {
                if (icVar.e(InAppPurchaseMetaData.KEY_SIGNATURE) || icVar.e("timestamp") || icVar.e(AndroidBridgeConstants.OFFERWALL_TOTAL_CREDITS_FLAG)) {
                    v.this.a(str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                }
                if (icVar.d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(strD4 + v.this.f + v.this.g))) {
                    z4 = true;
                } else {
                    v.this.a(str, false, "Controller signature is not equal to SDK signature", (String) null);
                }
                boolean zC = icVar.c(AndroidBridgeConstants.OFFERWALL_TOTAL_CREDITS_FLAG);
                strD = icVar.d("timestamp");
                z3 = zC;
                z2 = z4;
            }
            if (v.this.q(strD3)) {
                v.this.b(new a0(strD3, strFetchDemandSourceId, i2, z2, i3, z3, strD, str));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) throws NumberFormatException {
            Logger.i(v.this.c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new ic(str));
            j0 j0Var = new j0(str);
            if (!j0Var.g()) {
                v.this.a(str, false, t2.c.t, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = j0Var.d();
            if (f7.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.q(strD)) {
                v.this.b(new y(Integer.parseInt(j0Var.c()), strFetchDemandSourceId, j0Var));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.c, "adViewAPI(" + str + ")");
                v.this.N.a(new ic(str).toString(), new d0());
            } catch (Exception e2) {
                e2.printStackTrace();
                Logger.i(v.this.c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        void b(String str) {
            v.this.i(v.this.a(t2.g.d, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            f7.e eVarG;
            try {
                Logger.i(v.this.c, "cleanAdInstance(" + str + ")");
                ic icVar = new ic(str);
                String strD = icVar.d(t2.h.m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.I.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e2) {
                v.this.a(str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = e9.e().a();
                ic icVar = new ic(str);
                if (!arrayListA.isEmpty()) {
                    icVar.b(t2.h.x0, arrayListA.toString());
                }
                v.this.a(icVar.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                v.this.a(str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                Logger.i(v.this.c, "deleteFile(" + str + ")");
                ic icVar = new ic(str);
                String strD = icVar.d(t2.h.b);
                String strD2 = icVar.d("path");
                if (strD2 != null && !TextUtils.isEmpty(strD)) {
                    o7 o7Var = new o7(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.C, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(o7Var, v.this.C);
                    if (!o7Var.exists()) {
                        v.this.a(str, false, t2.c.f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(o7Var), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, t2.c.g, "1");
            } catch (Exception e2) {
                v.this.a(str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                Logger.i(v.this.c, "deleteFolder(" + str + ")");
                String strD = new ic(str).d("path");
                if (strD == null) {
                    v.this.a(str, false, t2.c.g, "1");
                    return;
                }
                o7 o7Var = new o7(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.C, strD));
                IronSourceStorageUtils.ensurePathSafety(o7Var, v.this.C);
                if (!o7Var.exists()) {
                    v.this.a(str, false, t2.c.e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(o7Var.getPath()), (String) null, (String) null);
                }
            } catch (Exception e2) {
                v.this.a(str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.c, "deviceDataAPI(" + str + ")");
                v.this.M.a(new ic(str).toString(), new d0());
            } catch (Exception e2) {
                e2.printStackTrace();
                Logger.i(v.this.c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.i(v.this.c, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            ic icVar = new ic(str);
            boolean zBooleanValue = ((Boolean) icVar.b(t2.h.d)).booleanValue();
            String strD = icVar.d(t2.h.m);
            boolean zC = icVar.c(t2.h.u);
            String strD2 = icVar.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            boolean zC2 = icVar.c(t2.h.z0);
            if (!zBooleanValue) {
                v.this.a(x.Gone);
                v.this.o();
                return;
            }
            v.this.H = icVar.c(t2.h.v);
            boolean zC3 = icVar.c(t2.h.y);
            x xVarV = v.this.v();
            x xVar = x.Display;
            if (xVarV == xVar) {
                Logger.i(v.this.c, "State: " + v.this.w);
                return;
            }
            v.this.a(xVar);
            Logger.i(v.this.c, "State: " + v.this.w);
            Context contextQ = v.this.q();
            String strT = v.this.t();
            int I = v.this.X.I(contextQ);
            if (zC) {
                com.json.sdk.controller.h hVar = new com.json.sdk.controller.h(contextQ);
                hVar.addView(v.this.v);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextQ, (Class<?>) InterstitialActivity.class) : new Intent(contextQ, (Class<?>) ControllerActivity.class);
            f7.e eVar = f7.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strT)) {
                    strT = SDKUtils.translateRequestedOrientation(v.this.X.K(contextQ));
                }
                intent.putExtra(t2.h.m, eVar.toString());
                v.this.F.a(eVar.ordinal());
                v.this.F.f(strFetchDemandSourceId);
                if (v.this.q(eVar.toString())) {
                    v.this.y.b(eVar, strFetchDemandSourceId);
                }
            } else {
                f7.e eVar2 = f7.e.OfferWall;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    intent.putExtra(t2.h.m, eVar2.toString());
                    v.this.F.a(eVar2.ordinal());
                } else {
                    f7.e eVar3 = f7.e.Interstitial;
                    if (eVar3.toString().equalsIgnoreCase(strD)) {
                        if ("application".equals(strT)) {
                            strT = SDKUtils.translateRequestedOrientation(v.this.X.K(contextQ));
                        }
                        intent.putExtra(t2.h.m, eVar3.toString());
                    }
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(t2.h.z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra(t2.h.v, v.this.H);
            intent.putExtra(t2.h.A, strT);
            intent.putExtra(t2.h.B, I);
            v vVar = v.this;
            vVar.k = new s(vVar.g(strD), strFetchDemandSourceId);
            contextQ.startActivity(intent);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.i(v.this.c, "fileSystemAPI(" + str + ")");
            v.this.a(new z(str));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getApplicationInfo(java.lang.String r5) throws org.json.JSONException {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.json.sdk.controller.v.this
                java.lang.String r0 = com.json.sdk.controller.v.A(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getApplicationInfo("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.json.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.json.sdk.controller.v.this
                java.lang.String r0 = com.json.sdk.controller.v.a(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.json.sdk.controller.v.this
                java.lang.String r1 = com.json.sdk.controller.v.b(r1, r5)
                com.ironsource.ic r2 = new com.ironsource.ic
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.v r3 = com.json.sdk.controller.v.this
                java.lang.Object[] r5 = com.json.sdk.controller.v.a(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L58
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L5f
                r0 = r1
                goto L60
            L58:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5f
                goto L60
            L5f:
                r0 = 0
            L60:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L75
                com.ironsource.sdk.controller.v r5 = com.json.sdk.controller.v.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.json.sdk.controller.v.a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.json.sdk.controller.v.this
                com.json.sdk.controller.v.e(r0, r5)
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.u.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) throws JSONException {
            v vVar;
            String str2;
            Logger.i(v.this.c, "getCachedFilesMap(" + str + ")");
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            ic icVar = new ic(str);
            if (icVar.a("path")) {
                String str3 = (String) icVar.b("path");
                if (IronSourceStorageUtils.isPathExist(v.this.C, str3)) {
                    v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.C, str3), t2.g.r, t2.g.q));
                    return;
                }
                vVar = v.this;
                str2 = t2.c.v;
            } else {
                vVar = v.this;
                str2 = t2.c.u;
            }
            vVar.a(str, false, str2, (String) null);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) throws JSONException {
            String strE;
            Logger.i(v.this.c, "getConnectivityInfo(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d(v.d0);
            String strD2 = icVar.d(v.e0);
            JSONObject jSONObject = new JSONObject();
            if (v.this.R != null) {
                jSONObject = v.this.R.a(v.this.Z.getContext());
            }
            if (jSONObject.length() > 0) {
                strE = v.this.e(strD, jSONObject.toString());
            } else {
                strE = v.this.e(strD2, v.this.a("errMsg", t2.c.C, null, null, null, null, null, null, null, false));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) throws JSONException {
            Logger.i(v.this.c, "getControllerConfig(" + str + ")");
            String strD = new ic(str).d(v.d0);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) throws JSONException {
            String strD;
            Logger.i(v.this.c, "getMediationState(" + str + ")");
            ic icVar = new ic(str);
            String strD2 = icVar.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            String strD3 = icVar.d(t2.h.m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                f7.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    t3 t3VarA = v.this.I.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(t2.h.m, strD3);
                    jSONObject.put("demandSourceName", strD2);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (t3VarA == null || t3VarA.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObject.put("state", t3VarA.j());
                    }
                    a(strD, jSONObject.toString());
                }
            } catch (Exception e2) {
                v.this.a(str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDeviceStatus(java.lang.String r5) throws org.json.JSONException {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.json.sdk.controller.v.this
                java.lang.String r0 = com.json.sdk.controller.v.A(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getDeviceStatus("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.json.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.json.sdk.controller.v.this
                java.lang.String r0 = com.json.sdk.controller.v.a(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.json.sdk.controller.v.this
                java.lang.String r5 = com.json.sdk.controller.v.b(r1, r5)
                com.ironsource.sdk.controller.v r1 = com.json.sdk.controller.v.this
                com.ironsource.g9 r2 = r1.Z
                android.content.Context r2 = r2.getContext()
                java.lang.Object[] r1 = com.json.sdk.controller.v.a(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L4f
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L56
                r0 = r5
                goto L57
            L4f:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L56
                goto L57
            L56:
                r0 = 0
            L57:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L6c
                com.ironsource.sdk.controller.v r5 = com.json.sdk.controller.v.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.json.sdk.controller.v.a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.json.sdk.controller.v.this
                com.json.sdk.controller.v.e(r0, r5)
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.u.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.i(v.this.c, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.Z.getContext();
                float fA = x3.b(context).a(context);
                ic icVar = new ic(str);
                icVar.b("deviceVolume", String.valueOf(fA));
                v.this.a(icVar.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) throws JSONException {
            Logger.i(v.this.c, "getInitSummery(" + str + ")");
            ic icVar = new ic(str);
            icVar.a(t2.i.q0, v.this.S);
            v.this.a(icVar.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            m7.a(hc.z, new h7().a(m4.x, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, t2.g.d0, t2.g.e0));
        }

        @JavascriptInterface
        public void getUserData(String str) throws JSONException {
            Logger.i(v.this.c, "getUserData(" + str + ")");
            ic icVar = new ic(str);
            if (!icVar.a(t2.h.W)) {
                v.this.a(str, false, t2.c.H, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = icVar.d(t2.h.W);
            v.this.i(v.this.e(strE, v.this.a(strD, e9.e().a(strD), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.c, "iabTokenAPI(" + str + ")");
                v.this.L.a(new ic(str).toString(), new d0());
            } catch (Exception e2) {
                e2.printStackTrace();
                Logger.i(v.this.c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.c, "initController(" + str + ")");
            ic icVar = new ic(str);
            CountDownTimer countDownTimer = v.this.n;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.n = null;
            }
            if (icVar.a(t2.h.q)) {
                String strD = icVar.d(t2.h.q);
                if (t2.h.s.equalsIgnoreCase(strD)) {
                    v.this.j = true;
                    v.this.Q.c();
                    return;
                }
                if (t2.h.r.equalsIgnoreCase(strD)) {
                    v.this.Q.b();
                    return;
                }
                if (!t2.h.t.equalsIgnoreCase(strD)) {
                    Logger.i(v.this.c, "No STAGE mentioned! should not get here!");
                    return;
                }
                String strD2 = icVar.d("errMsg");
                v.this.Q.b("controller js failed to initialize : " + strD2);
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new RunnableC0247u(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.i(v.this.c, "onAdWindowsClosed(" + str + ")");
            v.this.F.a();
            v.this.F.f(null);
            v.this.k = null;
            ic icVar = new ic(str);
            String strD = icVar.d(t2.h.m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            f7.e eVarG = v.this.g(strD);
            Log.d(v.this.d, "onAdClosed() with type " + eVarG);
            if (v.this.q(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.i(v.this.c, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.n, str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.i(v.this.c, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.m, str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.i(v.this.c, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.q, str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.i(v.this.c, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.r, str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.i(v.this.c, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.l, str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.i(v.this.c, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.k, str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            Logger.i(v.this.c, "onGetUserCreditsFail(" + str + ")");
            String strD = new ic(str).d("errMsg");
            if (v.this.q(f7.e.OfferWall.toString())) {
                v.this.b(new s(strD));
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.h0, str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.c, "onInitBannerFail(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerFail failed with no demand source");
                return;
            }
            u3 u3Var = v.this.I;
            f7.e eVar = f7.e.Banner;
            t3 t3VarA = u3Var.a(eVar, strFetchDemandSourceId);
            if (t3VarA != null) {
                t3VarA.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new o(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.S, str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.c, "onInitBannerSuccess()");
            v.this.h(t2.g.R, com.json.mediationsdk.metadata.a.g);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new ic(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.q(f7.e.Banner.toString())) {
                v.this.b(new n(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.c, "onInitInterstitialFail(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            u3 u3Var = v.this.I;
            f7.e eVar = f7.e.Interstitial;
            t3 t3VarA = u3Var.a(eVar, strFetchDemandSourceId);
            if (t3VarA != null) {
                t3VarA.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new e(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.J, str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onInitInterstitialSuccess()");
            v.this.h(t2.g.I, com.json.mediationsdk.metadata.a.g);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new ic(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.q(f7.e.Interstitial.toString())) {
                v.this.b(new d(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            Logger.i(v.this.c, "onInitOfferWallFail(" + str + ")");
            v.this.F.a(false);
            String strD = new ic(str).d("errMsg");
            if (v.this.F.l()) {
                v.this.F.b(false);
                if (v.this.q(f7.e.OfferWall.toString())) {
                    v.this.b(new i(strD));
                }
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.B, str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            v.this.h(t2.g.A, com.json.mediationsdk.metadata.a.g);
            v.this.F.a(true);
            if (v.this.F.l()) {
                v.this.F.b(false);
                if (v.this.q(f7.e.OfferWall.toString())) {
                    v.this.b(new h());
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onInitRewardedVideoFail(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            u3 u3Var = v.this.I;
            f7.e eVar = f7.e.RewardedVideo;
            t3 t3VarA = u3Var.a(eVar, strFetchDemandSourceId);
            if (t3VarA != null) {
                t3VarA.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new c0(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.g, str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.c, "onLoadBannerFail()");
            ic icVar = new ic(str);
            String strD = icVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.q(f7.e.Banner.toString())) {
                v.this.b(new q(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.c, "onLoadBannerSuccess()");
            ic icVar = new ic(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            String strD = icVar.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            w7 w7VarA = e7.a().a(strD);
            if (w7VarA == null) {
                v.this.B.a(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
                return;
            }
            if (w7VarA instanceof y6) {
                y6 y6Var = (y6) w7VarA;
                if (v.this.q(f7.e.Banner.toString())) {
                    v.this.b(new p(strFetchDemandSourceId, y6Var));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.c, "onLoadInterstitialFail(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.q(f7.e.Interstitial.toString())) {
                v.this.b(new l(strD, strFetchDemandSourceId));
            }
            v.this.h(t2.g.M, com.json.mediationsdk.metadata.a.g);
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onLoadInterstitialSuccess(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new ic(str));
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.q(f7.e.Interstitial.toString())) {
                v.this.b(new j(strFetchDemandSourceId));
            }
            v.this.h(t2.g.L, com.json.mediationsdk.metadata.a.g);
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            Logger.i(v.this.c, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.i(v.this.c, "onReceivedMessage(" + str + ")");
            o6.f2043a.a(new r(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.c, "onShowInterstitialFail(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.q(f7.e.Interstitial.toString())) {
                v.this.b(new m(strD, strFetchDemandSourceId));
            }
            v.this.h(t2.g.P, str);
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new ic(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            k0 k0Var = v.this.F;
            f7.e eVar = f7.e.Interstitial;
            k0Var.a(eVar.ordinal());
            v.this.F.f(strFetchDemandSourceId);
            if (v.this.q(eVar.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
                v.this.h(t2.g.O, str);
            }
            a(strFetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            Logger.i(v.this.c, "onShowOfferWallFail(" + str + ")");
            String strD = new ic(str).d("errMsg");
            if (v.this.q(f7.e.OfferWall.toString())) {
                v.this.b(new c(strD));
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.F, str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            Logger.i(v.this.c, "onShowOfferWallSuccess(" + str + ")");
            k0 k0Var = v.this.F;
            f7.e eVar = f7.e.OfferWall;
            k0Var.a(eVar.ordinal());
            String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, t2.k);
            if (v.this.q(eVar.toString())) {
                v.this.b(new b(valueFromJsonObject));
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.E, str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoFail(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
            if (v.this.q(f7.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.j, str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            v.this.h(t2.g.i, str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.c, "onVideoStatusChanged(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d(t2.h.m);
            if (v.this.E == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = icVar.d("status");
            if (t2.h.e0.equalsIgnoreCase(strD2)) {
                v.this.E.onVideoStarted();
                return;
            }
            if (t2.h.f0.equalsIgnoreCase(strD2)) {
                v.this.E.onVideoPaused();
                return;
            }
            if (t2.h.g0.equalsIgnoreCase(strD2)) {
                v.this.E.onVideoResumed();
                return;
            }
            if (t2.h.h0.equalsIgnoreCase(strD2)) {
                v.this.E.onVideoEnded();
                return;
            }
            if (t2.h.i0.equalsIgnoreCase(strD2)) {
                v.this.E.onVideoStopped();
                return;
            }
            Logger.i(v.this.c, "onVideoStatusChanged: unknown status: " + strD2);
        }

        @JavascriptInterface
        public void openUrl(String str) {
            Logger.i(v.this.c, "openUrl(" + str + ")");
            ic icVar = new ic(str);
            p.c cVarA = new p.a(icVar.d("method"), new OpenUrlConfigurations(v.this.H, 805306368)).a(icVar.c(t2.h.L0) ? v.this.Z.getContext() : v.this.q(), new OpenUrl(icVar.d("url"), icVar.d("package_name")));
            if (cVarA instanceof p.c.Error) {
                v.this.a(str, false, ((p.c.Error) cVarA).b(), (String) null);
            } else {
                v.this.a(str, true, (String) null, (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new RunnableC0248v());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.c, "permissionsAPI(" + str + ")");
                v.this.K.a(new ic(str).toString(), new d0());
            } catch (Exception e2) {
                e2.printStackTrace();
                Logger.i(v.this.c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                Logger.i(v.this.c, "postAdEventNotification(" + str + ")");
                ic icVar = new ic(str);
                String strD = icVar.d(t2.h.k0);
                if (TextUtils.isEmpty(strD)) {
                    v.this.a(str, false, t2.c.y, (String) null);
                    return;
                }
                String strD2 = icVar.d(t2.h.l0);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(icVar);
                String str2 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                JSONObject jSONObject = (JSONObject) icVar.b(t2.h.m0);
                String strD3 = icVar.d(t2.h.m);
                f7.e eVarG = v.this.g(strD3);
                if (!v.this.q(strD3)) {
                    v.this.a(str, false, t2.c.x, (String) null);
                    return;
                }
                String strE = v.this.e(str);
                if (!TextUtils.isEmpty(strE)) {
                    v.this.i(v.this.a(strE, v.this.a(t2.h.m, strD3, t2.h.k0, strD, "demandSourceName", strD2, "demandSourceId", str2, null, false), t2.g.i0, t2.g.j0));
                }
                v.this.b(new t(eVarG, str2, strD, jSONObject));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.i(v.this.c, "removeCloseEventHandler(" + str + ")");
            if (v.this.m != null) {
                v.this.m.cancel();
            }
            v.this.l = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new w());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.c, "saveFile(" + str + ")");
                ic icVar = new ic(str);
                String strD = icVar.d("path");
                String strD2 = icVar.d(t2.h.b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, t2.c.g, "1");
                    return;
                }
                o7 o7Var = new o7(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.C, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(o7Var, v.this.C);
                if (v.this.X.a(v.this.C) <= 0) {
                    v.this.a(str, false, u2.A, (String) null);
                    return;
                }
                if (!SDKUtils.isExternalStorageAvailable()) {
                    v.this.a(str, false, u2.B, (String) null);
                    return;
                }
                if (o7Var.exists()) {
                    v.this.a(str, false, u2.z, (String) null);
                    return;
                }
                if (!p2.g(v.this.Z.getContext())) {
                    v.this.a(str, false, u2.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.i.a(o7Var, strD2, icVar.a("connectionTimeout", 0), icVar.a("readTimeout", 0));
            } catch (Exception e2) {
                v.this.a(str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.c, "setBackButtonState(" + str + ")");
            e9.e().c(new ic(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.c, "setForceClose(" + str + ")");
            ic icVar = new ic(str);
            String strD = icVar.d("width");
            String strD2 = icVar.d("height");
            v.this.o = Integer.parseInt(strD);
            v.this.p = Integer.parseInt(strD2);
            v.this.q = icVar.d(t2.h.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.i(v.this.c, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new x());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.c, "setOrientation(" + str + ")");
                String strD = new ic(str).d("orientation");
                v.this.n(strD);
                if (v.this.a0 != null) {
                    v.this.a0.onOrientationChanged(strD, v.this.X.I(v.this.Z.getContext()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.c, "setStoreSearchKeys(" + str + ")");
            e9.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) throws JSONException {
            Logger.i(v.this.c, "setUserData(" + str + ")");
            ic icVar = new ic(str);
            if (!icVar.a(t2.h.W)) {
                v.this.a(str, false, t2.c.H, (String) null);
                return;
            }
            if (!icVar.a("value")) {
                v.this.a(str, false, t2.c.I, (String) null);
                return;
            }
            String strD = icVar.d(t2.h.W);
            String strD2 = icVar.d("value");
            e9.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.this.a(strD, strD2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.i(v.this.c, "setWebviewBackgroundColor(" + str + ")");
            v.this.p(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.i(v.this.c, "stillAlive(" + str + ")");
            v.this.b.a();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    private interface InterfaceC0249v {
        void a(String str, f7.e eVar, t3 t3Var);
    }

    static class w {

        /* renamed from: a, reason: collision with root package name */
        String f2275a;
        String b;

        w() {
        }
    }

    public enum x {
        Display,
        Gone
    }

    private class y extends WebViewClient {
        private y() {
        }

        /* synthetic */ y(v vVar, i iVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(t2.g) && v.this.Q != null) {
                v.this.Q.b("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (v.this.Q != null) {
                v.this.Q.c(str);
            }
            v.this.w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean zContains;
            Logger.i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                zContains = false;
            }
            if (zContains) {
                String str2 = AdPayload.FILE_SCHEME + v.this.C + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", C.UTF8_NAME, getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public v(Context context, u3 u3Var, v2 v2Var, com.json.sdk.controller.c cVar, o6 o6Var, int i2, c4 c4Var, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        g9 g9Var = new g9(context, new q9.a());
        this.Z = g9Var;
        Logger.i(this.c, "C'tor");
        this.Y = v2Var;
        this.Q = cVar;
        this.f2223a = o6Var;
        this.I = u3Var;
        a(context, g9Var);
        this.C = str;
        this.F = new k0();
        this.S = new JSONObject();
        this.i = c4Var;
        this.T = aVar;
        this.U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(t2.a.h, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.V = new c3(new z2(SDKUtils.getControllerUrl(), this.C, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new kb(SDKUtils.getControllerUrl())), new Function1() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.c((o7) obj);
                }
            }, c4Var, new od.a());
        } else {
            c4Var.a(this);
            this.D = new com.json.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.C, SDKUtils.getControllerUrl(), c4Var);
        }
        i iVar = null;
        r rVar = new r(this, iVar);
        this.r = rVar;
        g9Var.setWebViewClient(new y(this, iVar));
        g9Var.setWebChromeClient(rVar);
        re.a(g9Var);
        a(g9Var);
        g9Var.setDownloadListener(this);
        this.R = c(context);
        b(context);
        b(i2);
        this.f = str2;
        this.g = str3;
        this.b = y2.CC.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    private void G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g3 a(f7.e eVar) {
        if (eVar == f7.e.Interstitial) {
            return this.z;
        }
        if (eVar == f7.e.RewardedVideo) {
            return this.y;
        }
        if (eVar == f7.e.Banner) {
            return this.B;
        }
        return null;
    }

    private w a(f7.e eVar, t3 t3Var) throws JSONException {
        w wVar = new w();
        if (eVar == f7.e.RewardedVideo || eVar == f7.e.Interstitial || eVar == f7.e.OfferWall || eVar == f7.e.Banner) {
            HashMap map = new HashMap();
            map.put("applicationKey", this.f);
            if (!TextUtils.isEmpty(this.g)) {
                map.put("applicationUserId", this.g);
            }
            if (t3Var != null) {
                if (t3Var.g() != null) {
                    map.putAll(t3Var.g());
                    map.put(t2.h.y0, String.valueOf(com.json.n.f2025a.c(t3Var.h())));
                }
                map.put("demandSourceName", t3Var.f());
                map.put("demandSourceId", t3Var.h());
            }
            Map<String, String> mapB = b(eVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
            t2.g gVarA = t2.g.a(eVar);
            String strA = a(gVarA.f2294a, strFlatMapToJsonAsString, gVarA.b, gVarA.c);
            wVar.f2275a = gVarA.f2294a;
            wVar.b = strA;
        } else if (eVar == f7.e.OfferWallCredits) {
            String strA2 = a(t2.g.D, a(t2.h.m, t2.h.a0, "applicationKey", this.f, "applicationUserId", this.g, null, null, null, false), AbstractJsonLexerKt.NULL, t2.g.h0);
            wVar.f2275a = t2.g.D;
            wVar.b = strA2;
        }
        return wVar;
    }

    private String a(f7.e eVar, JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        t3 t3VarA = this.I.a(eVar, strFetchDemandSourceId);
        if (t3VarA != null) {
            if (t3VarA.g() != null) {
                map.putAll(t3VarA.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        Map<String, String> mapB = b(eVar);
        if (mapB != null) {
            map.putAll(mapB);
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        t2.g gVarB = t2.g.b(eVar);
        return a(gVarB.f2294a, strFlatMapToJsonAsString, gVarB.b, gVarB.c);
    }

    private String a(String str, String str2) {
        return a(str, str2, t2.h.g);
    }

    private String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            return new JSONObject(str).put(str3, str2).toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new m.a(str, str2, str3, str4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.v = new FrameLayout(context);
        this.t = new FrameLayout(context);
        this.t.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.t.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.v.addView(this.t, layoutParams);
        this.v.addView(frameLayout);
    }

    private void a(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 17) {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        }
    }

    private void a(WebView webView) {
        com.json.sdk.controller.s sVar = new com.json.sdk.controller.s(com.json.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), t2.e);
        webView.addJavascriptInterface(b(sVar), t2.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(q5 q5Var) {
        try {
            this.Q.a(q5Var);
        } catch (Exception e2) {
            Logger.e(this.c, "handleLoadAd: " + e2);
        }
    }

    private void a(t3 t3Var, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, t3Var.b()});
        if (map.containsKey("adm")) {
            this.b.a(new y2.d() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda1
                @Override // com.ironsource.y2.d
                public final void a(t5 t5Var) {
                    this.f$0.a(t5Var);
                }
            });
        }
        this.F.d(t3Var.h(), true);
        i(a(t2.g.K, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), t2.g.L, t2.g.M));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t5 t5Var) {
        t5Var.a(new u5() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda0
            @Override // com.json.u5
            public final void a(q5 q5Var) {
                this.f$0.a(q5Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, f7.e eVar, t3 t3Var) {
        if (q(eVar.toString())) {
            b(new a(eVar, t3Var, str));
        }
    }

    private void a(String str, f7.e eVar, t3 t3Var, InterfaceC0249v interfaceC0249v) {
        if (TextUtils.isEmpty(str)) {
            interfaceC0249v.a("Application key are missing", eVar, t3Var);
        } else {
            i(a(eVar, t3Var).b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, String str2, String str3) {
        String strD = new ic(str).d(z ? d0 : e0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        if (!jSONObject.optBoolean("inspectWebview") || Build.VERSION.SDK_INT < 19) {
            return;
        }
        WebView.setWebContentsDebuggingEnabled(true);
    }

    private String b(String str) {
        String str2 = this.C + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    private Map<String, String> b(f7.e eVar) {
        if (eVar == f7.e.OfferWall) {
            return this.h;
        }
        return null;
    }

    private n2 c(Context context) {
        return new i(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(o7 o7Var) {
        this.i.a(this);
        if (o7Var == null || !o7Var.exists()) {
            a(new o7(t2.g), new g7(1, "Unable to download Html file"));
            return null;
        }
        a(o7Var);
        return null;
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), jb.d(this.Z.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new ic(str).d(e0);
    }

    private String d(JSONObject jSONObject) {
        x3 x3VarB = x3.b(this.Z.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion");
            sb.append(t2.i.b);
            sb.append(sDKVersion);
            sb.append(t2.i.c);
        }
        String strE = x3VarB.e();
        if (!TextUtils.isEmpty(strE)) {
            sb.append("deviceOs");
            sb.append(t2.i.b);
            sb.append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + ":";
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append(t2.i.c);
            sb.append("protocol");
            sb.append(t2.i.b);
            sb.append(str);
            sb.append(t2.i.c);
            sb.append(t2.i.C);
            sb.append(t2.i.b);
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{t2.i.Y, "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb.append(t2.i.c);
                        sb.append("controllerConfig");
                        sb.append(t2.i.b);
                        sb.append(string);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            sb.append(t2.i.c);
            sb.append("debug");
            sb.append(t2.i.b);
            sb.append(r());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) throws JSONException {
        boolean z;
        x3 x3VarB = x3.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put(t2.i.z, SDKUtils.translateDeviceOrientation(this.X.E(context)));
            String strD = x3VarB.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = x3VarB.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
                z = false;
            } else {
                z = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.i(this.c, "add AID");
                    jSONObject.put("deviceIds" + t2.i.d + "AID" + t2.i.e, SDKUtils.encodeString(advertiserId));
                }
                String limitAdTracking = SDKUtils.getLimitAdTracking();
                if (!TextUtils.isEmpty(limitAdTracking)) {
                    Logger.i(this.c, "add LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(limitAdTracking));
                }
                String strE = x3VarB.e();
                if (strE != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(strE));
                } else {
                    z = true;
                }
                String strF = x3VarB.f();
                if (strF != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), strF.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String strF2 = x3VarB.f();
                if (strF2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(strF2));
                }
                String strValueOf = String.valueOf(x3VarB.a());
                if (strValueOf != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), strValueOf);
                } else {
                    z = true;
                }
                jSONObject.put(i5.V, String.valueOf(com.json.t.a()));
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
                }
                if (x3VarB.b() != null && x3VarB.b().length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(x3VarB.b()));
                }
                String strB = q2.b(context);
                if (strB.equals("none")) {
                    z = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), q2.d(context));
                }
                jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(this.X.a(this.C))));
                } else {
                    z = true;
                }
                String strValueOf2 = String.valueOf(this.X.r());
                if (TextUtils.isEmpty(strValueOf2)) {
                    z = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString(t2.i.F) + t2.i.d + SDKUtils.encodeString("width") + t2.i.e, SDKUtils.encodeString(strValueOf2));
                }
                jSONObject.put(SDKUtils.encodeString(t2.i.F) + t2.i.d + SDKUtils.encodeString("height") + t2.i.e, SDKUtils.encodeString(String.valueOf(this.X.a())));
                String strG = p0.g(this.Z.getContext());
                if (!TextUtils.isEmpty(strG)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
                }
                String strValueOf3 = String.valueOf(this.X.h());
                if (!TextUtils.isEmpty(strValueOf3)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(strValueOf3));
                }
                String strValueOf4 = String.valueOf(this.X.f());
                if (!TextUtils.isEmpty(strValueOf4)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(strValueOf4));
                }
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), x3.b(context).a(context));
                jSONObject.put(SDKUtils.encodeString("batteryLevel"), this.X.w(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), p2.b(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), p2.c(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), p2.e(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(p2.f(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), p0.f(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), p0.d(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(p0.b(context)));
                String strE2 = p0.e(context);
                if (!TextUtils.isEmpty(strE2)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(strE2));
                }
                c(jSONObject);
                jSONObject.put(SDKUtils.encodeString(t2.i.o0), this.X.z(context));
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
        } catch (JSONException e3) {
            e = e3;
            z = false;
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new ic(str).d(d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            n2 n2Var = this.R;
            if (n2Var == null) {
                return;
            }
            n2Var.b(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            n2 n2Var = this.R;
            if (n2Var == null) {
                return;
            }
            n2Var.c(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) throws JSONException {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z = true;
        } else {
            f7.e eVarG = g(str);
            if (eVarG == f7.e.OfferWall) {
                mapG = this.h;
            } else {
                t3 t3VarA = this.I.a(eVarG, str2);
                if (t3VarA != null) {
                    mapG = t3VarA.g();
                    mapG.put("demandSourceName", t3VarA.f());
                    mapG.put("demandSourceId", t3VarA.h());
                }
            }
            try {
                jSONObject.put(t2.h.m, str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            z = false;
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.g));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(this.f)) {
            z = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.f));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    o(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f7.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f7.e eVar = f7.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        f7.e eVar2 = f7.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        f7.e eVar3 = f7.e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        f7.e eVar4 = f7.e.Banner;
        if (str.equalsIgnoreCase(eVar4.toString())) {
            return eVar4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str, String str2) {
        String strD = new ic(str2).d("errMsg");
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        c(new e(str, strD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.j(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str) {
        this.Z.a(new m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        try {
            Logger.i(this.c, "load(): " + str);
            this.Z.loadUrl(str);
        } catch (Throwable th) {
            Logger.e(this.c, "WebViewController::load: " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        fb fbVar = this.a0;
        if (fbVar != null) {
            fbVar.onCloseRequested();
        }
    }

    private void o(String str) {
        WebSettings settings;
        int i2;
        if (str.equalsIgnoreCase("0")) {
            settings = this.Z.getSettings();
            i2 = 2;
        } else {
            settings = this.Z.getSettings();
            i2 = -1;
        }
        settings.setCacheMode(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        WebView presentingView;
        ic icVar = new ic(str);
        String strD = icVar.d("color");
        String strD2 = icVar.d("adViewId");
        int color = !t2.h.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 != null) {
            presentingView = e7.a().a(strD2).getPresentingView();
            if (presentingView == null) {
                return;
            }
        } else {
            presentingView = this.Z;
        }
        presentingView.setBackgroundColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(f7.e.Interstitial.toString()) ? !str.equalsIgnoreCase(f7.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(f7.e.Banner.toString()) ? (str.equalsIgnoreCase(f7.e.OfferWall.toString()) || str.equalsIgnoreCase(f7.e.OfferWallCredits.toString())) && this.A != null : this.B != null : this.y != null : this.z != null) {
            z = true;
        }
        if (!z) {
            Logger.d(this.c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    public void A() {
        i(f(t2.g.G));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (Throwable th) {
            Logger.i(this.c, "WebViewController: onPause() - " + th);
        }
    }

    public void C() {
        this.E = null;
    }

    public void D() {
        this.a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (Throwable th) {
            Logger.i(this.c, "WebViewController: onResume() - " + th);
        }
    }

    com.json.sdk.controller.g a(com.json.sdk.controller.s sVar) {
        return new com.json.sdk.controller.g(new com.json.sdk.controller.b(new u()), sVar);
    }

    @Override // com.json.sdk.controller.l
    public void a() {
        if (this.W) {
            this.V.a();
            return;
        }
        this.D.a(new h7());
        if (this.D.k()) {
            a(1);
        }
    }

    public void a(int i2) {
        if (!this.W && !this.D.m()) {
            Logger.i(this.c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strD = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        this.f2223a.c(new k(controllerConfigAsJSONObject, this.Z, (this.W ? this.V.getHtmlFile() : this.D.g()).toURI().toString() + "?" + strD));
        this.n = new l(50000L, 1000L, i2).start();
    }

    @Override // com.json.sdk.controller.l
    public void a(Activity activity) {
        this.Y.a(activity);
    }

    @Override // com.json.sdk.controller.l
    public void a(Context context) {
        a(new g(context));
    }

    public void a(ee eeVar) {
        this.E = eeVar;
    }

    void a(f7.e eVar, String str) {
        b(new h(eVar, str));
    }

    public void a(fb fbVar) {
        this.a0 = fbVar;
        this.Z.a(fbVar);
    }

    public void a(k0 k0Var) {
        String strB;
        g3 g3VarA;
        synchronized (this.G) {
            if (k0Var.m() && this.j) {
                Log.d(this.c, "restoreState(state:" + k0Var + ")");
                int iC = k0Var.c();
                if (iC != -1) {
                    f7.e eVar = f7.e.RewardedVideo;
                    if (iC == eVar.ordinal()) {
                        Log.d(this.c, "onRVAdClosed()");
                        strB = k0Var.b();
                        g3VarA = a(eVar);
                        if (g3VarA != null && !TextUtils.isEmpty(strB)) {
                            g3VarA.a(eVar, strB);
                        }
                        k0Var.a(-1);
                        k0Var.f(null);
                    } else {
                        eVar = f7.e.Interstitial;
                        if (iC == eVar.ordinal()) {
                            Log.d(this.c, "onInterstitialAdClosed()");
                            strB = k0Var.b();
                            g3VarA = a(eVar);
                            if (g3VarA != null && !TextUtils.isEmpty(strB)) {
                                g3VarA.a(eVar, strB);
                            }
                        } else if (iC == f7.e.OfferWall.ordinal()) {
                            Log.d(this.c, "onOWAdClosed()");
                            bb bbVar = this.A;
                            if (bbVar != null) {
                                bbVar.onOWAdClosed();
                            }
                        }
                        k0Var.a(-1);
                        k0Var.f(null);
                    }
                }
                Log.d(this.c, "No ad was opened");
                String strD = k0Var.d();
                String strF = k0Var.f();
                for (t3 t3Var : this.I.a(f7.e.Interstitial)) {
                    if (t3Var.e() == 2) {
                        Log.d(this.c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + t3Var.f() + ")");
                        a(strD, strF, t3Var, this.z);
                    }
                }
                String strI = k0Var.i();
                String strJ = k0Var.j();
                for (t3 t3Var2 : this.I.a(f7.e.RewardedVideo)) {
                    if (t3Var2.e() == 2) {
                        String strF2 = t3Var2.f();
                        Log.d(this.c, "onRVNoMoreOffers()");
                        this.y.d(strF2);
                        Log.d(this.c, "initRewardedVideo(appKey:" + strI + ", userId:" + strJ + ", demandSource:" + strF2 + ")");
                        a(strI, strJ, t3Var2, this.y);
                    }
                }
                k0Var.c(false);
            }
            this.F = k0Var;
        }
    }

    @Override // com.json.db
    public void a(o7 o7Var) {
        if (this.W && this.V.a(o7Var)) {
            a(1);
        } else if (o7Var.getName().contains(t2.g)) {
            this.D.a(new b());
        } else {
            c(o7Var.getName(), o7Var.getParent());
        }
    }

    @Override // com.json.db
    public void a(o7 o7Var, g7 g7Var) {
        if (!this.W || !this.V.a(o7Var)) {
            if (o7Var.getName().contains(t2.g)) {
                this.D.a(new c(), new d(g7Var));
                return;
            } else {
                b(o7Var.getName(), o7Var.getParent(), g7Var.b());
                return;
            }
        }
        this.Q.b("controller html - failed to download - " + g7Var.b());
    }

    public void a(com.json.sdk.controller.a aVar) {
        this.N = aVar;
        aVar.a(p());
    }

    @Override // com.json.sdk.controller.l
    public void a(f.MessageToController cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), t2.g.a0, t2.g.a0));
    }

    public void a(com.json.sdk.controller.i iVar) {
        this.M = iVar;
    }

    public void a(com.json.sdk.controller.j jVar) {
        this.O = jVar;
    }

    public void a(com.json.sdk.controller.o oVar) {
        this.J = oVar;
    }

    public void a(com.json.sdk.controller.q qVar) {
        this.K = qVar;
    }

    public void a(com.json.sdk.controller.u uVar) {
        this.L = uVar;
    }

    public void a(x xVar) {
        this.w = xVar;
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var) {
        Map<String, String> mapB = t3Var.b();
        if (mapB != null) {
            i(a(t2.g.Y, SDKUtils.flatMapToJsonAsString(mapB), t2.g.V, t2.g.W));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var, Map<String, String> map, h3 h3Var) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, t3Var.b()});
        if (map != null) {
            i(a(t2.g.T, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), t2.g.U, t2.g.X));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var, Map<String, String> map, i3 i3Var) {
        i(a(f7.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, t3Var.b()}))));
    }

    void a(Runnable runnable) {
        o6 o6Var = this.f2223a;
        if (o6Var != null) {
            o6Var.a(runnable);
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, i3 i3Var) throws JSONException {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.F.d(str, true);
        i(a(t2.g.K, strFlatMapToJsonAsString, t2.g.L, t2.g.M));
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, bb bbVar) {
        this.f = str;
        this.g = str2;
        this.A = bbVar;
        if (TextUtils.isEmpty(str2)) {
            a("UserId missing", f7.e.OfferWallCredits, (t3) null);
        } else {
            a(this.f, f7.e.OfferWallCredits, (t3) null, new p());
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, h3 h3Var) {
        this.f = str;
        this.g = str2;
        this.B = h3Var;
        a(str, f7.e.Banner, t3Var, new q());
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, i3 i3Var) {
        this.f = str;
        this.g = str2;
        this.z = i3Var;
        this.F.g(str);
        this.F.h(this.g);
        a(this.f, f7.e.Interstitial, t3Var, new n());
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, j3 j3Var) {
        this.f = str;
        this.g = str2;
        this.y = j3Var;
        this.F.i(str);
        this.F.j(str2);
        a(str, f7.e.RewardedVideo, t3Var, new m());
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, Map<String, String> map, bb bbVar) {
        this.f = str;
        this.g = str2;
        this.h = map;
        this.A = bbVar;
        this.F.b(map);
        this.F.b(true);
        if (TextUtils.isEmpty(str2)) {
            a("UserId missing", f7.e.OfferWall, (t3) null);
        } else {
            a(this.f, f7.e.OfferWall, (t3) null, new o());
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(Map<String, String> map, bb bbVar) {
        this.h = map;
        i(c(t2.g.C, t2.g.E, t2.g.F));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject) {
        i(e(t2.g.k0, jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, h3 h3Var) {
        i(a(t2.g.T, jSONObject.toString(), t2.g.U, t2.g.X));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, i3 i3Var) {
        i(a(f7.e.Interstitial, jSONObject));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, j3 j3Var) {
        i(a(f7.e.RewardedVideo, jSONObject));
    }

    public void a(boolean z, String str) {
        i(e(t2.g.b0, a(t2.h.K, str, null, null, null, null, null, null, t2.h.o, z)));
    }

    @Override // com.json.sdk.controller.l
    public boolean a(String str) {
        t3 t3VarA = this.I.a(f7.e.Interstitial, str);
        return t3VarA != null && t3VarA.d();
    }

    com.json.sdk.controller.r b(com.json.sdk.controller.s sVar) {
        return new com.json.sdk.controller.r(sVar);
    }

    public void b(int i2) {
        c0 = i2;
    }

    @Override // com.json.sdk.controller.l
    public void b(Context context) {
        a(new f(context));
    }

    @Override // com.json.sdk.controller.l
    public void b(t3 t3Var) {
        Map<String, String> mapB = t3Var.b();
        if (mapB != null) {
            i(e(t2.g.Z, SDKUtils.flatMapToJsonAsString(mapB)));
        }
    }

    @Override // com.json.sdk.controller.l
    public void b(t3 t3Var, Map<String, String> map, i3 i3Var) {
        a(t3Var, map);
    }

    void b(Runnable runnable) {
        o6 o6Var = this.f2223a;
        if (o6Var != null) {
            o6Var.b(runnable);
        }
    }

    public void b(String str, String str2, String str3) {
        try {
            i(e(t2.g.p, a(t2.h.b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception unused) {
        }
    }

    @Override // com.json.sdk.controller.l
    public void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    void c(Runnable runnable) {
        o6 o6Var = this.f2223a;
        if (o6Var != null) {
            o6Var.c(runnable);
        }
    }

    public void c(String str) {
        if (str.equals(t2.h.i)) {
            o();
        }
        i(e(t2.g.y, a(t2.h.h, str, null, null, null, null, null, null, null, false)));
    }

    public void c(String str, String str2) {
        try {
            i(e(t2.g.o, a(t2.h.b, str, "path", b(str2), null, null, null, null, null, false)));
        } catch (Exception e2) {
            b(str, str2, e2.getMessage());
        }
    }

    @Override // com.json.sdk.controller.l
    public void d() {
        i(f(t2.g.s));
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = t2.c.B;
        }
        i(e(t2.g.g0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.json.sdk.controller.l
    public void destroy() {
        this.Z.destroy();
        c4 c4Var = this.i;
        if (c4Var != null) {
            c4Var.d();
        }
        n2 n2Var = this.R;
        if (n2Var != null) {
            n2Var.b();
        }
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.json.sdk.controller.l
    public void e() {
        a(this.F);
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.c, "device connection info changed: " + jSONObject.toString());
        i(e(t2.g.x, a(t2.i.g0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    @Override // com.json.sdk.controller.l
    public void f() {
        i(f(t2.g.t));
    }

    @Override // com.json.sdk.controller.l
    public f7.c g() {
        return f7.c.Web;
    }

    public void g(String str, String str2) {
        i(e(t2.g.c0, a(t2.h.p, str2, t2.h.m, str, null, null, null, null, null, false)));
    }

    public boolean h(String str) {
        List<String> listD = e9.e().d();
        if (listD == null) {
            return false;
        }
        try {
            if (listD.isEmpty()) {
                return false;
            }
            Iterator<String> it = listD.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    yd.a(q(), str);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void k(String str) {
        i(e(t2.g.v, a(t2.h.h, str, null, null, null, null, null, null, null, false)));
    }

    public void m(String str) {
        Logger.i(this.c, "device status changed, connection type " + str);
        k7.a(str);
        i(e(t2.g.w, a("connectionType", str, null, null, null, null, null, null, null, false)));
    }

    public void n(String str) {
        this.x = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.i(this.c, str + " " + str4);
    }

    public qe p() {
        if (this.P == null) {
            this.P = new j();
        }
        return this.P;
    }

    public Context q() {
        return this.Y.a();
    }

    public int r() {
        return c0;
    }

    public FrameLayout s() {
        return this.v;
    }

    public String t() {
        return this.x;
    }

    public k0 u() {
        return this.F;
    }

    public x v() {
        return this.w;
    }

    public void w() {
        if (this.k == null) {
            return;
        }
        o();
        f7.e eVarB = this.k.b();
        String strA = this.k.a();
        if (q(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void x() {
        this.r.onHideCustomView();
    }

    public boolean y() {
        return this.s != null;
    }

    public void z() {
        i(f(t2.g.f0));
    }
}
