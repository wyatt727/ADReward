package com.json;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.AdapterUtils;
import com.json.mediationsdk.AuctionRequestParams;
import com.json.mediationsdk.ISBannerSize;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceBannerLayout;
import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.l;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.n;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.b;
import com.json.v1;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class m1 extends v1<o1, AdapterAdViewListener> implements v {
    private boolean I;
    private IronSourceBannerLayout J;

    public m1(List<NetworkSettings> list, p1 p1Var, String str, m9 m9Var, IronSourceSegment ironSourceSegment, boolean z) {
        super(new BannerAdManagerData(str, list, p1Var), m9Var, ironSourceSegment, z);
        this.I = false;
    }

    private ISBannerSize I() {
        IronSourceBannerLayout ironSourceBannerLayout = this.J;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.J.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? l.a() : ISBannerSize.BANNER : this.J.getSize();
    }

    private void a(View view, FrameLayout.LayoutParams layoutParams) {
        l.a(this.J, view, layoutParams);
    }

    boolean J() {
        IronLog ironLog;
        String str;
        if (!this.J.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.J.hasWindowFocus()) {
                boolean globalVisibleRect = this.J.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    public void K() {
        IronSourceBannerLayout ironSourceBannerLayout = this.J;
        if (ironSourceBannerLayout != null) {
            a(ironSourceBannerLayout);
        }
    }

    @Override // com.json.v1
    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.getAdUnit(), str, this.J);
    }

    @Override // com.json.v1
    protected /* bridge */ /* synthetic */ y1 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str, i1 i1Var) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdViewListener>) baseAdAdapter, i, str, i1Var);
    }

    @Override // com.json.v1, com.json.z
    public Map<String, Object> a(y yVar) {
        Map<String, Object> mapA = super.a(yVar);
        if (b(this.J)) {
            l.a(mapA, this.J.getSize());
        }
        if (this.i != null) {
            mapA.put("placement", k());
        }
        return mapA;
    }

    @Override // com.json.v1, com.json.y9
    public void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        try {
            if (this.J == null) {
                ironLog.error("mIronSourceBanner is null");
                this.s.g.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            boolean z = false;
            if (!J()) {
                ironLog.verbose("banner is not visible, reload skipped");
                this.s.g.b(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
                this.q.i();
                return;
            }
            synchronized (this.x) {
                if (a(v1.f.SHOWING, v1.f.READY_TO_LOAD)) {
                    ironLog.verbose("start reload");
                    this.I = true;
                    z = true;
                } else {
                    ironLog.error("wrong state = " + this.p);
                }
            }
            if (z) {
                a(this.J, this.i);
            }
        } catch (Throwable th) {
            this.s.k.b(th.getMessage());
        }
    }

    @Override // com.json.v1
    protected void a(int i, String str, boolean z) {
        if (!r()) {
            super.a(i, str, z);
            return;
        }
        if (!z) {
            this.s.g.b(e4.a(this.n), i, str);
            n.a().b(this.o.getAdUnit(), new IronSourceError(i, str), true);
        }
        if (this.I) {
            a(v1.f.SHOWING);
        }
        this.q.i();
    }

    @Override // com.json.v1
    protected void a(Context context, AuctionRequestParams auctionRequestParams, y0 y0Var) {
        if (this.c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            auctionRequestParams.a(I());
            this.c.a(context, auctionRequestParams, y0Var);
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        try {
            if (!b(ironSourceBannerLayout)) {
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                String str = String.format("can't destroy banner - %s", objArr);
                IronLog.API.error("destroy banner failed - errorMessage = " + str);
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            this.q.a();
            o1 o1Var = (o1) this.f2337a.d();
            if (o1Var != null) {
                this.s.g.a(o1Var.r() != null ? o1Var.r().intValue() : this.C.a(this.o.getAdUnit()));
                o1Var.O();
                this.f2337a.a(null);
            }
            l.a(ironSourceBannerLayout);
            this.J = null;
            this.i = null;
            this.I = false;
            a(v1.f.READY_TO_LOAD);
        } catch (Throwable th) {
            String str2 = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.p;
            IronLog.INTERNAL.error(b(str2));
            a0 a0Var = this.s;
            if (a0Var != null) {
                a0Var.k.c(str2);
            }
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, Placement placement) {
        String str;
        IronLog.INTERNAL.verbose("placement = " + placement);
        int iB = 510;
        if (!b(ironSourceBannerLayout)) {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        } else if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = placement == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
            iB = x.b(this.o.getAdUnit());
        } else if (b.b(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.o.getAdUnit())) {
            str = String.format("placement %s is capped", placement.getPlacementName());
            iB = x.f(this.o.getAdUnit());
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.API.error(b(str));
            a(iB, str, false);
        } else {
            l.b(ironSourceBannerLayout);
            this.J = ironSourceBannerLayout;
            this.i = placement;
            w();
        }
    }

    @Override // com.json.g0
    public void a(y1<?> y1Var) {
        IronLog.INTERNAL.verbose(b(y1Var.k()));
        this.t.f(y1Var.f());
    }

    @Override // com.json.v
    public void a(y1<?> y1Var, View view, FrameLayout.LayoutParams layoutParams) throws NumberFormatException {
        IronLog.INTERNAL.verbose("mState = " + this.p);
        super.e(y1Var);
        if (a(v1.f.READY_TO_SHOW, v1.f.SHOWING)) {
            this.f2337a.a(y1Var);
            a(view, layoutParams);
            this.q.i();
            this.t.a(y1Var.f(), r());
        }
    }

    protected o1 b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i, String str, i1 i1Var) {
        return new o1(this, new u(IronSource.AD_UNIT.BANNER, this.o.getUserId(), i, this.g, str, this.e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, this.J, this.i, r(), i1Var, this);
    }

    @Override // com.json.v1
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    boolean b(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    @Override // com.json.g0
    public void c(y1<?> y1Var) {
        IronLog.INTERNAL.verbose(b(y1Var.k()));
        this.t.e(y1Var.f());
    }

    @Override // com.json.g0
    public void d(y1<?> y1Var) {
        IronLog.INTERNAL.verbose(b(y1Var.k()));
        this.t.b(y1Var.f());
    }

    @Override // com.json.v1
    protected c0 e() {
        return new q1();
    }

    @Override // com.json.v1
    protected void g(y1<?> y1Var) {
    }

    @Override // com.json.v1
    protected void h(y1<?> y1Var) {
    }

    @Override // com.json.v1
    protected String i() {
        return "BN";
    }

    @Override // com.json.v1
    protected String l() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.json.v1
    protected boolean r() {
        return this.I;
    }
}
