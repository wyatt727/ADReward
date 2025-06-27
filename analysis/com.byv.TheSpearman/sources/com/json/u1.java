package com.json;

import android.app.Activity;
import com.json.b0;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.Placement;
import com.json.y1;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class u1<Listener extends b0> extends y1<Listener> implements AdapterAdInteractionListener {

    class a extends kc {
        a() {
        }

        @Override // com.json.kc
        public void a() {
            u1.this.O();
        }
    }

    class b extends kc {
        b() {
        }

        @Override // com.json.kc
        public void a() {
            u1.this.R();
        }
    }

    class c extends kc {
        c() {
        }

        @Override // com.json.kc
        public void a() {
            u1.this.P();
        }
    }

    class d extends kc {
        d() {
        }

        @Override // com.json.kc
        public void a() {
            u1.this.S();
        }
    }

    class e extends kc {
        e() {
        }

        @Override // com.json.kc
        public void a() {
            u1.this.Q();
        }
    }

    class f extends kc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2321a;
        final /* synthetic */ String b;

        f(int i, String str) {
            this.f2321a = i;
            this.b = str;
        }

        @Override // com.json.kc
        public void a() {
            u1.this.b(this.f2321a, this.b);
        }
    }

    public u1(qb qbVar, u uVar, BaseAdAdapter<?, ?> baseAdAdapter, m0 m0Var, i1 i1Var, Listener listener) {
        super(qbVar, uVar, baseAdAdapter, m0Var, i1Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.q) {
            if (this.e != y1.h.SHOWING) {
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.e);
                a0 a0Var = this.d;
                if (a0Var != null) {
                    a0Var.k.g("unexpected ad closed - state = " + this.e);
                }
                return;
            }
            a(y1.h.NONE);
            if (this.d != null) {
                String string = "";
                if (this.f2445a.a() == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    String strD = ((b0) this.b).d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("otherInstanceAvailable = ");
                    if (strD.length() > 0) {
                        str = "true|" + strD;
                    } else {
                        str = "false";
                    }
                    sb.append(str);
                    string = sb.toString();
                }
                this.d.j.a(j(), string);
            }
            ((b0) this.b).a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        IronLog.INTERNAL.verbose(d());
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.c(j());
        }
        ((b0) this.b).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.j(j());
        }
        ((b0) this.b).b((u1<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        IronLog.INTERNAL.verbose(d());
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.g(j());
        }
        ((b0) this.b).d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.h(j());
        }
    }

    static String a(y1.h hVar, int i, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        y1.h hVar = this.e;
        if (hVar == y1.h.SHOWING) {
            a(y1.h.FAILED);
            a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.j.a(j(), i, str, "");
            }
            ((b0) this.b).a(new IronSourceError(i, str), (u1<?>) this);
            return;
        }
        String strA = a(hVar, i, str);
        ironLog.error(a(strA));
        a0 a0Var2 = this.d;
        if (a0Var2 != null) {
            a0Var2.k.o(strA);
        }
    }

    @Override // com.json.y1
    public boolean A() {
        Object obj;
        if (this.k == null || !x()) {
            return false;
        }
        try {
            obj = this.c;
        } catch (Throwable th) {
            String str = "isReadyToShow - exception = " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.k.c(str);
            }
        }
        if (obj instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.k);
        }
        IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        a0 a0Var2 = this.d;
        if (a0Var2 != null) {
            a0Var2.k.c("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    public void a(Activity activity, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + placement.getPlacementName()));
        try {
            this.g = placement;
            a(y1.h.SHOWING);
            this.d.j.a(activity, j());
            Object obj = this.c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.k, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                a0 a0Var = this.d;
                if (a0Var != null) {
                    a0Var.k.c("showAd - adapter not instance of AdapterAdFullScreenInterface");
                }
            }
        } catch (Throwable th) {
            a(y1.h.FAILED);
            String str = "showAd - exception = " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            a0 a0Var2 = this.d;
            if (a0Var2 != null) {
                a0Var2.k.c(str);
            }
            onAdShowFailed(x.h(this.f2445a.a()), str);
        }
    }

    public void b(boolean z) {
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.a(z);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (t().c()) {
            t().a(new a());
        } else {
            O();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (t().c()) {
            t().a(new c());
        } else {
            P();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i, String str) {
        if (t().c()) {
            t().a(new f(i, str));
        } else {
            b(i, str);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (t().c()) {
            t().a(new e());
        } else {
            Q();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (t().c()) {
            t().a(new b());
        } else {
            R();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (t().c()) {
            t().a(new d());
        } else {
            S();
        }
    }
}
