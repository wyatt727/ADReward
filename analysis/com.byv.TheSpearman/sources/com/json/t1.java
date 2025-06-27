package com.json;

import android.app.Activity;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.json.mediationsdk.h;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.mediationsdk.utils.b;
import com.json.u1;
import com.json.v1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class t1<Smash extends u1<?>, Listener extends AdapterAdInteractionListener> extends v1<Smash, Listener> implements b0 {

    class a extends kc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f2286a;
        final /* synthetic */ Placement b;

        a(Activity activity, Placement placement) {
            this.f2286a = activity;
            this.b = placement;
        }

        @Override // com.json.kc
        public void a() {
            t1.this.b(this.f2286a, this.b);
        }
    }

    protected t1(p pVar, m9 m9Var, IronSourceSegment ironSourceSegment, boolean z) {
        super(pVar, m9Var, ironSourceSegment, z);
    }

    private String a(List<Smash> list) {
        StringBuilder sb = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb.append(smash.c());
                sb.append(":");
                sb.append(smash.e());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private void a(Activity activity, u1<?> u1Var, Placement placement) {
        if (this.o.getLoadingData().e()) {
            this.r.a();
        }
        u1Var.a(activity, placement);
    }

    private void a(IronSourceError ironSourceError, u1<?> u1Var, String str) {
        this.s.j.a(k(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.q.e();
        this.t.a(ironSourceError, u1Var != null ? u1Var.f() : null);
        if (this.o.getLoadingData().e()) {
            b(false);
        }
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (u1<?>) null, str);
    }

    private void a(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, Placement placement) {
        u1 u1Var;
        IronSourceError ironSourceError;
        String strA;
        IronLog.INTERNAL.verbose(b("state = " + this.p));
        synchronized (this.x) {
            this.i = placement;
            this.s.j.a(activity, k());
            v1.f fVar = this.p;
            v1.f fVar2 = v1.f.SHOWING;
            u1Var = null;
            if (fVar == fVar2) {
                ironSourceError = new IronSourceError(x.g(this.o.getAdUnit()), "can't show ad while an ad is already showing");
            } else if (fVar != v1.f.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(509, "show called while no ads are available");
            } else if (placement == null) {
                ironSourceError = new IronSourceError(x.b(this.o.getAdUnit()), "empty default placement");
            } else if (b.b(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.o.getAdUnit())) {
                ironSourceError = new IronSourceError(x.f(this.o.getAdUnit()), "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(b(ironSourceError.getErrorMessage()));
                strA = "";
            } else {
                List listB = this.f2337a.b();
                me meVar = new me(this.o);
                u1Var = (u1) meVar.c(listB);
                a((t1<Smash, Listener>) u1Var, (List<t1<Smash, Listener>>) meVar.b(listB));
                if (u1Var != null) {
                    a(fVar2);
                    i(u1Var);
                } else {
                    ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.o.getAdUnit().toString());
                    strA = a(listB);
                }
            }
            a(ironSourceError, strA);
        }
        if (u1Var != null) {
            a(activity, (u1<?>) u1Var, this.i);
        }
    }

    public void a(Activity activity, Placement placement) {
        if (c()) {
            a(new a(activity, placement));
        } else {
            b(activity, placement);
        }
    }

    @Override // com.json.b0
    public void a(IronSourceError ironSourceError, u1<?> u1Var) {
        IronLog.INTERNAL.verbose(b(u1Var.k() + " - error = " + ironSourceError));
        this.b.put(u1Var.c(), h.a.ISAuctionPerformanceFailedToShow);
        a(v1.f.READY_TO_LOAD);
        a(ironSourceError, u1Var, "");
    }

    @Override // com.json.b0
    public void a(u1<?> u1Var) {
        IronLog.INTERNAL.verbose(b(u1Var.k()));
        if (this.p == v1.f.SHOWING) {
            a(v1.f.READY_TO_LOAD);
        }
        this.q.d();
        this.t.a(u1Var.f());
    }

    @Override // com.json.b0
    public void b(u1<?> u1Var) {
        IronLog.INTERNAL.verbose(b(u1Var.k()));
        this.t.g(u1Var.f());
    }

    @Override // com.json.b0
    public void c(u1<?> u1Var) {
        IronLog.INTERNAL.verbose(b(u1Var.k()));
        this.t.a();
    }

    @Override // com.json.b0
    public String d() {
        StringBuilder sb = new StringBuilder();
        if (this.p == v1.f.READY_TO_SHOW) {
            for (u1 u1Var : this.f2337a.b()) {
                if (u1Var.x()) {
                    sb.append(u1Var.c());
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.json.b0
    public void d(u1<?> u1Var) {
        IronLog.INTERNAL.verbose(b(u1Var.k()));
        this.t.b();
    }

    @Override // com.json.v1
    public boolean q() {
        if (!t()) {
            return false;
        }
        if (this.j && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f2337a.b().iterator();
        while (it.hasNext()) {
            if (((u1) it.next()).A()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.json.v1
    protected boolean r() {
        return false;
    }
}
