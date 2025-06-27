package com.json;

import com.json.environment.thread.IronSourceThreadManager;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.json.mediationsdk.sdk.RewardedVideoListener;
import com.json.mediationsdk.sdk.RewardedVideoManualListener;

/* loaded from: classes4.dex */
public class wb extends a2 {
    private static final wb e = new wb();
    private RewardedVideoListener b = null;
    private LevelPlayRewardedVideoBaseListener c;
    private LevelPlayRewardedVideoBaseListener d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2406a;

        a(AdInfo adInfo) {
            this.f2406a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.d != null) {
                wb.this.d.onAdClosed(wb.this.a(this.f2406a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + wb.this.a(this.f2406a));
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAdClosed();
                wb.this.a("onRewardedVideoAdClosed()");
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2408a;

        c(AdInfo adInfo) {
            this.f2408a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.c != null) {
                wb.this.c.onAdClosed(wb.this.a(this.f2408a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + wb.this.a(this.f2408a));
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2409a;
        final /* synthetic */ AdInfo b;

        d(boolean z, AdInfo adInfo) {
            this.f2409a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (wb.this.d != null) {
                if (this.f2409a) {
                    ((LevelPlayRewardedVideoListener) wb.this.d).onAdAvailable(wb.this.a(this.b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + wb.this.a(this.b);
                } else {
                    ((LevelPlayRewardedVideoListener) wb.this.d).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2410a;

        e(boolean z) {
            this.f2410a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAvailabilityChanged(this.f2410a);
                wb.this.a("onRewardedVideoAvailabilityChanged() available=" + this.f2410a);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2411a;
        final /* synthetic */ AdInfo b;

        f(boolean z, AdInfo adInfo) {
            this.f2411a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (wb.this.c != null) {
                if (this.f2411a) {
                    ((LevelPlayRewardedVideoListener) wb.this.c).onAdAvailable(wb.this.a(this.b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + wb.this.a(this.b);
                } else {
                    ((LevelPlayRewardedVideoListener) wb.this.c).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAdStarted();
                wb.this.a("onRewardedVideoAdStarted()");
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAdEnded();
                wb.this.a("onRewardedVideoAdEnded()");
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2414a;
        final /* synthetic */ AdInfo b;

        i(Placement placement, AdInfo adInfo) {
            this.f2414a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.d != null) {
                wb.this.d.onAdRewarded(this.f2414a, wb.this.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f2414a + ", adInfo = " + wb.this.a(this.b));
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2415a;

        j(Placement placement) {
            this.f2415a = placement;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAdRewarded(this.f2415a);
                wb.this.a("onRewardedVideoAdRewarded(" + this.f2415a + ")");
            }
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2416a;

        k(AdInfo adInfo) {
            this.f2416a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.d != null) {
                ((LevelPlayRewardedVideoManualListener) wb.this.d).onAdReady(wb.this.a(this.f2416a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + wb.this.a(this.f2416a));
            }
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2417a;
        final /* synthetic */ AdInfo b;

        l(Placement placement, AdInfo adInfo) {
            this.f2417a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.c != null) {
                wb.this.c.onAdRewarded(this.f2417a, wb.this.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f2417a + ", adInfo = " + wb.this.a(this.b));
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2418a;
        final /* synthetic */ AdInfo b;

        m(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f2418a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.d != null) {
                wb.this.d.onAdShowFailed(this.f2418a, wb.this.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + wb.this.a(this.b) + ", error = " + this.f2418a.getErrorMessage());
            }
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2419a;

        n(IronSourceError ironSourceError) {
            this.f2419a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAdShowFailed(this.f2419a);
                wb.this.a("onRewardedVideoAdShowFailed() error=" + this.f2419a.getErrorMessage());
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2420a;
        final /* synthetic */ AdInfo b;

        o(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f2420a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.c != null) {
                wb.this.c.onAdShowFailed(this.f2420a, wb.this.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + wb.this.a(this.b) + ", error = " + this.f2420a.getErrorMessage());
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2421a;
        final /* synthetic */ AdInfo b;

        p(Placement placement, AdInfo adInfo) {
            this.f2421a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.d != null) {
                wb.this.d.onAdClicked(this.f2421a, wb.this.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f2421a + ", adInfo = " + wb.this.a(this.b));
            }
        }
    }

    class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2422a;

        q(Placement placement) {
            this.f2422a = placement;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAdClicked(this.f2422a);
                wb.this.a("onRewardedVideoAdClicked(" + this.f2422a + ")");
            }
        }
    }

    class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2423a;
        final /* synthetic */ AdInfo b;

        r(Placement placement, AdInfo adInfo) {
            this.f2423a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.c != null) {
                wb.this.c.onAdClicked(this.f2423a, wb.this.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f2423a + ", adInfo = " + wb.this.a(this.b));
            }
        }
    }

    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                ((RewardedVideoManualListener) wb.this.b).onRewardedVideoAdReady();
                wb.this.a("onRewardedVideoAdReady()");
            }
        }
    }

    class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2425a;

        t(AdInfo adInfo) {
            this.f2425a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.c != null) {
                ((LevelPlayRewardedVideoManualListener) wb.this.c).onAdReady(wb.this.a(this.f2425a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + wb.this.a(this.f2425a));
            }
        }
    }

    class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2426a;

        u(IronSourceError ironSourceError) {
            this.f2426a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.d != null) {
                ((LevelPlayRewardedVideoManualListener) wb.this.d).onAdLoadFailed(this.f2426a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f2426a.getErrorMessage());
            }
        }
    }

    class v implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2427a;

        v(IronSourceError ironSourceError) {
            this.f2427a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                ((RewardedVideoManualListener) wb.this.b).onRewardedVideoAdLoadFailed(this.f2427a);
                wb.this.a("onRewardedVideoAdLoadFailed() error=" + this.f2427a.getErrorMessage());
            }
        }
    }

    class w implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2428a;

        w(IronSourceError ironSourceError) {
            this.f2428a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.c != null) {
                ((LevelPlayRewardedVideoManualListener) wb.this.c).onAdLoadFailed(this.f2428a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f2428a.getErrorMessage());
            }
        }
    }

    class x implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2429a;

        x(AdInfo adInfo) {
            this.f2429a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.d != null) {
                wb.this.d.onAdOpened(wb.this.a(this.f2429a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + wb.this.a(this.f2429a));
            }
        }
    }

    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.b != null) {
                wb.this.b.onRewardedVideoAdOpened();
                wb.this.a("onRewardedVideoAdOpened()");
            }
        }
    }

