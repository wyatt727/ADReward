package com.my.target;

import android.app.Activity;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.i2;
import com.my.target.l;
import com.my.target.o5;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final MyTargetView f4073a;
    public final j b;
    public final b c;
    public final c d;
    public final o5.a e;
    public i2 f;
    public boolean g;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public int l;

    public static class a implements i2.a {

        /* renamed from: a, reason: collision with root package name */
        public final n9 f4074a;

        public a(n9 n9Var) {
            this.f4074a = n9Var;
        }

        @Override // com.my.target.i2.a
        public void a() {
            this.f4074a.j();
        }

        @Override // com.my.target.i2.a
        public void a(z4 z4Var) {
            this.f4074a.a(z4Var);
        }

        @Override // com.my.target.i2.a
        public void b() {
            this.f4074a.h();
        }

        @Override // com.my.target.i2.a
        public void c() {
            this.f4074a.f();
        }

        @Override // com.my.target.i2.a
        public void d() {
            this.f4074a.g();
        }

        @Override // com.my.target.i2.a
        public void onClick() {
            this.f4074a.e();
        }

        @Override // com.my.target.i2.a
        public void onLoad() {
            this.f4074a.i();
        }

        @Override // com.my.target.i2.a
        public void onNoAd(IAdLoadingError iAdLoadingError) {
            this.f4074a.a(iAdLoadingError);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4075a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;

        public void a(boolean z) {
            this.d = z;
        }

        public boolean a() {
            return !this.b && this.f4075a && (this.g || !this.e);
        }

        public void b(boolean z) {
            this.f = z;
        }

        public boolean b() {
            return this.c && this.f4075a && (this.g || this.e) && !this.f && this.b;
        }

        public void c(boolean z) {
            this.g = z;
        }

        public boolean c() {
            return this.d && this.c && (this.g || this.e) && !this.f4075a;
        }

        public void d(boolean z) {
            this.e = z;
        }

        public boolean d() {
            return this.f4075a;
        }

        public void e(boolean z) {
            this.c = z;
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            this.f = false;
            this.c = false;
        }

        public void f(boolean z) {
            this.b = z;
        }

        public void g(boolean z) {
            this.f4075a = z;
            this.b = false;
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<n9> f4076a;

        public c(n9 n9Var) {
            this.f4076a = new WeakReference<>(n9Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            n9 n9Var = this.f4076a.get();
            if (n9Var != null) {
                n9Var.l();
            }
        }
    }

    public n9(MyTargetView myTargetView, j jVar, o5.a aVar) {
        b bVar = new b();
        this.c = bVar;
        this.g = true;
        this.i = -1;
        this.l = 0;
        this.f4073a = myTargetView;
        this.b = jVar;
        this.e = aVar;
        this.d = new c(this);
        if (myTargetView.getContext() instanceof Activity) {
            bVar.c(false);
        } else {
            ba.a("StandardAdMasterEngine: MyTargetView was created with non-activity focus, so system cannot automatically handle lifecycle");
            bVar.c(true);
        }
    }

    public static n9 a(MyTargetView myTargetView, j jVar, o5.a aVar) {
        return new n9(myTargetView, jVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(q9 q9Var, m mVar) {
        if (q9Var != null) {
            b(q9Var);
        } else {
            ba.a("StandardAdMasterEngine: No new ad");
            o();
        }
    }

    public void a() {
        if (this.c.d()) {
            q();
        }
        this.c.f();
        m();
    }

    public void a(MyTargetView.AdSize adSize) {
        i2 i2Var = this.f;
        if (i2Var != null) {
            i2Var.a(adSize);
        }
    }

    public void a(IAdLoadingError iAdLoadingError) {
        if (!this.g) {
            m();
            o();
            return;
        }
        this.c.e(false);
        MyTargetView.MyTargetViewListener listener = this.f4073a.getListener();
        if (listener != null) {
            listener.onNoAd(iAdLoadingError, this.f4073a);
        }
        this.g = false;
    }

    public final void a(q9 q9Var) {
        this.h = q9Var.d() && this.b.isRefreshAd() && !this.b.getFormat().equals("standard_300x250");
        j9 j9VarC = q9Var.c();
        if (j9VarC != null) {
            this.f = l9.a(this.f4073a, j9VarC, this.e);
            this.i = j9VarC.getTimeout() * 1000;
            return;
        }
        e5 e5VarB = q9Var.b();
        if (e5VarB == null) {
            MyTargetView.MyTargetViewListener listener = this.f4073a.getListener();
            if (listener != null) {
                listener.onNoAd(m.u, this.f4073a);
                return;
            }
            return;
        }
        this.f = n5.a(this.f4073a, e5VarB, this.b, this.e);
        if (this.h) {
            int iA = e5VarB.a() * 1000;
            this.i = iA;
            this.h = iA > 0;
        }
    }

    public void a(z4 z4Var) {
        if (z4Var != null) {
            z4Var.a(this.b.getSlotId()).b(this.f4073a.getContext());
        }
        this.l++;
        ba.b("WebView crashed " + this.l + " times");
        if (this.l <= 2) {
            ba.a("Try reload ad without notifying user");
            l();
            return;
        }
        ba.a("No more try to reload ad, notify user...");
        d();
        MyTargetView.MyTargetViewRenderCrashListener renderCrashListener = this.f4073a.getRenderCrashListener();
        if (renderCrashListener != null) {
            renderCrashListener.onViewRenderCrash(this.f4073a);
        }
    }

    public void a(boolean z) {
        this.c.a(z);
        this.c.d(this.f4073a.hasWindowFocus());
        if (this.c.c()) {
            p();
        } else {
            if (z || !this.c.d()) {
                return;
            }
            q();
        }
    }

    public String b() {
        i2 i2Var = this.f;
        if (i2Var != null) {
            return i2Var.b();
        }
        return null;
    }

    public void b(q9 q9Var) {
        if (this.c.d()) {
            q();
        }
        m();
        a(q9Var);
        i2 i2Var = this.f;
        if (i2Var == null) {
            return;
        }
        i2Var.a(new a(this));
        this.j = System.currentTimeMillis() + this.i;
        this.k = 0L;
        if (this.h && this.c.e()) {
            this.k = this.i;
        }
        this.f.prepare();
    }

    public void b(boolean z) {
        this.c.d(z);
        if (this.c.c()) {
            p();
        } else if (this.c.b()) {
            n();
        } else if (this.c.a()) {
            k();
        }
    }

    public float c() {
        i2 i2Var = this.f;
        if (i2Var != null) {
            return i2Var.c();
        }
        return 0.0f;
    }

    public final void d() {
        r();
        m();
    }

    public final void e() {
        MyTargetView.MyTargetViewListener listener = this.f4073a.getListener();
        if (listener != null) {
            listener.onClick(this.f4073a);
        }
    }

    public void f() {
        this.c.b(false);
        if (this.c.b()) {
            n();
        }
    }

    public void g() {
        m();
    }

    public void h() {
        if (this.c.a()) {
            k();
        }
        this.c.b(true);
    }

    public void i() {
        if (this.g) {
            this.c.e(true);
            MyTargetView.MyTargetViewListener listener = this.f4073a.getListener();
            if (listener != null) {
                listener.onLoad(this.f4073a);
            }
            this.g = false;
        }
        if (this.c.c()) {
            p();
        }
    }

    public final void j() {
        MyTargetView.MyTargetViewListener listener = this.f4073a.getListener();
        if (listener != null) {
            listener.onShow(this.f4073a);
        }
    }

    public void k() {
        r();
        if (this.h) {
            this.k = this.j - System.currentTimeMillis();
        }
        i2 i2Var = this.f;
        if (i2Var != null) {
            i2Var.pause();
        }
        this.c.f(true);
    }

    public void l() {
        ba.a("StandardAdMasterEngine: Load new standard ad");
        m9.a(this.b, this.e).a(new l.b() { // from class: com.my.target.n9$$ExternalSyntheticLambda0
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.a((q9) qVar, mVar);
            }
        }).a(this.e.a(), this.f4073a.getContext());
    }

    public void m() {
        i2 i2Var = this.f;
        if (i2Var != null) {
            i2Var.destroy();
            this.f.a((i2.a) null);
            this.f = null;
        }
        this.f4073a.removeAllViews();
    }

    public void n() {
        if (this.k > 0 && this.h) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.k;
            this.j = jCurrentTimeMillis + j;
            this.f4073a.postDelayed(this.d, j);
            this.k = 0L;
        }
        i2 i2Var = this.f;
        if (i2Var != null) {
            i2Var.a();
        }
        this.c.f(false);
    }

    public void o() {
        if (!this.h || this.i <= 0) {
            return;
        }
        r();
        this.f4073a.postDelayed(this.d, this.i);
    }

    public void p() {
        int i = this.i;
        if (i > 0 && this.h) {
            this.f4073a.postDelayed(this.d, i);
        }
        i2 i2Var = this.f;
        if (i2Var != null) {
            i2Var.start();
        }
        this.c.g(true);
    }

    public void q() {
        this.c.g(false);
        r();
        i2 i2Var = this.f;
        if (i2Var != null) {
            i2Var.stop();
        }
    }

    public void r() {
        this.f4073a.removeCallbacks(this.d);
    }
}
