package com.json;

import com.json.environment.thread.IronSourceThreadManager;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.sdk.InterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayInterstitialListener;

/* loaded from: classes4.dex */
public class v6 extends a2 {
    private static final v6 e = new v6();
    private InterstitialListener b = null;
    private LevelPlayInterstitialListener c;
    private LevelPlayInterstitialListener d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2348a;

        a(AdInfo adInfo) {
            this.f2348a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.d != null) {
                v6.this.d.onAdClosed(v6.this.a(this.f2348a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + v6.this.a(this.f2348a));
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.b != null) {
                v6.this.b.onInterstitialAdClosed();
                v6.this.a("onInterstitialAdClosed()");
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2350a;

        c(AdInfo adInfo) {
            this.f2350a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.c != null) {
                v6.this.c.onAdClosed(v6.this.a(this.f2350a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + v6.this.a(this.f2350a));
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2351a;

        d(AdInfo adInfo) {
            this.f2351a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.d != null) {
                v6.this.d.onAdShowSucceeded(v6.this.a(this.f2351a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + v6.this.a(this.f2351a));
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.b != null) {
                v6.this.b.onInterstitialAdShowSucceeded();
                v6.this.a("onInterstitialAdShowSucceeded()");
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2353a;

        f(AdInfo adInfo) {
            this.f2353a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.c != null) {
                v6.this.c.onAdShowSucceeded(v6.this.a(this.f2353a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + v6.this.a(this.f2353a));
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2354a;
        final /* synthetic */ AdInfo b;

        g(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f2354a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.d != null) {
                v6.this.d.onAdShowFailed(this.f2354a, v6.this.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + v6.this.a(this.b) + ", error = " + this.f2354a.getErrorMessage());
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2355a;

        h(IronSourceError ironSourceError) {
            this.f2355a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.b != null) {
                v6.this.b.onInterstitialAdShowFailed(this.f2355a);
                v6.this.a("onInterstitialAdShowFailed() error=" + this.f2355a.getErrorMessage());
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2356a;
        final /* synthetic */ AdInfo b;

        i(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f2356a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.c != null) {
                v6.this.c.onAdShowFailed(this.f2356a, v6.this.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + v6.this.a(this.b) + ", error = " + this.f2356a.getErrorMessage());
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2357a;

        j(AdInfo adInfo) {
            this.f2357a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.d != null) {
                v6.this.d.onAdClicked(v6.this.a(this.f2357a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + v6.this.a(this.f2357a));
            }
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2358a;

        k(AdInfo adInfo) {
            this.f2358a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.d != null) {
                v6.this.d.onAdReady(v6.this.a(this.f2358a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + v6.this.a(this.f2358a));
            }
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.b != null) {
                v6.this.b.onInterstitialAdClicked();
                v6.this.a("onInterstitialAdClicked()");
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2360a;

        m(AdInfo adInfo) {
            this.f2360a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.c != null) {
                v6.this.c.onAdClicked(v6.this.a(this.f2360a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + v6.this.a(this.f2360a));
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.b != null) {
                v6.this.b.onInterstitialAdReady();
                v6.this.a("onInterstitialAdReady()");
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2362a;

        o(AdInfo adInfo) {
            this.f2362a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.c != null) {
                v6.this.c.onAdReady(v6.this.a(this.f2362a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + v6.this.a(this.f2362a));
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2363a;

        p(IronSourceError ironSourceError) {
            this.f2363a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.d != null) {
                v6.this.d.onAdLoadFailed(this.f2363a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f2363a.getErrorMessage());
            }
        }
    }

    class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2364a;

        q(IronSourceError ironSourceError) {
            this.f2364a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.b != null) {
                v6.this.b.onInterstitialAdLoadFailed(this.f2364a);
                v6.this.a("onInterstitialAdLoadFailed() error=" + this.f2364a.getErrorMessage());
            }
        }
    }

    class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2365a;

        r(IronSourceError ironSourceError) {
            this.f2365a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.c != null) {
                v6.this.c.onAdLoadFailed(this.f2365a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f2365a.getErrorMessage());
            }
        }
    }

    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2366a;

        s(AdInfo adInfo) {
            this.f2366a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.d != null) {
                v6.this.d.onAdOpened(v6.this.a(this.f2366a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + v6.this.a(this.f2366a));
            }
        }
    }

    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.b != null) {
                v6.this.b.onInterstitialAdOpened();
                v6.this.a("onInterstitialAdOpened()");
            }
        }
    }

    class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2368a;

        u(AdInfo adInfo) {
            this.f2368a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v6.this.c != null) {
                v6.this.c.onAdOpened(v6.this.a(this.f2368a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + v6.this.a(this.f2368a));
            }
        }
    }

    private v6() {
    }

    public static synchronized v6 a() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(IronSourceError ironSourceError) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(ironSourceError));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q(ironSourceError));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError, adInfo));
        }
    }

    public synchronized void a(InterstitialListener interstitialListener) {
        this.b = interstitialListener;
    }

    public synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.c = levelPlayInterstitialListener;
    }

    public synchronized InterstitialListener b() {
        return this.b;
    }

    public void b(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public synchronized void b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.d = levelPlayInterstitialListener;
    }

    public void c(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new s(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new t());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new u(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        }
    }
}
