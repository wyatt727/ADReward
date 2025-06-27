package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class o9 extends n9 {
    private final p9 L;
    private w1 M;
    private long N;
    private final AtomicBoolean O;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.O.set(true);
    }

    @Override // com.applovin.impl.n9
    public void a(long j) {
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
    }

    @Override // com.applovin.impl.n9
    public void z() {
    }

    public o9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new p9(this.f710a, this.d, this.b);
        this.O = new AtomicBoolean();
        if (zp.a(oj.n1, kVar)) {
            a(false);
        }
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.L.a(this.k, this.j, this.i, viewGroup);
        if (!zp.a(oj.n1, this.b)) {
            b(false);
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.i.renderAd(this.f710a);
        a("javascript:al_onPoststitialShow();", this.f710a.D());
        if (l()) {
            long jE = E();
            this.N = jE;
            if (jE > 0) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.N + "ms...");
                }
                this.M = w1.a(this.N, this.b, new Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.H();
                    }
                });
            }
        }
        if (this.k != null) {
            if (this.f710a.p() >= 0) {
                a(this.k, this.f710a.p(), new Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.I();
                    }
                });
            } else {
                this.k.setVisibility(0);
            }
        }
        K();
        this.b.l0().a(new kn(this.b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.J();
            }
        }), sm.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
        t();
        super.d(zp.e(this.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
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

    @Override // com.applovin.impl.n9
    public void f() {
        q();
        w1 w1Var = this.M;
        if (w1Var != null) {
            w1Var.a();
            this.M = null;
        }
        super.f();
    }

    protected boolean G() {
        if (this.f710a.W0()) {
            return this.I;
        }
        if (l()) {
            return this.O.get();
        }
        return true;
    }

    @Override // com.applovin.impl.n9
    protected void q() {
        super.a(F(), false, G(), -2L);
    }

    protected void K() {
        long jV;
        long millis = 0;
        if (this.f710a.U() >= 0 || this.f710a.V() >= 0) {
            if (this.f710a.U() >= 0) {
                jV = this.f710a.U();
            } else {
                if (this.f710a.T0()) {
                    int iG1 = (int) ((com.applovin.impl.sdk.ad.a) this.f710a).g1();
                    if (iG1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iG1);
                    } else {
                        int iP = (int) this.f710a.p();
                        if (iP > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iP);
                        }
                    }
                }
                jV = (long) (millis * (this.f710a.V() / 100.0d));
            }
            b(jV);
        }
    }

    @Override // com.applovin.impl.n9
    public void j() {
        super.j();
        L();
    }

    @Override // com.applovin.impl.n9
    public void i() {
        super.i();
        L();
    }

    private void L() {
        this.L.a(this.l);
        this.q = SystemClock.elapsedRealtime();
        this.O.set(true);
    }

    private long E() {
        com.applovin.impl.sdk.ad.b bVar = this.f710a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fG1 = ((com.applovin.impl.sdk.ad.a) bVar).g1();
        if (fG1 <= 0.0f) {
            fG1 = this.f710a.p();
        }
        return (long) (zp.c(fG1) * (this.f710a.E() / 100.0d));
    }

    private int F() {
        w1 w1Var;
        int iMin = 100;
        if (l()) {
            if (!G() && (w1Var = this.M) != null) {
                iMin = (int) Math.min(100.0d, ((this.N - w1Var.b()) / this.N) * 100.0d);
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }
}