    class z implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f2431a;

        z(AdInfo adInfo) {
            this.f2431a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.c != null) {
                wb.this.c.onAdOpened(wb.this.a(this.f2431a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + wb.this.a(this.f2431a));
            }
        }
    }

    private wb() {
    }

    public static wb a() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(IronSourceError ironSourceError) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new u(ironSourceError));
            return;
        }
        RewardedVideoListener rewardedVideoListener = this.b;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new v(ironSourceError));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.c;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new w(ironSourceError));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(ironSourceError, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(ironSourceError));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(ironSourceError, adInfo));
        }
    }

    public void a(Placement placement, AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(placement, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q(placement));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r(placement, adInfo));
        }
    }

    public void a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.c = levelPlayRewardedVideoBaseListener;
    }

    public void a(RewardedVideoListener rewardedVideoListener) {
        this.b = rewardedVideoListener;
    }

    public void a(boolean z2, AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(z2, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(z2));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.c;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(z2, adInfo));
    }

    public void b() {
        if (this.d == null && this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h());
        }
    }

    public void b(AdInfo adInfo) {
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

    public void b(Placement placement, AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(placement, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(placement));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(placement, adInfo));
        }
    }

    public void b(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.d = levelPlayRewardedVideoBaseListener;
    }

    public void c() {
        if (this.d == null && this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g());
        }
    }

    public void c(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new x(adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new y());
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new z(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
            return;
        }
        RewardedVideoListener rewardedVideoListener = this.b;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new s());
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.c;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new t(adInfo));
    }
}
