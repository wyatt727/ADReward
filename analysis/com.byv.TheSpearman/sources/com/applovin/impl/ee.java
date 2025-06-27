package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ee extends ie implements h8 {
    private final AtomicBoolean v;
    private final AtomicBoolean w;

    public ee(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i, map, jSONObject, jSONObject2, null, kVar);
        this.v = new AtomicBoolean();
        this.w = new AtomicBoolean();
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.o.a(maxNativeAdView);
    }

    public MaxNativeAdView l0() {
        return this.o.f();
    }

    private ee(ee eeVar, com.applovin.impl.mediation.g gVar) {
        super(eeVar.I(), eeVar.i(), eeVar.a(), eeVar.g(), gVar, eeVar.f598a);
        this.v = new AtomicBoolean();
        this.w = new AtomicBoolean();
    }

    public ViewGroup m0() {
        return this.o.h();
    }

    public String o0() {
        return BundleUtils.getString("template", "", l());
    }

    public boolean q0() {
        return a("inacc", (Boolean) this.f598a.a(qe.D7)).booleanValue();
    }

    public boolean r0() {
        return this.o == null;
    }

    public AtomicBoolean n0() {
        return this.v;
    }

    public AtomicBoolean p0() {
        return this.w;
    }

    public void a(ViewGroup viewGroup) {
        this.o.a(viewGroup);
    }

    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new ee(this, gVar);
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - J());
    }

    private long k0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f598a.a(qe.l7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }
}
