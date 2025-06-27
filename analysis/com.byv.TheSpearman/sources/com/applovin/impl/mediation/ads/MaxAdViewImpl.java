package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.br;
import com.applovin.impl.ce;
import com.applovin.impl.cr;
import com.applovin.impl.e0;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements d.a, cr.a, v.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f665a;
    private final MaxAdView b;
    private final String c;
    private final View d;
    private long e;
    private ce f;
    private String g;
    private String h;
    private final b i;
    private final d j;
    private final com.applovin.impl.sdk.d k;
    private final br l;
    private final cr m;
    private final Object n;
    private ce o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    private class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            bc.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.S().destroyAd(maxAd);
                return;
            }
            ce ceVar = (ce) maxAd;
            ceVar.g(MaxAdViewImpl.this.g);
            ceVar.f(MaxAdViewImpl.this.h);
            if (ceVar.x() == null) {
                MaxAdViewImpl.this.sdk.S().destroyAd(ceVar);
                onAdLoadFailed(ceVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (ceVar.p0()) {
                long jK0 = ceVar.k0();
                MaxAdViewImpl.this.sdk.L();
                if (t.a()) {
                    MaxAdViewImpl.this.sdk.L().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jK0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.k.a(jK0);
                if (MaxAdViewImpl.this.k.g() || MaxAdViewImpl.this.q) {
                    t tVar2 = MaxAdViewImpl.this.logger;
                    if (t.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.k.j();
                }
            }
            t tVar3 = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            bc.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(ceVar);
        }
    }

    private abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0032a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f666a;

        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.q0() || MaxAdViewImpl.this.x) && this.f666a) {
                    this.f666a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.q0() || MaxAdViewImpl.this.x) && !MaxAdViewImpl.this.k.g()) {
                    this.f666a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            bc.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            bc.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    private class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.t) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully pre-cached ad for refresh");
                }
                MaxAdViewImpl.this.a(maxAd);
                return;
            }
            t tVar2 = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.S().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, k kVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", kVar);
        this.c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.e = Long.MAX_VALUE;
        this.n = new Object();
        this.o = null;
        this.t = false;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f665a = context.getApplicationContext();
        this.b = maxAdView;
        this.d = view;
        this.i = new b();
        this.j = new d();
        this.k = new com.applovin.impl.sdk.d(kVar, this);
        this.l = new br(maxAdView, kVar);
        this.m = new cr(maxAdView, kVar, this);
        kVar.h().a(this);
        if (t.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        e();
        if (this.f != null) {
            this.sdk.S().destroyAd(this.f);
        }
        synchronized (this.n) {
            this.t = true;
        }
        this.k.a();
        this.sdk.h().b(this);
        this.sdk.M().c(this.adUnitId, this.c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.g;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdRefresh() {
        this.r = false;
        if (this.f != null) {
            f();
            return;
        }
        if (!b()) {
            if (t.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(d.b.REFRESH);
        } else if (this.p) {
            if (t.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(d.b.REFRESH);
        } else {
            if (t.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.r = true;
        }
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        ce ceVar = this.o;
        if (ceVar != null && ceVar.Q().equalsIgnoreCase(str)) {
            this.o.h(str2);
            bc.b(this.adReviewListener, str2, this.o);
            return;
        }
        ce ceVar2 = this.f;
        if (ceVar2 == null || !ceVar2.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
    }

    @Override // com.applovin.impl.cr.a
    public void onLogVisibilityImpression() {
        a(this.o, this.l.a(this.o));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.a(qe.Y6)).booleanValue() && this.k.h()) {
            if (ar.b(i)) {
                if (t.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.k.d();
            } else {
                if (t.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.k.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.o != null && t.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        zp.b(str, this.tag);
        this.h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) throws NumberFormatException {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.o != null && t.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.e = i;
    }

    public void startAutoRefresh() {
        this.q = false;
        if (!this.k.g()) {
            if (t.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.k.m();
        if (t.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.k.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.o == null) {
            if (this.u || ((Boolean) this.sdk.a(qe.a7)).booleanValue()) {
                this.q = true;
                return;
            } else {
                t.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (t.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.k.b() + "ms");
        }
        this.k.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        sb.append(a());
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    private void e() {
        ce ceVar;
        MaxAdView maxAdView;
        MaxAdView maxAdView2;
        Boolean bool = (Boolean) this.sdk.a(qe.P7);
        if (bool.booleanValue() && (maxAdView2 = this.b) != null) {
            e0.a(maxAdView2, this.d);
        }
        this.m.b();
        synchronized (this.n) {
            ceVar = this.o;
        }
        if (ceVar != null) {
            this.sdk.S().destroyAd(ceVar);
        }
        if (bool.booleanValue() || (maxAdView = this.b) == null) {
            return;
        }
        e0.a(maxAdView, this.d);
    }

    private void f() {
        if (t.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f + "...");
        }
        this.i.onAdLoaded(this.f);
        this.f = null;
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z = this.u || ((Boolean) this.sdk.a(qe.a7)).booleanValue();
        if (z && !this.k.g() && this.k.h()) {
            t.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.k.b()) + " seconds.");
            return;
        }
        if (!z) {
            if (t.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, this.i);
        } else if (this.f != null) {
            if (t.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            f();
        } else if (this.s) {
            if (t.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.r = true;
        } else {
            if (t.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final ce ceVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(ceVar);
            }
        });
    }

    private void d() {
        if (b()) {
            if (t.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.s = true;
            this.sdk.l0().a((xl) new kn(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            }), sm.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final ce ceVar) {
        View viewX = ceVar.x();
        String str = viewX == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (t.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (t.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + ceVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, (MaxAd) ceVar, (MaxError) maxErrorImpl, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, ceVar);
            return;
        }
        e();
        a((be) ceVar);
        if (ceVar.j0()) {
            this.m.a(ceVar);
        }
        maxAdView.setDescendantFocusability(Opcodes.ASM6);
        if (ceVar.l0() != Long.MAX_VALUE) {
            this.d.setBackgroundColor((int) ceVar.l0());
        } else {
            long j = this.e;
            if (j != Long.MAX_VALUE) {
                this.d.setBackgroundColor((int) j);
            } else {
                this.d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewX);
        a(viewX, ceVar);
        this.sdk.v().d(ceVar);
        c(ceVar);
        synchronized (this.n) {
            this.o = ceVar;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.S().processRawAdImpression(ceVar, this.i);
        if (StringUtils.isValidString(this.o.getAdReviewCreativeId())) {
            bc.a(this.adReviewListener, this.o.getAdReviewCreativeId(), (MaxAd) this.o, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(ceVar);
            }
        }, ceVar.n0());
    }

    private boolean b() {
        if (this.w) {
            return false;
        }
        return ((Boolean) this.sdk.a(qe.f7)).booleanValue();
    }

    private void c(ce ceVar) {
        int height = this.b.getHeight();
        int width = this.b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f665a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f665a, width);
            MaxAdFormat format = ceVar.getFormat();
            int height2 = (this.z ? format.getAdaptiveSize(iPxToDp2, this.b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), x3.b(this.f665a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(iPxToDp2);
                sb.append("x");
                sb.append(iPxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.z ? "adaptive " : "");
                sb.append("size: ");
                sb.append(iMin);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String string = sb.toString();
                if (t.a()) {
                    this.logger.b("AppLovinSdk", string);
                }
            }
        }
    }

    private void a(View view, ce ceVar) {
        int iO0 = ceVar.o0();
        int iM0 = ceVar.m0();
        int iDpToPx = iO0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iO0);
        int iDpToPx2 = iM0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iM0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (t.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : ar.a(this.b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad for pre-cache request...");
        }
        a(d.b.SEQUENTIAL_OR_PRECACHE, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ce ceVar) {
        long jA = this.l.a(ceVar);
        if (!ceVar.j0()) {
            a(ceVar, jA);
        }
        a(jA);
    }

    private void a(final d.b bVar, final a.InterfaceC0032a interfaceC0032a) {
        if (a()) {
            boolean zC = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAdView", (Map) CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                t.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(interfaceC0032a, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0032a interfaceC0032a, d.b bVar) {
        ce ceVar = this.o;
        if (ceVar != null) {
            long jA = this.l.a(ceVar);
            this.extraParameters.put("visible_ad_ad_unit_id", this.o.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.k.g() || this.q));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.v));
        if (t.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0032a + "...");
        }
        this.sdk.S().loadAd(this.adUnitId, this.c, this.adFormat, bVar, this.localExtraParameters, this.extraParameters, this.f665a, interfaceC0032a);
    }

    private void a(String str, String str2) throws NumberFormatException {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (t.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.u = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (t.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.v = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (t.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.w = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (t.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.x = Boolean.parseBoolean(str2);
            return;
        }
        if ("force_precache".equals(str)) {
            if (t.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.y = Boolean.parseBoolean(str2);
            return;
        }
        if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (t.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            this.z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (t.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(qe.U6).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.q && !this.k.g()) {
            this.p = true;
            this.s = false;
            long jLongValue = ((Long) this.sdk.a(qe.T6)).longValue();
            if (jLongValue >= 0) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().a(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.k.a(jLongValue);
                return;
            }
            return;
        }
        if (this.s) {
            if (t.a()) {
                this.logger.a(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
            }
            this.s = false;
        }
        if (this.r) {
            if (t.a()) {
                this.logger.a(this.tag, "Refresh pre-cache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(ce ceVar, long j) {
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.S().processViewabilityAdImpressionPostback(ceVar, j, this.i);
    }

    private void a(long j) {
        if (zp.a(j, ((Long) this.sdk.a(qe.e7)).longValue()) && !this.y) {
            if (t.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            }
            if (t.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.p = true;
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
        }
        this.p = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.s = false;
        if (this.r) {
            this.r = false;
            if (t.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.i.onAdLoaded(maxAd);
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Saving pre-cache ad...");
        }
        ce ceVar = (ce) maxAd;
        this.f = ceVar;
        ceVar.g(this.g);
        this.f.f(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z;
        synchronized (this.n) {
            z = this.t;
        }
        return z;
    }
}
