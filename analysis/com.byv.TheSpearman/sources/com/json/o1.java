package com.json;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceBannerLayout;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.json.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.l;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.model.Placement;
import com.json.y1;
import java.util.Map;

/* loaded from: classes4.dex */
public class o1 extends y1<v> implements BannerAdListener, z {
    public static final String t = "bannerLayout";
    public static final String u = "bannerSize";
    private final IronSourceBannerLayout r;
    private final boolean s;

    class a extends kc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2037a;
        final /* synthetic */ FrameLayout.LayoutParams b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f2037a = view;
            this.b = layoutParams;
        }

        @Override // com.json.kc
        public void a() {
            o1.this.a(this.f2037a, this.b);
        }
    }

    class b extends kc {
        b() {
        }

        @Override // com.json.kc
        public void a() {
            o1.this.I();
        }
    }

    public o1(qb qbVar, u uVar, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, IronSourceBannerLayout ironSourceBannerLayout, Placement placement, boolean z, i1 i1Var, v vVar) {
        super(qbVar, uVar, baseAdAdapter, new m0(uVar.g(), uVar.g().getBannerSettings(), IronSource.AD_UNIT.BANNER), i1Var, vVar);
        this.r = ironSourceBannerLayout;
        this.g = placement;
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (x()) {
            super.onAdOpened();
        } else {
            if (this.e == y1.h.FAILED) {
                return;
            }
            ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", k(), this.e));
            if (this.d != null) {
                this.d.k.l(String.format("unexpected onAdOpened, state - %s", this.e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!x() || (listener = this.b) == 0) {
            return;
        }
        ((v) listener).a(this, view, layoutParams);
    }

    @Override // com.json.y1
    protected void F() {
        Object obj = this.c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this.r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.json.y1
    protected boolean N() {
        return false;
    }

    public void O() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(y1.h.NONE);
        Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.k.c(str);
            }
        }
        a0 a0Var2 = this.d;
        if (a0Var2 != null) {
            a0Var2.g.a(r().intValue());
        }
    }

    @Override // com.json.y1
    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.json.y1, com.json.z
    public Map<String, Object> a(y yVar) {
        Map<String, Object> mapA = super.a(yVar);
        IronSourceBannerLayout ironSourceBannerLayout = this.r;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            l.a(mapA, this.r.getSize());
        }
        if (this.g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }

    @Override // com.json.y1
    protected Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> mapA = super.a(map);
        u uVar = this.f2445a;
        if (uVar != null && this.r != null && TextUtils.isEmpty(uVar.g().getCustomNetwork())) {
            mapA.put("bannerLayout", this.r);
        }
        return mapA;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a0 a0Var;
        Placement placement = this.g;
        if (placement != null && (a0Var = this.d) != null) {
            a0Var.j.d(placement.getPlacementName());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((v) listener).d(this);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.BannerAdListener, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (t().c()) {
            t().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.json.y1, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (t().c()) {
            t().a(new b());
        } else {
            I();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a0 a0Var;
        Placement placement = this.g;
        if (placement != null && (a0Var = this.d) != null) {
            a0Var.j.b(placement.getPlacementName());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((v) listener).c(this);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a0 a0Var;
        Placement placement = this.g;
        if (placement != null && (a0Var = this.d) != null) {
            a0Var.j.f(placement.getPlacementName());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((v) listener).a(this);
        }
    }

    @Override // com.json.y1
    protected boolean u() {
        return this.s;
    }
}
