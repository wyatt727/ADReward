package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
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
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.sr;
import com.applovin.impl.t4;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class t9 extends n9 implements AppLovinCommunicatorSubscriber {
    private final u9 L;
    private MediaPlayer M;
    protected final AppLovinVideoView N;
    protected final o O;
    protected final com.applovin.impl.adview.g P;
    protected f3 Q;
    protected final ImageView R;
    protected com.applovin.impl.adview.l S;
    protected final ProgressBar T;
    protected ProgressBar U;
    protected ImageView V;
    private final e W;
    private final d X;
    private final Handler Y;
    private final Handler Z;
    protected final t4 a0;
    protected final t4 b0;
    private final boolean c0;
    protected boolean d0;
    protected long e0;
    private int f0;
    private int g0;
    protected boolean h0;
    private boolean i0;
    private final AtomicBoolean j0;
    private final AtomicBoolean k0;
    private long l0;
    private long m0;

    public void X() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f710a.c1());
        long jT = this.f710a.T();
        if (jT > 0) {
            this.r = 0L;
            Long l = (Long) this.b.a(oj.L2);
            Integer num = (Integer) this.b.a(oj.O2);
            ProgressBar progressBar = new ProgressBar(this.d, null, R.attr.progressBarStyleHorizontal);
            this.U = progressBar;
            a(progressBar, this.f710a.S(), num.intValue());
            this.b0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new c(jT, num, l));
            this.b0.b();
        }
        this.L.a(this.k, this.j, this.i, this.U);
        a("javascript:al_onPoststitialShow(" + this.y + "," + this.z + ");", this.f710a.D());
        if (this.k != null) {
            if (this.f710a.p() >= 0) {
                a(this.k, this.f710a.p(), new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.O();
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
        this.h0 = true;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.n9
    public void v() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.b.a(oj.i6)).booleanValue()) {
                ur.b(this.S);
                this.S = null;
            }
            if (this.c0) {
                AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.N;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.N.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.M;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.v();
    }

    @Override // com.applovin.impl.n9
    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.g0 = this.N.getCurrentPosition();
        this.N.pause();
        this.a0.c();
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.g0 + "ms");
        }
    }

    protected void d(String str) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f710a);
        }
        if (this.j0.compareAndSet(false, true)) {
            if (zp.a(oj.j1, this.b)) {
                this.b.D().d(this.f710a, com.applovin.impl.sdk.k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.b.B().a(this.f710a instanceof bq ? "handleVastVideoError" : "handleVideoError", str, this.f710a);
            f();
        }
    }

    public t9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new u9(this.f710a, this.d, this.b);
        a aVar = null;
        this.V = null;
        e eVar = new e(this, aVar);
        this.W = eVar;
        d dVar = new d(this, aVar);
        this.X = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Y = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.Z = handler2;
        t4 t4Var = new t4(handler, this.b);
        this.a0 = t4Var;
        this.b0 = new t4(handler2, this.b);
        boolean zG0 = this.f710a.G0();
        this.c0 = zG0;
        this.d0 = zp.e(this.b);
        this.g0 = -1;
        this.j0 = new AtomicBoolean();
        this.k0 = new AtomicBoolean();
        this.l0 = -2L;
        this.m0 = 0L;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.n1, kVar)) {
                a(!zG0);
            }
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.N = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(eVar);
            appLovinVideoView.setOnCompletionListener(eVar);
            appLovinVideoView.setOnErrorListener(eVar);
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.A0, activity, eVar));
            bVar.e().putString("video_view_address", ar.a(appLovinVideoView));
            f fVar = new f(this, aVar);
            if (bVar.k0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
                this.P = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.P = null;
            }
            if (a(this.d0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.d0);
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
                return;
            }
            this.T = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    class a implements t4.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1018a;

        a(int i) {
            this.f1018a = i;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            if (t9.this.Q != null) {
                long seconds = this.f1018a - TimeUnit.MILLISECONDS.toSeconds(r0.N.getCurrentPosition());
                if (seconds <= 0) {
                    t9.this.v = true;
                } else if (t9.this.T()) {
                    t9.this.Q.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return t9.this.T();
        }
    }

    class b implements t4.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f1019a;

        b(Integer num) {
            this.f1019a = num;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            t9 t9Var = t9.this;
            if (t9Var.h0) {
                t9Var.T.setVisibility(8);
            } else {
                t9.this.T.setProgress((int) ((t9Var.N.getCurrentPosition() / t9.this.e0) * this.f1019a.intValue()));
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !t9.this.h0;
        }
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        a(250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        ur.a(this.S, str, "AppLovinFullscreenActivity", this.b);
    }

    private void e(boolean z) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (this.k0.compareAndSet(false, true)) {
            a(this.P, this.f710a.k0(), new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.L();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.l0 = -1L;
        this.m0 = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.n9
    public void f() {
        this.a0.a();
        this.b0.a();
        this.Y.removeCallbacksAndMessages(null);
        this.Z.removeCallbacksAndMessages(null);
        q();
        super.f();
    }

    @Override // com.applovin.impl.n9
    public void c(boolean z) {
        super.c(z);
        if (z) {
            a(0L);
            if (this.h0) {
                this.b0.b();
                return;
            }
            return;
        }
        if (this.h0) {
            this.b0.c();
        } else {
            z();
        }
    }

    private void P() {
        com.applovin.impl.adview.l lVar;
        rq rqVarI0 = this.f710a.i0();
        if (rqVarI0 == null || !rqVarI0.j() || this.h0 || (lVar = this.S) == null) {
            return;
        }
        final boolean z = lVar.getVisibility() == 4;
        final long jH = rqVarI0.h();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(z, jH);
            }
        });
    }

    protected boolean T() {
        return (this.v || this.h0 || !this.N.isPlaying()) ? false : true;
    }

    public void Y() {
        this.l0 = SystemClock.elapsedRealtime() - this.m0;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.l0 + "ms");
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

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (this.h0) {
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
        if (this.g0 >= 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.g0 + "ms for MediaPlayer: " + this.M);
            }
            this.N.seekTo(this.g0);
            this.N.start();
            this.a0.b();
            this.g0 = -1;
            a(new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.K();
                }
            }, 250L);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
            final o oVar2 = this.O;
            Objects.requireNonNull(oVar2);
            a(new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    oVar2.b();
                }
            }, 2000L);
        }
    }

    protected void W() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.N();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }

    protected void G() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda2
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
        return this.f710a.W0() ? this.I : I();
    }

    protected boolean I() {
        return E() >= this.f710a.m0();
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
        P();
    }

    protected int E() {
        long currentPosition = this.N.getCurrentPosition();
        if (this.i0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((currentPosition / this.e0) * 100.0f);
        }
        return this.f0;
    }

    protected boolean U() {
        return l() && !H();
    }

    class c implements t4.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1020a;
        final /* synthetic */ Integer b;
        final /* synthetic */ Long c;

        c(long j, Integer num, Long l) {
            this.f1020a = j;
            this.b = num;
            this.c = l;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            t9.this.U.setProgress((int) ((t9.this.r / this.f1020a) * this.b.intValue()));
            t9.this.r += this.c.longValue();
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return t9.this.r < this.f1020a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.q = SystemClock.elapsedRealtime();
    }

    protected void Z() {
        MediaPlayer mediaPlayer = this.M;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f2 = this.d0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f2, f2);
            boolean z = !this.d0;
            this.d0 = z;
            e(z);
            a(this.d0, 0L);
        } catch (Throwable unused) {
        }
    }

    protected void c(long j) {
        this.e0 = j;
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.n9
    protected void q() {
        super.a(E(), this.c0, H(), this.l0);
    }

    protected void R() {
        long jV;
        long millis;
        if (this.f710a.U() >= 0 || this.f710a.V() >= 0) {
            if (this.f710a.U() >= 0) {
                jV = this.f710a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f710a;
                long j = this.e0;
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
        if (!l() || this.h0) {
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
            if (messageData.getLong("ad_id") == this.f710a.getAdIdNumber() && this.c0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.i0 || this.N.isPlaying()) {
                    return;
                }
                d("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    private class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            t9.this.M = mediaPlayer;
            mediaPlayer.setOnInfoListener(t9.this.W);
            mediaPlayer.setOnErrorListener(t9.this.W);
            float f = !t9.this.d0 ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            t9.this.u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            t9.this.c(mediaPlayer.getDuration());
            t9.this.R();
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + t9.this.M);
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                t9.this.W();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                t9.this.G();
                return false;
            }
            t9.this.a0.b();
            t9 t9Var = t9.this;
            if (t9Var.P != null) {
                t9Var.S();
            }
            t9.this.G();
            if (!t9.this.F.b()) {
                return false;
            }
            t9.this.z();
            return false;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            t9.this.d("Video view error (" + i + "," + i2 + ")");
            t9.this.N.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Video completed");
            }
            t9.this.i0 = true;
            t9 t9Var = t9.this;
            if (!t9Var.t) {
                t9Var.X();
            } else if (t9Var.l()) {
                t9.this.V();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            t9.this.a(motionEvent, (Bundle) null);
        }

        /* synthetic */ e(t9 t9Var, a aVar) {
            this();
        }
    }

    private void f(boolean z) {
        this.f0 = E();
        if (z) {
            this.N.pause();
        } else {
            this.N.stopPlayback();
        }
    }

    private class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t9 t9Var = t9.this;
            if (view == t9Var.P) {
                t9Var.Y();
                return;
            }
            if (view == t9Var.R) {
                t9Var.Z();
                return;
            }
            com.applovin.impl.sdk.t tVar = t9Var.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(t9 t9Var, a aVar) {
            this();
        }
    }

    private class d implements sr.a {
        private d() {
        }

        @Override // com.applovin.impl.sr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            t9.this.f();
        }

        @Override // com.applovin.impl.sr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            t9.this.Y();
        }

        @Override // com.applovin.impl.sr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            t9.this.I = true;
        }

        /* synthetic */ d(t9 t9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.sr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, t9.this.i.getController().i(), t9.this.b);
        }

        @Override // com.applovin.impl.sr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, t9.this.i.getController(), t9.this.b);
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
        a(new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda10
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
        String str;
        this.L.a(this.R, this.P, this.S, this.O, this.T, this.Q, this.N, this.i, this.j, this.V, viewGroup);
        if (x3.i() && (str = this.b.g0().getExtraParameters().get("audio_focus_request")) != null) {
            this.N.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (!zp.a(oj.n1, this.b)) {
            b(!this.c0);
        }
        this.N.setVideoURI(this.f710a.s0());
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (this.f710a.Z0()) {
            this.F.b(this.f710a, new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.M();
                }
            });
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.N.start();
        if (this.c0) {
            W();
        }
        this.i.renderAd(this.f710a);
        if (this.P != null) {
            this.b.l0().a(new kn(this.b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.S();
                }
            }), sm.b.TIMEOUT, this.f710a.l0(), true);
        }
        super.d(this.d0);
    }

    @Override // com.applovin.impl.n9
    public void a(long j) {
        a(new Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.Q();
            }
        }, j);
    }
}
