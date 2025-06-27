package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.my.target.c;
import com.my.target.common.models.VideoData;
import com.my.target.m4;
import com.my.target.u4;
import java.util.List;

/* loaded from: classes4.dex */
public final class q4 implements m4 {

    /* renamed from: a, reason: collision with root package name */
    public final z3 f4099a;
    public final e b;
    public final u4 c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final c e;
    public f f;
    public t4 g;
    public w0 h;
    public f4 i;
    public j4 j;
    public long k;
    public long l;

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final q4 f4100a;

        public a(q4 q4Var) {
            this.f4100a = q4Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j4 j4VarD = this.f4100a.d();
            if (j4VarD != null) {
                j4VarD.d();
            }
            this.f4100a.e().a();
        }
    }

    public interface b {
        void b();
    }

    public interface c extends m4.a {
        void a(Context context);
    }

    public static class d implements u4.a {

        /* renamed from: a, reason: collision with root package name */
        public final q4 f4101a;

        public d(q4 q4Var) {
            this.f4101a = q4Var;
        }

        public final void a() {
            Context context = this.f4101a.i().getContext();
            com.my.target.c adChoices = this.f4101a.c().getAdChoices();
            if (adChoices == null) {
                return;
            }
            f fVar = this.f4101a.f;
            if (fVar == null || !fVar.b()) {
                if (fVar == null) {
                    j3.a(adChoices.b(), context);
                } else {
                    fVar.a(context);
                }
            }
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            j4 j4VarD = this.f4101a.d();
            if (j4VarD != null) {
                j4VarD.a();
            }
            this.f4101a.e().a(this.f4101a.c(), context);
        }

        @Override // com.my.target.u4.a
        public void c() {
            a();
        }

        @Override // com.my.target.u4.a
        public void d() {
            this.f4101a.e().a(this.f4101a.c(), null, this.f4101a.i().getContext());
        }
    }

    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final u4 f4102a;

        public e(u4 u4Var) {
            this.f4102a = u4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ba.a("InterstitialPromoPresenter$ShowCloseButtonRunnable: Banner became just closeable");
            this.f4102a.d();
        }
    }

    public q4(b8 b8Var, z3 z3Var, c cVar, Context context) {
        t4 t4Var;
        w0 w0Var;
        this.f4099a = z3Var;
        this.e = cVar;
        d dVar = new d(this);
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        if (z3Var.getInterstitialAdCards().isEmpty()) {
            t4 t4VarB = (videoBanner == null || z3Var.getStyle() != 1) ? b8Var.b() : b8Var.c();
            this.g = t4VarB;
            t4Var = t4VarB;
        } else {
            w0 w0VarA = b8Var.a();
            this.h = w0VarA;
            t4Var = w0VarA;
        }
        this.c = t4Var;
        this.b = new e(this.c);
        this.c.setInterstitialPromoViewListener(dVar);
        this.c.getCloseButton().setOnClickListener(new a(this));
        t4 t4Var2 = this.g;
        if (t4Var2 != null && videoBanner != null) {
            j4 j4VarA = j4.a(b8Var, videoBanner, t4Var2, cVar, new b() { // from class: com.my.target.q4$$ExternalSyntheticLambda0
                @Override // com.my.target.q4.b
                public final void b() {
                    this.f$0.b();
                }
            });
            this.j = j4VarA;
            j4VarA.a(videoBanner, context);
            if (videoBanner.isAutoPlay()) {
                this.l = 0L;
            }
        }
        this.c.setBanner(z3Var);
        this.c.setClickArea(z3Var.getClickArea());
        if (videoBanner == null || !videoBanner.isAutoPlay()) {
            long allowCloseDelay = (long) (z3Var.getAllowCloseDelay() * 1000.0f);
            this.k = allowCloseDelay;
            if (allowCloseDelay > 0) {
                ba.a("InterstitialPromoPresenter: Banner will be allowed to close in " + this.k + " millis");
                a(this.k);
            } else {
                ba.a("InterstitialPromoPresenter: Banner is allowed to close");
                this.c.d();
            }
        }
        List<r3> interstitialAdCards = z3Var.getInterstitialAdCards();
        if (!interstitialAdCards.isEmpty() && (w0Var = this.h) != null) {
            this.i = f4.a(interstitialAdCards, w0Var);
        }
        f4 f4Var = this.i;
        if (f4Var != null) {
            f4Var.a(cVar);
        }
        com.my.target.c adChoices = z3Var.getAdChoices();
        if (adChoices != null) {
            a(dVar, adChoices);
        }
        cVar.a(z3Var, this.c.getView());
    }

    public static q4 a(b8 b8Var, z3 z3Var, c cVar, Context context) {
        return new q4(b8Var, z3Var, cVar, context);
    }

    @Override // com.my.target.m4
    public void a() {
        if (this.j == null) {
            long j = this.k;
            if (j > 0) {
                a(j);
            }
        }
    }

    public final void a(long j) {
        this.d.removeCallbacks(this.b);
        this.l = System.currentTimeMillis();
        this.d.postDelayed(this.b, j);
    }

    public final void a(u4.a aVar, com.my.target.c cVar) {
        List<c.a> listA = cVar.a();
        if (listA != null) {
            f fVarA = f.a(listA, new h1());
            this.f = fVarA;
            fVarA.a(aVar);
        }
    }

    public void b() {
        j4 j4Var = this.j;
        if (j4Var != null) {
            j4Var.a(this.f4099a);
            this.j.a();
            this.j = null;
        }
    }

    public z3 c() {
        return this.f4099a;
    }

    public j4 d() {
        return this.j;
    }

    @Override // com.my.target.m4
    public void destroy() {
        this.d.removeCallbacks(this.b);
        j4 j4Var = this.j;
        if (j4Var != null) {
            j4Var.a();
        }
    }

    public c e() {
        return this.e;
    }

    @Override // com.my.target.m4
    public View getCloseButton() {
        return this.c.getCloseButton();
    }

    @Override // com.my.target.m4
    public View i() {
        return this.c.getView();
    }

    @Override // com.my.target.m4
    public void pause() {
        j4 j4Var = this.j;
        if (j4Var != null) {
            j4Var.e();
        }
        this.d.removeCallbacks(this.b);
        if (this.l > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.l;
            if (jCurrentTimeMillis > 0) {
                long j = this.k;
                if (jCurrentTimeMillis < j) {
                    this.k = j - jCurrentTimeMillis;
                    return;
                }
            }
            this.k = 0L;
        }
    }

    @Override // com.my.target.m4
    public void stop() {
        j4 j4Var = this.j;
        if (j4Var != null) {
            j4Var.g();
        }
    }
}
