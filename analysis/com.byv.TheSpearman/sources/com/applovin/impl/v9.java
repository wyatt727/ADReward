package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class v9 extends n9 implements g0 {
    private final w9 L;
    private final com.applovin.impl.adview.g M;
    private final ImageView N;
    private final o O;
    private final boolean P;
    private double Q;
    private double R;
    private final AtomicBoolean S;
    private final AtomicBoolean T;
    private boolean U;
    private long V;
    private long W;

    @Override // com.applovin.impl.n9
    public void a(long j) {
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.n9
    public void z() {
    }

    public v9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new w9(this.f710a, this.d, this.b);
        boolean zG0 = this.f710a.G0();
        this.P = zG0;
        this.S = new AtomicBoolean();
        this.T = new AtomicBoolean();
        this.U = zp.e(this.b);
        this.V = -2L;
        this.W = 0L;
        if (zp.a(oj.n1, kVar)) {
            a(false);
        }
        b bVar2 = new b();
        if (bVar.k0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
            this.M = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(bVar2);
        } else {
            this.M = null;
        }
        if (a(this.U, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.N = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(bVar2);
            e(this.U);
        } else {
            this.N = null;
        }
        if (zG0) {
            o oVar = new o(activity, ((Integer) kVar.a(oj.F2)).intValue(), R.attr.progressBarStyleLarge);
            this.O = oVar;
            oVar.setColor(Color.parseColor("#75FFFFFF"));
            oVar.setBackgroundColor(Color.parseColor("#00000000"));
            oVar.setVisibility(8);
            return;
        }
        this.O = null;
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
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
        this.f710a.getAdEventTracker().b(this.i, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (this.T.compareAndSet(false, true)) {
            a(this.M, this.f710a.k0(), new Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.G();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.V = -1L;
        this.W = SystemClock.elapsedRealtime();
    }

    public void O() {
        this.V = SystemClock.elapsedRealtime() - this.W;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.V + "ms");
        }
        if (L()) {
            r();
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.F.e();
            return;
        }
        E();
    }

    private void E() {
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
            N();
        }
    }

    public void N() {
        if (this.S.compareAndSet(false, true)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
            }
            c("javascript:al_showPostitial();");
            com.applovin.impl.adview.g gVar = this.M;
            if (gVar != null) {
                gVar.setVisibility(8);
            }
            ImageView imageView = this.N;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            o oVar = this.O;
            if (oVar != null) {
                oVar.b();
            }
            if (this.k != null) {
                if (this.f710a.p() >= 0) {
                    a(this.k, this.f710a.p(), new Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.I();
                        }
                    });
                } else {
                    this.k.setVisibility(0);
                }
            }
            this.i.getController().D();
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.q = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.n9
    public void j() {
        super.j();
        M();
    }

    @Override // com.applovin.impl.n9
    public void i() {
        super.i();
        M();
    }

    private void M() {
        this.L.a(this.l);
        this.q = SystemClock.elapsedRealtime();
        this.Q = 100.0d;
    }

    @Override // com.applovin.impl.g0
    public void e() {
        N();
    }

    private void e(boolean z) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.N.setScaleType(ImageView.ScaleType.FIT_XY);
                this.N.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.N, z ? this.f710a.L() : this.f710a.e0(), this.b);
    }

    @Override // com.applovin.impl.g0
    public void b(double d) {
        c("javascript:al_setVideoMuted(" + this.U + ");");
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
        if (this.M != null) {
            K();
        }
        this.i.getController().C();
        this.R = d;
        J();
        if (this.f710a.Z0()) {
            this.F.b(this.f710a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.g0
    public void d() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // com.applovin.impl.n9
    public void f() {
        q();
        super.f();
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        E();
    }

    protected boolean L() {
        return l() && !F();
    }

    protected boolean F() {
        return this.f710a.W0() ? this.I : this.Q >= ((double) this.f710a.m0());
    }

    @Override // com.applovin.impl.n9
    protected void q() {
        super.a((int) this.Q, this.P, F(), this.V);
    }

    protected void J() {
        long jV;
        long millis;
        if (this.f710a.U() >= 0 || this.f710a.V() >= 0) {
            if (this.f710a.U() >= 0) {
                jV = this.f710a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f710a;
                double d = this.R;
                long millis2 = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? TimeUnit.SECONDS.toMillis((long) d) : 0L;
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
                    millis2 += millis;
                }
                jV = (long) (millis2 * (this.f710a.V() / 100.0d));
            }
            b(jV);
        }
    }

    protected void P() {
        this.U = !this.U;
        c("javascript:al_setVideoMuted(" + this.U + ");");
        e(this.U);
        a(this.U, 0L);
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

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != v9.this.M) {
                if (view == v9.this.N) {
                    v9.this.P();
                    return;
                }
                com.applovin.impl.sdk.t tVar = v9.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    v9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            v9.this.O();
        }
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.L.a(this.N, this.M, this.k, this.O, this.j, this.i, viewGroup);
        this.i.getController().a((g0) this);
        if (!zp.a(oj.n1, this.b)) {
            b(false);
        }
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.i.renderAd(this.f710a);
        if (this.M != null) {
            this.b.l0().a(new kn(this.b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.K();
                }
            }), sm.b.TIMEOUT, this.f710a.l0(), true);
        }
        this.b.l0().a(new kn(this.b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.H();
            }
        }), sm.b.OTHER, 500L);
        super.d(this.U);
    }

    @Override // com.applovin.impl.g0
    public void a(double d) {
        this.Q = d;
    }

    @Override // com.applovin.impl.g0
    public void a() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }
}
