package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f1264a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f1264a.logApiCall("a()");
        this.f1264a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f1264a.logApiCall("b()");
        this.f1264a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f1264a.logApiCall("destroy()");
        this.f1264a.destroy();
    }

    public String getAdUnitId() {
        return this.f1264a.getAdUnitId();
    }

    public String getPlacement() {
        this.f1264a.logApiCall("getPlacement()");
        return this.f1264a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f1264a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f1264a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f1264a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1264a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f1264a.logApiCall("setCustomData(value=" + str + ")");
        this.f1264a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f1264a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1264a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f1264a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1264a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f1264a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f1264a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f1264a.logApiCall("setPlacement(placement=" + str + ")");
        this.f1264a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f1264a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1264a.setRevenueListener(maxAdRevenueListener);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f1264a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f1264a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f1264a.loadAd(maxNativeAdView);
    }

    public void destroy(MaxAd maxAd) {
        this.f1264a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f1264a.destroy(maxAd);
    }
}
