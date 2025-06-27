package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.bq;
import com.applovin.impl.t4;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q9 extends s9 {
    private final bq l0;
    private final Set m0;

    public q9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.m0 = hashSet;
        bq bqVar = (bq) bVar;
        this.l0 = bqVar;
        bq.d dVar = bq.d.VIDEO;
        hashSet.addAll(bqVar.a(dVar, mq.f699a));
        a(bq.d.IMPRESSION);
        a(dVar, "creativeView");
        bqVar.getAdEventTracker().g();
    }

    @Override // com.applovin.impl.n9
    public void w() {
        super.w();
        a(this.e0 ? bq.d.COMPANION : bq.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.l0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.n9
    public void x() {
        super.x();
        a(this.e0 ? bq.d.COMPANION : bq.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.l0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void f() {
        if (this.l0 != null) {
            a(bq.d.VIDEO, "close");
            a(bq.d.COMPANION, "close");
        }
        super.f();
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    class a implements t4.b {
        a() {
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(q9.this.c0 - (q9.this.N.getDuration() - q9.this.N.getCurrentPosition()));
            int iE = q9.this.E();
            HashSet hashSet = new HashSet();
            for (lq lqVar : new HashSet(q9.this.m0)) {
                if (lqVar.a(seconds, iE)) {
                    hashSet.add(lqVar);
                    q9.this.m0.remove(lqVar);
                }
            }
            q9.this.a(hashSet);
            if (iE >= 25 && iE < 50) {
                q9.this.l0.getAdEventTracker().x();
                return;
            }
            if (iE >= 50 && iE < 75) {
                q9.this.l0.getAdEventTracker().y();
            } else if (iE >= 75) {
                q9.this.l0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !q9.this.e0;
        }
    }

    @Override // com.applovin.impl.s9
    protected void c(long j) {
        super.c(j);
        this.l0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j), zp.e(this.b));
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void z() {
        this.Y.c();
        super.z();
    }

    @Override // com.applovin.impl.s9
    public void F() {
        a(bq.d.VIDEO, "skip");
        this.l0.getAdEventTracker().B();
        super.F();
    }

    @Override // com.applovin.impl.s9
    protected void W() {
        super.W();
        bq bqVar = this.l0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.s9
    protected void G() {
        super.G();
        bq bqVar = this.l0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.s9
    public void d(String str) {
        a(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.l0.getAdEventTracker().b(str);
        super.d(str);
    }

    @Override // com.applovin.impl.s9
    public void a0() {
        super.a0();
        a(bq.d.VIDEO, this.b0 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        this.l0.getAdEventTracker().b(this.b0);
    }

    @Override // com.applovin.impl.s9
    public void X() {
        b0();
        if (nq.a(this.l0)) {
            if (this.e0) {
                return;
            }
            a(bq.d.COMPANION, "creativeView");
            this.l0.getAdEventTracker().w();
            super.X();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        f();
    }

    @Override // com.applovin.impl.s9
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(bq.d.VIDEO_CLICK);
        this.l0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    private void b0() {
        if (!I() || this.m0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.k("AppLovinFullscreenActivity", "Firing " + this.m0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.m0);
    }

    @Override // com.applovin.impl.s9
    protected void Q() {
        long jV;
        int iP;
        long millis = 0;
        if (this.l0.U() >= 0 || this.l0.V() >= 0) {
            if (this.l0.U() >= 0) {
                jV = this.l0.U();
            } else {
                bq bqVar = this.l0;
                oq oqVarO1 = bqVar.o1();
                if (oqVarO1 != null && oqVarO1.c() > 0) {
                    millis = TimeUnit.SECONDS.toMillis(oqVarO1.c());
                } else {
                    long j = this.c0;
                    if (j > 0) {
                        millis = j;
                    }
                }
                if (bqVar.T0() && (iP = (int) bqVar.p()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iP);
                }
                jV = (long) (millis * (this.l0.V() / 100.0d));
            }
            b(jV);
        }
    }

    private void a(bq.d dVar) {
        a(dVar, gq.UNSPECIFIED);
    }

    private void a(bq.d dVar, gq gqVar) {
        a(dVar, "", gqVar);
    }

    private void a(bq.d dVar, String str) {
        a(dVar, str, gq.UNSPECIFIED);
    }

    private void a(bq.d dVar, String str, gq gqVar) {
        a(this.l0.a(dVar, str), gqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, gq.UNSPECIFIED);
    }

    private void a(Set set, gq gqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.N.getCurrentPosition());
        pq pqVarP1 = this.l0.p1();
        Uri uriC = pqVarP1 != null ? pqVarP1.c() : null;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        nq.a(set, seconds, uriC, gqVar, this.b);
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.Y.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        o oVar = this.O;
        if (oVar != null) {
            arrayList.add(new kg(oVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.P;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        f3 f3Var = this.Q;
        if (f3Var != null) {
            arrayList.add(new kg(f3Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.T;
        if (progressBar != null) {
            arrayList.add(new kg(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            arrayList.add(new kg(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.S;
        if (lVar != null) {
            arrayList.add(new kg(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.l0.getAdEventTracker().b(this.M, arrayList);
    }
}
