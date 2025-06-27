package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.br;
import com.applovin.impl.cr;
import com.applovin.impl.ee;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;

/* loaded from: classes.dex */
public class b implements cr.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f675a;
    private final ee b;
    private final cr c;
    private final br d;
    private final a.InterfaceC0032a e;

    public void a() {
        this.c.b();
    }

    public void c() {
        this.f675a.L();
        if (t.a()) {
            this.f675a.L().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.n0().compareAndSet(false, true)) {
            this.f675a.L();
            if (t.a()) {
                this.f675a.L().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                t.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f675a.f().a(this.b);
            }
            this.f675a.S().processRawAdImpression(this.b, this.e);
        }
    }

    @Override // com.applovin.impl.cr.a
    public void onLogVisibilityImpression() {
        a(this.d.a(this.b));
    }

    private void a(long j) {
        if (this.b.p0().compareAndSet(false, true)) {
            this.f675a.L();
            if (t.a()) {
                this.f675a.L().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f675a.S().processViewabilityAdImpressionPostback(this.b, j, this.e);
        }
    }

    public b(ee eeVar, ViewGroup viewGroup, a.InterfaceC0032a interfaceC0032a, k kVar) {
        this.f675a = kVar;
        this.b = eeVar;
        this.e = interfaceC0032a;
        this.d = new br(viewGroup, kVar);
        cr crVar = new cr(viewGroup, kVar, this);
        this.c = crVar;
        crVar.a(eeVar);
        kVar.L();
        if (t.a()) {
            kVar.L().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public ee b() {
        return this.b;
    }
}
