package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class zc extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f1236a;
    private final MaxNativeAdLoader b;
    private final Queue c = new LinkedList();
    private boolean d = false;
    private final Object f = new Object();
    private a g;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public zc(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f1236a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.g = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.b.NATIVE_AD_PLACER);
    }

    public void c() {
        this.g = null;
        a();
        this.b.destroy();
    }

    public boolean d() {
        boolean z;
        synchronized (this.f) {
            z = !this.c.isEmpty();
        }
        return z;
    }

    public void e() {
        synchronized (this.f) {
            if (!this.d && this.c.size() < this.f1236a) {
                this.d = true;
                this.b.loadAd();
            }
        }
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f) {
            maxAd = null;
            while (!this.c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.c.remove();
            }
            e();
        }
        return maxAd;
    }

    public void a() {
        synchronized (this.f) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a((MaxAd) it.next());
            }
            this.c.clear();
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f) {
            this.c.add(maxAd);
            this.d = false;
            e();
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void a(MaxAd maxAd) {
        this.b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.b.render(maxNativeAdView, maxAd);
    }
}
