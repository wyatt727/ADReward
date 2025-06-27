package com.my.target;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.my.target.c;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.d;
import com.my.target.e8;
import com.my.target.k8;
import com.my.target.m4;
import com.my.target.p4;
import com.my.target.v4;
import java.util.List;

/* loaded from: classes4.dex */
public final class r4 implements m4, k8.a, p4.a, e8.a, v4.a {

    /* renamed from: a, reason: collision with root package name */
    public final z3 f4110a;
    public final x0 b;
    public final b c;
    public final k8 d;
    public final c e;
    public final g8 f;
    public final Handler g;
    public boolean i;
    public k4 j;
    public f k;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public final Runnable h = new Runnable() { // from class: com.my.target.r4$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.q();
        }
    };
    public a l = a.DISABLED;

    public enum a {
        DISABLED,
        RULED_BY_POST,
        RULED_BY_VIDEO
    }

    public interface b extends m4.a {
        void a(Context context);
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final r4 f4112a;

        public c(r4 r4Var) {
            this.f4112a = r4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4112a.p()) {
                this.f4112a.r();
            } else {
                this.f4112a.t();
            }
        }
    }

    public r4(c8 c8Var, z3 z3Var, b bVar) {
        this.f4110a = z3Var;
        x0 clickArea = z3Var.getClickArea();
        this.b = clickArea;
        this.c = bVar;
        this.g = c8Var.d();
        g8 g8VarE = c8Var.e();
        this.f = g8VarE;
        g8VarE.setColor(z3Var.getPromoStyleSettings().h());
        e8 e8VarA = c8Var.a(this);
        e8VarA.setBanner(z3Var);
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        List<r3> interstitialAdCards = z3Var.getInterstitialAdCards();
        if (!interstitialAdCards.isEmpty()) {
            y7 y7VarC = c8Var.c();
            c8Var.a(y7VarC, interstitialAdCards, this);
            this.d = c8Var.a(z3Var, e8VarA.a(), g8VarE.a(), y7VarC, this);
        } else if (videoBanner != null) {
            this.i = clickArea.n || clickArea.m;
            x xVarB = c8Var.b();
            k8 k8VarA = c8Var.a(z3Var, e8VarA.a(), g8VarE.a(), xVarB, this);
            this.d = k8VarA;
            xVarB.a(videoBanner.getWidth(), videoBanner.getHeight());
            this.j = c8Var.a(videoBanner, xVarB, this);
            g8VarE.setMaxTime(videoBanner.getDuration());
            ImageData preview = videoBanner.getPreview();
            k8VarA.setBackgroundImage(preview == null ? z3Var.getImage() : preview);
        } else {
            k8 k8VarA2 = c8Var.a(z3Var, e8VarA.a(), g8VarE.a(), null, this);
            this.d = k8VarA2;
            k8VarA2.e();
            k8VarA2.setBackgroundImage(z3Var.getImage());
        }
        this.d.setBanner(z3Var);
        this.e = new c(this);
        a(z3Var);
        bVar.a(z3Var, this.d.a());
        a(z3Var.getAdChoices());
    }

    public static r4 a(c8 c8Var, z3 z3Var, b bVar) {
        return new r4(c8Var, z3Var, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        o();
    }

    @Override // com.my.target.m4
    public void a() {
        if (this.l != a.DISABLED && this.m > 0) {
            t();
        }
        u();
    }

    @Override // com.my.target.p4.a
    public void a(float f, float f2) {
        if (this.l == a.RULED_BY_VIDEO) {
            this.m = (long) (this.n - (1000.0f * f));
        }
        this.f.setTimeChanged(f);
    }

    @Override // com.my.target.k8.a, com.my.target.e8.a, com.my.target.v4.a
    public void a(com.my.target.b bVar) {
        if (bVar != null) {
            this.c.a(bVar, null, i().getContext());
        } else {
            this.c.a(this.f4110a, null, i().getContext());
        }
    }

    public final void a(com.my.target.c cVar) {
        List<c.a> listA;
        if (cVar == null || (listA = cVar.a()) == null) {
            return;
        }
        f fVarA = f.a(listA, new h1());
        this.k = fVarA;
        fVarA.a(new d.a() { // from class: com.my.target.r4$$ExternalSyntheticLambda0
            @Override // com.my.target.d.a
            public final void a(Context context) {
                this.f$0.a(context);
            }
        });
    }

    public final void a(z3 z3Var) {
        a aVar;
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        if (videoBanner != null && videoBanner.isAutoPlay()) {
            if (videoBanner.isAllowClose()) {
                long allowCloseDelay = (long) (videoBanner.getAllowCloseDelay() * 1000.0f);
                this.n = allowCloseDelay;
                this.m = allowCloseDelay;
                if (allowCloseDelay > 0) {
                    aVar = a.RULED_BY_VIDEO;
                    this.l = aVar;
                    t();
                }
                r();
                return;
            }
            this.d.d();
            return;
        }
        if (!z3Var.isAllowClose()) {
            this.l = a.DISABLED;
            this.d.d();
            return;
        }
        long allowCloseDelay2 = (long) (z3Var.getAllowCloseDelay() * 1000.0f);
        this.n = allowCloseDelay2;
        this.m = allowCloseDelay2;
        if (allowCloseDelay2 <= 0) {
            ba.a("InterstitialPromoPresenterS2: Banner is allowed to close");
            r();
            return;
        }
        ba.a("InterstitialPromoPresenterS2: Banner will be allowed to close in " + this.m + " millis");
        aVar = a.RULED_BY_POST;
        this.l = aVar;
        t();
    }

    @Override // com.my.target.k8.a
    public void a(boolean z) {
        j8 promoStyleSettings = this.f4110a.getPromoStyleSettings();
        int iB = promoStyleSettings.b();
        int iArgb = Color.argb((int) (promoStyleSettings.c() * 255.0f), Color.red(iB), Color.green(iB), Color.blue(iB));
        k8 k8Var = this.d;
        if (z) {
            iB = iArgb;
        }
        k8Var.setPanelColor(iB);
    }

    @Override // com.my.target.p4.a
    public void b() {
        this.d.b(false);
        this.d.a(true);
        this.d.e();
        this.d.c(false);
        this.d.g();
        this.f.setVisible(false);
        r();
    }

    @Override // com.my.target.k8.a
    public void b(int i) {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.k();
        }
        u();
    }

    @Override // com.my.target.v4.a
    public void b(com.my.target.b bVar) {
        w9.a(bVar.getStatHolder().b("render"), this.d.a().getContext());
    }

    @Override // com.my.target.k8.a
    public void c() {
        com.my.target.c adChoices = this.f4110a.getAdChoices();
        if (adChoices == null) {
            return;
        }
        u();
        f fVar = this.k;
        if (fVar == null || !fVar.b()) {
            Context context = this.d.a().getContext();
            f fVar2 = this.k;
            if (fVar2 == null) {
                j3.a(adChoices.b(), context);
            } else {
                fVar2.a(context);
            }
        }
    }

    @Override // com.my.target.v4.a
    public void c(com.my.target.b bVar) {
        Context context = this.d.a().getContext();
        String strD = ca.d(context);
        if (strD != null) {
            w9.a(bVar.getStatHolder().a(strD), context);
        }
        w9.a(bVar.getStatHolder().b("playbackStarted"), context);
        w9.a(bVar.getStatHolder().b(com.json.i1.u), context);
    }

    @Override // com.my.target.p4.a
    public void d() {
        this.d.b(true);
        this.d.a(0, (String) null);
        this.d.c(false);
    }

    @Override // com.my.target.m4
    public void destroy() {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.destroy();
        }
        u();
    }

    @Override // com.my.target.p4.a
    public void e() {
        this.d.b(true);
        this.d.e();
        this.d.a(false);
        this.d.c(true);
        this.f.setVisible(true);
    }

    @Override // com.my.target.p4.a
    public void f() {
        this.d.b(false);
        this.d.a(false);
        this.d.e();
        this.d.c(false);
    }

    @Override // com.my.target.k8.a
    public void g() {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.b();
        }
    }

    @Override // com.my.target.m4
    public View getCloseButton() {
        return this.d.getCloseButton();
    }

    @Override // com.my.target.k8.a
    public void h() {
        if (this.i) {
            a((com.my.target.b) this.f4110a);
        } else if (this.o) {
            q();
        }
    }

    @Override // com.my.target.m4
    public View i() {
        return this.d.a();
    }

    @Override // com.my.target.p4.a
    public void j() {
        this.d.b(false);
        this.d.a(false);
        this.d.e();
        this.d.c(false);
        this.f.setVisible(true);
    }

    @Override // com.my.target.k8.a
    public void k() {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.g();
        }
        u();
        this.c.a();
    }

    @Override // com.my.target.k8.a
    public void l() {
        u();
        String adIconClickLink = this.f4110a.getAdIconClickLink();
        if (adIconClickLink == null) {
            return;
        }
        j3.a(adIconClickLink, this.d.a().getContext());
    }

    @Override // com.my.target.k8.a
    public void m() {
        if (this.i) {
            a((com.my.target.b) this.f4110a);
            return;
        }
        if (this.p) {
            if (this.b.d) {
                a((com.my.target.b) null);
            }
        } else {
            this.d.b(true);
            this.d.a(1, (String) null);
            this.d.c(false);
            u();
            this.g.postDelayed(this.h, 4000L);
            this.o = true;
        }
    }

    @Override // com.my.target.p4.a
    public void n() {
        this.d.b(true);
        this.d.a(0, (String) null);
        this.d.c(false);
        this.f.setVisible(false);
    }

    public void o() {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.destroy();
        }
        u();
        this.c.a(this.f4110a, i().getContext());
    }

    @Override // com.my.target.p4.a
    public void onVideoCompleted() {
        b5<VideoData> videoBanner = this.f4110a.getVideoBanner();
        if (videoBanner != null) {
            if (videoBanner.isAllowReplay()) {
                this.d.a(2, TextUtils.isEmpty(videoBanner.getReplayActionText()) ? null : videoBanner.getReplayActionText());
                this.d.b(true);
            } else {
                this.p = true;
            }
        }
        this.d.a(true);
        this.d.c(false);
        this.f.setVisible(false);
        this.f.setTimeChanged(0.0f);
        this.c.a(this.d.a().getContext());
        r();
    }

    @Override // com.my.target.p4.a
    public void onVolumeChanged(float f) {
        this.d.setSoundState(f != 0.0f);
    }

    public boolean p() {
        a aVar = this.l;
        if (aVar == a.DISABLED) {
            return true;
        }
        if (aVar == a.RULED_BY_POST) {
            this.m -= 200;
        }
        return this.m <= 0;
    }

    @Override // com.my.target.m4
    public void pause() {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.a();
        }
        this.g.removeCallbacks(this.e);
        u();
    }

    public final void q() {
        if (this.o) {
            u();
            this.d.b(false);
            this.d.e();
            this.o = false;
        }
    }

    public void r() {
        this.d.b();
        this.g.removeCallbacks(this.e);
        this.l = a.DISABLED;
    }

    public void s() {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.c();
        }
    }

    @Override // com.my.target.m4
    public void stop() {
        k4 k4Var = this.j;
        if (k4Var != null) {
            k4Var.a();
        }
        u();
    }

    public void t() {
        this.g.removeCallbacks(this.e);
        this.g.postDelayed(this.e, 200L);
        float f = this.n;
        long j = this.m;
        this.d.a((int) ((j / 1000) + 1), (f - j) / f);
    }

    public final void u() {
        this.o = false;
        this.g.removeCallbacks(this.h);
    }
}
