package com.json;

import com.json.environment.thread.IronSourceThreadManager;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.sdk.BannerListener;
import com.json.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: classes4.dex */
public class k1 extends a2 {
    private static final k1 e = new k1();
    private BannerListener b = null;
    private LevelPlayBannerListener c = null;
    private LevelPlayBannerListener d = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1836a;

        a(AdInfo adInfo) {
            this.f1836a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.d != null) {
                k1.this.d.onAdScreenDismissed(k1.this.a(this.f1836a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + k1.this.a(this.f1836a));
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.b != null) {
                k1.this.b.onBannerAdScreenDismissed();
                IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1838a;

        c(AdInfo adInfo) {
            this.f1838a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.c != null) {
                k1.this.c.onAdScreenDismissed(k1.this.a(this.f1838a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + k1.this.a(this.f1838a));
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1839a;

        d(AdInfo adInfo) {
            this.f1839a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.d != null) {
                k1.this.d.onAdLeftApplication(k1.this.a(this.f1839a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + k1.this.a(this.f1839a));
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.b != null) {
                k1.this.b.onBannerAdLeftApplication();
                IronLog.CALLBACK.info("onBannerAdLeftApplication()");
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1841a;

        f(AdInfo adInfo) {
            this.f1841a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.c != null) {
                k1.this.c.onAdLeftApplication(k1.this.a(this.f1841a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + k1.this.a(this.f1841a));
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1842a;

        g(AdInfo adInfo) {
            this.f1842a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.d != null) {
                k1.this.d.onAdClicked(k1.this.a(this.f1842a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + k1.this.a(this.f1842a));
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.b != null) {
                k1.this.b.onBannerAdClicked();
                IronLog.CALLBACK.info("onBannerAdClicked()");
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1844a;

        i(AdInfo adInfo) {
            this.f1844a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.c != null) {
                k1.this.c.onAdClicked(k1.this.a(this.f1844a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + k1.this.a(this.f1844a));
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1845a;

        j(AdInfo adInfo) {
            this.f1845a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.d != null) {
                k1.this.d.onAdLoaded(k1.this.a(this.f1845a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + k1.this.a(this.f1845a));
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.b != null) {
                k1.this.b.onBannerAdLoaded();
                IronLog.CALLBACK.info("onBannerAdLoaded()");
            }
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1847a;

        l(AdInfo adInfo) {
            this.f1847a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.c != null) {
                k1.this.c.onAdLoaded(k1.this.a(this.f1847a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + k1.this.a(this.f1847a));
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f1848a;

        m(IronSourceError ironSourceError) {
            this.f1848a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.d != null) {
                k1.this.d.onAdLoadFailed(this.f1848a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f1848a.getErrorMessage());
            }
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f1849a;

        n(IronSourceError ironSourceError) {
            this.f1849a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.b != null) {
                k1.this.b.onBannerAdLoadFailed(this.f1849a);
                IronLog.CALLBACK.info("onBannerAdLoadFailed() error = " + this.f1849a.getErrorMessage());
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f1850a;

        o(IronSourceError ironSourceError) {
            this.f1850a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.c != null) {
                k1.this.c.onAdLoadFailed(this.f1850a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f1850a.getErrorMessage());
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1851a;

        p(AdInfo adInfo) {
            this.f1851a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.d != null) {
                k1.this.d.onAdScreenPresented(k1.this.a(this.f1851a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + k1.this.a(this.f1851a));
            }
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.b != null) {
                k1.this.b.onBannerAdScreenPresented();
                IronLog.CALLBACK.info("onBannerAdScreenPresented()");
            }
        }
    }

    class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f1853a;

        r(AdInfo adInfo) {
            this.f1853a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k1.this.c != null) {
                k1.this.c.onAdScreenPresented(k1.this.a(this.f1853a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + k1.this.a(this.f1853a));
            }
        }
    }

    private k1() {
    }

    public static k1 a() {
        return e;
    }

    public void a(AdInfo adInfo, boolean z) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
            return;
        }
        if (this.b != null && !z) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, boolean z) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(ironSourceError));
            return;
        }
        if (this.b != null && !z) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(ironSourceError));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(ironSourceError));
        }
    }

    public void a(BannerListener bannerListener) {
        this.b = bannerListener;
    }

    public void a(LevelPlayBannerListener levelPlayBannerListener) {
        this.c = levelPlayBannerListener;
    }

    public LevelPlayBannerListener b() {
        return this.c;
    }

    public void b(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void b(LevelPlayBannerListener levelPlayBannerListener) {
        this.d = levelPlayBannerListener;
    }

    public BannerListener c() {
        return this.b;
    }

    public void c(AdInfo adInfo) {
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

    public void d(AdInfo adInfo) {
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

    public void e(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r(adInfo));
        }
    }
}
