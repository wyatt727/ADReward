package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.gb;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class n9 implements gb.a, AppLovinBroadcastManager.Receiver, zp.b, a.b {
    protected boolean B;
    protected AppLovinAdClickListener C;
    protected AppLovinAdDisplayListener D;
    protected AppLovinAdVideoPlaybackListener E;
    protected final gb F;
    protected ho G;
    protected ho H;
    protected boolean I;
    private final com.applovin.impl.sdk.g J;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f710a;
    protected final com.applovin.impl.sdk.k b;
    protected final com.applovin.impl.sdk.t c;
    protected Activity d;
    private final p g;
    private final f.a h;
    protected AppLovinAdView i;
    protected com.applovin.impl.adview.k j;
    protected final com.applovin.impl.adview.g k;
    protected final com.applovin.impl.adview.g l;
    protected long r;
    private boolean s;
    protected boolean t;
    protected int u;
    protected boolean v;
    private final Handler f = new Handler(Looper.getMainLooper());
    protected final long m = SystemClock.elapsedRealtime();
    private final AtomicBoolean n = new AtomicBoolean();
    private final AtomicBoolean o = new AtomicBoolean();
    private final AtomicBoolean p = new AtomicBoolean();
    protected long q = -1;
    private int w = 0;
    private final ArrayList x = new ArrayList();
    protected int y = 0;
    protected int z = 0;
    protected int A = com.applovin.impl.sdk.f.i;
    private boolean K = false;

    public interface d {
        void a(n9 n9Var);

        void a(String str, Throwable th);
    }

    public abstract void A();

    public abstract void a(long j);

    public abstract void a(ViewGroup viewGroup);

    public void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void j() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.t = true;
    }

    protected boolean l() {
        return AppLovinAdType.INCENTIVIZED == this.f710a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f710a.getType();
    }

    protected abstract void q();

    public void u() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.K) {
            f();
        }
        if (this.f710a.R0()) {
            c("javascript:onBackPressed();");
        }
    }

    public void w() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "onPause()");
        }
        b("javascript:al_onAppPaused();");
        if (this.F.b()) {
            this.F.a();
        }
        r();
    }

    public void x() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "onResume()");
        }
        b("javascript:al_onAppResumed();");
        s();
        if (this.F.b()) {
            this.F.a();
        }
    }

    public void y() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void z();

    static /* synthetic */ int c(n9 n9Var) {
        int i = n9Var.w;
        n9Var.w = i + 1;
        return i;
    }

    n9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f710a = bVar;
        this.b = kVar;
        this.c = kVar.L();
        this.d = activity;
        this.C = appLovinAdClickListener;
        this.D = appLovinAdDisplayListener;
        this.E = appLovinAdVideoPlaybackListener;
        gb gbVar = new gb(activity, kVar);
        this.F = gbVar;
        gbVar.a(this);
        this.J = new com.applovin.impl.sdk.g(kVar);
        e eVar = new e(this, null);
        if (((Boolean) kVar.a(oj.J2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(oj.P2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        l9 l9Var = new l9(kVar.v0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.i = l9Var;
        l9Var.setAdClickListener(eVar);
        this.i.setAdDisplayListener(new a());
        bVar.e().putString("ad_view_address", ar.a(this.i));
        this.i.getController().a(this);
        ca caVar = new ca(map, kVar);
        if (caVar.c()) {
            this.j = new com.applovin.impl.adview.k(caVar, activity);
        }
        kVar.i().trackImpression(bVar);
        List listK = bVar.K();
        if (bVar.p() < 0 && listK == null) {
            this.k = null;
        } else {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.n(), activity);
            this.k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.l = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.b(view);
            }
        });
        if (bVar.S0()) {
            this.h = new b();
        } else {
            this.h = null;
        }
        this.g = new c();
    }

    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            n9.this.f();
        }
    }

    class b implements f.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.f.a
        public void a(int i) {
            n9 n9Var = n9.this;
            if (n9Var.A != com.applovin.impl.sdk.f.i) {
                n9Var.B = true;
            }
            com.applovin.impl.adview.b bVarG = n9Var.i.getController().g();
            if (bVarG == null) {
                com.applovin.impl.sdk.t tVar = n9.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    n9.this.c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.f.a(i) && !com.applovin.impl.sdk.f.a(n9.this.A)) {
                bVarG.a("javascript:al_muteSwitchOn();");
            } else if (i == 2) {
                bVarG.a("javascript:al_muteSwitchOff();");
            }
            n9.this.A = i;
        }
    }

    class c extends p {
        c() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.getClass().getName().equals(zp.l(activity.getApplicationContext()))) {
                n9.this.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f710a.d() >= 0) {
            this.p.set(true);
        } else {
            if (this.o.get()) {
                return;
            }
            D();
        }
    }

    private void D() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        com.applovin.impl.sdk.t.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
        try {
            f();
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                p();
            } catch (Throwable unused) {
            }
        }
    }

    private void C() {
        if (this.h != null) {
            this.b.m().a(this.h);
        }
        if (this.g != null) {
            this.b.e().a(this.g);
        }
    }

    @Override // com.applovin.impl.zp.b
    public void onCachedResourcesChecked(boolean z) {
        if (z) {
            return;
        }
        if (((Boolean) this.b.a(oj.P5)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b("AppLovinFullscreenActivity", "Dismissing ad due to unavailable resources");
            }
            ob.a(this.f710a, this.D, "Unavailable ad resources", null, null);
            f();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b("AppLovinFullscreenActivity", "Streaming ad due to unavailable ad resources");
        }
        this.f710a.J0();
    }

    protected void b(boolean z) {
        List listA = zp.a(z, this.f710a, this.b, this.d);
        if (listA.isEmpty()) {
            return;
        }
        if (((Boolean) this.b.a(oj.P5)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            ob.a(this.f710a, this.D, "Missing ad resources", null, null);
            f();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f710a.J0();
    }

    protected void a(boolean z) {
        zp.a(z, this.f710a, this.b, com.applovin.impl.sdk.k.k(), this);
    }

    public void f() {
        this.s = true;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.b bVar = this.f710a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f710a != null ? r0.C() : 0L);
        p();
        this.J.b();
        if (this.h != null) {
            this.b.m().b(this.h);
        }
        if (this.g != null) {
            this.b.e().b(this.g);
        }
        if (m()) {
            this.d.finish();
            return;
        }
        this.b.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.b.L().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        v();
    }

    protected void d(boolean z) {
        a(z, ((Long) this.b.a(oj.H2)).longValue());
        bc.a(this.D, this.f710a);
        this.b.E().a(this.f710a);
        if (this.f710a.hasVideoUrl() || l()) {
            bc.a(this.E, this.f710a);
        }
        new vg(this.d).a(this.f710a);
        this.f710a.setHasShown(true);
    }

    public boolean B() {
        return this.p.get();
    }

    public boolean k() {
        return this.s;
    }

    public void v() {
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.i.destroy();
            this.i = null;
            if ((parent instanceof ViewGroup) && m()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        q();
        p();
        this.C = null;
        this.D = null;
        this.E = null;
        this.d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, d dVar) {
        n9 o9Var;
        boolean zB1 = bVar.b1();
        if (bVar instanceof bq) {
            if (zB1) {
                try {
                    o9Var = new q9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    try {
                        o9Var = new r9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    o9Var = new r9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (bVar.hasVideoUrl()) {
            if (bVar.I0()) {
                try {
                    o9Var = new v9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th4) {
                    dVar.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + kVar + " and throwable: " + th4.getMessage(), th4);
                    return;
                }
            } else if (zB1) {
                try {
                    o9Var = new s9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th5) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th5);
                    }
                    try {
                        o9Var = new t9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th6) {
                        dVar.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + kVar + " and throwable: " + th6.getMessage(), th6);
                        return;
                    }
                }
            } else {
                try {
                    o9Var = new t9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    dVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                o9Var = new o9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                dVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        o9Var.C();
        dVar.a(o9Var);
    }

    protected int g() {
        int iR = this.f710a.r();
        return (iR <= 0 && ((Boolean) this.b.a(oj.G2)).booleanValue()) ? this.u + 1 : iR;
    }

    protected void p() {
        if (!B() && this.o.compareAndSet(false, true)) {
            bc.b(this.D, this.f710a);
            this.b.E().b(this.f710a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                n9.b(gVar, runnable);
            }
        });
    }

    protected boolean m() {
        return this.d instanceof AppLovinFullscreenActivity;
    }

    protected void r() {
        ho hoVar = this.G;
        if (hoVar != null) {
            hoVar.d();
        }
    }

    protected void s() {
        ho hoVar = this.G;
        if (hoVar != null) {
            hoVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        if (this.f710a.D0().getAndSet(true)) {
            return;
        }
        this.b.l0().a((xl) new fn(this.f710a, this.b), sm.b.OTHER);
    }

    protected void t() {
        com.applovin.impl.adview.b bVarG;
        if (this.i == null || !this.f710a.x0() || (bVarG = this.i.getController().g()) == null) {
            return;
        }
        this.J.a(bVarG, new g.c() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.sdk.g.c
            public final void a(View view) {
                this.f$0.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        f();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.t) {
            j();
        } else if ("com.applovin.al_onPoststitialShow_evaluation_error".equals(intent.getAction())) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements AppLovinAdClickListener, View.OnClickListener {
        private e() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            bc.a(n9.this.C, appLovinAd);
            n9.this.z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n9 n9Var = n9.this;
            if (view == n9Var.k && ((Boolean) n9Var.b.a(oj.q2)).booleanValue()) {
                n9.c(n9.this);
                if (n9.this.f710a.R0()) {
                    n9.this.c("javascript:al_onCloseButtonTapped(" + n9.this.w + "," + n9.this.y + "," + n9.this.z + ");");
                }
                List listK = n9.this.f710a.K();
                com.applovin.impl.sdk.t tVar = n9.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    n9.this.c.a("AppLovinFullscreenActivity", "Handling close button tap " + n9.this.w + " with multi close delay: " + listK);
                }
                if (listK != null && listK.size() > n9.this.w) {
                    n9.this.x.add(Long.valueOf(SystemClock.elapsedRealtime() - n9.this.q));
                    List listI = n9.this.f710a.I();
                    if (listI != null && listI.size() > n9.this.w) {
                        n9 n9Var2 = n9.this;
                        n9Var2.k.a((e.a) listI.get(n9Var2.w));
                    }
                    com.applovin.impl.sdk.t tVar2 = n9.this.c;
                    if (com.applovin.impl.sdk.t.a()) {
                        n9.this.c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listK.get(n9.this.w));
                    }
                    n9.this.k.setVisibility(8);
                    n9 n9Var3 = n9.this;
                    n9Var3.a(n9Var3.k, ((Integer) listK.get(n9Var3.w)).intValue(), new Runnable() { // from class: com.applovin.impl.n9$e$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    });
                    return;
                }
                n9.this.f();
                return;
            }
            com.applovin.impl.sdk.t tVar3 = n9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            n9.this.q = SystemClock.elapsedRealtime();
        }

        /* synthetic */ e(n9 n9Var, a aVar) {
            this();
        }
    }

    protected void c(String str) {
        a(str, 0L);
    }

    public void c(boolean z) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        b("javascript:al_onWindowFocusChanged( " + z + " );");
        ho hoVar = this.H;
        if (hoVar != null) {
            if (z) {
                hoVar.e();
            } else {
                hoVar.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        com.applovin.impl.adview.b bVarG;
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView == null || (bVarG = appLovinAdView.getController().g()) == null) {
            return;
        }
        bVarG.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        ar.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                n9.a(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    protected void b(String str) {
        if (this.f710a.B0()) {
            a(str, 0L);
        }
    }

    protected void b(long j) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.G = ho.a(j, this.b, new Runnable() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.n();
            }
        });
    }

    protected void a(final String str, long j) {
        if (j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str);
            }
        }, j);
    }

    protected void a(int i, boolean z, boolean z2, long j) {
        if (this.n.compareAndSet(false, true)) {
            if (this.f710a.hasVideoUrl() || l()) {
                bc.a(this.E, this.f710a, i, z2);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            this.b.i().trackVideoEnd(this.f710a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i, z);
            long jElapsedRealtime2 = this.q != -1 ? SystemClock.elapsedRealtime() - this.q : -1L;
            this.b.i().trackFullScreenAdClosed(this.f710a, jElapsedRealtime2, this.x, j, this.B, this.A);
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
            }
        }
    }

    protected void a(boolean z, long j) {
        if (this.f710a.K0()) {
            a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    public void a(int i, KeyEvent keyEvent) {
        if (this.c == null || !com.applovin.impl.sdk.t.a()) {
            return;
        }
        this.c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    protected void a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f);
    }

    protected void a(final com.applovin.impl.adview.g gVar, long j, final Runnable runnable) {
        if (j >= ((Long) this.b.a(oj.p2)).longValue()) {
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.n9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                n9.c(gVar, runnable);
            }
        };
        if (((Boolean) this.b.a(oj.Q2)).booleanValue()) {
            this.H = ho.a(TimeUnit.SECONDS.toMillis(j), this.b, runnable2);
        } else {
            this.b.l0().a(new kn(this.b, "fadeInCloseButton", runnable2), sm.b.OTHER, TimeUnit.SECONDS.toMillis(j), true);
        }
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.I = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        com.applovin.impl.adview.g gVar;
        if (zp.a(oj.k1, this.b)) {
            this.b.D().c(this.f710a, com.applovin.impl.sdk.k.k());
        }
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("ad_size", this.f710a.getSize().getLabel(), map);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(this.f710a.getAdIdNumber()), map);
        CollectionUtils.putStringIfValid("dsp_name", this.f710a.getDspName(), map);
        CollectionUtils.putStringIfValid("clcode", this.f710a.getClCode(), map);
        this.b.B().a(o.b.BLACK_VIEW, (Map) map);
        if (((Boolean) this.b.a(oj.e6)).booleanValue()) {
            f();
            return;
        }
        this.K = ((Boolean) this.b.a(oj.f6)).booleanValue();
        if (!((Boolean) this.b.a(oj.g6)).booleanValue() || (gVar = this.k) == null) {
            return;
        }
        gVar.setVisibility(0);
    }
}
