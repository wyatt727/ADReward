package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.nh;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.sr;
import com.applovin.impl.t4;
import com.applovin.impl.yh;
import com.applovin.impl.zj;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class s9 extends n9 implements AppLovinCommunicatorSubscriber {
    private final u9 L;
    protected final com.applovin.exoplayer2.ui.e M;
    protected final zj N;
    protected final o O;
    protected final com.applovin.impl.adview.g P;
    protected f3 Q;
    protected final ImageView R;
    protected com.applovin.impl.adview.l S;
    protected final ProgressBar T;
    protected ProgressBar U;
    private final d V;
    private final Handler W;
    private final Handler X;
    protected final t4 Y;
    protected final t4 Z;
    private final boolean a0;
    protected boolean b0;
    protected long c0;
    protected int d0;
    protected boolean e0;
    protected boolean f0;
    private long g0;
    private final AtomicBoolean h0;
    private final AtomicBoolean i0;
    private long j0;
    private long k0;

    protected void S() {
        if (!zp.a(oj.n1, this.b)) {
            b(!this.a0);
        }
        Activity activity = this.d;
        yh yhVarA = new yh.b(new u5(activity, yp.a((Context) activity, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(od.a(this.f710a.s0()));
        this.N.a(!this.b0 ? 1 : 0);
        this.N.a((wd) yhVarA);
        this.N.b();
        this.N.a(false);
    }

    protected void d(String str) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f710a);
        }
        if (this.h0.compareAndSet(false, true)) {
            if (zp.a(oj.j1, this.b)) {
                this.b.D().d(this.f710a, com.applovin.impl.sdk.k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.b.B().a(this.f710a instanceof bq ? "handleVastExoPlayerError" : "handleExoPlayerError", str, this.f710a);
            f();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.n9
    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        if (!this.N.isPlaying()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Nothing to pause");
                return;
            }
            return;
        }
        this.g0 = this.N.getCurrentPosition();
        this.N.a(false);
        this.Y.c();
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.g0 + "ms");
        }
    }

    public s9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new u9(this.f710a, this.d, this.b);
        a aVar = null;
        d dVar = new d(this, aVar);
        this.V = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.W = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.X = handler2;
        t4 t4Var = new t4(handler, this.b);
        this.Y = t4Var;
        this.Z = new t4(handler2, this.b);
        boolean zG0 = this.f710a.G0();
        this.a0 = zG0;
        this.b0 = zp.e(this.b);
        this.g0 = -1L;
        this.h0 = new AtomicBoolean();
        this.i0 = new AtomicBoolean();
        this.j0 = -2L;
        this.k0 = 0L;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.n1, kVar)) {
                a(!zG0);
            }
            f fVar = new f(this, aVar);
            if (bVar.k0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
                this.P = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.P = null;
            }
            if (a(this.b0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.b0);
            } else {
                this.R = null;
            }
            String strG0 = bVar.g0();
            if (StringUtils.isValidString(strG0)) {
                sr srVar = new sr(kVar);
                srVar.a(new WeakReference(dVar));
                com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.f0(), bVar, srVar, activity);
                this.S = lVar;
                lVar.a(strG0);
            } else {
                this.S = null;
            }
            if (zG0) {
                o oVar = new o(activity, ((Integer) kVar.a(oj.F2)).intValue(), R.attr.progressBarStyleLarge);
                this.O = oVar;
                oVar.setColor(Color.parseColor("#75FFFFFF"));
                oVar.setBackgroundColor(Color.parseColor("#00000000"));
                oVar.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.O = null;
            }
            int iG = g();
            boolean z = ((Boolean) kVar.a(oj.n2)).booleanValue() && iG > 0;
            if (this.Q == null && z) {
                this.Q = new f3(activity);
                int iQ = bVar.q();
                this.Q.setTextColor(iQ);
                this.Q.setTextSize(((Integer) kVar.a(oj.m2)).intValue());
                this.Q.setFinishedStrokeColor(iQ);
                this.Q.setFinishedStrokeWidth(((Integer) kVar.a(oj.l2)).intValue());
                this.Q.setMax(iG);
                this.Q.setProgress(iG);
                t4Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iG));
            }
            if (bVar.r0()) {
                Long l = (Long) kVar.a(oj.C2);
                Integer num = (Integer) kVar.a(oj.D2);
                ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
                this.T = progressBar;
                a(progressBar, bVar.q0(), num.intValue());
                t4Var.a("PROGRESS_BAR", l.longValue(), new b(num));
            } else {
                this.T = null;
            }
            zj zjVarA = new zj.b(activity).a();
            this.N = zjVarA;
            e eVar = new e(this, aVar);
            zjVarA.a((nh.c) eVar);
            zjVarA.a(0);
            com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(activity);
            this.M = eVar2;
            eVar2.c();
            eVar2.setControllerVisibilityListener(eVar);
            eVar2.setPlayer(zjVarA);
            eVar2.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.A0, activity, eVar));
            bVar.e().putString("video_view_address", ar.a(eVar2));
            S();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    class a implements t4.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f881a;

        a(int i) {
            this.f881a = i;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.Q != null) {
                long seconds = this.f881a - TimeUnit.MILLISECONDS.toSeconds(s9Var.M.getPlayer().getCurrentPosition());
                if (seconds <= 0) {
                    s9.this.v = true;
                } else if (s9.this.T()) {
                    s9.this.Q.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return s9.this.T();
        }
    }

    class b implements t4.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f882a;

        b(Integer num) {
            this.f882a = num;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.e0) {
                s9Var.T.setVisibility(8);
            } else {
                s9.this.T.setProgress((int) ((s9Var.N.getCurrentPosition() / s9.this.c0) * this.f882a.intValue()));
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !s9.this.e0;
        }
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        a(250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        ur.a(this.S, str, "AppLovinFullscreenActivity", this.b);
    }

    protected void e(boolean z) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.R.setScaleType(ImageView.ScaleType.FIT_XY);
                this.R.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.R, z ? this.f710a.L() : this.f710a.e0(), this.b);
    }

    protected void R() {
        if (this.i0.compareAndSet(false, true)) {
            a(this.P, this.f710a.k0(), new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.K();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        this.j0 = -1L;
        this.k0 = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.n9
    public void c(boolean z) {
        super.c(z);
        if (z) {
            a(0L);
            if (this.e0) {
                this.Z.b();
                return;
            }
            return;
        }
        if (this.e0) {
            this.Z.c();
        } else {
            z();
        }
    }

    @Override // com.applovin.impl.n9
    public void f() {
        this.Y.a();
        this.Z.a();
        this.W.removeCallbacksAndMessages(null);
        this.X.removeCallbacksAndMessages(null);
        q();
        super.f();
    }

    @Override // com.applovin.impl.n9
    public void v() {
        if (((Boolean) this.b.a(oj.i6)).booleanValue()) {
            ur.b(this.S);
            this.S = null;
        }
        this.N.V();
        if (this.a0) {
            AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
        }
        super.v();
    }

    private void O() {
        com.applovin.impl.adview.l lVar;
        rq rqVarI0 = this.f710a.i0();
        if (rqVarI0 == null || !rqVarI0.j() || this.e0 || (lVar = this.S) == null) {
            return;
        }
        final boolean z = lVar.getVisibility() == 4;
        final long jH = rqVarI0.h();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(z, jH);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, long j) {
        if (z) {
            ar.a(this.S, j, (Runnable) null);
        } else {
            ar.b(this.S, j, null);
        }
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        F();
    }

    protected boolean T() {
        return (this.v || this.e0 || !this.M.getPlayer().isPlaying()) ? false : true;
    }

    public void Y() {
        this.j0 = SystemClock.elapsedRealtime() - this.k0;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.j0 + "ms");
        }
        if (U()) {
            z();
            r();
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.F.e();
            return;
        }
        F();
    }

    public void F() {
        this.y++;
        if (this.f710a.B()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            f();
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            X();
        }
    }

    protected void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f710a.F0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriJ0 = this.f710a.j0();
            if (uriJ0 != null) {
                if (!((Boolean) this.b.a(oj.N)).booleanValue() || (context = this.d) == null) {
                    AppLovinAdView appLovinAdView = this.i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.k.k();
                }
                this.b.i().trackAndLaunchVideoClick(this.f710a, uriJ0, motionEvent, bundle, this, context);
                bc.a(this.C, this.f710a);
                this.z++;
                return;
            }
            return;
        }
        O();
    }

    protected void Z() {
        this.d0 = E();
        this.N.a(false);
    }

    protected void P() {
        if (this.e0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.f0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j = this.g0;
        if (j >= 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + j + "ms for MediaPlayer: " + this.N);
            }
            this.N.a(true);
            this.Y.b();
            this.g0 = -1L;
            if (this.N.isPlaying()) {
                return;
            }
            W();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.N.isPlaying());
        }
    }

    protected void W() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.M();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }

    protected void G() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.J();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
    }

    protected boolean H() {
        com.applovin.impl.sdk.ad.b bVar = this.f710a;
        if (bVar == null) {
            return false;
        }
        return bVar.W0() ? this.I : I();
    }

    protected boolean I() {
        return E() >= this.f710a.m0();
    }

    protected int E() {
        zj zjVar = this.N;
        if (zjVar == null) {
            return 0;
        }
        long currentPosition = zjVar.getCurrentPosition();
        if (this.f0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((currentPosition / this.c0) * 100.0f);
        }
        return this.d0;
    }

    protected boolean U() {
        return l() && !H();
    }

    public void X() {
        Z();
        long jT = this.f710a.T();
        if (jT > 0) {
            this.r = 0L;
            Long l = (Long) this.b.a(oj.L2);
            Integer num = (Integer) this.b.a(oj.O2);
            ProgressBar progressBar = new ProgressBar(this.d, null, R.attr.progressBarStyleHorizontal);
            this.U = progressBar;
            a(progressBar, this.f710a.S(), num.intValue());
            this.Z.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new c(jT, num, l));
            this.Z.b();
        }
        this.L.a(this.k, this.j, this.i, this.U);
        a("javascript:al_onPoststitialShow(" + this.y + "," + this.z + ");", this.f710a.D());
        if (this.k != null) {
            if (this.f710a.p() >= 0) {
                a(this.k, this.f710a.p(), new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.N();
                    }
                });
            } else {
                this.k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.k;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = this.U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f710a.getAdEventTracker().b(this.i, arrayList);
        t();
        this.e0 = true;
    }

    class c implements t4.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f883a;
        final /* synthetic */ Integer b;
        final /* synthetic */ Long c;

        c(long j, Integer num, Long l) {
            this.f883a = j;
            this.b = num;
            this.c = l;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9.this.U.setProgress((int) ((s9.this.r / this.f883a) * this.b.intValue()));
            s9.this.r += this.c.longValue();
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return s9.this.r < this.f883a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.q = SystemClock.elapsedRealtime();
    }

    protected void c(long j) {
        this.c0 = j;
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    protected void a0() {
        boolean z = this.b0;
        this.b0 = !z;
        this.N.a(z ? 1.0f : 0.0f);
        e(this.b0);
        a(this.b0, 0L);
    }

    @Override // com.applovin.impl.n9
    protected void q() {
        super.a(E(), this.a0, H(), this.j0);
    }

    protected void Q() {
        long jV;
        long millis;
        if (this.f710a.U() >= 0 || this.f710a.V() >= 0) {
            if (this.f710a.U() >= 0) {
                jV = this.f710a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f710a;
                long j = this.c0;
                long j2 = j > 0 ? j : 0L;
                if (aVar.T0()) {
                    int iG1 = (int) ((com.applovin.impl.sdk.ad.a) this.f710a).g1();
                    if (iG1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iG1);
                    } else {
                        int iP = (int) aVar.p();
                        if (iP > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iP);
                        }
                    }
                    j2 += millis;
                }
                jV = (long) (j2 * (this.f710a.V() / 100.0d));
            }
            b(jV);
        }
    }

    @Override // com.applovin.impl.n9
    public void j() {
        super.j();
        this.L.a(this.S);
        this.L.a((View) this.P);
        if (!l() || this.e0) {
            V();
        }
    }

    @Override // com.applovin.impl.n9
    public void i() {
        super.i();
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.L.a(this.l);
        this.q = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f710a.getAdIdNumber() && this.a0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.f0 || this.N.isPlaying()) {
                    return;
                }
                d("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    private class e implements nh.c, d.e, AppLovinTouchToClickListener.OnClickListener {
        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(int i) {
            nh.c.CC.$default$a(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(go goVar, int i) {
            nh.c.CC.$default$a(this, goVar, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(mh mhVar) {
            nh.c.CC.$default$a(this, mhVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh.b bVar) {
            nh.c.CC.$default$a(this, bVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i) {
            nh.c.CC.$default$a(this, fVar, fVar2, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh nhVar, nh.d dVar) {
            nh.c.CC.$default$a(this, nhVar, dVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(od odVar, int i) {
            nh.c.CC.$default$a(this, odVar, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(qd qdVar) {
            nh.c.CC.$default$a(this, qdVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(qo qoVar, uo uoVar) {
            nh.c.CC.$default$a(this, qoVar, uoVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(boolean z, int i) {
            nh.c.CC.$default$a(this, z, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b() {
            nh.c.CC.$default$b(this);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(kh khVar) {
            nh.c.CC.$default$b(this, khVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z) {
            nh.c.CC.$default$b(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z, int i) {
            nh.c.CC.$default$b(this, z, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void c(int i) {
            nh.c.CC.$default$c(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void c(boolean z) {
            nh.c.CC.$default$c(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void d(boolean z) {
            nh.c.CC.$default$d(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(int i) {
            nh.c.CC.$default$e(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(boolean z) {
            nh.c.CC.$default$e(this, z);
        }

        private e() {
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Player state changed to state " + i + " and will play when ready: " + s9.this.N.l());
            }
            if (i == 2) {
                s9.this.W();
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    com.applovin.impl.sdk.t tVar2 = s9.this.c;
                    if (com.applovin.impl.sdk.t.a()) {
                        s9.this.c.a("AppLovinFullscreenActivity", "Video completed");
                    }
                    s9 s9Var = s9.this;
                    s9Var.f0 = true;
                    if (!s9Var.t) {
                        s9Var.X();
                        return;
                    } else {
                        if (s9Var.l()) {
                            s9.this.V();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            s9 s9Var2 = s9.this;
            s9Var2.N.a(!s9Var2.b0 ? 1 : 0);
            s9 s9Var3 = s9.this;
            s9Var3.u = (int) TimeUnit.MILLISECONDS.toSeconds(s9Var3.N.getDuration());
            s9 s9Var4 = s9.this;
            s9Var4.c(s9Var4.N.getDuration());
            s9.this.Q();
            com.applovin.impl.sdk.t tVar3 = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + s9.this.N);
            }
            s9.this.Y.b();
            s9 s9Var5 = s9.this;
            if (s9Var5.P != null) {
                s9Var5.R();
            }
            s9.this.G();
            if (s9.this.F.b()) {
                s9.this.z();
            }
        }

        @Override // com.applovin.impl.nh.c
        public void a(kh khVar) {
            s9.this.d("Video view error (" + zp.a(khVar, s9.this.b) + ")");
            s9.this.f();
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            s9.this.a(motionEvent, (Bundle) null);
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i) {
            if (i == 0) {
                s9.this.M.c();
            }
        }

        /* synthetic */ e(s9 s9Var, a aVar) {
            this();
        }
    }

    private class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s9 s9Var = s9.this;
            if (view == s9Var.P) {
                s9Var.Y();
                return;
            }
            if (view == s9Var.R) {
                s9Var.a0();
                return;
            }
            com.applovin.impl.sdk.t tVar = s9Var.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(s9 s9Var, a aVar) {
            this();
        }
    }

    private class d implements sr.a {
        private d() {
        }

        @Override // com.applovin.impl.sr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            s9.this.f();
        }

        @Override // com.applovin.impl.sr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            s9.this.Y();
        }

        @Override // com.applovin.impl.sr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            s9.this.I = true;
        }

        /* synthetic */ d(s9 s9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.sr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, s9.this.i.getController().i(), s9.this.b);
        }

        @Override // com.applovin.impl.sr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, s9.this.i.getController(), s9.this.b);
        }
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(oj.u2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(oj.v2)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) kVar.a(oj.x2)).booleanValue();
    }

    @Override // com.applovin.impl.n9
    protected void a(final String str, long j) {
        super.a(str, j);
        if (this.S == null || j < 0 || !StringUtils.isValidString(str) || !((Boolean) this.b.a(oj.R2)).booleanValue()) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(str);
            }
        }, j);
    }

    private void a(ProgressBar progressBar, int i, int i2) {
        progressBar.setMax(i2);
        progressBar.setPadding(0, 0, 0, 0);
        if (x3.f()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.L.a(this.R, this.P, this.S, this.O, this.T, this.Q, this.M, this.i, this.j, null, viewGroup);
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.N.a(true);
        if (this.f710a.Z0()) {
            this.F.b(this.f710a, new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.L();
                }
            });
        }
        if (this.a0) {
            W();
        }
        this.i.renderAd(this.f710a);
        if (this.P != null) {
            this.b.l0().a(new kn(this.b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.R();
                }
            }), sm.b.TIMEOUT, this.f710a.l0(), true);
        }
        super.d(this.b0);
    }

    @Override // com.applovin.impl.n9
    public void a(long j) {
        a(new Runnable() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.P();
            }
        }, j);
    }
}
